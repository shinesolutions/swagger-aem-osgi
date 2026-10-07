namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties =

  //#region ComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties


  type comDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties = {
    JdbcDriverClass : ConfigNodePropertyString;
    JdbcConnectionUri : ConfigNodePropertyString;
    JdbcUsername : ConfigNodePropertyString;
    JdbcPassword : ConfigNodePropertyString;
    JdbcValidationQuery : ConfigNodePropertyString;
    DefaultReadonly : ConfigNodePropertyBoolean;
    DefaultAutocommit : ConfigNodePropertyBoolean;
    PoolSize : ConfigNodePropertyInteger;
    PoolMaxWaitMsec : ConfigNodePropertyInteger;
    DatasourceName : ConfigNodePropertyString;
    DatasourceSvcProperties : ConfigNodePropertyArray;
  }
  //#endregion
