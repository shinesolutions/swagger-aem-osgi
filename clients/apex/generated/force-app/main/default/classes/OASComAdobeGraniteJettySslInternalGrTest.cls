@isTest
private class OASComAdobeGraniteJettySslInternalGrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2 = comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1;
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3 = new OASComAdobeGraniteJettySslInternalGr();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4 = comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3;

        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3 = new OASComAdobeGraniteJettySslInternalGr();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4 = new OASComAdobeGraniteJettySslInternalGr();

        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2 = new OASComAdobeGraniteJettySslInternalGr();

        System.assertEquals(false, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2 = new OASComAdobeGraniteJettySslInternalGr();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3;

        System.assertEquals(false, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3));
        System.assertEquals(false, comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2 = new OASComAdobeGraniteJettySslInternalGr();

        System.assertEquals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.hashCode(), comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.hashCode());
        System.assertEquals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.hashCode(), comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2 = OASComAdobeGraniteJettySslInternalGr.getExample();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3 = new OASComAdobeGraniteJettySslInternalGr();
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4 = new OASComAdobeGraniteJettySslInternalGr();

        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2));
        System.assert(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3.equals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4));
        System.assertEquals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties1.hashCode(), comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties2.hashCode());
        System.assertEquals(comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties3.hashCode(), comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteJettySslInternalGr comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties = new OASComAdobeGraniteJettySslInternalGr();
        Map<String, String> x-property-mappings = comAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.getx-property-mappings();
        System.assertEquals('comAdobeGraniteJettySslPort', x-property-mappings.get('com.adobe.granite.jetty.ssl.port'));
        System.assertEquals('comAdobeGraniteJettySslKeystoreUser', x-property-mappings.get('com.adobe.granite.jetty.ssl.keystore.user'));
        System.assertEquals('comAdobeGraniteJettySslKeystorePassword', x-property-mappings.get('com.adobe.granite.jetty.ssl.keystore.password'));
        System.assertEquals('comAdobeGraniteJettySslCiphersuitesExcluded', x-property-mappings.get('com.adobe.granite.jetty.ssl.ciphersuites.excluded'));
        System.assertEquals('comAdobeGraniteJettySslCiphersuitesIncluded', x-property-mappings.get('com.adobe.granite.jetty.ssl.ciphersuites.included'));
        System.assertEquals('comAdobeGraniteJettySslClientCertificate', x-property-mappings.get('com.adobe.granite.jetty.ssl.client.certificate'));
    }
}
