@isTest
private class OASComDayCqWcmMobileCoreImplRedirectTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2 = comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1;
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3 = new OASComDayCqWcmMobileCoreImplRedirect();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4 = comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3;

        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3 = new OASComDayCqWcmMobileCoreImplRedirect();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4 = new OASComDayCqWcmMobileCoreImplRedirect();

        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2 = new OASComDayCqWcmMobileCoreImplRedirect();

        System.assertEquals(false, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2 = new OASComDayCqWcmMobileCoreImplRedirect();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3;

        System.assertEquals(false, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3));
        System.assertEquals(false, comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2 = new OASComDayCqWcmMobileCoreImplRedirect();

        System.assertEquals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.hashCode(), comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.hashCode());
        System.assertEquals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.hashCode(), comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2 = OASComDayCqWcmMobileCoreImplRedirect.getExample();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3 = new OASComDayCqWcmMobileCoreImplRedirect();
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4 = new OASComDayCqWcmMobileCoreImplRedirect();

        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2));
        System.assert(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3.equals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4));
        System.assertEquals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties1.hashCode(), comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties2.hashCode());
        System.assertEquals(comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties3.hashCode(), comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmMobileCoreImplRedirect comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties = new OASComDayCqWcmMobileCoreImplRedirect();
        Map<String, String> propertyMappings = comDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.getPropertyMappings();
        System.assertEquals('redirectEnabled', propertyMappings.get('redirect.enabled'));
        System.assertEquals('redirectStatsEnabled', propertyMappings.get('redirect.stats.enabled'));
        System.assertEquals('redirectExtensions', propertyMappings.get('redirect.extensions'));
        System.assertEquals('redirectPaths', propertyMappings.get('redirect.paths'));
    }
}
