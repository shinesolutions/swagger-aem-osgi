@isTest
private class OASComAdobeCqDtmImplServiceDTMWebSerTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties1 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties2 = comAdobeCqDtmImplServiceDTMWebServiceImplProperties1;
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties3 = new OASComAdobeCqDtmImplServiceDTMWebSer();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties4 = comAdobeCqDtmImplServiceDTMWebServiceImplProperties3;

        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties2));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties4));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties4.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties1 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties2 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties3 = new OASComAdobeCqDtmImplServiceDTMWebSer();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties4 = new OASComAdobeCqDtmImplServiceDTMWebSer();

        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties2));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties4));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties4.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties1 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties2 = new OASComAdobeCqDtmImplServiceDTMWebSer();

        System.assertEquals(false, comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties1 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties2 = new OASComAdobeCqDtmImplServiceDTMWebSer();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties3;

        System.assertEquals(false, comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3));
        System.assertEquals(false, comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties1 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties2 = new OASComAdobeCqDtmImplServiceDTMWebSer();

        System.assertEquals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.hashCode(), comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.hashCode(), comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties1 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties2 = OASComAdobeCqDtmImplServiceDTMWebSer.getExample();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties3 = new OASComAdobeCqDtmImplServiceDTMWebSer();
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties4 = new OASComAdobeCqDtmImplServiceDTMWebSer();

        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties2));
        System.assert(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3.equals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties4));
        System.assertEquals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties1.hashCode(), comAdobeCqDtmImplServiceDTMWebServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDtmImplServiceDTMWebServiceImplProperties3.hashCode(), comAdobeCqDtmImplServiceDTMWebServiceImplProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASComAdobeCqDtmImplServiceDTMWebSer comAdobeCqDtmImplServiceDTMWebServiceImplProperties = new OASComAdobeCqDtmImplServiceDTMWebSer();
        Map<String, String> propertyMappings = comAdobeCqDtmImplServiceDTMWebServiceImplProperties.getPropertyMappings();
        System.assertEquals('connectionTimeout', propertyMappings.get('connection.timeout'));
        System.assertEquals('socketTimeout', propertyMappings.get('socket.timeout'));
    }
}
