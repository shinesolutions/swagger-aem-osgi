# ConfigNodePropertyDropDown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | property name | [optional] 
**Optional** | Pointer to **bool** | True if optional | [optional] 
**IsSet** | Pointer to **bool** | True if property is set | [optional] 
**Type** | Pointer to [**ConfigNodePropertyDropDownType**](ConfigNodePropertyDropDownType.md) |  | [optional] 
**Value** | Pointer to **interface{}** | Property value | [optional] 
**Description** | Pointer to **string** | Property description | [optional] 

## Methods

### NewConfigNodePropertyDropDown

`func NewConfigNodePropertyDropDown() *ConfigNodePropertyDropDown`

NewConfigNodePropertyDropDown instantiates a new ConfigNodePropertyDropDown object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigNodePropertyDropDownWithDefaults

`func NewConfigNodePropertyDropDownWithDefaults() *ConfigNodePropertyDropDown`

NewConfigNodePropertyDropDownWithDefaults instantiates a new ConfigNodePropertyDropDown object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ConfigNodePropertyDropDown) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConfigNodePropertyDropDown) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConfigNodePropertyDropDown) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ConfigNodePropertyDropDown) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptional

`func (o *ConfigNodePropertyDropDown) GetOptional() bool`

GetOptional returns the Optional field if non-nil, zero value otherwise.

### GetOptionalOk

`func (o *ConfigNodePropertyDropDown) GetOptionalOk() (*bool, bool)`

GetOptionalOk returns a tuple with the Optional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptional

`func (o *ConfigNodePropertyDropDown) SetOptional(v bool)`

SetOptional sets Optional field to given value.

### HasOptional

`func (o *ConfigNodePropertyDropDown) HasOptional() bool`

HasOptional returns a boolean if a field has been set.

### GetIsSet

`func (o *ConfigNodePropertyDropDown) GetIsSet() bool`

GetIsSet returns the IsSet field if non-nil, zero value otherwise.

### GetIsSetOk

`func (o *ConfigNodePropertyDropDown) GetIsSetOk() (*bool, bool)`

GetIsSetOk returns a tuple with the IsSet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSet

`func (o *ConfigNodePropertyDropDown) SetIsSet(v bool)`

SetIsSet sets IsSet field to given value.

### HasIsSet

`func (o *ConfigNodePropertyDropDown) HasIsSet() bool`

HasIsSet returns a boolean if a field has been set.

### GetType

`func (o *ConfigNodePropertyDropDown) GetType() ConfigNodePropertyDropDownType`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConfigNodePropertyDropDown) GetTypeOk() (*ConfigNodePropertyDropDownType, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConfigNodePropertyDropDown) SetType(v ConfigNodePropertyDropDownType)`

SetType sets Type field to given value.

### HasType

`func (o *ConfigNodePropertyDropDown) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValue

`func (o *ConfigNodePropertyDropDown) GetValue() interface{}`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConfigNodePropertyDropDown) GetValueOk() (*interface{}, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConfigNodePropertyDropDown) SetValue(v interface{})`

SetValue sets Value field to given value.

### HasValue

`func (o *ConfigNodePropertyDropDown) HasValue() bool`

HasValue returns a boolean if a field has been set.

### SetValueNil

`func (o *ConfigNodePropertyDropDown) SetValueNil(b bool)`

 SetValueNil sets the value for Value to be an explicit nil

### UnsetValue
`func (o *ConfigNodePropertyDropDown) UnsetValue()`

UnsetValue ensures that no value is present for Value, not even an explicit nil
### GetDescription

`func (o *ConfigNodePropertyDropDown) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ConfigNodePropertyDropDown) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ConfigNodePropertyDropDown) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ConfigNodePropertyDropDown) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


