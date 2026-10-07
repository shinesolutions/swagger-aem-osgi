<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeCqScreensDeviceImplDeviceServiceProperties
{
    /**
     * @DTA\Data(field="com.adobe.aem.screens.player.pingfrequency", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_aem_screens_player_pingfrequency = null;

    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.specialchars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_aem_screens_device_pasword_specialchars = null;

    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minlowercasechars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_aem_screens_device_pasword_minlowercasechars = null;

    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minuppercasechars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_aem_screens_device_pasword_minuppercasechars = null;

    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minnumberchars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_aem_screens_device_pasword_minnumberchars = null;

    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minspecialchars", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_aem_screens_device_pasword_minspecialchars = null;

    /**
     * @DTA\Data(field="com.adobe.aem.screens.device.pasword.minlength", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_aem_screens_device_pasword_minlength = null;

}
