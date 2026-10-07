namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties

  [<CLIMutable>]
  type ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties = {
    [<JsonProperty(PropertyName = "scheduler.period")>]
    SchedulerPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "scheduler.concurrent")>]
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "service.bad_link_tolerance_interval")>]
    ServiceBadLinkToleranceInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "service.check_override_patterns")>]
    ServiceCheckOverridePatterns : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "service.cache_broken_internal_links")>]
    ServiceCacheBrokenInternalLinks : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "service.special_link_prefix")>]
    ServiceSpecialLinkPrefix : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "service.special_link_patterns")>]
    ServiceSpecialLinkPatterns : ConfigNodePropertyArray;
  }

  //#endregion
