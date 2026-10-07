@isTest
private class OASComAdobeCqProjectsPurgeSchedulerITest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo1 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo2 = comAdobeCqProjectsPurgeSchedulerInfo1;
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo3 = new OASComAdobeCqProjectsPurgeSchedulerI();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo4 = comAdobeCqProjectsPurgeSchedulerInfo3;

        System.assert(comAdobeCqProjectsPurgeSchedulerInfo1.equals(comAdobeCqProjectsPurgeSchedulerInfo2));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo2.equals(comAdobeCqProjectsPurgeSchedulerInfo1));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo1.equals(comAdobeCqProjectsPurgeSchedulerInfo1));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo3.equals(comAdobeCqProjectsPurgeSchedulerInfo4));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo4.equals(comAdobeCqProjectsPurgeSchedulerInfo3));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo3.equals(comAdobeCqProjectsPurgeSchedulerInfo3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo1 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo2 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo3 = new OASComAdobeCqProjectsPurgeSchedulerI();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo4 = new OASComAdobeCqProjectsPurgeSchedulerI();

        System.assert(comAdobeCqProjectsPurgeSchedulerInfo1.equals(comAdobeCqProjectsPurgeSchedulerInfo2));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo2.equals(comAdobeCqProjectsPurgeSchedulerInfo1));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo3.equals(comAdobeCqProjectsPurgeSchedulerInfo4));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo4.equals(comAdobeCqProjectsPurgeSchedulerInfo3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo1 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo2 = new OASComAdobeCqProjectsPurgeSchedulerI();

        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerInfo1.equals('foo'));
        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerInfo2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo1 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo2 = new OASComAdobeCqProjectsPurgeSchedulerI();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo3;

        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerInfo1.equals(comAdobeCqProjectsPurgeSchedulerInfo3));
        System.assertEquals(false, comAdobeCqProjectsPurgeSchedulerInfo2.equals(comAdobeCqProjectsPurgeSchedulerInfo3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo1 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo2 = new OASComAdobeCqProjectsPurgeSchedulerI();

        System.assertEquals(comAdobeCqProjectsPurgeSchedulerInfo1.hashCode(), comAdobeCqProjectsPurgeSchedulerInfo1.hashCode());
        System.assertEquals(comAdobeCqProjectsPurgeSchedulerInfo2.hashCode(), comAdobeCqProjectsPurgeSchedulerInfo2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo1 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo2 = OASComAdobeCqProjectsPurgeSchedulerI.getExample();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo3 = new OASComAdobeCqProjectsPurgeSchedulerI();
        OASComAdobeCqProjectsPurgeSchedulerI comAdobeCqProjectsPurgeSchedulerInfo4 = new OASComAdobeCqProjectsPurgeSchedulerI();

        System.assert(comAdobeCqProjectsPurgeSchedulerInfo1.equals(comAdobeCqProjectsPurgeSchedulerInfo2));
        System.assert(comAdobeCqProjectsPurgeSchedulerInfo3.equals(comAdobeCqProjectsPurgeSchedulerInfo4));
        System.assertEquals(comAdobeCqProjectsPurgeSchedulerInfo1.hashCode(), comAdobeCqProjectsPurgeSchedulerInfo2.hashCode());
        System.assertEquals(comAdobeCqProjectsPurgeSchedulerInfo3.hashCode(), comAdobeCqProjectsPurgeSchedulerInfo4.hashCode());
    }
}
