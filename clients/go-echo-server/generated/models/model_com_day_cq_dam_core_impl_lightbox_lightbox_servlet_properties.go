package models

type ComDayCqDamCoreImplLightboxLightboxServletProperties struct {

	SlingServletPaths ConfigNodePropertyString `json:"sling.servlet.paths,omitempty"`

	SlingServletMethods ConfigNodePropertyArray `json:"sling.servlet.methods,omitempty"`

	CqDamEnableAnonymous ConfigNodePropertyBoolean `json:"cq.dam.enable.anonymous,omitempty"`
}
