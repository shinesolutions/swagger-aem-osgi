@isTest
private class OASComAdobeGraniteWorkflowConsoleFraTest {
    @isTest
    private static void equalsSameInstance() {
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2 = comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1;
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3 = new OASComAdobeGraniteWorkflowConsoleFra();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4 = comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3;

        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3 = new OASComAdobeGraniteWorkflowConsoleFra();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4 = new OASComAdobeGraniteWorkflowConsoleFra();

        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2 = new OASComAdobeGraniteWorkflowConsoleFra();

        System.assertEquals(false, comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.equals('foo'));
        System.assertEquals(false, comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2 = new OASComAdobeGraniteWorkflowConsoleFra();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3;

        System.assertEquals(false, comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3));
        System.assertEquals(false, comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2 = new OASComAdobeGraniteWorkflowConsoleFra();

        System.assertEquals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.hashCode(), comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.hashCode(), comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2 = OASComAdobeGraniteWorkflowConsoleFra.getExample();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3 = new OASComAdobeGraniteWorkflowConsoleFra();
        OASComAdobeGraniteWorkflowConsoleFra comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4 = new OASComAdobeGraniteWorkflowConsoleFra();

        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2));
        System.assert(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3.equals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4));
        System.assertEquals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties1.hashCode(), comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties2.hashCode());
        System.assertEquals(comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties3.hashCode(), comAdobeGraniteWorkflowConsoleFragsWorkflowWithdrawFeatureProperties4.hashCode());
    }
}
