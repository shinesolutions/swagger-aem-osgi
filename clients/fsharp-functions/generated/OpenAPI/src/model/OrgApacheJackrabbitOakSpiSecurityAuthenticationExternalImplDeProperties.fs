namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties = {
    [<JsonProperty(PropertyName = "handler.name")>]
    HandlerName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.expirationTime")>]
    UserExpirationTime : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.autoMembership")>]
    UserAutoMembership : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "user.propertyMapping")>]
    UserPropertyMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "user.pathPrefix")>]
    UserPathPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.membershipExpTime")>]
    UserMembershipExpTime : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "user.membershipNestingDepth")>]
    UserMembershipNestingDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "user.dynamicMembership")>]
    UserDynamicMembership : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "user.disableMissing")>]
    UserDisableMissing : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "group.expirationTime")>]
    GroupExpirationTime : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "group.autoMembership")>]
    GroupAutoMembership : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "group.propertyMapping")>]
    GroupPropertyMapping : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "group.pathPrefix")>]
    GroupPathPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "enableRFC7613UsercaseMappedProfile")>]
    EnableRFC7613UsercaseMappedProfile : ConfigNodePropertyBoolean;
  }

  //#endregion
