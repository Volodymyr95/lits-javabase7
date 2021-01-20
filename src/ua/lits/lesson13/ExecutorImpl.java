package ua.lits.lesson13;

import ua.lits.lesson13.interfaces.Executor;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class ExecutorImpl implements Executor {
    @Override
    public String execute(Callable<String> c) {
        return null;
    }

    @Override
    public String execute(Supplier<String> s) {
        return null;
    }
}
