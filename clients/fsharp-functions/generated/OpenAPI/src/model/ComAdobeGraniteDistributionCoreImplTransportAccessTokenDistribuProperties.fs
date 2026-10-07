namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties =

  //#region ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties

  [<CLIMutable>]
  type ComAdobeGraniteDistributionCoreImplTransportAccessTokenDistribuProperties = {
    [<JsonProperty(PropertyName = "name")>]
    Name : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "serviceName")>]
    ServiceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "userId")>]
    UserId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "accessTokenProvider.target")>]
    AccessTokenProviderTarget : ConfigNodePropertyString;
  }

  //#endregion
