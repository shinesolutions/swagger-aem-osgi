namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties

module OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo =

  //#region OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
