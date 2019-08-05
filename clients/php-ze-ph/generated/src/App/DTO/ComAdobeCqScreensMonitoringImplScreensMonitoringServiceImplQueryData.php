<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for comAdobeCqScreensMonitoringImplScreensMonitoringServiceImpl
 */
class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplQueryData
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_password;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpserver;
    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $apply;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"multi"})
     * @var string[]
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_project_path;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_schedule_frequency;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_smtpport;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_usetls;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $delete;
    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="QueryParameterArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryParameterArrayType", options={"type":"string", "format":"csv"})
     * @var string[]
     */
    public $propertylist;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"int"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"int"})
     * @var int
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_ping_timeout;
    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"bool"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"bool"})
     * @var bool
     */
    public $post;
    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $location;
    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $action;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_recipients;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", nullable=true)
     * @DTA\Strategy(name="QueryParameter", options={"type":"string"})
     * @DTA\Validator(name="QueryParameterType", options={"type":"string"})
     * @var string
     */
    public $com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_username;
}
