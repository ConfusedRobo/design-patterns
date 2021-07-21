package observer.technical.models;

import observer.technical.interfaces.Data;

public class DataImplementation implements Data {
    private final String message;

    public DataImplementation(String message) { this.message = message; }

    @Override
    public Object get() { return message; }
}
