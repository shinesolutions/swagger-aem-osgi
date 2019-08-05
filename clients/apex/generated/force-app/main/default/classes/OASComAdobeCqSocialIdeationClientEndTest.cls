@isTest
private class OASComAdobeCqSocialIdeationClientEndTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2 = comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1;
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3 = new OASComAdobeCqSocialIdeationClientEnd();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4 = comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3;

        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3 = new OASComAdobeCqSocialIdeationClientEnd();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4 = new OASComAdobeCqSocialIdeationClientEnd();

        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2 = new OASComAdobeCqSocialIdeationClientEnd();

        System.assertEquals(false, comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.equals('foo'));
        System.assertEquals(false, comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2 = new OASComAdobeCqSocialIdeationClientEnd();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3;

        System.assertEquals(false, comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3));
        System.assertEquals(false, comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2 = new OASComAdobeCqSocialIdeationClientEnd();

        System.assertEquals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.hashCode(), comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.hashCode());
        System.assertEquals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.hashCode(), comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2 = OASComAdobeCqSocialIdeationClientEnd.getExample();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3 = new OASComAdobeCqSocialIdeationClientEnd();
        OASComAdobeCqSocialIdeationClientEnd comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4 = new OASComAdobeCqSocialIdeationClientEnd();

        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2));
        System.assert(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3.equals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4));
        System.assertEquals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties1.hashCode(), comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties2.hashCode());
        System.assertEquals(comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties3.hashCode(), comAdobeCqSocialIdeationClientEndpointsImplIdeationOperationsSProperties4.hashCode());
    }
}
