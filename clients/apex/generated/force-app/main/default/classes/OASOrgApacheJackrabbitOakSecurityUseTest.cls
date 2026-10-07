@isTest
private class OASOrgApacheJackrabbitOakSecurityUseTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2 = orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1;
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3 = new OASOrgApacheJackrabbitOakSecurityUse();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4 = orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3;

        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3 = new OASOrgApacheJackrabbitOakSecurityUse();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4 = new OASOrgApacheJackrabbitOakSecurityUse();

        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2 = new OASOrgApacheJackrabbitOakSecurityUse();

        System.assertEquals(false, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2 = new OASOrgApacheJackrabbitOakSecurityUse();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3;

        System.assertEquals(false, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3));
        System.assertEquals(false, orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2 = new OASOrgApacheJackrabbitOakSecurityUse();

        System.assertEquals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.hashCode(), orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.hashCode(), orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2 = OASOrgApacheJackrabbitOakSecurityUse.getExample();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3 = new OASOrgApacheJackrabbitOakSecurityUse();
        OASOrgApacheJackrabbitOakSecurityUse orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4 = new OASOrgApacheJackrabbitOakSecurityUse();

        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2));
        System.assert(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3.equals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4));
        System.assertEquals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties1.hashCode(), orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties3.hashCode(), orgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties4.hashCode());
    }
}
