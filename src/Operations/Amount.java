package Operations;

public class Amount {
	private float amount = 500.0f;
    private String lastTransition = null;
    
	public String getLastTransition() {
		return lastTransition;
	}

	public void setLastTransition(String lastTransition) {
		this.lastTransition = lastTransition;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}
}
