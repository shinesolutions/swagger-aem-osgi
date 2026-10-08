<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for comDayCqWcmUndoUndoConfig
 */
class ComDayCqWcmUndoUndoConfigParameterData
{
    /**
     * @DTA\Data(subset="query", field="apply", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $apply = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.steps", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_wcm_undo_steps = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.persistence.mode", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $cq_wcm_undo_persistence_mode = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.path", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_wcm_undo_path = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.persistence", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_wcm_undo_persistence = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.enabled", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $cq_wcm_undo_enabled = null;

    /**
     * @DTA\Data(subset="query", field="delete", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $delete = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.validity", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $cq_wcm_undo_validity = null;

    /**
     * @DTA\Data(subset="query", field="propertylist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     */
    public ?array $propertylist = null;

    /**
     * @DTA\Data(subset="query", field="post", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"bool"})
     */
    public ?bool $post = null;

    /**
     * @DTA\Data(subset="query", field="$location", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $location = null;

    /**
     * @DTA\Data(subset="query", field="action", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $action = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.markermode", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $cq_wcm_undo_markermode = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.blacklist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $cq_wcm_undo_blacklist = null;

    /**
     * @DTA\Data(subset="query", field="cq.wcm.undo.whitelist", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(subset="query", name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     */
    public ?array $cq_wcm_undo_whitelist = null;

}
