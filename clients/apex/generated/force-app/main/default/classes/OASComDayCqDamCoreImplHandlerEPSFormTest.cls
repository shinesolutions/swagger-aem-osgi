@isTest
private class OASComDayCqDamCoreImplHandlerEPSFormTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2 = comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1;
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3 = new OASComDayCqDamCoreImplHandlerEPSForm();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4 = comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3;

        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3 = new OASComDayCqDamCoreImplHandlerEPSForm();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4 = new OASComDayCqDamCoreImplHandlerEPSForm();

        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2 = new OASComDayCqDamCoreImplHandlerEPSForm();

        System.assertEquals(false, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2 = new OASComDayCqDamCoreImplHandlerEPSForm();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2 = new OASComDayCqDamCoreImplHandlerEPSForm();

        System.assertEquals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.hashCode(), comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2 = OASComDayCqDamCoreImplHandlerEPSForm.getExample();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3 = new OASComDayCqDamCoreImplHandlerEPSForm();
        OASComDayCqDamCoreImplHandlerEPSForm comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4 = new OASComDayCqDamCoreImplHandlerEPSForm();

        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4));
        System.assertEquals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerEPSFormatHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerEPSFormatHandlerProperties3.hashCode(), comDayCqDamCoreImplHandlerEPSFormatHandlerProperties4.hashCode());
    }
}
