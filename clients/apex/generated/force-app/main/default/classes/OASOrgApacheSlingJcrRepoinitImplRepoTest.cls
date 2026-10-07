@isTest
private class OASOrgApacheSlingJcrRepoinitImplRepoTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2 = orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1;
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3 = new OASOrgApacheSlingJcrRepoinitImplRepo();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4 = orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3;

        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3 = new OASOrgApacheSlingJcrRepoinitImplRepo();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4 = new OASOrgApacheSlingJcrRepoinitImplRepo();

        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2 = new OASOrgApacheSlingJcrRepoinitImplRepo();

        System.assertEquals(false, orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2 = new OASOrgApacheSlingJcrRepoinitImplRepo();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3;

        System.assertEquals(false, orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3));
        System.assertEquals(false, orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2 = new OASOrgApacheSlingJcrRepoinitImplRepo();

        System.assertEquals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.hashCode(), orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.hashCode(), orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2 = OASOrgApacheSlingJcrRepoinitImplRepo.getExample();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3 = new OASOrgApacheSlingJcrRepoinitImplRepo();
        OASOrgApacheSlingJcrRepoinitImplRepo orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4 = new OASOrgApacheSlingJcrRepoinitImplRepo();

        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2));
        System.assert(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3.equals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4));
        System.assertEquals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties1.hashCode(), orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties3.hashCode(), orgApacheSlingJcrRepoinitImplRepositoryInitializerProperties4.hashCode());
    }
}
