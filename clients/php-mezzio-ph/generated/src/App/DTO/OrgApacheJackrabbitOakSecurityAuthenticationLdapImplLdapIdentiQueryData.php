<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Query parameters for orgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdenti
 */
class OrgApacheJackrabbitOakSecurityAuthenticationLdapImplLdapIdentiQueryData
{
    /**
     * @DTA\Data(field="host.ssl", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $host_ssl;

    /**
     * @DTA\Data(field="group.objectclass", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $group_objectclass;

    /**
     * @DTA\Data(field="group.makeDnPath", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $group_make_dn_path;

    /**
     * @DTA\Data(field="host.port", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $host_port;

    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $delete;

    /**
     * @DTA\Data(field="customattributes", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $customattributes;

    /**
     * @DTA\Data(field="bind.dn", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bind_dn;

    /**
     * @DTA\Data(field="user.makeDnPath", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $user_make_dn_path;

    /**
     * @DTA\Data(field="post", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $post;

    /**
     * @DTA\Data(field="adminPool.lookupOnValidate", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $admin_pool_lookup_on_validate;

    /**
     * @DTA\Data(field="action", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $action;

    /**
     * @DTA\Data(field="host.name", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $host_name;

    /**
     * @DTA\Data(field="group.extraFilter", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $group_extra_filter;

    /**
     * @DTA\Data(field="user.extraFilter", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $user_extra_filter;

    /**
     * @DTA\Data(field="user.objectclass", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"multi"})
     * @var string[]|null
     */
    public $user_objectclass;

    /**
     * @DTA\Data(field="bind.password", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $bind_password;

    /**
     * @DTA\Data(field="group.memberAttribute", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $group_member_attribute;

    /**
     * @DTA\Data(field="adminPool.maxActive", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $admin_pool_max_active;

    /**
     * @DTA\Data(field="apply", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $apply;

    /**
     * @DTA\Data(field="userPool.maxActive", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"int"})
     * @var int|null
     */
    public $user_pool_max_active;

    /**
     * @DTA\Data(field="user.idAttribute", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $user_id_attribute;

    /**
     * @DTA\Data(field="userPool.lookupOnValidate", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $user_pool_lookup_on_validate;

    /**
     * @DTA\Data(field="propertylist", nullable=true)
     * @DTA\Strategy(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @DTA\Validator(name="QueryStringScalarArray", options={"type":"string", "format":"csv"})
     * @var string[]|null
     */
    public $propertylist;

    /**
     * @DTA\Data(field="useUidForExtId", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $use_uid_for_ext_id;

    /**
     * @DTA\Data(field="host.tls", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $host_tls;

    /**
     * @DTA\Data(field="user.baseDN", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $user_base_dn;

    /**
     * @DTA\Data(field="group.baseDN", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $group_base_dn;

    /**
     * @DTA\Data(field="$location", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $location;

    /**
     * @DTA\Data(field="provider.name", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $provider_name;

    /**
     * @DTA\Data(field="host.noCertCheck", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"bool"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"bool"})
     * @var bool|null
     */
    public $host_no_cert_check;

    /**
     * @DTA\Data(field="group.nameAttribute", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $group_name_attribute;

    /**
     * @DTA\Data(field="searchTimeout", nullable=true)
     * @DTA\Strategy(name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(name="QueryStringScalar", options={"type":"string"})
     * @var string|null
     */
    public $search_timeout;

}
