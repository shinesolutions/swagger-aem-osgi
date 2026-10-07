namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties =

  //#region ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties

  [<CLIMutable>]
  type ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
  }

  //#endregion
