namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqReportingImplConfigServiceImplProperties =

  //#region ComDayCqReportingImplConfigServiceImplProperties


  type comDayCqReportingImplConfigServiceImplProperties = {
    RepconfTimezone : ConfigNodePropertyString;
    RepconfLocale : ConfigNodePropertyString;
    RepconfSnapshots : ConfigNodePropertyString;
    RepconfRepdir : ConfigNodePropertyString;
    RepconfHourofday : ConfigNodePropertyInteger;
    RepconfMinofhour : ConfigNodePropertyInteger;
    RepconfMaxrows : ConfigNodePropertyInteger;
    RepconfFakedata : ConfigNodePropertyBoolean;
    RepconfSnapshotuser : ConfigNodePropertyString;
    RepconfEnforcesnapshotuser : ConfigNodePropertyBoolean;
  }
  //#endregion
