package models

type ComAdobeCqCdnRewriterImplCdnRewriterProperties struct {

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`

	CdnrewriterAttributes ConfigNodePropertyArray `json:"cdnrewriter.attributes,omitempty"`

	CdnRewriterDistributionDomain ConfigNodePropertyString `json:"cdn.rewriter.distribution.domain,omitempty"`
}
