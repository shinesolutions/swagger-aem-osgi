--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_forms_common_servlet_temp_clean_up_task_properties class
local com_adobe_forms_common_servlet_temp_clean_up_task_properties = {}
local com_adobe_forms_common_servlet_temp_clean_up_task_properties_mt = {
	__name = "com_adobe_forms_common_servlet_temp_clean_up_task_properties";
	__index = com_adobe_forms_common_servlet_temp_clean_up_task_properties;
}

local function cast_com_adobe_forms_common_servlet_temp_clean_up_task_properties(t)
	return setmetatable(t, com_adobe_forms_common_servlet_temp_clean_up_task_properties_mt)
end

local function new_com_adobe_forms_common_servlet_temp_clean_up_task_properties(scheduler_expression, duration_for_temporary_storage, duration_for_anonymous_storage)
	return cast_com_adobe_forms_common_servlet_temp_clean_up_task_properties({
		["scheduler.expression"] = scheduler_expression;
		["Duration for Temporary Storage"] = duration_for_temporary_storage;
		["Duration for Anonymous Storage"] = duration_for_anonymous_storage;
	})
end

return {
	cast = cast_com_adobe_forms_common_servlet_temp_clean_up_task_properties;
	new = new_com_adobe_forms_common_servlet_temp_clean_up_task_properties;
}