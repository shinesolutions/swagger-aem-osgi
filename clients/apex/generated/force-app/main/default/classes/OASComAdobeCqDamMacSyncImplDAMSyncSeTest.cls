@isTest
private class OASComAdobeCqDamMacSyncImplDAMSyncSeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2 = comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1;
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4 = comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3;

        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();

        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();

        System.assertEquals(false, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3;

        System.assertEquals(false, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3));
        System.assertEquals(false, comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();

        System.assertEquals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.hashCode(), comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.hashCode(), comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2 = OASComAdobeCqDamMacSyncImplDAMSyncSe.getExample();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4 = new OASComAdobeCqDamMacSyncImplDAMSyncSe();

        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2));
        System.assert(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3.equals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4));
        System.assertEquals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties1.hashCode(), comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties3.hashCode(), comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamMacSyncImplDAMSyncSe comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties = new OASComAdobeCqDamMacSyncImplDAMSyncSe();
        Map<String, String> propertyMappings = comAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.getPropertyMappings();
        System.assertEquals('comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths', propertyMappings.get('com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths'));
        System.assertEquals('comAdobeCqDamMacSyncDamsyncserviceSyncRenditions', propertyMappings.get('com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions'));
        System.assertEquals('comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs', propertyMappings.get('com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms'));
        System.assertEquals('comAdobeCqDamMacSyncDamsyncservicePlatform', propertyMappings.get('com.adobe.cq.dam.mac.sync.damsyncservice.platform'));
    }
}
