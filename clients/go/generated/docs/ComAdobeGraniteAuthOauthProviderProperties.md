# ComAdobeGraniteAuthOauthProviderProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**OauthConfigId** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthClientId** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthClientSecret** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthScope** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**OauthConfigProviderId** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthCreateUsers** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthUseridProperty** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ForceStrictUsernameMatching** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthEncodeUserids** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthHashUserids** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthCallBackUrl** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**OauthAccessTokenPersist** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthAccessTokenPersistCookie** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthCsrfStateProtection** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthRedirectRequestParams** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**OauthConfigSiblingsAllow** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Methods

### NewComAdobeGraniteAuthOauthProviderProperties

`func NewComAdobeGraniteAuthOauthProviderProperties() *ComAdobeGraniteAuthOauthProviderProperties`

NewComAdobeGraniteAuthOauthProviderProperties instantiates a new ComAdobeGraniteAuthOauthProviderProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeGraniteAuthOauthProviderPropertiesWithDefaults

`func NewComAdobeGraniteAuthOauthProviderPropertiesWithDefaults() *ComAdobeGraniteAuthOauthProviderProperties`

NewComAdobeGraniteAuthOauthProviderPropertiesWithDefaults instantiates a new ComAdobeGraniteAuthOauthProviderProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetOauthConfigId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthConfigId() ConfigNodePropertyString`

GetOauthConfigId returns the OauthConfigId field if non-nil, zero value otherwise.

### GetOauthConfigIdOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthConfigIdOk() (*ConfigNodePropertyString, bool)`

GetOauthConfigIdOk returns a tuple with the OauthConfigId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthConfigId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthConfigId(v ConfigNodePropertyString)`

SetOauthConfigId sets OauthConfigId field to given value.

### HasOauthConfigId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthConfigId() bool`

HasOauthConfigId returns a boolean if a field has been set.

### GetOauthClientId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthClientId() ConfigNodePropertyString`

GetOauthClientId returns the OauthClientId field if non-nil, zero value otherwise.

### GetOauthClientIdOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthClientIdOk() (*ConfigNodePropertyString, bool)`

GetOauthClientIdOk returns a tuple with the OauthClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthClientId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthClientId(v ConfigNodePropertyString)`

SetOauthClientId sets OauthClientId field to given value.

### HasOauthClientId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthClientId() bool`

HasOauthClientId returns a boolean if a field has been set.

### GetOauthClientSecret

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthClientSecret() ConfigNodePropertyString`

GetOauthClientSecret returns the OauthClientSecret field if non-nil, zero value otherwise.

### GetOauthClientSecretOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthClientSecretOk() (*ConfigNodePropertyString, bool)`

GetOauthClientSecretOk returns a tuple with the OauthClientSecret field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthClientSecret

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthClientSecret(v ConfigNodePropertyString)`

SetOauthClientSecret sets OauthClientSecret field to given value.

### HasOauthClientSecret

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthClientSecret() bool`

HasOauthClientSecret returns a boolean if a field has been set.

### GetOauthScope

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthScope() ConfigNodePropertyArray`

GetOauthScope returns the OauthScope field if non-nil, zero value otherwise.

### GetOauthScopeOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthScopeOk() (*ConfigNodePropertyArray, bool)`

GetOauthScopeOk returns a tuple with the OauthScope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthScope

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthScope(v ConfigNodePropertyArray)`

SetOauthScope sets OauthScope field to given value.

### HasOauthScope

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthScope() bool`

HasOauthScope returns a boolean if a field has been set.

### GetOauthConfigProviderId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthConfigProviderId() ConfigNodePropertyString`

GetOauthConfigProviderId returns the OauthConfigProviderId field if non-nil, zero value otherwise.

### GetOauthConfigProviderIdOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthConfigProviderIdOk() (*ConfigNodePropertyString, bool)`

GetOauthConfigProviderIdOk returns a tuple with the OauthConfigProviderId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthConfigProviderId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthConfigProviderId(v ConfigNodePropertyString)`

SetOauthConfigProviderId sets OauthConfigProviderId field to given value.

### HasOauthConfigProviderId

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthConfigProviderId() bool`

HasOauthConfigProviderId returns a boolean if a field has been set.

### GetOauthCreateUsers

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthCreateUsers() ConfigNodePropertyBoolean`

GetOauthCreateUsers returns the OauthCreateUsers field if non-nil, zero value otherwise.

### GetOauthCreateUsersOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthCreateUsersOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthCreateUsersOk returns a tuple with the OauthCreateUsers field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthCreateUsers

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthCreateUsers(v ConfigNodePropertyBoolean)`

SetOauthCreateUsers sets OauthCreateUsers field to given value.

### HasOauthCreateUsers

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthCreateUsers() bool`

HasOauthCreateUsers returns a boolean if a field has been set.

### GetOauthUseridProperty

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthUseridProperty() ConfigNodePropertyString`

GetOauthUseridProperty returns the OauthUseridProperty field if non-nil, zero value otherwise.

### GetOauthUseridPropertyOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthUseridPropertyOk() (*ConfigNodePropertyString, bool)`

GetOauthUseridPropertyOk returns a tuple with the OauthUseridProperty field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthUseridProperty

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthUseridProperty(v ConfigNodePropertyString)`

SetOauthUseridProperty sets OauthUseridProperty field to given value.

### HasOauthUseridProperty

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthUseridProperty() bool`

HasOauthUseridProperty returns a boolean if a field has been set.

### GetForceStrictUsernameMatching

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetForceStrictUsernameMatching() ConfigNodePropertyBoolean`

GetForceStrictUsernameMatching returns the ForceStrictUsernameMatching field if non-nil, zero value otherwise.

### GetForceStrictUsernameMatchingOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetForceStrictUsernameMatchingOk() (*ConfigNodePropertyBoolean, bool)`

GetForceStrictUsernameMatchingOk returns a tuple with the ForceStrictUsernameMatching field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetForceStrictUsernameMatching

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetForceStrictUsernameMatching(v ConfigNodePropertyBoolean)`

SetForceStrictUsernameMatching sets ForceStrictUsernameMatching field to given value.

### HasForceStrictUsernameMatching

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasForceStrictUsernameMatching() bool`

HasForceStrictUsernameMatching returns a boolean if a field has been set.

### GetOauthEncodeUserids

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthEncodeUserids() ConfigNodePropertyBoolean`

GetOauthEncodeUserids returns the OauthEncodeUserids field if non-nil, zero value otherwise.

### GetOauthEncodeUseridsOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthEncodeUseridsOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthEncodeUseridsOk returns a tuple with the OauthEncodeUserids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthEncodeUserids

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthEncodeUserids(v ConfigNodePropertyBoolean)`

SetOauthEncodeUserids sets OauthEncodeUserids field to given value.

### HasOauthEncodeUserids

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthEncodeUserids() bool`

HasOauthEncodeUserids returns a boolean if a field has been set.

### GetOauthHashUserids

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthHashUserids() ConfigNodePropertyBoolean`

GetOauthHashUserids returns the OauthHashUserids field if non-nil, zero value otherwise.

### GetOauthHashUseridsOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthHashUseridsOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthHashUseridsOk returns a tuple with the OauthHashUserids field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthHashUserids

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthHashUserids(v ConfigNodePropertyBoolean)`

SetOauthHashUserids sets OauthHashUserids field to given value.

### HasOauthHashUserids

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthHashUserids() bool`

HasOauthHashUserids returns a boolean if a field has been set.

### GetOauthCallBackUrl

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthCallBackUrl() ConfigNodePropertyString`

GetOauthCallBackUrl returns the OauthCallBackUrl field if non-nil, zero value otherwise.

### GetOauthCallBackUrlOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthCallBackUrlOk() (*ConfigNodePropertyString, bool)`

GetOauthCallBackUrlOk returns a tuple with the OauthCallBackUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthCallBackUrl

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthCallBackUrl(v ConfigNodePropertyString)`

SetOauthCallBackUrl sets OauthCallBackUrl field to given value.

### HasOauthCallBackUrl

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthCallBackUrl() bool`

HasOauthCallBackUrl returns a boolean if a field has been set.

### GetOauthAccessTokenPersist

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthAccessTokenPersist() ConfigNodePropertyBoolean`

GetOauthAccessTokenPersist returns the OauthAccessTokenPersist field if non-nil, zero value otherwise.

### GetOauthAccessTokenPersistOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthAccessTokenPersistOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthAccessTokenPersistOk returns a tuple with the OauthAccessTokenPersist field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthAccessTokenPersist

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthAccessTokenPersist(v ConfigNodePropertyBoolean)`

SetOauthAccessTokenPersist sets OauthAccessTokenPersist field to given value.

### HasOauthAccessTokenPersist

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthAccessTokenPersist() bool`

HasOauthAccessTokenPersist returns a boolean if a field has been set.

### GetOauthAccessTokenPersistCookie

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthAccessTokenPersistCookie() ConfigNodePropertyBoolean`

GetOauthAccessTokenPersistCookie returns the OauthAccessTokenPersistCookie field if non-nil, zero value otherwise.

### GetOauthAccessTokenPersistCookieOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthAccessTokenPersistCookieOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthAccessTokenPersistCookieOk returns a tuple with the OauthAccessTokenPersistCookie field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthAccessTokenPersistCookie

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthAccessTokenPersistCookie(v ConfigNodePropertyBoolean)`

SetOauthAccessTokenPersistCookie sets OauthAccessTokenPersistCookie field to given value.

### HasOauthAccessTokenPersistCookie

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthAccessTokenPersistCookie() bool`

HasOauthAccessTokenPersistCookie returns a boolean if a field has been set.

### GetOauthCsrfStateProtection

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthCsrfStateProtection() ConfigNodePropertyBoolean`

GetOauthCsrfStateProtection returns the OauthCsrfStateProtection field if non-nil, zero value otherwise.

### GetOauthCsrfStateProtectionOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthCsrfStateProtectionOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthCsrfStateProtectionOk returns a tuple with the OauthCsrfStateProtection field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthCsrfStateProtection

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthCsrfStateProtection(v ConfigNodePropertyBoolean)`

SetOauthCsrfStateProtection sets OauthCsrfStateProtection field to given value.

### HasOauthCsrfStateProtection

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthCsrfStateProtection() bool`

HasOauthCsrfStateProtection returns a boolean if a field has been set.

### GetOauthRedirectRequestParams

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthRedirectRequestParams() ConfigNodePropertyBoolean`

GetOauthRedirectRequestParams returns the OauthRedirectRequestParams field if non-nil, zero value otherwise.

### GetOauthRedirectRequestParamsOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthRedirectRequestParamsOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthRedirectRequestParamsOk returns a tuple with the OauthRedirectRequestParams field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthRedirectRequestParams

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthRedirectRequestParams(v ConfigNodePropertyBoolean)`

SetOauthRedirectRequestParams sets OauthRedirectRequestParams field to given value.

### HasOauthRedirectRequestParams

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthRedirectRequestParams() bool`

HasOauthRedirectRequestParams returns a boolean if a field has been set.

### GetOauthConfigSiblingsAllow

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthConfigSiblingsAllow() ConfigNodePropertyBoolean`

GetOauthConfigSiblingsAllow returns the OauthConfigSiblingsAllow field if non-nil, zero value otherwise.

### GetOauthConfigSiblingsAllowOk

`func (o *ComAdobeGraniteAuthOauthProviderProperties) GetOauthConfigSiblingsAllowOk() (*ConfigNodePropertyBoolean, bool)`

GetOauthConfigSiblingsAllowOk returns a tuple with the OauthConfigSiblingsAllow field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetOauthConfigSiblingsAllow

`func (o *ComAdobeGraniteAuthOauthProviderProperties) SetOauthConfigSiblingsAllow(v ConfigNodePropertyBoolean)`

SetOauthConfigSiblingsAllow sets OauthConfigSiblingsAllow field to given value.

### HasOauthConfigSiblingsAllow

`func (o *ComAdobeGraniteAuthOauthProviderProperties) HasOauthConfigSiblingsAllow() bool`

HasOauthConfigSiblingsAllow returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


