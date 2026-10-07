@isTest
private class OASComDayCqPollingImporterImplManageTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties1 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties2 = comDayCqPollingImporterImplManagedPollConfigImplProperties1;
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties3 = new OASComDayCqPollingImporterImplManage();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties4 = comDayCqPollingImporterImplManagedPollConfigImplProperties3;

        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties1.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties2));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties2.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties1));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties1.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties1));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties3.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties4));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties4.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties3));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties3.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties1 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties2 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties3 = new OASComDayCqPollingImporterImplManage();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties4 = new OASComDayCqPollingImporterImplManage();

        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties1.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties2));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties2.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties1));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties3.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties4));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties4.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties1 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties2 = new OASComDayCqPollingImporterImplManage();

        System.assertEquals(false, comDayCqPollingImporterImplManagedPollConfigImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqPollingImporterImplManagedPollConfigImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties1 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties2 = new OASComDayCqPollingImporterImplManage();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties3;

        System.assertEquals(false, comDayCqPollingImporterImplManagedPollConfigImplProperties1.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties3));
        System.assertEquals(false, comDayCqPollingImporterImplManagedPollConfigImplProperties2.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties1 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties2 = new OASComDayCqPollingImporterImplManage();

        System.assertEquals(comDayCqPollingImporterImplManagedPollConfigImplProperties1.hashCode(), comDayCqPollingImporterImplManagedPollConfigImplProperties1.hashCode());
        System.assertEquals(comDayCqPollingImporterImplManagedPollConfigImplProperties2.hashCode(), comDayCqPollingImporterImplManagedPollConfigImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties1 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties2 = OASComDayCqPollingImporterImplManage.getExample();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties3 = new OASComDayCqPollingImporterImplManage();
        OASComDayCqPollingImporterImplManage comDayCqPollingImporterImplManagedPollConfigImplProperties4 = new OASComDayCqPollingImporterImplManage();

        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties1.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties2));
        System.assert(comDayCqPollingImporterImplManagedPollConfigImplProperties3.equals(comDayCqPollingImporterImplManagedPollConfigImplProperties4));
        System.assertEquals(comDayCqPollingImporterImplManagedPollConfigImplProperties1.hashCode(), comDayCqPollingImporterImplManagedPollConfigImplProperties2.hashCode());
        System.assertEquals(comDayCqPollingImporterImplManagedPollConfigImplProperties3.hashCode(), comDayCqPollingImporterImplManagedPollConfigImplProperties4.hashCode());
    }
}
