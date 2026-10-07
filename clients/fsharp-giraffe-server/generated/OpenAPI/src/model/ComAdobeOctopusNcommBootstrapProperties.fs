namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyInteger

module ComAdobeOctopusNcommBootstrapProperties =

  //#region ComAdobeOctopusNcommBootstrapProperties


  type comAdobeOctopusNcommBootstrapProperties = {
    MaxConnections : ConfigNodePropertyInteger;
    MaxRequests : ConfigNodePropertyInteger;
    RequestTimeout : ConfigNodePropertyInteger;
    RequestRetries : ConfigNodePropertyInteger;
    LaunchTimeout : ConfigNodePropertyInteger;
  }
  //#endregion
