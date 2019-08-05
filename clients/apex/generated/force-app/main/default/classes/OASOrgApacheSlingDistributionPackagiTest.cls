@isTest
private class OASOrgApacheSlingDistributionPackagiTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2 = orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1;
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3 = new OASOrgApacheSlingDistributionPackagi();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4 = orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3;

        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3 = new OASOrgApacheSlingDistributionPackagi();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4 = new OASOrgApacheSlingDistributionPackagi();

        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2 = new OASOrgApacheSlingDistributionPackagi();

        System.assertEquals(false, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2 = new OASOrgApacheSlingDistributionPackagi();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3;

        System.assertEquals(false, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3));
        System.assertEquals(false, orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2 = new OASOrgApacheSlingDistributionPackagi();

        System.assertEquals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.hashCode(), orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.hashCode());
        System.assertEquals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.hashCode(), orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2 = OASOrgApacheSlingDistributionPackagi.getExample();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3 = new OASOrgApacheSlingDistributionPackagi();
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4 = new OASOrgApacheSlingDistributionPackagi();

        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2));
        System.assert(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3.equals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4));
        System.assertEquals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties1.hashCode(), orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties2.hashCode());
        System.assertEquals(orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties3.hashCode(), orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingDistributionPackagi orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties = new OASOrgApacheSlingDistributionPackagi();
        Map<String, String> propertyMappings = orgApacheSlingDistributionPackagingImplImporterRepositoryDistriProperties.getPropertyMappings();
        System.assertEquals('serviceName', propertyMappings.get('service.name'));
        System.assertEquals('privilegeName', propertyMappings.get('privilege.name'));
    }
}
