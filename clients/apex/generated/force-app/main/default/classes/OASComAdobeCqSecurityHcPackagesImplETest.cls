@isTest
private class OASComAdobeCqSecurityHcPackagesImplETest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2 = comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1;
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3 = new OASComAdobeCqSecurityHcPackagesImplE();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4 = comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3;

        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3 = new OASComAdobeCqSecurityHcPackagesImplE();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4 = new OASComAdobeCqSecurityHcPackagesImplE();

        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2 = new OASComAdobeCqSecurityHcPackagesImplE();

        System.assertEquals(false, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2 = new OASComAdobeCqSecurityHcPackagesImplE();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3;

        System.assertEquals(false, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3));
        System.assertEquals(false, comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2 = new OASComAdobeCqSecurityHcPackagesImplE();

        System.assertEquals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.hashCode(), comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2 = OASComAdobeCqSecurityHcPackagesImplE.getExample();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3 = new OASComAdobeCqSecurityHcPackagesImplE();
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4 = new OASComAdobeCqSecurityHcPackagesImplE();

        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2));
        System.assert(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3.equals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4));
        System.assertEquals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties1.hashCode(), comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties3.hashCode(), comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSecurityHcPackagesImplE comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties = new OASComAdobeCqSecurityHcPackagesImplE();
        Map<String, String> propertyMappings = comAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
    }
}
