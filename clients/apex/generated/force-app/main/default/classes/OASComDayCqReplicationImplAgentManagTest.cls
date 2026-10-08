@isTest
private class OASComDayCqReplicationImplAgentManagTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties1 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties2 = comDayCqReplicationImplAgentManagerImplProperties1;
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties3 = new OASComDayCqReplicationImplAgentManag();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties4 = comDayCqReplicationImplAgentManagerImplProperties3;

        System.assert(comDayCqReplicationImplAgentManagerImplProperties1.equals(comDayCqReplicationImplAgentManagerImplProperties2));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties2.equals(comDayCqReplicationImplAgentManagerImplProperties1));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties1.equals(comDayCqReplicationImplAgentManagerImplProperties1));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties3.equals(comDayCqReplicationImplAgentManagerImplProperties4));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties4.equals(comDayCqReplicationImplAgentManagerImplProperties3));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties3.equals(comDayCqReplicationImplAgentManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties1 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties2 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties3 = new OASComDayCqReplicationImplAgentManag();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties4 = new OASComDayCqReplicationImplAgentManag();

        System.assert(comDayCqReplicationImplAgentManagerImplProperties1.equals(comDayCqReplicationImplAgentManagerImplProperties2));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties2.equals(comDayCqReplicationImplAgentManagerImplProperties1));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties3.equals(comDayCqReplicationImplAgentManagerImplProperties4));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties4.equals(comDayCqReplicationImplAgentManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties1 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties2 = new OASComDayCqReplicationImplAgentManag();

        System.assertEquals(false, comDayCqReplicationImplAgentManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplAgentManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties1 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties2 = new OASComDayCqReplicationImplAgentManag();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties3;

        System.assertEquals(false, comDayCqReplicationImplAgentManagerImplProperties1.equals(comDayCqReplicationImplAgentManagerImplProperties3));
        System.assertEquals(false, comDayCqReplicationImplAgentManagerImplProperties2.equals(comDayCqReplicationImplAgentManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties1 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties2 = new OASComDayCqReplicationImplAgentManag();

        System.assertEquals(comDayCqReplicationImplAgentManagerImplProperties1.hashCode(), comDayCqReplicationImplAgentManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplAgentManagerImplProperties2.hashCode(), comDayCqReplicationImplAgentManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties1 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties2 = OASComDayCqReplicationImplAgentManag.getExample();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties3 = new OASComDayCqReplicationImplAgentManag();
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties4 = new OASComDayCqReplicationImplAgentManag();

        System.assert(comDayCqReplicationImplAgentManagerImplProperties1.equals(comDayCqReplicationImplAgentManagerImplProperties2));
        System.assert(comDayCqReplicationImplAgentManagerImplProperties3.equals(comDayCqReplicationImplAgentManagerImplProperties4));
        System.assertEquals(comDayCqReplicationImplAgentManagerImplProperties1.hashCode(), comDayCqReplicationImplAgentManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplAgentManagerImplProperties3.hashCode(), comDayCqReplicationImplAgentManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplAgentManag comDayCqReplicationImplAgentManagerImplProperties = new OASComDayCqReplicationImplAgentManag();
        Map<String, String> x-property-mappings = comDayCqReplicationImplAgentManagerImplProperties.getx-property-mappings();
        System.assertEquals('jobTopics', x-property-mappings.get('job.topics'));
        System.assertEquals('serviceUserTarget', x-property-mappings.get('serviceUser.target'));
        System.assertEquals('agentProviderTarget', x-property-mappings.get('agentProvider.target'));
    }
}
