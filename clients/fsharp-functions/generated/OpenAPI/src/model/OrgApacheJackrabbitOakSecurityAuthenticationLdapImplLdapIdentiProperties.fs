namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties =

  //#region OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties = {
    [<JsonProperty(PropertyName = "provider.name")>]
    ProviderName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "host.name")>]
    HostName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "host.port")>]
    HostPort : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "host.ssl")>]
    HostSsl : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "host.tls")>]
    HostTls : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "host.noCertCheck")>]
    HostNoCertCheck : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "bind.dn")>]
    BindDn : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "bind.password")>]
    BindPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "searchTimeout")>]
    SearchTimeout : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "adminPool.maxActive")>]
    AdminPoolMaxActive : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "adminPool.lookupOnValidate")>]
    AdminPoolLookupOnValidate : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "userPool.maxActive")>]
    UserPoolMaxActive : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "userPool.lookupOnValidate")>]
    UserPoolLookupOnValidate : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "user.baseDN")>]
    UserBaseDN : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.objectclass")>]
    UserObjectclass : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "user.idAttribute")>]
    UserIdAttribute : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.extraFilter")>]
    UserExtraFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.makeDnPath")>]
    UserMakeDnPath : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "group.baseDN")>]
    GroupBaseDN : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "group.objectclass")>]
    GroupObjectclass : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "group.nameAttribute")>]
    GroupNameAttribute : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "group.extraFilter")>]
    GroupExtraFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "group.makeDnPath")>]
    GroupMakeDnPath : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "group.memberAttribute")>]
    GroupMemberAttribute : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "useUidForExtId")>]
    UseUidForExtId : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "customattributes")>]
    Customattributes : ConfigNodePropertyArray;
  }

  //#endregion
