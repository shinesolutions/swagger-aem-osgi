namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties =

  //#region ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

  [<CLIMutable>]
  type ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = {
    [<JsonProperty(PropertyName = "jdbc.driver.class")>]
    JdbcDriverClass : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jdbc.connection.uri")>]
    JdbcConnectionUri : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jdbc.username")>]
    JdbcUsername : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jdbc.password")>]
    JdbcPassword : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jdbc.validation.query")>]
    JdbcValidationQuery : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "default.readonly")>]
    DefaultReadonly : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "default.autocommit")>]
    DefaultAutocommit : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "pool.size")>]
    PoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "pool.max.wait.msec")>]
    PoolMaxWaitMsec : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "datasource.name")>]
    DatasourceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "datasource.svc.properties")>]
    DatasourceSvcProperties : ConfigNodePropertyArray;
  }

  //#endregion
