# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthSamlSamlAuthenticationHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, path: nil, service_ranking: nil, idp_url: nil, idp_cert_alias: nil, idp_http_redirect: nil, service_provider_entity_id: nil, assertion_consumer_service_url: nil, sp_private_key_alias: nil, key_store_password: nil, default_redirect_url: nil, user_id_attribute: nil, use_encryption: nil, create_user: nil, user_intermediate_path: nil, add_group_memberships: nil, group_membership_attribute: nil, default_groups: nil, name_id_format: nil, synchronize_attributes: nil, handle_logout: nil, logout_url: nil, clock_tolerance: nil, digest_method: nil, signature_method: nil, identity_sync_type: nil, idp_identifier: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler',
          type: OpenapiClient::Models::ComAdobeGraniteAuthSamlSamlAuthenticationHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'path' => path, 'service.ranking' => service_ranking, 'idpUrl' => idp_url, 'idpCertAlias' => idp_cert_alias, 'idpHttpRedirect' => idp_http_redirect, 'serviceProviderEntityId' => service_provider_entity_id, 'assertionConsumerServiceURL' => assertion_consumer_service_url, 'spPrivateKeyAlias' => sp_private_key_alias, 'keyStorePassword' => key_store_password, 'defaultRedirectUrl' => default_redirect_url, 'userIDAttribute' => user_id_attribute, 'useEncryption' => use_encryption, 'createUser' => create_user, 'userIntermediatePath' => user_intermediate_path, 'addGroupMemberships' => add_group_memberships, 'groupMembershipAttribute' => group_membership_attribute, 'defaultGroups' => default_groups, 'nameIdFormat' => name_id_format, 'synchronizeAttributes' => synchronize_attributes, 'handleLogout' => handle_logout, 'logoutUrl' => logout_url, 'clockTolerance' => clock_tolerance, 'digestMethod' => digest_method, 'signatureMethod' => signature_method, 'identitySyncType' => identity_sync_type, 'idpIdentifier' => idp_identifier }
        )
      end
    end
  end
end
