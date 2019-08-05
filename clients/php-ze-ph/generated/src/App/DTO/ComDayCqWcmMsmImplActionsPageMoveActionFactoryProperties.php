<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
{
    /**
     * @DTA\Data(field="cq.wcm.msm.action.excludednodetypes", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_wcm_msm_action_excludednodetypes;
    /**
     * @DTA\Data(field="cq.wcm.msm.action.excludedparagraphitems", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_wcm_msm_action_excludedparagraphitems;
    /**
     * @DTA\Data(field="cq.wcm.msm.action.excludedprops", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_wcm_msm_action_excludedprops;
    /**
     * @DTA\Data(field="cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $cq_wcm_msm_impl_actions_pagemove_prop_reference_update;
}
