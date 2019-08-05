@isTest
private class OASComDayCqSearchSuggestImplSuggestiTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2 = comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1;
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3 = new OASComDayCqSearchSuggestImplSuggesti();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4 = comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3;

        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3 = new OASComDayCqSearchSuggestImplSuggesti();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4 = new OASComDayCqSearchSuggestImplSuggesti();

        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2 = new OASComDayCqSearchSuggestImplSuggesti();

        System.assertEquals(false, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2 = new OASComDayCqSearchSuggestImplSuggesti();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3;

        System.assertEquals(false, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3));
        System.assertEquals(false, comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2 = new OASComDayCqSearchSuggestImplSuggesti();

        System.assertEquals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.hashCode(), comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.hashCode(), comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2 = OASComDayCqSearchSuggestImplSuggesti.getExample();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3 = new OASComDayCqSearchSuggestImplSuggesti();
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4 = new OASComDayCqSearchSuggestImplSuggesti();

        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2));
        System.assert(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3.equals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4));
        System.assertEquals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties1.hashCode(), comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties3.hashCode(), comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqSearchSuggestImplSuggesti comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties = new OASComDayCqSearchSuggestImplSuggesti();
        Map<String, String> propertyMappings = comDayCqSearchSuggestImplSuggestionIndexManagerImplProperties.getPropertyMappings();
        System.assertEquals('pathBuilderTarget', propertyMappings.get('pathBuilder.target'));
        System.assertEquals('suggestBasepath', propertyMappings.get('suggest.basepath'));
    }
}
