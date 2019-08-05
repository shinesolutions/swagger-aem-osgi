@isTest
private class OASComDayCqWcmDesignimporterParserTaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2 = comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1;
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3 = new OASComDayCqWcmDesignimporterParserTa();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4 = comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3;

        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3 = new OASComDayCqWcmDesignimporterParserTa();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4 = new OASComDayCqWcmDesignimporterParserTa();

        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2 = new OASComDayCqWcmDesignimporterParserTa();

        System.assertEquals(false, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2 = new OASComDayCqWcmDesignimporterParserTa();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3;

        System.assertEquals(false, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3));
        System.assertEquals(false, comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2 = new OASComDayCqWcmDesignimporterParserTa();

        System.assertEquals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.hashCode(), comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.hashCode(), comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2 = OASComDayCqWcmDesignimporterParserTa.getExample();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3 = new OASComDayCqWcmDesignimporterParserTa();
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4 = new OASComDayCqWcmDesignimporterParserTa();

        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2));
        System.assert(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3.equals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4));
        System.assertEquals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties1.hashCode(), comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties2.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties3.hashCode(), comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmDesignimporterParserTa comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties = new OASComDayCqWcmDesignimporterParserTa();
        Map<String, String> propertyMappings = comDayCqWcmDesignimporterParserTaghandlersFactoryTitleTagHandlProperties.getPropertyMappings();
        System.assertEquals('serviceRanking', propertyMappings.get('service.ranking'));
    }
}
