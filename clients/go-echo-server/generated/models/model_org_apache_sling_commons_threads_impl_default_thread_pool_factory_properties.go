package models

type OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	MinPoolSize ConfigNodePropertyInteger `json:"minPoolSize,omitempty"`

	MaxPoolSize ConfigNodePropertyInteger `json:"maxPoolSize,omitempty"`

	QueueSize ConfigNodePropertyInteger `json:"queueSize,omitempty"`

	MaxThreadAge ConfigNodePropertyInteger `json:"maxThreadAge,omitempty"`

	KeepAliveTime ConfigNodePropertyInteger `json:"keepAliveTime,omitempty"`

	BlockPolicy ConfigNodePropertyDropDown `json:"blockPolicy,omitempty"`

	ShutdownGraceful ConfigNodePropertyBoolean `json:"shutdownGraceful,omitempty"`

	Daemon ConfigNodePropertyBoolean `json:"daemon,omitempty"`

	ShutdownWaitTime ConfigNodePropertyInteger `json:"shutdownWaitTime,omitempty"`

	Priority ConfigNodePropertyDropDown `json:"priority,omitempty"`
}
