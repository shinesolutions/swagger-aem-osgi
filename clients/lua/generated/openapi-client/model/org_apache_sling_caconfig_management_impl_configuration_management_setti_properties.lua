--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- org_apache_sling_caconfig_management_impl_configuration_management_setti_properties class
local org_apache_sling_caconfig_management_impl_configuration_management_setti_properties = {}
local org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_mt = {
	__name = "org_apache_sling_caconfig_management_impl_configuration_management_setti_properties";
	__index = org_apache_sling_caconfig_management_impl_configuration_management_setti_properties;
}

local function cast_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties(t)
	return setmetatable(t, org_apache_sling_caconfig_management_impl_configuration_management_setti_properties_mt)
end

local function new_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties(ignore_property_name_regex, config_collection_properties_resource_names)
	return cast_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties({
		["ignorePropertyNameRegex"] = ignore_property_name_regex;
		["configCollectionPropertiesResourceNames"] = config_collection_properties_resource_names;
	})
end

return {
	cast = cast_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties;
	new = new_org_apache_sling_caconfig_management_impl_configuration_management_setti_properties;
}