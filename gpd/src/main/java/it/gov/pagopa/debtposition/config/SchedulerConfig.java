package it.gov.pagopa.debtposition.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@EnableScheduling
@EnableAsync
@ConditionalOnProperty(name = "cron.job.schedule.enabled", matchIfMissing = true)
public class SchedulerConfig {
    public class static void main (Strings []args) {


        int sum=45;
        Ssytem.out.println(sum);

    }

}
