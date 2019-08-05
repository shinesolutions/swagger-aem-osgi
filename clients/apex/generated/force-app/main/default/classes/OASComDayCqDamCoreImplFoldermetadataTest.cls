@isTest
private class OASComDayCqDamCoreImplFoldermetadataTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2 = comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1;
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3 = new OASComDayCqDamCoreImplFoldermetadata();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4 = comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3;

        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3 = new OASComDayCqDamCoreImplFoldermetadata();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4 = new OASComDayCqDamCoreImplFoldermetadata();

        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2 = new OASComDayCqDamCoreImplFoldermetadata();

        System.assertEquals(false, comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2 = new OASComDayCqDamCoreImplFoldermetadata();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3;

        System.assertEquals(false, comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3));
        System.assertEquals(false, comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2 = new OASComDayCqDamCoreImplFoldermetadata();

        System.assertEquals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.hashCode(), comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.hashCode(), comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2 = OASComDayCqDamCoreImplFoldermetadata.getExample();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3 = new OASComDayCqDamCoreImplFoldermetadata();
        OASComDayCqDamCoreImplFoldermetadata comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4 = new OASComDayCqDamCoreImplFoldermetadata();

        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2));
        System.assert(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3.equals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4));
        System.assertEquals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties1.hashCode(), comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties3.hashCode(), comDayCqDamCoreImplFoldermetadataschemaFolderMetadataSchemaFeatProperties4.hashCode());
    }
}
