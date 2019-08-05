@isTest
private class OASComDayCqDamHandlerStandardPdfPdfHTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties1 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties2 = comDayCqDamHandlerStandardPdfPdfHandlerProperties1;
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties3 = new OASComDayCqDamHandlerStandardPdfPdfH();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties4 = comDayCqDamHandlerStandardPdfPdfHandlerProperties3;

        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties1.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties2.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties1.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties3.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties4));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties4.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties3));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties3.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties1 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties2 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties3 = new OASComDayCqDamHandlerStandardPdfPdfH();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties4 = new OASComDayCqDamHandlerStandardPdfPdfH();

        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties1.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties2.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties1));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties3.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties4));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties4.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties1 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties2 = new OASComDayCqDamHandlerStandardPdfPdfH();

        System.assertEquals(false, comDayCqDamHandlerStandardPdfPdfHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamHandlerStandardPdfPdfHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties1 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties2 = new OASComDayCqDamHandlerStandardPdfPdfH();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties3;

        System.assertEquals(false, comDayCqDamHandlerStandardPdfPdfHandlerProperties1.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties3));
        System.assertEquals(false, comDayCqDamHandlerStandardPdfPdfHandlerProperties2.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties1 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties2 = new OASComDayCqDamHandlerStandardPdfPdfH();

        System.assertEquals(comDayCqDamHandlerStandardPdfPdfHandlerProperties1.hashCode(), comDayCqDamHandlerStandardPdfPdfHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamHandlerStandardPdfPdfHandlerProperties2.hashCode(), comDayCqDamHandlerStandardPdfPdfHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties1 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties2 = OASComDayCqDamHandlerStandardPdfPdfH.getExample();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties3 = new OASComDayCqDamHandlerStandardPdfPdfH();
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties4 = new OASComDayCqDamHandlerStandardPdfPdfH();

        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties1.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties2));
        System.assert(comDayCqDamHandlerStandardPdfPdfHandlerProperties3.equals(comDayCqDamHandlerStandardPdfPdfHandlerProperties4));
        System.assertEquals(comDayCqDamHandlerStandardPdfPdfHandlerProperties1.hashCode(), comDayCqDamHandlerStandardPdfPdfHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamHandlerStandardPdfPdfHandlerProperties3.hashCode(), comDayCqDamHandlerStandardPdfPdfHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamHandlerStandardPdfPdfH comDayCqDamHandlerStandardPdfPdfHandlerProperties = new OASComDayCqDamHandlerStandardPdfPdfH();
        Map<String, String> propertyMappings = comDayCqDamHandlerStandardPdfPdfHandlerProperties.getPropertyMappings();
        System.assertEquals('rasterAnnotation', propertyMappings.get('raster.annotation'));
    }
}
