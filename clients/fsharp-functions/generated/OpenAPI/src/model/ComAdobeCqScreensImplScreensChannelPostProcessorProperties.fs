namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray

module ComAdobeCqScreensImplScreensChannelPostProcessorProperties =

  //#region ComAdobeCqScreensImplScreensChannelPostProcessorProperties

  [<CLIMutable>]
  type ComAdobeCqScreensImplScreensChannelPostProcessorProperties = {
    [<JsonProperty(PropertyName = "screens.channels.properties.to.remove")>]
    ScreensChannelsPropertiesToRemove : ConfigNodePropertyArray;
  }

  //#endregion
