@isTest
private class OASComDayCqDamInddImplServletSnippetTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties1 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties2 = comDayCqDamInddImplServletSnippetCreationServletProperties1;
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties3 = new OASComDayCqDamInddImplServletSnippet();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties4 = comDayCqDamInddImplServletSnippetCreationServletProperties3;

        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties1.equals(comDayCqDamInddImplServletSnippetCreationServletProperties2));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties2.equals(comDayCqDamInddImplServletSnippetCreationServletProperties1));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties1.equals(comDayCqDamInddImplServletSnippetCreationServletProperties1));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties3.equals(comDayCqDamInddImplServletSnippetCreationServletProperties4));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties4.equals(comDayCqDamInddImplServletSnippetCreationServletProperties3));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties3.equals(comDayCqDamInddImplServletSnippetCreationServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties1 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties2 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties3 = new OASComDayCqDamInddImplServletSnippet();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties4 = new OASComDayCqDamInddImplServletSnippet();

        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties1.equals(comDayCqDamInddImplServletSnippetCreationServletProperties2));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties2.equals(comDayCqDamInddImplServletSnippetCreationServletProperties1));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties3.equals(comDayCqDamInddImplServletSnippetCreationServletProperties4));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties4.equals(comDayCqDamInddImplServletSnippetCreationServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties1 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties2 = new OASComDayCqDamInddImplServletSnippet();

        System.assertEquals(false, comDayCqDamInddImplServletSnippetCreationServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamInddImplServletSnippetCreationServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties1 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties2 = new OASComDayCqDamInddImplServletSnippet();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties3;

        System.assertEquals(false, comDayCqDamInddImplServletSnippetCreationServletProperties1.equals(comDayCqDamInddImplServletSnippetCreationServletProperties3));
        System.assertEquals(false, comDayCqDamInddImplServletSnippetCreationServletProperties2.equals(comDayCqDamInddImplServletSnippetCreationServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties1 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties2 = new OASComDayCqDamInddImplServletSnippet();

        System.assertEquals(comDayCqDamInddImplServletSnippetCreationServletProperties1.hashCode(), comDayCqDamInddImplServletSnippetCreationServletProperties1.hashCode());
        System.assertEquals(comDayCqDamInddImplServletSnippetCreationServletProperties2.hashCode(), comDayCqDamInddImplServletSnippetCreationServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties1 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties2 = OASComDayCqDamInddImplServletSnippet.getExample();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties3 = new OASComDayCqDamInddImplServletSnippet();
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties4 = new OASComDayCqDamInddImplServletSnippet();

        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties1.equals(comDayCqDamInddImplServletSnippetCreationServletProperties2));
        System.assert(comDayCqDamInddImplServletSnippetCreationServletProperties3.equals(comDayCqDamInddImplServletSnippetCreationServletProperties4));
        System.assertEquals(comDayCqDamInddImplServletSnippetCreationServletProperties1.hashCode(), comDayCqDamInddImplServletSnippetCreationServletProperties2.hashCode());
        System.assertEquals(comDayCqDamInddImplServletSnippetCreationServletProperties3.hashCode(), comDayCqDamInddImplServletSnippetCreationServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamInddImplServletSnippet comDayCqDamInddImplServletSnippetCreationServletProperties = new OASComDayCqDamInddImplServletSnippet();
        Map<String, String> propertyMappings = comDayCqDamInddImplServletSnippetCreationServletProperties.getPropertyMappings();
        System.assertEquals('snippetcreationMaxcollections', propertyMappings.get('snippetcreation.maxcollections'));
    }
}
