namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingEngineParametersProperties =

  //#region OrgApacheSlingEngineParametersProperties

  [<CLIMutable>]
  type OrgApacheSlingEngineParametersProperties = {
    [<JsonProperty(PropertyName = "sling.default.parameter.encoding")>]
    SlingDefaultParameterEncoding : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.default.max.parameters")>]
    SlingDefaultMaxParameters : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "file.location")>]
    FileLocation : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "file.threshold")>]
    FileThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "file.max")>]
    FileMax : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "request.max")>]
    RequestMax : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.default.parameter.checkForAdditionalContainerParameters")>]
    SlingDefaultParameterCheckForAdditionalContainerParameters : ConfigNodePropertyBoolean;
  }

  //#endregion
