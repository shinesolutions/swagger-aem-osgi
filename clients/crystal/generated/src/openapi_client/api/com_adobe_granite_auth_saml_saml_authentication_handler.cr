require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthSamlSamlAuthenticationHandler
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, path : Array(String)? = nil, service_ranking : Int32? = nil, idp_url : String? = nil, idp_cert_alias : String? = nil, idp_http_redirect : Bool? = nil, service_provider_entity_id : String? = nil, assertion_consumer_service_url : String? = nil, sp_private_key_alias : String? = nil, key_store_password : String? = nil, default_redirect_url : String? = nil, user_id_attribute : String? = nil, use_encryption : Bool? = nil, create_user : Bool? = nil, user_intermediate_path : String? = nil, add_group_memberships : Bool? = nil, group_membership_attribute : String? = nil, default_groups : Array(String)? = nil, name_id_format : String? = nil, synchronize_attributes : Array(String)? = nil, handle_logout : Bool? = nil, logout_url : String? = nil, clock_tolerance : Int32? = nil, digest_method : String? = nil, signature_method : String? = nil, identity_sync_type : String? = nil, idp_identifier : String? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "path" => path, "service.ranking" => service_ranking, "idpUrl" => idp_url, "idpCertAlias" => idp_cert_alias, "idpHttpRedirect" => idp_http_redirect, "serviceProviderEntityId" => service_provider_entity_id, "assertionConsumerServiceURL" => assertion_consumer_service_url, "spPrivateKeyAlias" => sp_private_key_alias, "keyStorePassword" => key_store_password, "defaultRedirectUrl" => default_redirect_url, "userIDAttribute" => user_id_attribute, "useEncryption" => use_encryption, "createUser" => create_user, "userIntermediatePath" => user_intermediate_path, "addGroupMemberships" => add_group_memberships, "groupMembershipAttribute" => group_membership_attribute, "defaultGroups" => default_groups, "nameIdFormat" => name_id_format, "synchronizeAttributes" => synchronize_attributes, "handleLogout" => handle_logout, "logoutUrl" => logout_url, "clockTolerance" => clock_tolerance, "digestMethod" => digest_method, "signatureMethod" => signature_method, "identitySyncType" => identity_sync_type, "idpIdentifier" => idp_identifier },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
