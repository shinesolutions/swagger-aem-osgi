<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_project_path = null;

    /**
     * @DTA\Data(field="com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_schedule_frequency = null;

}
