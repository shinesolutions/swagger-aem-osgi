namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties = {
    [<JsonProperty(PropertyName = "protectExternalId")>]
    ProtectExternalId : ConfigNodePropertyBoolean;
  }

  //#endregion
