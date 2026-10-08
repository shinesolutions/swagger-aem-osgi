# OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ProviderName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HostName** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**HostPort** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**HostSsl** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HostTls** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**HostNoCertCheck** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**BindDn** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**BindPassword** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**SearchTimeout** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**AdminPoolMaxActive** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**AdminPoolLookupOnValidate** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UserPoolMaxActive** | Pointer to [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**UserPoolLookupOnValidate** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**UserBaseDN** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserObjectclass** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**UserIdAttribute** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserExtraFilter** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UserMakeDnPath** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GroupBaseDN** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**GroupObjectclass** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**GroupNameAttribute** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**GroupExtraFilter** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**GroupMakeDnPath** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**GroupMemberAttribute** | Pointer to [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**UseUidForExtId** | Pointer to [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**Customattributes** | Pointer to [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Methods

### NewOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

`func NewOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties() *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties`

NewOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties instantiates a new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesWithDefaults

`func NewOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesWithDefaults() *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties`

NewOrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiPropertiesWithDefaults instantiates a new OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetProviderName

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetProviderName() ConfigNodePropertyString`

GetProviderName returns the ProviderName field if non-nil, zero value otherwise.

### GetProviderNameOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetProviderNameOk() (*ConfigNodePropertyString, bool)`

GetProviderNameOk returns a tuple with the ProviderName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetProviderName

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetProviderName(v ConfigNodePropertyString)`

SetProviderName sets ProviderName field to given value.

### HasProviderName

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasProviderName() bool`

HasProviderName returns a boolean if a field has been set.

### GetHostName

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostName() ConfigNodePropertyString`

GetHostName returns the HostName field if non-nil, zero value otherwise.

### GetHostNameOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostNameOk() (*ConfigNodePropertyString, bool)`

GetHostNameOk returns a tuple with the HostName field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostName

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetHostName(v ConfigNodePropertyString)`

SetHostName sets HostName field to given value.

### HasHostName

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasHostName() bool`

HasHostName returns a boolean if a field has been set.

### GetHostPort

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostPort() ConfigNodePropertyInteger`

GetHostPort returns the HostPort field if non-nil, zero value otherwise.

### GetHostPortOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostPortOk() (*ConfigNodePropertyInteger, bool)`

GetHostPortOk returns a tuple with the HostPort field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostPort

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetHostPort(v ConfigNodePropertyInteger)`

SetHostPort sets HostPort field to given value.

### HasHostPort

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasHostPort() bool`

HasHostPort returns a boolean if a field has been set.

### GetHostSsl

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostSsl() ConfigNodePropertyBoolean`

GetHostSsl returns the HostSsl field if non-nil, zero value otherwise.

### GetHostSslOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostSslOk() (*ConfigNodePropertyBoolean, bool)`

GetHostSslOk returns a tuple with the HostSsl field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostSsl

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetHostSsl(v ConfigNodePropertyBoolean)`

SetHostSsl sets HostSsl field to given value.

### HasHostSsl

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasHostSsl() bool`

HasHostSsl returns a boolean if a field has been set.

### GetHostTls

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostTls() ConfigNodePropertyBoolean`

GetHostTls returns the HostTls field if non-nil, zero value otherwise.

### GetHostTlsOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostTlsOk() (*ConfigNodePropertyBoolean, bool)`

GetHostTlsOk returns a tuple with the HostTls field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostTls

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetHostTls(v ConfigNodePropertyBoolean)`

SetHostTls sets HostTls field to given value.

### HasHostTls

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasHostTls() bool`

HasHostTls returns a boolean if a field has been set.

### GetHostNoCertCheck

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostNoCertCheck() ConfigNodePropertyBoolean`

GetHostNoCertCheck returns the HostNoCertCheck field if non-nil, zero value otherwise.

### GetHostNoCertCheckOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetHostNoCertCheckOk() (*ConfigNodePropertyBoolean, bool)`

GetHostNoCertCheckOk returns a tuple with the HostNoCertCheck field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetHostNoCertCheck

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetHostNoCertCheck(v ConfigNodePropertyBoolean)`

SetHostNoCertCheck sets HostNoCertCheck field to given value.

### HasHostNoCertCheck

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasHostNoCertCheck() bool`

HasHostNoCertCheck returns a boolean if a field has been set.

### GetBindDn

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetBindDn() ConfigNodePropertyString`

GetBindDn returns the BindDn field if non-nil, zero value otherwise.

### GetBindDnOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetBindDnOk() (*ConfigNodePropertyString, bool)`

GetBindDnOk returns a tuple with the BindDn field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBindDn

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetBindDn(v ConfigNodePropertyString)`

SetBindDn sets BindDn field to given value.

### HasBindDn

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasBindDn() bool`

HasBindDn returns a boolean if a field has been set.

### GetBindPassword

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetBindPassword() ConfigNodePropertyString`

GetBindPassword returns the BindPassword field if non-nil, zero value otherwise.

### GetBindPasswordOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetBindPasswordOk() (*ConfigNodePropertyString, bool)`

GetBindPasswordOk returns a tuple with the BindPassword field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetBindPassword

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetBindPassword(v ConfigNodePropertyString)`

SetBindPassword sets BindPassword field to given value.

### HasBindPassword

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasBindPassword() bool`

HasBindPassword returns a boolean if a field has been set.

### GetSearchTimeout

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetSearchTimeout() ConfigNodePropertyString`

GetSearchTimeout returns the SearchTimeout field if non-nil, zero value otherwise.

### GetSearchTimeoutOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetSearchTimeoutOk() (*ConfigNodePropertyString, bool)`

GetSearchTimeoutOk returns a tuple with the SearchTimeout field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSearchTimeout

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetSearchTimeout(v ConfigNodePropertyString)`

SetSearchTimeout sets SearchTimeout field to given value.

### HasSearchTimeout

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasSearchTimeout() bool`

HasSearchTimeout returns a boolean if a field has been set.

### GetAdminPoolMaxActive

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetAdminPoolMaxActive() ConfigNodePropertyInteger`

GetAdminPoolMaxActive returns the AdminPoolMaxActive field if non-nil, zero value otherwise.

### GetAdminPoolMaxActiveOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetAdminPoolMaxActiveOk() (*ConfigNodePropertyInteger, bool)`

GetAdminPoolMaxActiveOk returns a tuple with the AdminPoolMaxActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdminPoolMaxActive

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetAdminPoolMaxActive(v ConfigNodePropertyInteger)`

SetAdminPoolMaxActive sets AdminPoolMaxActive field to given value.

### HasAdminPoolMaxActive

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasAdminPoolMaxActive() bool`

HasAdminPoolMaxActive returns a boolean if a field has been set.

### GetAdminPoolLookupOnValidate

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetAdminPoolLookupOnValidate() ConfigNodePropertyBoolean`

GetAdminPoolLookupOnValidate returns the AdminPoolLookupOnValidate field if non-nil, zero value otherwise.

### GetAdminPoolLookupOnValidateOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetAdminPoolLookupOnValidateOk() (*ConfigNodePropertyBoolean, bool)`

GetAdminPoolLookupOnValidateOk returns a tuple with the AdminPoolLookupOnValidate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAdminPoolLookupOnValidate

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetAdminPoolLookupOnValidate(v ConfigNodePropertyBoolean)`

SetAdminPoolLookupOnValidate sets AdminPoolLookupOnValidate field to given value.

### HasAdminPoolLookupOnValidate

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasAdminPoolLookupOnValidate() bool`

HasAdminPoolLookupOnValidate returns a boolean if a field has been set.

### GetUserPoolMaxActive

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserPoolMaxActive() ConfigNodePropertyInteger`

GetUserPoolMaxActive returns the UserPoolMaxActive field if non-nil, zero value otherwise.

### GetUserPoolMaxActiveOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserPoolMaxActiveOk() (*ConfigNodePropertyInteger, bool)`

GetUserPoolMaxActiveOk returns a tuple with the UserPoolMaxActive field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserPoolMaxActive

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserPoolMaxActive(v ConfigNodePropertyInteger)`

SetUserPoolMaxActive sets UserPoolMaxActive field to given value.

### HasUserPoolMaxActive

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserPoolMaxActive() bool`

HasUserPoolMaxActive returns a boolean if a field has been set.

### GetUserPoolLookupOnValidate

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserPoolLookupOnValidate() ConfigNodePropertyBoolean`

GetUserPoolLookupOnValidate returns the UserPoolLookupOnValidate field if non-nil, zero value otherwise.

### GetUserPoolLookupOnValidateOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserPoolLookupOnValidateOk() (*ConfigNodePropertyBoolean, bool)`

GetUserPoolLookupOnValidateOk returns a tuple with the UserPoolLookupOnValidate field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserPoolLookupOnValidate

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserPoolLookupOnValidate(v ConfigNodePropertyBoolean)`

SetUserPoolLookupOnValidate sets UserPoolLookupOnValidate field to given value.

### HasUserPoolLookupOnValidate

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserPoolLookupOnValidate() bool`

HasUserPoolLookupOnValidate returns a boolean if a field has been set.

### GetUserBaseDN

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserBaseDN() ConfigNodePropertyString`

GetUserBaseDN returns the UserBaseDN field if non-nil, zero value otherwise.

### GetUserBaseDNOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserBaseDNOk() (*ConfigNodePropertyString, bool)`

GetUserBaseDNOk returns a tuple with the UserBaseDN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserBaseDN

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserBaseDN(v ConfigNodePropertyString)`

SetUserBaseDN sets UserBaseDN field to given value.

### HasUserBaseDN

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserBaseDN() bool`

HasUserBaseDN returns a boolean if a field has been set.

### GetUserObjectclass

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserObjectclass() ConfigNodePropertyArray`

GetUserObjectclass returns the UserObjectclass field if non-nil, zero value otherwise.

### GetUserObjectclassOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserObjectclassOk() (*ConfigNodePropertyArray, bool)`

GetUserObjectclassOk returns a tuple with the UserObjectclass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserObjectclass

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserObjectclass(v ConfigNodePropertyArray)`

SetUserObjectclass sets UserObjectclass field to given value.

### HasUserObjectclass

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserObjectclass() bool`

HasUserObjectclass returns a boolean if a field has been set.

### GetUserIdAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserIdAttribute() ConfigNodePropertyString`

GetUserIdAttribute returns the UserIdAttribute field if non-nil, zero value otherwise.

### GetUserIdAttributeOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserIdAttributeOk() (*ConfigNodePropertyString, bool)`

GetUserIdAttributeOk returns a tuple with the UserIdAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserIdAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserIdAttribute(v ConfigNodePropertyString)`

SetUserIdAttribute sets UserIdAttribute field to given value.

### HasUserIdAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserIdAttribute() bool`

HasUserIdAttribute returns a boolean if a field has been set.

### GetUserExtraFilter

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserExtraFilter() ConfigNodePropertyString`

GetUserExtraFilter returns the UserExtraFilter field if non-nil, zero value otherwise.

### GetUserExtraFilterOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserExtraFilterOk() (*ConfigNodePropertyString, bool)`

GetUserExtraFilterOk returns a tuple with the UserExtraFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserExtraFilter

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserExtraFilter(v ConfigNodePropertyString)`

SetUserExtraFilter sets UserExtraFilter field to given value.

### HasUserExtraFilter

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserExtraFilter() bool`

HasUserExtraFilter returns a boolean if a field has been set.

### GetUserMakeDnPath

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserMakeDnPath() ConfigNodePropertyBoolean`

GetUserMakeDnPath returns the UserMakeDnPath field if non-nil, zero value otherwise.

### GetUserMakeDnPathOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUserMakeDnPathOk() (*ConfigNodePropertyBoolean, bool)`

GetUserMakeDnPathOk returns a tuple with the UserMakeDnPath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUserMakeDnPath

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUserMakeDnPath(v ConfigNodePropertyBoolean)`

SetUserMakeDnPath sets UserMakeDnPath field to given value.

### HasUserMakeDnPath

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUserMakeDnPath() bool`

HasUserMakeDnPath returns a boolean if a field has been set.

### GetGroupBaseDN

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupBaseDN() ConfigNodePropertyString`

GetGroupBaseDN returns the GroupBaseDN field if non-nil, zero value otherwise.

### GetGroupBaseDNOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupBaseDNOk() (*ConfigNodePropertyString, bool)`

GetGroupBaseDNOk returns a tuple with the GroupBaseDN field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupBaseDN

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetGroupBaseDN(v ConfigNodePropertyString)`

SetGroupBaseDN sets GroupBaseDN field to given value.

### HasGroupBaseDN

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasGroupBaseDN() bool`

HasGroupBaseDN returns a boolean if a field has been set.

### GetGroupObjectclass

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupObjectclass() ConfigNodePropertyArray`

GetGroupObjectclass returns the GroupObjectclass field if non-nil, zero value otherwise.

### GetGroupObjectclassOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupObjectclassOk() (*ConfigNodePropertyArray, bool)`

GetGroupObjectclassOk returns a tuple with the GroupObjectclass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupObjectclass

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetGroupObjectclass(v ConfigNodePropertyArray)`

SetGroupObjectclass sets GroupObjectclass field to given value.

### HasGroupObjectclass

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasGroupObjectclass() bool`

HasGroupObjectclass returns a boolean if a field has been set.

### GetGroupNameAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupNameAttribute() ConfigNodePropertyString`

GetGroupNameAttribute returns the GroupNameAttribute field if non-nil, zero value otherwise.

### GetGroupNameAttributeOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupNameAttributeOk() (*ConfigNodePropertyString, bool)`

GetGroupNameAttributeOk returns a tuple with the GroupNameAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupNameAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetGroupNameAttribute(v ConfigNodePropertyString)`

SetGroupNameAttribute sets GroupNameAttribute field to given value.

### HasGroupNameAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasGroupNameAttribute() bool`

HasGroupNameAttribute returns a boolean if a field has been set.

### GetGroupExtraFilter

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupExtraFilter() ConfigNodePropertyString`

GetGroupExtraFilter returns the GroupExtraFilter field if non-nil, zero value otherwise.

### GetGroupExtraFilterOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupExtraFilterOk() (*ConfigNodePropertyString, bool)`

GetGroupExtraFilterOk returns a tuple with the GroupExtraFilter field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupExtraFilter

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetGroupExtraFilter(v ConfigNodePropertyString)`

SetGroupExtraFilter sets GroupExtraFilter field to given value.

### HasGroupExtraFilter

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasGroupExtraFilter() bool`

HasGroupExtraFilter returns a boolean if a field has been set.

### GetGroupMakeDnPath

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupMakeDnPath() ConfigNodePropertyBoolean`

GetGroupMakeDnPath returns the GroupMakeDnPath field if non-nil, zero value otherwise.

### GetGroupMakeDnPathOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupMakeDnPathOk() (*ConfigNodePropertyBoolean, bool)`

GetGroupMakeDnPathOk returns a tuple with the GroupMakeDnPath field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupMakeDnPath

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetGroupMakeDnPath(v ConfigNodePropertyBoolean)`

SetGroupMakeDnPath sets GroupMakeDnPath field to given value.

### HasGroupMakeDnPath

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasGroupMakeDnPath() bool`

HasGroupMakeDnPath returns a boolean if a field has been set.

### GetGroupMemberAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupMemberAttribute() ConfigNodePropertyString`

GetGroupMemberAttribute returns the GroupMemberAttribute field if non-nil, zero value otherwise.

### GetGroupMemberAttributeOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetGroupMemberAttributeOk() (*ConfigNodePropertyString, bool)`

GetGroupMemberAttributeOk returns a tuple with the GroupMemberAttribute field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetGroupMemberAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetGroupMemberAttribute(v ConfigNodePropertyString)`

SetGroupMemberAttribute sets GroupMemberAttribute field to given value.

### HasGroupMemberAttribute

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasGroupMemberAttribute() bool`

HasGroupMemberAttribute returns a boolean if a field has been set.

### GetUseUidForExtId

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUseUidForExtId() ConfigNodePropertyBoolean`

GetUseUidForExtId returns the UseUidForExtId field if non-nil, zero value otherwise.

### GetUseUidForExtIdOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetUseUidForExtIdOk() (*ConfigNodePropertyBoolean, bool)`

GetUseUidForExtIdOk returns a tuple with the UseUidForExtId field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUseUidForExtId

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetUseUidForExtId(v ConfigNodePropertyBoolean)`

SetUseUidForExtId sets UseUidForExtId field to given value.

### HasUseUidForExtId

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasUseUidForExtId() bool`

HasUseUidForExtId returns a boolean if a field has been set.

### GetCustomattributes

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetCustomattributes() ConfigNodePropertyArray`

GetCustomattributes returns the Customattributes field if non-nil, zero value otherwise.

### GetCustomattributesOk

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) GetCustomattributesOk() (*ConfigNodePropertyArray, bool)`

GetCustomattributesOk returns a tuple with the Customattributes field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetCustomattributes

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) SetCustomattributes(v ConfigNodePropertyArray)`

SetCustomattributes sets Customattributes field to given value.

### HasCustomattributes

`func (o *OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties) HasCustomattributes() bool`

HasCustomattributes returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


