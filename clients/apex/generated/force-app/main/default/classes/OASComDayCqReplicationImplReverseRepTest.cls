@isTest
private class OASComDayCqReplicationImplReverseRepTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties1 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties2 = comDayCqReplicationImplReverseReplicatorProperties1;
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties3 = new OASComDayCqReplicationImplReverseRep();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties4 = comDayCqReplicationImplReverseReplicatorProperties3;

        System.assert(comDayCqReplicationImplReverseReplicatorProperties1.equals(comDayCqReplicationImplReverseReplicatorProperties2));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties2.equals(comDayCqReplicationImplReverseReplicatorProperties1));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties1.equals(comDayCqReplicationImplReverseReplicatorProperties1));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties3.equals(comDayCqReplicationImplReverseReplicatorProperties4));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties4.equals(comDayCqReplicationImplReverseReplicatorProperties3));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties3.equals(comDayCqReplicationImplReverseReplicatorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties1 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties2 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties3 = new OASComDayCqReplicationImplReverseRep();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties4 = new OASComDayCqReplicationImplReverseRep();

        System.assert(comDayCqReplicationImplReverseReplicatorProperties1.equals(comDayCqReplicationImplReverseReplicatorProperties2));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties2.equals(comDayCqReplicationImplReverseReplicatorProperties1));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties3.equals(comDayCqReplicationImplReverseReplicatorProperties4));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties4.equals(comDayCqReplicationImplReverseReplicatorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties1 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties2 = new OASComDayCqReplicationImplReverseRep();

        System.assertEquals(false, comDayCqReplicationImplReverseReplicatorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplReverseReplicatorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties1 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties2 = new OASComDayCqReplicationImplReverseRep();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties3;

        System.assertEquals(false, comDayCqReplicationImplReverseReplicatorProperties1.equals(comDayCqReplicationImplReverseReplicatorProperties3));
        System.assertEquals(false, comDayCqReplicationImplReverseReplicatorProperties2.equals(comDayCqReplicationImplReverseReplicatorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties1 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties2 = new OASComDayCqReplicationImplReverseRep();

        System.assertEquals(comDayCqReplicationImplReverseReplicatorProperties1.hashCode(), comDayCqReplicationImplReverseReplicatorProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplReverseReplicatorProperties2.hashCode(), comDayCqReplicationImplReverseReplicatorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties1 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties2 = OASComDayCqReplicationImplReverseRep.getExample();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties3 = new OASComDayCqReplicationImplReverseRep();
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties4 = new OASComDayCqReplicationImplReverseRep();

        System.assert(comDayCqReplicationImplReverseReplicatorProperties1.equals(comDayCqReplicationImplReverseReplicatorProperties2));
        System.assert(comDayCqReplicationImplReverseReplicatorProperties3.equals(comDayCqReplicationImplReverseReplicatorProperties4));
        System.assertEquals(comDayCqReplicationImplReverseReplicatorProperties1.hashCode(), comDayCqReplicationImplReverseReplicatorProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplReverseReplicatorProperties3.hashCode(), comDayCqReplicationImplReverseReplicatorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplReverseRep comDayCqReplicationImplReverseReplicatorProperties = new OASComDayCqReplicationImplReverseRep();
        Map<String, String> propertyMappings = comDayCqReplicationImplReverseReplicatorProperties.getPropertyMappings();
        System.assertEquals('schedulerPeriod', propertyMappings.get('scheduler.period'));
    }
}
