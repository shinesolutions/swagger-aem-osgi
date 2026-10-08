namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheFelixScrScrServiceProperties =

  //#region OrgApacheFelixScrScrServiceProperties

  [<CLIMutable>]
  type OrgApacheFelixScrScrServiceProperties = {
    [<JsonProperty(PropertyName = "ds.loglevel")>]
    DsLoglevel : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "ds.factory.enabled")>]
    DsFactoryEnabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ds.delayed.keepInstances")>]
    DsDelayedKeepInstances : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "ds.lock.timeout.milliseconds")>]
    DsLockTimeoutMilliseconds : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "ds.stop.timeout.milliseconds")>]
    DsStopTimeoutMilliseconds : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "ds.global.extender")>]
    DsGlobalExtender : ConfigNodePropertyBoolean;
  }

  //#endregion
