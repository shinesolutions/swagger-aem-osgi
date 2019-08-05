@isTest
private class OASComDayCqDamCoreImplGfxCommonsGfxRTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties1 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties2 = comDayCqDamCoreImplGfxCommonsGfxRendererProperties1;
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties3 = new OASComDayCqDamCoreImplGfxCommonsGfxR();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties4 = comDayCqDamCoreImplGfxCommonsGfxRendererProperties3;

        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties2));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties4));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties4.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties1 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties2 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties3 = new OASComDayCqDamCoreImplGfxCommonsGfxR();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties4 = new OASComDayCqDamCoreImplGfxCommonsGfxR();

        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties2));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties4));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties4.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties1 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties2 = new OASComDayCqDamCoreImplGfxCommonsGfxR();

        System.assertEquals(false, comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties1 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties2 = new OASComDayCqDamCoreImplGfxCommonsGfxR();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties3;

        System.assertEquals(false, comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3));
        System.assertEquals(false, comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties1 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties2 = new OASComDayCqDamCoreImplGfxCommonsGfxR();

        System.assertEquals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.hashCode(), comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.hashCode(), comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties1 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties2 = OASComDayCqDamCoreImplGfxCommonsGfxR.getExample();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties3 = new OASComDayCqDamCoreImplGfxCommonsGfxR();
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties4 = new OASComDayCqDamCoreImplGfxCommonsGfxR();

        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties2));
        System.assert(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3.equals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties4));
        System.assertEquals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties1.hashCode(), comDayCqDamCoreImplGfxCommonsGfxRendererProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplGfxCommonsGfxRendererProperties3.hashCode(), comDayCqDamCoreImplGfxCommonsGfxRendererProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplGfxCommonsGfxR comDayCqDamCoreImplGfxCommonsGfxRendererProperties = new OASComDayCqDamCoreImplGfxCommonsGfxR();
        Map<String, String> propertyMappings = comDayCqDamCoreImplGfxCommonsGfxRendererProperties.getPropertyMappings();
        System.assertEquals('skipBufferedcache', propertyMappings.get('skip.bufferedcache'));
    }
}
