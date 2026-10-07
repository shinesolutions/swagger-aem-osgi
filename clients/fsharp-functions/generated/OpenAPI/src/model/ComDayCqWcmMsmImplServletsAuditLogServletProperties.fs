namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmMsmImplServletsAuditLogServletProperties =

  //#region ComDayCqWcmMsmImplServletsAuditLogServletProperties

  [<CLIMutable>]
  type ComDayCqWcmMsmImplServletsAuditLogServletProperties = {
    [<JsonProperty(PropertyName = "auditlogservlet.default.events.count")>]
    AuditlogservletDefaultEventsCount : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "auditlogservlet.default.path")>]
    AuditlogservletDefaultPath : ConfigNodePropertyString;
  }

  //#endregion
