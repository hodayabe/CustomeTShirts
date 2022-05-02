package customeTShirts;

public class Tshirt {
	protected final double MIN_DEMAND_FACTOR=0.1;
	protected final double MAX_DEMAND_FACTOR=1;
	protected final double BASE_PRICE=3;
	protected final double EXPENSIV_PRICE=1000;
	
	protected Size size;
	protected Design design;
	protected double demandFactor;
	protected double finalPrice;
	
	
	public Tshirt(){
		this.size=this.size.XS;
		this.design=new Design();
		this.demandFactor=MIN_DEMAND_FACTOR;
		this.finalPrice=BASE_PRICE;
	}
	
	public Tshirt(Size size,Design design, double demandFactor) {
		this.size = size;
		this.design = design;
		setDemandFactor(demandFactor);
		calculateFinalPrice();
	}


	public void setDemandFactor(double demandFactor) {
		if(demandFactor >= MIN_DEMAND_FACTOR && demandFactor <= MAX_DEMAND_FACTOR)
			this.demandFactor = demandFactor;
		else
			this.demandFactor = MIN_DEMAND_FACTOR;
	}


	protected void calculateFinalPrice() {
		this.finalPrice = BASE_PRICE + design.complexity * design.calculateArea()/demandFactor;
	}
	
	
	protected boolean isExpensive() {
		if(this.finalPrice >= EXPENSIV_PRICE)
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "size=" + size + ", design: " + design + ", demandFactor=" + demandFactor + ", finalPrice="
				+ finalPrice ;
	}
	
	
	
}
