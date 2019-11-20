--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties class
local com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties = {}
local com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties_mt = {
	__name = "com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties";
	__index = com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties;
}

local function cast_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties(t)
	return setmetatable(t, com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties_mt)
end

local function new_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties(hc_tags)
	return cast_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties({
		["hc.tags"] = hc_tags;
	})
end

return {
	cast = cast_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties;
	new = new_com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_properties;
}