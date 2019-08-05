@isTest
private class OASComDayCqWcmCoreImplPagePageManageTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2 = comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1;
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3 = new OASComDayCqWcmCoreImplPagePageManage();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4 = comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3;

        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3 = new OASComDayCqWcmCoreImplPagePageManage();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4 = new OASComDayCqWcmCoreImplPagePageManage();

        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2 = new OASComDayCqWcmCoreImplPagePageManage();

        System.assertEquals(false, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2 = new OASComDayCqWcmCoreImplPagePageManage();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2 = new OASComDayCqWcmCoreImplPagePageManage();

        System.assertEquals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.hashCode(), comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.hashCode(), comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2 = OASComDayCqWcmCoreImplPagePageManage.getExample();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3 = new OASComDayCqWcmCoreImplPagePageManage();
        OASComDayCqWcmCoreImplPagePageManage comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4 = new OASComDayCqWcmCoreImplPagePageManage();

        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2));
        System.assert(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3.equals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties1.hashCode(), comDayCqWcmCoreImplPagePageManagerFactoryImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplPagePageManagerFactoryImplProperties3.hashCode(), comDayCqWcmCoreImplPagePageManagerFactoryImplProperties4.hashCode());
    }
}
