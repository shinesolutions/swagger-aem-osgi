namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties =

  //#region ComAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties


  type comAdobeGraniteDistributionCoreImplDiffDiffChangesObserverProperties = {
    Enabled : ConfigNodePropertyBoolean;
    AgentName : ConfigNodePropertyString;
    DiffPath : ConfigNodePropertyString;
    ObservedPath : ConfigNodePropertyString;
    ServiceName : ConfigNodePropertyString;
    PropertyNames : ConfigNodePropertyString;
    DistributionDelay : ConfigNodePropertyInteger;
    ServiceUserTarget : ConfigNodePropertyString;
  }
  //#endregion
