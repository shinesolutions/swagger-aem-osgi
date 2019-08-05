@isTest
private class OASComDayCqDamCoreImplRenditionMakerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties1 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties2 = comDayCqDamCoreImplRenditionMakerImplProperties1;
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties3 = new OASComDayCqDamCoreImplRenditionMaker();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties4 = comDayCqDamCoreImplRenditionMakerImplProperties3;

        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties1.equals(comDayCqDamCoreImplRenditionMakerImplProperties2));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties2.equals(comDayCqDamCoreImplRenditionMakerImplProperties1));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties1.equals(comDayCqDamCoreImplRenditionMakerImplProperties1));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties3.equals(comDayCqDamCoreImplRenditionMakerImplProperties4));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties4.equals(comDayCqDamCoreImplRenditionMakerImplProperties3));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties3.equals(comDayCqDamCoreImplRenditionMakerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties1 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties2 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties3 = new OASComDayCqDamCoreImplRenditionMaker();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties4 = new OASComDayCqDamCoreImplRenditionMaker();

        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties1.equals(comDayCqDamCoreImplRenditionMakerImplProperties2));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties2.equals(comDayCqDamCoreImplRenditionMakerImplProperties1));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties3.equals(comDayCqDamCoreImplRenditionMakerImplProperties4));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties4.equals(comDayCqDamCoreImplRenditionMakerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties1 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties2 = new OASComDayCqDamCoreImplRenditionMaker();

        System.assertEquals(false, comDayCqDamCoreImplRenditionMakerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplRenditionMakerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties1 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties2 = new OASComDayCqDamCoreImplRenditionMaker();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplRenditionMakerImplProperties1.equals(comDayCqDamCoreImplRenditionMakerImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplRenditionMakerImplProperties2.equals(comDayCqDamCoreImplRenditionMakerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties1 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties2 = new OASComDayCqDamCoreImplRenditionMaker();

        System.assertEquals(comDayCqDamCoreImplRenditionMakerImplProperties1.hashCode(), comDayCqDamCoreImplRenditionMakerImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplRenditionMakerImplProperties2.hashCode(), comDayCqDamCoreImplRenditionMakerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties1 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties2 = OASComDayCqDamCoreImplRenditionMaker.getExample();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties3 = new OASComDayCqDamCoreImplRenditionMaker();
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties4 = new OASComDayCqDamCoreImplRenditionMaker();

        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties1.equals(comDayCqDamCoreImplRenditionMakerImplProperties2));
        System.assert(comDayCqDamCoreImplRenditionMakerImplProperties3.equals(comDayCqDamCoreImplRenditionMakerImplProperties4));
        System.assertEquals(comDayCqDamCoreImplRenditionMakerImplProperties1.hashCode(), comDayCqDamCoreImplRenditionMakerImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplRenditionMakerImplProperties3.hashCode(), comDayCqDamCoreImplRenditionMakerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplRenditionMaker comDayCqDamCoreImplRenditionMakerImplProperties = new OASComDayCqDamCoreImplRenditionMaker();
        Map<String, String> propertyMappings = comDayCqDamCoreImplRenditionMakerImplProperties.getPropertyMappings();
        System.assertEquals('xmpPropagate', propertyMappings.get('xmp.propagate'));
        System.assertEquals('xmpExcludes', propertyMappings.get('xmp.excludes'));
    }
}
