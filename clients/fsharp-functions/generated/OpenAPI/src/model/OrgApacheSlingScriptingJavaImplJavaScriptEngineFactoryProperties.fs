namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties =

  //#region OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties = {
    [<JsonProperty(PropertyName = "java.classdebuginfo")>]
    JavaClassdebuginfo : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "java.javaEncoding")>]
    JavaJavaEncoding : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "java.compilerSourceVM")>]
    JavaCompilerSourceVM : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "java.compilerTargetVM")>]
    JavaCompilerTargetVM : ConfigNodePropertyString;
  }

  //#endregion
