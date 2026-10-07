package models

type ComDayCqWcmFoundationFormsImplMailServletProperties struct {

	SlingServletResourceTypes ConfigNodePropertyString `json:"sling.servlet.resourceTypes,omitempty"`

	SlingServletSelectors ConfigNodePropertyString `json:"sling.servlet.selectors,omitempty"`

	ResourceWhitelist ConfigNodePropertyArray `json:"resource.whitelist,omitempty"`

	ResourceBlacklist ConfigNodePropertyString `json:"resource.blacklist,omitempty"`
}
