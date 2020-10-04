package demo.multithreading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerParallel2 implements Runnable {
	
	int[] nums;

	@Override
	public void run() {
		int sum = 0;
		for (int i = nums.length / 2; i < nums.length; i++) {
			sum = sum + nums[i];
		}
    ParallelProccesingWithRunnableOldWay.addNums(sum);
	}
}
