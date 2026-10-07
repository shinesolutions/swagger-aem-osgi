package models

type ComAdobeGraniteTaskmanagementImplPurgeTaskPurgeMaintenanceTaskProperties struct {

	PurgeCompleted ConfigNodePropertyBoolean `json:"purgeCompleted,omitempty"`

	CompletedAge ConfigNodePropertyInteger `json:"completedAge,omitempty"`

	PurgeActive ConfigNodePropertyBoolean `json:"purgeActive,omitempty"`

	ActiveAge ConfigNodePropertyInteger `json:"activeAge,omitempty"`

	SaveThreshold ConfigNodePropertyInteger `json:"saveThreshold,omitempty"`
}
