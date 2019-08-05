@isTest
private class OASOrgApacheSlingExtensionsWebconsolTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2 = orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1;
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3 = new OASOrgApacheSlingExtensionsWebconsol();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4 = orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3;

        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3 = new OASOrgApacheSlingExtensionsWebconsol();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4 = new OASOrgApacheSlingExtensionsWebconsol();

        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2 = new OASOrgApacheSlingExtensionsWebconsol();

        System.assertEquals(false, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2 = new OASOrgApacheSlingExtensionsWebconsol();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3;

        System.assertEquals(false, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3));
        System.assertEquals(false, orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2 = new OASOrgApacheSlingExtensionsWebconsol();

        System.assertEquals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.hashCode(), orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.hashCode());
        System.assertEquals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.hashCode(), orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2 = OASOrgApacheSlingExtensionsWebconsol.getExample();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3 = new OASOrgApacheSlingExtensionsWebconsol();
        OASOrgApacheSlingExtensionsWebconsol orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4 = new OASOrgApacheSlingExtensionsWebconsol();

        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2));
        System.assert(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3.equals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4));
        System.assertEquals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties1.hashCode(), orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties2.hashCode());
        System.assertEquals(orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties3.hashCode(), orgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties4.hashCode());
    }
}
