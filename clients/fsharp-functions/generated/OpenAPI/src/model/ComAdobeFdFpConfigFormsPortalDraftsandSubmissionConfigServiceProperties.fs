namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties =

  //#region ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties

  [<CLIMutable>]
  type ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = {
    [<JsonProperty(PropertyName = "portal.outboxes")>]
    PortalOutboxes : ConfigNodePropertyArray;
    [<JsonProperty(PropertyName = "draft.data.service")>]
    DraftDataService : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "draft.metadata.service")>]
    DraftMetadataService : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "submit.data.service")>]
    SubmitDataService : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "submit.metadata.service")>]
    SubmitMetadataService : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pendingSign.data.service")>]
    PendingSignDataService : ConfigNodePropertyString;
    [<JsonProperty(PropertyName = "pendingSign.metadata.service")>]
    PendingSignMetadataService : ConfigNodePropertyString;
  }

  //#endregion
