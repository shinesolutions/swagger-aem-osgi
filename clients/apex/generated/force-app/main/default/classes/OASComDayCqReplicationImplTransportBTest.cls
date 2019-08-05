@isTest
private class OASComDayCqReplicationImplTransportBTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2 = comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1;
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3 = new OASComDayCqReplicationImplTransportB();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4 = comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3;

        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3 = new OASComDayCqReplicationImplTransportB();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4 = new OASComDayCqReplicationImplTransportB();

        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2 = new OASComDayCqReplicationImplTransportB();

        System.assertEquals(false, comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2 = new OASComDayCqReplicationImplTransportB();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3;

        System.assertEquals(false, comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3));
        System.assertEquals(false, comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2 = new OASComDayCqReplicationImplTransportB();

        System.assertEquals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.hashCode(), comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.hashCode(), comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2 = OASComDayCqReplicationImplTransportB.getExample();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3 = new OASComDayCqReplicationImplTransportB();
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4 = new OASComDayCqReplicationImplTransportB();

        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2));
        System.assert(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3.equals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4));
        System.assertEquals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties1.hashCode(), comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties3.hashCode(), comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplTransportB comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties = new OASComDayCqReplicationImplTransportB();
        Map<String, String> propertyMappings = comDayCqReplicationImplTransportBinaryLessTransportHandlerProperties.getPropertyMappings();
        System.assertEquals('disabledCipherSuites', propertyMappings.get('disabled.cipher.suites'));
        System.assertEquals('enabledCipherSuites', propertyMappings.get('enabled.cipher.suites'));
    }
}
