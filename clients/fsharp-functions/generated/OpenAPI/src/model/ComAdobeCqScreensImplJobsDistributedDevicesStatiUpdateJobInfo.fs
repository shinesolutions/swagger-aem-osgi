namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties

module ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo =

  //#region ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo

  [<CLIMutable>]
  type ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensImplJobsDistributedDevicesStatiUpdateJobProperties;
  }

  //#endregion
