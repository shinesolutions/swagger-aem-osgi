@isTest
private class OASComAdobeCqSocialDatastoreRdbImplSTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2 = comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1;
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3 = new OASComAdobeCqSocialDatastoreRdbImplS();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4 = comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3;

        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3 = new OASComAdobeCqSocialDatastoreRdbImplS();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4 = new OASComAdobeCqSocialDatastoreRdbImplS();

        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2 = new OASComAdobeCqSocialDatastoreRdbImplS();

        System.assertEquals(false, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2 = new OASComAdobeCqSocialDatastoreRdbImplS();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3;

        System.assertEquals(false, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3));
        System.assertEquals(false, comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2 = new OASComAdobeCqSocialDatastoreRdbImplS();

        System.assertEquals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.hashCode(), comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.hashCode(), comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2 = OASComAdobeCqSocialDatastoreRdbImplS.getExample();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3 = new OASComAdobeCqSocialDatastoreRdbImplS();
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4 = new OASComAdobeCqSocialDatastoreRdbImplS();

        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2));
        System.assert(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3.equals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4));
        System.assertEquals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties1.hashCode(), comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties3.hashCode(), comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialDatastoreRdbImplS comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties = new OASComAdobeCqSocialDatastoreRdbImplS();
        Map<String, String> propertyMappings = comAdobeCqSocialDatastoreRdbImplSocialRDBResourceProviderFactorProperties.getPropertyMappings();
        System.assertEquals('solrZkTimeout', propertyMappings.get('solr.zk.timeout'));
        System.assertEquals('solrCommit', propertyMappings.get('solr.commit'));
        System.assertEquals('cacheOn', propertyMappings.get('cache.on'));
        System.assertEquals('concurrencyLevel', propertyMappings.get('concurrency.level'));
        System.assertEquals('cacheStartSize', propertyMappings.get('cache.start.size'));
        System.assertEquals('cacheTtl', propertyMappings.get('cache.ttl'));
        System.assertEquals('cacheSize', propertyMappings.get('cache.size'));
    }
}
