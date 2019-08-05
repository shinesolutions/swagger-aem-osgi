@isTest
private class OASComDayCqReplicationAuditReplicatiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties1 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties2 = comDayCqReplicationAuditReplicationEventListenerProperties1;
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties3 = new OASComDayCqReplicationAuditReplicati();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties4 = comDayCqReplicationAuditReplicationEventListenerProperties3;

        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties1.equals(comDayCqReplicationAuditReplicationEventListenerProperties2));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties2.equals(comDayCqReplicationAuditReplicationEventListenerProperties1));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties1.equals(comDayCqReplicationAuditReplicationEventListenerProperties1));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties3.equals(comDayCqReplicationAuditReplicationEventListenerProperties4));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties4.equals(comDayCqReplicationAuditReplicationEventListenerProperties3));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties3.equals(comDayCqReplicationAuditReplicationEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties1 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties2 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties3 = new OASComDayCqReplicationAuditReplicati();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties4 = new OASComDayCqReplicationAuditReplicati();

        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties1.equals(comDayCqReplicationAuditReplicationEventListenerProperties2));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties2.equals(comDayCqReplicationAuditReplicationEventListenerProperties1));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties3.equals(comDayCqReplicationAuditReplicationEventListenerProperties4));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties4.equals(comDayCqReplicationAuditReplicationEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties1 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties2 = new OASComDayCqReplicationAuditReplicati();

        System.assertEquals(false, comDayCqReplicationAuditReplicationEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationAuditReplicationEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties1 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties2 = new OASComDayCqReplicationAuditReplicati();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties3;

        System.assertEquals(false, comDayCqReplicationAuditReplicationEventListenerProperties1.equals(comDayCqReplicationAuditReplicationEventListenerProperties3));
        System.assertEquals(false, comDayCqReplicationAuditReplicationEventListenerProperties2.equals(comDayCqReplicationAuditReplicationEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties1 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties2 = new OASComDayCqReplicationAuditReplicati();

        System.assertEquals(comDayCqReplicationAuditReplicationEventListenerProperties1.hashCode(), comDayCqReplicationAuditReplicationEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqReplicationAuditReplicationEventListenerProperties2.hashCode(), comDayCqReplicationAuditReplicationEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties1 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties2 = OASComDayCqReplicationAuditReplicati.getExample();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties3 = new OASComDayCqReplicationAuditReplicati();
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties4 = new OASComDayCqReplicationAuditReplicati();

        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties1.equals(comDayCqReplicationAuditReplicationEventListenerProperties2));
        System.assert(comDayCqReplicationAuditReplicationEventListenerProperties3.equals(comDayCqReplicationAuditReplicationEventListenerProperties4));
        System.assertEquals(comDayCqReplicationAuditReplicationEventListenerProperties1.hashCode(), comDayCqReplicationAuditReplicationEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqReplicationAuditReplicationEventListenerProperties3.hashCode(), comDayCqReplicationAuditReplicationEventListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationAuditReplicati comDayCqReplicationAuditReplicationEventListenerProperties = new OASComDayCqReplicationAuditReplicati();
        Map<String, String> propertyMappings = comDayCqReplicationAuditReplicationEventListenerProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
