package models

type ComDayCqReplicationImplAgentManagerImplProperties struct {

	JobTopics ConfigNodePropertyString `json:"job.topics,omitempty"`

	ServiceUserTarget ConfigNodePropertyString `json:"serviceUser.target,omitempty"`

	AgentProviderTarget ConfigNodePropertyString `json:"agentProvider.target,omitempty"`
}
