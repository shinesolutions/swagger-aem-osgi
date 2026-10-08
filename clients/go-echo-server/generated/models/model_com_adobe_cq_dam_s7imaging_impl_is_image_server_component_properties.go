package models

type ComAdobeCqDamS7imagingImplIsImageServerComponentProperties struct {

	TcpPort ConfigNodePropertyString `json:"TcpPort,omitempty"`

	AllowRemoteAccess ConfigNodePropertyBoolean `json:"AllowRemoteAccess,omitempty"`

	MaxRenderRgnPixels ConfigNodePropertyString `json:"MaxRenderRgnPixels,omitempty"`

	MaxMessageSize ConfigNodePropertyString `json:"MaxMessageSize,omitempty"`

	RandomAccessUrlTimeout ConfigNodePropertyInteger `json:"RandomAccessUrlTimeout,omitempty"`

	WorkerThreads ConfigNodePropertyInteger `json:"WorkerThreads,omitempty"`
}
