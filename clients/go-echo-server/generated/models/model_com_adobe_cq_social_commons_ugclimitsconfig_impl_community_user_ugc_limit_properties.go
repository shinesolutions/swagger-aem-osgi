package models

type ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUgcLimitProperties struct {

	Enable ConfigNodePropertyBoolean `json:"enable,omitempty"`

	UGCLimit ConfigNodePropertyInteger `json:"UGCLimit,omitempty"`

	UgcLimitDuration ConfigNodePropertyInteger `json:"ugcLimitDuration,omitempty"`

	Domains ConfigNodePropertyArray `json:"domains,omitempty"`

	ToList ConfigNodePropertyArray `json:"toList,omitempty"`
}
