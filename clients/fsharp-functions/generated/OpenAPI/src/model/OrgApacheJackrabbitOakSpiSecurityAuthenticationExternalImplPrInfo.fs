namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties

module OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplPrProperties;
  }

  //#endregion
