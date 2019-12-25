package fr.zaroumia.helloworldv3;

import org.springframework.batch.core.StepContribution;
import org.springframework.batch.core.scope.context.ChunkContext;
import org.springframework.batch.core.step.tasklet.Tasklet;
import org.springframework.batch.repeat.RepeatStatus;

public class HelloWorldTasklet implements Tasklet {

	private final String name;

	public HelloWorldTasklet(final String name) {
		super();
		this.name = name;
	}

	@Override
	public RepeatStatus execute(final StepContribution stepContribution, final ChunkContext chunkContext)
			throws Exception {
		System.out.println("hello " + name);
		return RepeatStatus.FINISHED;
	}

}
