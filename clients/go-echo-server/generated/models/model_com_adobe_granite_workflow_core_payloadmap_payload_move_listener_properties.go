package models

type ComAdobeGraniteWorkflowCorePayloadmapPayloadMoveListenerProperties struct {

	PayloadMoveWhiteList ConfigNodePropertyArray `json:"payload.move.white.list,omitempty"`

	PayloadMoveHandleFromWorkflowProcess ConfigNodePropertyBoolean `json:"payload.move.handle.from.workflow.process,omitempty"`
}
