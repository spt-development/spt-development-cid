package com.spt.development.cid;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class CorrelationIdTest {
    private interface TestData {
        String CORRELATION_ID = "9cd5cb0c-c281-44e9-be36-4dded3da8d97";
    }

    @Test
    void get_withoutSetting_shouldReturnDefault() throws Exception {
        final Future<String> result = Executors.newSingleThreadExecutor().submit(() -> CorrelationId.get());

        assertThat(result.get(), is(CorrelationId.DEFAULT));
    }

    @Test
    void get_setCorrelationId_shouldReturnCorrelationId() {
        CorrelationId.set(TestData.CORRELATION_ID);

        final String result = CorrelationId.get();

        assertThat(result, is(TestData.CORRELATION_ID));
    }

    @Test
    void get_resetCorrelationId_shouldReturnDefault() {
        CorrelationId.set(TestData.CORRELATION_ID);
        CorrelationId.reset();

        final String result = CorrelationId.get();

        assertThat(result, is(CorrelationId.DEFAULT));
    }
}