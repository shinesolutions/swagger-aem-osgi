package models

type OrgApacheSlingCaconfigResourceImplDefDefaultContextPathStrategyProperties struct {

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ConfigRefResourceNames ConfigNodePropertyArray `json:"configRefResourceNames,omitempty"`

	ConfigRefPropertyNames ConfigNodePropertyArray `json:"configRefPropertyNames,omitempty"`

	ServiceRanking ConfigNodePropertyInteger `json:"service.ranking,omitempty"`
}
