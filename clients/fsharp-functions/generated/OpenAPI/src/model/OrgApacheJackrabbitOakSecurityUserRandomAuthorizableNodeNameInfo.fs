namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties

module OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo =

  //#region OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo

  [<CLIMutable>]
  type OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties;
    [<JsonProperty(PropertyName = "bundle_location")>]
    BundleLocation : string;
    [<JsonProperty(PropertyName = "service_location")>]
    ServiceLocation : string;
  }

  //#endregion
