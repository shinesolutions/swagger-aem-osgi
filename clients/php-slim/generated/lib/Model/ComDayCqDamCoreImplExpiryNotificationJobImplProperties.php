<?php
/**
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComDayCqDamCoreImplExpiryNotificationJobImplProperties
 */
class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $cqDamExpiryNotificationSchedulerIstimebased */
    private $cqDamExpiryNotificationSchedulerIstimebased;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $cqDamExpiryNotificationSchedulerTimebasedRule */
    private $cqDamExpiryNotificationSchedulerTimebasedRule;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $cqDamExpiryNotificationSchedulerPeriodRule */
    private $cqDamExpiryNotificationSchedulerPeriodRule;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $sendEmail */
    private $sendEmail;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $assetExpiredLimit */
    private $assetExpiredLimit;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $priorNotificationSeconds */
    private $priorNotificationSeconds;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $cqDamExpiryNotificationUrlProtocol */
    private $cqDamExpiryNotificationUrlProtocol;

}
