@isTest
private class OASComDayCqReplicationImplReplicatorTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties1 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties2 = comDayCqReplicationImplReplicatorImplProperties1;
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties3 = new OASComDayCqReplicationImplReplicator();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties4 = comDayCqReplicationImplReplicatorImplProperties3;

        System.assert(comDayCqReplicationImplReplicatorImplProperties1.equals(comDayCqReplicationImplReplicatorImplProperties2));
        System.assert(comDayCqReplicationImplReplicatorImplProperties2.equals(comDayCqReplicationImplReplicatorImplProperties1));
        System.assert(comDayCqReplicationImplReplicatorImplProperties1.equals(comDayCqReplicationImplReplicatorImplProperties1));
        System.assert(comDayCqReplicationImplReplicatorImplProperties3.equals(comDayCqReplicationImplReplicatorImplProperties4));
        System.assert(comDayCqReplicationImplReplicatorImplProperties4.equals(comDayCqReplicationImplReplicatorImplProperties3));
        System.assert(comDayCqReplicationImplReplicatorImplProperties3.equals(comDayCqReplicationImplReplicatorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties1 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties2 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties3 = new OASComDayCqReplicationImplReplicator();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties4 = new OASComDayCqReplicationImplReplicator();

        System.assert(comDayCqReplicationImplReplicatorImplProperties1.equals(comDayCqReplicationImplReplicatorImplProperties2));
        System.assert(comDayCqReplicationImplReplicatorImplProperties2.equals(comDayCqReplicationImplReplicatorImplProperties1));
        System.assert(comDayCqReplicationImplReplicatorImplProperties3.equals(comDayCqReplicationImplReplicatorImplProperties4));
        System.assert(comDayCqReplicationImplReplicatorImplProperties4.equals(comDayCqReplicationImplReplicatorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties1 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties2 = new OASComDayCqReplicationImplReplicator();

        System.assertEquals(false, comDayCqReplicationImplReplicatorImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplReplicatorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties1 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties2 = new OASComDayCqReplicationImplReplicator();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties3;

        System.assertEquals(false, comDayCqReplicationImplReplicatorImplProperties1.equals(comDayCqReplicationImplReplicatorImplProperties3));
        System.assertEquals(false, comDayCqReplicationImplReplicatorImplProperties2.equals(comDayCqReplicationImplReplicatorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties1 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties2 = new OASComDayCqReplicationImplReplicator();

        System.assertEquals(comDayCqReplicationImplReplicatorImplProperties1.hashCode(), comDayCqReplicationImplReplicatorImplProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplReplicatorImplProperties2.hashCode(), comDayCqReplicationImplReplicatorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties1 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties2 = OASComDayCqReplicationImplReplicator.getExample();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties3 = new OASComDayCqReplicationImplReplicator();
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties4 = new OASComDayCqReplicationImplReplicator();

        System.assert(comDayCqReplicationImplReplicatorImplProperties1.equals(comDayCqReplicationImplReplicatorImplProperties2));
        System.assert(comDayCqReplicationImplReplicatorImplProperties3.equals(comDayCqReplicationImplReplicatorImplProperties4));
        System.assertEquals(comDayCqReplicationImplReplicatorImplProperties1.hashCode(), comDayCqReplicationImplReplicatorImplProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplReplicatorImplProperties3.hashCode(), comDayCqReplicationImplReplicatorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplReplicator comDayCqReplicationImplReplicatorImplProperties = new OASComDayCqReplicationImplReplicator();
        Map<String, String> propertyMappings = comDayCqReplicationImplReplicatorImplProperties.getPropertyMappings();
        System.assertEquals('distributeEvents', propertyMappings.get('distribute_events'));
    }
}
