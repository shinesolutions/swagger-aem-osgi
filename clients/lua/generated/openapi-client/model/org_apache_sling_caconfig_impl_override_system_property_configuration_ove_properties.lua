--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties class
local org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties = {}
local org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_mt = {
	__name = "org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties";
	__index = org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties;
}

local function cast_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties(t)
	return setmetatable(t, org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties_mt)
end

local function new_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties(enabled, service_ranking)
	return cast_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties({
		["enabled"] = enabled;
		["service.ranking"] = service_ranking;
	})
end

return {
	cast = cast_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties;
	new = new_org_apache_sling_caconfig_impl_override_system_property_configuration_ove_properties;
}