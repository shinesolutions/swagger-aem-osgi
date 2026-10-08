namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeGraniteThreaddumpThreadDumpCollectorProperties

module ComAdobeGraniteThreaddumpThreadDumpCollectorInfo =

  //#region ComAdobeGraniteThreaddumpThreadDumpCollectorInfo

  [<CLIMutable>]
  type ComAdobeGraniteThreaddumpThreadDumpCollectorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeGraniteThreaddumpThreadDumpCollectorProperties;
  }

  //#endregion
