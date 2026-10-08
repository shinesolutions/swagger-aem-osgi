package models

type OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties struct {

	Enabled ConfigNodePropertyBoolean `json:"enabled,omitempty"`

	ConfigPath ConfigNodePropertyString `json:"configPath,omitempty"`

	FallbackPaths ConfigNodePropertyArray `json:"fallbackPaths,omitempty"`

	ConfigCollectionInheritancePropertyNames ConfigNodePropertyArray `json:"configCollectionInheritancePropertyNames,omitempty"`
}
