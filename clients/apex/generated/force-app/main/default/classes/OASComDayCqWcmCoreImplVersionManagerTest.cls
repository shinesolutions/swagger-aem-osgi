@isTest
private class OASComDayCqWcmCoreImplVersionManagerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties1 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties2 = comDayCqWcmCoreImplVersionManagerImplProperties1;
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties3 = new OASComDayCqWcmCoreImplVersionManager();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties4 = comDayCqWcmCoreImplVersionManagerImplProperties3;

        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties1.equals(comDayCqWcmCoreImplVersionManagerImplProperties2));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties2.equals(comDayCqWcmCoreImplVersionManagerImplProperties1));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties1.equals(comDayCqWcmCoreImplVersionManagerImplProperties1));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties3.equals(comDayCqWcmCoreImplVersionManagerImplProperties4));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties4.equals(comDayCqWcmCoreImplVersionManagerImplProperties3));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties3.equals(comDayCqWcmCoreImplVersionManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties1 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties2 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties3 = new OASComDayCqWcmCoreImplVersionManager();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties4 = new OASComDayCqWcmCoreImplVersionManager();

        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties1.equals(comDayCqWcmCoreImplVersionManagerImplProperties2));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties2.equals(comDayCqWcmCoreImplVersionManagerImplProperties1));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties3.equals(comDayCqWcmCoreImplVersionManagerImplProperties4));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties4.equals(comDayCqWcmCoreImplVersionManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties1 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties2 = new OASComDayCqWcmCoreImplVersionManager();

        System.assertEquals(false, comDayCqWcmCoreImplVersionManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplVersionManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties1 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties2 = new OASComDayCqWcmCoreImplVersionManager();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplVersionManagerImplProperties1.equals(comDayCqWcmCoreImplVersionManagerImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplVersionManagerImplProperties2.equals(comDayCqWcmCoreImplVersionManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties1 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties2 = new OASComDayCqWcmCoreImplVersionManager();

        System.assertEquals(comDayCqWcmCoreImplVersionManagerImplProperties1.hashCode(), comDayCqWcmCoreImplVersionManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplVersionManagerImplProperties2.hashCode(), comDayCqWcmCoreImplVersionManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties1 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties2 = OASComDayCqWcmCoreImplVersionManager.getExample();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties3 = new OASComDayCqWcmCoreImplVersionManager();
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties4 = new OASComDayCqWcmCoreImplVersionManager();

        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties1.equals(comDayCqWcmCoreImplVersionManagerImplProperties2));
        System.assert(comDayCqWcmCoreImplVersionManagerImplProperties3.equals(comDayCqWcmCoreImplVersionManagerImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplVersionManagerImplProperties1.hashCode(), comDayCqWcmCoreImplVersionManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplVersionManagerImplProperties3.hashCode(), comDayCqWcmCoreImplVersionManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplVersionManager comDayCqWcmCoreImplVersionManagerImplProperties = new OASComDayCqWcmCoreImplVersionManager();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplVersionManagerImplProperties.getPropertyMappings();
        System.assertEquals('versionmanagerCreateVersionOnActivation', propertyMappings.get('versionmanager.createVersionOnActivation'));
        System.assertEquals('versionmanagerPurgingEnabled', propertyMappings.get('versionmanager.purgingEnabled'));
        System.assertEquals('versionmanagerPurgePaths', propertyMappings.get('versionmanager.purgePaths'));
        System.assertEquals('versionmanagerIvPaths', propertyMappings.get('versionmanager.ivPaths'));
        System.assertEquals('versionmanagerMaxAgeDays', propertyMappings.get('versionmanager.maxAgeDays'));
        System.assertEquals('versionmanagerMaxNumberVersions', propertyMappings.get('versionmanager.maxNumberVersions'));
        System.assertEquals('versionmanagerMinNumberVersions', propertyMappings.get('versionmanager.minNumberVersions'));
    }
}
