@isTest
private class OASOrgApacheSlingDistributionResourcTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2 = orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1;
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3 = new OASOrgApacheSlingDistributionResourc();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4 = orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3;

        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3 = new OASOrgApacheSlingDistributionResourc();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4 = new OASOrgApacheSlingDistributionResourc();

        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2 = new OASOrgApacheSlingDistributionResourc();

        System.assertEquals(false, orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2 = new OASOrgApacheSlingDistributionResourc();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3;

        System.assertEquals(false, orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3));
        System.assertEquals(false, orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2 = new OASOrgApacheSlingDistributionResourc();

        System.assertEquals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.hashCode(), orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.hashCode(), orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2 = OASOrgApacheSlingDistributionResourc.getExample();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3 = new OASOrgApacheSlingDistributionResourc();
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4 = new OASOrgApacheSlingDistributionResourc();

        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2));
        System.assert(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3.equals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4));
        System.assertEquals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties1.hashCode(), orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties3.hashCode(), orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDistributionResourc orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties = new OASOrgApacheSlingDistributionResourc();
        Map<String, String> propertyMappings = orgApacheSlingDistributionResourcesImplDistributionServiceResourProperties.getPropertyMappings();
        System.assertEquals('providerRoots', propertyMappings.get('provider.roots'));
    }
}
