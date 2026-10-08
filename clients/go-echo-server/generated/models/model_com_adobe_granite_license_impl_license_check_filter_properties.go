package models

type ComAdobeGraniteLicenseImplLicenseCheckFilterProperties struct {

	CheckInternval ConfigNodePropertyInteger `json:"checkInternval,omitempty"`

	ExcludeIds ConfigNodePropertyArray `json:"excludeIds,omitempty"`

	EncryptPing ConfigNodePropertyBoolean `json:"encryptPing,omitempty"`
}
