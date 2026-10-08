package models

type OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties struct {

	OrgApacheSlingInstallerConfigurationPersist ConfigNodePropertyBoolean `json:"org.apache.sling.installer.configuration.persist,omitempty"`

	Mode ConfigNodePropertyDropDown `json:"mode,omitempty"`

	Port ConfigNodePropertyInteger `json:"port,omitempty"`

	PrimaryHost ConfigNodePropertyString `json:"primary.host,omitempty"`

	Interval ConfigNodePropertyInteger `json:"interval,omitempty"`

	PrimaryAllowedClientIpRanges ConfigNodePropertyArray `json:"primary.allowed-client-ip-ranges,omitempty"`

	Secure ConfigNodePropertyBoolean `json:"secure,omitempty"`

	StandbyReadtimeout ConfigNodePropertyInteger `json:"standby.readtimeout,omitempty"`

	StandbyAutoclean ConfigNodePropertyBoolean `json:"standby.autoclean,omitempty"`
}
