@isTest
private class OASComAdobeCqWcmJobsAsyncImplAsyncMoTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2 = comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1;
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4 = comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3;

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3;

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();

        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncMo.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();
        OASComAdobeCqWcmJobsAsyncImplAsyncMo comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncMo();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4));
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties3.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties4.hashCode());
    }
}
