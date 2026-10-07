package models

type ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties struct {

	PortalOutboxes ConfigNodePropertyArray `json:"portal.outboxes,omitempty"`

	DraftDataService ConfigNodePropertyString `json:"draft.data.service,omitempty"`

	DraftMetadataService ConfigNodePropertyString `json:"draft.metadata.service,omitempty"`

	SubmitDataService ConfigNodePropertyString `json:"submit.data.service,omitempty"`

	SubmitMetadataService ConfigNodePropertyString `json:"submit.metadata.service,omitempty"`

	PendingSignDataService ConfigNodePropertyString `json:"pendingSign.data.service,omitempty"`

	PendingSignMetadataService ConfigNodePropertyString `json:"pendingSign.metadata.service,omitempty"`
}
