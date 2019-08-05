@isTest
private class OASComDayCqReplicationImplContentDurTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2 = comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1;
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3 = new OASComDayCqReplicationImplContentDur();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4 = comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3;

        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3 = new OASComDayCqReplicationImplContentDur();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4 = new OASComDayCqReplicationImplContentDur();

        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2 = new OASComDayCqReplicationImplContentDur();

        System.assertEquals(false, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2 = new OASComDayCqReplicationImplContentDur();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3;

        System.assertEquals(false, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3));
        System.assertEquals(false, comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2 = new OASComDayCqReplicationImplContentDur();

        System.assertEquals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.hashCode(), comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.hashCode());
        System.assertEquals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.hashCode(), comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2 = OASComDayCqReplicationImplContentDur.getExample();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3 = new OASComDayCqReplicationImplContentDur();
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4 = new OASComDayCqReplicationImplContentDur();

        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2));
        System.assert(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3.equals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4));
        System.assertEquals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties1.hashCode(), comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties2.hashCode());
        System.assertEquals(comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties3.hashCode(), comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReplicationImplContentDur comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties = new OASComDayCqReplicationImplContentDur();
        Map<String, String> propertyMappings = comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.getPropertyMappings();
        System.assertEquals('preserveHierarchyNodes', propertyMappings.get('preserve.hierarchy.nodes'));
        System.assertEquals('ignoreVersioning', propertyMappings.get('ignore.versioning'));
        System.assertEquals('importAcl', propertyMappings.get('import.acl'));
        System.assertEquals('saveThreshold', propertyMappings.get('save.threshold'));
        System.assertEquals('preserveUserPaths', propertyMappings.get('preserve.user.paths'));
        System.assertEquals('preserveUuid', propertyMappings.get('preserve.uuid'));
        System.assertEquals('preserveUuidNodetypes', propertyMappings.get('preserve.uuid.nodetypes'));
        System.assertEquals('preserveUuidSubtrees', propertyMappings.get('preserve.uuid.subtrees'));
        System.assertEquals('autoCommit', propertyMappings.get('auto.commit'));
    }
}
