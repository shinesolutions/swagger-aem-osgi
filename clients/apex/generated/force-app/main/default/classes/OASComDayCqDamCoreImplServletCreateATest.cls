@isTest
private class OASComDayCqDamCoreImplServletCreateATest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties1 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties2 = comDayCqDamCoreImplServletCreateAssetServletProperties1;
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties3 = new OASComDayCqDamCoreImplServletCreateA();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties4 = comDayCqDamCoreImplServletCreateAssetServletProperties3;

        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties1.equals(comDayCqDamCoreImplServletCreateAssetServletProperties2));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties2.equals(comDayCqDamCoreImplServletCreateAssetServletProperties1));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties1.equals(comDayCqDamCoreImplServletCreateAssetServletProperties1));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties3.equals(comDayCqDamCoreImplServletCreateAssetServletProperties4));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties4.equals(comDayCqDamCoreImplServletCreateAssetServletProperties3));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties3.equals(comDayCqDamCoreImplServletCreateAssetServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties1 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties2 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties3 = new OASComDayCqDamCoreImplServletCreateA();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties4 = new OASComDayCqDamCoreImplServletCreateA();

        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties1.equals(comDayCqDamCoreImplServletCreateAssetServletProperties2));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties2.equals(comDayCqDamCoreImplServletCreateAssetServletProperties1));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties3.equals(comDayCqDamCoreImplServletCreateAssetServletProperties4));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties4.equals(comDayCqDamCoreImplServletCreateAssetServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties1 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties2 = new OASComDayCqDamCoreImplServletCreateA();

        System.assertEquals(false, comDayCqDamCoreImplServletCreateAssetServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletCreateAssetServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties1 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties2 = new OASComDayCqDamCoreImplServletCreateA();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletCreateAssetServletProperties1.equals(comDayCqDamCoreImplServletCreateAssetServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletCreateAssetServletProperties2.equals(comDayCqDamCoreImplServletCreateAssetServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties1 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties2 = new OASComDayCqDamCoreImplServletCreateA();

        System.assertEquals(comDayCqDamCoreImplServletCreateAssetServletProperties1.hashCode(), comDayCqDamCoreImplServletCreateAssetServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletCreateAssetServletProperties2.hashCode(), comDayCqDamCoreImplServletCreateAssetServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties1 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties2 = OASComDayCqDamCoreImplServletCreateA.getExample();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties3 = new OASComDayCqDamCoreImplServletCreateA();
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties4 = new OASComDayCqDamCoreImplServletCreateA();

        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties1.equals(comDayCqDamCoreImplServletCreateAssetServletProperties2));
        System.assert(comDayCqDamCoreImplServletCreateAssetServletProperties3.equals(comDayCqDamCoreImplServletCreateAssetServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletCreateAssetServletProperties1.hashCode(), comDayCqDamCoreImplServletCreateAssetServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletCreateAssetServletProperties3.hashCode(), comDayCqDamCoreImplServletCreateAssetServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletCreateA comDayCqDamCoreImplServletCreateAssetServletProperties = new OASComDayCqDamCoreImplServletCreateA();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletCreateAssetServletProperties.getPropertyMappings();
        System.assertEquals('detectDuplicate', propertyMappings.get('detect_duplicate'));
    }
}
