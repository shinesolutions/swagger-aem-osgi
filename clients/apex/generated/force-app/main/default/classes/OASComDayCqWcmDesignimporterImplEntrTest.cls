@isTest
private class OASComDayCqWcmDesignimporterImplEntrTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2 = comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1;
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3 = new OASComDayCqWcmDesignimporterImplEntr();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4 = comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3;

        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3 = new OASComDayCqWcmDesignimporterImplEntr();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4 = new OASComDayCqWcmDesignimporterImplEntr();

        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2 = new OASComDayCqWcmDesignimporterImplEntr();

        System.assertEquals(false, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2 = new OASComDayCqWcmDesignimporterImplEntr();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3;

        System.assertEquals(false, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3));
        System.assertEquals(false, comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2 = new OASComDayCqWcmDesignimporterImplEntr();

        System.assertEquals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.hashCode(), comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.hashCode(), comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2 = OASComDayCqWcmDesignimporterImplEntr.getExample();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3 = new OASComDayCqWcmDesignimporterImplEntr();
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4 = new OASComDayCqWcmDesignimporterImplEntr();

        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2));
        System.assert(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3.equals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4));
        System.assertEquals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties1.hashCode(), comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties3.hashCode(), comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmDesignimporterImplEntr comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties = new OASComDayCqWcmDesignimporterImplEntr();
        Map<String, String> propertyMappings = comDayCqWcmDesignimporterImplEntryPreprocessorImplProperties.getPropertyMappings();
        System.assertEquals('searchPattern', propertyMappings.get('search.pattern'));
        System.assertEquals('replacePattern', propertyMappings.get('replace.pattern'));
    }
}
