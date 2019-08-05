<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password;
}
