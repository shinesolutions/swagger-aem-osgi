namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteMonitoringImplScriptConfigImplProperties =

  //#region ComAdobeGraniteMonitoringImplScriptConfigImplProperties

  [<CLIMutable>]
  type ComAdobeGraniteMonitoringImplScriptConfigImplProperties = {
    [<JsonProperty(PropertyName = "script.filename")>]
    ScriptFilename : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "script.display")>]
    ScriptDisplay : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "script.path")>]
    ScriptPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "script.platform")>]
    ScriptPlatform : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "interval")>]
    Interval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "jmxdomain")>]
    Jmxdomain : ConfigNodePropertyString;
  }

  //#endregion
