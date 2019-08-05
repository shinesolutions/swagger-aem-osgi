@isTest
private class OASComDayCqContentsyncImplContentSynTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties1 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties2 = comDayCqContentsyncImplContentSyncManagerImplProperties1;
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties3 = new OASComDayCqContentsyncImplContentSyn();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties4 = comDayCqContentsyncImplContentSyncManagerImplProperties3;

        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties1.equals(comDayCqContentsyncImplContentSyncManagerImplProperties2));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties2.equals(comDayCqContentsyncImplContentSyncManagerImplProperties1));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties1.equals(comDayCqContentsyncImplContentSyncManagerImplProperties1));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties3.equals(comDayCqContentsyncImplContentSyncManagerImplProperties4));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties4.equals(comDayCqContentsyncImplContentSyncManagerImplProperties3));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties3.equals(comDayCqContentsyncImplContentSyncManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties1 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties2 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties3 = new OASComDayCqContentsyncImplContentSyn();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties4 = new OASComDayCqContentsyncImplContentSyn();

        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties1.equals(comDayCqContentsyncImplContentSyncManagerImplProperties2));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties2.equals(comDayCqContentsyncImplContentSyncManagerImplProperties1));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties3.equals(comDayCqContentsyncImplContentSyncManagerImplProperties4));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties4.equals(comDayCqContentsyncImplContentSyncManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties1 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties2 = new OASComDayCqContentsyncImplContentSyn();

        System.assertEquals(false, comDayCqContentsyncImplContentSyncManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqContentsyncImplContentSyncManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties1 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties2 = new OASComDayCqContentsyncImplContentSyn();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties3;

        System.assertEquals(false, comDayCqContentsyncImplContentSyncManagerImplProperties1.equals(comDayCqContentsyncImplContentSyncManagerImplProperties3));
        System.assertEquals(false, comDayCqContentsyncImplContentSyncManagerImplProperties2.equals(comDayCqContentsyncImplContentSyncManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties1 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties2 = new OASComDayCqContentsyncImplContentSyn();

        System.assertEquals(comDayCqContentsyncImplContentSyncManagerImplProperties1.hashCode(), comDayCqContentsyncImplContentSyncManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqContentsyncImplContentSyncManagerImplProperties2.hashCode(), comDayCqContentsyncImplContentSyncManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties1 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties2 = OASComDayCqContentsyncImplContentSyn.getExample();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties3 = new OASComDayCqContentsyncImplContentSyn();
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties4 = new OASComDayCqContentsyncImplContentSyn();

        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties1.equals(comDayCqContentsyncImplContentSyncManagerImplProperties2));
        System.assert(comDayCqContentsyncImplContentSyncManagerImplProperties3.equals(comDayCqContentsyncImplContentSyncManagerImplProperties4));
        System.assertEquals(comDayCqContentsyncImplContentSyncManagerImplProperties1.hashCode(), comDayCqContentsyncImplContentSyncManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqContentsyncImplContentSyncManagerImplProperties3.hashCode(), comDayCqContentsyncImplContentSyncManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqContentsyncImplContentSyn comDayCqContentsyncImplContentSyncManagerImplProperties = new OASComDayCqContentsyncImplContentSyn();
        Map<String, String> propertyMappings = comDayCqContentsyncImplContentSyncManagerImplProperties.getPropertyMappings();
        System.assertEquals('contentsyncFallbackAuthorizable', propertyMappings.get('contentsync.fallback.authorizable'));
        System.assertEquals('contentsyncFallbackUpdateuser', propertyMappings.get('contentsync.fallback.updateuser'));
    }
}
