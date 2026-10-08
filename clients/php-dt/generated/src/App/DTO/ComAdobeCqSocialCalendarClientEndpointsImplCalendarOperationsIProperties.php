<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqSocialCalendarClientEndpointsImplCalendarOperationsIProperties
{
    /**
     * @DTA\Data(field="MaxRetry", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $max_retry = null;

    /**
     * @DTA\Data(field="fieldWhitelist", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $field_whitelist = null;

    /**
     * @DTA\Data(field="attachmentTypeBlacklist", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $attachment_type_blacklist = null;

}
