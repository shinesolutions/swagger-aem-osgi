@isTest
private class OASOrgApacheSlingJcrWebdavImplHandleTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2 = orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1;
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3 = new OASOrgApacheSlingJcrWebdavImplHandle();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4 = orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3;

        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3 = new OASOrgApacheSlingJcrWebdavImplHandle();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4 = new OASOrgApacheSlingJcrWebdavImplHandle();

        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2 = new OASOrgApacheSlingJcrWebdavImplHandle();

        System.assertEquals(false, orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.equals('foo'));
        System.assertEquals(false, orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2 = new OASOrgApacheSlingJcrWebdavImplHandle();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3;

        System.assertEquals(false, orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3));
        System.assertEquals(false, orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2 = new OASOrgApacheSlingJcrWebdavImplHandle();

        System.assertEquals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.hashCode(), orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.hashCode());
        System.assertEquals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.hashCode(), orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2 = OASOrgApacheSlingJcrWebdavImplHandle.getExample();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3 = new OASOrgApacheSlingJcrWebdavImplHandle();
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4 = new OASOrgApacheSlingJcrWebdavImplHandle();

        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2));
        System.assert(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3.equals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4));
        System.assertEquals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties1.hashCode(), orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties2.hashCode());
        System.assertEquals(orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties3.hashCode(), orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheSlingJcrWebdavImplHandle orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties = new OASOrgApacheSlingJcrWebdavImplHandle();
        Map<String, String> propertyMappings = orgApacheSlingJcrWebdavImplHandlerDirListingExportHandlerServicProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
