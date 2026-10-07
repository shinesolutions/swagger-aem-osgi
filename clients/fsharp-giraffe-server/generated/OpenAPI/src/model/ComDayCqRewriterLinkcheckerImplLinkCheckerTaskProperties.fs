namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties


  type comDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties = {
    SchedulerPeriod : ConfigNodePropertyInteger;
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    GoodLinkTestInterval : ConfigNodePropertyInteger;
    BadLinkTestInterval : ConfigNodePropertyInteger;
    LinkUnusedInterval : ConfigNodePropertyInteger;
    ConnectionTimeout : ConfigNodePropertyInteger;
  }
  //#endregion
