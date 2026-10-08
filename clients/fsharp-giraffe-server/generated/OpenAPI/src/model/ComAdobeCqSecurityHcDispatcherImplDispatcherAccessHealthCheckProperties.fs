namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties =

  //#region ComAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties


  type comAdobeCqSecurityHcDispatcherImplDispatcherAccessHealthCheckProperties = {
    HcTags : ConfigNodePropertyArray;
    DispatcherAddress : ConfigNodePropertyString;
    DispatcherFilterAllowed : ConfigNodePropertyArray;
    DispatcherFilterBlocked : ConfigNodePropertyArray;
  }
  //#endregion
