@isTest
private class OASOrgApacheSlingJcrBaseInternalLogiTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2 = orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1;
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3 = new OASOrgApacheSlingJcrBaseInternalLogi();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4 = orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3;

        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3 = new OASOrgApacheSlingJcrBaseInternalLogi();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4 = new OASOrgApacheSlingJcrBaseInternalLogi();

        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2 = new OASOrgApacheSlingJcrBaseInternalLogi();

        System.assertEquals(false, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2 = new OASOrgApacheSlingJcrBaseInternalLogi();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3;

        System.assertEquals(false, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3));
        System.assertEquals(false, orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2 = new OASOrgApacheSlingJcrBaseInternalLogi();

        System.assertEquals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.hashCode(), orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.hashCode(), orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2 = OASOrgApacheSlingJcrBaseInternalLogi.getExample();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3 = new OASOrgApacheSlingJcrBaseInternalLogi();
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4 = new OASOrgApacheSlingJcrBaseInternalLogi();

        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2));
        System.assert(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3.equals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4));
        System.assertEquals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties1.hashCode(), orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties3.hashCode(), orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJcrBaseInternalLogi orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties = new OASOrgApacheSlingJcrBaseInternalLogi();
        Map<String, String> propertyMappings = orgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties.getPropertyMappings();
        System.assertEquals('whitelistName', propertyMappings.get('whitelist.name'));
        System.assertEquals('whitelistBundles', propertyMappings.get('whitelist.bundles'));
    }
}
