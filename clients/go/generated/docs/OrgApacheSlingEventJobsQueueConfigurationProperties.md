# OrgApacheSlingEventJobsQueueConfigurationProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**QueueName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**QueueTopics** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**QueueType** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueuePriority** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**QueueRetries** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueRetrydelay** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**QueueMaxparallel** | Pointer to [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 
**QueueKeepJobs** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**QueuePreferRunOnCreationInstance** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**QueueThreadPoolSize** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ServiceRanking** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Methods

### NewOrgApacheSlingEventJobsQueueConfigurationProperties

`func NewOrgApacheSlingEventJobsQueueConfigurationProperties() *OrgApacheSlingEventJobsQueueConfigurationProperties`

NewOrgApacheSlingEventJobsQueueConfigurationProperties instantiates a new OrgApacheSlingEventJobsQueueConfigurationProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingEventJobsQueueConfigurationPropertiesWithDefaults

`func NewOrgApacheSlingEventJobsQueueConfigurationPropertiesWithDefaults() *OrgApacheSlingEventJobsQueueConfigurationProperties`

NewOrgApacheSlingEventJobsQueueConfigurationPropertiesWithDefaults instantiates a new OrgApacheSlingEventJobsQueueConfigurationProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetQueueName

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueName() ConfigNodePropertyString`

GetQueueName returns the QueueName field if non-nil, zero value otherwise.

### GetQueueNameOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueNameOk() (*ConfigNodePropertyString, bool)`

GetQueueNameOk returns a tuple with the QueueName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueName

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueName(v ConfigNodePropertyString)`

SetQueueName sets QueueName field to given value.

### HasQueueName

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueName() bool`

HasQueueName returns a boolean if a field has been set.

### GetQueueTopics

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueTopics() ConfigNodePropertyArray`

GetQueueTopics returns the QueueTopics field if non-nil, zero value otherwise.

### GetQueueTopicsOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueTopicsOk() (*ConfigNodePropertyArray, bool)`

GetQueueTopicsOk returns a tuple with the QueueTopics field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueTopics

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueTopics(v ConfigNodePropertyArray)`

SetQueueTopics sets QueueTopics field to given value.

### HasQueueTopics

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueTopics() bool`

HasQueueTopics returns a boolean if a field has been set.

### GetQueueType

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueType() ConfigNodePropertyDropDown`

GetQueueType returns the QueueType field if non-nil, zero value otherwise.

### GetQueueTypeOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueTypeOk() (*ConfigNodePropertyDropDown, bool)`

GetQueueTypeOk returns a tuple with the QueueType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueType

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueType(v ConfigNodePropertyDropDown)`

SetQueueType sets QueueType field to given value.

### HasQueueType

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueType() bool`

HasQueueType returns a boolean if a field has been set.

### GetQueuePriority

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueuePriority() ConfigNodePropertyDropDown`

GetQueuePriority returns the QueuePriority field if non-nil, zero value otherwise.

### GetQueuePriorityOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueuePriorityOk() (*ConfigNodePropertyDropDown, bool)`

GetQueuePriorityOk returns a tuple with the QueuePriority field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueuePriority

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueuePriority(v ConfigNodePropertyDropDown)`

SetQueuePriority sets QueuePriority field to given value.

### HasQueuePriority

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueuePriority() bool`

HasQueuePriority returns a boolean if a field has been set.

### GetQueueRetries

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueRetries() ConfigNodePropertyInteger`

GetQueueRetries returns the QueueRetries field if non-nil, zero value otherwise.

### GetQueueRetriesOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueRetriesOk() (*ConfigNodePropertyInteger, bool)`

GetQueueRetriesOk returns a tuple with the QueueRetries field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueRetries

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueRetries(v ConfigNodePropertyInteger)`

SetQueueRetries sets QueueRetries field to given value.

### HasQueueRetries

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueRetries() bool`

HasQueueRetries returns a boolean if a field has been set.

### GetQueueRetrydelay

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueRetrydelay() ConfigNodePropertyInteger`

GetQueueRetrydelay returns the QueueRetrydelay field if non-nil, zero value otherwise.

### GetQueueRetrydelayOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueRetrydelayOk() (*ConfigNodePropertyInteger, bool)`

GetQueueRetrydelayOk returns a tuple with the QueueRetrydelay field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueRetrydelay

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueRetrydelay(v ConfigNodePropertyInteger)`

SetQueueRetrydelay sets QueueRetrydelay field to given value.

### HasQueueRetrydelay

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueRetrydelay() bool`

HasQueueRetrydelay returns a boolean if a field has been set.

### GetQueueMaxparallel

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueMaxparallel() ConfigNodePropertyFloat`

GetQueueMaxparallel returns the QueueMaxparallel field if non-nil, zero value otherwise.

### GetQueueMaxparallelOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueMaxparallelOk() (*ConfigNodePropertyFloat, bool)`

GetQueueMaxparallelOk returns a tuple with the QueueMaxparallel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueMaxparallel

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueMaxparallel(v ConfigNodePropertyFloat)`

SetQueueMaxparallel sets QueueMaxparallel field to given value.

### HasQueueMaxparallel

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueMaxparallel() bool`

HasQueueMaxparallel returns a boolean if a field has been set.

### GetQueueKeepJobs

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueKeepJobs() ConfigNodePropertyBoolean`

GetQueueKeepJobs returns the QueueKeepJobs field if non-nil, zero value otherwise.

### GetQueueKeepJobsOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueKeepJobsOk() (*ConfigNodePropertyBoolean, bool)`

GetQueueKeepJobsOk returns a tuple with the QueueKeepJobs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueKeepJobs

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueKeepJobs(v ConfigNodePropertyBoolean)`

SetQueueKeepJobs sets QueueKeepJobs field to given value.

### HasQueueKeepJobs

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueKeepJobs() bool`

HasQueueKeepJobs returns a boolean if a field has been set.

### GetQueuePreferRunOnCreationInstance

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueuePreferRunOnCreationInstance() ConfigNodePropertyBoolean`

GetQueuePreferRunOnCreationInstance returns the QueuePreferRunOnCreationInstance field if non-nil, zero value otherwise.

### GetQueuePreferRunOnCreationInstanceOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueuePreferRunOnCreationInstanceOk() (*ConfigNodePropertyBoolean, bool)`

GetQueuePreferRunOnCreationInstanceOk returns a tuple with the QueuePreferRunOnCreationInstance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueuePreferRunOnCreationInstance

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueuePreferRunOnCreationInstance(v ConfigNodePropertyBoolean)`

SetQueuePreferRunOnCreationInstance sets QueuePreferRunOnCreationInstance field to given value.

### HasQueuePreferRunOnCreationInstance

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueuePreferRunOnCreationInstance() bool`

HasQueuePreferRunOnCreationInstance returns a boolean if a field has been set.

### GetQueueThreadPoolSize

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueThreadPoolSize() ConfigNodePropertyInteger`

GetQueueThreadPoolSize returns the QueueThreadPoolSize field if non-nil, zero value otherwise.

### GetQueueThreadPoolSizeOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetQueueThreadPoolSizeOk() (*ConfigNodePropertyInteger, bool)`

GetQueueThreadPoolSizeOk returns a tuple with the QueueThreadPoolSize field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetQueueThreadPoolSize

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetQueueThreadPoolSize(v ConfigNodePropertyInteger)`

SetQueueThreadPoolSize sets QueueThreadPoolSize field to given value.

### HasQueueThreadPoolSize

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasQueueThreadPoolSize() bool`

HasQueueThreadPoolSize returns a boolean if a field has been set.

### GetServiceRanking

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetServiceRanking() ConfigNodePropertyInteger`

GetServiceRanking returns the ServiceRanking field if non-nil, zero value otherwise.

### GetServiceRankingOk

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) GetServiceRankingOk() (*ConfigNodePropertyInteger, bool)`

GetServiceRankingOk returns a tuple with the ServiceRanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceRanking

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) SetServiceRanking(v ConfigNodePropertyInteger)`

SetServiceRanking sets ServiceRanking field to given value.

### HasServiceRanking

`func (o *OrgApacheSlingEventJobsQueueConfigurationProperties) HasServiceRanking() bool`

HasServiceRanking returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


