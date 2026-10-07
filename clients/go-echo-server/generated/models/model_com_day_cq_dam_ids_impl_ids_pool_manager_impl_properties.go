package models

type ComDayCqDamIdsImplIdsPoolManagerImplProperties struct {

	MaxErrorsToBlacklist ConfigNodePropertyInteger `json:"max.errors.to.blacklist,omitempty"`

	RetryIntervalToWhitelist ConfigNodePropertyInteger `json:"retry.interval.to.whitelist,omitempty"`

	ConnectTimeout ConfigNodePropertyInteger `json:"connect.timeout,omitempty"`

	SocketTimeout ConfigNodePropertyInteger `json:"socket.timeout,omitempty"`

	ProcessLabel ConfigNodePropertyString `json:"process.label,omitempty"`

	ConnectionUseMax ConfigNodePropertyInteger `json:"connection.use.max,omitempty"`
}
