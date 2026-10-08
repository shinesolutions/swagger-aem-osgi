namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties =

  //#region ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties

  [<CLIMutable>]
  type ComDayCqMcmLandingpageParserTaghandlersMboxTargetComponentTagHProperties = {
    [<JsonProperty(PropertyName = "service.ranking")>]
    ServiceRanking : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "tagpattern")>]
    Tagpattern : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "component.resourceType")>]
    ComponentResourceType : ConfigNodePropertyString;
  }

  //#endregion
