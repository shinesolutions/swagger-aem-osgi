@isTest
private class OASComAdobeCqSecurityHcWebserverImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2 = comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1;
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3 = new OASComAdobeCqSecurityHcWebserverImpl();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4 = comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3;

        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3 = new OASComAdobeCqSecurityHcWebserverImpl();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4 = new OASComAdobeCqSecurityHcWebserverImpl();

        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2 = new OASComAdobeCqSecurityHcWebserverImpl();

        System.assertEquals(false, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2 = new OASComAdobeCqSecurityHcWebserverImpl();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3;

        System.assertEquals(false, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3));
        System.assertEquals(false, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2 = new OASComAdobeCqSecurityHcWebserverImpl();

        System.assertEquals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.hashCode(), comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2 = OASComAdobeCqSecurityHcWebserverImpl.getExample();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3 = new OASComAdobeCqSecurityHcWebserverImpl();
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4 = new OASComAdobeCqSecurityHcWebserverImpl();

        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3.equals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4));
        System.assertEquals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties3.hashCode(), comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSecurityHcWebserverImpl comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties = new OASComAdobeCqSecurityHcWebserverImpl();
        Map<String, String> propertyMappings = comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('webserverAddress', propertyMappings.get('webserver.address'));
    }
}
