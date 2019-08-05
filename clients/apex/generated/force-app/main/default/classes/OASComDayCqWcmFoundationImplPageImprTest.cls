@isTest
private class OASComDayCqWcmFoundationImplPageImprTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties1 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties2 = comDayCqWcmFoundationImplPageImpressionsTrackerProperties1;
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties3 = new OASComDayCqWcmFoundationImplPageImpr();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties4 = comDayCqWcmFoundationImplPageImpressionsTrackerProperties3;

        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties2));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties4));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties4.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties1 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties2 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties3 = new OASComDayCqWcmFoundationImplPageImpr();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties4 = new OASComDayCqWcmFoundationImplPageImpr();

        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties2));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties4));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties4.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties1 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties2 = new OASComDayCqWcmFoundationImplPageImpr();

        System.assertEquals(false, comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties1 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties2 = new OASComDayCqWcmFoundationImplPageImpr();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties3;

        System.assertEquals(false, comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3));
        System.assertEquals(false, comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties1 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties2 = new OASComDayCqWcmFoundationImplPageImpr();

        System.assertEquals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.hashCode(), comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.hashCode(), comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties1 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties2 = OASComDayCqWcmFoundationImplPageImpr.getExample();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties3 = new OASComDayCqWcmFoundationImplPageImpr();
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties4 = new OASComDayCqWcmFoundationImplPageImpr();

        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties2));
        System.assert(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3.equals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties4));
        System.assertEquals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties1.hashCode(), comDayCqWcmFoundationImplPageImpressionsTrackerProperties2.hashCode());
        System.assertEquals(comDayCqWcmFoundationImplPageImpressionsTrackerProperties3.hashCode(), comDayCqWcmFoundationImplPageImpressionsTrackerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmFoundationImplPageImpr comDayCqWcmFoundationImplPageImpressionsTrackerProperties = new OASComDayCqWcmFoundationImplPageImpr();
        Map<String, String> propertyMappings = comDayCqWcmFoundationImplPageImpressionsTrackerProperties.getPropertyMappings();
        System.assertEquals('slingAuthRequirements', propertyMappings.get('sling.auth.requirements'));
    }
}
