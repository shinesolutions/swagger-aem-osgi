@isTest
private class OASComDayCqWcmFoundationFormsImplMaiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties1 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties2 = comDayCqWcmFoundationFormsImplMailServletProperties1;
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties3 = new OASComDayCqWcmFoundationFormsImplMai();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties4 = comDayCqWcmFoundationFormsImplMailServletProperties3;

        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties1.equals(comDayCqWcmFoundationFormsImplMailServletProperties2));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties2.equals(comDayCqWcmFoundationFormsImplMailServletProperties1));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties1.equals(comDayCqWcmFoundationFormsImplMailServletProperties1));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties3.equals(comDayCqWcmFoundationFormsImplMailServletProperties4));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties4.equals(comDayCqWcmFoundationFormsImplMailServletProperties3));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties3.equals(comDayCqWcmFoundationFormsImplMailServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties1 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties2 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties3 = new OASComDayCqWcmFoundationFormsImplMai();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties4 = new OASComDayCqWcmFoundationFormsImplMai();

        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties1.equals(comDayCqWcmFoundationFormsImplMailServletProperties2));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties2.equals(comDayCqWcmFoundationFormsImplMailServletProperties1));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties3.equals(comDayCqWcmFoundationFormsImplMailServletProperties4));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties4.equals(comDayCqWcmFoundationFormsImplMailServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties1 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties2 = new OASComDayCqWcmFoundationFormsImplMai();

        System.assertEquals(false, comDayCqWcmFoundationFormsImplMailServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationFormsImplMailServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties1 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties2 = new OASComDayCqWcmFoundationFormsImplMai();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties3;

        System.assertEquals(false, comDayCqWcmFoundationFormsImplMailServletProperties1.equals(comDayCqWcmFoundationFormsImplMailServletProperties3));
        System.assertEquals(false, comDayCqWcmFoundationFormsImplMailServletProperties2.equals(comDayCqWcmFoundationFormsImplMailServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties1 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties2 = new OASComDayCqWcmFoundationFormsImplMai();

        System.assertEquals(comDayCqWcmFoundationFormsImplMailServletProperties1.hashCode(), comDayCqWcmFoundationFormsImplMailServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationFormsImplMailServletProperties2.hashCode(), comDayCqWcmFoundationFormsImplMailServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties1 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties2 = OASComDayCqWcmFoundationFormsImplMai.getExample();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties3 = new OASComDayCqWcmFoundationFormsImplMai();
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties4 = new OASComDayCqWcmFoundationFormsImplMai();

        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties1.equals(comDayCqWcmFoundationFormsImplMailServletProperties2));
        System.assert(comDayCqWcmFoundationFormsImplMailServletProperties3.equals(comDayCqWcmFoundationFormsImplMailServletProperties4));
        System.assertEquals(comDayCqWcmFoundationFormsImplMailServletProperties1.hashCode(), comDayCqWcmFoundationFormsImplMailServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationFormsImplMailServletProperties3.hashCode(), comDayCqWcmFoundationFormsImplMailServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationFormsImplMai comDayCqWcmFoundationFormsImplMailServletProperties = new OASComDayCqWcmFoundationFormsImplMai();
        Map<String, String> propertyMappings = comDayCqWcmFoundationFormsImplMailServletProperties.getPropertyMappings();
        System.assertEquals('slingServletResourceTypes', propertyMappings.get('sling.servlet.resourceTypes'));
        System.assertEquals('slingServletSelectors', propertyMappings.get('sling.servlet.selectors'));
        System.assertEquals('resourceWhitelist', propertyMappings.get('resource.whitelist'));
        System.assertEquals('resourceBlacklist', propertyMappings.get('resource.blacklist'));
    }
}
