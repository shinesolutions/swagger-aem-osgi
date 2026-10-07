namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties


  type orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties = {
    ProviderName : ConfigNodePropertyString;
    HostName : ConfigNodePropertyString;
    HostPort : ConfigNodePropertyInteger;
    HostSsl : ConfigNodePropertyBoolean;
    HostTls : ConfigNodePropertyBoolean;
    HostNoCertCheck : ConfigNodePropertyBoolean;
    BindDn : ConfigNodePropertyString;
    BindPassword : ConfigNodePropertyString;
    SearchTimeout : ConfigNodePropertyString;
    AdminPoolMaxActive : ConfigNodePropertyInteger;
    AdminPoolLookupOnValidate : ConfigNodePropertyBoolean;
    UserPoolMaxActive : ConfigNodePropertyInteger;
    UserPoolLookupOnValidate : ConfigNodePropertyBoolean;
    UserBaseDN : ConfigNodePropertyString;
    UserObjectclass : ConfigNodePropertyArray;
    UserIdAttribute : ConfigNodePropertyString;
    UserExtraFilter : ConfigNodePropertyString;
    UserMakeDnPath : ConfigNodePropertyBoolean;
    GroupBaseDN : ConfigNodePropertyString;
    GroupObjectclass : ConfigNodePropertyArray;
    GroupNameAttribute : ConfigNodePropertyString;
    GroupExtraFilter : ConfigNodePropertyString;
    GroupMakeDnPath : ConfigNodePropertyBoolean;
    GroupMemberAttribute : ConfigNodePropertyString;
    UseUidForExtId : ConfigNodePropertyBoolean;
    Customattributes : ConfigNodePropertyArray;
  }
  //#endregion
