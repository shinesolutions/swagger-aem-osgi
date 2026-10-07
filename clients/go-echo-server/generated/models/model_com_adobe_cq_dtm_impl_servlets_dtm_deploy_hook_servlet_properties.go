package models

type ComAdobeCqDtmImplServletsDtmDeployHookServletProperties struct {

	DtmStagingIpWhitelist ConfigNodePropertyArray `json:"dtm.staging.ip.whitelist,omitempty"`

	DtmProductionIpWhitelist ConfigNodePropertyArray `json:"dtm.production.ip.whitelist,omitempty"`
}
