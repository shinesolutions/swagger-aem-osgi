@isTest
private class OASOrgApacheJackrabbitOakPluginsDocuTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2 = orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1;
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3 = new OASOrgApacheJackrabbitOakPluginsDocu();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4 = orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3;

        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3 = new OASOrgApacheJackrabbitOakPluginsDocu();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4 = new OASOrgApacheJackrabbitOakPluginsDocu();

        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2 = new OASOrgApacheJackrabbitOakPluginsDocu();

        System.assertEquals(false, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2 = new OASOrgApacheJackrabbitOakPluginsDocu();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2 = new OASOrgApacheJackrabbitOakPluginsDocu();

        System.assertEquals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.hashCode(), orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.hashCode(), orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2 = OASOrgApacheJackrabbitOakPluginsDocu.getExample();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3 = new OASOrgApacheJackrabbitOakPluginsDocu();
        OASOrgApacheJackrabbitOakPluginsDocu orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4 = new OASOrgApacheJackrabbitOakPluginsDocu();

        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2));
        System.assert(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3.equals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4));
        System.assertEquals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties1.hashCode(), orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties3.hashCode(), orgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties4.hashCode());
    }
}
