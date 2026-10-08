namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties =

  //#region ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties

  [<CLIMutable>]
  type ComAdobeCqScreensSegmentationImplSegmentationFeatureFlagProperties = {
    [<JsonProperty(PropertyName = "enableDataTriggeredContent")>]
    EnableDataTriggeredContent : ConfigNodePropertyBoolean;
  }

  //#endregion
