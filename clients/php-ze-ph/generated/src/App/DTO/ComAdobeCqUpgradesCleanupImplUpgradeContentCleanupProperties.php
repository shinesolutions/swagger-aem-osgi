<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqUpgradesCleanupImplUpgradeContentCleanupProperties
{
    /**
     * @DTA\Data(field="delete.path.regexps", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $delete_path_regexps;
    /**
     * @DTA\Data(field="delete.sql2.query", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $delete_sql2_query;
}
