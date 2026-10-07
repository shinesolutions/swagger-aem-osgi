@isTest
private class OASOrgApacheJackrabbitOakQueryQueryETest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2 = orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1;
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3 = new OASOrgApacheJackrabbitOakQueryQueryE();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4 = orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3;

        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3 = new OASOrgApacheJackrabbitOakQueryQueryE();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4 = new OASOrgApacheJackrabbitOakQueryQueryE();

        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2 = new OASOrgApacheJackrabbitOakQueryQueryE();

        System.assertEquals(false, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2 = new OASOrgApacheJackrabbitOakQueryQueryE();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2 = new OASOrgApacheJackrabbitOakQueryQueryE();

        System.assertEquals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.hashCode(), orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.hashCode(), orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2 = OASOrgApacheJackrabbitOakQueryQueryE.getExample();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3 = new OASOrgApacheJackrabbitOakQueryQueryE();
        OASOrgApacheJackrabbitOakQueryQueryE orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4 = new OASOrgApacheJackrabbitOakQueryQueryE();

        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2));
        System.assert(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3.equals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4));
        System.assertEquals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties1.hashCode(), orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties3.hashCode(), orgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties4.hashCode());
    }
}
