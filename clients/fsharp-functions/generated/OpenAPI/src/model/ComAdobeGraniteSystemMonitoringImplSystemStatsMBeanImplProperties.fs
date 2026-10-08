namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties =

  //#region ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties = {
    [<JsonProperty(PropertyName = "scheduler.expression")>]
    SchedulerExpression : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jmx.objectname")>]
    JmxObjectname : ConfigNodePropertyString;
  }

  //#endregion
