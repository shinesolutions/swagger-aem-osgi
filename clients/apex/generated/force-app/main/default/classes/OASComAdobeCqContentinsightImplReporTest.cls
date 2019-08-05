@isTest
private class OASComAdobeCqContentinsightImplReporTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2 = comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1;
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3 = new OASComAdobeCqContentinsightImplRepor();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4 = comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3;

        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3 = new OASComAdobeCqContentinsightImplRepor();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4 = new OASComAdobeCqContentinsightImplRepor();

        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2 = new OASComAdobeCqContentinsightImplRepor();

        System.assertEquals(false, comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2 = new OASComAdobeCqContentinsightImplRepor();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3;

        System.assertEquals(false, comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3));
        System.assertEquals(false, comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2 = new OASComAdobeCqContentinsightImplRepor();

        System.assertEquals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.hashCode(), comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.hashCode());
        System.assertEquals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.hashCode(), comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2 = OASComAdobeCqContentinsightImplRepor.getExample();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3 = new OASComAdobeCqContentinsightImplRepor();
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4 = new OASComAdobeCqContentinsightImplRepor();

        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2));
        System.assert(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3.equals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4));
        System.assertEquals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties1.hashCode(), comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties2.hashCode());
        System.assertEquals(comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties3.hashCode(), comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqContentinsightImplRepor comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties = new OASComAdobeCqContentinsightImplRepor();
        Map<String, String> propertyMappings = comAdobeCqContentinsightImplReportingServicesSettingsProviderProperties.getPropertyMappings();
        System.assertEquals('reportingservicesUrl', propertyMappings.get('reportingservices.url'));
    }
}
