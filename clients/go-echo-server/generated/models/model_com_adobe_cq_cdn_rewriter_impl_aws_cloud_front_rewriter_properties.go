package models

type ComAdobeCqCdnRewriterImplAwsCloudFrontRewriterProperties struct {

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`

	KeypairId ConfigNodePropertyString `json:"keypair.id,omitempty"`

	KeypairAlias ConfigNodePropertyString `json:"keypair.alias,omitempty"`

	CdnrewriterAttributes ConfigNodePropertyArray `json:"cdnrewriter.attributes,omitempty"`

	CdnRewriterDistributionDomain ConfigNodePropertyString `json:"cdn.rewriter.distribution.domain,omitempty"`
}
