namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqReportingImplConfigServiceImplProperties =

  //#region ComDayCqReportingImplConfigServiceImplProperties

  [<CLIMutable>]
  type ComDayCqReportingImplConfigServiceImplProperties = {
    [<JsonProperty(PropertyName = "repconf.timezone")>]
    RepconfTimezone : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "repconf.locale")>]
    RepconfLocale : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "repconf.snapshots")>]
    RepconfSnapshots : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "repconf.repdir")>]
    RepconfRepdir : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "repconf.hourofday")>]
    RepconfHourofday : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "repconf.minofhour")>]
    RepconfMinofhour : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "repconf.maxrows")>]
    RepconfMaxrows : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "repconf.fakedata")>]
    RepconfFakedata : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "repconf.snapshotuser")>]
    RepconfSnapshotuser : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "repconf.enforcesnapshotuser")>]
    RepconfEnforcesnapshotuser : ConfigNodePropertyBoolean;
  }

  //#endregion
