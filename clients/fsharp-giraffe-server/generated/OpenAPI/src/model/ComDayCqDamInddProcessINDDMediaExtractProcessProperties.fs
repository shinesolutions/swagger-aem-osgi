namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyBoolean
open OpenAPI.Model.ConfigNodePropertyString

module ComDayCqDamInddProcessINDDMediaExtractProcessProperties =

  //#region ComDayCqDamInddProcessINDDMediaExtractProcessProperties


  type comDayCqDamInddProcessINDDMediaExtractProcessProperties = {
    ProcessLabel : ConfigNodePropertyString;
    CqDamInddPagesRegex : ConfigNodePropertyString;
    IdsJobDecoupled : ConfigNodePropertyBoolean;
    IdsJobWorkflowModel : ConfigNodePropertyString;
  }
  //#endregion
