@isTest
private class OASComDayCqPollingImporterImplPollinTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties1 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties2 = comDayCqPollingImporterImplPollingImporterImplProperties1;
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties3 = new OASComDayCqPollingImporterImplPollin();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties4 = comDayCqPollingImporterImplPollingImporterImplProperties3;

        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties1.equals(comDayCqPollingImporterImplPollingImporterImplProperties2));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties2.equals(comDayCqPollingImporterImplPollingImporterImplProperties1));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties1.equals(comDayCqPollingImporterImplPollingImporterImplProperties1));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties3.equals(comDayCqPollingImporterImplPollingImporterImplProperties4));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties4.equals(comDayCqPollingImporterImplPollingImporterImplProperties3));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties3.equals(comDayCqPollingImporterImplPollingImporterImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties1 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties2 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties3 = new OASComDayCqPollingImporterImplPollin();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties4 = new OASComDayCqPollingImporterImplPollin();

        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties1.equals(comDayCqPollingImporterImplPollingImporterImplProperties2));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties2.equals(comDayCqPollingImporterImplPollingImporterImplProperties1));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties3.equals(comDayCqPollingImporterImplPollingImporterImplProperties4));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties4.equals(comDayCqPollingImporterImplPollingImporterImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties1 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties2 = new OASComDayCqPollingImporterImplPollin();

        System.assertEquals(false, comDayCqPollingImporterImplPollingImporterImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqPollingImporterImplPollingImporterImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties1 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties2 = new OASComDayCqPollingImporterImplPollin();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties3;

        System.assertEquals(false, comDayCqPollingImporterImplPollingImporterImplProperties1.equals(comDayCqPollingImporterImplPollingImporterImplProperties3));
        System.assertEquals(false, comDayCqPollingImporterImplPollingImporterImplProperties2.equals(comDayCqPollingImporterImplPollingImporterImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties1 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties2 = new OASComDayCqPollingImporterImplPollin();

        System.assertEquals(comDayCqPollingImporterImplPollingImporterImplProperties1.hashCode(), comDayCqPollingImporterImplPollingImporterImplProperties1.hashCode());
        System.assertEquals(comDayCqPollingImporterImplPollingImporterImplProperties2.hashCode(), comDayCqPollingImporterImplPollingImporterImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties1 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties2 = OASComDayCqPollingImporterImplPollin.getExample();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties3 = new OASComDayCqPollingImporterImplPollin();
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties4 = new OASComDayCqPollingImporterImplPollin();

        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties1.equals(comDayCqPollingImporterImplPollingImporterImplProperties2));
        System.assert(comDayCqPollingImporterImplPollingImporterImplProperties3.equals(comDayCqPollingImporterImplPollingImporterImplProperties4));
        System.assertEquals(comDayCqPollingImporterImplPollingImporterImplProperties1.hashCode(), comDayCqPollingImporterImplPollingImporterImplProperties2.hashCode());
        System.assertEquals(comDayCqPollingImporterImplPollingImporterImplProperties3.hashCode(), comDayCqPollingImporterImplPollingImporterImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqPollingImporterImplPollin comDayCqPollingImporterImplPollingImporterImplProperties = new OASComDayCqPollingImporterImplPollin();
        Map<String, String> propertyMappings = comDayCqPollingImporterImplPollingImporterImplProperties.getPropertyMappings();
        System.assertEquals('importerMinInterval', propertyMappings.get('importer.min.interval'));
        System.assertEquals('importerUser', propertyMappings.get('importer.user'));
        System.assertEquals('excludePaths', propertyMappings.get('exclude.paths'));
        System.assertEquals('includePaths', propertyMappings.get('include.paths'));
    }
}
