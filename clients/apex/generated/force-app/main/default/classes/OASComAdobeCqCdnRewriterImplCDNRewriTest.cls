@isTest
private class OASComAdobeCqCdnRewriterImplCDNRewriTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties1 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties2 = comAdobeCqCdnRewriterImplCDNRewriterProperties1;
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties3 = new OASComAdobeCqCdnRewriterImplCDNRewri();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties4 = comAdobeCqCdnRewriterImplCDNRewriterProperties3;

        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties1.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties2));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties2.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties1));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties1.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties1));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties3.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties4));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties4.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties3));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties3.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties1 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties2 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties3 = new OASComAdobeCqCdnRewriterImplCDNRewri();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties4 = new OASComAdobeCqCdnRewriterImplCDNRewri();

        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties1.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties2));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties2.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties1));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties3.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties4));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties4.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties1 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties2 = new OASComAdobeCqCdnRewriterImplCDNRewri();

        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNRewriterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNRewriterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties1 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties2 = new OASComAdobeCqCdnRewriterImplCDNRewri();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties3;

        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNRewriterProperties1.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties3));
        System.assertEquals(false, comAdobeCqCdnRewriterImplCDNRewriterProperties2.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties1 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties2 = new OASComAdobeCqCdnRewriterImplCDNRewri();

        System.assertEquals(comAdobeCqCdnRewriterImplCDNRewriterProperties1.hashCode(), comAdobeCqCdnRewriterImplCDNRewriterProperties1.hashCode());
        System.assertEquals(comAdobeCqCdnRewriterImplCDNRewriterProperties2.hashCode(), comAdobeCqCdnRewriterImplCDNRewriterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties1 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties2 = OASComAdobeCqCdnRewriterImplCDNRewri.getExample();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties3 = new OASComAdobeCqCdnRewriterImplCDNRewri();
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties4 = new OASComAdobeCqCdnRewriterImplCDNRewri();

        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties1.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties2));
        System.assert(comAdobeCqCdnRewriterImplCDNRewriterProperties3.equals(comAdobeCqCdnRewriterImplCDNRewriterProperties4));
        System.assertEquals(comAdobeCqCdnRewriterImplCDNRewriterProperties1.hashCode(), comAdobeCqCdnRewriterImplCDNRewriterProperties2.hashCode());
        System.assertEquals(comAdobeCqCdnRewriterImplCDNRewriterProperties3.hashCode(), comAdobeCqCdnRewriterImplCDNRewriterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCdnRewriterImplCDNRewri comAdobeCqCdnRewriterImplCDNRewriterProperties = new OASComAdobeCqCdnRewriterImplCDNRewri();
        Map<String, String> propertyMappings = comAdobeCqCdnRewriterImplCDNRewriterProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
        System.assertEquals('cdnrewriterAttributes', propertyMappings.get('cdnrewriter.attributes'));
        System.assertEquals('cdnRewriterDistributionDomain', propertyMappings.get('cdn.rewriter.distribution.domain'));
    }
}
