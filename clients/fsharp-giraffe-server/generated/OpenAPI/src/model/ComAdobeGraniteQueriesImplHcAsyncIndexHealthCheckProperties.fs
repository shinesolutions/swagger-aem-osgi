namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties =

  //#region ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties


  type comAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties = {
    IndexingCriticalThreshold : ConfigNodePropertyInteger;
    IndexingWarnThreshold : ConfigNodePropertyInteger;
    HcTags : ConfigNodePropertyArray;
  }
  //#endregion
