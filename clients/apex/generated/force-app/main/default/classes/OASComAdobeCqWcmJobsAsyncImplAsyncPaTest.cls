@isTest
private class OASComAdobeCqWcmJobsAsyncImplAsyncPaTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2 = comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1;
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4 = comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3;

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3;

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();

        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncPa.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();
        OASComAdobeCqWcmJobsAsyncImplAsyncPa comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncPa();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4));
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties3.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncPageMoveConfigProviderServiceProperties4.hashCode());
    }
}
