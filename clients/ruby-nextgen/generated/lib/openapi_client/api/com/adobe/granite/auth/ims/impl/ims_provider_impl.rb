# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteAuthImsImplIMSProviderImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, oauth_provider_id: nil, oauth_provider_ims_authorization_url: nil, oauth_provider_ims_token_url: nil, oauth_provider_ims_profile_url: nil, oauth_provider_ims_extended_details_urls: nil, oauth_provider_ims_validate_token_url: nil, oauth_provider_ims_session_property: nil, oauth_provider_ims_service_token_client_id: nil, oauth_provider_ims_service_token_client_secret: nil, oauth_provider_ims_service_token: nil, ims_org_ref: nil, ims_group_mapping: nil, oauth_provider_ims_only_license_group: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl',
          type: OpenapiClient::Models::ComAdobeGraniteAuthImsImplIMSProviderImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'oauth.provider.id' => oauth_provider_id, 'oauth.provider.ims.authorization.url' => oauth_provider_ims_authorization_url, 'oauth.provider.ims.token.url' => oauth_provider_ims_token_url, 'oauth.provider.ims.profile.url' => oauth_provider_ims_profile_url, 'oauth.provider.ims.extended.details.urls' => oauth_provider_ims_extended_details_urls, 'oauth.provider.ims.validate.token.url' => oauth_provider_ims_validate_token_url, 'oauth.provider.ims.session.property' => oauth_provider_ims_session_property, 'oauth.provider.ims.service.token.client.id' => oauth_provider_ims_service_token_client_id, 'oauth.provider.ims.service.token.client.secret' => oauth_provider_ims_service_token_client_secret, 'oauth.provider.ims.service.token' => oauth_provider_ims_service_token, 'ims.org.ref' => ims_org_ref, 'ims.group.mapping' => ims_group_mapping, 'oauth.provider.ims.only.license.group' => oauth_provider_ims_only_license_group }
        )
      end
    end
  end
end
