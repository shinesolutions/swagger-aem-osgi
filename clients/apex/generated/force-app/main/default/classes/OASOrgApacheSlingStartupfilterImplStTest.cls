@isTest
private class OASOrgApacheSlingStartupfilterImplStTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties1 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties2 = orgApacheSlingStartupfilterImplStartupFilterImplProperties1;
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties3 = new OASOrgApacheSlingStartupfilterImplSt();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties4 = orgApacheSlingStartupfilterImplStartupFilterImplProperties3;

        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties1.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties2));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties2.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties1));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties1.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties1));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties3.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties4));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties4.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties3));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties3.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties1 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties2 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties3 = new OASOrgApacheSlingStartupfilterImplSt();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties4 = new OASOrgApacheSlingStartupfilterImplSt();

        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties1.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties2));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties2.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties1));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties3.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties4));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties4.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties1 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties2 = new OASOrgApacheSlingStartupfilterImplSt();

        System.assertEquals(false, orgApacheSlingStartupfilterImplStartupFilterImplProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingStartupfilterImplStartupFilterImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties1 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties2 = new OASOrgApacheSlingStartupfilterImplSt();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties3;

        System.assertEquals(false, orgApacheSlingStartupfilterImplStartupFilterImplProperties1.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties3));
        System.assertEquals(false, orgApacheSlingStartupfilterImplStartupFilterImplProperties2.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties1 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties2 = new OASOrgApacheSlingStartupfilterImplSt();

        System.assertEquals(orgApacheSlingStartupfilterImplStartupFilterImplProperties1.hashCode(), orgApacheSlingStartupfilterImplStartupFilterImplProperties1.hashCode());
        System.assertEquals(orgApacheSlingStartupfilterImplStartupFilterImplProperties2.hashCode(), orgApacheSlingStartupfilterImplStartupFilterImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties1 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties2 = OASOrgApacheSlingStartupfilterImplSt.getExample();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties3 = new OASOrgApacheSlingStartupfilterImplSt();
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties4 = new OASOrgApacheSlingStartupfilterImplSt();

        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties1.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties2));
        System.assert(orgApacheSlingStartupfilterImplStartupFilterImplProperties3.equals(orgApacheSlingStartupfilterImplStartupFilterImplProperties4));
        System.assertEquals(orgApacheSlingStartupfilterImplStartupFilterImplProperties1.hashCode(), orgApacheSlingStartupfilterImplStartupFilterImplProperties2.hashCode());
        System.assertEquals(orgApacheSlingStartupfilterImplStartupFilterImplProperties3.hashCode(), orgApacheSlingStartupfilterImplStartupFilterImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingStartupfilterImplSt orgApacheSlingStartupfilterImplStartupFilterImplProperties = new OASOrgApacheSlingStartupfilterImplSt();
        Map<String, String> propertyMappings = orgApacheSlingStartupfilterImplStartupFilterImplProperties.getPropertyMappings();
        System.assertEquals('activeByDefault', propertyMappings.get('active.by.default'));
        System.assertEquals('defaultMessage', propertyMappings.get('default.message'));
    }
}
