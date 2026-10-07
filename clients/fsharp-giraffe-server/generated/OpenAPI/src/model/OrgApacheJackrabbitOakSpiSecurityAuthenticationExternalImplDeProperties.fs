namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties


  type orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties = {
    HandlerName : ConfigNodePropertyString;
    UserExpirationTime : ConfigNodePropertyString;
    UserAutoMembership : ConfigNodePropertyArray;
    UserPropertyMapping : ConfigNodePropertyArray;
    UserPathPrefix : ConfigNodePropertyString;
    UserMembershipExpTime : ConfigNodePropertyString;
    UserMembershipNestingDepth : ConfigNodePropertyInteger;
    UserDynamicMembership : ConfigNodePropertyBoolean;
    UserDisableMissing : ConfigNodePropertyBoolean;
    GroupExpirationTime : ConfigNodePropertyString;
    GroupAutoMembership : ConfigNodePropertyArray;
    GroupPropertyMapping : ConfigNodePropertyArray;
    GroupPathPrefix : ConfigNodePropertyString;
    EnableRFC7613UsercaseMappedProfile : ConfigNodePropertyBoolean;
  }
  //#endregion
