<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqSocialForumDispatcherImplFlushOperationsProperties
{
    /**
     * @DTA\Data(field="extension.order", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $extension_order;
    /**
     * @DTA\Data(field="flush.forumontopic", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyBoolean::class})
     * @var \App\DTO\ConfigNodePropertyBoolean
     */
    public $flush_forumontopic;
}
