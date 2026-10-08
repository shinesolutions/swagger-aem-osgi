<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl
 */
class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplQueryData
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver;

    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $apply;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls;

    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $delete;

    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $propertylist;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout;

    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $post;

    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $location;

    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $action;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username;

}
