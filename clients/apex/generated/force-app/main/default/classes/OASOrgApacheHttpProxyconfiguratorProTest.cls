@isTest
private class OASOrgApacheHttpProxyconfiguratorProTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties1 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties2 = orgApacheHttpProxyconfiguratorProperties1;
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties3 = new OASOrgApacheHttpProxyconfiguratorPro();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties4 = orgApacheHttpProxyconfiguratorProperties3;

        System.assert(orgApacheHttpProxyconfiguratorProperties1.equals(orgApacheHttpProxyconfiguratorProperties2));
        System.assert(orgApacheHttpProxyconfiguratorProperties2.equals(orgApacheHttpProxyconfiguratorProperties1));
        System.assert(orgApacheHttpProxyconfiguratorProperties1.equals(orgApacheHttpProxyconfiguratorProperties1));
        System.assert(orgApacheHttpProxyconfiguratorProperties3.equals(orgApacheHttpProxyconfiguratorProperties4));
        System.assert(orgApacheHttpProxyconfiguratorProperties4.equals(orgApacheHttpProxyconfiguratorProperties3));
        System.assert(orgApacheHttpProxyconfiguratorProperties3.equals(orgApacheHttpProxyconfiguratorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties1 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties2 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties3 = new OASOrgApacheHttpProxyconfiguratorPro();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties4 = new OASOrgApacheHttpProxyconfiguratorPro();

        System.assert(orgApacheHttpProxyconfiguratorProperties1.equals(orgApacheHttpProxyconfiguratorProperties2));
        System.assert(orgApacheHttpProxyconfiguratorProperties2.equals(orgApacheHttpProxyconfiguratorProperties1));
        System.assert(orgApacheHttpProxyconfiguratorProperties3.equals(orgApacheHttpProxyconfiguratorProperties4));
        System.assert(orgApacheHttpProxyconfiguratorProperties4.equals(orgApacheHttpProxyconfiguratorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties1 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties2 = new OASOrgApacheHttpProxyconfiguratorPro();

        System.assertEquals(false, orgApacheHttpProxyconfiguratorProperties1.equals('foo'));
        System.assertEquals(false, orgApacheHttpProxyconfiguratorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties1 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties2 = new OASOrgApacheHttpProxyconfiguratorPro();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties3;

        System.assertEquals(false, orgApacheHttpProxyconfiguratorProperties1.equals(orgApacheHttpProxyconfiguratorProperties3));
        System.assertEquals(false, orgApacheHttpProxyconfiguratorProperties2.equals(orgApacheHttpProxyconfiguratorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties1 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties2 = new OASOrgApacheHttpProxyconfiguratorPro();

        System.assertEquals(orgApacheHttpProxyconfiguratorProperties1.hashCode(), orgApacheHttpProxyconfiguratorProperties1.hashCode());
        System.assertEquals(orgApacheHttpProxyconfiguratorProperties2.hashCode(), orgApacheHttpProxyconfiguratorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties1 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties2 = OASOrgApacheHttpProxyconfiguratorPro.getExample();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties3 = new OASOrgApacheHttpProxyconfiguratorPro();
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties4 = new OASOrgApacheHttpProxyconfiguratorPro();

        System.assert(orgApacheHttpProxyconfiguratorProperties1.equals(orgApacheHttpProxyconfiguratorProperties2));
        System.assert(orgApacheHttpProxyconfiguratorProperties3.equals(orgApacheHttpProxyconfiguratorProperties4));
        System.assertEquals(orgApacheHttpProxyconfiguratorProperties1.hashCode(), orgApacheHttpProxyconfiguratorProperties2.hashCode());
        System.assertEquals(orgApacheHttpProxyconfiguratorProperties3.hashCode(), orgApacheHttpProxyconfiguratorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheHttpProxyconfiguratorPro orgApacheHttpProxyconfiguratorProperties = new OASOrgApacheHttpProxyconfiguratorPro();
        Map<String, String> propertyMappings = orgApacheHttpProxyconfiguratorProperties.getPropertyMappings();
        System.assertEquals('proxyEnabled', propertyMappings.get('proxy.enabled'));
        System.assertEquals('proxyHost', propertyMappings.get('proxy.host'));
        System.assertEquals('proxyPort', propertyMappings.get('proxy.port'));
        System.assertEquals('proxyUser', propertyMappings.get('proxy.user'));
        System.assertEquals('proxyPassword', propertyMappings.get('proxy.password'));
        System.assertEquals('proxyExceptions', propertyMappings.get('proxy.exceptions'));
    }
}
