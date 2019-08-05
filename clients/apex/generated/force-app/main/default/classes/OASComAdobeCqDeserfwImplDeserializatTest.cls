@isTest
private class OASComAdobeCqDeserfwImplDeserializatTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties1 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties2 = comAdobeCqDeserfwImplDeserializationFirewallImplProperties1;
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties3 = new OASComAdobeCqDeserfwImplDeserializat();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties4 = comAdobeCqDeserfwImplDeserializationFirewallImplProperties3;

        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties2));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties4));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties4.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties1 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties2 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties3 = new OASComAdobeCqDeserfwImplDeserializat();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties4 = new OASComAdobeCqDeserfwImplDeserializat();

        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties2));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties4));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties4.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties1 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties2 = new OASComAdobeCqDeserfwImplDeserializat();

        System.assertEquals(false, comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties1 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties2 = new OASComAdobeCqDeserfwImplDeserializat();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties3;

        System.assertEquals(false, comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3));
        System.assertEquals(false, comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties1 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties2 = new OASComAdobeCqDeserfwImplDeserializat();

        System.assertEquals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.hashCode(), comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.hashCode(), comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties1 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties2 = OASComAdobeCqDeserfwImplDeserializat.getExample();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties3 = new OASComAdobeCqDeserfwImplDeserializat();
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties4 = new OASComAdobeCqDeserfwImplDeserializat();

        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties2));
        System.assert(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3.equals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties4));
        System.assertEquals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties1.hashCode(), comAdobeCqDeserfwImplDeserializationFirewallImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDeserfwImplDeserializationFirewallImplProperties3.hashCode(), comAdobeCqDeserfwImplDeserializationFirewallImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDeserfwImplDeserializat comAdobeCqDeserfwImplDeserializationFirewallImplProperties = new OASComAdobeCqDeserfwImplDeserializat();
        Map<String, String> propertyMappings = comAdobeCqDeserfwImplDeserializationFirewallImplProperties.getPropertyMappings();
        System.assertEquals('firewallDeserializationWhitelist', propertyMappings.get('firewall.deserialization.whitelist'));
        System.assertEquals('firewallDeserializationBlacklist', propertyMappings.get('firewall.deserialization.blacklist'));
        System.assertEquals('firewallDeserializationDiagnostics', propertyMappings.get('firewall.deserialization.diagnostics'));
    }
}
