@isTest
private class OASOrgApacheSlingDistributionSerialiTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2 = orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1;
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3 = new OASOrgApacheSlingDistributionSeriali();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4 = orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3;

        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3 = new OASOrgApacheSlingDistributionSeriali();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4 = new OASOrgApacheSlingDistributionSeriali();

        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2 = new OASOrgApacheSlingDistributionSeriali();

        System.assertEquals(false, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2 = new OASOrgApacheSlingDistributionSeriali();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3;

        System.assertEquals(false, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3));
        System.assertEquals(false, orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2 = new OASOrgApacheSlingDistributionSeriali();

        System.assertEquals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.hashCode(), orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.hashCode(), orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2 = OASOrgApacheSlingDistributionSeriali.getExample();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3 = new OASOrgApacheSlingDistributionSeriali();
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4 = new OASOrgApacheSlingDistributionSeriali();

        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2));
        System.assert(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3.equals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4));
        System.assertEquals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties1.hashCode(), orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties3.hashCode(), orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDistributionSeriali orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties = new OASOrgApacheSlingDistributionSeriali();
        Map<String, String> propertyMappings = orgApacheSlingDistributionSerializationImplVltVaultDistributionProperties.getPropertyMappings();
        System.assertEquals('r_type', propertyMappings.get('type'));
        System.assertEquals('packageRoots', propertyMappings.get('package.roots'));
        System.assertEquals('packageFilters', propertyMappings.get('package.filters'));
        System.assertEquals('propertyFilters', propertyMappings.get('property.filters'));
    }
}
