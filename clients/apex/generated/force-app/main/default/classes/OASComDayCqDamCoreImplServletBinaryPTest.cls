@isTest
private class OASComDayCqDamCoreImplServletBinaryPTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties1 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties2 = comDayCqDamCoreImplServletBinaryProviderServletProperties1;
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties3 = new OASComDayCqDamCoreImplServletBinaryP();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties4 = comDayCqDamCoreImplServletBinaryProviderServletProperties3;

        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties1.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties2));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties2.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties1));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties1.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties1));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties3.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties4));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties4.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties3));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties3.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties1 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties2 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties3 = new OASComDayCqDamCoreImplServletBinaryP();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties4 = new OASComDayCqDamCoreImplServletBinaryP();

        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties1.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties2));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties2.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties1));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties3.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties4));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties4.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties1 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties2 = new OASComDayCqDamCoreImplServletBinaryP();

        System.assertEquals(false, comDayCqDamCoreImplServletBinaryProviderServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletBinaryProviderServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties1 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties2 = new OASComDayCqDamCoreImplServletBinaryP();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletBinaryProviderServletProperties1.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletBinaryProviderServletProperties2.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties1 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties2 = new OASComDayCqDamCoreImplServletBinaryP();

        System.assertEquals(comDayCqDamCoreImplServletBinaryProviderServletProperties1.hashCode(), comDayCqDamCoreImplServletBinaryProviderServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletBinaryProviderServletProperties2.hashCode(), comDayCqDamCoreImplServletBinaryProviderServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties1 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties2 = OASComDayCqDamCoreImplServletBinaryP.getExample();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties3 = new OASComDayCqDamCoreImplServletBinaryP();
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties4 = new OASComDayCqDamCoreImplServletBinaryP();

        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties1.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties2));
        System.assert(comDayCqDamCoreImplServletBinaryProviderServletProperties3.equals(comDayCqDamCoreImplServletBinaryProviderServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletBinaryProviderServletProperties1.hashCode(), comDayCqDamCoreImplServletBinaryProviderServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletBinaryProviderServletProperties3.hashCode(), comDayCqDamCoreImplServletBinaryProviderServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletBinaryP comDayCqDamCoreImplServletBinaryProviderServletProperties = new OASComDayCqDamCoreImplServletBinaryP();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletBinaryProviderServletProperties.getPropertyMappings();
        System.assertEquals('slingServletResourceTypes', propertyMappings.get('sling.servlet.resourceTypes'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
        System.assertEquals('cqDamDrmEnable', propertyMappings.get('cq.dam.drm.enable'));
    }
}
