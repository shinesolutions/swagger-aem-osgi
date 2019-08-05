@isTest
private class OASComAdobeFormsCommonServletTempCleTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties1 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties2 = comAdobeFormsCommonServletTempCleanUpTaskProperties1;
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties3 = new OASComAdobeFormsCommonServletTempCle();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties4 = comAdobeFormsCommonServletTempCleanUpTaskProperties3;

        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties1.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties2));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties2.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties1));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties1.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties1));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties3.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties4));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties4.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties3));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties3.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties1 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties2 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties3 = new OASComAdobeFormsCommonServletTempCle();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties4 = new OASComAdobeFormsCommonServletTempCle();

        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties1.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties2));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties2.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties1));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties3.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties4));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties4.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties1 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties2 = new OASComAdobeFormsCommonServletTempCle();

        System.assertEquals(false, comAdobeFormsCommonServletTempCleanUpTaskProperties1.equals('foo'));
        System.assertEquals(false, comAdobeFormsCommonServletTempCleanUpTaskProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties1 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties2 = new OASComAdobeFormsCommonServletTempCle();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties3;

        System.assertEquals(false, comAdobeFormsCommonServletTempCleanUpTaskProperties1.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties3));
        System.assertEquals(false, comAdobeFormsCommonServletTempCleanUpTaskProperties2.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties1 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties2 = new OASComAdobeFormsCommonServletTempCle();

        System.assertEquals(comAdobeFormsCommonServletTempCleanUpTaskProperties1.hashCode(), comAdobeFormsCommonServletTempCleanUpTaskProperties1.hashCode());
        System.assertEquals(comAdobeFormsCommonServletTempCleanUpTaskProperties2.hashCode(), comAdobeFormsCommonServletTempCleanUpTaskProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties1 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties2 = OASComAdobeFormsCommonServletTempCle.getExample();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties3 = new OASComAdobeFormsCommonServletTempCle();
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties4 = new OASComAdobeFormsCommonServletTempCle();

        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties1.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties2));
        System.assert(comAdobeFormsCommonServletTempCleanUpTaskProperties3.equals(comAdobeFormsCommonServletTempCleanUpTaskProperties4));
        System.assertEquals(comAdobeFormsCommonServletTempCleanUpTaskProperties1.hashCode(), comAdobeFormsCommonServletTempCleanUpTaskProperties2.hashCode());
        System.assertEquals(comAdobeFormsCommonServletTempCleanUpTaskProperties3.hashCode(), comAdobeFormsCommonServletTempCleanUpTaskProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeFormsCommonServletTempCle comAdobeFormsCommonServletTempCleanUpTaskProperties = new OASComAdobeFormsCommonServletTempCle();
        Map<String, String> propertyMappings = comAdobeFormsCommonServletTempCleanUpTaskProperties.getPropertyMappings();
        System.assertEquals('schedulerExpression', propertyMappings.get('scheduler.expression'));
        System.assertEquals('durationForTemporaryStorage', propertyMappings.get('Duration for Temporary Storage'));
        System.assertEquals('durationForAnonymousStorage', propertyMappings.get('Duration for Anonymous Storage'));
    }
}
