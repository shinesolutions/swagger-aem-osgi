# ComAdobeGraniteAuthOauthAccesstokenProviderProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenProviderTitle** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenProviderDefaultClaims** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**AuthTokenProviderEndpoint** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthAccessTokenRequest** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenProviderKeypairAlias** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenProviderConnTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AuthTokenProviderSoTimeout** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AuthTokenProviderClientId** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenProviderScope** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenProviderReuseAccessToken** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**AuthTokenProviderRelaxedSsl** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**TokenRequestCustomizerType** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AuthTokenValidatorType** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewComAdobeGraniteAuthOauthAccesstokenProviderProperties

`func NewComAdobeGraniteAuthOauthAccesstokenProviderProperties() *ComAdobeGraniteAuthOauthAccesstokenProviderProperties`

NewComAdobeGraniteAuthOauthAccesstokenProviderProperties instantiates a new ComAdobeGraniteAuthOauthAccesstokenProviderProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeGraniteAuthOauthAccesstokenProviderPropertiesWithDefaults

`func NewComAdobeGraniteAuthOauthAccesstokenProviderPropertiesWithDefaults() *ComAdobeGraniteAuthOauthAccesstokenProviderProperties`

NewComAdobeGraniteAuthOauthAccesstokenProviderPropertiesWithDefaults instantiates a new ComAdobeGraniteAuthOauthAccesstokenProviderProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetName

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetName() ConfigNodePropertyString`

GetName returns the Name field if non-nil, zero value otherwise.

### GetNameOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetNameOk() (*ConfigNodePropertyString, bool)`

GetNameOk returns a tuple with the Name field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetName

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetName(v ConfigNodePropertyString)`

SetName sets Name field to given value.

### HasName

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasName() bool`

HasName returns a boolean if a field has been set.

### GetAuthTokenProviderTitle

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderTitle() ConfigNodePropertyString`

GetAuthTokenProviderTitle returns the AuthTokenProviderTitle field if non-nil, zero value otherwise.

### GetAuthTokenProviderTitleOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderTitleOk() (*ConfigNodePropertyString, bool)`

GetAuthTokenProviderTitleOk returns a tuple with the AuthTokenProviderTitle field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderTitle

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderTitle(v ConfigNodePropertyString)`

SetAuthTokenProviderTitle sets AuthTokenProviderTitle field to given value.

### HasAuthTokenProviderTitle

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderTitle() bool`

HasAuthTokenProviderTitle returns a boolean if a field has been set.

### GetAuthTokenProviderDefaultClaims

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderDefaultClaims() ConfigNodePropertyArray`

GetAuthTokenProviderDefaultClaims returns the AuthTokenProviderDefaultClaims field if non-nil, zero value otherwise.

### GetAuthTokenProviderDefaultClaimsOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderDefaultClaimsOk() (*ConfigNodePropertyArray, bool)`

GetAuthTokenProviderDefaultClaimsOk returns a tuple with the AuthTokenProviderDefaultClaims field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderDefaultClaims

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderDefaultClaims(v ConfigNodePropertyArray)`

SetAuthTokenProviderDefaultClaims sets AuthTokenProviderDefaultClaims field to given value.

### HasAuthTokenProviderDefaultClaims

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderDefaultClaims() bool`

HasAuthTokenProviderDefaultClaims returns a boolean if a field has been set.

### GetAuthTokenProviderEndpoint

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderEndpoint() ConfigNodePropertyString`

GetAuthTokenProviderEndpoint returns the AuthTokenProviderEndpoint field if non-nil, zero value otherwise.

### GetAuthTokenProviderEndpointOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderEndpointOk() (*ConfigNodePropertyString, bool)`

GetAuthTokenProviderEndpointOk returns a tuple with the AuthTokenProviderEndpoint field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderEndpoint

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderEndpoint(v ConfigNodePropertyString)`

SetAuthTokenProviderEndpoint sets AuthTokenProviderEndpoint field to given value.

### HasAuthTokenProviderEndpoint

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderEndpoint() bool`

HasAuthTokenProviderEndpoint returns a boolean if a field has been set.

### GetAuthAccessTokenRequest

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthAccessTokenRequest() ConfigNodePropertyString`

GetAuthAccessTokenRequest returns the AuthAccessTokenRequest field if non-nil, zero value otherwise.

### GetAuthAccessTokenRequestOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthAccessTokenRequestOk() (*ConfigNodePropertyString, bool)`

GetAuthAccessTokenRequestOk returns a tuple with the AuthAccessTokenRequest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthAccessTokenRequest

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthAccessTokenRequest(v ConfigNodePropertyString)`

SetAuthAccessTokenRequest sets AuthAccessTokenRequest field to given value.

### HasAuthAccessTokenRequest

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthAccessTokenRequest() bool`

HasAuthAccessTokenRequest returns a boolean if a field has been set.

### GetAuthTokenProviderKeypairAlias

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderKeypairAlias() ConfigNodePropertyString`

GetAuthTokenProviderKeypairAlias returns the AuthTokenProviderKeypairAlias field if non-nil, zero value otherwise.

### GetAuthTokenProviderKeypairAliasOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderKeypairAliasOk() (*ConfigNodePropertyString, bool)`

GetAuthTokenProviderKeypairAliasOk returns a tuple with the AuthTokenProviderKeypairAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderKeypairAlias

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderKeypairAlias(v ConfigNodePropertyString)`

SetAuthTokenProviderKeypairAlias sets AuthTokenProviderKeypairAlias field to given value.

### HasAuthTokenProviderKeypairAlias

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderKeypairAlias() bool`

HasAuthTokenProviderKeypairAlias returns a boolean if a field has been set.

### GetAuthTokenProviderConnTimeout

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderConnTimeout() ConfigNodePropertyInteger`

GetAuthTokenProviderConnTimeout returns the AuthTokenProviderConnTimeout field if non-nil, zero value otherwise.

### GetAuthTokenProviderConnTimeoutOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderConnTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetAuthTokenProviderConnTimeoutOk returns a tuple with the AuthTokenProviderConnTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderConnTimeout

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderConnTimeout(v ConfigNodePropertyInteger)`

SetAuthTokenProviderConnTimeout sets AuthTokenProviderConnTimeout field to given value.

### HasAuthTokenProviderConnTimeout

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderConnTimeout() bool`

HasAuthTokenProviderConnTimeout returns a boolean if a field has been set.

### GetAuthTokenProviderSoTimeout

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderSoTimeout() ConfigNodePropertyInteger`

GetAuthTokenProviderSoTimeout returns the AuthTokenProviderSoTimeout field if non-nil, zero value otherwise.

### GetAuthTokenProviderSoTimeoutOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderSoTimeoutOk() (*ConfigNodePropertyInteger, bool)`

GetAuthTokenProviderSoTimeoutOk returns a tuple with the AuthTokenProviderSoTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderSoTimeout

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderSoTimeout(v ConfigNodePropertyInteger)`

SetAuthTokenProviderSoTimeout sets AuthTokenProviderSoTimeout field to given value.

### HasAuthTokenProviderSoTimeout

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderSoTimeout() bool`

HasAuthTokenProviderSoTimeout returns a boolean if a field has been set.

### GetAuthTokenProviderClientId

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderClientId() ConfigNodePropertyString`

GetAuthTokenProviderClientId returns the AuthTokenProviderClientId field if non-nil, zero value otherwise.

### GetAuthTokenProviderClientIdOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderClientIdOk() (*ConfigNodePropertyString, bool)`

GetAuthTokenProviderClientIdOk returns a tuple with the AuthTokenProviderClientId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderClientId

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderClientId(v ConfigNodePropertyString)`

SetAuthTokenProviderClientId sets AuthTokenProviderClientId field to given value.

### HasAuthTokenProviderClientId

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderClientId() bool`

HasAuthTokenProviderClientId returns a boolean if a field has been set.

### GetAuthTokenProviderScope

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderScope() ConfigNodePropertyString`

GetAuthTokenProviderScope returns the AuthTokenProviderScope field if non-nil, zero value otherwise.

### GetAuthTokenProviderScopeOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderScopeOk() (*ConfigNodePropertyString, bool)`

GetAuthTokenProviderScopeOk returns a tuple with the AuthTokenProviderScope field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderScope

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderScope(v ConfigNodePropertyString)`

SetAuthTokenProviderScope sets AuthTokenProviderScope field to given value.

### HasAuthTokenProviderScope

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderScope() bool`

HasAuthTokenProviderScope returns a boolean if a field has been set.

### GetAuthTokenProviderReuseAccessToken

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderReuseAccessToken() ConfigNodePropertyBoolean`

GetAuthTokenProviderReuseAccessToken returns the AuthTokenProviderReuseAccessToken field if non-nil, zero value otherwise.

### GetAuthTokenProviderReuseAccessTokenOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderReuseAccessTokenOk() (*ConfigNodePropertyBoolean, bool)`

GetAuthTokenProviderReuseAccessTokenOk returns a tuple with the AuthTokenProviderReuseAccessToken field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderReuseAccessToken

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderReuseAccessToken(v ConfigNodePropertyBoolean)`

SetAuthTokenProviderReuseAccessToken sets AuthTokenProviderReuseAccessToken field to given value.

### HasAuthTokenProviderReuseAccessToken

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderReuseAccessToken() bool`

HasAuthTokenProviderReuseAccessToken returns a boolean if a field has been set.

### GetAuthTokenProviderRelaxedSsl

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderRelaxedSsl() ConfigNodePropertyBoolean`

GetAuthTokenProviderRelaxedSsl returns the AuthTokenProviderRelaxedSsl field if non-nil, zero value otherwise.

### GetAuthTokenProviderRelaxedSslOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenProviderRelaxedSslOk() (*ConfigNodePropertyBoolean, bool)`

GetAuthTokenProviderRelaxedSslOk returns a tuple with the AuthTokenProviderRelaxedSsl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenProviderRelaxedSsl

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenProviderRelaxedSsl(v ConfigNodePropertyBoolean)`

SetAuthTokenProviderRelaxedSsl sets AuthTokenProviderRelaxedSsl field to given value.

### HasAuthTokenProviderRelaxedSsl

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenProviderRelaxedSsl() bool`

HasAuthTokenProviderRelaxedSsl returns a boolean if a field has been set.

### GetTokenRequestCustomizerType

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetTokenRequestCustomizerType() ConfigNodePropertyString`

GetTokenRequestCustomizerType returns the TokenRequestCustomizerType field if non-nil, zero value otherwise.

### GetTokenRequestCustomizerTypeOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetTokenRequestCustomizerTypeOk() (*ConfigNodePropertyString, bool)`

GetTokenRequestCustomizerTypeOk returns a tuple with the TokenRequestCustomizerType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTokenRequestCustomizerType

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetTokenRequestCustomizerType(v ConfigNodePropertyString)`

SetTokenRequestCustomizerType sets TokenRequestCustomizerType field to given value.

### HasTokenRequestCustomizerType

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasTokenRequestCustomizerType() bool`

HasTokenRequestCustomizerType returns a boolean if a field has been set.

### GetAuthTokenValidatorType

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenValidatorType() ConfigNodePropertyString`

GetAuthTokenValidatorType returns the AuthTokenValidatorType field if non-nil, zero value otherwise.

### GetAuthTokenValidatorTypeOk

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) GetAuthTokenValidatorTypeOk() (*ConfigNodePropertyString, bool)`

GetAuthTokenValidatorTypeOk returns a tuple with the AuthTokenValidatorType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAuthTokenValidatorType

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) SetAuthTokenValidatorType(v ConfigNodePropertyString)`

SetAuthTokenValidatorType sets AuthTokenValidatorType field to given value.

### HasAuthTokenValidatorType

`func (o *ComAdobeGraniteAuthOauthAccesstokenProviderProperties) HasAuthTokenValidatorType() bool`

HasAuthTokenValidatorType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


