namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties =

  //#region ComAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties


  type comAdobeGraniteRepositoryHcImplDiskSpaceHealthCheckProperties = {
    HcTags : ConfigNodePropertyArray;
    DiskSpaceWarnThreshold : ConfigNodePropertyInteger;
    DiskSpaceErrorThreshold : ConfigNodePropertyInteger;
  }
  //#endregion
