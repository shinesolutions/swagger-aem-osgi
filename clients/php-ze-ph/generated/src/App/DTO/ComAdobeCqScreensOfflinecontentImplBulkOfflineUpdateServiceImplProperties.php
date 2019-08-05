<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path;
    /**
     * @DTA\Data(field="com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency;
}
