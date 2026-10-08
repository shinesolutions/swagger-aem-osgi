namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqHcContentPackagesHealthCheckProperties =

  //#region ComAdobeCqHcContentPackagesHealthCheckProperties


  type comAdobeCqHcContentPackagesHealthCheckProperties = {
    HcName : ConfigNodePropertyString;
    HcTags : ConfigNodePropertyArray;
    HcMbeanName : ConfigNodePropertyString;
    PackageNames : ConfigNodePropertyArray;
  }
  //#endregion
