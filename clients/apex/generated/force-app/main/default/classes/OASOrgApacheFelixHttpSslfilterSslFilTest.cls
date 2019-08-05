@isTest
private class OASOrgApacheFelixHttpSslfilterSslFilTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties1 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties2 = orgApacheFelixHttpSslfilterSslFilterProperties1;
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties3 = new OASOrgApacheFelixHttpSslfilterSslFil();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties4 = orgApacheFelixHttpSslfilterSslFilterProperties3;

        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties1.equals(orgApacheFelixHttpSslfilterSslFilterProperties2));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties2.equals(orgApacheFelixHttpSslfilterSslFilterProperties1));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties1.equals(orgApacheFelixHttpSslfilterSslFilterProperties1));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties3.equals(orgApacheFelixHttpSslfilterSslFilterProperties4));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties4.equals(orgApacheFelixHttpSslfilterSslFilterProperties3));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties3.equals(orgApacheFelixHttpSslfilterSslFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties1 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties2 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties3 = new OASOrgApacheFelixHttpSslfilterSslFil();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties4 = new OASOrgApacheFelixHttpSslfilterSslFil();

        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties1.equals(orgApacheFelixHttpSslfilterSslFilterProperties2));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties2.equals(orgApacheFelixHttpSslfilterSslFilterProperties1));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties3.equals(orgApacheFelixHttpSslfilterSslFilterProperties4));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties4.equals(orgApacheFelixHttpSslfilterSslFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties1 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties2 = new OASOrgApacheFelixHttpSslfilterSslFil();

        System.assertEquals(false, orgApacheFelixHttpSslfilterSslFilterProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixHttpSslfilterSslFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties1 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties2 = new OASOrgApacheFelixHttpSslfilterSslFil();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties3;

        System.assertEquals(false, orgApacheFelixHttpSslfilterSslFilterProperties1.equals(orgApacheFelixHttpSslfilterSslFilterProperties3));
        System.assertEquals(false, orgApacheFelixHttpSslfilterSslFilterProperties2.equals(orgApacheFelixHttpSslfilterSslFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties1 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties2 = new OASOrgApacheFelixHttpSslfilterSslFil();

        System.assertEquals(orgApacheFelixHttpSslfilterSslFilterProperties1.hashCode(), orgApacheFelixHttpSslfilterSslFilterProperties1.hashCode());
        System.assertEquals(orgApacheFelixHttpSslfilterSslFilterProperties2.hashCode(), orgApacheFelixHttpSslfilterSslFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties1 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties2 = OASOrgApacheFelixHttpSslfilterSslFil.getExample();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties3 = new OASOrgApacheFelixHttpSslfilterSslFil();
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties4 = new OASOrgApacheFelixHttpSslfilterSslFil();

        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties1.equals(orgApacheFelixHttpSslfilterSslFilterProperties2));
        System.assert(orgApacheFelixHttpSslfilterSslFilterProperties3.equals(orgApacheFelixHttpSslfilterSslFilterProperties4));
        System.assertEquals(orgApacheFelixHttpSslfilterSslFilterProperties1.hashCode(), orgApacheFelixHttpSslfilterSslFilterProperties2.hashCode());
        System.assertEquals(orgApacheFelixHttpSslfilterSslFilterProperties3.hashCode(), orgApacheFelixHttpSslfilterSslFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixHttpSslfilterSslFil orgApacheFelixHttpSslfilterSslFilterProperties = new OASOrgApacheFelixHttpSslfilterSslFil();
        Map<String, String> propertyMappings = orgApacheFelixHttpSslfilterSslFilterProperties.getPropertyMappings();
        System.assertEquals('sslForwardHeader', propertyMappings.get('ssl-forward.header'));
        System.assertEquals('sslForwardValue', propertyMappings.get('ssl-forward.value'));
        System.assertEquals('sslForwardCertHeader', propertyMappings.get('ssl-forward-cert.header'));
        System.assertEquals('rewriteAbsoluteUrls', propertyMappings.get('rewrite.absolute.urls'));
    }
}
