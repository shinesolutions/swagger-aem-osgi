@isTest
private class OASComDayCqDamCoreImplServletDamContTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties1 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties2 = comDayCqDamCoreImplServletDamContentDispositionFilterProperties1;
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties3 = new OASComDayCqDamCoreImplServletDamCont();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties4 = comDayCqDamCoreImplServletDamContentDispositionFilterProperties3;

        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties2));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties4));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties4.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties1 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties2 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties3 = new OASComDayCqDamCoreImplServletDamCont();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties4 = new OASComDayCqDamCoreImplServletDamCont();

        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties2));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties4));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties4.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties1 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties2 = new OASComDayCqDamCoreImplServletDamCont();

        System.assertEquals(false, comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties1 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties2 = new OASComDayCqDamCoreImplServletDamCont();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties1 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties2 = new OASComDayCqDamCoreImplServletDamCont();

        System.assertEquals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.hashCode(), comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.hashCode(), comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties1 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties2 = OASComDayCqDamCoreImplServletDamCont.getExample();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties3 = new OASComDayCqDamCoreImplServletDamCont();
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties4 = new OASComDayCqDamCoreImplServletDamCont();

        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties2));
        System.assert(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3.equals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties4));
        System.assertEquals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties1.hashCode(), comDayCqDamCoreImplServletDamContentDispositionFilterProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletDamContentDispositionFilterProperties3.hashCode(), comDayCqDamCoreImplServletDamContentDispositionFilterProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletDamCont comDayCqDamCoreImplServletDamContentDispositionFilterProperties = new OASComDayCqDamCoreImplServletDamCont();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletDamContentDispositionFilterProperties.getPropertyMappings();
        System.assertEquals('cqMimeTypeBlacklist', propertyMappings.get('cq.mime.type.blacklist'));
        System.assertEquals('cqDamEmptyMime', propertyMappings.get('cq.dam.empty.mime'));
    }
}
