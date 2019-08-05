@isTest
private class OASOrgApacheSlingJcrRepoinitRepositoTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties2 = orgApacheSlingJcrRepoinitRepositoryInitializerProperties1;
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties3 = new OASOrgApacheSlingJcrRepoinitReposito();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties4 = orgApacheSlingJcrRepoinitRepositoryInitializerProperties3;

        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties2));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties4));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties4.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties2 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties3 = new OASOrgApacheSlingJcrRepoinitReposito();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties4 = new OASOrgApacheSlingJcrRepoinitReposito();

        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties2));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties4));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties4.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties2 = new OASOrgApacheSlingJcrRepoinitReposito();

        System.assertEquals(false, orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties2 = new OASOrgApacheSlingJcrRepoinitReposito();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties3;

        System.assertEquals(false, orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3));
        System.assertEquals(false, orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties2 = new OASOrgApacheSlingJcrRepoinitReposito();

        System.assertEquals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.hashCode(), orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.hashCode(), orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties2 = OASOrgApacheSlingJcrRepoinitReposito.getExample();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties3 = new OASOrgApacheSlingJcrRepoinitReposito();
        OASOrgApacheSlingJcrRepoinitReposito orgApacheSlingJcrRepoinitRepositoryInitializerProperties4 = new OASOrgApacheSlingJcrRepoinitReposito();

        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties2));
        System.assert(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties4));
        System.assertEquals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties1.hashCode(), orgApacheSlingJcrRepoinitRepositoryInitializerProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrRepoinitRepositoryInitializerProperties3.hashCode(), orgApacheSlingJcrRepoinitRepositoryInitializerProperties4.hashCode());
    }
}
