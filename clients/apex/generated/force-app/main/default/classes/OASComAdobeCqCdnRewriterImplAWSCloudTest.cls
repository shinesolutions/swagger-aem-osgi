@isTest
private class OASComAdobeCqCdnRewriterImplAWSCloudTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2 = comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1;
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3 = new OASComAdobeCqCdnRewriterImplAWSCloud();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4 = comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3;

        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3 = new OASComAdobeCqCdnRewriterImplAWSCloud();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4 = new OASComAdobeCqCdnRewriterImplAWSCloud();

        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2 = new OASComAdobeCqCdnRewriterImplAWSCloud();

        System.assertEquals(false, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2 = new OASComAdobeCqCdnRewriterImplAWSCloud();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3;

        System.assertEquals(false, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3));
        System.assertEquals(false, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2 = new OASComAdobeCqCdnRewriterImplAWSCloud();

        System.assertEquals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.hashCode(), comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.hashCode());
        System.assertEquals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.hashCode(), comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2 = OASComAdobeCqCdnRewriterImplAWSCloud.getExample();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3 = new OASComAdobeCqCdnRewriterImplAWSCloud();
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4 = new OASComAdobeCqCdnRewriterImplAWSCloud();

        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2));
        System.assert(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3.equals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4));
        System.assertEquals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties1.hashCode(), comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties2.hashCode());
        System.assertEquals(comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties3.hashCode(), comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqCdnRewriterImplAWSCloud comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties = new OASComAdobeCqCdnRewriterImplAWSCloud();
        Map<String, String> x-property-mappings = comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.getx-property-mappings();
        System.assertEquals('serviceRanking', x-property-mappings.get('service.ranking'));
        System.assertEquals('keypairId', x-property-mappings.get('keypair.id'));
        System.assertEquals('keypairAlias', x-property-mappings.get('keypair.alias'));
        System.assertEquals('cdnrewriterAttributes', x-property-mappings.get('cdnrewriter.attributes'));
        System.assertEquals('cdnRewriterDistributionDomain', x-property-mappings.get('cdn.rewriter.distribution.domain'));
    }
}
