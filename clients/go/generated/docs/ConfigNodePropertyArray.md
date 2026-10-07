# ConfigNodePropertyArray

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | property name | [optional] 
**Optional** | Pointer to **bool** | True if optional | [optional] 
**IsSet** | Pointer to **bool** | True if property is set | [optional] 
**Type** | Pointer to **int32** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] 
**Values** | Pointer to **[]string** | Property value | [optional] 
**Description** | Pointer to **string** | Property description | [optional] 

## Methods

### NewConfigNodePropertyArray

`func NewConfigNodePropertyArray() *ConfigNodePropertyArray`

NewConfigNodePropertyArray instantiates a new ConfigNodePropertyArray object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigNodePropertyArrayWithDefaults

`func NewConfigNodePropertyArrayWithDefaults() *ConfigNodePropertyArray`

NewConfigNodePropertyArrayWithDefaults instantiates a new ConfigNodePropertyArray object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ConfigNodePropertyArray) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConfigNodePropertyArray) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConfigNodePropertyArray) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ConfigNodePropertyArray) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptional

`func (o *ConfigNodePropertyArray) GetOptional() bool`

GetOptional returns the Optional field if non-nil, zero value otherwise.

### GetOptionalOk

`func (o *ConfigNodePropertyArray) GetOptionalOk() (*bool, bool)`

GetOptionalOk returns a tuple with the Optional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptional

`func (o *ConfigNodePropertyArray) SetOptional(v bool)`

SetOptional sets Optional field to given value.

### HasOptional

`func (o *ConfigNodePropertyArray) HasOptional() bool`

HasOptional returns a boolean if a field has been set.

### GetIsSet

`func (o *ConfigNodePropertyArray) GetIsSet() bool`

GetIsSet returns the IsSet field if non-nil, zero value otherwise.

### GetIsSetOk

`func (o *ConfigNodePropertyArray) GetIsSetOk() (*bool, bool)`

GetIsSetOk returns a tuple with the IsSet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSet

`func (o *ConfigNodePropertyArray) SetIsSet(v bool)`

SetIsSet sets IsSet field to given value.

### HasIsSet

`func (o *ConfigNodePropertyArray) HasIsSet() bool`

HasIsSet returns a boolean if a field has been set.

### GetType

`func (o *ConfigNodePropertyArray) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConfigNodePropertyArray) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConfigNodePropertyArray) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *ConfigNodePropertyArray) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValues

`func (o *ConfigNodePropertyArray) GetValues() []string`

GetValues returns the Values field if non-nil, zero value otherwise.

### GetValuesOk

`func (o *ConfigNodePropertyArray) GetValuesOk() (*[]string, bool)`

GetValuesOk returns a tuple with the Values field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValues

`func (o *ConfigNodePropertyArray) SetValues(v []string)`

SetValues sets Values field to given value.

### HasValues

`func (o *ConfigNodePropertyArray) HasValues() bool`

HasValues returns a boolean if a field has been set.

### GetDescription

`func (o *ConfigNodePropertyArray) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ConfigNodePropertyArray) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ConfigNodePropertyArray) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ConfigNodePropertyArray) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


