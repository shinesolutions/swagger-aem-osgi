<?php

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties
{
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.port", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyInteger::class})
     * @var \App\DTO\ConfigNodePropertyInteger
     */
    public $com_adobe_granite_jetty_ssl_port;
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.keystore.user", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_granite_jetty_ssl_keystore_user;
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.keystore.password", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyString::class})
     * @var \App\DTO\ConfigNodePropertyString
     */
    public $com_adobe_granite_jetty_ssl_keystore_password;
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.ciphersuites.excluded", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $com_adobe_granite_jetty_ssl_ciphersuites_excluded;
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.ciphersuites.included", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyArray::class})
     * @var \App\DTO\ConfigNodePropertyArray
     */
    public $com_adobe_granite_jetty_ssl_ciphersuites_included;
    /**
     * @DTA\Data(field="com.adobe.granite.jetty.ssl.client.certificate", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\ConfigNodePropertyDropDown::class})
     * @var \App\DTO\ConfigNodePropertyDropDown
     */
    public $com_adobe_granite_jetty_ssl_client_certificate;
}
