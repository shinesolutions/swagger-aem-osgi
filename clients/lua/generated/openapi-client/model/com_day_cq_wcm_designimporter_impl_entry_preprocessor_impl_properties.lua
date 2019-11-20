--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties class
local com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties = {}
local com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties_mt = {
	__name = "com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties";
	__index = com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties;
}

local function cast_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties(t)
	return setmetatable(t, com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties_mt)
end

local function new_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties(search_pattern, replace_pattern)
	return cast_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties({
		["search.pattern"] = search_pattern;
		["replace.pattern"] = replace_pattern;
	})
end

return {
	cast = cast_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties;
	new = new_com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_properties;
}