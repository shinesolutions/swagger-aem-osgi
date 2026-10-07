package models

type ComDayCqDamCoreProcessExtractMetadataProcessProperties struct {

	ProcessLabel ConfigNodePropertyString `json:"process.label,omitempty"`

	CqDamEnableSha1 ConfigNodePropertyBoolean `json:"cq.dam.enable.sha1,omitempty"`
}
