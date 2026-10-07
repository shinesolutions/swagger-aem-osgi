namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties

  [<CLIMutable>]
  type ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties = {
    [<JsonProperty(PropertyName = "path")>]
    Path : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "idpUrl")>]
    IdpUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "idpCertAlias")>]
    IdpCertAlias : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "idpHttpRedirect")>]
    IdpHttpRedirect : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "serviceProviderEntityId")>]
    ServiceProviderEntityId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "assertionConsumerServiceURL")>]
    AssertionConsumerServiceURL : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "spPrivateKeyAlias")>]
    SpPrivateKeyAlias : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "keyStorePassword")>]
    KeyStorePassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultRedirectUrl")>]
    DefaultRedirectUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "userIDAttribute")>]
    UserIDAttribute : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "useEncryption")>]
    UseEncryption : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "createUser")>]
    CreateUser : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "userIntermediatePath")>]
    UserIntermediatePath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "addGroupMemberships")>]
    AddGroupMemberships : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "groupMembershipAttribute")>]
    GroupMembershipAttribute : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultGroups")>]
    DefaultGroups : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "nameIdFormat")>]
    NameIdFormat : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "synchronizeAttributes")>]
    SynchronizeAttributes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "handleLogout")>]
    HandleLogout : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "logoutUrl")>]
    LogoutUrl : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "clockTolerance")>]
    ClockTolerance : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "digestMethod")>]
    DigestMethod : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "signatureMethod")>]
    SignatureMethod : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "identitySyncType")>]
    IdentitySyncType : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "idpIdentifier")>]
    IdpIdentifier : ConfigNodePropertyString;
  }

  //#endregion
