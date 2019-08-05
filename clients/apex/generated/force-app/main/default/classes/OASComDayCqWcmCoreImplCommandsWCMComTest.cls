@isTest
private class OASComDayCqWcmCoreImplCommandsWCMComTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties1 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties2 = comDayCqWcmCoreImplCommandsWCMCommandServletProperties1;
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties3 = new OASComDayCqWcmCoreImplCommandsWCMCom();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties4 = comDayCqWcmCoreImplCommandsWCMCommandServletProperties3;

        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties2));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties4));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties4.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties1 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties2 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties3 = new OASComDayCqWcmCoreImplCommandsWCMCom();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties4 = new OASComDayCqWcmCoreImplCommandsWCMCom();

        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties2));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties4));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties4.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties1 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties2 = new OASComDayCqWcmCoreImplCommandsWCMCom();

        System.assertEquals(false, comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties1 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties2 = new OASComDayCqWcmCoreImplCommandsWCMCom();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties1 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties2 = new OASComDayCqWcmCoreImplCommandsWCMCom();

        System.assertEquals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.hashCode(), comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.hashCode(), comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties1 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties2 = OASComDayCqWcmCoreImplCommandsWCMCom.getExample();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties3 = new OASComDayCqWcmCoreImplCommandsWCMCom();
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties4 = new OASComDayCqWcmCoreImplCommandsWCMCom();

        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties2));
        System.assert(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3.equals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties4));
        System.assertEquals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties1.hashCode(), comDayCqWcmCoreImplCommandsWCMCommandServletProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplCommandsWCMCommandServletProperties3.hashCode(), comDayCqWcmCoreImplCommandsWCMCommandServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmCoreImplCommandsWCMCom comDayCqWcmCoreImplCommandsWCMCommandServletProperties = new OASComDayCqWcmCoreImplCommandsWCMCom();
        Map<String, String> propertyMappings = comDayCqWcmCoreImplCommandsWCMCommandServletProperties.getPropertyMappings();
        System.assertEquals('wcmcommandservletDeleteWhitelist', propertyMappings.get('wcmcommandservlet.delete_whitelist'));
    }
}
