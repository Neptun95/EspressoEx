package com.example.myapplication;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class RepeatRule implements TestRule {

    private static class RepeatStatement extends Statement{
        private final Statement statement;
        private final int r;

        public RepeatStatement(Statement statement, int r) {
            this.statement = statement;
            this.r = r;
        }


        @Override
        public void evaluate() throws Throwable{
            for(int i=0; i<r;i++){
                statement.evaluate();
            }
        }
    }



    @Override
    public Statement apply(Statement base, Description description) {
       Statement result = base;
       Repeat repeat = description.getAnnotation(Repeat.class);
       if(repeat!=null){
           int times = repeat.value();
           result = new RepeatStatement(base,times);
       }


        return result;
    }
}
