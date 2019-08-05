@isTest
private class OASComDayCqTaggingImplSearchTagPrediTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2 = comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1;
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3 = new OASComDayCqTaggingImplSearchTagPredi();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4 = comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3;

        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3 = new OASComDayCqTaggingImplSearchTagPredi();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4 = new OASComDayCqTaggingImplSearchTagPredi();

        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2 = new OASComDayCqTaggingImplSearchTagPredi();

        System.assertEquals(false, comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.equals('foo'));
        System.assertEquals(false, comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2 = new OASComDayCqTaggingImplSearchTagPredi();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3;

        System.assertEquals(false, comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3));
        System.assertEquals(false, comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2 = new OASComDayCqTaggingImplSearchTagPredi();

        System.assertEquals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.hashCode(), comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.hashCode());
        System.assertEquals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.hashCode(), comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2 = OASComDayCqTaggingImplSearchTagPredi.getExample();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3 = new OASComDayCqTaggingImplSearchTagPredi();
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4 = new OASComDayCqTaggingImplSearchTagPredi();

        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2));
        System.assert(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3.equals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4));
        System.assertEquals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties1.hashCode(), comDayCqTaggingImplSearchTagPredicateEvaluatorProperties2.hashCode());
        System.assertEquals(comDayCqTaggingImplSearchTagPredicateEvaluatorProperties3.hashCode(), comDayCqTaggingImplSearchTagPredicateEvaluatorProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqTaggingImplSearchTagPredi comDayCqTaggingImplSearchTagPredicateEvaluatorProperties = new OASComDayCqTaggingImplSearchTagPredi();
        Map<String, String> propertyMappings = comDayCqTaggingImplSearchTagPredicateEvaluatorProperties.getPropertyMappings();
        System.assertEquals('ignorePath', propertyMappings.get('ignore_path'));
    }
}
