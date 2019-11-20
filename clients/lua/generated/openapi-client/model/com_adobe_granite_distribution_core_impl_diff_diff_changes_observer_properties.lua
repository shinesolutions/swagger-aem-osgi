--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties class
local com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties = {}
local com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_mt = {
	__name = "com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties";
	__index = com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties;
}

local function cast_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties(t)
	return setmetatable(t, com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties_mt)
end

local function new_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties(enabled, agent_name, diff_path, observed_path, service_name, property_names, distribution_delay, service_user_target)
	return cast_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties({
		["enabled"] = enabled;
		["agentName"] = agent_name;
		["diffPath"] = diff_path;
		["observedPath"] = observed_path;
		["serviceName"] = service_name;
		["propertyNames"] = property_names;
		["distributionDelay"] = distribution_delay;
		["serviceUser.target"] = service_user_target;
	})
end

return {
	cast = cast_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties;
	new = new_com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_properties;
}