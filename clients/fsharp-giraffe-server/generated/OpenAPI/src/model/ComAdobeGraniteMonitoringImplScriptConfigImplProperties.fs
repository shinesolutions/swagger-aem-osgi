namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteMonitoringImplScriptConfigImplProperties =

  //#region ComAdobeGraniteMonitoringImplScriptConfigImplProperties


  type comAdobeGraniteMonitoringImplScriptConfigImplProperties = {
    ScriptFilename : ConfigNodePropertyString;
    ScriptDisplay : ConfigNodePropertyString;
    ScriptPath : ConfigNodePropertyString;
    ScriptPlatform : ConfigNodePropertyArray;
    Interval : ConfigNodePropertyInteger;
    Jmxdomain : ConfigNodePropertyString;
  }
  //#endregion
