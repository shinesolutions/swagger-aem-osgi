package models

type OrgApacheSlingCommonsMetricsInternalLogReporterProperties struct {

	Period ConfigNodePropertyInteger `json:"period,omitempty"`

	TimeUnit ConfigNodePropertyDropDown `json:"timeUnit,omitempty"`

	Level ConfigNodePropertyDropDown `json:"level,omitempty"`

	LoggerName ConfigNodePropertyString `json:"loggerName,omitempty"`

	Prefix ConfigNodePropertyString `json:"prefix,omitempty"`

	Pattern ConfigNodePropertyString `json:"pattern,omitempty"`

	RegistryName ConfigNodePropertyString `json:"registryName,omitempty"`
}
