# ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SchedulerPeriod** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SchedulerRunOn** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**GraniteThreaddumpEnabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpDumpsPerFile** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GraniteThreaddumpEnableGzipCompression** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpEnableDirectoriesCompression** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpEnableJStack** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GraniteThreaddumpMaxBackupDays** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GraniteThreaddumpBackupCleanTrigger** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewComAdobeGraniteThreaddumpThreadDumpCollectorProperties

`func NewComAdobeGraniteThreaddumpThreadDumpCollectorProperties() *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties`

NewComAdobeGraniteThreaddumpThreadDumpCollectorProperties instantiates a new ComAdobeGraniteThreaddumpThreadDumpCollectorProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesWithDefaults

`func NewComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesWithDefaults() *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties`

NewComAdobeGraniteThreaddumpThreadDumpCollectorPropertiesWithDefaults instantiates a new ComAdobeGraniteThreaddumpThreadDumpCollectorProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSchedulerPeriod

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetSchedulerPeriod() ConfigNodePropertyInteger`

GetSchedulerPeriod returns the SchedulerPeriod field if non-nil, zero value otherwise.

### GetSchedulerPeriodOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetSchedulerPeriodOk() (*ConfigNodePropertyInteger, bool)`

GetSchedulerPeriodOk returns a tuple with the SchedulerPeriod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchedulerPeriod

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetSchedulerPeriod(v ConfigNodePropertyInteger)`

SetSchedulerPeriod sets SchedulerPeriod field to given value.

### HasSchedulerPeriod

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasSchedulerPeriod() bool`

HasSchedulerPeriod returns a boolean if a field has been set.

### GetSchedulerRunOn

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetSchedulerRunOn() ConfigNodePropertyDropDown`

GetSchedulerRunOn returns the SchedulerRunOn field if non-nil, zero value otherwise.

### GetSchedulerRunOnOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetSchedulerRunOnOk() (*ConfigNodePropertyDropDown, bool)`

GetSchedulerRunOnOk returns a tuple with the SchedulerRunOn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSchedulerRunOn

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetSchedulerRunOn(v ConfigNodePropertyDropDown)`

SetSchedulerRunOn sets SchedulerRunOn field to given value.

### HasSchedulerRunOn

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasSchedulerRunOn() bool`

HasSchedulerRunOn returns a boolean if a field has been set.

### GetGraniteThreaddumpEnabled

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnabled() ConfigNodePropertyBoolean`

GetGraniteThreaddumpEnabled returns the GraniteThreaddumpEnabled field if non-nil, zero value otherwise.

### GetGraniteThreaddumpEnabledOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetGraniteThreaddumpEnabledOk returns a tuple with the GraniteThreaddumpEnabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpEnabled

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpEnabled(v ConfigNodePropertyBoolean)`

SetGraniteThreaddumpEnabled sets GraniteThreaddumpEnabled field to given value.

### HasGraniteThreaddumpEnabled

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpEnabled() bool`

HasGraniteThreaddumpEnabled returns a boolean if a field has been set.

### GetGraniteThreaddumpDumpsPerFile

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpDumpsPerFile() ConfigNodePropertyInteger`

GetGraniteThreaddumpDumpsPerFile returns the GraniteThreaddumpDumpsPerFile field if non-nil, zero value otherwise.

### GetGraniteThreaddumpDumpsPerFileOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpDumpsPerFileOk() (*ConfigNodePropertyInteger, bool)`

GetGraniteThreaddumpDumpsPerFileOk returns a tuple with the GraniteThreaddumpDumpsPerFile field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpDumpsPerFile

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpDumpsPerFile(v ConfigNodePropertyInteger)`

SetGraniteThreaddumpDumpsPerFile sets GraniteThreaddumpDumpsPerFile field to given value.

### HasGraniteThreaddumpDumpsPerFile

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpDumpsPerFile() bool`

HasGraniteThreaddumpDumpsPerFile returns a boolean if a field has been set.

### GetGraniteThreaddumpEnableGzipCompression

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnableGzipCompression() ConfigNodePropertyBoolean`

GetGraniteThreaddumpEnableGzipCompression returns the GraniteThreaddumpEnableGzipCompression field if non-nil, zero value otherwise.

### GetGraniteThreaddumpEnableGzipCompressionOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnableGzipCompressionOk() (*ConfigNodePropertyBoolean, bool)`

GetGraniteThreaddumpEnableGzipCompressionOk returns a tuple with the GraniteThreaddumpEnableGzipCompression field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpEnableGzipCompression

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpEnableGzipCompression(v ConfigNodePropertyBoolean)`

SetGraniteThreaddumpEnableGzipCompression sets GraniteThreaddumpEnableGzipCompression field to given value.

### HasGraniteThreaddumpEnableGzipCompression

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpEnableGzipCompression() bool`

HasGraniteThreaddumpEnableGzipCompression returns a boolean if a field has been set.

### GetGraniteThreaddumpEnableDirectoriesCompression

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnableDirectoriesCompression() ConfigNodePropertyBoolean`

GetGraniteThreaddumpEnableDirectoriesCompression returns the GraniteThreaddumpEnableDirectoriesCompression field if non-nil, zero value otherwise.

### GetGraniteThreaddumpEnableDirectoriesCompressionOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnableDirectoriesCompressionOk() (*ConfigNodePropertyBoolean, bool)`

GetGraniteThreaddumpEnableDirectoriesCompressionOk returns a tuple with the GraniteThreaddumpEnableDirectoriesCompression field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpEnableDirectoriesCompression

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpEnableDirectoriesCompression(v ConfigNodePropertyBoolean)`

SetGraniteThreaddumpEnableDirectoriesCompression sets GraniteThreaddumpEnableDirectoriesCompression field to given value.

### HasGraniteThreaddumpEnableDirectoriesCompression

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpEnableDirectoriesCompression() bool`

HasGraniteThreaddumpEnableDirectoriesCompression returns a boolean if a field has been set.

### GetGraniteThreaddumpEnableJStack

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnableJStack() ConfigNodePropertyBoolean`

GetGraniteThreaddumpEnableJStack returns the GraniteThreaddumpEnableJStack field if non-nil, zero value otherwise.

### GetGraniteThreaddumpEnableJStackOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpEnableJStackOk() (*ConfigNodePropertyBoolean, bool)`

GetGraniteThreaddumpEnableJStackOk returns a tuple with the GraniteThreaddumpEnableJStack field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpEnableJStack

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpEnableJStack(v ConfigNodePropertyBoolean)`

SetGraniteThreaddumpEnableJStack sets GraniteThreaddumpEnableJStack field to given value.

### HasGraniteThreaddumpEnableJStack

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpEnableJStack() bool`

HasGraniteThreaddumpEnableJStack returns a boolean if a field has been set.

### GetGraniteThreaddumpMaxBackupDays

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpMaxBackupDays() ConfigNodePropertyInteger`

GetGraniteThreaddumpMaxBackupDays returns the GraniteThreaddumpMaxBackupDays field if non-nil, zero value otherwise.

### GetGraniteThreaddumpMaxBackupDaysOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpMaxBackupDaysOk() (*ConfigNodePropertyInteger, bool)`

GetGraniteThreaddumpMaxBackupDaysOk returns a tuple with the GraniteThreaddumpMaxBackupDays field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpMaxBackupDays

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpMaxBackupDays(v ConfigNodePropertyInteger)`

SetGraniteThreaddumpMaxBackupDays sets GraniteThreaddumpMaxBackupDays field to given value.

### HasGraniteThreaddumpMaxBackupDays

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpMaxBackupDays() bool`

HasGraniteThreaddumpMaxBackupDays returns a boolean if a field has been set.

### GetGraniteThreaddumpBackupCleanTrigger

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpBackupCleanTrigger() ConfigNodePropertyString`

GetGraniteThreaddumpBackupCleanTrigger returns the GraniteThreaddumpBackupCleanTrigger field if non-nil, zero value otherwise.

### GetGraniteThreaddumpBackupCleanTriggerOk

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) GetGraniteThreaddumpBackupCleanTriggerOk() (*ConfigNodePropertyString, bool)`

GetGraniteThreaddumpBackupCleanTriggerOk returns a tuple with the GraniteThreaddumpBackupCleanTrigger field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGraniteThreaddumpBackupCleanTrigger

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) SetGraniteThreaddumpBackupCleanTrigger(v ConfigNodePropertyString)`

SetGraniteThreaddumpBackupCleanTrigger sets GraniteThreaddumpBackupCleanTrigger field to given value.

### HasGraniteThreaddumpBackupCleanTrigger

`func (o *ComAdobeGraniteThreaddumpThreadDumpCollectorProperties) HasGraniteThreaddumpBackupCleanTrigger() bool`

HasGraniteThreaddumpBackupCleanTrigger returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


