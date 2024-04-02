package concerttours.jobs;

import de.hybris.platform.cronjob.enums.CronJobResult;
import de.hybris.platform.cronjob.enums.CronJobStatus;
import de.hybris.platform.cronjob.model.CronJobModel;
import de.hybris.platform.servicelayer.cronjob.AbstractJobPerformable;
import de.hybris.platform.servicelayer.cronjob.PerformResult;

public class HelloWorldJob extends AbstractJobPerformable {
    @Override
    public PerformResult perform(CronJobModel cronJobModel) {
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        System.out.println("Hello World!!!");
        return new PerformResult(CronJobResult.SUCCESS, CronJobStatus.FINISHED);
    }
}
