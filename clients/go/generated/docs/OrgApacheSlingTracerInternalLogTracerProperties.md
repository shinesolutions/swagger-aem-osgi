# OrgApacheSlingTracerInternalLogTracerProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**TracerSets** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**Enabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServletEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**RecordingCacheSizeInMB** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RecordingCacheDurationInSecs** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**RecordingCompressionEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GzipResponse** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Methods

### NewOrgApacheSlingTracerInternalLogTracerProperties

`func NewOrgApacheSlingTracerInternalLogTracerProperties() *OrgApacheSlingTracerInternalLogTracerProperties`

NewOrgApacheSlingTracerInternalLogTracerProperties instantiates a new OrgApacheSlingTracerInternalLogTracerProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheSlingTracerInternalLogTracerPropertiesWithDefaults

`func NewOrgApacheSlingTracerInternalLogTracerPropertiesWithDefaults() *OrgApacheSlingTracerInternalLogTracerProperties`

NewOrgApacheSlingTracerInternalLogTracerPropertiesWithDefaults instantiates a new OrgApacheSlingTracerInternalLogTracerProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetTracerSets

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetTracerSets() ConfigNodePropertyArray`

GetTracerSets returns the TracerSets field if non-nil, zero value otherwise.

### GetTracerSetsOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetTracerSetsOk() (*ConfigNodePropertyArray, bool)`

GetTracerSetsOk returns a tuple with the TracerSets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTracerSets

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetTracerSets(v ConfigNodePropertyArray)`

SetTracerSets sets TracerSets field to given value.

### HasTracerSets

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasTracerSets() bool`

HasTracerSets returns a boolean if a field has been set.

### GetEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetEnabled() ConfigNodePropertyBoolean`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetEnabled(v ConfigNodePropertyBoolean)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetServletEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetServletEnabled() ConfigNodePropertyBoolean`

GetServletEnabled returns the ServletEnabled field if non-nil, zero value otherwise.

### GetServletEnabledOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetServletEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetServletEnabledOk returns a tuple with the ServletEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServletEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetServletEnabled(v ConfigNodePropertyBoolean)`

SetServletEnabled sets ServletEnabled field to given value.

### HasServletEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasServletEnabled() bool`

HasServletEnabled returns a boolean if a field has been set.

### GetRecordingCacheSizeInMB

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetRecordingCacheSizeInMB() ConfigNodePropertyInteger`

GetRecordingCacheSizeInMB returns the RecordingCacheSizeInMB field if non-nil, zero value otherwise.

### GetRecordingCacheSizeInMBOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetRecordingCacheSizeInMBOk() (*ConfigNodePropertyInteger, bool)`

GetRecordingCacheSizeInMBOk returns a tuple with the RecordingCacheSizeInMB field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordingCacheSizeInMB

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetRecordingCacheSizeInMB(v ConfigNodePropertyInteger)`

SetRecordingCacheSizeInMB sets RecordingCacheSizeInMB field to given value.

### HasRecordingCacheSizeInMB

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasRecordingCacheSizeInMB() bool`

HasRecordingCacheSizeInMB returns a boolean if a field has been set.

### GetRecordingCacheDurationInSecs

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetRecordingCacheDurationInSecs() ConfigNodePropertyInteger`

GetRecordingCacheDurationInSecs returns the RecordingCacheDurationInSecs field if non-nil, zero value otherwise.

### GetRecordingCacheDurationInSecsOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetRecordingCacheDurationInSecsOk() (*ConfigNodePropertyInteger, bool)`

GetRecordingCacheDurationInSecsOk returns a tuple with the RecordingCacheDurationInSecs field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordingCacheDurationInSecs

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetRecordingCacheDurationInSecs(v ConfigNodePropertyInteger)`

SetRecordingCacheDurationInSecs sets RecordingCacheDurationInSecs field to given value.

### HasRecordingCacheDurationInSecs

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasRecordingCacheDurationInSecs() bool`

HasRecordingCacheDurationInSecs returns a boolean if a field has been set.

### GetRecordingCompressionEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetRecordingCompressionEnabled() ConfigNodePropertyBoolean`

GetRecordingCompressionEnabled returns the RecordingCompressionEnabled field if non-nil, zero value otherwise.

### GetRecordingCompressionEnabledOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetRecordingCompressionEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetRecordingCompressionEnabledOk returns a tuple with the RecordingCompressionEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRecordingCompressionEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetRecordingCompressionEnabled(v ConfigNodePropertyBoolean)`

SetRecordingCompressionEnabled sets RecordingCompressionEnabled field to given value.

### HasRecordingCompressionEnabled

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasRecordingCompressionEnabled() bool`

HasRecordingCompressionEnabled returns a boolean if a field has been set.

### GetGzipResponse

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetGzipResponse() ConfigNodePropertyBoolean`

GetGzipResponse returns the GzipResponse field if non-nil, zero value otherwise.

### GetGzipResponseOk

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) GetGzipResponseOk() (*ConfigNodePropertyBoolean, bool)`

GetGzipResponseOk returns a tuple with the GzipResponse field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGzipResponse

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) SetGzipResponse(v ConfigNodePropertyBoolean)`

SetGzipResponse sets GzipResponse field to given value.

### HasGzipResponse

`func (o *OrgApacheSlingTracerInternalLogTracerProperties) HasGzipResponse() bool`

HasGzipResponse returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


