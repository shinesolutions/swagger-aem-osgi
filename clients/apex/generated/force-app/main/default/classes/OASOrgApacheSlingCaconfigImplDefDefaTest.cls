@isTest
private class OASOrgApacheSlingCaconfigImplDefDefaTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2 = orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1;
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3 = new OASOrgApacheSlingCaconfigImplDefDefa();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4 = orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3;

        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3 = new OASOrgApacheSlingCaconfigImplDefDefa();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4 = new OASOrgApacheSlingCaconfigImplDefDefa();

        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2 = new OASOrgApacheSlingCaconfigImplDefDefa();

        System.assertEquals(false, orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2 = new OASOrgApacheSlingCaconfigImplDefDefa();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3;

        System.assertEquals(false, orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3));
        System.assertEquals(false, orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2 = new OASOrgApacheSlingCaconfigImplDefDefa();

        System.assertEquals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.hashCode(), orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.hashCode());
        System.assertEquals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.hashCode(), orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2 = OASOrgApacheSlingCaconfigImplDefDefa.getExample();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3 = new OASOrgApacheSlingCaconfigImplDefDefa();
        OASOrgApacheSlingCaconfigImplDefDefa orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4 = new OASOrgApacheSlingCaconfigImplDefDefa();

        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2));
        System.assert(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3.equals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4));
        System.assertEquals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties1.hashCode(), orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties2.hashCode());
        System.assertEquals(orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties3.hashCode(), orgApacheSlingCaconfigImplDefDefaultConfigurationPersistenceStraProperties4.hashCode());
    }
}
