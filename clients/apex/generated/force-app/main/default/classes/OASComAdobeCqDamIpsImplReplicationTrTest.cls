@isTest
private class OASComAdobeCqDamIpsImplReplicationTrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2 = comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1;
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3 = new OASComAdobeCqDamIpsImplReplicationTr();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4 = comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3;

        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3 = new OASComAdobeCqDamIpsImplReplicationTr();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4 = new OASComAdobeCqDamIpsImplReplicationTr();

        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2 = new OASComAdobeCqDamIpsImplReplicationTr();

        System.assertEquals(false, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2 = new OASComAdobeCqDamIpsImplReplicationTr();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3;

        System.assertEquals(false, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3));
        System.assertEquals(false, comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2 = new OASComAdobeCqDamIpsImplReplicationTr();

        System.assertEquals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.hashCode(), comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.hashCode());
        System.assertEquals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.hashCode(), comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2 = OASComAdobeCqDamIpsImplReplicationTr.getExample();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3 = new OASComAdobeCqDamIpsImplReplicationTr();
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4 = new OASComAdobeCqDamIpsImplReplicationTr();

        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2));
        System.assert(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3.equals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4));
        System.assertEquals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties1.hashCode(), comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties2.hashCode());
        System.assertEquals(comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties3.hashCode(), comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamIpsImplReplicationTr comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties = new OASComAdobeCqDamIpsImplReplicationTr();
        Map<String, String> propertyMappings = comAdobeCqDamIpsImplReplicationTriggerReplicateOnModifyWorkerProperties.getPropertyMappings();
        System.assertEquals('dmreplicateonmodifyEnabled', propertyMappings.get('dmreplicateonmodify.enabled'));
        System.assertEquals('dmreplicateonmodifyForcesyncdeletes', propertyMappings.get('dmreplicateonmodify.forcesyncdeletes'));
    }
}
