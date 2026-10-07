package models

type ComAdobeGraniteLoggingImplLogAnalyserImplProperties struct {

	MessagesQueueSize ConfigNodePropertyInteger `json:"messages.queue.size,omitempty"`

	LoggerConfig ConfigNodePropertyArray `json:"logger.config,omitempty"`

	MessagesSize ConfigNodePropertyInteger `json:"messages.size,omitempty"`
}
