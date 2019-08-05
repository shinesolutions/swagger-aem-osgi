@isTest
private class OASComDayCqReportingImplRLogAnalyzerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties1 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties2 = comDayCqReportingImplRLogAnalyzerProperties1;
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties3 = new OASComDayCqReportingImplRLogAnalyzer();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties4 = comDayCqReportingImplRLogAnalyzerProperties3;

        System.assert(comDayCqReportingImplRLogAnalyzerProperties1.equals(comDayCqReportingImplRLogAnalyzerProperties2));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties2.equals(comDayCqReportingImplRLogAnalyzerProperties1));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties1.equals(comDayCqReportingImplRLogAnalyzerProperties1));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties3.equals(comDayCqReportingImplRLogAnalyzerProperties4));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties4.equals(comDayCqReportingImplRLogAnalyzerProperties3));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties3.equals(comDayCqReportingImplRLogAnalyzerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties1 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties2 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties3 = new OASComDayCqReportingImplRLogAnalyzer();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties4 = new OASComDayCqReportingImplRLogAnalyzer();

        System.assert(comDayCqReportingImplRLogAnalyzerProperties1.equals(comDayCqReportingImplRLogAnalyzerProperties2));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties2.equals(comDayCqReportingImplRLogAnalyzerProperties1));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties3.equals(comDayCqReportingImplRLogAnalyzerProperties4));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties4.equals(comDayCqReportingImplRLogAnalyzerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties1 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties2 = new OASComDayCqReportingImplRLogAnalyzer();

        System.assertEquals(false, comDayCqReportingImplRLogAnalyzerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqReportingImplRLogAnalyzerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties1 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties2 = new OASComDayCqReportingImplRLogAnalyzer();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties3;

        System.assertEquals(false, comDayCqReportingImplRLogAnalyzerProperties1.equals(comDayCqReportingImplRLogAnalyzerProperties3));
        System.assertEquals(false, comDayCqReportingImplRLogAnalyzerProperties2.equals(comDayCqReportingImplRLogAnalyzerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties1 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties2 = new OASComDayCqReportingImplRLogAnalyzer();

        System.assertEquals(comDayCqReportingImplRLogAnalyzerProperties1.hashCode(), comDayCqReportingImplRLogAnalyzerProperties1.hashCode());
        System.assertEquals(comDayCqReportingImplRLogAnalyzerProperties2.hashCode(), comDayCqReportingImplRLogAnalyzerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties1 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties2 = OASComDayCqReportingImplRLogAnalyzer.getExample();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties3 = new OASComDayCqReportingImplRLogAnalyzer();
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties4 = new OASComDayCqReportingImplRLogAnalyzer();

        System.assert(comDayCqReportingImplRLogAnalyzerProperties1.equals(comDayCqReportingImplRLogAnalyzerProperties2));
        System.assert(comDayCqReportingImplRLogAnalyzerProperties3.equals(comDayCqReportingImplRLogAnalyzerProperties4));
        System.assertEquals(comDayCqReportingImplRLogAnalyzerProperties1.hashCode(), comDayCqReportingImplRLogAnalyzerProperties2.hashCode());
        System.assertEquals(comDayCqReportingImplRLogAnalyzerProperties3.hashCode(), comDayCqReportingImplRLogAnalyzerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqReportingImplRLogAnalyzer comDayCqReportingImplRLogAnalyzerProperties = new OASComDayCqReportingImplRLogAnalyzer();
        Map<String, String> propertyMappings = comDayCqReportingImplRLogAnalyzerProperties.getPropertyMappings();
        System.assertEquals('requestLogOutput', propertyMappings.get('request.log.output'));
    }
}
