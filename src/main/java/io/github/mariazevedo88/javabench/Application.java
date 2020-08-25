package io.github.mariazevedo88.javabench;

import io.github.mariazevedo88.javabench.strings.BenchmarkEmptyStringsOps;

public class Application {
	
	public static void main(String[] args) {
		BenchmarkEmptyStringsOps emptyStr = new BenchmarkEmptyStringsOps();
		emptyStr.preEquals();
		emptyStr.equalsPost();
		emptyStr.nonNullAndIsEmpty();
	}

}
