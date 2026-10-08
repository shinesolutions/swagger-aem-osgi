namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScheduledExporterImplScheduledExporterImplProperties

module ComAdobeCqScheduledExporterImplScheduledExporterImplInfo =

  //#region ComAdobeCqScheduledExporterImplScheduledExporterImplInfo

  [<CLIMutable>]
  type ComAdobeCqScheduledExporterImplScheduledExporterImplInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScheduledExporterImplScheduledExporterImplProperties;
  }

  //#endregion
