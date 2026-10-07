package models

type ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties struct {

	XmpFilterApplyWhitelist ConfigNodePropertyBoolean `json:"xmp.filter.apply_whitelist,omitempty"`

	XmpFilterWhitelist ConfigNodePropertyArray `json:"xmp.filter.whitelist,omitempty"`

	XmpFilterApplyBlacklist ConfigNodePropertyBoolean `json:"xmp.filter.apply_blacklist,omitempty"`

	XmpFilterBlacklist ConfigNodePropertyArray `json:"xmp.filter.blacklist,omitempty"`
}
