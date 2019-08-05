<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeAemUpgradePrechecksMbeanImplPreUpgradeTasksMBeanImplProperties
{
    /**
     * @DTA\Data(field="pre-upgrade.maintenance.tasks", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $pre_upgrade_maintenance_tasks;
    /**
     * @DTA\Data(field="pre-upgrade.hc.tags", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $pre_upgrade_hc_tags;
}
