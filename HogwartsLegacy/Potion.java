package hogwartslegacy;

/**
 *  A potion has a specific magic effect on its consumer
 */
public abstract class Potion extends MagicItem {
	/**
	 * @param name name
	 * @param usages number of usages still left
	 * @param price price
	 * @param weight weight
	 */
	public Potion(String name, int usages, int price, int weight) {
		super(name, usages, price, weight);
	}
	
	/**
	 * Delegates to method call useOn(drinker)
	 * @param drinker the consumer of the potion
	 */
	public void drink(Wizard drinker) {
		this.useOn(drinker);
	}
	  
	/**
	 * returns "gulp" if usages is equal to 1, "gulps" otherwise
	 * @return "gulp" or "gulps" depending on number of usages left
	 */
	@Override
	public String usageString() {
		if (getUsages() == 1) {
			return "gulp";
		}
		return "gulps";
	}
	
	public boolean checkName(int maxCount) {
		String name = getName();
		
		for (int i = 0; i< name.length(); i++) {
			int count = 0;
			
			for (int j =0; j<name.length(); j++) {
				if (name.charAt(j) == name.charAt(i)) {
					count++;
				}
			}
			
			if (count > maxCount) {
				return false;
			}
		}
		return true;
			
	}
}
