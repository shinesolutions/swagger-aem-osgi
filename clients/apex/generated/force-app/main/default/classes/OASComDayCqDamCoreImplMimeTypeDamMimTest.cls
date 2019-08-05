@isTest
private class OASComDayCqDamCoreImplMimeTypeDamMimTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2 = comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1;
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3 = new OASComDayCqDamCoreImplMimeTypeDamMim();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4 = comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3;

        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3 = new OASComDayCqDamCoreImplMimeTypeDamMim();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4 = new OASComDayCqDamCoreImplMimeTypeDamMim();

        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2 = new OASComDayCqDamCoreImplMimeTypeDamMim();

        System.assertEquals(false, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2 = new OASComDayCqDamCoreImplMimeTypeDamMim();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2 = new OASComDayCqDamCoreImplMimeTypeDamMim();

        System.assertEquals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.hashCode(), comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.hashCode(), comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2 = OASComDayCqDamCoreImplMimeTypeDamMim.getExample();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3 = new OASComDayCqDamCoreImplMimeTypeDamMim();
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4 = new OASComDayCqDamCoreImplMimeTypeDamMim();

        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2));
        System.assert(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3.equals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4));
        System.assertEquals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties1.hashCode(), comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties3.hashCode(), comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplMimeTypeDamMim comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties = new OASComDayCqDamCoreImplMimeTypeDamMim();
        Map<String, String> propertyMappings = comDayCqDamCoreImplMimeTypeDamMimeTypeServiceImplProperties.getPropertyMappings();
        System.assertEquals('cqDamDetectAssetMimeFromContent', propertyMappings.get('cq.dam.detect.asset.mime.from.content'));
    }
}
