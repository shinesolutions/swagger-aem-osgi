@isTest
private class OASComAdobeCqCdnRewriterImplCDNConfiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2 = comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1;
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3 = new OASComAdobeCqCdnRewriterImplCDNConfi();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4 = comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3;

        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3 = new OASComAdobeCqCdnRewriterImplCDNConfi();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4 = new OASComAdobeCqCdnRewriterImplCDNConfi();

        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2 = new OASComAdobeCqCdnRewriterImplCDNConfi();

        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2 = new OASComAdobeCqCdnRewriterImplCDNConfi();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3;

        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3));
        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2 = new OASComAdobeCqCdnRewriterImplCDNConfi();

        System.assertEquals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.hashCode(), comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.hashCode(), comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2 = OASComAdobeCqCdnRewriterImplCDNConfi.getExample();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3 = new OASComAdobeCqCdnRewriterImplCDNConfi();
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4 = new OASComAdobeCqCdnRewriterImplCDNConfi();

        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2));
        System.assert(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3.equals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4));
        System.assertEquals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties1.hashCode(), comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties3.hashCode(), comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCdnRewriterImplCDNConfi comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties = new OASComAdobeCqCdnRewriterImplCDNConfi();
        Map<String, String> propertyMappings = comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.getPropertyMappings();
        System.assertEquals('cdnConfigDistributionDomain', propertyMappings.get('cdn.config.distribution.domain'));
        System.assertEquals('cdnConfigEnableRewriting', propertyMappings.get('cdn.config.enable.rewriting'));
        System.assertEquals('cdnConfigPathPrefixes', propertyMappings.get('cdn.config.path.prefixes'));
        System.assertEquals('cdnConfigCdnttl', propertyMappings.get('cdn.config.cdnttl'));
        System.assertEquals('cdnConfigApplicationProtocol', propertyMappings.get('cdn.config.application.protocol'));
    }
}
