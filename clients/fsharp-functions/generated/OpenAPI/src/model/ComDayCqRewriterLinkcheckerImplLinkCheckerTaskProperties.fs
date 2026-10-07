namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties

  [<CLIMutable>]
  type ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties = {
    [<JsonProperty(PropertyName = "scheduler.period")>]
    SchedulerPeriod : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "scheduler.concurrent")>]
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "good_link_test_interval")>]
    GoodLinkTestInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "bad_link_test_interval")>]
    BadLinkTestInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "link_unused_interval")>]
    LinkUnusedInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "connection.timeout")>]
    ConnectionTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
