namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties

module OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties;
  }

  //#endregion
