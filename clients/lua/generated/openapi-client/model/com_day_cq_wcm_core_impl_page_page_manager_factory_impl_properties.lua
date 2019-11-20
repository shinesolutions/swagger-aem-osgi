--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties class
local com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties = {}
local com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_mt = {
	__name = "com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties";
	__index = com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties;
}

local function cast_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties(t)
	return setmetatable(t, com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties_mt)
end

local function new_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties(illegal_char_mapping, page_sub_tree_activation_check)
	return cast_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties({
		["illegalCharMapping"] = illegal_char_mapping;
		["pageSubTreeActivationCheck"] = page_sub_tree_activation_check;
	})
end

return {
	cast = cast_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties;
	new = new_com_day_cq_wcm_core_impl_page_page_manager_factory_impl_properties;
}