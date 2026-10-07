namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties =

  //#region OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingDatasourceJNDIDataSourceFactoryProperties = {
    [<JsonProperty(PropertyName = "datasource.name")>]
    DatasourceName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "datasource.svc.prop.name")>]
    DatasourceSvcPropName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "datasource.jndi.name")>]
    DatasourceJndiName : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jndi.properties")>]
    JndiProperties : ConfigNodePropertyArray;
  }

  //#endregion
