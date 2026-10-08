<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqDamCoreImplServletHealthCheckServletProperties
{
    /**
     * @DTA\Data(field="cq.dam.sync.workflow.id", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $cq_dam_sync_workflow_id = null;

    /**
     * @DTA\Data(field="cq.dam.sync.folder.types", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_dam_sync_folder_types = null;

}
