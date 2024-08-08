package pattern.Exams.e201608;

abstract class Command<T> { // base class for commands on a Receiver
    protected Receiver receiver;

    // the object whose method gets called
    public Command(final Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract T execute(); // to invoke a method of receiver
}
