@isTest
private class OASComDayCqWcmContentsyncImplHandlerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2 = comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1;
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3 = new OASComDayCqWcmContentsyncImplHandler();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4 = comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3;

        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3 = new OASComDayCqWcmContentsyncImplHandler();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4 = new OASComDayCqWcmContentsyncImplHandler();

        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2 = new OASComDayCqWcmContentsyncImplHandler();

        System.assertEquals(false, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2 = new OASComDayCqWcmContentsyncImplHandler();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3;

        System.assertEquals(false, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3));
        System.assertEquals(false, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2 = new OASComDayCqWcmContentsyncImplHandler();

        System.assertEquals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.hashCode(), comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.hashCode());
        System.assertEquals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.hashCode(), comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2 = OASComDayCqWcmContentsyncImplHandler.getExample();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3 = new OASComDayCqWcmContentsyncImplHandler();
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4 = new OASComDayCqWcmContentsyncImplHandler();

        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2));
        System.assert(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3.equals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4));
        System.assertEquals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties1.hashCode(), comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties2.hashCode());
        System.assertEquals(comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties3.hashCode(), comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmContentsyncImplHandler comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties = new OASComDayCqWcmContentsyncImplHandler();
        Map<String, String> propertyMappings = comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.getPropertyMappings();
        System.assertEquals('cqPagesupdatehandlerImageresourcetypes', propertyMappings.get('cq.pagesupdatehandler.imageresourcetypes'));
    }
}
