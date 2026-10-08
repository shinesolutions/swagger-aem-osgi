# OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

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
**RequestAuthorizationStrategyTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**QueueProviderFactoryTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PackageBuilderTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**TriggersTarget** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**PriorityQueues** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Methods

### NewOrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties

`func NewOrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties() *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties`

NewOrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties instantiates a new OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesWithDefaults

`func NewOrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesWithDefaults() *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties`

NewOrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryPropertiesWithDefaults instantiates a new OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetTitle

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetTitle() ConfigNodePropertyString`

GetTitle returns the Title field if non-nil, zero value otherwise.

### GetTitleOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetTitleOk() (*ConfigNodePropertyString, bool)`

GetTitleOk returns a tuple with the Title field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTitle

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetTitle(v ConfigNodePropertyString)`

SetTitle sets Title field to given value.

### HasTitle

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasTitle() bool`

HasTitle returns a boolean if a field has been set.

### GetDetails

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetDetails() ConfigNodePropertyString`

GetDetails returns the Details field if non-nil, zero value otherwise.

### GetDetailsOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetDetailsOk() (*ConfigNodePropertyString, bool)`

GetDetailsOk returns a tuple with the Details field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDetails

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetDetails(v ConfigNodePropertyString)`

SetDetails sets Details field to given value.

### HasDetails

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasDetails() bool`

HasDetails returns a boolean if a field has been set.

### GetEnabled

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetEnabled() ConfigNodePropertyBoolean`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetEnabled(v ConfigNodePropertyBoolean)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetServiceName

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetServiceName() ConfigNodePropertyString`

GetServiceName returns the ServiceName field if non-nil, zero value otherwise.

### GetServiceNameOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetServiceNameOk() (*ConfigNodePropertyString, bool)`

GetServiceNameOk returns a tuple with the ServiceName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceName

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetServiceName(v ConfigNodePropertyString)`

SetServiceName sets ServiceName field to given value.

### HasServiceName

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasServiceName() bool`

HasServiceName returns a boolean if a field has been set.

### GetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetLogLevel() ConfigNodePropertyDropDown`

GetLogLevel returns the LogLevel field if non-nil, zero value otherwise.

### GetLogLevelOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetLogLevelOk() (*ConfigNodePropertyDropDown, bool)`

GetLogLevelOk returns a tuple with the LogLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogLevel

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetLogLevel(v ConfigNodePropertyDropDown)`

SetLogLevel sets LogLevel field to given value.

### HasLogLevel

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasLogLevel() bool`

HasLogLevel returns a boolean if a field has been set.

### GetAllowedRoots

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetAllowedRoots() ConfigNodePropertyArray`

GetAllowedRoots returns the AllowedRoots field if non-nil, zero value otherwise.

### GetAllowedRootsOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetAllowedRootsOk() (*ConfigNodePropertyArray, bool)`

GetAllowedRootsOk returns a tuple with the AllowedRoots field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAllowedRoots

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetAllowedRoots(v ConfigNodePropertyArray)`

SetAllowedRoots sets AllowedRoots field to given value.

### HasAllowedRoots

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasAllowedRoots() bool`

HasAllowedRoots returns a boolean if a field has been set.

### GetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetRequestAuthorizationStrategyTarget() ConfigNodePropertyString`

GetRequestAuthorizationStrategyTarget returns the RequestAuthorizationStrategyTarget field if non-nil, zero value otherwise.

### GetRequestAuthorizationStrategyTargetOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetRequestAuthorizationStrategyTargetOk() (*ConfigNodePropertyString, bool)`

GetRequestAuthorizationStrategyTargetOk returns a tuple with the RequestAuthorizationStrategyTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetRequestAuthorizationStrategyTarget(v ConfigNodePropertyString)`

SetRequestAuthorizationStrategyTarget sets RequestAuthorizationStrategyTarget field to given value.

### HasRequestAuthorizationStrategyTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasRequestAuthorizationStrategyTarget() bool`

HasRequestAuthorizationStrategyTarget returns a boolean if a field has been set.

### GetQueueProviderFactoryTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetQueueProviderFactoryTarget() ConfigNodePropertyString`

GetQueueProviderFactoryTarget returns the QueueProviderFactoryTarget field if non-nil, zero value otherwise.

### GetQueueProviderFactoryTargetOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetQueueProviderFactoryTargetOk() (*ConfigNodePropertyString, bool)`

GetQueueProviderFactoryTargetOk returns a tuple with the QueueProviderFactoryTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueProviderFactoryTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetQueueProviderFactoryTarget(v ConfigNodePropertyString)`

SetQueueProviderFactoryTarget sets QueueProviderFactoryTarget field to given value.

### HasQueueProviderFactoryTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasQueueProviderFactoryTarget() bool`

HasQueueProviderFactoryTarget returns a boolean if a field has been set.

### GetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetPackageBuilderTarget() ConfigNodePropertyString`

GetPackageBuilderTarget returns the PackageBuilderTarget field if non-nil, zero value otherwise.

### GetPackageBuilderTargetOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetPackageBuilderTargetOk() (*ConfigNodePropertyString, bool)`

GetPackageBuilderTargetOk returns a tuple with the PackageBuilderTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetPackageBuilderTarget(v ConfigNodePropertyString)`

SetPackageBuilderTarget sets PackageBuilderTarget field to given value.

### HasPackageBuilderTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasPackageBuilderTarget() bool`

HasPackageBuilderTarget returns a boolean if a field has been set.

### GetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetTriggersTarget() ConfigNodePropertyString`

GetTriggersTarget returns the TriggersTarget field if non-nil, zero value otherwise.

### GetTriggersTargetOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetTriggersTargetOk() (*ConfigNodePropertyString, bool)`

GetTriggersTargetOk returns a tuple with the TriggersTarget field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetTriggersTarget(v ConfigNodePropertyString)`

SetTriggersTarget sets TriggersTarget field to given value.

### HasTriggersTarget

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasTriggersTarget() bool`

HasTriggersTarget returns a boolean if a field has been set.

### GetPriorityQueues

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetPriorityQueues() ConfigNodePropertyArray`

GetPriorityQueues returns the PriorityQueues field if non-nil, zero value otherwise.

### GetPriorityQueuesOk

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) GetPriorityQueuesOk() (*ConfigNodePropertyArray, bool)`

GetPriorityQueuesOk returns a tuple with the PriorityQueues field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriorityQueues

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) SetPriorityQueues(v ConfigNodePropertyArray)`

SetPriorityQueues sets PriorityQueues field to given value.

### HasPriorityQueues

`func (o *OrgApacheSlingDistributionAgentImplQueueDistributionAgentFactoryProperties) HasPriorityQueues() bool`

HasPriorityQueues returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


