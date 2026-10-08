namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.ConfigNodePropertyArray
open OpenAPI.Model.ConfigNodePropertyString

module ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties =

  //#region ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties


  type comAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties = {
    PortalOutboxes : ConfigNodePropertyArray;
    DraftDataService : ConfigNodePropertyString;
    DraftMetadataService : ConfigNodePropertyString;
    SubmitDataService : ConfigNodePropertyString;
    SubmitMetadataService : ConfigNodePropertyString;
    PendingSignDataService : ConfigNodePropertyString;
    PendingSignMetadataService : ConfigNodePropertyString;
  }
  //#endregion
