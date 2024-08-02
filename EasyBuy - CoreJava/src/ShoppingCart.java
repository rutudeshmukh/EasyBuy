import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart implements Cart {
    private List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    @Override
    public void addItem(Item item, int quantity){
    	boolean found= false;
    	for(Item i :items) {
    		if(i.getId()==(item.getId())) {
    			i.setQuantity(i.getQuantity()+quantity);
    			updateProductInDB(i);
    			found = true;
    			break;
    		}
    	}
    	if(!found) {
    		item.setQuantity(quantity);
    		items.add(item);
    		addProductToDB(item);
    	}
    }

    private void addProductToDB(Item item) {
		String query = "INSERT INTO Products(id,name,price,quantity) VALUES(?,?,?,?)";
		try(Connection connection = ProductDBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)){
					statement.setInt(1, item.getId());
					statement.setString(2, item.getName());
					statement.setDouble(3, item.getPrice());
					statement.setInt(4, item.getQuantity());
					statement.executeUpdate();
				}catch(SQLException e) {
					e.printStackTrace();
				}
	}

	private void updateProductInDB(Item item) {
		String query = "UPDATE Products SET name = ? ,price = ?,quantity = ? WHERE id = ?";
		try(Connection connection = ProductDBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)){
					statement.setString(1, item.getName());
					statement.setDouble(2, item.getPrice());
					statement.setInt(3, item.getQuantity());
					statement.setInt(4, item.getId());
					statement.executeUpdate();
				}catch(SQLException e) {
					e.printStackTrace();
				}
		
	}

	@Override
    public void removeItem(int itemId){
		items.removeIf(item->item.getId()==itemId);
        removeProductFromDb(itemId);
    }

    private void removeProductFromDb(int itemId) {
		String query = "DELETE FROM Products WHERE id = ?";
		try(Connection connection = ProductDBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)){
			statement.setInt(1, itemId);
			statement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
    public void updateItemQuantity(int itemId, int quantity) {
        for(Item item : items) {
        	if(item.getId()==itemId) {
        		item.setQuantity(quantity);
        		updateProductInDB(item);
        		break;
        	}
        }
    }

    @Override
    public double getTotal() {
        double total = 0;
        for(Item item: items){
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    @Override
    public void clearCart() {
        items.clear();
        clearCartInDB();
    }

    private void clearCartInDB() {
		String query = "DELETE FROM Products";
		try(Connection connection = ProductDBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)){
			statement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
    public void displayTotalPrice() {
        System.out.println("Total: " + getTotal());
    }

    @Override
    public void displayCart() {
        for (Item item : items) {
            System.out.println("Product ID: " + item.getId() + ", Name: " + item.getName() +
                    ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        }

    }
}
