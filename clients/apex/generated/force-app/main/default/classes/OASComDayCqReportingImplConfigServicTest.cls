@isTest
private class OASComDayCqReportingImplConfigServicTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties1 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties2 = comDayCqReportingImplConfigServiceImplProperties1;
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties3 = new OASComDayCqReportingImplConfigServic();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties4 = comDayCqReportingImplConfigServiceImplProperties3;

        System.assert(comDayCqReportingImplConfigServiceImplProperties1.equals(comDayCqReportingImplConfigServiceImplProperties2));
        System.assert(comDayCqReportingImplConfigServiceImplProperties2.equals(comDayCqReportingImplConfigServiceImplProperties1));
        System.assert(comDayCqReportingImplConfigServiceImplProperties1.equals(comDayCqReportingImplConfigServiceImplProperties1));
        System.assert(comDayCqReportingImplConfigServiceImplProperties3.equals(comDayCqReportingImplConfigServiceImplProperties4));
        System.assert(comDayCqReportingImplConfigServiceImplProperties4.equals(comDayCqReportingImplConfigServiceImplProperties3));
        System.assert(comDayCqReportingImplConfigServiceImplProperties3.equals(comDayCqReportingImplConfigServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties1 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties2 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties3 = new OASComDayCqReportingImplConfigServic();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties4 = new OASComDayCqReportingImplConfigServic();

        System.assert(comDayCqReportingImplConfigServiceImplProperties1.equals(comDayCqReportingImplConfigServiceImplProperties2));
        System.assert(comDayCqReportingImplConfigServiceImplProperties2.equals(comDayCqReportingImplConfigServiceImplProperties1));
        System.assert(comDayCqReportingImplConfigServiceImplProperties3.equals(comDayCqReportingImplConfigServiceImplProperties4));
        System.assert(comDayCqReportingImplConfigServiceImplProperties4.equals(comDayCqReportingImplConfigServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties1 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties2 = new OASComDayCqReportingImplConfigServic();

        System.assertEquals(false, comDayCqReportingImplConfigServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReportingImplConfigServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties1 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties2 = new OASComDayCqReportingImplConfigServic();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties3;

        System.assertEquals(false, comDayCqReportingImplConfigServiceImplProperties1.equals(comDayCqReportingImplConfigServiceImplProperties3));
        System.assertEquals(false, comDayCqReportingImplConfigServiceImplProperties2.equals(comDayCqReportingImplConfigServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties1 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties2 = new OASComDayCqReportingImplConfigServic();

        System.assertEquals(comDayCqReportingImplConfigServiceImplProperties1.hashCode(), comDayCqReportingImplConfigServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqReportingImplConfigServiceImplProperties2.hashCode(), comDayCqReportingImplConfigServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties1 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties2 = OASComDayCqReportingImplConfigServic.getExample();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties3 = new OASComDayCqReportingImplConfigServic();
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties4 = new OASComDayCqReportingImplConfigServic();

        System.assert(comDayCqReportingImplConfigServiceImplProperties1.equals(comDayCqReportingImplConfigServiceImplProperties2));
        System.assert(comDayCqReportingImplConfigServiceImplProperties3.equals(comDayCqReportingImplConfigServiceImplProperties4));
        System.assertEquals(comDayCqReportingImplConfigServiceImplProperties1.hashCode(), comDayCqReportingImplConfigServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqReportingImplConfigServiceImplProperties3.hashCode(), comDayCqReportingImplConfigServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReportingImplConfigServic comDayCqReportingImplConfigServiceImplProperties = new OASComDayCqReportingImplConfigServic();
        Map<String, String> propertyMappings = comDayCqReportingImplConfigServiceImplProperties.getPropertyMappings();
        System.assertEquals('repconfTimezone', propertyMappings.get('repconf.timezone'));
        System.assertEquals('repconfLocale', propertyMappings.get('repconf.locale'));
        System.assertEquals('repconfSnapshots', propertyMappings.get('repconf.snapshots'));
        System.assertEquals('repconfRepdir', propertyMappings.get('repconf.repdir'));
        System.assertEquals('repconfHourofday', propertyMappings.get('repconf.hourofday'));
        System.assertEquals('repconfMinofhour', propertyMappings.get('repconf.minofhour'));
        System.assertEquals('repconfMaxrows', propertyMappings.get('repconf.maxrows'));
        System.assertEquals('repconfFakedata', propertyMappings.get('repconf.fakedata'));
        System.assertEquals('repconfSnapshotuser', propertyMappings.get('repconf.snapshotuser'));
        System.assertEquals('repconfEnforcesnapshotuser', propertyMappings.get('repconf.enforcesnapshotuser'));
    }
}
