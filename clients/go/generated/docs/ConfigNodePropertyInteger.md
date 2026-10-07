# ConfigNodePropertyInteger

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | property name | [optional] 
**Optional** | Pointer to **bool** | True if optional | [optional] 
**IsSet** | Pointer to **bool** | True if property is set | [optional] 
**Type** | Pointer to **int32** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] 
**Value** | Pointer to **int32** | Property value | [optional] 
**Description** | Pointer to **string** | Property description | [optional] 

## Methods

### NewConfigNodePropertyInteger

`func NewConfigNodePropertyInteger() *ConfigNodePropertyInteger`

NewConfigNodePropertyInteger instantiates a new ConfigNodePropertyInteger object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigNodePropertyIntegerWithDefaults

`func NewConfigNodePropertyIntegerWithDefaults() *ConfigNodePropertyInteger`

NewConfigNodePropertyIntegerWithDefaults instantiates a new ConfigNodePropertyInteger object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ConfigNodePropertyInteger) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConfigNodePropertyInteger) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConfigNodePropertyInteger) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ConfigNodePropertyInteger) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptional

`func (o *ConfigNodePropertyInteger) GetOptional() bool`

GetOptional returns the Optional field if non-nil, zero value otherwise.

### GetOptionalOk

`func (o *ConfigNodePropertyInteger) GetOptionalOk() (*bool, bool)`

GetOptionalOk returns a tuple with the Optional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptional

`func (o *ConfigNodePropertyInteger) SetOptional(v bool)`

SetOptional sets Optional field to given value.

### HasOptional

`func (o *ConfigNodePropertyInteger) HasOptional() bool`

HasOptional returns a boolean if a field has been set.

### GetIsSet

`func (o *ConfigNodePropertyInteger) GetIsSet() bool`

GetIsSet returns the IsSet field if non-nil, zero value otherwise.

### GetIsSetOk

`func (o *ConfigNodePropertyInteger) GetIsSetOk() (*bool, bool)`

GetIsSetOk returns a tuple with the IsSet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSet

`func (o *ConfigNodePropertyInteger) SetIsSet(v bool)`

SetIsSet sets IsSet field to given value.

### HasIsSet

`func (o *ConfigNodePropertyInteger) HasIsSet() bool`

HasIsSet returns a boolean if a field has been set.

### GetType

`func (o *ConfigNodePropertyInteger) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConfigNodePropertyInteger) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConfigNodePropertyInteger) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *ConfigNodePropertyInteger) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValue

`func (o *ConfigNodePropertyInteger) GetValue() int32`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConfigNodePropertyInteger) GetValueOk() (*int32, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConfigNodePropertyInteger) SetValue(v int32)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConfigNodePropertyInteger) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetDescription

`func (o *ConfigNodePropertyInteger) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ConfigNodePropertyInteger) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ConfigNodePropertyInteger) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ConfigNodePropertyInteger) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


