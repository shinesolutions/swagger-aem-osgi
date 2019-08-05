@isTest
private class OASComAdobeCqSocialDatastoreAsImplASTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2 = comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1;
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3 = new OASComAdobeCqSocialDatastoreAsImplAS();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4 = comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3;

        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3 = new OASComAdobeCqSocialDatastoreAsImplAS();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4 = new OASComAdobeCqSocialDatastoreAsImplAS();

        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2 = new OASComAdobeCqSocialDatastoreAsImplAS();

        System.assertEquals(false, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2 = new OASComAdobeCqSocialDatastoreAsImplAS();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3;

        System.assertEquals(false, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3));
        System.assertEquals(false, comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2 = new OASComAdobeCqSocialDatastoreAsImplAS();

        System.assertEquals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.hashCode(), comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.hashCode(), comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2 = OASComAdobeCqSocialDatastoreAsImplAS.getExample();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3 = new OASComAdobeCqSocialDatastoreAsImplAS();
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4 = new OASComAdobeCqSocialDatastoreAsImplAS();

        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2));
        System.assert(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3.equals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4));
        System.assertEquals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties1.hashCode(), comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties3.hashCode(), comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqSocialDatastoreAsImplAS comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties = new OASComAdobeCqSocialDatastoreAsImplAS();
        Map<String, String> propertyMappings = comAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.getPropertyMappings();
        System.assertEquals('versionId', propertyMappings.get('version.id'));
        System.assertEquals('cacheOn', propertyMappings.get('cache.on'));
        System.assertEquals('concurrencyLevel', propertyMappings.get('concurrency.level'));
        System.assertEquals('cacheStartSize', propertyMappings.get('cache.start.size'));
        System.assertEquals('cacheTtl', propertyMappings.get('cache.ttl'));
        System.assertEquals('cacheSize', propertyMappings.get('cache.size'));
        System.assertEquals('timeLimit', propertyMappings.get('time.limit'));
    }
}
