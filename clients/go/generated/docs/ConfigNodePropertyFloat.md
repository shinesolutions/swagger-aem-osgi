# ConfigNodePropertyFloat

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | property name | [optional] 
**Optional** | Pointer to **bool** | True if optional | [optional] 
**IsSet** | Pointer to **bool** | True if property is set | [optional] 
**Type** | Pointer to **int32** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] 
**Value** | Pointer to **float32** | Property value | [optional] 
**Description** | Pointer to **string** | Property description | [optional] 

## Methods

### NewConfigNodePropertyFloat

`func NewConfigNodePropertyFloat() *ConfigNodePropertyFloat`

NewConfigNodePropertyFloat instantiates a new ConfigNodePropertyFloat object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigNodePropertyFloatWithDefaults

`func NewConfigNodePropertyFloatWithDefaults() *ConfigNodePropertyFloat`

NewConfigNodePropertyFloatWithDefaults instantiates a new ConfigNodePropertyFloat object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ConfigNodePropertyFloat) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConfigNodePropertyFloat) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConfigNodePropertyFloat) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ConfigNodePropertyFloat) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptional

`func (o *ConfigNodePropertyFloat) GetOptional() bool`

GetOptional returns the Optional field if non-nil, zero value otherwise.

### GetOptionalOk

`func (o *ConfigNodePropertyFloat) GetOptionalOk() (*bool, bool)`

GetOptionalOk returns a tuple with the Optional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptional

`func (o *ConfigNodePropertyFloat) SetOptional(v bool)`

SetOptional sets Optional field to given value.

### HasOptional

`func (o *ConfigNodePropertyFloat) HasOptional() bool`

HasOptional returns a boolean if a field has been set.

### GetIsSet

`func (o *ConfigNodePropertyFloat) GetIsSet() bool`

GetIsSet returns the IsSet field if non-nil, zero value otherwise.

### GetIsSetOk

`func (o *ConfigNodePropertyFloat) GetIsSetOk() (*bool, bool)`

GetIsSetOk returns a tuple with the IsSet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSet

`func (o *ConfigNodePropertyFloat) SetIsSet(v bool)`

SetIsSet sets IsSet field to given value.

### HasIsSet

`func (o *ConfigNodePropertyFloat) HasIsSet() bool`

HasIsSet returns a boolean if a field has been set.

### GetType

`func (o *ConfigNodePropertyFloat) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConfigNodePropertyFloat) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConfigNodePropertyFloat) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *ConfigNodePropertyFloat) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValue

`func (o *ConfigNodePropertyFloat) GetValue() float32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConfigNodePropertyFloat) GetValueOk() (*float32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConfigNodePropertyFloat) SetValue(v float32)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConfigNodePropertyFloat) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetDescription

`func (o *ConfigNodePropertyFloat) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ConfigNodePropertyFloat) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ConfigNodePropertyFloat) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ConfigNodePropertyFloat) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


