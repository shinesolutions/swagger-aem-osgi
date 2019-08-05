@isTest
private class OASComAdobeCqDtmImplServletsDTMDeploTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties1 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties2 = comAdobeCqDtmImplServletsDTMDeployHookServletProperties1;
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties3 = new OASComAdobeCqDtmImplServletsDTMDeplo();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties4 = comAdobeCqDtmImplServletsDTMDeployHookServletProperties3;

        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties2));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties4));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties4.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties1 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties2 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties3 = new OASComAdobeCqDtmImplServletsDTMDeplo();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties4 = new OASComAdobeCqDtmImplServletsDTMDeplo();

        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties2));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties4));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties4.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties1 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties2 = new OASComAdobeCqDtmImplServletsDTMDeplo();

        System.assertEquals(false, comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties1 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties2 = new OASComAdobeCqDtmImplServletsDTMDeplo();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties3;

        System.assertEquals(false, comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3));
        System.assertEquals(false, comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties1 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties2 = new OASComAdobeCqDtmImplServletsDTMDeplo();

        System.assertEquals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.hashCode(), comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.hashCode());
        System.assertEquals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.hashCode(), comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties1 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties2 = OASComAdobeCqDtmImplServletsDTMDeplo.getExample();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties3 = new OASComAdobeCqDtmImplServletsDTMDeplo();
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties4 = new OASComAdobeCqDtmImplServletsDTMDeplo();

        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties2));
        System.assert(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3.equals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties4));
        System.assertEquals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties1.hashCode(), comAdobeCqDtmImplServletsDTMDeployHookServletProperties2.hashCode());
        System.assertEquals(comAdobeCqDtmImplServletsDTMDeployHookServletProperties3.hashCode(), comAdobeCqDtmImplServletsDTMDeployHookServletProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDtmImplServletsDTMDeplo comAdobeCqDtmImplServletsDTMDeployHookServletProperties = new OASComAdobeCqDtmImplServletsDTMDeplo();
        Map<String, String> propertyMappings = comAdobeCqDtmImplServletsDTMDeployHookServletProperties.getPropertyMappings();
        System.assertEquals('dtmStagingIpWhitelist', propertyMappings.get('dtm.staging.ip.whitelist'));
        System.assertEquals('dtmProductionIpWhitelist', propertyMappings.get('dtm.production.ip.whitelist'));
    }
}
