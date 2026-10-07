package models

type ComDayCqCommonsImplExternalizerImplProperties struct {

	ExternalizerDomains ConfigNodePropertyArray `json:"externalizer.domains,omitempty"`

	ExternalizerHost ConfigNodePropertyString `json:"externalizer.host,omitempty"`

	ExternalizerContextpath ConfigNodePropertyString `json:"externalizer.contextpath,omitempty"`

	ExternalizerEncodedpath ConfigNodePropertyBoolean `json:"externalizer.encodedpath,omitempty"`
}
