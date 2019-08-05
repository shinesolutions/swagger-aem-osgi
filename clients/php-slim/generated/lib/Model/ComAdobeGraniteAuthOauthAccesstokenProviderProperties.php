<?php
/**
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeGraniteAuthOauthAccesstokenProviderProperties
 */
class ComAdobeGraniteAuthOauthAccesstokenProviderProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $name */
    private $name;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authTokenProviderTitle */
    private $authTokenProviderTitle;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $authTokenProviderDefaultClaims */
    private $authTokenProviderDefaultClaims;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authTokenProviderEndpoint */
    private $authTokenProviderEndpoint;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authAccessTokenRequest */
    private $authAccessTokenRequest;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authTokenProviderKeypairAlias */
    private $authTokenProviderKeypairAlias;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $authTokenProviderConnTimeout */
    private $authTokenProviderConnTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $authTokenProviderSoTimeout */
    private $authTokenProviderSoTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authTokenProviderClientId */
    private $authTokenProviderClientId;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authTokenProviderScope */
    private $authTokenProviderScope;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $authTokenProviderReuseAccessToken */
    private $authTokenProviderReuseAccessToken;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $authTokenProviderRelaxedSsl */
    private $authTokenProviderRelaxedSsl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $tokenRequestCustomizerType */
    private $tokenRequestCustomizerType;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $authTokenValidatorType */
    private $authTokenValidatorType;

}
