<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
{
    /**
     * @DTA\Data(field="cq.wcm.qrcode.servlet.whitelist", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $cq_wcm_qrcode_servlet_whitelist;
}
