@isTest
private class OASComDayCqAuthImplCugCugSupportImplTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties1 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties2 = comDayCqAuthImplCugCugSupportImplProperties1;
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties3 = new OASComDayCqAuthImplCugCugSupportImpl();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties4 = comDayCqAuthImplCugCugSupportImplProperties3;

        System.assert(comDayCqAuthImplCugCugSupportImplProperties1.equals(comDayCqAuthImplCugCugSupportImplProperties2));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties2.equals(comDayCqAuthImplCugCugSupportImplProperties1));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties1.equals(comDayCqAuthImplCugCugSupportImplProperties1));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties3.equals(comDayCqAuthImplCugCugSupportImplProperties4));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties4.equals(comDayCqAuthImplCugCugSupportImplProperties3));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties3.equals(comDayCqAuthImplCugCugSupportImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties1 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties2 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties3 = new OASComDayCqAuthImplCugCugSupportImpl();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties4 = new OASComDayCqAuthImplCugCugSupportImpl();

        System.assert(comDayCqAuthImplCugCugSupportImplProperties1.equals(comDayCqAuthImplCugCugSupportImplProperties2));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties2.equals(comDayCqAuthImplCugCugSupportImplProperties1));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties3.equals(comDayCqAuthImplCugCugSupportImplProperties4));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties4.equals(comDayCqAuthImplCugCugSupportImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties1 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties2 = new OASComDayCqAuthImplCugCugSupportImpl();

        System.assertEquals(false, comDayCqAuthImplCugCugSupportImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqAuthImplCugCugSupportImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties1 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties2 = new OASComDayCqAuthImplCugCugSupportImpl();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties3;

        System.assertEquals(false, comDayCqAuthImplCugCugSupportImplProperties1.equals(comDayCqAuthImplCugCugSupportImplProperties3));
        System.assertEquals(false, comDayCqAuthImplCugCugSupportImplProperties2.equals(comDayCqAuthImplCugCugSupportImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties1 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties2 = new OASComDayCqAuthImplCugCugSupportImpl();

        System.assertEquals(comDayCqAuthImplCugCugSupportImplProperties1.hashCode(), comDayCqAuthImplCugCugSupportImplProperties1.hashCode());
        System.assertEquals(comDayCqAuthImplCugCugSupportImplProperties2.hashCode(), comDayCqAuthImplCugCugSupportImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties1 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties2 = OASComDayCqAuthImplCugCugSupportImpl.getExample();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties3 = new OASComDayCqAuthImplCugCugSupportImpl();
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties4 = new OASComDayCqAuthImplCugCugSupportImpl();

        System.assert(comDayCqAuthImplCugCugSupportImplProperties1.equals(comDayCqAuthImplCugCugSupportImplProperties2));
        System.assert(comDayCqAuthImplCugCugSupportImplProperties3.equals(comDayCqAuthImplCugCugSupportImplProperties4));
        System.assertEquals(comDayCqAuthImplCugCugSupportImplProperties1.hashCode(), comDayCqAuthImplCugCugSupportImplProperties2.hashCode());
        System.assertEquals(comDayCqAuthImplCugCugSupportImplProperties3.hashCode(), comDayCqAuthImplCugCugSupportImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqAuthImplCugCugSupportImpl comDayCqAuthImplCugCugSupportImplProperties = new OASComDayCqAuthImplCugCugSupportImpl();
        Map<String, String> propertyMappings = comDayCqAuthImplCugCugSupportImplProperties.getPropertyMappings();
        System.assertEquals('cugExemptedPrincipals', propertyMappings.get('cug.exempted.principals'));
        System.assertEquals('cugEnabled', propertyMappings.get('cug.enabled'));
        System.assertEquals('cugPrincipalsRegex', propertyMappings.get('cug.principals.regex'));
        System.assertEquals('cugPrincipalsReplacement', propertyMappings.get('cug.principals.replacement'));
    }
}
