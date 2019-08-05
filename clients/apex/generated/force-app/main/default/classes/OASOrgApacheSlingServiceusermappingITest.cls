@isTest
private class OASOrgApacheSlingServiceusermappingITest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2 = orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1;
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3 = new OASOrgApacheSlingServiceusermappingI();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4 = orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3;

        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3 = new OASOrgApacheSlingServiceusermappingI();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4 = new OASOrgApacheSlingServiceusermappingI();

        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2 = new OASOrgApacheSlingServiceusermappingI();

        System.assertEquals(false, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2 = new OASOrgApacheSlingServiceusermappingI();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3;

        System.assertEquals(false, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3));
        System.assertEquals(false, orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2 = new OASOrgApacheSlingServiceusermappingI();

        System.assertEquals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.hashCode(), orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.hashCode());
        System.assertEquals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.hashCode(), orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2 = OASOrgApacheSlingServiceusermappingI.getExample();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3 = new OASOrgApacheSlingServiceusermappingI();
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4 = new OASOrgApacheSlingServiceusermappingI();

        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2));
        System.assert(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3.equals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4));
        System.assertEquals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties1.hashCode(), orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties2.hashCode());
        System.assertEquals(orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties3.hashCode(), orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingServiceusermappingI orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties = new OASOrgApacheSlingServiceusermappingI();
        Map<String, String> propertyMappings = orgApacheSlingServiceusermappingImplServiceUserMapperImplAmendedProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('userMapping', propertyMappings.get('user.mapping'));
    }
}
