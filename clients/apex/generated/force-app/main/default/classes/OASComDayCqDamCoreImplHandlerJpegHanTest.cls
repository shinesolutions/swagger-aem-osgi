@isTest
private class OASComDayCqDamCoreImplHandlerJpegHanTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties1 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties2 = comDayCqDamCoreImplHandlerJpegHandlerProperties1;
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties3 = new OASComDayCqDamCoreImplHandlerJpegHan();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties4 = comDayCqDamCoreImplHandlerJpegHandlerProperties3;

        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties1.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties2.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties1.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties3.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties4.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties3));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties3.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties1 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties2 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties3 = new OASComDayCqDamCoreImplHandlerJpegHan();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties4 = new OASComDayCqDamCoreImplHandlerJpegHan();

        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties1.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties2.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties3.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties4.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties1 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties2 = new OASComDayCqDamCoreImplHandlerJpegHan();

        System.assertEquals(false, comDayCqDamCoreImplHandlerJpegHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplHandlerJpegHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties1 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties2 = new OASComDayCqDamCoreImplHandlerJpegHan();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplHandlerJpegHandlerProperties1.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplHandlerJpegHandlerProperties2.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties1 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties2 = new OASComDayCqDamCoreImplHandlerJpegHan();

        System.assertEquals(comDayCqDamCoreImplHandlerJpegHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerJpegHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerJpegHandlerProperties2.hashCode(), comDayCqDamCoreImplHandlerJpegHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties1 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties2 = OASComDayCqDamCoreImplHandlerJpegHan.getExample();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties3 = new OASComDayCqDamCoreImplHandlerJpegHan();
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties4 = new OASComDayCqDamCoreImplHandlerJpegHan();

        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties1.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerJpegHandlerProperties3.equals(comDayCqDamCoreImplHandlerJpegHandlerProperties4));
        System.assertEquals(comDayCqDamCoreImplHandlerJpegHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerJpegHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerJpegHandlerProperties3.hashCode(), comDayCqDamCoreImplHandlerJpegHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplHandlerJpegHan comDayCqDamCoreImplHandlerJpegHandlerProperties = new OASComDayCqDamCoreImplHandlerJpegHan();
        Map<String, String> propertyMappings = comDayCqDamCoreImplHandlerJpegHandlerProperties.getPropertyMappings();
        System.assertEquals('cqDamEnableExtMetaExtraction', propertyMappings.get('cq.dam.enable.ext.meta.extraction'));
        System.assertEquals('largeFileThreshold', propertyMappings.get('large_file_threshold'));
        System.assertEquals('largeCommentThreshold', propertyMappings.get('large_comment_threshold'));
    }
}
