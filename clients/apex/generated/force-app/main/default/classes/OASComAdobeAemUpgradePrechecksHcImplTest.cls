@isTest
private class OASComAdobeAemUpgradePrechecksHcImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2 = comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1;
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3 = new OASComAdobeAemUpgradePrechecksHcImpl();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4 = comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3;

        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3 = new OASComAdobeAemUpgradePrechecksHcImpl();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4 = new OASComAdobeAemUpgradePrechecksHcImpl();

        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2 = new OASComAdobeAemUpgradePrechecksHcImpl();

        System.assertEquals(false, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.equals('foo'));
        System.assertEquals(false, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2 = new OASComAdobeAemUpgradePrechecksHcImpl();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3;

        System.assertEquals(false, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3));
        System.assertEquals(false, comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2 = new OASComAdobeAemUpgradePrechecksHcImpl();

        System.assertEquals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.hashCode(), comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.hashCode());
        System.assertEquals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.hashCode(), comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2 = OASComAdobeAemUpgradePrechecksHcImpl.getExample();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3 = new OASComAdobeAemUpgradePrechecksHcImpl();
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4 = new OASComAdobeAemUpgradePrechecksHcImpl();

        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2));
        System.assert(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3.equals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4));
        System.assertEquals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties1.hashCode(), comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties2.hashCode());
        System.assertEquals(comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties3.hashCode(), comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeAemUpgradePrechecksHcImpl comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties = new OASComAdobeAemUpgradePrechecksHcImpl();
        Map<String, String> propertyMappings = comAdobeAemUpgradePrechecksHcImplReplicationAgentsDisabledHCProperties.getPropertyMappings();
        System.assertEquals('hcName', propertyMappings.get('hc.name'));
        System.assertEquals('hcTags', propertyMappings.get('hc.tags'));
        System.assertEquals('hcMbeanName', propertyMappings.get('hc.mbean.name'));
    }
}
