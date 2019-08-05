@isTest
private class OASAdaptiveFormAndInteractiveCommuniTest {
    @isTest
    private static void equalsSameInstance() {
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2 = adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1;
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3 = new OASAdaptiveFormAndInteractiveCommuni();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4 = adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3;

        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3 = new OASAdaptiveFormAndInteractiveCommuni();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4 = new OASAdaptiveFormAndInteractiveCommuni();

        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2 = new OASAdaptiveFormAndInteractiveCommuni();

        System.assertEquals(false, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.equals('foo'));
        System.assertEquals(false, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2 = new OASAdaptiveFormAndInteractiveCommuni();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3;

        System.assertEquals(false, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3));
        System.assertEquals(false, adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2 = new OASAdaptiveFormAndInteractiveCommuni();

        System.assertEquals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.hashCode(), adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.hashCode());
        System.assertEquals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.hashCode(), adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2 = OASAdaptiveFormAndInteractiveCommuni.getExample();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3 = new OASAdaptiveFormAndInteractiveCommuni();
        OASAdaptiveFormAndInteractiveCommuni adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4 = new OASAdaptiveFormAndInteractiveCommuni();

        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2));
        System.assert(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3.equals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4));
        System.assertEquals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties1.hashCode(), adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties2.hashCode());
        System.assertEquals(adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties3.hashCode(), adaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties4.hashCode());
    }
}
