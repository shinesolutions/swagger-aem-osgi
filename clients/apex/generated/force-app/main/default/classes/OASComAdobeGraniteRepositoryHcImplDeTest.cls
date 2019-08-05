@isTest
private class OASComAdobeGraniteRepositoryHcImplDeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2 = comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1;
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplDe();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4 = comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3;

        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplDe();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplDe();

        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplDe();

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplDe();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3;

        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3));
        System.assertEquals(false, comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2 = new OASComAdobeGraniteRepositoryHcImplDe();

        System.assertEquals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.hashCode(), comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2 = OASComAdobeGraniteRepositoryHcImplDe.getExample();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3 = new OASComAdobeGraniteRepositoryHcImplDe();
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4 = new OASComAdobeGraniteRepositoryHcImplDe();

        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2));
        System.assert(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3.equals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4));
        System.assertEquals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties1.hashCode(), comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties2.hashCode());
        System.assertEquals(comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties3.hashCode(), comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteRepositoryHcImplDe comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties = new OASComAdobeGraniteRepositoryHcImplDe();
        Map<String, String> propertyMappings = comAdobeGraniteRepositoryHcImplDefaultLoginsHealthCheckProperties.getPropertyMappings();
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('accountLogins', propertyMappings.get('account.logins'));
        System.assertEquals('consoleLogins', propertyMappings.get('console.logins'));
    }
}
