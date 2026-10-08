namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteRepositoryImplCommitStatsConfigProperties =

  //#region ComAdobeGraniteRepositoryImplCommitStatsConfigProperties

  [<CLIMutable>]
  type ComAdobeGraniteRepositoryImplCommitStatsConfigProperties = {
    [<JsonProperty(PropertyName = "enabled")>]
    Enabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "intervalSeconds")>]
    IntervalSeconds : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "commitsPerIntervalThreshold")>]
    CommitsPerIntervalThreshold : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxLocationLength")>]
    MaxLocationLength : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxDetailsShown")>]
    MaxDetailsShown : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "minDetailsPercentage")>]
    MinDetailsPercentage : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "threadMatchers")>]
    ThreadMatchers : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "maxGreedyDepth")>]
    MaxGreedyDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "greedyStackMatchers")>]
    GreedyStackMatchers : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "stackFilters")>]
    StackFilters : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "stackMatchers")>]
    StackMatchers : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "stackCategorizers")>]
    StackCategorizers : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "stackShorteners")>]
    StackShorteners : ConfigNodePropertyArray;
  }

  //#endregion
