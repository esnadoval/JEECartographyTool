package jeecartographytool.utils.mtcflow.standalone;

import java.util.concurrent.Executors;

import com.mtcflow.engine.ITransformationScheduler;
import com.mtcflow.engine.transformation.ITransformationExecutor;

public class SingleThreadExecutorService implements ITransformationScheduler {
	
	private final static java.util.concurrent.ExecutorService EXECUTOR = Executors.newSingleThreadExecutor();

	@Override
	public void execute(String name, ITransformationExecutor executor, Runnable task) {
		EXECUTOR.submit(task);
	}
	
}
