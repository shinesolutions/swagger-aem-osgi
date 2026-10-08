namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties =

  //#region OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties

  [<CLIMutable>]
  type OrgApacheSlingScriptingCoreImplScriptingResourceResolverProviderProperties = {
    [<JsonProperty(PropertyName = "log.stacktrace.onclose")>]
    LogStacktraceOnclose : ConfigNodePropertyBoolean;
  }

  //#endregion
