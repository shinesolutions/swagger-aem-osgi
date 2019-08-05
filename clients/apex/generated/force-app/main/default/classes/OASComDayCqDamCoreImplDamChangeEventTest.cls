@isTest
private class OASComDayCqDamCoreImplDamChangeEventTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties1 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties2 = comDayCqDamCoreImplDamChangeEventListenerProperties1;
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties3 = new OASComDayCqDamCoreImplDamChangeEvent();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties4 = comDayCqDamCoreImplDamChangeEventListenerProperties3;

        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties1.equals(comDayCqDamCoreImplDamChangeEventListenerProperties2));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties2.equals(comDayCqDamCoreImplDamChangeEventListenerProperties1));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties1.equals(comDayCqDamCoreImplDamChangeEventListenerProperties1));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties3.equals(comDayCqDamCoreImplDamChangeEventListenerProperties4));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties4.equals(comDayCqDamCoreImplDamChangeEventListenerProperties3));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties3.equals(comDayCqDamCoreImplDamChangeEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties1 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties2 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties3 = new OASComDayCqDamCoreImplDamChangeEvent();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties4 = new OASComDayCqDamCoreImplDamChangeEvent();

        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties1.equals(comDayCqDamCoreImplDamChangeEventListenerProperties2));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties2.equals(comDayCqDamCoreImplDamChangeEventListenerProperties1));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties3.equals(comDayCqDamCoreImplDamChangeEventListenerProperties4));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties4.equals(comDayCqDamCoreImplDamChangeEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties1 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties2 = new OASComDayCqDamCoreImplDamChangeEvent();

        System.assertEquals(false, comDayCqDamCoreImplDamChangeEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplDamChangeEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties1 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties2 = new OASComDayCqDamCoreImplDamChangeEvent();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplDamChangeEventListenerProperties1.equals(comDayCqDamCoreImplDamChangeEventListenerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplDamChangeEventListenerProperties2.equals(comDayCqDamCoreImplDamChangeEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties1 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties2 = new OASComDayCqDamCoreImplDamChangeEvent();

        System.assertEquals(comDayCqDamCoreImplDamChangeEventListenerProperties1.hashCode(), comDayCqDamCoreImplDamChangeEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplDamChangeEventListenerProperties2.hashCode(), comDayCqDamCoreImplDamChangeEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties1 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties2 = OASComDayCqDamCoreImplDamChangeEvent.getExample();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties3 = new OASComDayCqDamCoreImplDamChangeEvent();
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties4 = new OASComDayCqDamCoreImplDamChangeEvent();

        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties1.equals(comDayCqDamCoreImplDamChangeEventListenerProperties2));
        System.assert(comDayCqDamCoreImplDamChangeEventListenerProperties3.equals(comDayCqDamCoreImplDamChangeEventListenerProperties4));
        System.assertEquals(comDayCqDamCoreImplDamChangeEventListenerProperties1.hashCode(), comDayCqDamCoreImplDamChangeEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplDamChangeEventListenerProperties3.hashCode(), comDayCqDamCoreImplDamChangeEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplDamChangeEvent comDayCqDamCoreImplDamChangeEventListenerProperties = new OASComDayCqDamCoreImplDamChangeEvent();
        Map<String, String> propertyMappings = comDayCqDamCoreImplDamChangeEventListenerProperties.getPropertyMappings();
        System.assertEquals('changeeventlistenerObservedPaths', propertyMappings.get('changeeventlistener.observed.paths'));
    }
}
