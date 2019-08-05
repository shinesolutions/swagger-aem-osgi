@isTest
private class OASComDayCqReplicationImplReplicatioTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties1 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties2 = comDayCqReplicationImplReplicationReceiverImplProperties1;
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties3 = new OASComDayCqReplicationImplReplicatio();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties4 = comDayCqReplicationImplReplicationReceiverImplProperties3;

        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties1.equals(comDayCqReplicationImplReplicationReceiverImplProperties2));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties2.equals(comDayCqReplicationImplReplicationReceiverImplProperties1));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties1.equals(comDayCqReplicationImplReplicationReceiverImplProperties1));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties3.equals(comDayCqReplicationImplReplicationReceiverImplProperties4));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties4.equals(comDayCqReplicationImplReplicationReceiverImplProperties3));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties3.equals(comDayCqReplicationImplReplicationReceiverImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties1 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties2 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties3 = new OASComDayCqReplicationImplReplicatio();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties4 = new OASComDayCqReplicationImplReplicatio();

        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties1.equals(comDayCqReplicationImplReplicationReceiverImplProperties2));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties2.equals(comDayCqReplicationImplReplicationReceiverImplProperties1));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties3.equals(comDayCqReplicationImplReplicationReceiverImplProperties4));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties4.equals(comDayCqReplicationImplReplicationReceiverImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties1 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties2 = new OASComDayCqReplicationImplReplicatio();

        System.assertEquals(false, comDayCqReplicationImplReplicationReceiverImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplReplicationReceiverImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties1 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties2 = new OASComDayCqReplicationImplReplicatio();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties3;

        System.assertEquals(false, comDayCqReplicationImplReplicationReceiverImplProperties1.equals(comDayCqReplicationImplReplicationReceiverImplProperties3));
        System.assertEquals(false, comDayCqReplicationImplReplicationReceiverImplProperties2.equals(comDayCqReplicationImplReplicationReceiverImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties1 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties2 = new OASComDayCqReplicationImplReplicatio();

        System.assertEquals(comDayCqReplicationImplReplicationReceiverImplProperties1.hashCode(), comDayCqReplicationImplReplicationReceiverImplProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplReplicationReceiverImplProperties2.hashCode(), comDayCqReplicationImplReplicationReceiverImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties1 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties2 = OASComDayCqReplicationImplReplicatio.getExample();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties3 = new OASComDayCqReplicationImplReplicatio();
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties4 = new OASComDayCqReplicationImplReplicatio();

        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties1.equals(comDayCqReplicationImplReplicationReceiverImplProperties2));
        System.assert(comDayCqReplicationImplReplicationReceiverImplProperties3.equals(comDayCqReplicationImplReplicationReceiverImplProperties4));
        System.assertEquals(comDayCqReplicationImplReplicationReceiverImplProperties1.hashCode(), comDayCqReplicationImplReplicationReceiverImplProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplReplicationReceiverImplProperties3.hashCode(), comDayCqReplicationImplReplicationReceiverImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplReplicatio comDayCqReplicationImplReplicationReceiverImplProperties = new OASComDayCqReplicationImplReplicatio();
        Map<String, String> propertyMappings = comDayCqReplicationImplReplicationReceiverImplProperties.getPropertyMappings();
        System.assertEquals('receiverTmpfileThreshold', propertyMappings.get('receiver.tmpfile.threshold'));
        System.assertEquals('receiverPackagesUseInstall', propertyMappings.get('receiver.packages.use.install'));
    }
}
