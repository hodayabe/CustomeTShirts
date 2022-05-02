package customeTShirts;

public class Design {
	protected final double NIN_WIDTH=20;
	protected final double MAX_WIDTH=30;
	protected final double NIN_HEIGHT=10;
	protected final double MAX_HEIGHT=25;
	protected final double NIN_COMPLEXITY=1;
	protected final double MAX_COMPLEXITY=100;
	
	protected double width;
	protected double height;
	protected String slogan;
	protected Color color;
	protected double complexity;
	
	
	public Design(){
		this.width=NIN_WIDTH;
		this.height=NIN_HEIGHT;
		this.slogan=" ";
		this.color=new Color();
		this.complexity=NIN_COMPLEXITY;
	}
	
	
	public Design(double width, double height, String slogan, Color color, double complexity) {
		setWidth(width);
		setHeight(height);
		setSlogan(slogan);
		this.color = color;
		setComplexity(complexity);
	}

	
	
	public void setWidth(double width) {
		if(width >= NIN_WIDTH && width <= MAX_WIDTH)
			this.width = width;
		else
			this.width =NIN_WIDTH;
	}


	public void setHeight(double height) {
		if(height >= NIN_HEIGHT && height <= MAX_HEIGHT)
			this.height = height;
		else
			this.height =NIN_HEIGHT;
	}


	public void setSlogan(String slogan) {
		if(slogan==" ")
			return;
		for (int i = 0; i < slogan.length(); i++) {
			if(!Character.isDigit(slogan.charAt(i))&&!Character.isLetter(slogan.charAt(i))) {
				System.out.println("canot be slogen");
				this.slogan =" ";
				return;
			}
		}
		
			this.slogan = slogan;
	}


	public void setComplexity(double complexity) {
		if(complexity >= NIN_COMPLEXITY && complexity <= MAX_COMPLEXITY)
			this.complexity = complexity;
		else
			this.complexity =NIN_COMPLEXITY;
	}
	
	
	protected double calculateArea() {
		return width*height;
	}


	@Override
	public String toString() {
		return "width=" + width + ", height=" + height + ", slogan=" + slogan + ", color: " + color
				+ ", complexity=" + complexity;
	}
	
	
	
}

