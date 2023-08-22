package org.chainofresponsiblity.example.one;

public abstract class ProcessingObject <T>{
    protected ProcessingObject<T> processingObject;

    public void setProcessingObject(ProcessingObject<T> processingObject) {
        this.processingObject = processingObject;
    }

    public T handle(T input){
        T r=handleWork(input);
        if(processingObject!=null)
            return processingObject.handle(r);
        return r;
    }

    protected abstract T handleWork(T input);

}
