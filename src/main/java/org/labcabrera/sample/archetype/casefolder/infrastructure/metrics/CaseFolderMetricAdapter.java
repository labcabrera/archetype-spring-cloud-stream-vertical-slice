package org.labcabrera.sample.archetype.casefolder.infrastructure.metrics;

import org.labcabrera.sample.archetype.casefolder.application.ports.CaseFolderMetricPort;
import org.springframework.stereotype.Component;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;

@Component
public class CaseFolderMetricAdapter implements CaseFolderMetricPort {

    private final Counter caseFolderCreatedCounter;

    public CaseFolderMetricAdapter(MeterRegistry meterRegistry) {
        caseFolderCreatedCounter = Counter.builder("casefoldercreated")
            .description("Number of case folders created")
            .register(meterRegistry);
    }

    @Override
    public void incrementCaseFolderCreatedCounter() {
        caseFolderCreatedCounter.increment();
    }
}
