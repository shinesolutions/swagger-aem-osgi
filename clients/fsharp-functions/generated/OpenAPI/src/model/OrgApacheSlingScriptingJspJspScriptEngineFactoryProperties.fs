namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties =

  //#region OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties

  [<CLIMutable>]
  type OrgApacheSlingScriptingJspJspScriptEngineFactoryProperties = {
    [<JsonProperty(PropertyName = "jasper.compilerTargetVM")>]
    JasperCompilerTargetVM : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jasper.compilerSourceVM")>]
    JasperCompilerSourceVM : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jasper.classdebuginfo")>]
    JasperClassdebuginfo : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "jasper.enablePooling")>]
    JasperEnablePooling : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "jasper.ieClassId")>]
    JasperIeClassId : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "jasper.genStringAsCharArray")>]
    JasperGenStringAsCharArray : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "jasper.keepgenerated")>]
    JasperKeepgenerated : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "jasper.mappedfile")>]
    JasperMappedfile : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "jasper.trimSpaces")>]
    JasperTrimSpaces : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "jasper.displaySourceFragments")>]
    JasperDisplaySourceFragments : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "default.is.session")>]
    DefaultIsSession : ConfigNodePropertyBoolean;
  }

  //#endregion
