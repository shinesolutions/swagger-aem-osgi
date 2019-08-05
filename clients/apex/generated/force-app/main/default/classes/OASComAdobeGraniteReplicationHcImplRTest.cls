@isTest
private class OASComAdobeGraniteReplicationHcImplRTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2 = comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1;
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3 = new OASComAdobeGraniteReplicationHcImplR();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4 = comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3;

        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3 = new OASComAdobeGraniteReplicationHcImplR();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4 = new OASComAdobeGraniteReplicationHcImplR();

        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2 = new OASComAdobeGraniteReplicationHcImplR();

        System.assertEquals(false, comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2 = new OASComAdobeGraniteReplicationHcImplR();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3;

        System.assertEquals(false, comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3));
        System.assertEquals(false, comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2 = new OASComAdobeGraniteReplicationHcImplR();

        System.assertEquals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.hashCode(), comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.hashCode());
        System.assertEquals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.hashCode(), comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2 = OASComAdobeGraniteReplicationHcImplR.getExample();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3 = new OASComAdobeGraniteReplicationHcImplR();
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4 = new OASComAdobeGraniteReplicationHcImplR();

        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2));
        System.assert(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3.equals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4));
        System.assertEquals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties1.hashCode(), comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties2.hashCode());
        System.assertEquals(comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties3.hashCode(), comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteReplicationHcImplR comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties = new OASComAdobeGraniteReplicationHcImplR();
        Map<String, String> propertyMappings = comAdobeGraniteReplicationHcImplReplicationTransportUsersHealthCProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
