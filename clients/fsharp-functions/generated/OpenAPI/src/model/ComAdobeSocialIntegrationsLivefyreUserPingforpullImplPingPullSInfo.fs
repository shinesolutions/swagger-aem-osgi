namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties

module ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo =

  //#region ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo

  [<CLIMutable>]
  type ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeSocialIntegrationsLivefyreUserPingforpullImplPingPullSProperties;
  }

  //#endregion
