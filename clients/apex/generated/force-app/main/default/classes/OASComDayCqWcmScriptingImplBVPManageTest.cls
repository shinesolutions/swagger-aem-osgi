@isTest
private class OASComDayCqWcmScriptingImplBVPManageTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties1 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties2 = comDayCqWcmScriptingImplBVPManagerProperties1;
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties3 = new OASComDayCqWcmScriptingImplBVPManage();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties4 = comDayCqWcmScriptingImplBVPManagerProperties3;

        System.assert(comDayCqWcmScriptingImplBVPManagerProperties1.equals(comDayCqWcmScriptingImplBVPManagerProperties2));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties2.equals(comDayCqWcmScriptingImplBVPManagerProperties1));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties1.equals(comDayCqWcmScriptingImplBVPManagerProperties1));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties3.equals(comDayCqWcmScriptingImplBVPManagerProperties4));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties4.equals(comDayCqWcmScriptingImplBVPManagerProperties3));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties3.equals(comDayCqWcmScriptingImplBVPManagerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties1 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties2 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties3 = new OASComDayCqWcmScriptingImplBVPManage();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties4 = new OASComDayCqWcmScriptingImplBVPManage();

        System.assert(comDayCqWcmScriptingImplBVPManagerProperties1.equals(comDayCqWcmScriptingImplBVPManagerProperties2));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties2.equals(comDayCqWcmScriptingImplBVPManagerProperties1));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties3.equals(comDayCqWcmScriptingImplBVPManagerProperties4));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties4.equals(comDayCqWcmScriptingImplBVPManagerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties1 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties2 = new OASComDayCqWcmScriptingImplBVPManage();

        System.assertEquals(false, comDayCqWcmScriptingImplBVPManagerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmScriptingImplBVPManagerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties1 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties2 = new OASComDayCqWcmScriptingImplBVPManage();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties3;

        System.assertEquals(false, comDayCqWcmScriptingImplBVPManagerProperties1.equals(comDayCqWcmScriptingImplBVPManagerProperties3));
        System.assertEquals(false, comDayCqWcmScriptingImplBVPManagerProperties2.equals(comDayCqWcmScriptingImplBVPManagerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties1 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties2 = new OASComDayCqWcmScriptingImplBVPManage();

        System.assertEquals(comDayCqWcmScriptingImplBVPManagerProperties1.hashCode(), comDayCqWcmScriptingImplBVPManagerProperties1.hashCode());
        System.assertEquals(comDayCqWcmScriptingImplBVPManagerProperties2.hashCode(), comDayCqWcmScriptingImplBVPManagerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties1 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties2 = OASComDayCqWcmScriptingImplBVPManage.getExample();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties3 = new OASComDayCqWcmScriptingImplBVPManage();
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties4 = new OASComDayCqWcmScriptingImplBVPManage();

        System.assert(comDayCqWcmScriptingImplBVPManagerProperties1.equals(comDayCqWcmScriptingImplBVPManagerProperties2));
        System.assert(comDayCqWcmScriptingImplBVPManagerProperties3.equals(comDayCqWcmScriptingImplBVPManagerProperties4));
        System.assertEquals(comDayCqWcmScriptingImplBVPManagerProperties1.hashCode(), comDayCqWcmScriptingImplBVPManagerProperties2.hashCode());
        System.assertEquals(comDayCqWcmScriptingImplBVPManagerProperties3.hashCode(), comDayCqWcmScriptingImplBVPManagerProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComDayCqWcmScriptingImplBVPManage comDayCqWcmScriptingImplBVPManagerProperties = new OASComDayCqWcmScriptingImplBVPManage();
        Map<String, String> propertyMappings = comDayCqWcmScriptingImplBVPManagerProperties.getPropertyMappings();
        System.assertEquals('comDayCqWcmScriptingBvpScriptEngines', propertyMappings.get('com.day.cq.wcm.scripting.bvp.script.engines'));
    }
}
