<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiInfo
{
    /**
     * @DTA\Data(field="pid", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $pid = null;

    /**
     * @DTA\Data(field="title", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $title = null;

    /**
     * @DTA\Data(field="description", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $description = null;

    /**
     * @DTA\Data(field="properties", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties::class})
     */
    public ?\App\DTO\ComAdobeCqSocialCommonsCommentsEndpointsImplTranslationOperatiProperties $properties = null;

}
