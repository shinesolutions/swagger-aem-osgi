namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties

module ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo =

  //#region ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo

  [<CLIMutable>]
  type ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties;
  }

  //#endregion
