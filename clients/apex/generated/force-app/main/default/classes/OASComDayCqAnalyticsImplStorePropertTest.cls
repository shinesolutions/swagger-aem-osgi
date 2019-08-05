@isTest
private class OASComDayCqAnalyticsImplStorePropertTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2 = comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1;
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3 = new OASComDayCqAnalyticsImplStorePropert();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4 = comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3;

        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3 = new OASComDayCqAnalyticsImplStorePropert();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4 = new OASComDayCqAnalyticsImplStorePropert();

        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2 = new OASComDayCqAnalyticsImplStorePropert();

        System.assertEquals(false, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2 = new OASComDayCqAnalyticsImplStorePropert();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3;

        System.assertEquals(false, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3));
        System.assertEquals(false, comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2 = new OASComDayCqAnalyticsImplStorePropert();

        System.assertEquals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.hashCode(), comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.hashCode());
        System.assertEquals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.hashCode(), comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2 = OASComDayCqAnalyticsImplStorePropert.getExample();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3 = new OASComDayCqAnalyticsImplStorePropert();
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4 = new OASComDayCqAnalyticsImplStorePropert();

        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2));
        System.assert(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3.equals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4));
        System.assertEquals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties1.hashCode(), comDayCqAnalyticsImplStorePropertiesChangeListenerProperties2.hashCode());
        System.assertEquals(comDayCqAnalyticsImplStorePropertiesChangeListenerProperties3.hashCode(), comDayCqAnalyticsImplStorePropertiesChangeListenerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqAnalyticsImplStorePropert comDayCqAnalyticsImplStorePropertiesChangeListenerProperties = new OASComDayCqAnalyticsImplStorePropert();
        Map<String, String> propertyMappings = comDayCqAnalyticsImplStorePropertiesChangeListenerProperties.getPropertyMappings();
        System.assertEquals('cqStoreListenerAdditionalStorePaths', propertyMappings.get('cq.store.listener.additionalStorePaths'));
    }
}
