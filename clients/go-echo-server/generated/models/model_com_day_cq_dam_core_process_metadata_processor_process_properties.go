package models

type ComDayCqDamCoreProcessMetadataProcessorProcessProperties struct {

	ProcessLabel ConfigNodePropertyString `json:"process.label,omitempty"`

	CqDamEnableSha1 ConfigNodePropertyBoolean `json:"cq.dam.enable.sha1,omitempty"`

	CqDamMetadataXssprotectedProperties ConfigNodePropertyArray `json:"cq.dam.metadata.xssprotected.properties,omitempty"`
}
