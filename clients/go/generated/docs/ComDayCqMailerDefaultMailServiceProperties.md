# ComDayCqMailerDefaultMailServiceProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SmtpHost** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SmtpPort** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**SmtpUser** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SmtpPassword** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**FromAddress** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SmtpSsl** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**SmtpStarttls** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**DebugEmail** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Methods

### NewComDayCqMailerDefaultMailServiceProperties

`func NewComDayCqMailerDefaultMailServiceProperties() *ComDayCqMailerDefaultMailServiceProperties`

NewComDayCqMailerDefaultMailServiceProperties instantiates a new ComDayCqMailerDefaultMailServiceProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComDayCqMailerDefaultMailServicePropertiesWithDefaults

`func NewComDayCqMailerDefaultMailServicePropertiesWithDefaults() *ComDayCqMailerDefaultMailServiceProperties`

NewComDayCqMailerDefaultMailServicePropertiesWithDefaults instantiates a new ComDayCqMailerDefaultMailServiceProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSmtpHost

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpHost() ConfigNodePropertyString`

GetSmtpHost returns the SmtpHost field if non-nil, zero value otherwise.

### GetSmtpHostOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpHostOk() (*ConfigNodePropertyString, bool)`

GetSmtpHostOk returns a tuple with the SmtpHost field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmtpHost

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetSmtpHost(v ConfigNodePropertyString)`

SetSmtpHost sets SmtpHost field to given value.

### HasSmtpHost

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasSmtpHost() bool`

HasSmtpHost returns a boolean if a field has been set.

### GetSmtpPort

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpPort() ConfigNodePropertyInteger`

GetSmtpPort returns the SmtpPort field if non-nil, zero value otherwise.

### GetSmtpPortOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpPortOk() (*ConfigNodePropertyInteger, bool)`

GetSmtpPortOk returns a tuple with the SmtpPort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmtpPort

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetSmtpPort(v ConfigNodePropertyInteger)`

SetSmtpPort sets SmtpPort field to given value.

### HasSmtpPort

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasSmtpPort() bool`

HasSmtpPort returns a boolean if a field has been set.

### GetSmtpUser

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpUser() ConfigNodePropertyString`

GetSmtpUser returns the SmtpUser field if non-nil, zero value otherwise.

### GetSmtpUserOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpUserOk() (*ConfigNodePropertyString, bool)`

GetSmtpUserOk returns a tuple with the SmtpUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmtpUser

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetSmtpUser(v ConfigNodePropertyString)`

SetSmtpUser sets SmtpUser field to given value.

### HasSmtpUser

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasSmtpUser() bool`

HasSmtpUser returns a boolean if a field has been set.

### GetSmtpPassword

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpPassword() ConfigNodePropertyString`

GetSmtpPassword returns the SmtpPassword field if non-nil, zero value otherwise.

### GetSmtpPasswordOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpPasswordOk() (*ConfigNodePropertyString, bool)`

GetSmtpPasswordOk returns a tuple with the SmtpPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmtpPassword

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetSmtpPassword(v ConfigNodePropertyString)`

SetSmtpPassword sets SmtpPassword field to given value.

### HasSmtpPassword

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasSmtpPassword() bool`

HasSmtpPassword returns a boolean if a field has been set.

### GetFromAddress

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetFromAddress() ConfigNodePropertyString`

GetFromAddress returns the FromAddress field if non-nil, zero value otherwise.

### GetFromAddressOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetFromAddressOk() (*ConfigNodePropertyString, bool)`

GetFromAddressOk returns a tuple with the FromAddress field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetFromAddress

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetFromAddress(v ConfigNodePropertyString)`

SetFromAddress sets FromAddress field to given value.

### HasFromAddress

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasFromAddress() bool`

HasFromAddress returns a boolean if a field has been set.

### GetSmtpSsl

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpSsl() ConfigNodePropertyBoolean`

GetSmtpSsl returns the SmtpSsl field if non-nil, zero value otherwise.

### GetSmtpSslOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpSslOk() (*ConfigNodePropertyBoolean, bool)`

GetSmtpSslOk returns a tuple with the SmtpSsl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmtpSsl

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetSmtpSsl(v ConfigNodePropertyBoolean)`

SetSmtpSsl sets SmtpSsl field to given value.

### HasSmtpSsl

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasSmtpSsl() bool`

HasSmtpSsl returns a boolean if a field has been set.

### GetSmtpStarttls

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpStarttls() ConfigNodePropertyBoolean`

GetSmtpStarttls returns the SmtpStarttls field if non-nil, zero value otherwise.

### GetSmtpStarttlsOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetSmtpStarttlsOk() (*ConfigNodePropertyBoolean, bool)`

GetSmtpStarttlsOk returns a tuple with the SmtpStarttls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSmtpStarttls

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetSmtpStarttls(v ConfigNodePropertyBoolean)`

SetSmtpStarttls sets SmtpStarttls field to given value.

### HasSmtpStarttls

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasSmtpStarttls() bool`

HasSmtpStarttls returns a boolean if a field has been set.

### GetDebugEmail

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetDebugEmail() ConfigNodePropertyBoolean`

GetDebugEmail returns the DebugEmail field if non-nil, zero value otherwise.

### GetDebugEmailOk

`func (o *ComDayCqMailerDefaultMailServiceProperties) GetDebugEmailOk() (*ConfigNodePropertyBoolean, bool)`

GetDebugEmailOk returns a tuple with the DebugEmail field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDebugEmail

`func (o *ComDayCqMailerDefaultMailServiceProperties) SetDebugEmail(v ConfigNodePropertyBoolean)`

SetDebugEmail sets DebugEmail field to given value.

### HasDebugEmail

`func (o *ComDayCqMailerDefaultMailServiceProperties) HasDebugEmail() bool`

HasDebugEmail returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


