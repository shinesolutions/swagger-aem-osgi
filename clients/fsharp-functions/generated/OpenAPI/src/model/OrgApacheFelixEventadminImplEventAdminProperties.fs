namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyFloat
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheFelixEventadminImplEventAdminProperties =

  //#region OrgApacheFelixEventadminImplEventAdminProperties

  [<CLIMutable>]
  type OrgApacheFelixEventadminImplEventAdminProperties = {
    [<JsonProperty(PropertyName = "org.apache.felix.eventadmin.ThreadPoolSize")>]
    OrgApacheFelixEventadminThreadPoolSize : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.eventadmin.AsyncToSyncThreadRatio")>]
    OrgApacheFelixEventadminAsyncToSyncThreadRatio : ConfigNodePropertyFloat;
    [<JsonProperty(PropertyName = "org.apache.felix.eventadmin.Timeout")>]
    OrgApacheFelixEventadminTimeout : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "org.apache.felix.eventadmin.RequireTopic")>]
    OrgApacheFelixEventadminRequireTopic : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "org.apache.felix.eventadmin.IgnoreTimeout")>]
    OrgApacheFelixEventadminIgnoreTimeout : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "org.apache.felix.eventadmin.IgnoreTopic")>]
    OrgApacheFelixEventadminIgnoreTopic : ConfigNodePropertyArray;
  }

  //#endregion
