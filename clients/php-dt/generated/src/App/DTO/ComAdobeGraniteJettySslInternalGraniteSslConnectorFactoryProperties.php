<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
{
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.port", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     */
    public ?\App\DTO\ConfigNodePropertyInteger $com_adobe_granite_jetty_ssl_port = null;

    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.keystore.user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_granite_jetty_ssl_keystore_user = null;

    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.keystore.password", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyString::class})
     */
    public ?\App\DTO\ConfigNodePropertyString $com_adobe_granite_jetty_ssl_keystore_password = null;

    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.ciphersuites.excluded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $com_adobe_granite_jetty_ssl_ciphersuites_excluded = null;

    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.ciphersuites.included", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     */
    public ?\App\DTO\ConfigNodePropertyArray $com_adobe_granite_jetty_ssl_ciphersuites_included = null;

    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.client.certificate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     */
    public ?\App\DTO\ConfigNodePropertyDropDown $com_adobe_granite_jetty_ssl_client_certificate = null;

}
