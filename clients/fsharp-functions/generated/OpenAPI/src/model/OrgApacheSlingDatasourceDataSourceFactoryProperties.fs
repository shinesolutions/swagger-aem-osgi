namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDatasourceDataSourceFactoryProperties =

  //#region OrgApacheSlingDatasourceDataSourceFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingDatasourceDataSourceFactoryProperties = {
    [<JsonProperty(PropertyName = "datasource.name")>]
    DatasourceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "datasource.svc.prop.name")>]
    DatasourceSvcPropName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "driverClassName")>]
    DriverClassName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "url")>]
    Url : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "username")>]
    Username : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "password")>]
    Password : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "defaultAutoCommit")>]
    DefaultAutoCommit : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "defaultReadOnly")>]
    DefaultReadOnly : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "defaultTransactionIsolation")>]
    DefaultTransactionIsolation : ConfigNodePropertyDropDown;
    [<JsonProperty(PropertyName = "defaultCatalog")>]
    DefaultCatalog : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "maxActive")>]
    MaxActive : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxIdle")>]
    MaxIdle : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "minIdle")>]
    MinIdle : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "initialSize")>]
    InitialSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxWait")>]
    MaxWait : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "maxAge")>]
    MaxAge : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "testOnBorrow")>]
    TestOnBorrow : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "testOnReturn")>]
    TestOnReturn : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "testWhileIdle")>]
    TestWhileIdle : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "validationQuery")>]
    ValidationQuery : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "validationQueryTimeout")>]
    ValidationQueryTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "timeBetweenEvictionRunsMillis")>]
    TimeBetweenEvictionRunsMillis : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "minEvictableIdleTimeMillis")>]
    MinEvictableIdleTimeMillis : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "connectionProperties")>]
    ConnectionProperties : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "initSQL")>]
    InitSQL : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jdbcInterceptors")>]
    JdbcInterceptors : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "validationInterval")>]
    ValidationInterval : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "logValidationErrors")>]
    LogValidationErrors : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "datasource.svc.properties")>]
    DatasourceSvcProperties : ConfigNodePropertyArray;
  }

  //#endregion
