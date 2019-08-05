@isTest
private class OASComAdobeCqSocialDatastoreOpImplSoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2 = comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1;
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3 = new OASComAdobeCqSocialDatastoreOpImplSo();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4 = comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3;

        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3 = new OASComAdobeCqSocialDatastoreOpImplSo();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4 = new OASComAdobeCqSocialDatastoreOpImplSo();

        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2 = new OASComAdobeCqSocialDatastoreOpImplSo();

        System.assertEquals(false, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2 = new OASComAdobeCqSocialDatastoreOpImplSo();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3;

        System.assertEquals(false, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3));
        System.assertEquals(false, comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2 = new OASComAdobeCqSocialDatastoreOpImplSo();

        System.assertEquals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.hashCode(), comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.hashCode(), comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2 = OASComAdobeCqSocialDatastoreOpImplSo.getExample();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3 = new OASComAdobeCqSocialDatastoreOpImplSo();
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4 = new OASComAdobeCqSocialDatastoreOpImplSo();

        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2));
        System.assert(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4));
        System.assertEquals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties1.hashCode(), comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties3.hashCode(), comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialDatastoreOpImplSo comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties = new OASComAdobeCqSocialDatastoreOpImplSo();
        Map<String, String> propertyMappings = comAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties.getPropertyMappings();
        System.assertEquals('solrZkTimeout', propertyMappings.get('solr.zk.timeout'));
        System.assertEquals('solrCommit', propertyMappings.get('solr.commit'));
        System.assertEquals('cacheOn', propertyMappings.get('cache.on'));
        System.assertEquals('concurrencyLevel', propertyMappings.get('concurrency.level'));
        System.assertEquals('cacheStartSize', propertyMappings.get('cache.start.size'));
        System.assertEquals('cacheTtl', propertyMappings.get('cache.ttl'));
        System.assertEquals('cacheSize', propertyMappings.get('cache.size'));
    }
}
