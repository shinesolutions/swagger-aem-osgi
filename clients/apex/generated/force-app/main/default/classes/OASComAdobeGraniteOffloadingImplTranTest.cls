@isTest
private class OASComAdobeGraniteOffloadingImplTranTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2 = comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1;
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3 = new OASComAdobeGraniteOffloadingImplTran();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4 = comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3;

        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3 = new OASComAdobeGraniteOffloadingImplTran();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4 = new OASComAdobeGraniteOffloadingImplTran();

        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2 = new OASComAdobeGraniteOffloadingImplTran();

        System.assertEquals(false, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2 = new OASComAdobeGraniteOffloadingImplTran();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3;

        System.assertEquals(false, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3));
        System.assertEquals(false, comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2 = new OASComAdobeGraniteOffloadingImplTran();

        System.assertEquals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.hashCode(), comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.hashCode());
        System.assertEquals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.hashCode(), comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2 = OASComAdobeGraniteOffloadingImplTran.getExample();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3 = new OASComAdobeGraniteOffloadingImplTran();
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4 = new OASComAdobeGraniteOffloadingImplTran();

        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2));
        System.assert(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3.equals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4));
        System.assertEquals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties1.hashCode(), comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties2.hashCode());
        System.assertEquals(comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties3.hashCode(), comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeGraniteOffloadingImplTran comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties = new OASComAdobeGraniteOffloadingImplTran();
        Map<String, String> propertyMappings = comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.getPropertyMappings();
        System.assertEquals('defaultTransportAgentToWorkerPrefix', propertyMappings.get('default.transport.agent-to-worker.prefix'));
        System.assertEquals('defaultTransportAgentToMasterPrefix', propertyMappings.get('default.transport.agent-to-master.prefix'));
        System.assertEquals('defaultTransportInputPackage', propertyMappings.get('default.transport.input.package'));
        System.assertEquals('defaultTransportOutputPackage', propertyMappings.get('default.transport.output.package'));
        System.assertEquals('defaultTransportReplicationSynchronous', propertyMappings.get('default.transport.replication.synchronous'));
        System.assertEquals('defaultTransportContentpackage', propertyMappings.get('default.transport.contentpackage'));
        System.assertEquals('offloadingTransporterDefaultEnabled', propertyMappings.get('offloading.transporter.default.enabled'));
    }
}
