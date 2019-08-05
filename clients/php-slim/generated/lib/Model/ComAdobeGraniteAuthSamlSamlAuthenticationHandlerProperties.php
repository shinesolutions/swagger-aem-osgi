<?php
/**
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
 */
namespace OpenAPIServer\Model;

/**
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
 */
class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $path */
    private $path;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $serviceRanking */
    private $serviceRanking;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $idpUrl */
    private $idpUrl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $idpCertAlias */
    private $idpCertAlias;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $idpHttpRedirect */
    private $idpHttpRedirect;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $serviceProviderEntityId */
    private $serviceProviderEntityId;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $assertionConsumerServiceURL */
    private $assertionConsumerServiceURL;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $spPrivateKeyAlias */
    private $spPrivateKeyAlias;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $keyStorePassword */
    private $keyStorePassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $defaultRedirectUrl */
    private $defaultRedirectUrl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $userIDAttribute */
    private $userIDAttribute;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $useEncryption */
    private $useEncryption;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $createUser */
    private $createUser;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $userIntermediatePath */
    private $userIntermediatePath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $addGroupMemberships */
    private $addGroupMemberships;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $groupMembershipAttribute */
    private $groupMembershipAttribute;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $defaultGroups */
    private $defaultGroups;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $nameIdFormat */
    private $nameIdFormat;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $synchronizeAttributes */
    private $synchronizeAttributes;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $handleLogout */
    private $handleLogout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $logoutUrl */
    private $logoutUrl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $clockTolerance */
    private $clockTolerance;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $digestMethod */
    private $digestMethod;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $signatureMethod */
    private $signatureMethod;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyDropDown $identitySyncType */
    private $identitySyncType;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $idpIdentifier */
    private $idpIdentifier;

}
