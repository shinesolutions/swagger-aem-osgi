@isTest
private class OASOrgApacheSlingHcCoreImplCompositeTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties2 = orgApacheSlingHcCoreImplCompositeHealthCheckProperties1;
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplComposite();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties4 = orgApacheSlingHcCoreImplCompositeHealthCheckProperties3;

        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties4));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties4.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties2 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplComposite();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties4 = new OASOrgApacheSlingHcCoreImplComposite();

        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties4));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties4.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplComposite();

        System.assertEquals(false, orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplComposite();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties3;

        System.assertEquals(false, orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3));
        System.assertEquals(false, orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties2 = new OASOrgApacheSlingHcCoreImplComposite();

        System.assertEquals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.hashCode(), orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.hashCode(), orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties1 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties2 = OASOrgApacheSlingHcCoreImplComposite.getExample();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties3 = new OASOrgApacheSlingHcCoreImplComposite();
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties4 = new OASOrgApacheSlingHcCoreImplComposite();

        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties2));
        System.assert(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3.equals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties4));
        System.assertEquals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties1.hashCode(), orgApacheSlingHcCoreImplCompositeHealthCheckProperties2.hashCode());
        System.assertEquals(orgApacheSlingHcCoreImplCompositeHealthCheckProperties3.hashCode(), orgApacheSlingHcCoreImplCompositeHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingHcCoreImplComposite orgApacheSlingHcCoreImplCompositeHealthCheckProperties = new OASOrgApacheSlingHcCoreImplComposite();
        Map<String, String> x-property-mappings = orgApacheSlingHcCoreImplCompositeHealthCheckProperties.getx-property-mappings();
        System.assertEquals('hcName', x-property-mappings.get('hc.name'));
        System.assertEquals('hcTags', x-property-mappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', x-property-mappings.get('hc.mbean.name'));
        System.assertEquals('filterTags', x-property-mappings.get('filter.tags'));
        System.assertEquals('filterCombineTagsWithOr', x-property-mappings.get('filter.combineTagsWithOr'));
    }
}
