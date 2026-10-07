package models

type OrgApacheSlingDistributionPackagingImplExporterAgentDistributioProperties struct {

	Name ConfigNodePropertyString `json:"name,omitempty"`

	Queue ConfigNodePropertyString `json:"queue,omitempty"`

	DropInvalidItems ConfigNodePropertyBoolean `json:"drop.invalid.items,omitempty"`

	AgentTarget ConfigNodePropertyString `json:"agent.target,omitempty"`
}
