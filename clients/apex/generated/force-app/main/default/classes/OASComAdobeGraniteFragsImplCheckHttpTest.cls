@isTest
private class OASComAdobeGraniteFragsImplCheckHttpTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2 = comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1;
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3 = new OASComAdobeGraniteFragsImplCheckHttp();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4 = comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3;

        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3 = new OASComAdobeGraniteFragsImplCheckHttp();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4 = new OASComAdobeGraniteFragsImplCheckHttp();

        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2 = new OASComAdobeGraniteFragsImplCheckHttp();

        System.assertEquals(false, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2 = new OASComAdobeGraniteFragsImplCheckHttp();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3;

        System.assertEquals(false, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3));
        System.assertEquals(false, comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2 = new OASComAdobeGraniteFragsImplCheckHttp();

        System.assertEquals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.hashCode(), comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.hashCode());
        System.assertEquals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.hashCode(), comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2 = OASComAdobeGraniteFragsImplCheckHttp.getExample();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3 = new OASComAdobeGraniteFragsImplCheckHttp();
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4 = new OASComAdobeGraniteFragsImplCheckHttp();

        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2));
        System.assert(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3.equals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4));
        System.assertEquals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties1.hashCode(), comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties2.hashCode());
        System.assertEquals(comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties3.hashCode(), comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteFragsImplCheckHttp comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties = new OASComAdobeGraniteFragsImplCheckHttp();
        Map<String, String> propertyMappings = comAdobeGraniteFragsImplCheckHttpHeaderFlagProperties.getPropertyMappings();
        System.assertEquals('featureName', propertyMappings.get('feature.name'));
        System.assertEquals('featureDescription', propertyMappings.get('feature.description'));
        System.assertEquals('httpHeaderName', propertyMappings.get('http.header.name'));
        System.assertEquals('httpHeaderValuepattern', propertyMappings.get('http.header.valuepattern'));
    }
}
