@isTest
private class OASOrgApacheJackrabbitOakSecurityIntTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2 = orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1;
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3 = new OASOrgApacheJackrabbitOakSecurityInt();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4 = orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3;

        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3 = new OASOrgApacheJackrabbitOakSecurityInt();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4 = new OASOrgApacheJackrabbitOakSecurityInt();

        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2 = new OASOrgApacheJackrabbitOakSecurityInt();

        System.assertEquals(false, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2 = new OASOrgApacheJackrabbitOakSecurityInt();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2 = new OASOrgApacheJackrabbitOakSecurityInt();

        System.assertEquals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.hashCode(), orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.hashCode(), orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2 = OASOrgApacheJackrabbitOakSecurityInt.getExample();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3 = new OASOrgApacheJackrabbitOakSecurityInt();
        OASOrgApacheJackrabbitOakSecurityInt orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4 = new OASOrgApacheJackrabbitOakSecurityInt();

        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2));
        System.assert(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3.equals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4));
        System.assertEquals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties1.hashCode(), orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties3.hashCode(), orgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties4.hashCode());
    }
}
