# OrgApacheFelixScrScrServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**DsLoglevel** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**DsFactoryEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DsDelayedKeepInstances** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DsLockTimeoutMilliseconds** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DsStopTimeoutMilliseconds** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DsGlobalExtender** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Methods

### NewOrgApacheFelixScrScrServiceProperties

`func NewOrgApacheFelixScrScrServiceProperties() *OrgApacheFelixScrScrServiceProperties`

NewOrgApacheFelixScrScrServiceProperties instantiates a new OrgApacheFelixScrScrServiceProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheFelixScrScrServicePropertiesWithDefaults

`func NewOrgApacheFelixScrScrServicePropertiesWithDefaults() *OrgApacheFelixScrScrServiceProperties`

NewOrgApacheFelixScrScrServicePropertiesWithDefaults instantiates a new OrgApacheFelixScrScrServiceProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetDsLoglevel

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsLoglevel() ConfigNodePropertyDropDown`

GetDsLoglevel returns the DsLoglevel field if non-nil, zero value otherwise.

### GetDsLoglevelOk

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsLoglevelOk() (*ConfigNodePropertyDropDown, bool)`

GetDsLoglevelOk returns a tuple with the DsLoglevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDsLoglevel

`func (o *OrgApacheFelixScrScrServiceProperties) SetDsLoglevel(v ConfigNodePropertyDropDown)`

SetDsLoglevel sets DsLoglevel field to given value.

### HasDsLoglevel

`func (o *OrgApacheFelixScrScrServiceProperties) HasDsLoglevel() bool`

HasDsLoglevel returns a boolean if a field has been set.

### GetDsFactoryEnabled

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsFactoryEnabled() ConfigNodePropertyBoolean`

GetDsFactoryEnabled returns the DsFactoryEnabled field if non-nil, zero value otherwise.

### GetDsFactoryEnabledOk

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsFactoryEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetDsFactoryEnabledOk returns a tuple with the DsFactoryEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDsFactoryEnabled

`func (o *OrgApacheFelixScrScrServiceProperties) SetDsFactoryEnabled(v ConfigNodePropertyBoolean)`

SetDsFactoryEnabled sets DsFactoryEnabled field to given value.

### HasDsFactoryEnabled

`func (o *OrgApacheFelixScrScrServiceProperties) HasDsFactoryEnabled() bool`

HasDsFactoryEnabled returns a boolean if a field has been set.

### GetDsDelayedKeepInstances

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsDelayedKeepInstances() ConfigNodePropertyBoolean`

GetDsDelayedKeepInstances returns the DsDelayedKeepInstances field if non-nil, zero value otherwise.

### GetDsDelayedKeepInstancesOk

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsDelayedKeepInstancesOk() (*ConfigNodePropertyBoolean, bool)`

GetDsDelayedKeepInstancesOk returns a tuple with the DsDelayedKeepInstances field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDsDelayedKeepInstances

`func (o *OrgApacheFelixScrScrServiceProperties) SetDsDelayedKeepInstances(v ConfigNodePropertyBoolean)`

SetDsDelayedKeepInstances sets DsDelayedKeepInstances field to given value.

### HasDsDelayedKeepInstances

`func (o *OrgApacheFelixScrScrServiceProperties) HasDsDelayedKeepInstances() bool`

HasDsDelayedKeepInstances returns a boolean if a field has been set.

### GetDsLockTimeoutMilliseconds

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsLockTimeoutMilliseconds() ConfigNodePropertyInteger`

GetDsLockTimeoutMilliseconds returns the DsLockTimeoutMilliseconds field if non-nil, zero value otherwise.

### GetDsLockTimeoutMillisecondsOk

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsLockTimeoutMillisecondsOk() (*ConfigNodePropertyInteger, bool)`

GetDsLockTimeoutMillisecondsOk returns a tuple with the DsLockTimeoutMilliseconds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDsLockTimeoutMilliseconds

`func (o *OrgApacheFelixScrScrServiceProperties) SetDsLockTimeoutMilliseconds(v ConfigNodePropertyInteger)`

SetDsLockTimeoutMilliseconds sets DsLockTimeoutMilliseconds field to given value.

### HasDsLockTimeoutMilliseconds

`func (o *OrgApacheFelixScrScrServiceProperties) HasDsLockTimeoutMilliseconds() bool`

HasDsLockTimeoutMilliseconds returns a boolean if a field has been set.

### GetDsStopTimeoutMilliseconds

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsStopTimeoutMilliseconds() ConfigNodePropertyInteger`

GetDsStopTimeoutMilliseconds returns the DsStopTimeoutMilliseconds field if non-nil, zero value otherwise.

### GetDsStopTimeoutMillisecondsOk

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsStopTimeoutMillisecondsOk() (*ConfigNodePropertyInteger, bool)`

GetDsStopTimeoutMillisecondsOk returns a tuple with the DsStopTimeoutMilliseconds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDsStopTimeoutMilliseconds

`func (o *OrgApacheFelixScrScrServiceProperties) SetDsStopTimeoutMilliseconds(v ConfigNodePropertyInteger)`

SetDsStopTimeoutMilliseconds sets DsStopTimeoutMilliseconds field to given value.

### HasDsStopTimeoutMilliseconds

`func (o *OrgApacheFelixScrScrServiceProperties) HasDsStopTimeoutMilliseconds() bool`

HasDsStopTimeoutMilliseconds returns a boolean if a field has been set.

### GetDsGlobalExtender

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsGlobalExtender() ConfigNodePropertyBoolean`

GetDsGlobalExtender returns the DsGlobalExtender field if non-nil, zero value otherwise.

### GetDsGlobalExtenderOk

`func (o *OrgApacheFelixScrScrServiceProperties) GetDsGlobalExtenderOk() (*ConfigNodePropertyBoolean, bool)`

GetDsGlobalExtenderOk returns a tuple with the DsGlobalExtender field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDsGlobalExtender

`func (o *OrgApacheFelixScrScrServiceProperties) SetDsGlobalExtender(v ConfigNodePropertyBoolean)`

SetDsGlobalExtender sets DsGlobalExtender field to given value.

### HasDsGlobalExtender

`func (o *OrgApacheFelixScrScrServiceProperties) HasDsGlobalExtender() bool`

HasDsGlobalExtender returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


