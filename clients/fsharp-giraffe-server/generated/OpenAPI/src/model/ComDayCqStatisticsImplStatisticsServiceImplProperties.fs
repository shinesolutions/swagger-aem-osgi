namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqStatisticsImplStatisticsServiceImplProperties =

  //#region ComDayCqStatisticsImplStatisticsServiceImplProperties


  type comDayCqStatisticsImplStatisticsServiceImplProperties = {
    SchedulerPeriod : ConfigNodePropertyInteger;
    SchedulerConcurrent : ConfigNodePropertyBoolean;
    Path : ConfigNodePropertyString;
    Workspace : ConfigNodePropertyString;
    KeywordsPath : ConfigNodePropertyString;
    AsyncEntries : ConfigNodePropertyBoolean;
  }
  //#endregion
