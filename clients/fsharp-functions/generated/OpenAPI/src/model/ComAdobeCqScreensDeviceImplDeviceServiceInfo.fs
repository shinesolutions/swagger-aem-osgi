namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensDeviceImplDeviceServiceProperties

module ComAdobeCqScreensDeviceImplDeviceServiceInfo =

  //#region ComAdobeCqScreensDeviceImplDeviceServiceInfo

  [<CLIMutable>]
  type ComAdobeCqScreensDeviceImplDeviceServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensDeviceImplDeviceServiceProperties;
  }

  //#endregion
