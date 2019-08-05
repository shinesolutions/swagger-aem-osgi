@isTest
private class OASComDayCqDamCoreProcessMetadataProTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties1 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties2 = comDayCqDamCoreProcessMetadataProcessorProcessProperties1;
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties3 = new OASComDayCqDamCoreProcessMetadataPro();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties4 = comDayCqDamCoreProcessMetadataProcessorProcessProperties3;

        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties1.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties2));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties2.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties1));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties1.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties1));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties3.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties4));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties4.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties3));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties3.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties1 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties2 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties3 = new OASComDayCqDamCoreProcessMetadataPro();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties4 = new OASComDayCqDamCoreProcessMetadataPro();

        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties1.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties2));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties2.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties1));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties3.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties4));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties4.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties1 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties2 = new OASComDayCqDamCoreProcessMetadataPro();

        System.assertEquals(false, comDayCqDamCoreProcessMetadataProcessorProcessProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreProcessMetadataProcessorProcessProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties1 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties2 = new OASComDayCqDamCoreProcessMetadataPro();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties3;

        System.assertEquals(false, comDayCqDamCoreProcessMetadataProcessorProcessProperties1.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties3));
        System.assertEquals(false, comDayCqDamCoreProcessMetadataProcessorProcessProperties2.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties1 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties2 = new OASComDayCqDamCoreProcessMetadataPro();

        System.assertEquals(comDayCqDamCoreProcessMetadataProcessorProcessProperties1.hashCode(), comDayCqDamCoreProcessMetadataProcessorProcessProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreProcessMetadataProcessorProcessProperties2.hashCode(), comDayCqDamCoreProcessMetadataProcessorProcessProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties1 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties2 = OASComDayCqDamCoreProcessMetadataPro.getExample();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties3 = new OASComDayCqDamCoreProcessMetadataPro();
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties4 = new OASComDayCqDamCoreProcessMetadataPro();

        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties1.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties2));
        System.assert(comDayCqDamCoreProcessMetadataProcessorProcessProperties3.equals(comDayCqDamCoreProcessMetadataProcessorProcessProperties4));
        System.assertEquals(comDayCqDamCoreProcessMetadataProcessorProcessProperties1.hashCode(), comDayCqDamCoreProcessMetadataProcessorProcessProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreProcessMetadataProcessorProcessProperties3.hashCode(), comDayCqDamCoreProcessMetadataProcessorProcessProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreProcessMetadataPro comDayCqDamCoreProcessMetadataProcessorProcessProperties = new OASComDayCqDamCoreProcessMetadataPro();
        Map<String, String> propertyMappings = comDayCqDamCoreProcessMetadataProcessorProcessProperties.getPropertyMappings();
        System.assertEquals('processLabel', propertyMappings.get('process.label'));
        System.assertEquals('cqDamEnableSha1', propertyMappings.get('cq.dam.enable.sha1'));
        System.assertEquals('cqDamMetadataXssprotectedProperties', propertyMappings.get('cq.dam.metadata.xssprotected.properties'));
    }
}
