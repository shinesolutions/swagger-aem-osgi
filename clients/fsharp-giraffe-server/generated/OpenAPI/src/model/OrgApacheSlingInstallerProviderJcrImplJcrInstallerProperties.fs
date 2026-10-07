namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger
open OpenAPI.Model.ConfigNodePropertyString

module OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties =

  //#region OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties


  type orgApacheSlingInstallerProviderJcrImplJcrInstallerProperties = {
    HandlerSchemes : ConfigNodePropertyArray;
    SlingJcrinstallFolderNameRegexp : ConfigNodePropertyString;
    SlingJcrinstallFolderMaxDepth : ConfigNodePropertyInteger;
    SlingJcrinstallSearchPath : ConfigNodePropertyArray;
    SlingJcrinstallNewConfigPath : ConfigNodePropertyString;
    SlingJcrinstallSignalPath : ConfigNodePropertyString;
    SlingJcrinstallEnableWriteback : ConfigNodePropertyBoolean;
  }
  //#endregion
