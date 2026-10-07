namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyDropDown
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDatasourceDataSourceFactoryProperties =

  //#region OrgApacheSlingDatasourceDataSourceFactoryProperties


  type orgApacheSlingDatasourceDataSourceFactoryProperties = {
    DatasourceName : ConfigNodePropertyString;
    DatasourceSvcPropName : ConfigNodePropertyString;
    DriverClassName : ConfigNodePropertyString;
    Url : ConfigNodePropertyString;
    Username : ConfigNodePropertyString;
    Password : ConfigNodePropertyString;
    DefaultAutoCommit : ConfigNodePropertyDropDown;
    DefaultReadOnly : ConfigNodePropertyDropDown;
    DefaultTransactionIsolation : ConfigNodePropertyDropDown;
    DefaultCatalog : ConfigNodePropertyString;
    MaxActive : ConfigNodePropertyInteger;
    MaxIdle : ConfigNodePropertyInteger;
    MinIdle : ConfigNodePropertyInteger;
    InitialSize : ConfigNodePropertyInteger;
    MaxWait : ConfigNodePropertyInteger;
    MaxAge : ConfigNodePropertyInteger;
    TestOnBorrow : ConfigNodePropertyBoolean;
    TestOnReturn : ConfigNodePropertyBoolean;
    TestWhileIdle : ConfigNodePropertyBoolean;
    ValidationQuery : ConfigNodePropertyString;
    ValidationQueryTimeout : ConfigNodePropertyInteger;
    TimeBetweenEvictionRunsMillis : ConfigNodePropertyInteger;
    MinEvictableIdleTimeMillis : ConfigNodePropertyInteger;
    ConnectionProperties : ConfigNodePropertyString;
    InitSQL : ConfigNodePropertyString;
    JdbcInterceptors : ConfigNodePropertyString;
    ValidationInterval : ConfigNodePropertyInteger;
    LogValidationErrors : ConfigNodePropertyBoolean;
    DatasourceSvcProperties : ConfigNodePropertyArray;
  }
  //#endregion
