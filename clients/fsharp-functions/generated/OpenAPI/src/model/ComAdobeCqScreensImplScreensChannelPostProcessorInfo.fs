namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensImplScreensChannelPostProcessorProperties

module ComAdobeCqScreensImplScreensChannelPostProcessorInfo =

  //#region ComAdobeCqScreensImplScreensChannelPostProcessorInfo

  [<CLIMutable>]
  type ComAdobeCqScreensImplScreensChannelPostProcessorInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensImplScreensChannelPostProcessorProperties;
  }

  //#endregion
