package model;

public class TodoItem {
    private String category;
    private boolean complete;
    private String id;
    private String name;
    
    public TodoItem() { }
    
	public TodoItem(String category, boolean complete, String id, String name) {
		super();
		this.category = category;
		this.complete = complete;
		this.id = id;
		this.name = name;
	}

	public TodoItem(String category, boolean complete, String name) {
		super();
		this.category = category;
		this.complete = complete;
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TodoItem [category=" + category + ", complete=" + complete + ", id=" + id + ", name=" + name + "]";
	}
	
	
    
    
}
