package customeTShirts;

public class Color {
	protected final short NUM_OF_RGB=3;
	protected final short MIN_RANGE=0;
	protected final short MAX_RANGE=255;
	protected short red;
	protected short green;
	protected short blue;


	public Color() {
		this.red=MIN_RANGE;
		this.green=MIN_RANGE;
		this.blue=MIN_RANGE;
	}

	
	public Color(short red, short green, short blue) {
		setRed(red);
		setGreen(green);
		setBlue(blue);
	}


	public void setRed(short red) {
		if(red >= MIN_RANGE && red <=MAX_RANGE )
			this.red = red;
		else
			this.red = MAX_RANGE;
	}

	public void setGreen(short green) {
		if(green >= MIN_RANGE && green <=MAX_RANGE )
			this.green = green;
		else
			this.green = MAX_RANGE;
	}

	public void setBlue(short blue) {
		if(blue >= MIN_RANGE && blue <=MAX_RANGE )
			this.blue = blue;
		else
			this.blue = MAX_RANGE;
	}

	
	
	
	protected String  getDominant(){
		int max=red;
		String highest="red";
		if(blue > max) {
			max=blue;
			highest="blue";
		}

		if(blue > max) {
			highest="blue";
		}
		return highest;
	}


	protected float[] normalized() {
		float[] rgb=new float[NUM_OF_RGB];
		rgb[0]=red/MAX_RANGE;
		rgb[1]=green/MAX_RANGE;
		rgb[2]=blue/MAX_RANGE;
		return rgb;
		
	}


	@Override
	public String toString() {
		return "red=" + red + ", green=" + green + ", blue=" + blue;
	}
	
	
	

}
