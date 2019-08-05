@isTest
private class OASComAdobeGraniteContexthubImplContTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties1 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties2 = comAdobeGraniteContexthubImplContextHubImplProperties1;
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties3 = new OASComAdobeGraniteContexthubImplCont();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties4 = comAdobeGraniteContexthubImplContextHubImplProperties3;

        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties1.equals(comAdobeGraniteContexthubImplContextHubImplProperties2));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties2.equals(comAdobeGraniteContexthubImplContextHubImplProperties1));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties1.equals(comAdobeGraniteContexthubImplContextHubImplProperties1));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties3.equals(comAdobeGraniteContexthubImplContextHubImplProperties4));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties4.equals(comAdobeGraniteContexthubImplContextHubImplProperties3));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties3.equals(comAdobeGraniteContexthubImplContextHubImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties1 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties2 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties3 = new OASComAdobeGraniteContexthubImplCont();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties4 = new OASComAdobeGraniteContexthubImplCont();

        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties1.equals(comAdobeGraniteContexthubImplContextHubImplProperties2));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties2.equals(comAdobeGraniteContexthubImplContextHubImplProperties1));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties3.equals(comAdobeGraniteContexthubImplContextHubImplProperties4));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties4.equals(comAdobeGraniteContexthubImplContextHubImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties1 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties2 = new OASComAdobeGraniteContexthubImplCont();

        System.assertEquals(false, comAdobeGraniteContexthubImplContextHubImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteContexthubImplContextHubImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties1 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties2 = new OASComAdobeGraniteContexthubImplCont();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties3;

        System.assertEquals(false, comAdobeGraniteContexthubImplContextHubImplProperties1.equals(comAdobeGraniteContexthubImplContextHubImplProperties3));
        System.assertEquals(false, comAdobeGraniteContexthubImplContextHubImplProperties2.equals(comAdobeGraniteContexthubImplContextHubImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties1 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties2 = new OASComAdobeGraniteContexthubImplCont();

        System.assertEquals(comAdobeGraniteContexthubImplContextHubImplProperties1.hashCode(), comAdobeGraniteContexthubImplContextHubImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteContexthubImplContextHubImplProperties2.hashCode(), comAdobeGraniteContexthubImplContextHubImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties1 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties2 = OASComAdobeGraniteContexthubImplCont.getExample();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties3 = new OASComAdobeGraniteContexthubImplCont();
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties4 = new OASComAdobeGraniteContexthubImplCont();

        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties1.equals(comAdobeGraniteContexthubImplContextHubImplProperties2));
        System.assert(comAdobeGraniteContexthubImplContextHubImplProperties3.equals(comAdobeGraniteContexthubImplContextHubImplProperties4));
        System.assertEquals(comAdobeGraniteContexthubImplContextHubImplProperties1.hashCode(), comAdobeGraniteContexthubImplContextHubImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteContexthubImplContextHubImplProperties3.hashCode(), comAdobeGraniteContexthubImplContextHubImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteContexthubImplCont comAdobeGraniteContexthubImplContextHubImplProperties = new OASComAdobeGraniteContexthubImplCont();
        Map<String, String> propertyMappings = comAdobeGraniteContexthubImplContextHubImplProperties.getPropertyMappings();
        System.assertEquals('comAdobeGraniteContexthubSilentMode', propertyMappings.get('com.adobe.granite.contexthub.silent_mode'));
        System.assertEquals('comAdobeGraniteContexthubShowUi', propertyMappings.get('com.adobe.granite.contexthub.show_ui'));
    }
}
