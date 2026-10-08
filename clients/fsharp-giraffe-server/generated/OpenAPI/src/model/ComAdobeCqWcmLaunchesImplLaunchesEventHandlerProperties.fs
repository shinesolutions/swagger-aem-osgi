namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties =

  //#region ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties


  type comAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties = {
    EventFilter : ConfigNodePropertyString;
    LaunchesEventhandlerThreadpoolMaxsize : ConfigNodePropertyInteger;
    LaunchesEventhandlerThreadpoolPriority : ConfigNodePropertyDropDown;
    LaunchesEventhandlerUpdatelastmodification : ConfigNodePropertyBoolean;
  }
  //#endregion
