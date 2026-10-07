package models

type ComDayCqDamCoreImplMissingMetadataNotificationJobProperties struct {

	CqDamMissingmetadataNotificationSchedulerIstimebased ConfigNodePropertyBoolean `json:"cq.dam.missingmetadata.notification.scheduler.istimebased,omitempty"`

	CqDamMissingmetadataNotificationSchedulerTimebasedRule ConfigNodePropertyString `json:"cq.dam.missingmetadata.notification.scheduler.timebased.rule,omitempty"`

	CqDamMissingmetadataNotificationSchedulerPeriodRule ConfigNodePropertyInteger `json:"cq.dam.missingmetadata.notification.scheduler.period.rule,omitempty"`

	CqDamMissingmetadataNotificationRecipient ConfigNodePropertyString `json:"cq.dam.missingmetadata.notification.recipient,omitempty"`
}
