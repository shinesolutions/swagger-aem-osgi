@isTest
private class OASComAdobeGraniteFragsImplRandomFeaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties1 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties2 = comAdobeGraniteFragsImplRandomFeatureProperties1;
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties3 = new OASComAdobeGraniteFragsImplRandomFea();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties4 = comAdobeGraniteFragsImplRandomFeatureProperties3;

        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties1.equals(comAdobeGraniteFragsImplRandomFeatureProperties2));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties2.equals(comAdobeGraniteFragsImplRandomFeatureProperties1));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties1.equals(comAdobeGraniteFragsImplRandomFeatureProperties1));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties3.equals(comAdobeGraniteFragsImplRandomFeatureProperties4));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties4.equals(comAdobeGraniteFragsImplRandomFeatureProperties3));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties3.equals(comAdobeGraniteFragsImplRandomFeatureProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties1 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties2 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties3 = new OASComAdobeGraniteFragsImplRandomFea();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties4 = new OASComAdobeGraniteFragsImplRandomFea();

        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties1.equals(comAdobeGraniteFragsImplRandomFeatureProperties2));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties2.equals(comAdobeGraniteFragsImplRandomFeatureProperties1));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties3.equals(comAdobeGraniteFragsImplRandomFeatureProperties4));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties4.equals(comAdobeGraniteFragsImplRandomFeatureProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties1 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties2 = new OASComAdobeGraniteFragsImplRandomFea();

        System.assertEquals(false, comAdobeGraniteFragsImplRandomFeatureProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteFragsImplRandomFeatureProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties1 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties2 = new OASComAdobeGraniteFragsImplRandomFea();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties3;

        System.assertEquals(false, comAdobeGraniteFragsImplRandomFeatureProperties1.equals(comAdobeGraniteFragsImplRandomFeatureProperties3));
        System.assertEquals(false, comAdobeGraniteFragsImplRandomFeatureProperties2.equals(comAdobeGraniteFragsImplRandomFeatureProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties1 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties2 = new OASComAdobeGraniteFragsImplRandomFea();

        System.assertEquals(comAdobeGraniteFragsImplRandomFeatureProperties1.hashCode(), comAdobeGraniteFragsImplRandomFeatureProperties1.hashCode());
        System.assertEquals(comAdobeGraniteFragsImplRandomFeatureProperties2.hashCode(), comAdobeGraniteFragsImplRandomFeatureProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties1 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties2 = OASComAdobeGraniteFragsImplRandomFea.getExample();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties3 = new OASComAdobeGraniteFragsImplRandomFea();
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties4 = new OASComAdobeGraniteFragsImplRandomFea();

        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties1.equals(comAdobeGraniteFragsImplRandomFeatureProperties2));
        System.assert(comAdobeGraniteFragsImplRandomFeatureProperties3.equals(comAdobeGraniteFragsImplRandomFeatureProperties4));
        System.assertEquals(comAdobeGraniteFragsImplRandomFeatureProperties1.hashCode(), comAdobeGraniteFragsImplRandomFeatureProperties2.hashCode());
        System.assertEquals(comAdobeGraniteFragsImplRandomFeatureProperties3.hashCode(), comAdobeGraniteFragsImplRandomFeatureProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteFragsImplRandomFea comAdobeGraniteFragsImplRandomFeatureProperties = new OASComAdobeGraniteFragsImplRandomFea();
        Map<String, String> propertyMappings = comAdobeGraniteFragsImplRandomFeatureProperties.getPropertyMappings();
        System.assertEquals('featureName', propertyMappings.get('feature.name'));
        System.assertEquals('featureDescription', propertyMappings.get('feature.description'));
        System.assertEquals('activePercentage', propertyMappings.get('active.percentage'));
        System.assertEquals('cookieName', propertyMappings.get('cookie.name'));
        System.assertEquals('cookieMaxAge', propertyMappings.get('cookie.maxAge'));
    }
}
