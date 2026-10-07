package models

type ComDayCqSearchpromoteImplSearchPromoteServiceImplProperties struct {

	CqSearchpromoteConfigurationServerUri ConfigNodePropertyString `json:"cq.searchpromote.configuration.server.uri,omitempty"`

	CqSearchpromoteConfigurationEnvironment ConfigNodePropertyString `json:"cq.searchpromote.configuration.environment,omitempty"`

	ConnectionTimeout ConfigNodePropertyInteger `json:"connection.timeout,omitempty"`

	SocketTimeout ConfigNodePropertyInteger `json:"socket.timeout,omitempty"`
}
