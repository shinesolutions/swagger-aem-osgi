@isTest
private class OASComDayCqDamCommonsHandlerStandardTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties1 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties2 = comDayCqDamCommonsHandlerStandardImageHandlerProperties1;
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties3 = new OASComDayCqDamCommonsHandlerStandard();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties4 = comDayCqDamCommonsHandlerStandardImageHandlerProperties3;

        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties1.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties2));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties2.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties1));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties1.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties1));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties3.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties4));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties4.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties3));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties3.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties1 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties2 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties3 = new OASComDayCqDamCommonsHandlerStandard();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties4 = new OASComDayCqDamCommonsHandlerStandard();

        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties1.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties2));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties2.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties1));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties3.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties4));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties4.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties1 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties2 = new OASComDayCqDamCommonsHandlerStandard();

        System.assertEquals(false, comDayCqDamCommonsHandlerStandardImageHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCommonsHandlerStandardImageHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties1 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties2 = new OASComDayCqDamCommonsHandlerStandard();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties3;

        System.assertEquals(false, comDayCqDamCommonsHandlerStandardImageHandlerProperties1.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties3));
        System.assertEquals(false, comDayCqDamCommonsHandlerStandardImageHandlerProperties2.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties1 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties2 = new OASComDayCqDamCommonsHandlerStandard();

        System.assertEquals(comDayCqDamCommonsHandlerStandardImageHandlerProperties1.hashCode(), comDayCqDamCommonsHandlerStandardImageHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamCommonsHandlerStandardImageHandlerProperties2.hashCode(), comDayCqDamCommonsHandlerStandardImageHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties1 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties2 = OASComDayCqDamCommonsHandlerStandard.getExample();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties3 = new OASComDayCqDamCommonsHandlerStandard();
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties4 = new OASComDayCqDamCommonsHandlerStandard();

        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties1.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties2));
        System.assert(comDayCqDamCommonsHandlerStandardImageHandlerProperties3.equals(comDayCqDamCommonsHandlerStandardImageHandlerProperties4));
        System.assertEquals(comDayCqDamCommonsHandlerStandardImageHandlerProperties1.hashCode(), comDayCqDamCommonsHandlerStandardImageHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamCommonsHandlerStandardImageHandlerProperties3.hashCode(), comDayCqDamCommonsHandlerStandardImageHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCommonsHandlerStandard comDayCqDamCommonsHandlerStandardImageHandlerProperties = new OASComDayCqDamCommonsHandlerStandard();
        Map<String, String> propertyMappings = comDayCqDamCommonsHandlerStandardImageHandlerProperties.getPropertyMappings();
        System.assertEquals('largeFileThreshold', propertyMappings.get('large_file_threshold'));
        System.assertEquals('largeCommentThreshold', propertyMappings.get('large_comment_threshold'));
        System.assertEquals('cqDamEnableExtMetaExtraction', propertyMappings.get('cq.dam.enable.ext.meta.extraction'));
    }
}
