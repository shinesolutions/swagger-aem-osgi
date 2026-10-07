<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl
 */
class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplParameterData
{
    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver = null;

    /**
     * @DTA\Data(subset="query", field="apply", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $apply = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls = null;

    /**
     * @DTA\Data(subset="query", field="delete", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $delete = null;

    /**
     * @DTA\Data(subset="query", field="propertylist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $propertylist = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout = null;

    /**
     * @DTA\Data(subset="query", field="post", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $post = null;

    /**
     * @DTA\Data(subset="query", field="$location", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(subset="query", field="action", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $action = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients = null;

    /**
     * @DTA\Data(subset="query", field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username = null;

}
