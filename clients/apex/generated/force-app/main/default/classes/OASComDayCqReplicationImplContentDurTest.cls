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
        Map<String, String> x-property-mappings = comDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties.getx-property-mappings();
        System.assertEquals('preserveHierarchyNodes', x-property-mappings.get('preserve.hierarchy.nodes'));
        System.assertEquals('ignoreVersioning', x-property-mappings.get('ignore.versioning'));
        System.assertEquals('importAcl', x-property-mappings.get('import.acl'));
        System.assertEquals('saveThreshold', x-property-mappings.get('save.threshold'));
        System.assertEquals('preserveUserPaths', x-property-mappings.get('preserve.user.paths'));
        System.assertEquals('preserveUuid', x-property-mappings.get('preserve.uuid'));
        System.assertEquals('preserveUuidNodetypes', x-property-mappings.get('preserve.uuid.nodetypes'));
        System.assertEquals('preserveUuidSubtrees', x-property-mappings.get('preserve.uuid.subtrees'));
        System.assertEquals('autoCommit', x-property-mappings.get('auto.commit'));
    }
}
