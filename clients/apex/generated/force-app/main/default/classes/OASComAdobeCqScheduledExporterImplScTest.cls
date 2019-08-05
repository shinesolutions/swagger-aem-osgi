@isTest
private class OASComAdobeCqScheduledExporterImplScTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties1 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties2 = comAdobeCqScheduledExporterImplScheduledExporterImplProperties1;
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties3 = new OASComAdobeCqScheduledExporterImplSc();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties4 = comAdobeCqScheduledExporterImplScheduledExporterImplProperties3;

        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties2));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties4));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties4.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties1 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties2 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties3 = new OASComAdobeCqScheduledExporterImplSc();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties4 = new OASComAdobeCqScheduledExporterImplSc();

        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties2));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties4));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties4.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties1 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties2 = new OASComAdobeCqScheduledExporterImplSc();

        System.assertEquals(false, comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties1 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties2 = new OASComAdobeCqScheduledExporterImplSc();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties3;

        System.assertEquals(false, comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3));
        System.assertEquals(false, comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties1 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties2 = new OASComAdobeCqScheduledExporterImplSc();

        System.assertEquals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.hashCode(), comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.hashCode());
        System.assertEquals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.hashCode(), comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties1 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties2 = OASComAdobeCqScheduledExporterImplSc.getExample();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties3 = new OASComAdobeCqScheduledExporterImplSc();
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties4 = new OASComAdobeCqScheduledExporterImplSc();

        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties2));
        System.assert(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3.equals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties4));
        System.assertEquals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties1.hashCode(), comAdobeCqScheduledExporterImplScheduledExporterImplProperties2.hashCode());
        System.assertEquals(comAdobeCqScheduledExporterImplScheduledExporterImplProperties3.hashCode(), comAdobeCqScheduledExporterImplScheduledExporterImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScheduledExporterImplSc comAdobeCqScheduledExporterImplScheduledExporterImplProperties = new OASComAdobeCqScheduledExporterImplSc();
        Map<String, String> propertyMappings = comAdobeCqScheduledExporterImplScheduledExporterImplProperties.getPropertyMappings();
        System.assertEquals('includePaths', propertyMappings.get('include.paths'));
        System.assertEquals('exporterUser', propertyMappings.get('exporter.user'));
    }
}
