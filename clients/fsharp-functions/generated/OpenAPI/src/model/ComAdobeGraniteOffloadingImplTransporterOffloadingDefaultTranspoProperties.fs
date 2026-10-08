namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties =

  //#region ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties

  [<CLIMutable>]
  type ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties = {
    [<JsonProperty(PropertyName = "default.transport.agent-to-worker.prefix")>]
    DefaultTransportAgentToWorkerPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "default.transport.agent-to-master.prefix")>]
    DefaultTransportAgentToMasterPrefix : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "default.transport.input.package")>]
    DefaultTransportInputPackage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "default.transport.output.package")>]
    DefaultTransportOutputPackage : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "default.transport.replication.synchronous")>]
    DefaultTransportReplicationSynchronous : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "default.transport.contentpackage")>]
    DefaultTransportContentpackage : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "offloading.transporter.default.enabled")>]
    OffloadingTransporterDefaultEnabled : ConfigNodePropertyBoolean;
  }

  //#endregion
