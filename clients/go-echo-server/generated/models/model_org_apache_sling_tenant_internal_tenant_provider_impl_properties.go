package models

type OrgApacheSlingTenantInternalTenantProviderImplProperties struct {

	TenantRoot ConfigNodePropertyString `json:"tenant.root,omitempty"`

	TenantPathMatcher ConfigNodePropertyArray `json:"tenant.path.matcher,omitempty"`
}
