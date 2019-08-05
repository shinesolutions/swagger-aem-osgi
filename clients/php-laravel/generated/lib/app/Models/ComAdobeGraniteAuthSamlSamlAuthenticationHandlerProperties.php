<?php
/**
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
 */
namespace app\Models;

/**
 * ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties
 */
class ComAdobeGraniteAuthSamlSamlAuthenticationHandlerProperties {

    /** @var \app\Models\ConfigNodePropertyArray $path */
    private $path;

    /** @var \app\Models\ConfigNodePropertyInteger $service_ranking */
    private $service_ranking;

    /** @var \app\Models\ConfigNodePropertyString $idp_url */
    private $idp_url;

    /** @var \app\Models\ConfigNodePropertyString $idp_cert_alias */
    private $idp_cert_alias;

    /** @var \app\Models\ConfigNodePropertyBoolean $idp_http_redirect */
    private $idp_http_redirect;

    /** @var \app\Models\ConfigNodePropertyString $service_provider_entity_id */
    private $service_provider_entity_id;

    /** @var \app\Models\ConfigNodePropertyString $assertion_consumer_service_url */
    private $assertion_consumer_service_url;

    /** @var \app\Models\ConfigNodePropertyString $sp_private_key_alias */
    private $sp_private_key_alias;

    /** @var \app\Models\ConfigNodePropertyString $key_store_password */
    private $key_store_password;

    /** @var \app\Models\ConfigNodePropertyString $default_redirect_url */
    private $default_redirect_url;

    /** @var \app\Models\ConfigNodePropertyString $user_id_attribute */
    private $user_id_attribute;

    /** @var \app\Models\ConfigNodePropertyBoolean $use_encryption */
    private $use_encryption;

    /** @var \app\Models\ConfigNodePropertyBoolean $create_user */
    private $create_user;

    /** @var \app\Models\ConfigNodePropertyString $user_intermediate_path */
    private $user_intermediate_path;

    /** @var \app\Models\ConfigNodePropertyBoolean $add_group_memberships */
    private $add_group_memberships;

    /** @var \app\Models\ConfigNodePropertyString $group_membership_attribute */
    private $group_membership_attribute;

    /** @var \app\Models\ConfigNodePropertyArray $default_groups */
    private $default_groups;

    /** @var \app\Models\ConfigNodePropertyString $name_id_format */
    private $name_id_format;

    /** @var \app\Models\ConfigNodePropertyArray $synchronize_attributes */
    private $synchronize_attributes;

    /** @var \app\Models\ConfigNodePropertyBoolean $handle_logout */
    private $handle_logout;

    /** @var \app\Models\ConfigNodePropertyString $logout_url */
    private $logout_url;

    /** @var \app\Models\ConfigNodePropertyInteger $clock_tolerance */
    private $clock_tolerance;

    /** @var \app\Models\ConfigNodePropertyString $digest_method */
    private $digest_method;

    /** @var \app\Models\ConfigNodePropertyString $signature_method */
    private $signature_method;

    /** @var \app\Models\ConfigNodePropertyDropDown $identity_sync_type */
    private $identity_sync_type;

    /** @var \app\Models\ConfigNodePropertyString $idp_identifier */
    private $idp_identifier;

}
