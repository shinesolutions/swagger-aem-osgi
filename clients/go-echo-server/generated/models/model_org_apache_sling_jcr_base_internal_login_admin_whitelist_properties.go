package models

type OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties struct {

	WhitelistBypass ConfigNodePropertyBoolean `json:"whitelist.bypass,omitempty"`

	WhitelistBundlesRegexp ConfigNodePropertyString `json:"whitelist.bundles.regexp,omitempty"`
}
