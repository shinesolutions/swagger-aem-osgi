namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyInteger

module OrgApacheSlingServletsGetDefaultGetServletProperties =

  //#region OrgApacheSlingServletsGetDefaultGetServletProperties


  type orgApacheSlingServletsGetDefaultGetServletProperties = {
    Aliases : ConfigNodePropertyArray;
    Index : ConfigNodePropertyBoolean;
    IndexFiles : ConfigNodePropertyArray;
    EnableHtml : ConfigNodePropertyBoolean;
    EnableJson : ConfigNodePropertyBoolean;
    EnableTxt : ConfigNodePropertyBoolean;
    EnableXml : ConfigNodePropertyBoolean;
    JsonMaximumresults : ConfigNodePropertyInteger;
    EcmaSuport : ConfigNodePropertyBoolean;
  }
  //#endregion
