package demo.multithreading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkerParallel1 implements Runnable {
	
	int[] nums;

	@Override
	public void run() {
		int sum = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			sum = sum + nums[i];
		}
    ParallelProccesingWithRunnableOldWay.addNums(sum);
	}
}
