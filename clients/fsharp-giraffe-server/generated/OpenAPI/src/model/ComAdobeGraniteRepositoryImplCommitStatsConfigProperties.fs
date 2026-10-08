namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteRepositoryImplCommitStatsConfigProperties =

  //#region ComAdobeGraniteRepositoryImplCommitStatsConfigProperties


  type comAdobeGraniteRepositoryImplCommitStatsConfigProperties = {
    Enabled : ConfigNodePropertyBoolean;
    IntervalSeconds : ConfigNodePropertyInteger;
    CommitsPerIntervalThreshold : ConfigNodePropertyInteger;
    MaxLocationLength : ConfigNodePropertyInteger;
    MaxDetailsShown : ConfigNodePropertyInteger;
    MinDetailsPercentage : ConfigNodePropertyInteger;
    ThreadMatchers : ConfigNodePropertyArray;
    MaxGreedyDepth : ConfigNodePropertyInteger;
    GreedyStackMatchers : ConfigNodePropertyString;
    StackFilters : ConfigNodePropertyArray;
    StackMatchers : ConfigNodePropertyArray;
    StackCategorizers : ConfigNodePropertyArray;
    StackShorteners : ConfigNodePropertyArray;
  }
  //#endregion
