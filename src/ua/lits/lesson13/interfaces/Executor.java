package ua.lits.lesson13.interfaces;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public interface Executor {
    String execute(Callable<String> c);
    String execute(Supplier<String> s);
}
