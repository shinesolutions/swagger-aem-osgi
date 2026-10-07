namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyBoolean

module ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties =

  //#region ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties

  [<CLIMutable>]
  type ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties = {
    [<JsonProperty(PropertyName = "formsManagerConfig.includeOOTBTemplates")>]
    FormsManagerConfigIncludeOOTBTemplates : ConfigNodePropertyBoolean;
    [<JsonProperty(PropertyName = "formsManagerConfig.includeDeprecatedTemplates")>]
    FormsManagerConfigIncludeDeprecatedTemplates : ConfigNodePropertyBoolean;
  }

  //#endregion
