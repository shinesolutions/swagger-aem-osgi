@isTest
private class OASComDayCqDamHandlerStandardPsPostSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties1 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties2 = comDayCqDamHandlerStandardPsPostScriptHandlerProperties1;
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties3 = new OASComDayCqDamHandlerStandardPsPostS();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties4 = comDayCqDamHandlerStandardPsPostScriptHandlerProperties3;

        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties4));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties4.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties1 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties2 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties3 = new OASComDayCqDamHandlerStandardPsPostS();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties4 = new OASComDayCqDamHandlerStandardPsPostS();

        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties4));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties4.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties1 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties2 = new OASComDayCqDamHandlerStandardPsPostS();

        System.assertEquals(false, comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties1 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties2 = new OASComDayCqDamHandlerStandardPsPostS();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties3;

        System.assertEquals(false, comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3));
        System.assertEquals(false, comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties1 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties2 = new OASComDayCqDamHandlerStandardPsPostS();

        System.assertEquals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.hashCode(), comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.hashCode(), comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties1 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties2 = OASComDayCqDamHandlerStandardPsPostS.getExample();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties3 = new OASComDayCqDamHandlerStandardPsPostS();
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties4 = new OASComDayCqDamHandlerStandardPsPostS();

        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3.equals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties4));
        System.assertEquals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties1.hashCode(), comDayCqDamHandlerStandardPsPostScriptHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamHandlerStandardPsPostScriptHandlerProperties3.hashCode(), comDayCqDamHandlerStandardPsPostScriptHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamHandlerStandardPsPostS comDayCqDamHandlerStandardPsPostScriptHandlerProperties = new OASComDayCqDamHandlerStandardPsPostS();
        Map<String, String> propertyMappings = comDayCqDamHandlerStandardPsPostScriptHandlerProperties.getPropertyMappings();
        System.assertEquals('rasterAnnotation', propertyMappings.get('raster.annotation'));
    }
}
