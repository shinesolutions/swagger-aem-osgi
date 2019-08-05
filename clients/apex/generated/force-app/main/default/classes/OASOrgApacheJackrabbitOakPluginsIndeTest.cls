@isTest
private class OASOrgApacheJackrabbitOakPluginsIndeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2 = orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1;
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3 = new OASOrgApacheJackrabbitOakPluginsInde();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4 = orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3;

        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3 = new OASOrgApacheJackrabbitOakPluginsInde();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4 = new OASOrgApacheJackrabbitOakPluginsInde();

        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2 = new OASOrgApacheJackrabbitOakPluginsInde();

        System.assertEquals(false, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2 = new OASOrgApacheJackrabbitOakPluginsInde();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2 = new OASOrgApacheJackrabbitOakPluginsInde();

        System.assertEquals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.hashCode(), orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.hashCode(), orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2 = OASOrgApacheJackrabbitOakPluginsInde.getExample();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3 = new OASOrgApacheJackrabbitOakPluginsInde();
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4 = new OASOrgApacheJackrabbitOakPluginsInde();

        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2));
        System.assert(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3.equals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4));
        System.assertEquals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties1.hashCode(), orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties3.hashCode(), orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheJackrabbitOakPluginsInde orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties = new OASOrgApacheJackrabbitOakPluginsInde();
        Map<String, String> propertyMappings = orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.getPropertyMappings();
        System.assertEquals('serverType', propertyMappings.get('server.type'));
    }
}
