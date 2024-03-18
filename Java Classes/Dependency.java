public class Dependency {
    public String xmi.idref;
    public Dependency.client Dependency.client;
    public Dependency.supplier Dependency.supplier;
    public String xmi.id;
    public boolean isSpecification;
}

public class Dependency.client {
    public Class Class;
}

public class Dependency.supplier {
    public Class Class;
    public Interface Interface;
}