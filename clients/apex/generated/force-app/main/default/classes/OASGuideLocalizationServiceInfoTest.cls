@isTest
private class OASGuideLocalizationServiceInfoTest {
    @isTest
    private static void equalsSameInstance() {
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo1 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo2 = guideLocalizationServiceInfo1;
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo3 = new OASGuideLocalizationServiceInfo();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo4 = guideLocalizationServiceInfo3;

        System.assert(guideLocalizationServiceInfo1.equals(guideLocalizationServiceInfo2));
        System.assert(guideLocalizationServiceInfo2.equals(guideLocalizationServiceInfo1));
        System.assert(guideLocalizationServiceInfo1.equals(guideLocalizationServiceInfo1));
        System.assert(guideLocalizationServiceInfo3.equals(guideLocalizationServiceInfo4));
        System.assert(guideLocalizationServiceInfo4.equals(guideLocalizationServiceInfo3));
        System.assert(guideLocalizationServiceInfo3.equals(guideLocalizationServiceInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo1 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo2 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo3 = new OASGuideLocalizationServiceInfo();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo4 = new OASGuideLocalizationServiceInfo();

        System.assert(guideLocalizationServiceInfo1.equals(guideLocalizationServiceInfo2));
        System.assert(guideLocalizationServiceInfo2.equals(guideLocalizationServiceInfo1));
        System.assert(guideLocalizationServiceInfo3.equals(guideLocalizationServiceInfo4));
        System.assert(guideLocalizationServiceInfo4.equals(guideLocalizationServiceInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo1 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo2 = new OASGuideLocalizationServiceInfo();

        System.assertEquals(false, guideLocalizationServiceInfo1.equals('foo'));
        System.assertEquals(false, guideLocalizationServiceInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo1 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo2 = new OASGuideLocalizationServiceInfo();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo3;

        System.assertEquals(false, guideLocalizationServiceInfo1.equals(guideLocalizationServiceInfo3));
        System.assertEquals(false, guideLocalizationServiceInfo2.equals(guideLocalizationServiceInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo1 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo2 = new OASGuideLocalizationServiceInfo();

        System.assertEquals(guideLocalizationServiceInfo1.hashCode(), guideLocalizationServiceInfo1.hashCode());
        System.assertEquals(guideLocalizationServiceInfo2.hashCode(), guideLocalizationServiceInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo1 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo2 = OASGuideLocalizationServiceInfo.getExample();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo3 = new OASGuideLocalizationServiceInfo();
        OASGuideLocalizationServiceInfo guideLocalizationServiceInfo4 = new OASGuideLocalizationServiceInfo();

        System.assert(guideLocalizationServiceInfo1.equals(guideLocalizationServiceInfo2));
        System.assert(guideLocalizationServiceInfo3.equals(guideLocalizationServiceInfo4));
        System.assertEquals(guideLocalizationServiceInfo1.hashCode(), guideLocalizationServiceInfo2.hashCode());
        System.assertEquals(guideLocalizationServiceInfo3.hashCode(), guideLocalizationServiceInfo4.hashCode());
    }
}
