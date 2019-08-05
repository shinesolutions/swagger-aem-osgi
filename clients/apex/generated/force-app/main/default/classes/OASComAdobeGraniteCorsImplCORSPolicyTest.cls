@isTest
private class OASComAdobeGraniteCorsImplCORSPolicyTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties1 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties2 = comAdobeGraniteCorsImplCORSPolicyImplProperties1;
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties3 = new OASComAdobeGraniteCorsImplCORSPolicy();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties4 = comAdobeGraniteCorsImplCORSPolicyImplProperties3;

        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties1.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties2));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties2.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties1));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties1.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties1));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties3.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties4));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties4.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties3));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties3.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties1 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties2 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties3 = new OASComAdobeGraniteCorsImplCORSPolicy();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties4 = new OASComAdobeGraniteCorsImplCORSPolicy();

        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties1.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties2));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties2.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties1));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties3.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties4));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties4.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties1 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties2 = new OASComAdobeGraniteCorsImplCORSPolicy();

        System.assertEquals(false, comAdobeGraniteCorsImplCORSPolicyImplProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteCorsImplCORSPolicyImplProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties1 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties2 = new OASComAdobeGraniteCorsImplCORSPolicy();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties3;

        System.assertEquals(false, comAdobeGraniteCorsImplCORSPolicyImplProperties1.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties3));
        System.assertEquals(false, comAdobeGraniteCorsImplCORSPolicyImplProperties2.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties1 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties2 = new OASComAdobeGraniteCorsImplCORSPolicy();

        System.assertEquals(comAdobeGraniteCorsImplCORSPolicyImplProperties1.hashCode(), comAdobeGraniteCorsImplCORSPolicyImplProperties1.hashCode());
        System.assertEquals(comAdobeGraniteCorsImplCORSPolicyImplProperties2.hashCode(), comAdobeGraniteCorsImplCORSPolicyImplProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties1 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties2 = OASComAdobeGraniteCorsImplCORSPolicy.getExample();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties3 = new OASComAdobeGraniteCorsImplCORSPolicy();
        OASComAdobeGraniteCorsImplCORSPolicy comAdobeGraniteCorsImplCORSPolicyImplProperties4 = new OASComAdobeGraniteCorsImplCORSPolicy();

        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties1.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties2));
        System.assert(comAdobeGraniteCorsImplCORSPolicyImplProperties3.equals(comAdobeGraniteCorsImplCORSPolicyImplProperties4));
        System.assertEquals(comAdobeGraniteCorsImplCORSPolicyImplProperties1.hashCode(), comAdobeGraniteCorsImplCORSPolicyImplProperties2.hashCode());
        System.assertEquals(comAdobeGraniteCorsImplCORSPolicyImplProperties3.hashCode(), comAdobeGraniteCorsImplCORSPolicyImplProperties4.hashCode());
    }
}
