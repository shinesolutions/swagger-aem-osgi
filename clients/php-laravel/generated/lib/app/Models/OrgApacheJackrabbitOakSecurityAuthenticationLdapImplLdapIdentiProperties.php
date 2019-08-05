<?php
/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */
namespace app\Models;

/**
 * OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties
 */
class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiProperties {

    /** @var \app\Models\ConfigNodePropertyString $provider_name */
    private $provider_name;

    /** @var \app\Models\ConfigNodePropertyString $host_name */
    private $host_name;

    /** @var \app\Models\ConfigNodePropertyInteger $host_port */
    private $host_port;

    /** @var \app\Models\ConfigNodePropertyBoolean $host_ssl */
    private $host_ssl;

    /** @var \app\Models\ConfigNodePropertyBoolean $host_tls */
    private $host_tls;

    /** @var \app\Models\ConfigNodePropertyBoolean $host_no_cert_check */
    private $host_no_cert_check;

    /** @var \app\Models\ConfigNodePropertyString $bind_dn */
    private $bind_dn;

    /** @var \app\Models\ConfigNodePropertyString $bind_password */
    private $bind_password;

    /** @var \app\Models\ConfigNodePropertyString $search_timeout */
    private $search_timeout;

    /** @var \app\Models\ConfigNodePropertyInteger $admin_pool_max_active */
    private $admin_pool_max_active;

    /** @var \app\Models\ConfigNodePropertyBoolean $admin_pool_lookup_on_validate */
    private $admin_pool_lookup_on_validate;

    /** @var \app\Models\ConfigNodePropertyInteger $user_pool_max_active */
    private $user_pool_max_active;

    /** @var \app\Models\ConfigNodePropertyBoolean $user_pool_lookup_on_validate */
    private $user_pool_lookup_on_validate;

    /** @var \app\Models\ConfigNodePropertyString $user_base_dn */
    private $user_base_dn;

    /** @var \app\Models\ConfigNodePropertyArray $user_objectclass */
    private $user_objectclass;

    /** @var \app\Models\ConfigNodePropertyString $user_id_attribute */
    private $user_id_attribute;

    /** @var \app\Models\ConfigNodePropertyString $user_extra_filter */
    private $user_extra_filter;

    /** @var \app\Models\ConfigNodePropertyBoolean $user_make_dn_path */
    private $user_make_dn_path;

    /** @var \app\Models\ConfigNodePropertyString $group_base_dn */
    private $group_base_dn;

    /** @var \app\Models\ConfigNodePropertyArray $group_objectclass */
    private $group_objectclass;

    /** @var \app\Models\ConfigNodePropertyString $group_name_attribute */
    private $group_name_attribute;

    /** @var \app\Models\ConfigNodePropertyString $group_extra_filter */
    private $group_extra_filter;

    /** @var \app\Models\ConfigNodePropertyBoolean $group_make_dn_path */
    private $group_make_dn_path;

    /** @var \app\Models\ConfigNodePropertyString $group_member_attribute */
    private $group_member_attribute;

    /** @var \app\Models\ConfigNodePropertyBoolean $use_uid_for_ext_id */
    private $use_uid_for_ext_id;

    /** @var \app\Models\ConfigNodePropertyArray $customattributes */
    private $customattributes;

}
