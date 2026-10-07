namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties

module ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo =

  //#region ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo

  [<CLIMutable>]
  type ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties;
  }

  //#endregion
