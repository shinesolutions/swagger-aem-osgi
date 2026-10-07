namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties =

  //#region ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties

  [<CLIMutable>]
  type ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties = {
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath")>]
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency")>]
    ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency : ConfigNodePropertyString;
  }

  //#endregion
