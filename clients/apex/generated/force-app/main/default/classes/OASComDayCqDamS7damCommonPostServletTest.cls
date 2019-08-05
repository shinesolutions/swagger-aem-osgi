@isTest
private class OASComDayCqDamS7damCommonPostServletTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2 = comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1;
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3 = new OASComDayCqDamS7damCommonPostServlet();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4 = comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3;

        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3 = new OASComDayCqDamS7damCommonPostServlet();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4 = new OASComDayCqDamS7damCommonPostServlet();

        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2 = new OASComDayCqDamS7damCommonPostServlet();

        System.assertEquals(false, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2 = new OASComDayCqDamS7damCommonPostServlet();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3;

        System.assertEquals(false, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3));
        System.assertEquals(false, comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2 = new OASComDayCqDamS7damCommonPostServlet();

        System.assertEquals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.hashCode(), comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.hashCode(), comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2 = OASComDayCqDamS7damCommonPostServlet.getExample();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3 = new OASComDayCqDamS7damCommonPostServlet();
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4 = new OASComDayCqDamS7damCommonPostServlet();

        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2));
        System.assert(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3.equals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4));
        System.assertEquals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties1.hashCode(), comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties3.hashCode(), comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamS7damCommonPostServlet comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties = new OASComDayCqDamS7damCommonPostServlet();
        Map<String, String> propertyMappings = comDayCqDamS7damCommonPostServletsSetModifyHandlerProperties.getPropertyMappings();
        System.assertEquals('slingPostOperation', propertyMappings.get('sling.post.operation'));
        System.assertEquals('slingServletMethods', propertyMappings.get('sling.servlet.methods'));
    }
}
