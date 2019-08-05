@isTest
private class OASOrgApacheJackrabbitVaultPackagingTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2 = orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1;
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3 = new OASOrgApacheJackrabbitVaultPackaging();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4 = orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3;

        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3 = new OASOrgApacheJackrabbitVaultPackaging();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4 = new OASOrgApacheJackrabbitVaultPackaging();

        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2 = new OASOrgApacheJackrabbitVaultPackaging();

        System.assertEquals(false, orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.equals('foo'));
        System.assertEquals(false, orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2 = new OASOrgApacheJackrabbitVaultPackaging();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3;

        System.assertEquals(false, orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3));
        System.assertEquals(false, orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2 = new OASOrgApacheJackrabbitVaultPackaging();

        System.assertEquals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.hashCode(), orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.hashCode());
        System.assertEquals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.hashCode(), orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2 = OASOrgApacheJackrabbitVaultPackaging.getExample();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3 = new OASOrgApacheJackrabbitVaultPackaging();
        OASOrgApacheJackrabbitVaultPackaging orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4 = new OASOrgApacheJackrabbitVaultPackaging();

        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2));
        System.assert(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3.equals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4));
        System.assertEquals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties1.hashCode(), orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties2.hashCode());
        System.assertEquals(orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties3.hashCode(), orgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties4.hashCode());
    }
}
