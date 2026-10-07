namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties =

  //#region ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties


  type comDayCqRewriterLinkcheckerImplLinkCheckerImplProperties = {
    SchedulerPeriod : ConfigNodePropertyInteger;
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    ServiceBadLinkToleranceInterval : ConfigNodePropertyInteger;
    ServiceCheckOverridePatterns : ConfigNodePropertyArray;
    ServiceCacheBrokenInternalLinks : ConfigNodePropertyBoolean;
    ServiceSpecialLinkPrefix : ConfigNodePropertyArray;
    ServiceSpecialLinkPatterns : ConfigNodePropertyArray;
  }
  //#endregion
