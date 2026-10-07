namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties =

  //#region OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties


  type orgApacheSlingDatasourceJNDIDataSourceFactoryProperties = {
    DatasourceName : ConfigNodePropertyString;
    DatasourceSvcPropName : ConfigNodePropertyString;
    DatasourceJndiName : ConfigNodePropertyString;
    JndiProperties : ConfigNodePropertyArray;
  }
  //#endregion
