@isTest
private class OASComAdobeCqContentinsightImplServlTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2 = comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1;
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3 = new OASComAdobeCqContentinsightImplServl();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4 = comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3;

        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3 = new OASComAdobeCqContentinsightImplServl();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4 = new OASComAdobeCqContentinsightImplServl();

        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2 = new OASComAdobeCqContentinsightImplServl();

        System.assertEquals(false, comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2 = new OASComAdobeCqContentinsightImplServl();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3;

        System.assertEquals(false, comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3));
        System.assertEquals(false, comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2 = new OASComAdobeCqContentinsightImplServl();

        System.assertEquals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.hashCode(), comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.hashCode());
        System.assertEquals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.hashCode(), comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2 = OASComAdobeCqContentinsightImplServl.getExample();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3 = new OASComAdobeCqContentinsightImplServl();
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4 = new OASComAdobeCqContentinsightImplServl();

        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2));
        System.assert(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3.equals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4));
        System.assertEquals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties1.hashCode(), comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties2.hashCode());
        System.assertEquals(comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties3.hashCode(), comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqContentinsightImplServl comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties = new OASComAdobeCqContentinsightImplServl();
        Map<String, String> propertyMappings = comAdobeCqContentinsightImplServletsReportingServicesProxyServleProperties.getPropertyMappings();
        System.assertEquals('reportingservicesProxyWhitelist', propertyMappings.get('reportingservices.proxy.whitelist'));
    }
}
