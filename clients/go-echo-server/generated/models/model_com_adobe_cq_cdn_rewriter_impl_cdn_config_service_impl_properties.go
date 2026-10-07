package models

type ComAdobeCqCdnRewriterImplCdnConfigServiceImplProperties struct {

	CdnConfigDistributionDomain ConfigNodePropertyString `json:"cdn.config.distribution.domain,omitempty"`

	CdnConfigEnableRewriting ConfigNodePropertyBoolean `json:"cdn.config.enable.rewriting,omitempty"`

	CdnConfigPathPrefixes ConfigNodePropertyArray `json:"cdn.config.path.prefixes,omitempty"`

	CdnConfigCdnttl ConfigNodePropertyInteger `json:"cdn.config.cdnttl,omitempty"`

	CdnConfigApplicationProtocol ConfigNodePropertyString `json:"cdn.config.application.protocol,omitempty"`
}
