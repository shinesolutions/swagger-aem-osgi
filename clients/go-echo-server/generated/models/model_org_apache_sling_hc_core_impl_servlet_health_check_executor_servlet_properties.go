package models

type OrgApacheSlingHcCoreImplServletHealthCheckExecutorServletProperties struct {

	ServletPath ConfigNodePropertyString `json:"servletPath,omitempty"`

	Disabled ConfigNodePropertyBoolean `json:"disabled,omitempty"`

	CorsAccessControlAllowOrigin ConfigNodePropertyString `json:"cors.accessControlAllowOrigin,omitempty"`
}
