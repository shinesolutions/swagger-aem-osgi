<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteAuthImsImplIMSAccessTokenRequestCustomizerImplProperties
{
    /**
     * @DTA\Data(field="auth.ims.client.secret", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $auth_ims_client_secret = null;

    /**
     * @DTA\Data(field="customizer.type", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $customizer_type = null;

}
