--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties class
local org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties = {}
local org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties_mt = {
	__name = "org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties";
	__index = org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties;
}

local function cast_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties(t)
	return setmetatable(t, org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties_mt)
end

local function new_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties(service_ranking, user_mapping)
	return cast_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties({
		["service.ranking"] = service_ranking;
		["user.mapping"] = user_mapping;
	})
end

return {
	cast = cast_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties;
	new = new_org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_properties;
}