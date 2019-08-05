@isTest
private class OASComDayCqDamCoreImplMimeTypeAssetUTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2 = comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1;
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3 = new OASComDayCqDamCoreImplMimeTypeAssetU();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4 = comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3;

        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3 = new OASComDayCqDamCoreImplMimeTypeAssetU();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4 = new OASComDayCqDamCoreImplMimeTypeAssetU();

        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2 = new OASComDayCqDamCoreImplMimeTypeAssetU();

        System.assertEquals(false, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2 = new OASComDayCqDamCoreImplMimeTypeAssetU();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3;

        System.assertEquals(false, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3));
        System.assertEquals(false, comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2 = new OASComDayCqDamCoreImplMimeTypeAssetU();

        System.assertEquals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.hashCode(), comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.hashCode(), comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2 = OASComDayCqDamCoreImplMimeTypeAssetU.getExample();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3 = new OASComDayCqDamCoreImplMimeTypeAssetU();
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4 = new OASComDayCqDamCoreImplMimeTypeAssetU();

        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2));
        System.assert(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3.equals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4));
        System.assertEquals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties1.hashCode(), comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties3.hashCode(), comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplMimeTypeAssetU comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties = new OASComDayCqDamCoreImplMimeTypeAssetU();
        Map<String, String> propertyMappings = comDayCqDamCoreImplMimeTypeAssetUploadRestrictionHelperProperties.getPropertyMappings();
        System.assertEquals('cqDamAllowAllMime', propertyMappings.get('cq.dam.allow.all.mime'));
        System.assertEquals('cqDamAllowedAssetMimes', propertyMappings.get('cq.dam.allowed.asset.mimes'));
    }
}
