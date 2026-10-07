package models

type ComDayCqDamCoreImplUiPreviewFolderPreviewUpdaterImplProperties struct {

	CreatePreviewEnabled ConfigNodePropertyBoolean `json:"createPreviewEnabled,omitempty"`

	UpdatePreviewEnabled ConfigNodePropertyBoolean `json:"updatePreviewEnabled,omitempty"`

	QueueSize ConfigNodePropertyInteger `json:"queueSize,omitempty"`

	FolderPreviewRenditionRegex ConfigNodePropertyString `json:"folderPreviewRenditionRegex,omitempty"`
}
