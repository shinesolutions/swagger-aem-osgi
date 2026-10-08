# ConfigNodePropertyBoolean

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to **string** | property name | [optional] 
**Optional** | Pointer to **bool** | True if optional | [optional] 
**IsSet** | Pointer to **bool** | True if property is set | [optional] 
**Type** | Pointer to **int32** | Property type, 1&#x3D;String, 2&#x3D;Long, 3&#x3D;Integer, 7&#x3D;Float, 11&#x3D;Boolean, 12&#x3D;Secrets(String) | [optional] 
**Value** | Pointer to **bool** | Property value | [optional] 
**Description** | Pointer to **string** | Property description | [optional] 

## Methods

### NewConfigNodePropertyBoolean

`func NewConfigNodePropertyBoolean() *ConfigNodePropertyBoolean`

NewConfigNodePropertyBoolean instantiates a new ConfigNodePropertyBoolean object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewConfigNodePropertyBooleanWithDefaults

`func NewConfigNodePropertyBooleanWithDefaults() *ConfigNodePropertyBoolean`

NewConfigNodePropertyBooleanWithDefaults instantiates a new ConfigNodePropertyBoolean object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ConfigNodePropertyBoolean) GetName() string`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ConfigNodePropertyBoolean) GetNameOk() (*string, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ConfigNodePropertyBoolean) SetName(v string)`

SetName sets Name field to given value.

### HasName

`func (o *ConfigNodePropertyBoolean) HasName() bool`

HasName returns a boolean if a field has been set.

### GetOptional

`func (o *ConfigNodePropertyBoolean) GetOptional() bool`

GetOptional returns the Optional field if non-nil, zero value otherwise.

### GetOptionalOk

`func (o *ConfigNodePropertyBoolean) GetOptionalOk() (*bool, bool)`

GetOptionalOk returns a tuple with the Optional field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOptional

`func (o *ConfigNodePropertyBoolean) SetOptional(v bool)`

SetOptional sets Optional field to given value.

### HasOptional

`func (o *ConfigNodePropertyBoolean) HasOptional() bool`

HasOptional returns a boolean if a field has been set.

### GetIsSet

`func (o *ConfigNodePropertyBoolean) GetIsSet() bool`

GetIsSet returns the IsSet field if non-nil, zero value otherwise.

### GetIsSetOk

`func (o *ConfigNodePropertyBoolean) GetIsSetOk() (*bool, bool)`

GetIsSetOk returns a tuple with the IsSet field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIsSet

`func (o *ConfigNodePropertyBoolean) SetIsSet(v bool)`

SetIsSet sets IsSet field to given value.

### HasIsSet

`func (o *ConfigNodePropertyBoolean) HasIsSet() bool`

HasIsSet returns a boolean if a field has been set.

### GetType

`func (o *ConfigNodePropertyBoolean) GetType() int32`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *ConfigNodePropertyBoolean) GetTypeOk() (*int32, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *ConfigNodePropertyBoolean) SetType(v int32)`

SetType sets Type field to given value.

### HasType

`func (o *ConfigNodePropertyBoolean) HasType() bool`

HasType returns a boolean if a field has been set.

### GetValue

`func (o *ConfigNodePropertyBoolean) GetValue() bool`

GetValue returns the Value field if non-nil, zero value otherwise.

### GetValueOk

`func (o *ConfigNodePropertyBoolean) GetValueOk() (*bool, bool)`

GetValueOk returns a tuple with the Value field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetValue

`func (o *ConfigNodePropertyBoolean) SetValue(v bool)`

SetValue sets Value field to given value.

### HasValue

`func (o *ConfigNodePropertyBoolean) HasValue() bool`

HasValue returns a boolean if a field has been set.

### GetDescription

`func (o *ConfigNodePropertyBoolean) GetDescription() string`

GetDescription returns the Description field if non-nil, zero value otherwise.

### GetDescriptionOk

`func (o *ConfigNodePropertyBoolean) GetDescriptionOk() (*string, bool)`

GetDescriptionOk returns a tuple with the Description field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDescription

`func (o *ConfigNodePropertyBoolean) SetDescription(v string)`

SetDescription sets Description field to given value.

### HasDescription

`func (o *ConfigNodePropertyBoolean) HasDescription() bool`

HasDescription returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


