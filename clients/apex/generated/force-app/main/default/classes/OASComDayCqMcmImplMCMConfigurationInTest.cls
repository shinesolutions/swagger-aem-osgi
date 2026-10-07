@isTest
private class OASComDayCqMcmImplMCMConfigurationInTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo1 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo2 = comDayCqMcmImplMCMConfigurationInfo1;
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo3 = new OASComDayCqMcmImplMCMConfigurationIn();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo4 = comDayCqMcmImplMCMConfigurationInfo3;

        System.assert(comDayCqMcmImplMCMConfigurationInfo1.equals(comDayCqMcmImplMCMConfigurationInfo2));
        System.assert(comDayCqMcmImplMCMConfigurationInfo2.equals(comDayCqMcmImplMCMConfigurationInfo1));
        System.assert(comDayCqMcmImplMCMConfigurationInfo1.equals(comDayCqMcmImplMCMConfigurationInfo1));
        System.assert(comDayCqMcmImplMCMConfigurationInfo3.equals(comDayCqMcmImplMCMConfigurationInfo4));
        System.assert(comDayCqMcmImplMCMConfigurationInfo4.equals(comDayCqMcmImplMCMConfigurationInfo3));
        System.assert(comDayCqMcmImplMCMConfigurationInfo3.equals(comDayCqMcmImplMCMConfigurationInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo1 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo2 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo3 = new OASComDayCqMcmImplMCMConfigurationIn();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo4 = new OASComDayCqMcmImplMCMConfigurationIn();

        System.assert(comDayCqMcmImplMCMConfigurationInfo1.equals(comDayCqMcmImplMCMConfigurationInfo2));
        System.assert(comDayCqMcmImplMCMConfigurationInfo2.equals(comDayCqMcmImplMCMConfigurationInfo1));
        System.assert(comDayCqMcmImplMCMConfigurationInfo3.equals(comDayCqMcmImplMCMConfigurationInfo4));
        System.assert(comDayCqMcmImplMCMConfigurationInfo4.equals(comDayCqMcmImplMCMConfigurationInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo1 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo2 = new OASComDayCqMcmImplMCMConfigurationIn();

        System.assertEquals(false, comDayCqMcmImplMCMConfigurationInfo1.equals('foo'));
        System.assertEquals(false, comDayCqMcmImplMCMConfigurationInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo1 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo2 = new OASComDayCqMcmImplMCMConfigurationIn();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo3;

        System.assertEquals(false, comDayCqMcmImplMCMConfigurationInfo1.equals(comDayCqMcmImplMCMConfigurationInfo3));
        System.assertEquals(false, comDayCqMcmImplMCMConfigurationInfo2.equals(comDayCqMcmImplMCMConfigurationInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo1 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo2 = new OASComDayCqMcmImplMCMConfigurationIn();

        System.assertEquals(comDayCqMcmImplMCMConfigurationInfo1.hashCode(), comDayCqMcmImplMCMConfigurationInfo1.hashCode());
        System.assertEquals(comDayCqMcmImplMCMConfigurationInfo2.hashCode(), comDayCqMcmImplMCMConfigurationInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo1 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo2 = OASComDayCqMcmImplMCMConfigurationIn.getExample();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo3 = new OASComDayCqMcmImplMCMConfigurationIn();
        OASComDayCqMcmImplMCMConfigurationIn comDayCqMcmImplMCMConfigurationInfo4 = new OASComDayCqMcmImplMCMConfigurationIn();

        System.assert(comDayCqMcmImplMCMConfigurationInfo1.equals(comDayCqMcmImplMCMConfigurationInfo2));
        System.assert(comDayCqMcmImplMCMConfigurationInfo3.equals(comDayCqMcmImplMCMConfigurationInfo4));
        System.assertEquals(comDayCqMcmImplMCMConfigurationInfo1.hashCode(), comDayCqMcmImplMCMConfigurationInfo2.hashCode());
        System.assertEquals(comDayCqMcmImplMCMConfigurationInfo3.hashCode(), comDayCqMcmImplMCMConfigurationInfo4.hashCode());
    }
}
