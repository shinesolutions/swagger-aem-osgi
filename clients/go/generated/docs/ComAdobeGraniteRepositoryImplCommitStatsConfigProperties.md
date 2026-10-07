# ComAdobeGraniteRepositoryImplCommitStatsConfigProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Enabled** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**IntervalSeconds** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**CommitsPerIntervalThreshold** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxLocationLength** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MaxDetailsShown** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**MinDetailsPercentage** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**ThreadMatchers** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**MaxGreedyDepth** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**GreedyStackMatchers** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**StackFilters** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StackMatchers** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StackCategorizers** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**StackShorteners** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Methods

### NewComAdobeGraniteRepositoryImplCommitStatsConfigProperties

`func NewComAdobeGraniteRepositoryImplCommitStatsConfigProperties() *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties`

NewComAdobeGraniteRepositoryImplCommitStatsConfigProperties instantiates a new ComAdobeGraniteRepositoryImplCommitStatsConfigProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesWithDefaults

`func NewComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesWithDefaults() *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties`

NewComAdobeGraniteRepositoryImplCommitStatsConfigPropertiesWithDefaults instantiates a new ComAdobeGraniteRepositoryImplCommitStatsConfigProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetEnabled

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetEnabled() ConfigNodePropertyBoolean`

GetEnabled returns the Enabled field if non-nil, zero value otherwise.

### GetEnabledOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetEnabledOk() (*ConfigNodePropertyBoolean, bool)`

GetEnabledOk returns a tuple with the Enabled field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetEnabled

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetEnabled(v ConfigNodePropertyBoolean)`

SetEnabled sets Enabled field to given value.

### HasEnabled

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasEnabled() bool`

HasEnabled returns a boolean if a field has been set.

### GetIntervalSeconds

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetIntervalSeconds() ConfigNodePropertyInteger`

GetIntervalSeconds returns the IntervalSeconds field if non-nil, zero value otherwise.

### GetIntervalSecondsOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetIntervalSecondsOk() (*ConfigNodePropertyInteger, bool)`

GetIntervalSecondsOk returns a tuple with the IntervalSeconds field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIntervalSeconds

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetIntervalSeconds(v ConfigNodePropertyInteger)`

SetIntervalSeconds sets IntervalSeconds field to given value.

### HasIntervalSeconds

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasIntervalSeconds() bool`

HasIntervalSeconds returns a boolean if a field has been set.

### GetCommitsPerIntervalThreshold

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetCommitsPerIntervalThreshold() ConfigNodePropertyInteger`

GetCommitsPerIntervalThreshold returns the CommitsPerIntervalThreshold field if non-nil, zero value otherwise.

### GetCommitsPerIntervalThresholdOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetCommitsPerIntervalThresholdOk() (*ConfigNodePropertyInteger, bool)`

GetCommitsPerIntervalThresholdOk returns a tuple with the CommitsPerIntervalThreshold field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCommitsPerIntervalThreshold

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetCommitsPerIntervalThreshold(v ConfigNodePropertyInteger)`

SetCommitsPerIntervalThreshold sets CommitsPerIntervalThreshold field to given value.

### HasCommitsPerIntervalThreshold

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasCommitsPerIntervalThreshold() bool`

HasCommitsPerIntervalThreshold returns a boolean if a field has been set.

### GetMaxLocationLength

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMaxLocationLength() ConfigNodePropertyInteger`

GetMaxLocationLength returns the MaxLocationLength field if non-nil, zero value otherwise.

### GetMaxLocationLengthOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMaxLocationLengthOk() (*ConfigNodePropertyInteger, bool)`

GetMaxLocationLengthOk returns a tuple with the MaxLocationLength field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxLocationLength

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetMaxLocationLength(v ConfigNodePropertyInteger)`

SetMaxLocationLength sets MaxLocationLength field to given value.

### HasMaxLocationLength

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasMaxLocationLength() bool`

HasMaxLocationLength returns a boolean if a field has been set.

### GetMaxDetailsShown

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMaxDetailsShown() ConfigNodePropertyInteger`

GetMaxDetailsShown returns the MaxDetailsShown field if non-nil, zero value otherwise.

### GetMaxDetailsShownOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMaxDetailsShownOk() (*ConfigNodePropertyInteger, bool)`

GetMaxDetailsShownOk returns a tuple with the MaxDetailsShown field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxDetailsShown

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetMaxDetailsShown(v ConfigNodePropertyInteger)`

SetMaxDetailsShown sets MaxDetailsShown field to given value.

### HasMaxDetailsShown

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasMaxDetailsShown() bool`

HasMaxDetailsShown returns a boolean if a field has been set.

### GetMinDetailsPercentage

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMinDetailsPercentage() ConfigNodePropertyInteger`

GetMinDetailsPercentage returns the MinDetailsPercentage field if non-nil, zero value otherwise.

### GetMinDetailsPercentageOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMinDetailsPercentageOk() (*ConfigNodePropertyInteger, bool)`

GetMinDetailsPercentageOk returns a tuple with the MinDetailsPercentage field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinDetailsPercentage

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetMinDetailsPercentage(v ConfigNodePropertyInteger)`

SetMinDetailsPercentage sets MinDetailsPercentage field to given value.

### HasMinDetailsPercentage

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasMinDetailsPercentage() bool`

HasMinDetailsPercentage returns a boolean if a field has been set.

### GetThreadMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetThreadMatchers() ConfigNodePropertyArray`

GetThreadMatchers returns the ThreadMatchers field if non-nil, zero value otherwise.

### GetThreadMatchersOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetThreadMatchersOk() (*ConfigNodePropertyArray, bool)`

GetThreadMatchersOk returns a tuple with the ThreadMatchers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetThreadMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetThreadMatchers(v ConfigNodePropertyArray)`

SetThreadMatchers sets ThreadMatchers field to given value.

### HasThreadMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasThreadMatchers() bool`

HasThreadMatchers returns a boolean if a field has been set.

### GetMaxGreedyDepth

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMaxGreedyDepth() ConfigNodePropertyInteger`

GetMaxGreedyDepth returns the MaxGreedyDepth field if non-nil, zero value otherwise.

### GetMaxGreedyDepthOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetMaxGreedyDepthOk() (*ConfigNodePropertyInteger, bool)`

GetMaxGreedyDepthOk returns a tuple with the MaxGreedyDepth field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMaxGreedyDepth

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetMaxGreedyDepth(v ConfigNodePropertyInteger)`

SetMaxGreedyDepth sets MaxGreedyDepth field to given value.

### HasMaxGreedyDepth

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasMaxGreedyDepth() bool`

HasMaxGreedyDepth returns a boolean if a field has been set.

### GetGreedyStackMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetGreedyStackMatchers() ConfigNodePropertyString`

GetGreedyStackMatchers returns the GreedyStackMatchers field if non-nil, zero value otherwise.

### GetGreedyStackMatchersOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetGreedyStackMatchersOk() (*ConfigNodePropertyString, bool)`

GetGreedyStackMatchersOk returns a tuple with the GreedyStackMatchers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGreedyStackMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetGreedyStackMatchers(v ConfigNodePropertyString)`

SetGreedyStackMatchers sets GreedyStackMatchers field to given value.

### HasGreedyStackMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasGreedyStackMatchers() bool`

HasGreedyStackMatchers returns a boolean if a field has been set.

### GetStackFilters

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackFilters() ConfigNodePropertyArray`

GetStackFilters returns the StackFilters field if non-nil, zero value otherwise.

### GetStackFiltersOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackFiltersOk() (*ConfigNodePropertyArray, bool)`

GetStackFiltersOk returns a tuple with the StackFilters field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStackFilters

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetStackFilters(v ConfigNodePropertyArray)`

SetStackFilters sets StackFilters field to given value.

### HasStackFilters

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasStackFilters() bool`

HasStackFilters returns a boolean if a field has been set.

### GetStackMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackMatchers() ConfigNodePropertyArray`

GetStackMatchers returns the StackMatchers field if non-nil, zero value otherwise.

### GetStackMatchersOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackMatchersOk() (*ConfigNodePropertyArray, bool)`

GetStackMatchersOk returns a tuple with the StackMatchers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStackMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetStackMatchers(v ConfigNodePropertyArray)`

SetStackMatchers sets StackMatchers field to given value.

### HasStackMatchers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasStackMatchers() bool`

HasStackMatchers returns a boolean if a field has been set.

### GetStackCategorizers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackCategorizers() ConfigNodePropertyArray`

GetStackCategorizers returns the StackCategorizers field if non-nil, zero value otherwise.

### GetStackCategorizersOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackCategorizersOk() (*ConfigNodePropertyArray, bool)`

GetStackCategorizersOk returns a tuple with the StackCategorizers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStackCategorizers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetStackCategorizers(v ConfigNodePropertyArray)`

SetStackCategorizers sets StackCategorizers field to given value.

### HasStackCategorizers

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasStackCategorizers() bool`

HasStackCategorizers returns a boolean if a field has been set.

### GetStackShorteners

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackShorteners() ConfigNodePropertyArray`

GetStackShorteners returns the StackShorteners field if non-nil, zero value otherwise.

### GetStackShortenersOk

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) GetStackShortenersOk() (*ConfigNodePropertyArray, bool)`

GetStackShortenersOk returns a tuple with the StackShorteners field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetStackShorteners

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) SetStackShorteners(v ConfigNodePropertyArray)`

SetStackShorteners sets StackShorteners field to given value.

### HasStackShorteners

`func (o *ComAdobeGraniteRepositoryImplCommitStatsConfigProperties) HasStackShorteners() bool`

HasStackShorteners returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


