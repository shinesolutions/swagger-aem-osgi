@isTest
private class OASComDayCqWcmDesignimporterDesignPaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties1 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties2 = comDayCqWcmDesignimporterDesignPackageImporterProperties1;
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties3 = new OASComDayCqWcmDesignimporterDesignPa();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties4 = comDayCqWcmDesignimporterDesignPackageImporterProperties3;

        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties1.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties2));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties2.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties1));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties1.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties1));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties3.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties4));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties4.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties3));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties3.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties1 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties2 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties3 = new OASComDayCqWcmDesignimporterDesignPa();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties4 = new OASComDayCqWcmDesignimporterDesignPa();

        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties1.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties2));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties2.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties1));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties3.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties4));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties4.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties1 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties2 = new OASComDayCqWcmDesignimporterDesignPa();

        System.assertEquals(false, comDayCqWcmDesignimporterDesignPackageImporterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmDesignimporterDesignPackageImporterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties1 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties2 = new OASComDayCqWcmDesignimporterDesignPa();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties3;

        System.assertEquals(false, comDayCqWcmDesignimporterDesignPackageImporterProperties1.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties3));
        System.assertEquals(false, comDayCqWcmDesignimporterDesignPackageImporterProperties2.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties1 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties2 = new OASComDayCqWcmDesignimporterDesignPa();

        System.assertEquals(comDayCqWcmDesignimporterDesignPackageImporterProperties1.hashCode(), comDayCqWcmDesignimporterDesignPackageImporterProperties1.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterDesignPackageImporterProperties2.hashCode(), comDayCqWcmDesignimporterDesignPackageImporterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties1 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties2 = OASComDayCqWcmDesignimporterDesignPa.getExample();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties3 = new OASComDayCqWcmDesignimporterDesignPa();
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties4 = new OASComDayCqWcmDesignimporterDesignPa();

        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties1.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties2));
        System.assert(comDayCqWcmDesignimporterDesignPackageImporterProperties3.equals(comDayCqWcmDesignimporterDesignPackageImporterProperties4));
        System.assertEquals(comDayCqWcmDesignimporterDesignPackageImporterProperties1.hashCode(), comDayCqWcmDesignimporterDesignPackageImporterProperties2.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterDesignPackageImporterProperties3.hashCode(), comDayCqWcmDesignimporterDesignPackageImporterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmDesignimporterDesignPa comDayCqWcmDesignimporterDesignPackageImporterProperties = new OASComDayCqWcmDesignimporterDesignPa();
        Map<String, String> propertyMappings = comDayCqWcmDesignimporterDesignPackageImporterProperties.getPropertyMappings();
        System.assertEquals('extractFilter', propertyMappings.get('extract.filter'));
    }
}
