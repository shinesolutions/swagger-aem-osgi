namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCqWcmMsmImplServletsAuditLogServletProperties

module ComDayCqWcmMsmImplServletsAuditLogServletInfo =

  //#region ComDayCqWcmMsmImplServletsAuditLogServletInfo

  [<CLIMutable>]
  type ComDayCqWcmMsmImplServletsAuditLogServletInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCqWcmMsmImplServletsAuditLogServletProperties;
  }

  //#endregion
