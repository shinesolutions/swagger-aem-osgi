--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_granite_auth_oauth_impl_granite_provider_properties class
local com_adobe_granite_auth_oauth_impl_granite_provider_properties = {}
local com_adobe_granite_auth_oauth_impl_granite_provider_properties_mt = {
	__name = "com_adobe_granite_auth_oauth_impl_granite_provider_properties";
	__index = com_adobe_granite_auth_oauth_impl_granite_provider_properties;
}

local function cast_com_adobe_granite_auth_oauth_impl_granite_provider_properties(t)
	return setmetatable(t, com_adobe_granite_auth_oauth_impl_granite_provider_properties_mt)
end

local function new_com_adobe_granite_auth_oauth_impl_granite_provider_properties(oauth_provider_id, oauth_provider_granite_authorization_url, oauth_provider_granite_token_url, oauth_provider_granite_profile_url, oauth_provider_granite_extended_details_urls)
	return cast_com_adobe_granite_auth_oauth_impl_granite_provider_properties({
		["oauth.provider.id"] = oauth_provider_id;
		["oauth.provider.granite.authorization.url"] = oauth_provider_granite_authorization_url;
		["oauth.provider.granite.token.url"] = oauth_provider_granite_token_url;
		["oauth.provider.granite.profile.url"] = oauth_provider_granite_profile_url;
		["oauth.provider.granite.extended.details.urls"] = oauth_provider_granite_extended_details_urls;
	})
end

return {
	cast = cast_com_adobe_granite_auth_oauth_impl_granite_provider_properties;
	new = new_com_adobe_granite_auth_oauth_impl_granite_provider_properties;
}