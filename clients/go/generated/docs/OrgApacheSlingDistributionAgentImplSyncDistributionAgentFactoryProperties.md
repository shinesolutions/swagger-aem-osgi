# OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Title** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Details** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LogLevel** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueueProcessingEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PassiveQueues** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PackageExporterEndpoints** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PackageImporterEndpoints** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RetryStrategy** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**RetryAttempts** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**PullItems** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HttpConnTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestAuthorizationStrategyTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TransportSecretProviderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageBuilderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties

`func NewOrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties() *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties`

NewOrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties instantiates a new OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesWithDefaults

`func NewOrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesWithDefaults() *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties`

NewOrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryPropertiesWithDefaults instantiates a new OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTitle

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetTitle() ConfigNodePropertyString`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetTitleOk() (*ConfigNodePropertyString, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetTitle(v ConfigNodePropertyString)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDetails

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetDetails() ConfigNodePropertyString`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetDetailsOk() (*ConfigNodePropertyString, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetDetails(v ConfigNodePropertyString)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetEnabled

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetEnabled() ConfigNodePropertyBoolean`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetEnabled(v ConfigNodePropertyBoolean)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetServiceName

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetServiceName() ConfigNodePropertyString`

GetServiceName returns the ServiceName field if non-nil, zero value otherwise.

### GetServiceNameOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetServiceNameOk() (*ConfigNodePropertyString, bool)`

GetServiceNameOk returns a tuple with the ServiceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceName

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetServiceName(v ConfigNodePropertyString)`

SetServiceName sets ServiceName field to given value.

### HasServiceName

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasServiceName() bool`

HasServiceName returns a boolean if a field has been set.

### GetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetLogLevel() ConfigNodePropertyDropDown`

GetLogLevel returns the LogLevel field if non-nil, zero value otherwise.

### GetLogLevelOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetLogLevelOk() (*ConfigNodePropertyDropDown, bool)`

GetLogLevelOk returns a tuple with the LogLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetLogLevel(v ConfigNodePropertyDropDown)`

SetLogLevel sets LogLevel field to given value.

### HasLogLevel

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasLogLevel() bool`

HasLogLevel returns a boolean if a field has been set.

### GetQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetQueueProcessingEnabled() ConfigNodePropertyBoolean`

GetQueueProcessingEnabled returns the QueueProcessingEnabled field if non-nil, zero value otherwise.

### GetQueueProcessingEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetQueueProcessingEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetQueueProcessingEnabledOk returns a tuple with the QueueProcessingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetQueueProcessingEnabled(v ConfigNodePropertyBoolean)`

SetQueueProcessingEnabled sets QueueProcessingEnabled field to given value.

### HasQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasQueueProcessingEnabled() bool`

HasQueueProcessingEnabled returns a boolean if a field has been set.

### GetPassiveQueues

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPassiveQueues() ConfigNodePropertyArray`

GetPassiveQueues returns the PassiveQueues field if non-nil, zero value otherwise.

### GetPassiveQueuesOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPassiveQueuesOk() (*ConfigNodePropertyArray, bool)`

GetPassiveQueuesOk returns a tuple with the PassiveQueues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassiveQueues

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetPassiveQueues(v ConfigNodePropertyArray)`

SetPassiveQueues sets PassiveQueues field to given value.

### HasPassiveQueues

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasPassiveQueues() bool`

HasPassiveQueues returns a boolean if a field has been set.

### GetPackageExporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPackageExporterEndpoints() ConfigNodePropertyArray`

GetPackageExporterEndpoints returns the PackageExporterEndpoints field if non-nil, zero value otherwise.

### GetPackageExporterEndpointsOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPackageExporterEndpointsOk() (*ConfigNodePropertyArray, bool)`

GetPackageExporterEndpointsOk returns a tuple with the PackageExporterEndpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageExporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetPackageExporterEndpoints(v ConfigNodePropertyArray)`

SetPackageExporterEndpoints sets PackageExporterEndpoints field to given value.

### HasPackageExporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasPackageExporterEndpoints() bool`

HasPackageExporterEndpoints returns a boolean if a field has been set.

### GetPackageImporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPackageImporterEndpoints() ConfigNodePropertyArray`

GetPackageImporterEndpoints returns the PackageImporterEndpoints field if non-nil, zero value otherwise.

### GetPackageImporterEndpointsOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPackageImporterEndpointsOk() (*ConfigNodePropertyArray, bool)`

GetPackageImporterEndpointsOk returns a tuple with the PackageImporterEndpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageImporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetPackageImporterEndpoints(v ConfigNodePropertyArray)`

SetPackageImporterEndpoints sets PackageImporterEndpoints field to given value.

### HasPackageImporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasPackageImporterEndpoints() bool`

HasPackageImporterEndpoints returns a boolean if a field has been set.

### GetRetryStrategy

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetRetryStrategy() ConfigNodePropertyDropDown`

GetRetryStrategy returns the RetryStrategy field if non-nil, zero value otherwise.

### GetRetryStrategyOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetRetryStrategyOk() (*ConfigNodePropertyDropDown, bool)`

GetRetryStrategyOk returns a tuple with the RetryStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetryStrategy

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetRetryStrategy(v ConfigNodePropertyDropDown)`

SetRetryStrategy sets RetryStrategy field to given value.

### HasRetryStrategy

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasRetryStrategy() bool`

HasRetryStrategy returns a boolean if a field has been set.

### GetRetryAttempts

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetRetryAttempts() ConfigNodePropertyInteger`

GetRetryAttempts returns the RetryAttempts field if non-nil, zero value otherwise.

### GetRetryAttemptsOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetRetryAttemptsOk() (*ConfigNodePropertyInteger, bool)`

GetRetryAttemptsOk returns a tuple with the RetryAttempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetryAttempts

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetRetryAttempts(v ConfigNodePropertyInteger)`

SetRetryAttempts sets RetryAttempts field to given value.

### HasRetryAttempts

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasRetryAttempts() bool`

HasRetryAttempts returns a boolean if a field has been set.

### GetPullItems

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPullItems() ConfigNodePropertyInteger`

GetPullItems returns the PullItems field if non-nil, zero value otherwise.

### GetPullItemsOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPullItemsOk() (*ConfigNodePropertyInteger, bool)`

GetPullItemsOk returns a tuple with the PullItems field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPullItems

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetPullItems(v ConfigNodePropertyInteger)`

SetPullItems sets PullItems field to given value.

### HasPullItems

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasPullItems() bool`

HasPullItems returns a boolean if a field has been set.

### GetHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetHttpConnTimeout() ConfigNodePropertyInteger`

GetHttpConnTimeout returns the HttpConnTimeout field if non-nil, zero value otherwise.

### GetHttpConnTimeoutOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetHttpConnTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetHttpConnTimeoutOk returns a tuple with the HttpConnTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetHttpConnTimeout(v ConfigNodePropertyInteger)`

SetHttpConnTimeout sets HttpConnTimeout field to given value.

### HasHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasHttpConnTimeout() bool`

HasHttpConnTimeout returns a boolean if a field has been set.

### GetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetRequestAuthorizationStrategyTarget() ConfigNodePropertyString`

GetRequestAuthorizationStrategyTarget returns the RequestAuthorizationStrategyTarget field if non-nil, zero value otherwise.

### GetRequestAuthorizationStrategyTargetOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetRequestAuthorizationStrategyTargetOk() (*ConfigNodePropertyString, bool)`

GetRequestAuthorizationStrategyTargetOk returns a tuple with the RequestAuthorizationStrategyTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetRequestAuthorizationStrategyTarget(v ConfigNodePropertyString)`

SetRequestAuthorizationStrategyTarget sets RequestAuthorizationStrategyTarget field to given value.

### HasRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasRequestAuthorizationStrategyTarget() bool`

HasRequestAuthorizationStrategyTarget returns a boolean if a field has been set.

### GetTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetTransportSecretProviderTarget() ConfigNodePropertyString`

GetTransportSecretProviderTarget returns the TransportSecretProviderTarget field if non-nil, zero value otherwise.

### GetTransportSecretProviderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetTransportSecretProviderTargetOk() (*ConfigNodePropertyString, bool)`

GetTransportSecretProviderTargetOk returns a tuple with the TransportSecretProviderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetTransportSecretProviderTarget(v ConfigNodePropertyString)`

SetTransportSecretProviderTarget sets TransportSecretProviderTarget field to given value.

### HasTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasTransportSecretProviderTarget() bool`

HasTransportSecretProviderTarget returns a boolean if a field has been set.

### GetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPackageBuilderTarget() ConfigNodePropertyString`

GetPackageBuilderTarget returns the PackageBuilderTarget field if non-nil, zero value otherwise.

### GetPackageBuilderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetPackageBuilderTargetOk() (*ConfigNodePropertyString, bool)`

GetPackageBuilderTargetOk returns a tuple with the PackageBuilderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetPackageBuilderTarget(v ConfigNodePropertyString)`

SetPackageBuilderTarget sets PackageBuilderTarget field to given value.

### HasPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasPackageBuilderTarget() bool`

HasPackageBuilderTarget returns a boolean if a field has been set.

### GetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetTriggersTarget() ConfigNodePropertyString`

GetTriggersTarget returns the TriggersTarget field if non-nil, zero value otherwise.

### GetTriggersTargetOk

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) GetTriggersTargetOk() (*ConfigNodePropertyString, bool)`

GetTriggersTargetOk returns a tuple with the TriggersTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) SetTriggersTarget(v ConfigNodePropertyString)`

SetTriggersTarget sets TriggersTarget field to given value.

### HasTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplSyncDistributionAgentFactoryProperties) HasTriggersTarget() bool`

HasTriggersTarget returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


