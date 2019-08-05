@isTest
private class OASComDayCqDamHandlerGibsonFontmanagTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2 = comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1;
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3 = new OASComDayCqDamHandlerGibsonFontmanag();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4 = comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3;

        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3 = new OASComDayCqDamHandlerGibsonFontmanag();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4 = new OASComDayCqDamHandlerGibsonFontmanag();

        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2 = new OASComDayCqDamHandlerGibsonFontmanag();

        System.assertEquals(false, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2 = new OASComDayCqDamHandlerGibsonFontmanag();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3;

        System.assertEquals(false, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3));
        System.assertEquals(false, comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2 = new OASComDayCqDamHandlerGibsonFontmanag();

        System.assertEquals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.hashCode(), comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.hashCode());
        System.assertEquals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.hashCode(), comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2 = OASComDayCqDamHandlerGibsonFontmanag.getExample();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3 = new OASComDayCqDamHandlerGibsonFontmanag();
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4 = new OASComDayCqDamHandlerGibsonFontmanag();

        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2));
        System.assert(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3.equals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4));
        System.assertEquals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties1.hashCode(), comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties2.hashCode());
        System.assertEquals(comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties3.hashCode(), comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqDamHandlerGibsonFontmanag comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties = new OASComDayCqDamHandlerGibsonFontmanag();
        Map<String, String> propertyMappings = comDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties.getPropertyMappings();
        System.assertEquals('eventFilter', propertyMappings.get('event.filter'));
        System.assertEquals('fontmgrSystemFontDir', propertyMappings.get('fontmgr.system.font.dir'));
        System.assertEquals('fontmgrAdobeFontDir', propertyMappings.get('fontmgr.adobe.font.dir'));
        System.assertEquals('fontmgrCustomerFontDir', propertyMappings.get('fontmgr.customer.font.dir'));
    }
}
