<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeCqScreensDeviceImplDeviceServiceProperties
{
    /**
     * @DTA\Data(field="com.adobe.aem.screens.player.pingfrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_aem_screens_player_pingfrequency;
    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.specialchars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_aem_screens_device_pasword_specialchars;
    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minlowercasechars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_aem_screens_device_pasword_minlowercasechars;
    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minuppercasechars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_aem_screens_device_pasword_minuppercasechars;
    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minnumberchars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_aem_screens_device_pasword_minnumberchars;
    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minspecialchars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_aem_screens_device_pasword_minspecialchars;
    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minlength", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_aem_screens_device_pasword_minlength;
}
