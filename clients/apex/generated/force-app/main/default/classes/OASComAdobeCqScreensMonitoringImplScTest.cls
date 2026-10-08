@isTest
private class OASComAdobeCqScreensMonitoringImplScTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2 = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1;
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3 = new OASComAdobeCqScreensMonitoringImplSc();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4 = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3;

        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3 = new OASComAdobeCqScreensMonitoringImplSc();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4 = new OASComAdobeCqScreensMonitoringImplSc();

        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2 = new OASComAdobeCqScreensMonitoringImplSc();

        System.assertEquals(false, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2 = new OASComAdobeCqScreensMonitoringImplSc();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3;

        System.assertEquals(false, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3));
        System.assertEquals(false, comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2 = new OASComAdobeCqScreensMonitoringImplSc();

        System.assertEquals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.hashCode(), comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.hashCode(), comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2 = OASComAdobeCqScreensMonitoringImplSc.getExample();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3 = new OASComAdobeCqScreensMonitoringImplSc();
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4 = new OASComAdobeCqScreensMonitoringImplSc();

        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2));
        System.assert(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3.equals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4));
        System.assertEquals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties1.hashCode(), comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties3.hashCode(), comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqScreensMonitoringImplSc comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties = new OASComAdobeCqScreensMonitoringImplSc();
        Map<String, String> x-property-mappings = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.getx-property-mappings();
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username'));
        System.assertEquals('comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword', x-property-mappings.get('com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password'));
    }
}
