@isTest
private class OASComDayCqDamCoreImplHandlerXmpNComTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2 = comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1;
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3 = new OASComDayCqDamCoreImplHandlerXmpNCom();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4 = comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3;

        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3 = new OASComDayCqDamCoreImplHandlerXmpNCom();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4 = new OASComDayCqDamCoreImplHandlerXmpNCom();

        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2 = new OASComDayCqDamCoreImplHandlerXmpNCom();

        System.assertEquals(false, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2 = new OASComDayCqDamCoreImplHandlerXmpNCom();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2 = new OASComDayCqDamCoreImplHandlerXmpNCom();

        System.assertEquals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.hashCode(), comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2 = OASComDayCqDamCoreImplHandlerXmpNCom.getExample();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3 = new OASComDayCqDamCoreImplHandlerXmpNCom();
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4 = new OASComDayCqDamCoreImplHandlerXmpNCom();

        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3.equals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4));
        System.assertEquals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties3.hashCode(), comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplHandlerXmpNCom comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties = new OASComDayCqDamCoreImplHandlerXmpNCom();
        Map<String, String> propertyMappings = comDayCqDamCoreImplHandlerXmpNCommXMPHandlerProperties.getPropertyMappings();
        System.assertEquals('xmphandlerCqFormats', propertyMappings.get('xmphandler.cq.formats'));
    }
}
