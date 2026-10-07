@isTest
private class OASOrgApacheJackrabbitOakPluginsBlobTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2 = orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1;
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3 = new OASOrgApacheJackrabbitOakPluginsBlob();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4 = orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3;

        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3 = new OASOrgApacheJackrabbitOakPluginsBlob();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4 = new OASOrgApacheJackrabbitOakPluginsBlob();

        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2 = new OASOrgApacheJackrabbitOakPluginsBlob();

        System.assertEquals(false, orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2 = new OASOrgApacheJackrabbitOakPluginsBlob();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2 = new OASOrgApacheJackrabbitOakPluginsBlob();

        System.assertEquals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.hashCode(), orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.hashCode(), orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2 = OASOrgApacheJackrabbitOakPluginsBlob.getExample();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3 = new OASOrgApacheJackrabbitOakPluginsBlob();
        OASOrgApacheJackrabbitOakPluginsBlob orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4 = new OASOrgApacheJackrabbitOakPluginsBlob();

        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2));
        System.assert(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3.equals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4));
        System.assertEquals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties1.hashCode(), orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties3.hashCode(), orgApacheJackrabbitOakPluginsBlobDatastoreFileDataStoreProperties4.hashCode());
    }
}
