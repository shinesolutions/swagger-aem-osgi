@isTest
private class OASComDayCqDamCoreImplLightboxLightbTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties1 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties2 = comDayCqDamCoreImplLightboxLightboxServletProperties1;
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties3 = new OASComDayCqDamCoreImplLightboxLightb();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties4 = comDayCqDamCoreImplLightboxLightboxServletProperties3;

        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties1.equals(comDayCqDamCoreImplLightboxLightboxServletProperties2));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties2.equals(comDayCqDamCoreImplLightboxLightboxServletProperties1));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties1.equals(comDayCqDamCoreImplLightboxLightboxServletProperties1));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties3.equals(comDayCqDamCoreImplLightboxLightboxServletProperties4));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties4.equals(comDayCqDamCoreImplLightboxLightboxServletProperties3));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties3.equals(comDayCqDamCoreImplLightboxLightboxServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties1 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties2 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties3 = new OASComDayCqDamCoreImplLightboxLightb();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties4 = new OASComDayCqDamCoreImplLightboxLightb();

        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties1.equals(comDayCqDamCoreImplLightboxLightboxServletProperties2));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties2.equals(comDayCqDamCoreImplLightboxLightboxServletProperties1));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties3.equals(comDayCqDamCoreImplLightboxLightboxServletProperties4));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties4.equals(comDayCqDamCoreImplLightboxLightboxServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties1 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties2 = new OASComDayCqDamCoreImplLightboxLightb();

        System.assertEquals(false, comDayCqDamCoreImplLightboxLightboxServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplLightboxLightboxServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties1 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties2 = new OASComDayCqDamCoreImplLightboxLightb();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplLightboxLightboxServletProperties1.equals(comDayCqDamCoreImplLightboxLightboxServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplLightboxLightboxServletProperties2.equals(comDayCqDamCoreImplLightboxLightboxServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties1 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties2 = new OASComDayCqDamCoreImplLightboxLightb();

        System.assertEquals(comDayCqDamCoreImplLightboxLightboxServletProperties1.hashCode(), comDayCqDamCoreImplLightboxLightboxServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplLightboxLightboxServletProperties2.hashCode(), comDayCqDamCoreImplLightboxLightboxServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties1 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties2 = OASComDayCqDamCoreImplLightboxLightb.getExample();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties3 = new OASComDayCqDamCoreImplLightboxLightb();
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties4 = new OASComDayCqDamCoreImplLightboxLightb();

        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties1.equals(comDayCqDamCoreImplLightboxLightboxServletProperties2));
        System.assert(comDayCqDamCoreImplLightboxLightboxServletProperties3.equals(comDayCqDamCoreImplLightboxLightboxServletProperties4));
        System.assertEquals(comDayCqDamCoreImplLightboxLightboxServletProperties1.hashCode(), comDayCqDamCoreImplLightboxLightboxServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplLightboxLightboxServletProperties3.hashCode(), comDayCqDamCoreImplLightboxLightboxServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplLightboxLightb comDayCqDamCoreImplLightboxLightboxServletProperties = new OASComDayCqDamCoreImplLightboxLightb();
        Map<String, String> propertyMappings = comDayCqDamCoreImplLightboxLightboxServletProperties.getPropertyMappings();
        System.assertEquals('slingServletPaths', propertyMappings.get('sling.servlet.paths'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
        System.assertEquals('cqDamEnableAnonymous', propertyMappings.get('cq.dam.enable.anonymous'));
    }
}
