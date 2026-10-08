# ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ServiceRanking** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GlobalSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxDiskUsage** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PersistenceEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ThreadPoolMaxSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ScheduledThreadPoolMaxSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GracefulShutdownTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Queues** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Topics** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AddressesMaxDeliveryAttempts** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesExpiryDelay** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesAddressFullMessagePolicy** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AddressesMaxSizeBytes** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesPageSizeBytes** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AddressesPageCacheMaxSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterUser** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ClusterPassword** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ClusterCallTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterCallFailoverTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterClientFailureCheckPeriod** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterNotificationAttempts** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterNotificationInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**IdCacheSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterConfirmationWindowSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterConnectionTtl** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterDuplicateDetection** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ClusterInitialConnectAttempts** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterMaxRetryInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterMinLargeMessageSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterProducerWindowSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterReconnectAttempts** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterRetryInterval** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ClusterRetryIntervalMultiplier** | Pointer to [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 

## Methods

### NewComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

`func NewComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties() *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`

NewComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties instantiates a new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesWithDefaults

`func NewComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesWithDefaults() *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties`

NewComAdobeCqScreensMqActivemqImplArtemisJMSProviderPropertiesWithDefaults instantiates a new ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetServiceRanking

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetServiceRanking() ConfigNodePropertyInteger`

GetServiceRanking returns the ServiceRanking field if non-nil, zero value otherwise.

### GetServiceRankingOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetServiceRankingOk() (*ConfigNodePropertyInteger, bool)`

GetServiceRankingOk returns a tuple with the ServiceRanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceRanking

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetServiceRanking(v ConfigNodePropertyInteger)`

SetServiceRanking sets ServiceRanking field to given value.

### HasServiceRanking

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasServiceRanking() bool`

HasServiceRanking returns a boolean if a field has been set.

### GetGlobalSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetGlobalSize() ConfigNodePropertyInteger`

GetGlobalSize returns the GlobalSize field if non-nil, zero value otherwise.

### GetGlobalSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetGlobalSizeOk() (*ConfigNodePropertyInteger, bool)`

GetGlobalSizeOk returns a tuple with the GlobalSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGlobalSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetGlobalSize(v ConfigNodePropertyInteger)`

SetGlobalSize sets GlobalSize field to given value.

### HasGlobalSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasGlobalSize() bool`

HasGlobalSize returns a boolean if a field has been set.

### GetMaxDiskUsage

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetMaxDiskUsage() ConfigNodePropertyInteger`

GetMaxDiskUsage returns the MaxDiskUsage field if non-nil, zero value otherwise.

### GetMaxDiskUsageOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetMaxDiskUsageOk() (*ConfigNodePropertyInteger, bool)`

GetMaxDiskUsageOk returns a tuple with the MaxDiskUsage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxDiskUsage

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetMaxDiskUsage(v ConfigNodePropertyInteger)`

SetMaxDiskUsage sets MaxDiskUsage field to given value.

### HasMaxDiskUsage

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasMaxDiskUsage() bool`

HasMaxDiskUsage returns a boolean if a field has been set.

### GetPersistenceEnabled

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetPersistenceEnabled() ConfigNodePropertyBoolean`

GetPersistenceEnabled returns the PersistenceEnabled field if non-nil, zero value otherwise.

### GetPersistenceEnabledOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetPersistenceEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetPersistenceEnabledOk returns a tuple with the PersistenceEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPersistenceEnabled

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetPersistenceEnabled(v ConfigNodePropertyBoolean)`

SetPersistenceEnabled sets PersistenceEnabled field to given value.

### HasPersistenceEnabled

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasPersistenceEnabled() bool`

HasPersistenceEnabled returns a boolean if a field has been set.

### GetThreadPoolMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetThreadPoolMaxSize() ConfigNodePropertyInteger`

GetThreadPoolMaxSize returns the ThreadPoolMaxSize field if non-nil, zero value otherwise.

### GetThreadPoolMaxSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetThreadPoolMaxSizeOk() (*ConfigNodePropertyInteger, bool)`

GetThreadPoolMaxSizeOk returns a tuple with the ThreadPoolMaxSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadPoolMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetThreadPoolMaxSize(v ConfigNodePropertyInteger)`

SetThreadPoolMaxSize sets ThreadPoolMaxSize field to given value.

### HasThreadPoolMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasThreadPoolMaxSize() bool`

HasThreadPoolMaxSize returns a boolean if a field has been set.

### GetScheduledThreadPoolMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetScheduledThreadPoolMaxSize() ConfigNodePropertyInteger`

GetScheduledThreadPoolMaxSize returns the ScheduledThreadPoolMaxSize field if non-nil, zero value otherwise.

### GetScheduledThreadPoolMaxSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetScheduledThreadPoolMaxSizeOk() (*ConfigNodePropertyInteger, bool)`

GetScheduledThreadPoolMaxSizeOk returns a tuple with the ScheduledThreadPoolMaxSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetScheduledThreadPoolMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetScheduledThreadPoolMaxSize(v ConfigNodePropertyInteger)`

SetScheduledThreadPoolMaxSize sets ScheduledThreadPoolMaxSize field to given value.

### HasScheduledThreadPoolMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasScheduledThreadPoolMaxSize() bool`

HasScheduledThreadPoolMaxSize returns a boolean if a field has been set.

### GetGracefulShutdownTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetGracefulShutdownTimeout() ConfigNodePropertyInteger`

GetGracefulShutdownTimeout returns the GracefulShutdownTimeout field if non-nil, zero value otherwise.

### GetGracefulShutdownTimeoutOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetGracefulShutdownTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetGracefulShutdownTimeoutOk returns a tuple with the GracefulShutdownTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGracefulShutdownTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetGracefulShutdownTimeout(v ConfigNodePropertyInteger)`

SetGracefulShutdownTimeout sets GracefulShutdownTimeout field to given value.

### HasGracefulShutdownTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasGracefulShutdownTimeout() bool`

HasGracefulShutdownTimeout returns a boolean if a field has been set.

### GetQueues

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetQueues() ConfigNodePropertyArray`

GetQueues returns the Queues field if non-nil, zero value otherwise.

### GetQueuesOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetQueuesOk() (*ConfigNodePropertyArray, bool)`

GetQueuesOk returns a tuple with the Queues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueues

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetQueues(v ConfigNodePropertyArray)`

SetQueues sets Queues field to given value.

### HasQueues

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasQueues() bool`

HasQueues returns a boolean if a field has been set.

### GetTopics

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetTopics() ConfigNodePropertyArray`

GetTopics returns the Topics field if non-nil, zero value otherwise.

### GetTopicsOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetTopicsOk() (*ConfigNodePropertyArray, bool)`

GetTopicsOk returns a tuple with the Topics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTopics

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetTopics(v ConfigNodePropertyArray)`

SetTopics sets Topics field to given value.

### HasTopics

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasTopics() bool`

HasTopics returns a boolean if a field has been set.

### GetAddressesMaxDeliveryAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesMaxDeliveryAttempts() ConfigNodePropertyInteger`

GetAddressesMaxDeliveryAttempts returns the AddressesMaxDeliveryAttempts field if non-nil, zero value otherwise.

### GetAddressesMaxDeliveryAttemptsOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesMaxDeliveryAttemptsOk() (*ConfigNodePropertyInteger, bool)`

GetAddressesMaxDeliveryAttemptsOk returns a tuple with the AddressesMaxDeliveryAttempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressesMaxDeliveryAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetAddressesMaxDeliveryAttempts(v ConfigNodePropertyInteger)`

SetAddressesMaxDeliveryAttempts sets AddressesMaxDeliveryAttempts field to given value.

### HasAddressesMaxDeliveryAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasAddressesMaxDeliveryAttempts() bool`

HasAddressesMaxDeliveryAttempts returns a boolean if a field has been set.

### GetAddressesExpiryDelay

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesExpiryDelay() ConfigNodePropertyInteger`

GetAddressesExpiryDelay returns the AddressesExpiryDelay field if non-nil, zero value otherwise.

### GetAddressesExpiryDelayOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesExpiryDelayOk() (*ConfigNodePropertyInteger, bool)`

GetAddressesExpiryDelayOk returns a tuple with the AddressesExpiryDelay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressesExpiryDelay

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetAddressesExpiryDelay(v ConfigNodePropertyInteger)`

SetAddressesExpiryDelay sets AddressesExpiryDelay field to given value.

### HasAddressesExpiryDelay

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasAddressesExpiryDelay() bool`

HasAddressesExpiryDelay returns a boolean if a field has been set.

### GetAddressesAddressFullMessagePolicy

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesAddressFullMessagePolicy() ConfigNodePropertyDropDown`

GetAddressesAddressFullMessagePolicy returns the AddressesAddressFullMessagePolicy field if non-nil, zero value otherwise.

### GetAddressesAddressFullMessagePolicyOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesAddressFullMessagePolicyOk() (*ConfigNodePropertyDropDown, bool)`

GetAddressesAddressFullMessagePolicyOk returns a tuple with the AddressesAddressFullMessagePolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressesAddressFullMessagePolicy

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetAddressesAddressFullMessagePolicy(v ConfigNodePropertyDropDown)`

SetAddressesAddressFullMessagePolicy sets AddressesAddressFullMessagePolicy field to given value.

### HasAddressesAddressFullMessagePolicy

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasAddressesAddressFullMessagePolicy() bool`

HasAddressesAddressFullMessagePolicy returns a boolean if a field has been set.

### GetAddressesMaxSizeBytes

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesMaxSizeBytes() ConfigNodePropertyInteger`

GetAddressesMaxSizeBytes returns the AddressesMaxSizeBytes field if non-nil, zero value otherwise.

### GetAddressesMaxSizeBytesOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesMaxSizeBytesOk() (*ConfigNodePropertyInteger, bool)`

GetAddressesMaxSizeBytesOk returns a tuple with the AddressesMaxSizeBytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressesMaxSizeBytes

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetAddressesMaxSizeBytes(v ConfigNodePropertyInteger)`

SetAddressesMaxSizeBytes sets AddressesMaxSizeBytes field to given value.

### HasAddressesMaxSizeBytes

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasAddressesMaxSizeBytes() bool`

HasAddressesMaxSizeBytes returns a boolean if a field has been set.

### GetAddressesPageSizeBytes

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesPageSizeBytes() ConfigNodePropertyInteger`

GetAddressesPageSizeBytes returns the AddressesPageSizeBytes field if non-nil, zero value otherwise.

### GetAddressesPageSizeBytesOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesPageSizeBytesOk() (*ConfigNodePropertyInteger, bool)`

GetAddressesPageSizeBytesOk returns a tuple with the AddressesPageSizeBytes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressesPageSizeBytes

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetAddressesPageSizeBytes(v ConfigNodePropertyInteger)`

SetAddressesPageSizeBytes sets AddressesPageSizeBytes field to given value.

### HasAddressesPageSizeBytes

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasAddressesPageSizeBytes() bool`

HasAddressesPageSizeBytes returns a boolean if a field has been set.

### GetAddressesPageCacheMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesPageCacheMaxSize() ConfigNodePropertyInteger`

GetAddressesPageCacheMaxSize returns the AddressesPageCacheMaxSize field if non-nil, zero value otherwise.

### GetAddressesPageCacheMaxSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetAddressesPageCacheMaxSizeOk() (*ConfigNodePropertyInteger, bool)`

GetAddressesPageCacheMaxSizeOk returns a tuple with the AddressesPageCacheMaxSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddressesPageCacheMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetAddressesPageCacheMaxSize(v ConfigNodePropertyInteger)`

SetAddressesPageCacheMaxSize sets AddressesPageCacheMaxSize field to given value.

### HasAddressesPageCacheMaxSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasAddressesPageCacheMaxSize() bool`

HasAddressesPageCacheMaxSize returns a boolean if a field has been set.

### GetClusterUser

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterUser() ConfigNodePropertyString`

GetClusterUser returns the ClusterUser field if non-nil, zero value otherwise.

### GetClusterUserOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterUserOk() (*ConfigNodePropertyString, bool)`

GetClusterUserOk returns a tuple with the ClusterUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterUser

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterUser(v ConfigNodePropertyString)`

SetClusterUser sets ClusterUser field to given value.

### HasClusterUser

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterUser() bool`

HasClusterUser returns a boolean if a field has been set.

### GetClusterPassword

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterPassword() ConfigNodePropertyString`

GetClusterPassword returns the ClusterPassword field if non-nil, zero value otherwise.

### GetClusterPasswordOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterPasswordOk() (*ConfigNodePropertyString, bool)`

GetClusterPasswordOk returns a tuple with the ClusterPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterPassword

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterPassword(v ConfigNodePropertyString)`

SetClusterPassword sets ClusterPassword field to given value.

### HasClusterPassword

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterPassword() bool`

HasClusterPassword returns a boolean if a field has been set.

### GetClusterCallTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterCallTimeout() ConfigNodePropertyInteger`

GetClusterCallTimeout returns the ClusterCallTimeout field if non-nil, zero value otherwise.

### GetClusterCallTimeoutOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterCallTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetClusterCallTimeoutOk returns a tuple with the ClusterCallTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterCallTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterCallTimeout(v ConfigNodePropertyInteger)`

SetClusterCallTimeout sets ClusterCallTimeout field to given value.

### HasClusterCallTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterCallTimeout() bool`

HasClusterCallTimeout returns a boolean if a field has been set.

### GetClusterCallFailoverTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterCallFailoverTimeout() ConfigNodePropertyInteger`

GetClusterCallFailoverTimeout returns the ClusterCallFailoverTimeout field if non-nil, zero value otherwise.

### GetClusterCallFailoverTimeoutOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterCallFailoverTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetClusterCallFailoverTimeoutOk returns a tuple with the ClusterCallFailoverTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterCallFailoverTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterCallFailoverTimeout(v ConfigNodePropertyInteger)`

SetClusterCallFailoverTimeout sets ClusterCallFailoverTimeout field to given value.

### HasClusterCallFailoverTimeout

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterCallFailoverTimeout() bool`

HasClusterCallFailoverTimeout returns a boolean if a field has been set.

### GetClusterClientFailureCheckPeriod

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterClientFailureCheckPeriod() ConfigNodePropertyInteger`

GetClusterClientFailureCheckPeriod returns the ClusterClientFailureCheckPeriod field if non-nil, zero value otherwise.

### GetClusterClientFailureCheckPeriodOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterClientFailureCheckPeriodOk() (*ConfigNodePropertyInteger, bool)`

GetClusterClientFailureCheckPeriodOk returns a tuple with the ClusterClientFailureCheckPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterClientFailureCheckPeriod

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterClientFailureCheckPeriod(v ConfigNodePropertyInteger)`

SetClusterClientFailureCheckPeriod sets ClusterClientFailureCheckPeriod field to given value.

### HasClusterClientFailureCheckPeriod

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterClientFailureCheckPeriod() bool`

HasClusterClientFailureCheckPeriod returns a boolean if a field has been set.

### GetClusterNotificationAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterNotificationAttempts() ConfigNodePropertyInteger`

GetClusterNotificationAttempts returns the ClusterNotificationAttempts field if non-nil, zero value otherwise.

### GetClusterNotificationAttemptsOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterNotificationAttemptsOk() (*ConfigNodePropertyInteger, bool)`

GetClusterNotificationAttemptsOk returns a tuple with the ClusterNotificationAttempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterNotificationAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterNotificationAttempts(v ConfigNodePropertyInteger)`

SetClusterNotificationAttempts sets ClusterNotificationAttempts field to given value.

### HasClusterNotificationAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterNotificationAttempts() bool`

HasClusterNotificationAttempts returns a boolean if a field has been set.

### GetClusterNotificationInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterNotificationInterval() ConfigNodePropertyInteger`

GetClusterNotificationInterval returns the ClusterNotificationInterval field if non-nil, zero value otherwise.

### GetClusterNotificationIntervalOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterNotificationIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetClusterNotificationIntervalOk returns a tuple with the ClusterNotificationInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterNotificationInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterNotificationInterval(v ConfigNodePropertyInteger)`

SetClusterNotificationInterval sets ClusterNotificationInterval field to given value.

### HasClusterNotificationInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterNotificationInterval() bool`

HasClusterNotificationInterval returns a boolean if a field has been set.

### GetIdCacheSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetIdCacheSize() ConfigNodePropertyInteger`

GetIdCacheSize returns the IdCacheSize field if non-nil, zero value otherwise.

### GetIdCacheSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetIdCacheSizeOk() (*ConfigNodePropertyInteger, bool)`

GetIdCacheSizeOk returns a tuple with the IdCacheSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdCacheSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetIdCacheSize(v ConfigNodePropertyInteger)`

SetIdCacheSize sets IdCacheSize field to given value.

### HasIdCacheSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasIdCacheSize() bool`

HasIdCacheSize returns a boolean if a field has been set.

### GetClusterConfirmationWindowSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterConfirmationWindowSize() ConfigNodePropertyInteger`

GetClusterConfirmationWindowSize returns the ClusterConfirmationWindowSize field if non-nil, zero value otherwise.

### GetClusterConfirmationWindowSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterConfirmationWindowSizeOk() (*ConfigNodePropertyInteger, bool)`

GetClusterConfirmationWindowSizeOk returns a tuple with the ClusterConfirmationWindowSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterConfirmationWindowSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterConfirmationWindowSize(v ConfigNodePropertyInteger)`

SetClusterConfirmationWindowSize sets ClusterConfirmationWindowSize field to given value.

### HasClusterConfirmationWindowSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterConfirmationWindowSize() bool`

HasClusterConfirmationWindowSize returns a boolean if a field has been set.

### GetClusterConnectionTtl

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterConnectionTtl() ConfigNodePropertyInteger`

GetClusterConnectionTtl returns the ClusterConnectionTtl field if non-nil, zero value otherwise.

### GetClusterConnectionTtlOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterConnectionTtlOk() (*ConfigNodePropertyInteger, bool)`

GetClusterConnectionTtlOk returns a tuple with the ClusterConnectionTtl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterConnectionTtl

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterConnectionTtl(v ConfigNodePropertyInteger)`

SetClusterConnectionTtl sets ClusterConnectionTtl field to given value.

### HasClusterConnectionTtl

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterConnectionTtl() bool`

HasClusterConnectionTtl returns a boolean if a field has been set.

### GetClusterDuplicateDetection

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterDuplicateDetection() ConfigNodePropertyBoolean`

GetClusterDuplicateDetection returns the ClusterDuplicateDetection field if non-nil, zero value otherwise.

### GetClusterDuplicateDetectionOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterDuplicateDetectionOk() (*ConfigNodePropertyBoolean, bool)`

GetClusterDuplicateDetectionOk returns a tuple with the ClusterDuplicateDetection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterDuplicateDetection

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterDuplicateDetection(v ConfigNodePropertyBoolean)`

SetClusterDuplicateDetection sets ClusterDuplicateDetection field to given value.

### HasClusterDuplicateDetection

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterDuplicateDetection() bool`

HasClusterDuplicateDetection returns a boolean if a field has been set.

### GetClusterInitialConnectAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterInitialConnectAttempts() ConfigNodePropertyInteger`

GetClusterInitialConnectAttempts returns the ClusterInitialConnectAttempts field if non-nil, zero value otherwise.

### GetClusterInitialConnectAttemptsOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterInitialConnectAttemptsOk() (*ConfigNodePropertyInteger, bool)`

GetClusterInitialConnectAttemptsOk returns a tuple with the ClusterInitialConnectAttempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterInitialConnectAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterInitialConnectAttempts(v ConfigNodePropertyInteger)`

SetClusterInitialConnectAttempts sets ClusterInitialConnectAttempts field to given value.

### HasClusterInitialConnectAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterInitialConnectAttempts() bool`

HasClusterInitialConnectAttempts returns a boolean if a field has been set.

### GetClusterMaxRetryInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterMaxRetryInterval() ConfigNodePropertyInteger`

GetClusterMaxRetryInterval returns the ClusterMaxRetryInterval field if non-nil, zero value otherwise.

### GetClusterMaxRetryIntervalOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterMaxRetryIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetClusterMaxRetryIntervalOk returns a tuple with the ClusterMaxRetryInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterMaxRetryInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterMaxRetryInterval(v ConfigNodePropertyInteger)`

SetClusterMaxRetryInterval sets ClusterMaxRetryInterval field to given value.

### HasClusterMaxRetryInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterMaxRetryInterval() bool`

HasClusterMaxRetryInterval returns a boolean if a field has been set.

### GetClusterMinLargeMessageSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterMinLargeMessageSize() ConfigNodePropertyInteger`

GetClusterMinLargeMessageSize returns the ClusterMinLargeMessageSize field if non-nil, zero value otherwise.

### GetClusterMinLargeMessageSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterMinLargeMessageSizeOk() (*ConfigNodePropertyInteger, bool)`

GetClusterMinLargeMessageSizeOk returns a tuple with the ClusterMinLargeMessageSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterMinLargeMessageSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterMinLargeMessageSize(v ConfigNodePropertyInteger)`

SetClusterMinLargeMessageSize sets ClusterMinLargeMessageSize field to given value.

### HasClusterMinLargeMessageSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterMinLargeMessageSize() bool`

HasClusterMinLargeMessageSize returns a boolean if a field has been set.

### GetClusterProducerWindowSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterProducerWindowSize() ConfigNodePropertyInteger`

GetClusterProducerWindowSize returns the ClusterProducerWindowSize field if non-nil, zero value otherwise.

### GetClusterProducerWindowSizeOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterProducerWindowSizeOk() (*ConfigNodePropertyInteger, bool)`

GetClusterProducerWindowSizeOk returns a tuple with the ClusterProducerWindowSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterProducerWindowSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterProducerWindowSize(v ConfigNodePropertyInteger)`

SetClusterProducerWindowSize sets ClusterProducerWindowSize field to given value.

### HasClusterProducerWindowSize

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterProducerWindowSize() bool`

HasClusterProducerWindowSize returns a boolean if a field has been set.

### GetClusterReconnectAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterReconnectAttempts() ConfigNodePropertyInteger`

GetClusterReconnectAttempts returns the ClusterReconnectAttempts field if non-nil, zero value otherwise.

### GetClusterReconnectAttemptsOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterReconnectAttemptsOk() (*ConfigNodePropertyInteger, bool)`

GetClusterReconnectAttemptsOk returns a tuple with the ClusterReconnectAttempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterReconnectAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterReconnectAttempts(v ConfigNodePropertyInteger)`

SetClusterReconnectAttempts sets ClusterReconnectAttempts field to given value.

### HasClusterReconnectAttempts

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterReconnectAttempts() bool`

HasClusterReconnectAttempts returns a boolean if a field has been set.

### GetClusterRetryInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterRetryInterval() ConfigNodePropertyInteger`

GetClusterRetryInterval returns the ClusterRetryInterval field if non-nil, zero value otherwise.

### GetClusterRetryIntervalOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterRetryIntervalOk() (*ConfigNodePropertyInteger, bool)`

GetClusterRetryIntervalOk returns a tuple with the ClusterRetryInterval field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterRetryInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterRetryInterval(v ConfigNodePropertyInteger)`

SetClusterRetryInterval sets ClusterRetryInterval field to given value.

### HasClusterRetryInterval

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterRetryInterval() bool`

HasClusterRetryInterval returns a boolean if a field has been set.

### GetClusterRetryIntervalMultiplier

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterRetryIntervalMultiplier() ConfigNodePropertyFloat`

GetClusterRetryIntervalMultiplier returns the ClusterRetryIntervalMultiplier field if non-nil, zero value otherwise.

### GetClusterRetryIntervalMultiplierOk

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) GetClusterRetryIntervalMultiplierOk() (*ConfigNodePropertyFloat, bool)`

GetClusterRetryIntervalMultiplierOk returns a tuple with the ClusterRetryIntervalMultiplier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClusterRetryIntervalMultiplier

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) SetClusterRetryIntervalMultiplier(v ConfigNodePropertyFloat)`

SetClusterRetryIntervalMultiplier sets ClusterRetryIntervalMultiplier field to given value.

### HasClusterRetryIntervalMultiplier

`func (o *ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties) HasClusterRetryIntervalMultiplier() bool`

HasClusterRetryIntervalMultiplier returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


