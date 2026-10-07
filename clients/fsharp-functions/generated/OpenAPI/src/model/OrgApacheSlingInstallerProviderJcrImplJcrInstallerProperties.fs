namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties =

  //#region OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties

  [<CLIMutable>]
  type OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = {
    [<JsonProperty(PropertyName = "handler.schemes")>]
    HandlerSchemes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.jcrinstall.folder.name.regexp")>]
    SlingJcrinstallFolderNameRegexp : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.jcrinstall.folder.max.depth")>]
    SlingJcrinstallFolderMaxDepth : ConfigNodePropertyInteger;
    [<JsonProperty(PropertyName = "sling.jcrinstall.search.path")>]
    SlingJcrinstallSearchPath : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "sling.jcrinstall.new.config.path")>]
    SlingJcrinstallNewConfigPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.jcrinstall.signal.path")>]
    SlingJcrinstallSignalPath : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "sling.jcrinstall.enable.writeback")>]
    SlingJcrinstallEnableWriteback : ConfigNodePropertyBoolean;
  }

  //#endregion
