package adapter;

import exception.FixProblems;

public interface UpdateAuto  {
	public void updateOptionSetName(String modelName,String optionSetName,String newName) throws FixProblems;
	public void updateOptionPrice(String modelName,String optionName,String newOptionName,int newPrice);

}
