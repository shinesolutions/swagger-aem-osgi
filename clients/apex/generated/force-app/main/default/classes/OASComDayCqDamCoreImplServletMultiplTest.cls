@isTest
private class OASComDayCqDamCoreImplServletMultiplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2 = comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1;
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3 = new OASComDayCqDamCoreImplServletMultipl();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4 = comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3;

        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3 = new OASComDayCqDamCoreImplServletMultipl();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4 = new OASComDayCqDamCoreImplServletMultipl();

        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2 = new OASComDayCqDamCoreImplServletMultipl();

        System.assertEquals(false, comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2 = new OASComDayCqDamCoreImplServletMultipl();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2 = new OASComDayCqDamCoreImplServletMultipl();

        System.assertEquals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.hashCode(), comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.hashCode(), comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2 = OASComDayCqDamCoreImplServletMultipl.getExample();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3 = new OASComDayCqDamCoreImplServletMultipl();
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4 = new OASComDayCqDamCoreImplServletMultipl();

        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2));
        System.assert(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3.equals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties1.hashCode(), comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties3.hashCode(), comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletMultipl comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties = new OASComDayCqDamCoreImplServletMultipl();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties.getPropertyMappings();
        System.assertEquals('cqDamDrmEnable', propertyMappings.get('cq.dam.drm.enable'));
    }
}
