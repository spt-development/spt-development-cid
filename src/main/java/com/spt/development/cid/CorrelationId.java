package com.spt.development.cid;

/**
 * Simple utility class for using {@link ThreadLocal} for storing the current correlation ID.
 */
public final class CorrelationId {
    static final String DEFAULT = "no-cid";

    private static final ThreadLocal<String> VALUE = ThreadLocal.withInitial(() -> DEFAULT);

    private CorrelationId() {}

    /**
     * Gets the correlation ID associated with the current thread.
     *
     * @return the correlation ID.
     */
    public static String get() {
        return VALUE.get();
    }

    /**
     * Resets the current correlation ID associated with the current thread to the default (unset) value.
     */
    public static void reset() {
        set(DEFAULT);
    }

    /**
     * Sets the current correlation ID associated with the current thread.
     *
     * @param correlationId the correlation ID associated with the current thread.
     */
    public static void set(String correlationId) {
        VALUE.set(correlationId);
    }
}
