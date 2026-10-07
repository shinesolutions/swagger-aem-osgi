@isTest
private class OASComDayCqDamCoreImplUiPreviewFoldeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2 = comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1;
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3 = new OASComDayCqDamCoreImplUiPreviewFolde();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4 = comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3;

        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3 = new OASComDayCqDamCoreImplUiPreviewFolde();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4 = new OASComDayCqDamCoreImplUiPreviewFolde();

        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2 = new OASComDayCqDamCoreImplUiPreviewFolde();

        System.assertEquals(false, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2 = new OASComDayCqDamCoreImplUiPreviewFolde();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3;

        System.assertEquals(false, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3));
        System.assertEquals(false, comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2 = new OASComDayCqDamCoreImplUiPreviewFolde();

        System.assertEquals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.hashCode(), comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.hashCode(), comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2 = OASComDayCqDamCoreImplUiPreviewFolde.getExample();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3 = new OASComDayCqDamCoreImplUiPreviewFolde();
        OASComDayCqDamCoreImplUiPreviewFolde comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4 = new OASComDayCqDamCoreImplUiPreviewFolde();

        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2));
        System.assert(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3.equals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4));
        System.assertEquals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties1.hashCode(), comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties3.hashCode(), comDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties4.hashCode());
    }
}
