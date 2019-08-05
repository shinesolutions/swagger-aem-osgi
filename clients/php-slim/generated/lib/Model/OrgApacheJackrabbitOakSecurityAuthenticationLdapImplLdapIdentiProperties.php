<?php
/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */
namespace OpenAPIServer\Model;

/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */
class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $providerName */
    private $providerName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $hostName */
    private $hostName;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $hostPort */
    private $hostPort;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $hostSsl */
    private $hostSsl;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $hostTls */
    private $hostTls;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $hostNoCertCheck */
    private $hostNoCertCheck;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $bindDn */
    private $bindDn;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $bindPassword */
    private $bindPassword;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $searchTimeout */
    private $searchTimeout;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $adminPoolMaxActive */
    private $adminPoolMaxActive;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $adminPoolLookupOnValidate */
    private $adminPoolLookupOnValidate;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyInteger $userPoolMaxActive */
    private $userPoolMaxActive;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $userPoolLookupOnValidate */
    private $userPoolLookupOnValidate;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $userBaseDN */
    private $userBaseDN;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $userObjectclass */
    private $userObjectclass;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $userIdAttribute */
    private $userIdAttribute;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $userExtraFilter */
    private $userExtraFilter;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $userMakeDnPath */
    private $userMakeDnPath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $groupBaseDN */
    private $groupBaseDN;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $groupObjectclass */
    private $groupObjectclass;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $groupNameAttribute */
    private $groupNameAttribute;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $groupExtraFilter */
    private $groupExtraFilter;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $groupMakeDnPath */
    private $groupMakeDnPath;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyString $groupMemberAttribute */
    private $groupMemberAttribute;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyBoolean $useUidForExtId */
    private $useUidForExtId;

    /** @var \OpenAPIServer\Model\ConfigNodePropertyArray $customattributes */
    private $customattributes;

}
