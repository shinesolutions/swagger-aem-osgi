<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
{
    /**
     * @DTA\Data(field="ranking", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $ranking = null;

}
