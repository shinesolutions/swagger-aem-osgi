@isTest
private class OASComAdobeCqSocialSrpImplSocialSolrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties1 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties2 = comAdobeCqSocialSrpImplSocialSolrConnectorProperties1;
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties3 = new OASComAdobeCqSocialSrpImplSocialSolr();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties4 = comAdobeCqSocialSrpImplSocialSolrConnectorProperties3;

        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties2));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties4));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties4.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties1 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties2 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties3 = new OASComAdobeCqSocialSrpImplSocialSolr();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties4 = new OASComAdobeCqSocialSrpImplSocialSolr();

        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties2));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties4));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties4.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties1 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties2 = new OASComAdobeCqSocialSrpImplSocialSolr();

        System.assertEquals(false, comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties1 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties2 = new OASComAdobeCqSocialSrpImplSocialSolr();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties3;

        System.assertEquals(false, comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3));
        System.assertEquals(false, comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties1 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties2 = new OASComAdobeCqSocialSrpImplSocialSolr();

        System.assertEquals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.hashCode(), comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.hashCode(), comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties1 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties2 = OASComAdobeCqSocialSrpImplSocialSolr.getExample();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties3 = new OASComAdobeCqSocialSrpImplSocialSolr();
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties4 = new OASComAdobeCqSocialSrpImplSocialSolr();

        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties2));
        System.assert(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3.equals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties4));
        System.assertEquals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties1.hashCode(), comAdobeCqSocialSrpImplSocialSolrConnectorProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialSrpImplSocialSolrConnectorProperties3.hashCode(), comAdobeCqSocialSrpImplSocialSolrConnectorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialSrpImplSocialSolr comAdobeCqSocialSrpImplSocialSolrConnectorProperties = new OASComAdobeCqSocialSrpImplSocialSolr();
        Map<String, String> propertyMappings = comAdobeCqSocialSrpImplSocialSolrConnectorProperties.getPropertyMappings();
        System.assertEquals('srpType', propertyMappings.get('srp.type'));
    }
}
