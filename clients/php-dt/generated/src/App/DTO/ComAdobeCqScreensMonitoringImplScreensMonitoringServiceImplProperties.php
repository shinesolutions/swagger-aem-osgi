<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password = null;

}
