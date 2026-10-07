<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
{
    /**
     * @DTA\Data(field="cq.wcm.msm.action.excludednodetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_wcm_msm_action_excludednodetypes = null;

    /**
     * @DTA\Data(field="cq.wcm.msm.action.excludedparagraphitems", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_wcm_msm_action_excludedparagraphitems = null;

    /**
     * @DTA\Data(field="cq.wcm.msm.action.excludedprops", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_wcm_msm_action_excludedprops = null;

    /**
     * @DTA\Data(field="cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     */
    public ?\App\DTO\ConfigNodePropertyBoolean $cq_wcm_msm_impl_actions_pagemove_prop_reference_update = null;

}
