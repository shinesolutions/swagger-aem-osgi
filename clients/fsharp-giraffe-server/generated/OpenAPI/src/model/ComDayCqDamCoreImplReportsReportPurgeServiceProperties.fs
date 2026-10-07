namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamCoreImplReportsReportPurgeServiceProperties =

  //#region ComDayCqDamCoreImplReportsReportPurgeServiceProperties


  type comDayCqDamCoreImplReportsReportPurgeServiceProperties = {
    SchedulerExpression : ConfigNodePropertyString;
    MaxSavedReports : ConfigNodePropertyInteger;
    TimeDuration : ConfigNodePropertyInteger;
    EnableReportPurge : ConfigNodePropertyBoolean;
  }
  //#endregion
