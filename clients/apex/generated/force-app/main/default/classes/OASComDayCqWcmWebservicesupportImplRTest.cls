@isTest
private class OASComDayCqWcmWebservicesupportImplRTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2 = comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1;
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3 = new OASComDayCqWcmWebservicesupportImplR();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4 = comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3;

        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3 = new OASComDayCqWcmWebservicesupportImplR();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4 = new OASComDayCqWcmWebservicesupportImplR();

        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2 = new OASComDayCqWcmWebservicesupportImplR();

        System.assertEquals(false, comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2 = new OASComDayCqWcmWebservicesupportImplR();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3;

        System.assertEquals(false, comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3));
        System.assertEquals(false, comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2 = new OASComDayCqWcmWebservicesupportImplR();

        System.assertEquals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.hashCode(), comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.hashCode(), comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2 = OASComDayCqWcmWebservicesupportImplR.getExample();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3 = new OASComDayCqWcmWebservicesupportImplR();
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4 = new OASComDayCqWcmWebservicesupportImplR();

        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2));
        System.assert(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3.equals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4));
        System.assertEquals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties1.hashCode(), comDayCqWcmWebservicesupportImplReplicationEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqWcmWebservicesupportImplReplicationEventListenerProperties3.hashCode(), comDayCqWcmWebservicesupportImplReplicationEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmWebservicesupportImplR comDayCqWcmWebservicesupportImplReplicationEventListenerProperties = new OASComDayCqWcmWebservicesupportImplR();
        Map<String, String> propertyMappings = comDayCqWcmWebservicesupportImplReplicationEventListenerProperties.getPropertyMappings();
        System.assertEquals('flushAgents', propertyMappings.get('Flush agents'));
    }
}
