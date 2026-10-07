package models

type OrgApacheSlingEventImplJobsJobConsumerManagerProperties struct {

	OrgApacheSlingInstallerConfigurationPersist ConfigNodePropertyBoolean `json:"org.apache.sling.installer.configuration.persist,omitempty"`

	JobConsumermanagerWhitelist ConfigNodePropertyArray `json:"job.consumermanager.whitelist,omitempty"`

	JobConsumermanagerBlacklist ConfigNodePropertyArray `json:"job.consumermanager.blacklist,omitempty"`
}
