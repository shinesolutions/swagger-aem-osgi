@isTest
private class OASComDayCqDamS7damCommonServletsS7dTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2 = comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1;
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3 = new OASComDayCqDamS7damCommonServletsS7d();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4 = comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3;

        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3 = new OASComDayCqDamS7damCommonServletsS7d();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4 = new OASComDayCqDamS7damCommonServletsS7d();

        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2 = new OASComDayCqDamS7damCommonServletsS7d();

        System.assertEquals(false, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2 = new OASComDayCqDamS7damCommonServletsS7d();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3;

        System.assertEquals(false, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3));
        System.assertEquals(false, comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2 = new OASComDayCqDamS7damCommonServletsS7d();

        System.assertEquals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.hashCode(), comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.hashCode());
        System.assertEquals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.hashCode(), comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2 = OASComDayCqDamS7damCommonServletsS7d.getExample();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3 = new OASComDayCqDamS7damCommonServletsS7d();
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4 = new OASComDayCqDamS7damCommonServletsS7d();

        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2));
        System.assert(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3.equals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4));
        System.assertEquals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties1.hashCode(), comDayCqDamS7damCommonServletsS7damProductInfoServletProperties2.hashCode());
        System.assertEquals(comDayCqDamS7damCommonServletsS7damProductInfoServletProperties3.hashCode(), comDayCqDamS7damCommonServletsS7damProductInfoServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamS7damCommonServletsS7d comDayCqDamS7damCommonServletsS7damProductInfoServletProperties = new OASComDayCqDamS7damCommonServletsS7d();
        Map<String, String> propertyMappings = comDayCqDamS7damCommonServletsS7damProductInfoServletProperties.getPropertyMappings();
        System.assertEquals('slingServletPaths', propertyMappings.get('sling.servlet.paths'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
    }
}
