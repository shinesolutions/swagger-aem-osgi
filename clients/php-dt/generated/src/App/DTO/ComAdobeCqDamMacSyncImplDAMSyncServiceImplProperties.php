<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties
{
    /**
     * @DTA\Data(field="com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths = null;

    /**
     * @DTA\Data(field="com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions = null;

    /**
     * @DTA\Data(field="com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms = null;

    /**
     * @DTA\Data(field="com.adobe.cq.dam.mac.sync.damsyncservice.platform", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     */
    public ?\App\DTO\ConfigNodePropertyDropDown $com_adobe_cq_dam_mac_sync_damsyncservice_platform = null;

}
