# OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**MinPoolSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxPoolSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxThreadAge** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**KeepAliveTime** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**BlockPolicy** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**ShutdownGraceful** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Daemon** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ShutdownWaitTime** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**Priority** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Methods

### NewOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties

`func NewOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties() *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties`

NewOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties instantiates a new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesWithDefaults

`func NewOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesWithDefaults() *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties`

NewOrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesWithDefaults instantiates a new OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetMinPoolSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetMinPoolSize() ConfigNodePropertyInteger`

GetMinPoolSize returns the MinPoolSize field if non-nil, zero value otherwise.

### GetMinPoolSizeOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetMinPoolSizeOk() (*ConfigNodePropertyInteger, bool)`

GetMinPoolSizeOk returns a tuple with the MinPoolSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinPoolSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetMinPoolSize(v ConfigNodePropertyInteger)`

SetMinPoolSize sets MinPoolSize field to given value.

### HasMinPoolSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasMinPoolSize() bool`

HasMinPoolSize returns a boolean if a field has been set.

### GetMaxPoolSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetMaxPoolSize() ConfigNodePropertyInteger`

GetMaxPoolSize returns the MaxPoolSize field if non-nil, zero value otherwise.

### GetMaxPoolSizeOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetMaxPoolSizeOk() (*ConfigNodePropertyInteger, bool)`

GetMaxPoolSizeOk returns a tuple with the MaxPoolSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxPoolSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetMaxPoolSize(v ConfigNodePropertyInteger)`

SetMaxPoolSize sets MaxPoolSize field to given value.

### HasMaxPoolSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasMaxPoolSize() bool`

HasMaxPoolSize returns a boolean if a field has been set.

### GetQueueSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetQueueSize() ConfigNodePropertyInteger`

GetQueueSize returns the QueueSize field if non-nil, zero value otherwise.

### GetQueueSizeOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetQueueSizeOk() (*ConfigNodePropertyInteger, bool)`

GetQueueSizeOk returns a tuple with the QueueSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetQueueSize(v ConfigNodePropertyInteger)`

SetQueueSize sets QueueSize field to given value.

### HasQueueSize

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasQueueSize() bool`

HasQueueSize returns a boolean if a field has been set.

### GetMaxThreadAge

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetMaxThreadAge() ConfigNodePropertyInteger`

GetMaxThreadAge returns the MaxThreadAge field if non-nil, zero value otherwise.

### GetMaxThreadAgeOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetMaxThreadAgeOk() (*ConfigNodePropertyInteger, bool)`

GetMaxThreadAgeOk returns a tuple with the MaxThreadAge field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxThreadAge

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetMaxThreadAge(v ConfigNodePropertyInteger)`

SetMaxThreadAge sets MaxThreadAge field to given value.

### HasMaxThreadAge

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasMaxThreadAge() bool`

HasMaxThreadAge returns a boolean if a field has been set.

### GetKeepAliveTime

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetKeepAliveTime() ConfigNodePropertyInteger`

GetKeepAliveTime returns the KeepAliveTime field if non-nil, zero value otherwise.

### GetKeepAliveTimeOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetKeepAliveTimeOk() (*ConfigNodePropertyInteger, bool)`

GetKeepAliveTimeOk returns a tuple with the KeepAliveTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeepAliveTime

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetKeepAliveTime(v ConfigNodePropertyInteger)`

SetKeepAliveTime sets KeepAliveTime field to given value.

### HasKeepAliveTime

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasKeepAliveTime() bool`

HasKeepAliveTime returns a boolean if a field has been set.

### GetBlockPolicy

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetBlockPolicy() ConfigNodePropertyDropDown`

GetBlockPolicy returns the BlockPolicy field if non-nil, zero value otherwise.

### GetBlockPolicyOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetBlockPolicyOk() (*ConfigNodePropertyDropDown, bool)`

GetBlockPolicyOk returns a tuple with the BlockPolicy field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBlockPolicy

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetBlockPolicy(v ConfigNodePropertyDropDown)`

SetBlockPolicy sets BlockPolicy field to given value.

### HasBlockPolicy

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasBlockPolicy() bool`

HasBlockPolicy returns a boolean if a field has been set.

### GetShutdownGraceful

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetShutdownGraceful() ConfigNodePropertyBoolean`

GetShutdownGraceful returns the ShutdownGraceful field if non-nil, zero value otherwise.

### GetShutdownGracefulOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetShutdownGracefulOk() (*ConfigNodePropertyBoolean, bool)`

GetShutdownGracefulOk returns a tuple with the ShutdownGraceful field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShutdownGraceful

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetShutdownGraceful(v ConfigNodePropertyBoolean)`

SetShutdownGraceful sets ShutdownGraceful field to given value.

### HasShutdownGraceful

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasShutdownGraceful() bool`

HasShutdownGraceful returns a boolean if a field has been set.

### GetDaemon

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetDaemon() ConfigNodePropertyBoolean`

GetDaemon returns the Daemon field if non-nil, zero value otherwise.

### GetDaemonOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetDaemonOk() (*ConfigNodePropertyBoolean, bool)`

GetDaemonOk returns a tuple with the Daemon field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDaemon

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetDaemon(v ConfigNodePropertyBoolean)`

SetDaemon sets Daemon field to given value.

### HasDaemon

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasDaemon() bool`

HasDaemon returns a boolean if a field has been set.

### GetShutdownWaitTime

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetShutdownWaitTime() ConfigNodePropertyInteger`

GetShutdownWaitTime returns the ShutdownWaitTime field if non-nil, zero value otherwise.

### GetShutdownWaitTimeOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetShutdownWaitTimeOk() (*ConfigNodePropertyInteger, bool)`

GetShutdownWaitTimeOk returns a tuple with the ShutdownWaitTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetShutdownWaitTime

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetShutdownWaitTime(v ConfigNodePropertyInteger)`

SetShutdownWaitTime sets ShutdownWaitTime field to given value.

### HasShutdownWaitTime

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasShutdownWaitTime() bool`

HasShutdownWaitTime returns a boolean if a field has been set.

### GetPriority

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetPriority() ConfigNodePropertyDropDown`

GetPriority returns the Priority field if non-nil, zero value otherwise.

### GetPriorityOk

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) GetPriorityOk() (*ConfigNodePropertyDropDown, bool)`

GetPriorityOk returns a tuple with the Priority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPriority

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) SetPriority(v ConfigNodePropertyDropDown)`

SetPriority sets Priority field to given value.

### HasPriority

`func (o *OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties) HasPriority() bool`

HasPriority returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


