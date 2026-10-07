@isTest
private class OASComDayCqWcmCoreImplEventRepositorTest {
    @isTest
    private static void equalsSameInstance() {
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2 = comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1;
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3 = new OASComDayCqWcmCoreImplEventRepositor();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4 = comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3;

        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3 = new OASComDayCqWcmCoreImplEventRepositor();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4 = new OASComDayCqWcmCoreImplEventRepositor();

        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2 = new OASComDayCqWcmCoreImplEventRepositor();

        System.assertEquals(false, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.equals('foo'));
        System.assertEquals(false, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2 = new OASComDayCqWcmCoreImplEventRepositor();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3;

        System.assertEquals(false, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3));
        System.assertEquals(false, comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2 = new OASComDayCqWcmCoreImplEventRepositor();

        System.assertEquals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.hashCode(), comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.hashCode(), comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2 = OASComDayCqWcmCoreImplEventRepositor.getExample();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3 = new OASComDayCqWcmCoreImplEventRepositor();
        OASComDayCqWcmCoreImplEventRepositor comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4 = new OASComDayCqWcmCoreImplEventRepositor();

        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2));
        System.assert(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3.equals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4));
        System.assertEquals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties1.hashCode(), comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties2.hashCode());
        System.assertEquals(comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties3.hashCode(), comDayCqWcmCoreImplEventRepositoryChangeEventListenerProperties4.hashCode());
    }
}
