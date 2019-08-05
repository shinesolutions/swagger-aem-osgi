@isTest
private class OASComAdobeGraniteOmnisearchImplCoreTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2 = comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1;
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3 = new OASComAdobeGraniteOmnisearchImplCore();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4 = comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3;

        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3 = new OASComAdobeGraniteOmnisearchImplCore();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4 = new OASComAdobeGraniteOmnisearchImplCore();

        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2 = new OASComAdobeGraniteOmnisearchImplCore();

        System.assertEquals(false, comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2 = new OASComAdobeGraniteOmnisearchImplCore();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3;

        System.assertEquals(false, comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3));
        System.assertEquals(false, comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2 = new OASComAdobeGraniteOmnisearchImplCore();

        System.assertEquals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.hashCode(), comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.hashCode(), comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2 = OASComAdobeGraniteOmnisearchImplCore.getExample();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3 = new OASComAdobeGraniteOmnisearchImplCore();
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4 = new OASComAdobeGraniteOmnisearchImplCore();

        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2));
        System.assert(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3.equals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4));
        System.assertEquals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties1.hashCode(), comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties3.hashCode(), comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOmnisearchImplCore comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties = new OASComAdobeGraniteOmnisearchImplCore();
        Map<String, String> propertyMappings = comAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties.getPropertyMappings();
        System.assertEquals('omnisearchSuggestionRequiretextMin', propertyMappings.get('omnisearch.suggestion.requiretext.min'));
        System.assertEquals('omnisearchSuggestionSpellcheckRequire', propertyMappings.get('omnisearch.suggestion.spellcheck.require'));
    }
}
