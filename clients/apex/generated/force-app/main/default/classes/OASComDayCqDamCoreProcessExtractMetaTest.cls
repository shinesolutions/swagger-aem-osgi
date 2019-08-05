@isTest
private class OASComDayCqDamCoreProcessExtractMetaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties2 = comDayCqDamCoreProcessExtractMetadataProcessProperties1;
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties3 = new OASComDayCqDamCoreProcessExtractMeta();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties4 = comDayCqDamCoreProcessExtractMetadataProcessProperties3;

        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties2));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties2.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties1));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties1));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties4));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties4.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties3));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties2 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties3 = new OASComDayCqDamCoreProcessExtractMeta();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties4 = new OASComDayCqDamCoreProcessExtractMeta();

        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties2));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties2.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties1));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties4));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties4.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties2 = new OASComDayCqDamCoreProcessExtractMeta();

        System.assertEquals(false, comDayCqDamCoreProcessExtractMetadataProcessProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreProcessExtractMetadataProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties2 = new OASComDayCqDamCoreProcessExtractMeta();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties3;

        System.assertEquals(false, comDayCqDamCoreProcessExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties3));
        System.assertEquals(false, comDayCqDamCoreProcessExtractMetadataProcessProperties2.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties2 = new OASComDayCqDamCoreProcessExtractMeta();

        System.assertEquals(comDayCqDamCoreProcessExtractMetadataProcessProperties1.hashCode(), comDayCqDamCoreProcessExtractMetadataProcessProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreProcessExtractMetadataProcessProperties2.hashCode(), comDayCqDamCoreProcessExtractMetadataProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties2 = OASComDayCqDamCoreProcessExtractMeta.getExample();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties3 = new OASComDayCqDamCoreProcessExtractMeta();
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties4 = new OASComDayCqDamCoreProcessExtractMeta();

        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties2));
        System.assert(comDayCqDamCoreProcessExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExtractMetadataProcessProperties4));
        System.assertEquals(comDayCqDamCoreProcessExtractMetadataProcessProperties1.hashCode(), comDayCqDamCoreProcessExtractMetadataProcessProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreProcessExtractMetadataProcessProperties3.hashCode(), comDayCqDamCoreProcessExtractMetadataProcessProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreProcessExtractMeta comDayCqDamCoreProcessExtractMetadataProcessProperties = new OASComDayCqDamCoreProcessExtractMeta();
        Map<String, String> propertyMappings = comDayCqDamCoreProcessExtractMetadataProcessProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
        System.assertEquals('cqDamEnableSha1', propertyMappings.get('cq.dam.enable.sha1'));
    }
}
