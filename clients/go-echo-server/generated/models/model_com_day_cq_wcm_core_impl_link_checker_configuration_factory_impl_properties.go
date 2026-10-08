package models

type ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties struct {

	LinkExpiredPrefix ConfigNodePropertyString `json:"link.expired.prefix,omitempty"`

	LinkExpiredRemove ConfigNodePropertyBoolean `json:"link.expired.remove,omitempty"`

	LinkExpiredSuffix ConfigNodePropertyString `json:"link.expired.suffix,omitempty"`

	LinkInvalidPrefix ConfigNodePropertyString `json:"link.invalid.prefix,omitempty"`

	LinkInvalidRemove ConfigNodePropertyBoolean `json:"link.invalid.remove,omitempty"`

	LinkInvalidSuffix ConfigNodePropertyString `json:"link.invalid.suffix,omitempty"`

	LinkPredatedPrefix ConfigNodePropertyString `json:"link.predated.prefix,omitempty"`

	LinkPredatedRemove ConfigNodePropertyBoolean `json:"link.predated.remove,omitempty"`

	LinkPredatedSuffix ConfigNodePropertyString `json:"link.predated.suffix,omitempty"`

	LinkWcmmodes ConfigNodePropertyArray `json:"link.wcmmodes,omitempty"`
}
