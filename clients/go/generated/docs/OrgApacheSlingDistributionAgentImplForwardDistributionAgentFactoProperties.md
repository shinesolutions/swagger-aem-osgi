# OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Title** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Details** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**Enabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**LogLevel** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AllowedRoots** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**QueueProcessingEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**PackageImporterEndpoints** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PassiveQueues** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**PriorityQueues** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**RetryStrategy** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**RetryAttempts** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RequestAuthorizationStrategyTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TransportSecretProviderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageBuilderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**QueueProvider** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**AsyncDelivery** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HttpConnTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties

`func NewOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties() *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties`

NewOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties instantiates a new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesWithDefaults

`func NewOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesWithDefaults() *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties`

NewOrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoPropertiesWithDefaults instantiates a new OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTitle

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetTitle() ConfigNodePropertyString`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetTitleOk() (*ConfigNodePropertyString, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetTitle(v ConfigNodePropertyString)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDetails

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetDetails() ConfigNodePropertyString`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetDetailsOk() (*ConfigNodePropertyString, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetDetails(v ConfigNodePropertyString)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetEnabled

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetEnabled() ConfigNodePropertyBoolean`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetEnabled(v ConfigNodePropertyBoolean)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetServiceName

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetServiceName() ConfigNodePropertyString`

GetServiceName returns the ServiceName field if non-nil, zero value otherwise.

### GetServiceNameOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetServiceNameOk() (*ConfigNodePropertyString, bool)`

GetServiceNameOk returns a tuple with the ServiceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceName

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetServiceName(v ConfigNodePropertyString)`

SetServiceName sets ServiceName field to given value.

### HasServiceName

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasServiceName() bool`

HasServiceName returns a boolean if a field has been set.

### GetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetLogLevel() ConfigNodePropertyDropDown`

GetLogLevel returns the LogLevel field if non-nil, zero value otherwise.

### GetLogLevelOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetLogLevelOk() (*ConfigNodePropertyDropDown, bool)`

GetLogLevelOk returns a tuple with the LogLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetLogLevel(v ConfigNodePropertyDropDown)`

SetLogLevel sets LogLevel field to given value.

### HasLogLevel

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasLogLevel() bool`

HasLogLevel returns a boolean if a field has been set.

### GetAllowedRoots

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetAllowedRoots() ConfigNodePropertyArray`

GetAllowedRoots returns the AllowedRoots field if non-nil, zero value otherwise.

### GetAllowedRootsOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetAllowedRootsOk() (*ConfigNodePropertyArray, bool)`

GetAllowedRootsOk returns a tuple with the AllowedRoots field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowedRoots

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetAllowedRoots(v ConfigNodePropertyArray)`

SetAllowedRoots sets AllowedRoots field to given value.

### HasAllowedRoots

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasAllowedRoots() bool`

HasAllowedRoots returns a boolean if a field has been set.

### GetQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetQueueProcessingEnabled() ConfigNodePropertyBoolean`

GetQueueProcessingEnabled returns the QueueProcessingEnabled field if non-nil, zero value otherwise.

### GetQueueProcessingEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetQueueProcessingEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetQueueProcessingEnabledOk returns a tuple with the QueueProcessingEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetQueueProcessingEnabled(v ConfigNodePropertyBoolean)`

SetQueueProcessingEnabled sets QueueProcessingEnabled field to given value.

### HasQueueProcessingEnabled

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasQueueProcessingEnabled() bool`

HasQueueProcessingEnabled returns a boolean if a field has been set.

### GetPackageImporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPackageImporterEndpoints() ConfigNodePropertyArray`

GetPackageImporterEndpoints returns the PackageImporterEndpoints field if non-nil, zero value otherwise.

### GetPackageImporterEndpointsOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPackageImporterEndpointsOk() (*ConfigNodePropertyArray, bool)`

GetPackageImporterEndpointsOk returns a tuple with the PackageImporterEndpoints field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageImporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetPackageImporterEndpoints(v ConfigNodePropertyArray)`

SetPackageImporterEndpoints sets PackageImporterEndpoints field to given value.

### HasPackageImporterEndpoints

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasPackageImporterEndpoints() bool`

HasPackageImporterEndpoints returns a boolean if a field has been set.

### GetPassiveQueues

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPassiveQueues() ConfigNodePropertyArray`

GetPassiveQueues returns the PassiveQueues field if non-nil, zero value otherwise.

### GetPassiveQueuesOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPassiveQueuesOk() (*ConfigNodePropertyArray, bool)`

GetPassiveQueuesOk returns a tuple with the PassiveQueues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPassiveQueues

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetPassiveQueues(v ConfigNodePropertyArray)`

SetPassiveQueues sets PassiveQueues field to given value.

### HasPassiveQueues

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasPassiveQueues() bool`

HasPassiveQueues returns a boolean if a field has been set.

### GetPriorityQueues

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPriorityQueues() ConfigNodePropertyArray`

GetPriorityQueues returns the PriorityQueues field if non-nil, zero value otherwise.

### GetPriorityQueuesOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPriorityQueuesOk() (*ConfigNodePropertyArray, bool)`

GetPriorityQueuesOk returns a tuple with the PriorityQueues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriorityQueues

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetPriorityQueues(v ConfigNodePropertyArray)`

SetPriorityQueues sets PriorityQueues field to given value.

### HasPriorityQueues

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasPriorityQueues() bool`

HasPriorityQueues returns a boolean if a field has been set.

### GetRetryStrategy

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetRetryStrategy() ConfigNodePropertyDropDown`

GetRetryStrategy returns the RetryStrategy field if non-nil, zero value otherwise.

### GetRetryStrategyOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetRetryStrategyOk() (*ConfigNodePropertyDropDown, bool)`

GetRetryStrategyOk returns a tuple with the RetryStrategy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetryStrategy

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetRetryStrategy(v ConfigNodePropertyDropDown)`

SetRetryStrategy sets RetryStrategy field to given value.

### HasRetryStrategy

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasRetryStrategy() bool`

HasRetryStrategy returns a boolean if a field has been set.

### GetRetryAttempts

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetRetryAttempts() ConfigNodePropertyInteger`

GetRetryAttempts returns the RetryAttempts field if non-nil, zero value otherwise.

### GetRetryAttemptsOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetRetryAttemptsOk() (*ConfigNodePropertyInteger, bool)`

GetRetryAttemptsOk returns a tuple with the RetryAttempts field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRetryAttempts

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetRetryAttempts(v ConfigNodePropertyInteger)`

SetRetryAttempts sets RetryAttempts field to given value.

### HasRetryAttempts

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasRetryAttempts() bool`

HasRetryAttempts returns a boolean if a field has been set.

### GetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetRequestAuthorizationStrategyTarget() ConfigNodePropertyString`

GetRequestAuthorizationStrategyTarget returns the RequestAuthorizationStrategyTarget field if non-nil, zero value otherwise.

### GetRequestAuthorizationStrategyTargetOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetRequestAuthorizationStrategyTargetOk() (*ConfigNodePropertyString, bool)`

GetRequestAuthorizationStrategyTargetOk returns a tuple with the RequestAuthorizationStrategyTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetRequestAuthorizationStrategyTarget(v ConfigNodePropertyString)`

SetRequestAuthorizationStrategyTarget sets RequestAuthorizationStrategyTarget field to given value.

### HasRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasRequestAuthorizationStrategyTarget() bool`

HasRequestAuthorizationStrategyTarget returns a boolean if a field has been set.

### GetTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetTransportSecretProviderTarget() ConfigNodePropertyString`

GetTransportSecretProviderTarget returns the TransportSecretProviderTarget field if non-nil, zero value otherwise.

### GetTransportSecretProviderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetTransportSecretProviderTargetOk() (*ConfigNodePropertyString, bool)`

GetTransportSecretProviderTargetOk returns a tuple with the TransportSecretProviderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetTransportSecretProviderTarget(v ConfigNodePropertyString)`

SetTransportSecretProviderTarget sets TransportSecretProviderTarget field to given value.

### HasTransportSecretProviderTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasTransportSecretProviderTarget() bool`

HasTransportSecretProviderTarget returns a boolean if a field has been set.

### GetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPackageBuilderTarget() ConfigNodePropertyString`

GetPackageBuilderTarget returns the PackageBuilderTarget field if non-nil, zero value otherwise.

### GetPackageBuilderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetPackageBuilderTargetOk() (*ConfigNodePropertyString, bool)`

GetPackageBuilderTargetOk returns a tuple with the PackageBuilderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetPackageBuilderTarget(v ConfigNodePropertyString)`

SetPackageBuilderTarget sets PackageBuilderTarget field to given value.

### HasPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasPackageBuilderTarget() bool`

HasPackageBuilderTarget returns a boolean if a field has been set.

### GetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetTriggersTarget() ConfigNodePropertyString`

GetTriggersTarget returns the TriggersTarget field if non-nil, zero value otherwise.

### GetTriggersTargetOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetTriggersTargetOk() (*ConfigNodePropertyString, bool)`

GetTriggersTargetOk returns a tuple with the TriggersTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetTriggersTarget(v ConfigNodePropertyString)`

SetTriggersTarget sets TriggersTarget field to given value.

### HasTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasTriggersTarget() bool`

HasTriggersTarget returns a boolean if a field has been set.

### GetQueueProvider

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetQueueProvider() ConfigNodePropertyDropDown`

GetQueueProvider returns the QueueProvider field if non-nil, zero value otherwise.

### GetQueueProviderOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetQueueProviderOk() (*ConfigNodePropertyDropDown, bool)`

GetQueueProviderOk returns a tuple with the QueueProvider field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueProvider

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetQueueProvider(v ConfigNodePropertyDropDown)`

SetQueueProvider sets QueueProvider field to given value.

### HasQueueProvider

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasQueueProvider() bool`

HasQueueProvider returns a boolean if a field has been set.

### GetAsyncDelivery

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetAsyncDelivery() ConfigNodePropertyBoolean`

GetAsyncDelivery returns the AsyncDelivery field if non-nil, zero value otherwise.

### GetAsyncDeliveryOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetAsyncDeliveryOk() (*ConfigNodePropertyBoolean, bool)`

GetAsyncDeliveryOk returns a tuple with the AsyncDelivery field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAsyncDelivery

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetAsyncDelivery(v ConfigNodePropertyBoolean)`

SetAsyncDelivery sets AsyncDelivery field to given value.

### HasAsyncDelivery

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasAsyncDelivery() bool`

HasAsyncDelivery returns a boolean if a field has been set.

### GetHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetHttpConnTimeout() ConfigNodePropertyInteger`

GetHttpConnTimeout returns the HttpConnTimeout field if non-nil, zero value otherwise.

### GetHttpConnTimeoutOk

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) GetHttpConnTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetHttpConnTimeoutOk returns a tuple with the HttpConnTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) SetHttpConnTimeout(v ConfigNodePropertyInteger)`

SetHttpConnTimeout sets HttpConnTimeout field to given value.

### HasHttpConnTimeout

`func (o *OrgApacheSlingDistributionAgentImplForwardDistributionAgentFactoProperties) HasHttpConnTimeout() bool`

HasHttpConnTimeout returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


