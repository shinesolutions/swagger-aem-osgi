@isTest
private class OASOrgApacheSlingCaconfigResourceImpTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2 = orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1;
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3 = new OASOrgApacheSlingCaconfigResourceImp();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4 = orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3;

        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3 = new OASOrgApacheSlingCaconfigResourceImp();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4 = new OASOrgApacheSlingCaconfigResourceImp();

        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2 = new OASOrgApacheSlingCaconfigResourceImp();

        System.assertEquals(false, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2 = new OASOrgApacheSlingCaconfigResourceImp();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3;

        System.assertEquals(false, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3));
        System.assertEquals(false, orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2 = new OASOrgApacheSlingCaconfigResourceImp();

        System.assertEquals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.hashCode(), orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.hashCode());
        System.assertEquals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.hashCode(), orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2 = OASOrgApacheSlingCaconfigResourceImp.getExample();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3 = new OASOrgApacheSlingCaconfigResourceImp();
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4 = new OASOrgApacheSlingCaconfigResourceImp();

        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2));
        System.assert(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3.equals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4));
        System.assertEquals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties1.hashCode(), orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties2.hashCode());
        System.assertEquals(orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties3.hashCode(), orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingCaconfigResourceImp orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties = new OASOrgApacheSlingCaconfigResourceImp();
        Map<String, String> propertyMappings = orgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
