@isTest
private class OASComDayCqWcmCoreImplVersionPurgeTaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties1 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties2 = comDayCqWcmCoreImplVersionPurgeTaskProperties1;
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties3 = new OASComDayCqWcmCoreImplVersionPurgeTa();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties4 = comDayCqWcmCoreImplVersionPurgeTaskProperties3;

        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties1.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties2));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties2.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties1));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties1.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties1));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties3.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties4));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties4.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties3));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties3.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties1 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties2 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties3 = new OASComDayCqWcmCoreImplVersionPurgeTa();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties4 = new OASComDayCqWcmCoreImplVersionPurgeTa();

        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties1.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties2));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties2.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties1));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties3.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties4));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties4.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties1 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties2 = new OASComDayCqWcmCoreImplVersionPurgeTa();

        System.assertEquals(false, comDayCqWcmCoreImplVersionPurgeTaskProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplVersionPurgeTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties1 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties2 = new OASComDayCqWcmCoreImplVersionPurgeTa();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplVersionPurgeTaskProperties1.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplVersionPurgeTaskProperties2.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties1 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties2 = new OASComDayCqWcmCoreImplVersionPurgeTa();

        System.assertEquals(comDayCqWcmCoreImplVersionPurgeTaskProperties1.hashCode(), comDayCqWcmCoreImplVersionPurgeTaskProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplVersionPurgeTaskProperties2.hashCode(), comDayCqWcmCoreImplVersionPurgeTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties1 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties2 = OASComDayCqWcmCoreImplVersionPurgeTa.getExample();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties3 = new OASComDayCqWcmCoreImplVersionPurgeTa();
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties4 = new OASComDayCqWcmCoreImplVersionPurgeTa();

        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties1.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties2));
        System.assert(comDayCqWcmCoreImplVersionPurgeTaskProperties3.equals(comDayCqWcmCoreImplVersionPurgeTaskProperties4));
        System.assertEquals(comDayCqWcmCoreImplVersionPurgeTaskProperties1.hashCode(), comDayCqWcmCoreImplVersionPurgeTaskProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplVersionPurgeTaskProperties3.hashCode(), comDayCqWcmCoreImplVersionPurgeTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplVersionPurgeTa comDayCqWcmCoreImplVersionPurgeTaskProperties = new OASComDayCqWcmCoreImplVersionPurgeTa();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplVersionPurgeTaskProperties.getPropertyMappings();
        System.assertEquals('versionpurgePaths', propertyMappings.get('versionpurge.paths'));
        System.assertEquals('versionpurgeRecursive', propertyMappings.get('versionpurge.recursive'));
        System.assertEquals('versionpurgeMaxVersions', propertyMappings.get('versionpurge.maxVersions'));
        System.assertEquals('versionpurgeMinVersions', propertyMappings.get('versionpurge.minVersions'));
        System.assertEquals('versionpurgeMaxAgeDays', propertyMappings.get('versionpurge.maxAgeDays'));
    }
}
