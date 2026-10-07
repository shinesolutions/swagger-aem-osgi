namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyInteger

module ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties =

  //#region ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties

  [<CLIMutable>]
  type ComDayCqAnalyticsSitecatalystImplSitecatalystHttpClientImplProperties = {
    [<JsonProperty(PropertyName = "cq.analytics.sitecatalyst.service.datacenter.url")>]
    CqAnalyticsSitecatalystServiceDatacenterUrl : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "devhostnamepatterns")>]
    Devhostnamepatterns : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "connection.timeout")>]
    ConnectionTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "socket.timeout")>]
    SocketTimeout : ConfigNodePropertyInteger;
  }

  //#endregion
