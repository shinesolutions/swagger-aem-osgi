@isTest
private class OASGuideLocalizationServicePropertieTest {
    @isTest
    private static void equalsSameInstance() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties1 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties2 = guideLocalizationServiceProperties1;
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties3 = new OASGuideLocalizationServicePropertie();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties4 = guideLocalizationServiceProperties3;

        System.assert(guideLocalizationServiceProperties1.equals(guideLocalizationServiceProperties2));
        System.assert(guideLocalizationServiceProperties2.equals(guideLocalizationServiceProperties1));
        System.assert(guideLocalizationServiceProperties1.equals(guideLocalizationServiceProperties1));
        System.assert(guideLocalizationServiceProperties3.equals(guideLocalizationServiceProperties4));
        System.assert(guideLocalizationServiceProperties4.equals(guideLocalizationServiceProperties3));
        System.assert(guideLocalizationServiceProperties3.equals(guideLocalizationServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties1 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties2 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties3 = new OASGuideLocalizationServicePropertie();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties4 = new OASGuideLocalizationServicePropertie();

        System.assert(guideLocalizationServiceProperties1.equals(guideLocalizationServiceProperties2));
        System.assert(guideLocalizationServiceProperties2.equals(guideLocalizationServiceProperties1));
        System.assert(guideLocalizationServiceProperties3.equals(guideLocalizationServiceProperties4));
        System.assert(guideLocalizationServiceProperties4.equals(guideLocalizationServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties1 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties2 = new OASGuideLocalizationServicePropertie();

        System.assertEquals(false, guideLocalizationServiceProperties1.equals('foo'));
        System.assertEquals(false, guideLocalizationServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties1 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties2 = new OASGuideLocalizationServicePropertie();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties3;

        System.assertEquals(false, guideLocalizationServiceProperties1.equals(guideLocalizationServiceProperties3));
        System.assertEquals(false, guideLocalizationServiceProperties2.equals(guideLocalizationServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties1 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties2 = new OASGuideLocalizationServicePropertie();

        System.assertEquals(guideLocalizationServiceProperties1.hashCode(), guideLocalizationServiceProperties1.hashCode());
        System.assertEquals(guideLocalizationServiceProperties2.hashCode(), guideLocalizationServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties1 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties2 = OASGuideLocalizationServicePropertie.getExample();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties3 = new OASGuideLocalizationServicePropertie();
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties4 = new OASGuideLocalizationServicePropertie();

        System.assert(guideLocalizationServiceProperties1.equals(guideLocalizationServiceProperties2));
        System.assert(guideLocalizationServiceProperties3.equals(guideLocalizationServiceProperties4));
        System.assertEquals(guideLocalizationServiceProperties1.hashCode(), guideLocalizationServiceProperties2.hashCode());
        System.assertEquals(guideLocalizationServiceProperties3.hashCode(), guideLocalizationServiceProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGuideLocalizationServicePropertie guideLocalizationServiceProperties = new OASGuideLocalizationServicePropertie();
        Map<String, String> propertyMappings = guideLocalizationServiceProperties.getPropertyMappings();
        System.assertEquals('localizableProperties', propertyMappings.get('Localizable Properties'));
    }
}
