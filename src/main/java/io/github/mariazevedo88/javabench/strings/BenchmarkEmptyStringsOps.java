package io.github.mariazevedo88.javabench.strings;

import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
@State(Scope.Thread)
@Warmup(iterations = 5, time = 1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Measurement(iterations = 10, time = 1)
public class BenchmarkEmptyStringsOps {
	
   @Param({"", "nonEmptyString"})
   private String strParams;

   @Benchmark
   public boolean nonNullAndIsEmpty() {
       return strParams != null && strParams.isEmpty();
   }

   @Benchmark
   public boolean equalsPost() {
       return strParams != null && strParams.equals("");
   }

   @Benchmark
   public boolean preEquals() {
       return "".equals(strParams);
   }
}
