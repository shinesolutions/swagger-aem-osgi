<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.analytics.impl.url", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_analytics_impl_url;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.analytics.impl.apikey", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_analytics_impl_apikey;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.analytics.impl.project", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_analytics_impl_project;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.analytics.impl.environment", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @var \App\DTO\ConfigNodePropertyDropDown
     */
    public $com_adobe_cq_screens_analytics_impl_environment;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.analytics.impl.sendFrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_cq_screens_analytics_impl_send_frequency;
}
