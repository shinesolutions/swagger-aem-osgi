namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties =

  //#region ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties

  [<CLIMutable>]
  type ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties = {
    [<JsonProperty(PropertyName = "event.filter")>]
    EventFilter : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "launches.eventhandler.threadpool.maxsize")>]
    LaunchesEventhandlerThreadpoolMaxsize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "launches.eventhandler.threadpool.priority")>]
    LaunchesEventhandlerThreadpoolPriority : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "launches.eventhandler.updatelastmodification")>]
    LaunchesEventhandlerUpdatelastmodification : ConfigNodePropertyBoolean;
  }

  //#endregion
