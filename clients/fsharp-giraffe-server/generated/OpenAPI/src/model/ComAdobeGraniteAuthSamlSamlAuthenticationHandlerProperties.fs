namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties =

  //#region ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties


  type comAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties = {
    Path : ConfigNodePropertyArray;
    ServiceRanking : ConfigNodePropertyInteger;
    IdpUrl : ConfigNodePropertyString;
    IdpCertAlias : ConfigNodePropertyString;
    IdpHttpRedirect : ConfigNodePropertyBoolean;
    ServiceProviderEntityId : ConfigNodePropertyString;
    AssertionConsumerServiceURL : ConfigNodePropertyString;
    SpPrivateKeyAlias : ConfigNodePropertyString;
    KeyStorePassword : ConfigNodePropertyString;
    DefaultRedirectUrl : ConfigNodePropertyString;
    UserIDAttribute : ConfigNodePropertyString;
    UseEncryption : ConfigNodePropertyBoolean;
    CreateUser : ConfigNodePropertyBoolean;
    UserIntermediatePath : ConfigNodePropertyString;
    AddGroupMemberships : ConfigNodePropertyBoolean;
    GroupMembershipAttribute : ConfigNodePropertyString;
    DefaultGroups : ConfigNodePropertyArray;
    NameIdFormat : ConfigNodePropertyString;
    SynchronizeAttributes : ConfigNodePropertyArray;
    HandleLogout : ConfigNodePropertyBoolean;
    LogoutUrl : ConfigNodePropertyString;
    ClockTolerance : ConfigNodePropertyInteger;
    DigestMethod : ConfigNodePropertyString;
    SignatureMethod : ConfigNodePropertyString;
    IdentitySyncType : ConfigNodePropertyDropDown;
    IdpIdentifier : ConfigNodePropertyString;
  }
  //#endregion
