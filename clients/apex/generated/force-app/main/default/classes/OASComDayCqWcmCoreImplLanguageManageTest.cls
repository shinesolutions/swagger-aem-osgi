@isTest
private class OASComDayCqWcmCoreImplLanguageManageTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties1 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties2 = comDayCqWcmCoreImplLanguageManagerImplProperties1;
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties3 = new OASComDayCqWcmCoreImplLanguageManage();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties4 = comDayCqWcmCoreImplLanguageManagerImplProperties3;

        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties1.equals(comDayCqWcmCoreImplLanguageManagerImplProperties2));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties2.equals(comDayCqWcmCoreImplLanguageManagerImplProperties1));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties1.equals(comDayCqWcmCoreImplLanguageManagerImplProperties1));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties3.equals(comDayCqWcmCoreImplLanguageManagerImplProperties4));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties4.equals(comDayCqWcmCoreImplLanguageManagerImplProperties3));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties3.equals(comDayCqWcmCoreImplLanguageManagerImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties1 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties2 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties3 = new OASComDayCqWcmCoreImplLanguageManage();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties4 = new OASComDayCqWcmCoreImplLanguageManage();

        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties1.equals(comDayCqWcmCoreImplLanguageManagerImplProperties2));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties2.equals(comDayCqWcmCoreImplLanguageManagerImplProperties1));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties3.equals(comDayCqWcmCoreImplLanguageManagerImplProperties4));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties4.equals(comDayCqWcmCoreImplLanguageManagerImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties1 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties2 = new OASComDayCqWcmCoreImplLanguageManage();

        System.assertEquals(false, comDayCqWcmCoreImplLanguageManagerImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplLanguageManagerImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties1 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties2 = new OASComDayCqWcmCoreImplLanguageManage();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplLanguageManagerImplProperties1.equals(comDayCqWcmCoreImplLanguageManagerImplProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplLanguageManagerImplProperties2.equals(comDayCqWcmCoreImplLanguageManagerImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties1 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties2 = new OASComDayCqWcmCoreImplLanguageManage();

        System.assertEquals(comDayCqWcmCoreImplLanguageManagerImplProperties1.hashCode(), comDayCqWcmCoreImplLanguageManagerImplProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplLanguageManagerImplProperties2.hashCode(), comDayCqWcmCoreImplLanguageManagerImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties1 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties2 = OASComDayCqWcmCoreImplLanguageManage.getExample();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties3 = new OASComDayCqWcmCoreImplLanguageManage();
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties4 = new OASComDayCqWcmCoreImplLanguageManage();

        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties1.equals(comDayCqWcmCoreImplLanguageManagerImplProperties2));
        System.assert(comDayCqWcmCoreImplLanguageManagerImplProperties3.equals(comDayCqWcmCoreImplLanguageManagerImplProperties4));
        System.assertEquals(comDayCqWcmCoreImplLanguageManagerImplProperties1.hashCode(), comDayCqWcmCoreImplLanguageManagerImplProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplLanguageManagerImplProperties3.hashCode(), comDayCqWcmCoreImplLanguageManagerImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplLanguageManage comDayCqWcmCoreImplLanguageManagerImplProperties = new OASComDayCqWcmCoreImplLanguageManage();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplLanguageManagerImplProperties.getPropertyMappings();
        System.assertEquals('langmgrListPath', propertyMappings.get('langmgr.list.path'));
        System.assertEquals('langmgrCountryDefault', propertyMappings.get('langmgr.country.default'));
    }
}
