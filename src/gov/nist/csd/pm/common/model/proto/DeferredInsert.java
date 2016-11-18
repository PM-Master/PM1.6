package gov.nist.csd.pm.common.model.proto;

/**
* Created by IntelliJ IDEA.
* User: Administrator
* Date: 9/10/11
* Time: 1:22 PM
* To change this template use File | Settings | File Templates.
*/
public class DeferredInsert<K,V> extends DeferredOperation<K,V> {

    public DeferredInsert(K key, V value) {
        super(key, value);
    }

    @Override
    public String description() {
        return "Insert Operation";
    }

    @Override
    public OperationResult perform(OperationContext opCtx) {
        return opCtx.addTo(key(), get());
    }
}
