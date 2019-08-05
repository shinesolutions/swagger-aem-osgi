@isTest
private class OASComDayCqWcmCoreImplServletsRefereTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties1 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties2 = comDayCqWcmCoreImplServletsReferenceSearchServletProperties1;
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties3 = new OASComDayCqWcmCoreImplServletsRefere();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties4 = comDayCqWcmCoreImplServletsReferenceSearchServletProperties3;

        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties4));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties4.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties1 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties2 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties3 = new OASComDayCqWcmCoreImplServletsRefere();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties4 = new OASComDayCqWcmCoreImplServletsRefere();

        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties4));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties4.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties1 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties2 = new OASComDayCqWcmCoreImplServletsRefere();

        System.assertEquals(false, comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties1 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties2 = new OASComDayCqWcmCoreImplServletsRefere();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties1 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties2 = new OASComDayCqWcmCoreImplServletsRefere();

        System.assertEquals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.hashCode(), comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.hashCode(), comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties1 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties2 = OASComDayCqWcmCoreImplServletsRefere.getExample();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties3 = new OASComDayCqWcmCoreImplServletsRefere();
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties4 = new OASComDayCqWcmCoreImplServletsRefere();

        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties2));
        System.assert(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3.equals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties4));
        System.assertEquals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties1.hashCode(), comDayCqWcmCoreImplServletsReferenceSearchServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplServletsReferenceSearchServletProperties3.hashCode(), comDayCqWcmCoreImplServletsReferenceSearchServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplServletsRefere comDayCqWcmCoreImplServletsReferenceSearchServletProperties = new OASComDayCqWcmCoreImplServletsRefere();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplServletsReferenceSearchServletProperties.getPropertyMappings();
        System.assertEquals('referencesearchservletMaxReferencesPerPage', propertyMappings.get('referencesearchservlet.maxReferencesPerPage'));
        System.assertEquals('referencesearchservletMaxPages', propertyMappings.get('referencesearchservlet.maxPages'));
    }
}
