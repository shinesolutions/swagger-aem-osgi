namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties =

  //#region ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties


  type comAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties = {
    DefaultTransportAgentToWorkerPrefix : ConfigNodePropertyString;
    DefaultTransportAgentToMasterPrefix : ConfigNodePropertyString;
    DefaultTransportInputPackage : ConfigNodePropertyString;
    DefaultTransportOutputPackage : ConfigNodePropertyString;
    DefaultTransportReplicationSynchronous : ConfigNodePropertyBoolean;
    DefaultTransportContentpackage : ConfigNodePropertyBoolean;
    OffloadingTransporterDefaultEnabled : ConfigNodePropertyBoolean;
  }
  //#endregion
