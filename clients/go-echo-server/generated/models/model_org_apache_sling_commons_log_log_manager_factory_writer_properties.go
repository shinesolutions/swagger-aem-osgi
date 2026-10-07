package models

type OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties struct {

	OrgApacheSlingCommonsLogFile ConfigNodePropertyString `json:"org.apache.sling.commons.log.file,omitempty"`

	OrgApacheSlingCommonsLogFileNumber ConfigNodePropertyInteger `json:"org.apache.sling.commons.log.file.number,omitempty"`

	OrgApacheSlingCommonsLogFileSize ConfigNodePropertyString `json:"org.apache.sling.commons.log.file.size,omitempty"`

	OrgApacheSlingCommonsLogFileBuffered ConfigNodePropertyBoolean `json:"org.apache.sling.commons.log.file.buffered,omitempty"`
}
