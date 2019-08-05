@isTest
private class OASComDayCqDamCoreImplEventDamEventATest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties1 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties2 = comDayCqDamCoreImplEventDamEventAuditListenerProperties1;
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties3 = new OASComDayCqDamCoreImplEventDamEventA();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties4 = comDayCqDamCoreImplEventDamEventAuditListenerProperties3;

        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties1.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties2));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties2.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties1));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties1.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties1));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties3.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties4));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties4.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties3));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties3.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties1 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties2 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties3 = new OASComDayCqDamCoreImplEventDamEventA();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties4 = new OASComDayCqDamCoreImplEventDamEventA();

        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties1.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties2));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties2.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties1));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties3.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties4));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties4.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties1 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties2 = new OASComDayCqDamCoreImplEventDamEventA();

        System.assertEquals(false, comDayCqDamCoreImplEventDamEventAuditListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplEventDamEventAuditListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties1 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties2 = new OASComDayCqDamCoreImplEventDamEventA();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplEventDamEventAuditListenerProperties1.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplEventDamEventAuditListenerProperties2.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties1 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties2 = new OASComDayCqDamCoreImplEventDamEventA();

        System.assertEquals(comDayCqDamCoreImplEventDamEventAuditListenerProperties1.hashCode(), comDayCqDamCoreImplEventDamEventAuditListenerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplEventDamEventAuditListenerProperties2.hashCode(), comDayCqDamCoreImplEventDamEventAuditListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties1 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties2 = OASComDayCqDamCoreImplEventDamEventA.getExample();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties3 = new OASComDayCqDamCoreImplEventDamEventA();
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties4 = new OASComDayCqDamCoreImplEventDamEventA();

        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties1.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties2));
        System.assert(comDayCqDamCoreImplEventDamEventAuditListenerProperties3.equals(comDayCqDamCoreImplEventDamEventAuditListenerProperties4));
        System.assertEquals(comDayCqDamCoreImplEventDamEventAuditListenerProperties1.hashCode(), comDayCqDamCoreImplEventDamEventAuditListenerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplEventDamEventAuditListenerProperties3.hashCode(), comDayCqDamCoreImplEventDamEventAuditListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplEventDamEventA comDayCqDamCoreImplEventDamEventAuditListenerProperties = new OASComDayCqDamCoreImplEventDamEventA();
        Map<String, String> propertyMappings = comDayCqDamCoreImplEventDamEventAuditListenerProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
    }
}
