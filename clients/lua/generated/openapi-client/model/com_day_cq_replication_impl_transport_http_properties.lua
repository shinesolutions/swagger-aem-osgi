--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_replication_impl_transport_http_properties class
local com_day_cq_replication_impl_transport_http_properties = {}
local com_day_cq_replication_impl_transport_http_properties_mt = {
	__name = "com_day_cq_replication_impl_transport_http_properties";
	__index = com_day_cq_replication_impl_transport_http_properties;
}

local function cast_com_day_cq_replication_impl_transport_http_properties(t)
	return setmetatable(t, com_day_cq_replication_impl_transport_http_properties_mt)
end

local function new_com_day_cq_replication_impl_transport_http_properties(disabled_cipher_suites, enabled_cipher_suites)
	return cast_com_day_cq_replication_impl_transport_http_properties({
		["disabled.cipher.suites"] = disabled_cipher_suites;
		["enabled.cipher.suites"] = enabled_cipher_suites;
	})
end

return {
	cast = cast_com_day_cq_replication_impl_transport_http_properties;
	new = new_com_day_cq_replication_impl_transport_http_properties;
}