namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

module ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo =

  //#region ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo

  [<CLIMutable>]
  type ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceInfo = {
    [<JsonProperty(PropertyName = "pid")>]
    Pid : string;
    [<JsonProperty(PropertyName = "title")>]
    Title : string;
    [<JsonProperty(PropertyName = "description")>]
    Description : string;
    [<JsonProperty(PropertyName = "properties")>]
    Properties : ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties;
  }

  //#endregion
