package models

type OrgApacheSlingCommonsSchedulerImplQuartzSchedulerProperties struct {

	PoolName ConfigNodePropertyString `json:"poolName,omitempty"`

	AllowedPoolNames ConfigNodePropertyArray `json:"allowedPoolNames,omitempty"`

	SchedulerUseleaderforsingle ConfigNodePropertyBoolean `json:"scheduler.useleaderforsingle,omitempty"`

	MetricsFilters ConfigNodePropertyArray `json:"metrics.filters,omitempty"`

	SlowThresholdMillis ConfigNodePropertyInteger `json:"slowThresholdMillis,omitempty"`
}
