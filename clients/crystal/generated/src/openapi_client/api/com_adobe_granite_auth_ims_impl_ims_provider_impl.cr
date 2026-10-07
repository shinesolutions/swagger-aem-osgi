require "json"

module OpenAPIClient
  module Api
  class ComAdobeGraniteAuthImsImplIMSProviderImpl
    def initialize(@conn : Connection); end

    # 
    def create(*, post : Bool? = nil, apply : Bool? = nil, delete : Bool? = nil, action : String? = nil, location : String? = nil, propertylist : Array(String)? = nil, oauth_provider_id : String? = nil, oauth_provider_ims_authorization_url : String? = nil, oauth_provider_ims_token_url : String? = nil, oauth_provider_ims_profile_url : String? = nil, oauth_provider_ims_extended_details_urls : Array(String)? = nil, oauth_provider_ims_validate_token_url : String? = nil, oauth_provider_ims_session_property : String? = nil, oauth_provider_ims_service_token_client_id : String? = nil, oauth_provider_ims_service_token_client_secret : String? = nil, oauth_provider_ims_service_token : String? = nil, ims_org_ref : String? = nil, ims_group_mapping : Array(String)? = nil, oauth_provider_ims_only_license_group : Bool? = nil) : Response(OpenAPIClient::ComAdobeGraniteAuthImsImplIMSProviderImplInfo)
      @conn.request(OpenAPIClient::ComAdobeGraniteAuthImsImplIMSProviderImplInfo,
        method: :POST,
        path: "/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl",
        query: { "post" => post, "apply" => apply, "delete" => delete, "action" => action, "$location" => location, "propertylist" => propertylist.try(&.map(&.to_s).join(",")), "oauth.provider.id" => oauth_provider_id, "oauth.provider.ims.authorization.url" => oauth_provider_ims_authorization_url, "oauth.provider.ims.token.url" => oauth_provider_ims_token_url, "oauth.provider.ims.profile.url" => oauth_provider_ims_profile_url, "oauth.provider.ims.extended.details.urls" => oauth_provider_ims_extended_details_urls, "oauth.provider.ims.validate.token.url" => oauth_provider_ims_validate_token_url, "oauth.provider.ims.session.property" => oauth_provider_ims_session_property, "oauth.provider.ims.service.token.client.id" => oauth_provider_ims_service_token_client_id, "oauth.provider.ims.service.token.client.secret" => oauth_provider_ims_service_token_client_secret, "oauth.provider.ims.service.token" => oauth_provider_ims_service_token, "ims.org.ref" => ims_org_ref, "ims.group.mapping" => ims_group_mapping, "oauth.provider.ims.only.license.group" => oauth_provider_ims_only_license_group },
        accept: %w[application/json text/plain],
        auth: %w[aemAuth])
    end
  end
  end

end
