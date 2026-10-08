package models

type OrgApacheSlingModelsImplModelAdapterFactoryProperties struct {

	OsgiHttpWhiteboardListener ConfigNodePropertyString `json:"osgi.http.whiteboard.listener,omitempty"`

	OsgiHttpWhiteboardContextSelect ConfigNodePropertyString `json:"osgi.http.whiteboard.context.select,omitempty"`

	MaxRecursionDepth ConfigNodePropertyInteger `json:"max.recursion.depth,omitempty"`

	CleanupJobPeriod ConfigNodePropertyInteger `json:"cleanup.job.period,omitempty"`
}
