package com.spt.development.cid;

/**
 * Simple utility class for using {@link ThreadLocal} for storing the current correlation ID.
 */
public final class CorrelationId {
    static final String DEFAULT = "no-cid";

    private static final ThreadLocal<String> value = ThreadLocal.withInitial(() -> DEFAULT);

    private CorrelationId() {}

    /**
     * Gets the correlation ID associated with the current thread.
     *
     * @return the correlation ID.
     */
    public static String get() {
        return value.get();
    }

    /**
     * Sets the current correlation ID associated with the current thread.
     *
     * @param correlationId the correlation ID associated with the current thread.
     */
    public static void set(String correlationId) {
        value.set(correlationId);
    }
}
