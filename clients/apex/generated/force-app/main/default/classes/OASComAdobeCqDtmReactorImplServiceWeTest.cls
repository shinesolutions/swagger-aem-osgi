@isTest
private class OASComAdobeCqDtmReactorImplServiceWeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties1 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties2 = comAdobeCqDtmReactorImplServiceWebServiceImplProperties1;
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties3 = new OASComAdobeCqDtmReactorImplServiceWe();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties4 = comAdobeCqDtmReactorImplServiceWebServiceImplProperties3;

        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties2));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties4));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties4.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties1 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties2 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties3 = new OASComAdobeCqDtmReactorImplServiceWe();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties4 = new OASComAdobeCqDtmReactorImplServiceWe();

        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties2));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties4));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties4.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties1 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties2 = new OASComAdobeCqDtmReactorImplServiceWe();

        System.assertEquals(false, comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties1 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties2 = new OASComAdobeCqDtmReactorImplServiceWe();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties3;

        System.assertEquals(false, comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3));
        System.assertEquals(false, comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties1 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties2 = new OASComAdobeCqDtmReactorImplServiceWe();

        System.assertEquals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.hashCode(), comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.hashCode());
        System.assertEquals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.hashCode(), comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties1 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties2 = OASComAdobeCqDtmReactorImplServiceWe.getExample();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties3 = new OASComAdobeCqDtmReactorImplServiceWe();
        OASComAdobeCqDtmReactorImplServiceWe comAdobeCqDtmReactorImplServiceWebServiceImplProperties4 = new OASComAdobeCqDtmReactorImplServiceWe();

        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties2));
        System.assert(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3.equals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties4));
        System.assertEquals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties1.hashCode(), comAdobeCqDtmReactorImplServiceWebServiceImplProperties2.hashCode());
        System.assertEquals(comAdobeCqDtmReactorImplServiceWebServiceImplProperties3.hashCode(), comAdobeCqDtmReactorImplServiceWebServiceImplProperties4.hashCode());
    }
}
