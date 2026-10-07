namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties =

  //#region ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties

  [<CLIMutable>]
  type ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties = {
    [<JsonProperty(PropertyName = "link.expired.prefix")>]
    LinkExpiredPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "link.expired.remove")>]
    LinkExpiredRemove : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "link.expired.suffix")>]
    LinkExpiredSuffix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "link.invalid.prefix")>]
    LinkInvalidPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "link.invalid.remove")>]
    LinkInvalidRemove : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "link.invalid.suffix")>]
    LinkInvalidSuffix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "link.predated.prefix")>]
    LinkPredatedPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "link.predated.remove")>]
    LinkPredatedRemove : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "link.predated.suffix")>]
    LinkPredatedSuffix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "link.wcmmodes")>]
    LinkWcmmodes : ConfigNodePropertyArray;
  }

  //#endregion
