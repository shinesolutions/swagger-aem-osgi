@isTest
private class OASComAdobeXmpWorkerFilesNcommXMPFilTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2 = comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1;
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3 = new OASComAdobeXmpWorkerFilesNcommXMPFil();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4 = comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3;

        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3 = new OASComAdobeXmpWorkerFilesNcommXMPFil();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4 = new OASComAdobeXmpWorkerFilesNcommXMPFil();

        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2 = new OASComAdobeXmpWorkerFilesNcommXMPFil();

        System.assertEquals(false, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.equals('foo'));
        System.assertEquals(false, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2 = new OASComAdobeXmpWorkerFilesNcommXMPFil();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3;

        System.assertEquals(false, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3));
        System.assertEquals(false, comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2 = new OASComAdobeXmpWorkerFilesNcommXMPFil();

        System.assertEquals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.hashCode(), comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.hashCode());
        System.assertEquals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.hashCode(), comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2 = OASComAdobeXmpWorkerFilesNcommXMPFil.getExample();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3 = new OASComAdobeXmpWorkerFilesNcommXMPFil();
        OASComAdobeXmpWorkerFilesNcommXMPFil comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4 = new OASComAdobeXmpWorkerFilesNcommXMPFil();

        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2));
        System.assert(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3.equals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4));
        System.assertEquals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties1.hashCode(), comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties2.hashCode());
        System.assertEquals(comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties3.hashCode(), comAdobeXmpWorkerFilesNcommXMPFilesNCommProperties4.hashCode());
    }
}
