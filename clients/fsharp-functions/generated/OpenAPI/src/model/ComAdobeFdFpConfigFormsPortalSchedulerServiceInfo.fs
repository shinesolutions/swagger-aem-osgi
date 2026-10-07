namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties

module ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo =

  //#region ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo

  [<CLIMutable>]
  type ComAdobeFdFpConfigFormsPortalSchedulerServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeFdFpConfigFormsPortalSchedulerServiceProperties;
  }

  //#endregion
