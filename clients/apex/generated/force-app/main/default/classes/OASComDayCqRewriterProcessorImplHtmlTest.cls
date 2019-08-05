@isTest
private class OASComDayCqRewriterProcessorImplHtmlTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties1 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties2 = comDayCqRewriterProcessorImplHtmlParserFactoryProperties1;
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties3 = new OASComDayCqRewriterProcessorImplHtml();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties4 = comDayCqRewriterProcessorImplHtmlParserFactoryProperties3;

        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties2));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties4));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties4.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties1 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties2 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties3 = new OASComDayCqRewriterProcessorImplHtml();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties4 = new OASComDayCqRewriterProcessorImplHtml();

        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties2));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties4));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties4.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties1 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties2 = new OASComDayCqRewriterProcessorImplHtml();

        System.assertEquals(false, comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.equals('foo'));
        System.assertEquals(false, comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties1 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties2 = new OASComDayCqRewriterProcessorImplHtml();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties3;

        System.assertEquals(false, comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3));
        System.assertEquals(false, comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties1 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties2 = new OASComDayCqRewriterProcessorImplHtml();

        System.assertEquals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.hashCode(), comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.hashCode());
        System.assertEquals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.hashCode(), comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties1 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties2 = OASComDayCqRewriterProcessorImplHtml.getExample();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties3 = new OASComDayCqRewriterProcessorImplHtml();
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties4 = new OASComDayCqRewriterProcessorImplHtml();

        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties2));
        System.assert(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3.equals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties4));
        System.assertEquals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties1.hashCode(), comDayCqRewriterProcessorImplHtmlParserFactoryProperties2.hashCode());
        System.assertEquals(comDayCqRewriterProcessorImplHtmlParserFactoryProperties3.hashCode(), comDayCqRewriterProcessorImplHtmlParserFactoryProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqRewriterProcessorImplHtml comDayCqRewriterProcessorImplHtmlParserFactoryProperties = new OASComDayCqRewriterProcessorImplHtml();
        Map<String, String> propertyMappings = comDayCqRewriterProcessorImplHtmlParserFactoryProperties.getPropertyMappings();
        System.assertEquals('htmlparserProcessTags', propertyMappings.get('htmlparser.processTags'));
        System.assertEquals('htmlparserPreserveCamelCase', propertyMappings.get('htmlparser.preserveCamelCase'));
    }
}
