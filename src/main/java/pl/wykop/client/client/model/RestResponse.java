package pl.wykop.client.client.model;

public final class RestResponse<T> {
    private final T value;
    private final String errorMessage;

    public RestResponse(T value, String errorMessage) {
        this.value = value;
        this.errorMessage = errorMessage;
    }

    public T getValue() {
        return value;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public boolean isErrorPresent() {
        return errorMessage != null;
    }
}
