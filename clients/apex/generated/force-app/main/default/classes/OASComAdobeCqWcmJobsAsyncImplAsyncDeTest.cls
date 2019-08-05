@isTest
private class OASComAdobeCqWcmJobsAsyncImplAsyncDeTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2 = comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1;
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4 = comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3;

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3;

        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3));
        System.assertEquals(false, comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();

        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2 = OASComAdobeCqWcmJobsAsyncImplAsyncDe.getExample();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();
        OASComAdobeCqWcmJobsAsyncImplAsyncDe comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4 = new OASComAdobeCqWcmJobsAsyncImplAsyncDe();

        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2));
        System.assert(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3.equals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4));
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties1.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties2.hashCode());
        System.assertEquals(comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties3.hashCode(), comAdobeCqWcmJobsAsyncImplAsyncDeleteConfigProviderServiceProperties4.hashCode());
    }
}
