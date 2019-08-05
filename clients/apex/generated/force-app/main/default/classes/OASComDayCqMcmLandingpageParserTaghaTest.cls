@isTest
private class OASComDayCqMcmLandingpageParserTaghaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2 = comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1;
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3 = new OASComDayCqMcmLandingpageParserTagha();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4 = comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3;

        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3 = new OASComDayCqMcmLandingpageParserTagha();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4 = new OASComDayCqMcmLandingpageParserTagha();

        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2 = new OASComDayCqMcmLandingpageParserTagha();

        System.assertEquals(false, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.equals('foo'));
        System.assertEquals(false, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2 = new OASComDayCqMcmLandingpageParserTagha();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3;

        System.assertEquals(false, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3));
        System.assertEquals(false, comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2 = new OASComDayCqMcmLandingpageParserTagha();

        System.assertEquals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.hashCode(), comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.hashCode());
        System.assertEquals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.hashCode(), comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2 = OASComDayCqMcmLandingpageParserTagha.getExample();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3 = new OASComDayCqMcmLandingpageParserTagha();
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4 = new OASComDayCqMcmLandingpageParserTagha();

        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2));
        System.assert(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3.equals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4));
        System.assertEquals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties1.hashCode(), comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties2.hashCode());
        System.assertEquals(comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties3.hashCode(), comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqMcmLandingpageParserTagha comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties = new OASComDayCqMcmLandingpageParserTagha();
        Map<String, String> propertyMappings = comDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('componentResourceType', propertyMappings.get('component.resourceType'));
    }
}
