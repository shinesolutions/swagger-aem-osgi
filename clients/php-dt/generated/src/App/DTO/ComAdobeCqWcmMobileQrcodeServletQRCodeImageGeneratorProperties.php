<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
{
    /**
     * @DTA\Data(field="cq.wcm.qrcode.servlet.whitelist", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $cq_wcm_qrcode_servlet_whitelist = null;

}
