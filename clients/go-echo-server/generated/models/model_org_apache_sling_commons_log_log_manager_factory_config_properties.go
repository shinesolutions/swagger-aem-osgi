package models

type OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties struct {

	OrgApacheSlingCommonsLogLevel ConfigNodePropertyDropDown `json:"org.apache.sling.commons.log.level,omitempty"`

	OrgApacheSlingCommonsLogFile ConfigNodePropertyString `json:"org.apache.sling.commons.log.file,omitempty"`

	OrgApacheSlingCommonsLogPattern ConfigNodePropertyString `json:"org.apache.sling.commons.log.pattern,omitempty"`

	OrgApacheSlingCommonsLogNames ConfigNodePropertyArray `json:"org.apache.sling.commons.log.names,omitempty"`

	OrgApacheSlingCommonsLogAdditiv ConfigNodePropertyBoolean `json:"org.apache.sling.commons.log.additiv,omitempty"`
}
