@isTest
private class OASComDayCqDamCoreImplServletCompaniTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties1 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties2 = comDayCqDamCoreImplServletCompanionServletProperties1;
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties3 = new OASComDayCqDamCoreImplServletCompani();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties4 = comDayCqDamCoreImplServletCompanionServletProperties3;

        System.assert(comDayCqDamCoreImplServletCompanionServletProperties1.equals(comDayCqDamCoreImplServletCompanionServletProperties2));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties2.equals(comDayCqDamCoreImplServletCompanionServletProperties1));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties1.equals(comDayCqDamCoreImplServletCompanionServletProperties1));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties3.equals(comDayCqDamCoreImplServletCompanionServletProperties4));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties4.equals(comDayCqDamCoreImplServletCompanionServletProperties3));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties3.equals(comDayCqDamCoreImplServletCompanionServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties1 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties2 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties3 = new OASComDayCqDamCoreImplServletCompani();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties4 = new OASComDayCqDamCoreImplServletCompani();

        System.assert(comDayCqDamCoreImplServletCompanionServletProperties1.equals(comDayCqDamCoreImplServletCompanionServletProperties2));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties2.equals(comDayCqDamCoreImplServletCompanionServletProperties1));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties3.equals(comDayCqDamCoreImplServletCompanionServletProperties4));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties4.equals(comDayCqDamCoreImplServletCompanionServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties1 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties2 = new OASComDayCqDamCoreImplServletCompani();

        System.assertEquals(false, comDayCqDamCoreImplServletCompanionServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamCoreImplServletCompanionServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties1 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties2 = new OASComDayCqDamCoreImplServletCompani();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties3;

        System.assertEquals(false, comDayCqDamCoreImplServletCompanionServletProperties1.equals(comDayCqDamCoreImplServletCompanionServletProperties3));
        System.assertEquals(false, comDayCqDamCoreImplServletCompanionServletProperties2.equals(comDayCqDamCoreImplServletCompanionServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties1 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties2 = new OASComDayCqDamCoreImplServletCompani();

        System.assertEquals(comDayCqDamCoreImplServletCompanionServletProperties1.hashCode(), comDayCqDamCoreImplServletCompanionServletProperties1.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletCompanionServletProperties2.hashCode(), comDayCqDamCoreImplServletCompanionServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties1 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties2 = OASComDayCqDamCoreImplServletCompani.getExample();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties3 = new OASComDayCqDamCoreImplServletCompani();
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties4 = new OASComDayCqDamCoreImplServletCompani();

        System.assert(comDayCqDamCoreImplServletCompanionServletProperties1.equals(comDayCqDamCoreImplServletCompanionServletProperties2));
        System.assert(comDayCqDamCoreImplServletCompanionServletProperties3.equals(comDayCqDamCoreImplServletCompanionServletProperties4));
        System.assertEquals(comDayCqDamCoreImplServletCompanionServletProperties1.hashCode(), comDayCqDamCoreImplServletCompanionServletProperties2.hashCode());
        System.assertEquals(comDayCqDamCoreImplServletCompanionServletProperties3.hashCode(), comDayCqDamCoreImplServletCompanionServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamCoreImplServletCompani comDayCqDamCoreImplServletCompanionServletProperties = new OASComDayCqDamCoreImplServletCompani();
        Map<String, String> propertyMappings = comDayCqDamCoreImplServletCompanionServletProperties.getPropertyMappings();
        System.assertEquals('moreInfo', propertyMappings.get('More Info'));
        System.assertEquals('mntoverlaydamguicontentassetsmoreinfoHtmlpath', propertyMappings.get('/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}'));
    }
}
