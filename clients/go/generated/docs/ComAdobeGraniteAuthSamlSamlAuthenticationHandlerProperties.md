# ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Path** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**ServiceRanking** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**IdpUrl** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdpCertAlias** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdpHttpRedirect** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**ServiceProviderEntityId** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AssertionConsumerServiceURL** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SpPrivateKeyAlias** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**KeyStorePassword** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultRedirectUrl** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserIDAttribute** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UseEncryption** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**CreateUser** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UserIntermediatePath** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AddGroupMemberships** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GroupMembershipAttribute** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**DefaultGroups** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**NameIdFormat** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SynchronizeAttributes** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**HandleLogout** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**LogoutUrl** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ClockTolerance** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**DigestMethod** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SignatureMethod** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**IdentitySyncType** | Pointer to [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**IdpIdentifier** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Methods

### NewComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

`func NewComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties() *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`

NewComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties instantiates a new ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesWithDefaults

`func NewComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesWithDefaults() *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties`

NewComAdobeGraniteAuthSamlSamlAuthenticationHandlerPropertiesWithDefaults instantiates a new ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetPath

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetPath() ConfigNodePropertyArray`

GetPath returns the Path field if non-nil, zero value otherwise.

### GetPathOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetPathOk() (*ConfigNodePropertyArray, bool)`

GetPathOk returns a tuple with the Path field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetPath

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetPath(v ConfigNodePropertyArray)`

SetPath sets Path field to given value.

### HasPath

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasPath() bool`

HasPath returns a boolean if a field has been set.

### GetServiceRanking

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetServiceRanking() ConfigNodePropertyInteger`

GetServiceRanking returns the ServiceRanking field if non-nil, zero value otherwise.

### GetServiceRankingOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetServiceRankingOk() (*ConfigNodePropertyInteger, bool)`

GetServiceRankingOk returns a tuple with the ServiceRanking field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceRanking

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetServiceRanking(v ConfigNodePropertyInteger)`

SetServiceRanking sets ServiceRanking field to given value.

### HasServiceRanking

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasServiceRanking() bool`

HasServiceRanking returns a boolean if a field has been set.

### GetIdpUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpUrl() ConfigNodePropertyString`

GetIdpUrl returns the IdpUrl field if non-nil, zero value otherwise.

### GetIdpUrlOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpUrlOk() (*ConfigNodePropertyString, bool)`

GetIdpUrlOk returns a tuple with the IdpUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetIdpUrl(v ConfigNodePropertyString)`

SetIdpUrl sets IdpUrl field to given value.

### HasIdpUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasIdpUrl() bool`

HasIdpUrl returns a boolean if a field has been set.

### GetIdpCertAlias

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpCertAlias() ConfigNodePropertyString`

GetIdpCertAlias returns the IdpCertAlias field if non-nil, zero value otherwise.

### GetIdpCertAliasOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpCertAliasOk() (*ConfigNodePropertyString, bool)`

GetIdpCertAliasOk returns a tuple with the IdpCertAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpCertAlias

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetIdpCertAlias(v ConfigNodePropertyString)`

SetIdpCertAlias sets IdpCertAlias field to given value.

### HasIdpCertAlias

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasIdpCertAlias() bool`

HasIdpCertAlias returns a boolean if a field has been set.

### GetIdpHttpRedirect

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpHttpRedirect() ConfigNodePropertyBoolean`

GetIdpHttpRedirect returns the IdpHttpRedirect field if non-nil, zero value otherwise.

### GetIdpHttpRedirectOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpHttpRedirectOk() (*ConfigNodePropertyBoolean, bool)`

GetIdpHttpRedirectOk returns a tuple with the IdpHttpRedirect field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpHttpRedirect

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetIdpHttpRedirect(v ConfigNodePropertyBoolean)`

SetIdpHttpRedirect sets IdpHttpRedirect field to given value.

### HasIdpHttpRedirect

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasIdpHttpRedirect() bool`

HasIdpHttpRedirect returns a boolean if a field has been set.

### GetServiceProviderEntityId

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetServiceProviderEntityId() ConfigNodePropertyString`

GetServiceProviderEntityId returns the ServiceProviderEntityId field if non-nil, zero value otherwise.

### GetServiceProviderEntityIdOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetServiceProviderEntityIdOk() (*ConfigNodePropertyString, bool)`

GetServiceProviderEntityIdOk returns a tuple with the ServiceProviderEntityId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetServiceProviderEntityId

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetServiceProviderEntityId(v ConfigNodePropertyString)`

SetServiceProviderEntityId sets ServiceProviderEntityId field to given value.

### HasServiceProviderEntityId

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasServiceProviderEntityId() bool`

HasServiceProviderEntityId returns a boolean if a field has been set.

### GetAssertionConsumerServiceURL

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetAssertionConsumerServiceURL() ConfigNodePropertyString`

GetAssertionConsumerServiceURL returns the AssertionConsumerServiceURL field if non-nil, zero value otherwise.

### GetAssertionConsumerServiceURLOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetAssertionConsumerServiceURLOk() (*ConfigNodePropertyString, bool)`

GetAssertionConsumerServiceURLOk returns a tuple with the AssertionConsumerServiceURL field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssertionConsumerServiceURL

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetAssertionConsumerServiceURL(v ConfigNodePropertyString)`

SetAssertionConsumerServiceURL sets AssertionConsumerServiceURL field to given value.

### HasAssertionConsumerServiceURL

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasAssertionConsumerServiceURL() bool`

HasAssertionConsumerServiceURL returns a boolean if a field has been set.

### GetSpPrivateKeyAlias

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetSpPrivateKeyAlias() ConfigNodePropertyString`

GetSpPrivateKeyAlias returns the SpPrivateKeyAlias field if non-nil, zero value otherwise.

### GetSpPrivateKeyAliasOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetSpPrivateKeyAliasOk() (*ConfigNodePropertyString, bool)`

GetSpPrivateKeyAliasOk returns a tuple with the SpPrivateKeyAlias field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSpPrivateKeyAlias

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetSpPrivateKeyAlias(v ConfigNodePropertyString)`

SetSpPrivateKeyAlias sets SpPrivateKeyAlias field to given value.

### HasSpPrivateKeyAlias

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasSpPrivateKeyAlias() bool`

HasSpPrivateKeyAlias returns a boolean if a field has been set.

### GetKeyStorePassword

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetKeyStorePassword() ConfigNodePropertyString`

GetKeyStorePassword returns the KeyStorePassword field if non-nil, zero value otherwise.

### GetKeyStorePasswordOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetKeyStorePasswordOk() (*ConfigNodePropertyString, bool)`

GetKeyStorePasswordOk returns a tuple with the KeyStorePassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetKeyStorePassword

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetKeyStorePassword(v ConfigNodePropertyString)`

SetKeyStorePassword sets KeyStorePassword field to given value.

### HasKeyStorePassword

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasKeyStorePassword() bool`

HasKeyStorePassword returns a boolean if a field has been set.

### GetDefaultRedirectUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetDefaultRedirectUrl() ConfigNodePropertyString`

GetDefaultRedirectUrl returns the DefaultRedirectUrl field if non-nil, zero value otherwise.

### GetDefaultRedirectUrlOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetDefaultRedirectUrlOk() (*ConfigNodePropertyString, bool)`

GetDefaultRedirectUrlOk returns a tuple with the DefaultRedirectUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultRedirectUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetDefaultRedirectUrl(v ConfigNodePropertyString)`

SetDefaultRedirectUrl sets DefaultRedirectUrl field to given value.

### HasDefaultRedirectUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasDefaultRedirectUrl() bool`

HasDefaultRedirectUrl returns a boolean if a field has been set.

### GetUserIDAttribute

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetUserIDAttribute() ConfigNodePropertyString`

GetUserIDAttribute returns the UserIDAttribute field if non-nil, zero value otherwise.

### GetUserIDAttributeOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetUserIDAttributeOk() (*ConfigNodePropertyString, bool)`

GetUserIDAttributeOk returns a tuple with the UserIDAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserIDAttribute

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetUserIDAttribute(v ConfigNodePropertyString)`

SetUserIDAttribute sets UserIDAttribute field to given value.

### HasUserIDAttribute

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasUserIDAttribute() bool`

HasUserIDAttribute returns a boolean if a field has been set.

### GetUseEncryption

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetUseEncryption() ConfigNodePropertyBoolean`

GetUseEncryption returns the UseEncryption field if non-nil, zero value otherwise.

### GetUseEncryptionOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetUseEncryptionOk() (*ConfigNodePropertyBoolean, bool)`

GetUseEncryptionOk returns a tuple with the UseEncryption field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseEncryption

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetUseEncryption(v ConfigNodePropertyBoolean)`

SetUseEncryption sets UseEncryption field to given value.

### HasUseEncryption

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasUseEncryption() bool`

HasUseEncryption returns a boolean if a field has been set.

### GetCreateUser

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetCreateUser() ConfigNodePropertyBoolean`

GetCreateUser returns the CreateUser field if non-nil, zero value otherwise.

### GetCreateUserOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetCreateUserOk() (*ConfigNodePropertyBoolean, bool)`

GetCreateUserOk returns a tuple with the CreateUser field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCreateUser

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetCreateUser(v ConfigNodePropertyBoolean)`

SetCreateUser sets CreateUser field to given value.

### HasCreateUser

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasCreateUser() bool`

HasCreateUser returns a boolean if a field has been set.

### GetUserIntermediatePath

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetUserIntermediatePath() ConfigNodePropertyString`

GetUserIntermediatePath returns the UserIntermediatePath field if non-nil, zero value otherwise.

### GetUserIntermediatePathOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetUserIntermediatePathOk() (*ConfigNodePropertyString, bool)`

GetUserIntermediatePathOk returns a tuple with the UserIntermediatePath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserIntermediatePath

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetUserIntermediatePath(v ConfigNodePropertyString)`

SetUserIntermediatePath sets UserIntermediatePath field to given value.

### HasUserIntermediatePath

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasUserIntermediatePath() bool`

HasUserIntermediatePath returns a boolean if a field has been set.

### GetAddGroupMemberships

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetAddGroupMemberships() ConfigNodePropertyBoolean`

GetAddGroupMemberships returns the AddGroupMemberships field if non-nil, zero value otherwise.

### GetAddGroupMembershipsOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetAddGroupMembershipsOk() (*ConfigNodePropertyBoolean, bool)`

GetAddGroupMembershipsOk returns a tuple with the AddGroupMemberships field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAddGroupMemberships

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetAddGroupMemberships(v ConfigNodePropertyBoolean)`

SetAddGroupMemberships sets AddGroupMemberships field to given value.

### HasAddGroupMemberships

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasAddGroupMemberships() bool`

HasAddGroupMemberships returns a boolean if a field has been set.

### GetGroupMembershipAttribute

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetGroupMembershipAttribute() ConfigNodePropertyString`

GetGroupMembershipAttribute returns the GroupMembershipAttribute field if non-nil, zero value otherwise.

### GetGroupMembershipAttributeOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetGroupMembershipAttributeOk() (*ConfigNodePropertyString, bool)`

GetGroupMembershipAttributeOk returns a tuple with the GroupMembershipAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupMembershipAttribute

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetGroupMembershipAttribute(v ConfigNodePropertyString)`

SetGroupMembershipAttribute sets GroupMembershipAttribute field to given value.

### HasGroupMembershipAttribute

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasGroupMembershipAttribute() bool`

HasGroupMembershipAttribute returns a boolean if a field has been set.

### GetDefaultGroups

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetDefaultGroups() ConfigNodePropertyArray`

GetDefaultGroups returns the DefaultGroups field if non-nil, zero value otherwise.

### GetDefaultGroupsOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetDefaultGroupsOk() (*ConfigNodePropertyArray, bool)`

GetDefaultGroupsOk returns a tuple with the DefaultGroups field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDefaultGroups

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetDefaultGroups(v ConfigNodePropertyArray)`

SetDefaultGroups sets DefaultGroups field to given value.

### HasDefaultGroups

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasDefaultGroups() bool`

HasDefaultGroups returns a boolean if a field has been set.

### GetNameIdFormat

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetNameIdFormat() ConfigNodePropertyString`

GetNameIdFormat returns the NameIdFormat field if non-nil, zero value otherwise.

### GetNameIdFormatOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetNameIdFormatOk() (*ConfigNodePropertyString, bool)`

GetNameIdFormatOk returns a tuple with the NameIdFormat field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetNameIdFormat

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetNameIdFormat(v ConfigNodePropertyString)`

SetNameIdFormat sets NameIdFormat field to given value.

### HasNameIdFormat

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasNameIdFormat() bool`

HasNameIdFormat returns a boolean if a field has been set.

### GetSynchronizeAttributes

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetSynchronizeAttributes() ConfigNodePropertyArray`

GetSynchronizeAttributes returns the SynchronizeAttributes field if non-nil, zero value otherwise.

### GetSynchronizeAttributesOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetSynchronizeAttributesOk() (*ConfigNodePropertyArray, bool)`

GetSynchronizeAttributesOk returns a tuple with the SynchronizeAttributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSynchronizeAttributes

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetSynchronizeAttributes(v ConfigNodePropertyArray)`

SetSynchronizeAttributes sets SynchronizeAttributes field to given value.

### HasSynchronizeAttributes

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasSynchronizeAttributes() bool`

HasSynchronizeAttributes returns a boolean if a field has been set.

### GetHandleLogout

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetHandleLogout() ConfigNodePropertyBoolean`

GetHandleLogout returns the HandleLogout field if non-nil, zero value otherwise.

### GetHandleLogoutOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetHandleLogoutOk() (*ConfigNodePropertyBoolean, bool)`

GetHandleLogoutOk returns a tuple with the HandleLogout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHandleLogout

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetHandleLogout(v ConfigNodePropertyBoolean)`

SetHandleLogout sets HandleLogout field to given value.

### HasHandleLogout

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasHandleLogout() bool`

HasHandleLogout returns a boolean if a field has been set.

### GetLogoutUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetLogoutUrl() ConfigNodePropertyString`

GetLogoutUrl returns the LogoutUrl field if non-nil, zero value otherwise.

### GetLogoutUrlOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetLogoutUrlOk() (*ConfigNodePropertyString, bool)`

GetLogoutUrlOk returns a tuple with the LogoutUrl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLogoutUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetLogoutUrl(v ConfigNodePropertyString)`

SetLogoutUrl sets LogoutUrl field to given value.

### HasLogoutUrl

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasLogoutUrl() bool`

HasLogoutUrl returns a boolean if a field has been set.

### GetClockTolerance

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetClockTolerance() ConfigNodePropertyInteger`

GetClockTolerance returns the ClockTolerance field if non-nil, zero value otherwise.

### GetClockToleranceOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetClockToleranceOk() (*ConfigNodePropertyInteger, bool)`

GetClockToleranceOk returns a tuple with the ClockTolerance field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetClockTolerance

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetClockTolerance(v ConfigNodePropertyInteger)`

SetClockTolerance sets ClockTolerance field to given value.

### HasClockTolerance

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasClockTolerance() bool`

HasClockTolerance returns a boolean if a field has been set.

### GetDigestMethod

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetDigestMethod() ConfigNodePropertyString`

GetDigestMethod returns the DigestMethod field if non-nil, zero value otherwise.

### GetDigestMethodOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetDigestMethodOk() (*ConfigNodePropertyString, bool)`

GetDigestMethodOk returns a tuple with the DigestMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDigestMethod

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetDigestMethod(v ConfigNodePropertyString)`

SetDigestMethod sets DigestMethod field to given value.

### HasDigestMethod

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasDigestMethod() bool`

HasDigestMethod returns a boolean if a field has been set.

### GetSignatureMethod

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetSignatureMethod() ConfigNodePropertyString`

GetSignatureMethod returns the SignatureMethod field if non-nil, zero value otherwise.

### GetSignatureMethodOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetSignatureMethodOk() (*ConfigNodePropertyString, bool)`

GetSignatureMethodOk returns a tuple with the SignatureMethod field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSignatureMethod

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetSignatureMethod(v ConfigNodePropertyString)`

SetSignatureMethod sets SignatureMethod field to given value.

### HasSignatureMethod

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasSignatureMethod() bool`

HasSignatureMethod returns a boolean if a field has been set.

### GetIdentitySyncType

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdentitySyncType() ConfigNodePropertyDropDown`

GetIdentitySyncType returns the IdentitySyncType field if non-nil, zero value otherwise.

### GetIdentitySyncTypeOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdentitySyncTypeOk() (*ConfigNodePropertyDropDown, bool)`

GetIdentitySyncTypeOk returns a tuple with the IdentitySyncType field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdentitySyncType

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetIdentitySyncType(v ConfigNodePropertyDropDown)`

SetIdentitySyncType sets IdentitySyncType field to given value.

### HasIdentitySyncType

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasIdentitySyncType() bool`

HasIdentitySyncType returns a boolean if a field has been set.

### GetIdpIdentifier

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpIdentifier() ConfigNodePropertyString`

GetIdpIdentifier returns the IdpIdentifier field if non-nil, zero value otherwise.

### GetIdpIdentifierOk

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) GetIdpIdentifierOk() (*ConfigNodePropertyString, bool)`

GetIdpIdentifierOk returns a tuple with the IdpIdentifier field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetIdpIdentifier

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) SetIdpIdentifier(v ConfigNodePropertyString)`

SetIdpIdentifier sets IdpIdentifier field to given value.

### HasIdpIdentifier

`func (o *ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties) HasIdpIdentifier() bool`

HasIdpIdentifier returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


