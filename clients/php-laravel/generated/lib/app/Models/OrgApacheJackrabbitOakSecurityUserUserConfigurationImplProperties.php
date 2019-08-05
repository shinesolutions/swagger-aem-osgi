<?php
/**
 * OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
 */
namespace app\Models;

/**
 * OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
 */
class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties {

    /** @var \app\Models\ConfigNodePropertyString $users_path */
    private $users_path;

    /** @var \app\Models\ConfigNodePropertyString $groups_path */
    private $groups_path;

    /** @var \app\Models\ConfigNodePropertyString $system_relative_path */
    private $system_relative_path;

    /** @var \app\Models\ConfigNodePropertyInteger $default_depth */
    private $default_depth;

    /** @var \app\Models\ConfigNodePropertyDropDown $import_behavior */
    private $import_behavior;

    /** @var \app\Models\ConfigNodePropertyString $password_hash_algorithm */
    private $password_hash_algorithm;

    /** @var \app\Models\ConfigNodePropertyInteger $password_hash_iterations */
    private $password_hash_iterations;

    /** @var \app\Models\ConfigNodePropertyInteger $password_salt_size */
    private $password_salt_size;

    /** @var \app\Models\ConfigNodePropertyBoolean $omit_admin_pw */
    private $omit_admin_pw;

    /** @var \app\Models\ConfigNodePropertyBoolean $support_auto_save */
    private $support_auto_save;

    /** @var \app\Models\ConfigNodePropertyInteger $password_max_age */
    private $password_max_age;

    /** @var \app\Models\ConfigNodePropertyBoolean $initial_password_change */
    private $initial_password_change;

    /** @var \app\Models\ConfigNodePropertyInteger $password_history_size */
    private $password_history_size;

    /** @var \app\Models\ConfigNodePropertyBoolean $password_expiry_for_admin */
    private $password_expiry_for_admin;

    /** @var \app\Models\ConfigNodePropertyInteger $cache_expiration */
    private $cache_expiration;

    /** @var \app\Models\ConfigNodePropertyBoolean $enable_rfc7613_usercase_mapped_profile */
    private $enable_rfc7613_usercase_mapped_profile;

}
