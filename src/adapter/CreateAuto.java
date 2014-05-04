package adapter;

import exception.FixProblems;

public interface CreateAuto {
	public void buildAuto(String fileName) throws FixProblems;
	public void printAuto(String modelName) throws FixProblems;

}
