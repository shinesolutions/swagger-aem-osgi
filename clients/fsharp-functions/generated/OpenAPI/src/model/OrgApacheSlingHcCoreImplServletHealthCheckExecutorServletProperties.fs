namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties =

  //#region OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties

  [<CLIMutable>]
  type OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties = {
    [<JsonProperty(PropertyName = "servletPath")>]
    ServletPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "disabled")>]
    Disabled : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "cors.accessControlAllowOrigin")>]
    CorsAccessControlAllowOrigin : ConfigNodePropertyString;
  }

  //#endregion
