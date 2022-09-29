class Person {
    protected String name;
    protected String surName;

    public String getName() {
        return name;
    }
    public String getSurName() {
        return surName;
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    @Override
    public String toString() {

        return String.format("(%s %s)", this.name, this.surName);
    }
}