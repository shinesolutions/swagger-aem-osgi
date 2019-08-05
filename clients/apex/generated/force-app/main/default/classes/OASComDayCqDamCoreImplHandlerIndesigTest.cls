@isTest
private class OASComDayCqDamCoreImplHandlerIndesigTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2 = comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1;
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3 = new OASComDayCqDamCoreImplHandlerIndesig();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4 = comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3;

        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3 = new OASComDayCqDamCoreImplHandlerIndesig();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4 = new OASComDayCqDamCoreImplHandlerIndesig();

        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2 = new OASComDayCqDamCoreImplHandlerIndesig();

        System.assertEquals(false, comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2 = new OASComDayCqDamCoreImplHandlerIndesig();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3;

        System.assertEquals(false, comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3));
        System.assertEquals(false, comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2 = new OASComDayCqDamCoreImplHandlerIndesig();

        System.assertEquals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.hashCode(), comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2 = OASComDayCqDamCoreImplHandlerIndesig.getExample();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3 = new OASComDayCqDamCoreImplHandlerIndesig();
        OASComDayCqDamCoreImplHandlerIndesig comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4 = new OASComDayCqDamCoreImplHandlerIndesig();

        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2));
        System.assert(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3.equals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4));
        System.assertEquals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties1.hashCode(), comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties3.hashCode(), comDayCqDamCoreImplHandlerIndesignFormatHandlerProperties4.hashCode());
    }
}
