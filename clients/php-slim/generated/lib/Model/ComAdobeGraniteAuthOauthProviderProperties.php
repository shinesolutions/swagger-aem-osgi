<?php
/**
 * ComAdobeGraniteAuthOauthProviderProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeGraniteAuthOauthProviderProperties
 */
class ComAdobeGraniteAuthOauthProviderProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $oauthConfigId */
    private $oauthConfigId;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $oauthClientId */
    private $oauthClientId;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $oauthClientSecret */
    private $oauthClientSecret;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $oauthScope */
    private $oauthScope;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $oauthConfigProviderId */
    private $oauthConfigProviderId;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthCreateUsers */
    private $oauthCreateUsers;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $oauthUseridProperty */
    private $oauthUseridProperty;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $forceStrictUsernameMatching */
    private $forceStrictUsernameMatching;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthEncodeUserids */
    private $oauthEncodeUserids;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthHashUserids */
    private $oauthHashUserids;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $oauthCallBackUrl */
    private $oauthCallBackUrl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthAccessTokenPersist */
    private $oauthAccessTokenPersist;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthAccessTokenPersistCookie */
    private $oauthAccessTokenPersistCookie;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthCsrfStateProtection */
    private $oauthCsrfStateProtection;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthRedirectRequestParams */
    private $oauthRedirectRequestParams;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $oauthConfigSiblingsAllow */
    private $oauthConfigSiblingsAllow;

}
