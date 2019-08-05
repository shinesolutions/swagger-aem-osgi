@isTest
private class OASComAdobeCqDamS7imagingImplPsPlatfTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2 = comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1;
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3 = new OASComAdobeCqDamS7imagingImplPsPlatf();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4 = comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3;

        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3 = new OASComAdobeCqDamS7imagingImplPsPlatf();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4 = new OASComAdobeCqDamS7imagingImplPsPlatf();

        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2 = new OASComAdobeCqDamS7imagingImplPsPlatf();

        System.assertEquals(false, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2 = new OASComAdobeCqDamS7imagingImplPsPlatf();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3;

        System.assertEquals(false, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3));
        System.assertEquals(false, comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2 = new OASComAdobeCqDamS7imagingImplPsPlatf();

        System.assertEquals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.hashCode(), comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.hashCode());
        System.assertEquals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.hashCode(), comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2 = OASComAdobeCqDamS7imagingImplPsPlatf.getExample();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3 = new OASComAdobeCqDamS7imagingImplPsPlatf();
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4 = new OASComAdobeCqDamS7imagingImplPsPlatf();

        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2));
        System.assert(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3.equals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4));
        System.assertEquals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties1.hashCode(), comAdobeCqDamS7imagingImplPsPlatformServerServletProperties2.hashCode());
        System.assertEquals(comAdobeCqDamS7imagingImplPsPlatformServerServletProperties3.hashCode(), comAdobeCqDamS7imagingImplPsPlatformServerServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDamS7imagingImplPsPlatf comAdobeCqDamS7imagingImplPsPlatformServerServletProperties = new OASComAdobeCqDamS7imagingImplPsPlatf();
        Map<String, String> propertyMappings = comAdobeCqDamS7imagingImplPsPlatformServerServletProperties.getPropertyMappings();
        System.assertEquals('cacheEnable', propertyMappings.get('cache.enable'));
        System.assertEquals('cacheRootPaths', propertyMappings.get('cache.rootPaths'));
        System.assertEquals('cacheMaxSize', propertyMappings.get('cache.maxSize'));
        System.assertEquals('cacheMaxEntries', propertyMappings.get('cache.maxEntries'));
    }
}
