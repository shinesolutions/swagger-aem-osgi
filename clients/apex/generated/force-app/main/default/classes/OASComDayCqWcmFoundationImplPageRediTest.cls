@isTest
private class OASComDayCqWcmFoundationImplPageRediTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties1 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties2 = comDayCqWcmFoundationImplPageRedirectServletProperties1;
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties3 = new OASComDayCqWcmFoundationImplPageRedi();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties4 = comDayCqWcmFoundationImplPageRedirectServletProperties3;

        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties1.equals(comDayCqWcmFoundationImplPageRedirectServletProperties2));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties2.equals(comDayCqWcmFoundationImplPageRedirectServletProperties1));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties1.equals(comDayCqWcmFoundationImplPageRedirectServletProperties1));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties3.equals(comDayCqWcmFoundationImplPageRedirectServletProperties4));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties4.equals(comDayCqWcmFoundationImplPageRedirectServletProperties3));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties3.equals(comDayCqWcmFoundationImplPageRedirectServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties1 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties2 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties3 = new OASComDayCqWcmFoundationImplPageRedi();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties4 = new OASComDayCqWcmFoundationImplPageRedi();

        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties1.equals(comDayCqWcmFoundationImplPageRedirectServletProperties2));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties2.equals(comDayCqWcmFoundationImplPageRedirectServletProperties1));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties3.equals(comDayCqWcmFoundationImplPageRedirectServletProperties4));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties4.equals(comDayCqWcmFoundationImplPageRedirectServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties1 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties2 = new OASComDayCqWcmFoundationImplPageRedi();

        System.assertEquals(false, comDayCqWcmFoundationImplPageRedirectServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationImplPageRedirectServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties1 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties2 = new OASComDayCqWcmFoundationImplPageRedi();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties3;

        System.assertEquals(false, comDayCqWcmFoundationImplPageRedirectServletProperties1.equals(comDayCqWcmFoundationImplPageRedirectServletProperties3));
        System.assertEquals(false, comDayCqWcmFoundationImplPageRedirectServletProperties2.equals(comDayCqWcmFoundationImplPageRedirectServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties1 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties2 = new OASComDayCqWcmFoundationImplPageRedi();

        System.assertEquals(comDayCqWcmFoundationImplPageRedirectServletProperties1.hashCode(), comDayCqWcmFoundationImplPageRedirectServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplPageRedirectServletProperties2.hashCode(), comDayCqWcmFoundationImplPageRedirectServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties1 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties2 = OASComDayCqWcmFoundationImplPageRedi.getExample();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties3 = new OASComDayCqWcmFoundationImplPageRedi();
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties4 = new OASComDayCqWcmFoundationImplPageRedi();

        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties1.equals(comDayCqWcmFoundationImplPageRedirectServletProperties2));
        System.assert(comDayCqWcmFoundationImplPageRedirectServletProperties3.equals(comDayCqWcmFoundationImplPageRedirectServletProperties4));
        System.assertEquals(comDayCqWcmFoundationImplPageRedirectServletProperties1.hashCode(), comDayCqWcmFoundationImplPageRedirectServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplPageRedirectServletProperties3.hashCode(), comDayCqWcmFoundationImplPageRedirectServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationImplPageRedi comDayCqWcmFoundationImplPageRedirectServletProperties = new OASComDayCqWcmFoundationImplPageRedi();
        Map<String, String> propertyMappings = comDayCqWcmFoundationImplPageRedirectServletProperties.getPropertyMappings();
        System.assertEquals('excludedResourceTypes', propertyMappings.get('excluded.resource.types'));
    }
}
