@isTest
private class OASComDayCqReplicationImplTransportHTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties1 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties2 = comDayCqReplicationImplTransportHttpProperties1;
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties3 = new OASComDayCqReplicationImplTransportH();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties4 = comDayCqReplicationImplTransportHttpProperties3;

        System.assert(comDayCqReplicationImplTransportHttpProperties1.equals(comDayCqReplicationImplTransportHttpProperties2));
        System.assert(comDayCqReplicationImplTransportHttpProperties2.equals(comDayCqReplicationImplTransportHttpProperties1));
        System.assert(comDayCqReplicationImplTransportHttpProperties1.equals(comDayCqReplicationImplTransportHttpProperties1));
        System.assert(comDayCqReplicationImplTransportHttpProperties3.equals(comDayCqReplicationImplTransportHttpProperties4));
        System.assert(comDayCqReplicationImplTransportHttpProperties4.equals(comDayCqReplicationImplTransportHttpProperties3));
        System.assert(comDayCqReplicationImplTransportHttpProperties3.equals(comDayCqReplicationImplTransportHttpProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties1 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties2 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties3 = new OASComDayCqReplicationImplTransportH();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties4 = new OASComDayCqReplicationImplTransportH();

        System.assert(comDayCqReplicationImplTransportHttpProperties1.equals(comDayCqReplicationImplTransportHttpProperties2));
        System.assert(comDayCqReplicationImplTransportHttpProperties2.equals(comDayCqReplicationImplTransportHttpProperties1));
        System.assert(comDayCqReplicationImplTransportHttpProperties3.equals(comDayCqReplicationImplTransportHttpProperties4));
        System.assert(comDayCqReplicationImplTransportHttpProperties4.equals(comDayCqReplicationImplTransportHttpProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties1 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties2 = new OASComDayCqReplicationImplTransportH();

        System.assertEquals(false, comDayCqReplicationImplTransportHttpProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplTransportHttpProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties1 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties2 = new OASComDayCqReplicationImplTransportH();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties3;

        System.assertEquals(false, comDayCqReplicationImplTransportHttpProperties1.equals(comDayCqReplicationImplTransportHttpProperties3));
        System.assertEquals(false, comDayCqReplicationImplTransportHttpProperties2.equals(comDayCqReplicationImplTransportHttpProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties1 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties2 = new OASComDayCqReplicationImplTransportH();

        System.assertEquals(comDayCqReplicationImplTransportHttpProperties1.hashCode(), comDayCqReplicationImplTransportHttpProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplTransportHttpProperties2.hashCode(), comDayCqReplicationImplTransportHttpProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties1 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties2 = OASComDayCqReplicationImplTransportH.getExample();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties3 = new OASComDayCqReplicationImplTransportH();
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties4 = new OASComDayCqReplicationImplTransportH();

        System.assert(comDayCqReplicationImplTransportHttpProperties1.equals(comDayCqReplicationImplTransportHttpProperties2));
        System.assert(comDayCqReplicationImplTransportHttpProperties3.equals(comDayCqReplicationImplTransportHttpProperties4));
        System.assertEquals(comDayCqReplicationImplTransportHttpProperties1.hashCode(), comDayCqReplicationImplTransportHttpProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplTransportHttpProperties3.hashCode(), comDayCqReplicationImplTransportHttpProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplTransportH comDayCqReplicationImplTransportHttpProperties = new OASComDayCqReplicationImplTransportH();
        Map<String, String> propertyMappings = comDayCqReplicationImplTransportHttpProperties.getPropertyMappings();
        System.assertEquals('disabledCipherSuites', propertyMappings.get('disabled.cipher.suites'));
        System.assertEquals('enabledCipherSuites', propertyMappings.get('enabled.cipher.suites'));
    }
}
