package models

type ComDayCqWcmUndoUndoConfigProperties struct {

	CqWcmUndoEnabled ConfigNodePropertyBoolean `json:"cq.wcm.undo.enabled,omitempty"`

	CqWcmUndoPath ConfigNodePropertyString `json:"cq.wcm.undo.path,omitempty"`

	CqWcmUndoValidity ConfigNodePropertyInteger `json:"cq.wcm.undo.validity,omitempty"`

	CqWcmUndoSteps ConfigNodePropertyInteger `json:"cq.wcm.undo.steps,omitempty"`

	CqWcmUndoPersistence ConfigNodePropertyString `json:"cq.wcm.undo.persistence,omitempty"`

	CqWcmUndoPersistenceMode ConfigNodePropertyBoolean `json:"cq.wcm.undo.persistence.mode,omitempty"`

	CqWcmUndoMarkermode ConfigNodePropertyString `json:"cq.wcm.undo.markermode,omitempty"`

	CqWcmUndoWhitelist ConfigNodePropertyArray `json:"cq.wcm.undo.whitelist,omitempty"`

	CqWcmUndoBlacklist ConfigNodePropertyArray `json:"cq.wcm.undo.blacklist,omitempty"`
}
