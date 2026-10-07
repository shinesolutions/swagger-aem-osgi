@isTest
private class OASOrgApacheSlingJcrJackrabbitServerTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2 = orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1;
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3 = new OASOrgApacheSlingJcrJackrabbitServer();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4 = orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3;

        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3 = new OASOrgApacheSlingJcrJackrabbitServer();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4 = new OASOrgApacheSlingJcrJackrabbitServer();

        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2 = new OASOrgApacheSlingJcrJackrabbitServer();

        System.assertEquals(false, orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2 = new OASOrgApacheSlingJcrJackrabbitServer();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3;

        System.assertEquals(false, orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3));
        System.assertEquals(false, orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2 = new OASOrgApacheSlingJcrJackrabbitServer();

        System.assertEquals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.hashCode(), orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.hashCode(), orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2 = OASOrgApacheSlingJcrJackrabbitServer.getExample();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3 = new OASOrgApacheSlingJcrJackrabbitServer();
        OASOrgApacheSlingJcrJackrabbitServer orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4 = new OASOrgApacheSlingJcrJackrabbitServer();

        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2));
        System.assert(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3.equals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4));
        System.assertEquals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties1.hashCode(), orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties3.hashCode(), orgApacheSlingJcrJackrabbitServerRmiRegistrationSupportProperties4.hashCode());
    }
}
