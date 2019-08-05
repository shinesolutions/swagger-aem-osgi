<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeGraniteDistributionCoreImplCryptoDistributionTransportSeProperties
{
    /**
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $name;
    /**
     * @DTA\Data(field="username", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $username;
    /**
     * @DTA\Data(field="encryptedPassword", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $encrypted_password;
}
