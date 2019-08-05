@isTest
private class OASComDayCqDamCoreProcessExifToolExtTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2 = comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1;
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3 = new OASComDayCqDamCoreProcessExifToolExt();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4 = comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3;

        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3 = new OASComDayCqDamCoreProcessExifToolExt();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4 = new OASComDayCqDamCoreProcessExifToolExt();

        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2 = new OASComDayCqDamCoreProcessExifToolExt();

        System.assertEquals(false, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2 = new OASComDayCqDamCoreProcessExifToolExt();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3;

        System.assertEquals(false, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3));
        System.assertEquals(false, comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2 = new OASComDayCqDamCoreProcessExifToolExt();

        System.assertEquals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.hashCode(), comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.hashCode(), comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2 = OASComDayCqDamCoreProcessExifToolExt.getExample();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3 = new OASComDayCqDamCoreProcessExifToolExt();
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4 = new OASComDayCqDamCoreProcessExifToolExt();

        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2));
        System.assert(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3.equals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4));
        System.assertEquals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties1.hashCode(), comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties3.hashCode(), comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreProcessExifToolExt comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties = new OASComDayCqDamCoreProcessExifToolExt();
        Map<String, String> propertyMappings = comDayCqDamCoreProcessExifToolExtractMetadataProcessProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
        System.assertEquals('cqDamEnableSha1', propertyMappings.get('cq.dam.enable.sha1'));
    }
}
