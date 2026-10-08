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
        Map<String, String> x-property-mappings = comDayCqWcmCoreImplVersionManagerImplProperties.getx-property-mappings();
        System.assertEquals('versionmanagerCreateVersionOnActivation', x-property-mappings.get('versionmanager.createVersionOnActivation'));
        System.assertEquals('versionmanagerPurgingEnabled', x-property-mappings.get('versionmanager.purgingEnabled'));
        System.assertEquals('versionmanagerPurgePaths', x-property-mappings.get('versionmanager.purgePaths'));
        System.assertEquals('versionmanagerIvPaths', x-property-mappings.get('versionmanager.ivPaths'));
        System.assertEquals('versionmanagerMaxAgeDays', x-property-mappings.get('versionmanager.maxAgeDays'));
        System.assertEquals('versionmanagerMaxNumberVersions', x-property-mappings.get('versionmanager.maxNumberVersions'));
        System.assertEquals('versionmanagerMinNumberVersions', x-property-mappings.get('versionmanager.minNumberVersions'));
    }
}
