package models

type ComAdobeCqSocialTranslationImplUgcLanguageDetectorProperties struct {

	EventTopics ConfigNodePropertyString `json:"event.topics,omitempty"`

	EventFilter ConfigNodePropertyString `json:"event.filter,omitempty"`

	TranslateListenerType ConfigNodePropertyArray `json:"translate.listener.type,omitempty"`

	TranslatePropertyList ConfigNodePropertyArray `json:"translate.property.list,omitempty"`

	PoolSize ConfigNodePropertyInteger `json:"poolSize,omitempty"`

	MaxPoolSize ConfigNodePropertyInteger `json:"maxPoolSize,omitempty"`

	QueueSize ConfigNodePropertyInteger `json:"queueSize,omitempty"`

	KeepAliveTime ConfigNodePropertyInteger `json:"keepAliveTime,omitempty"`
}
