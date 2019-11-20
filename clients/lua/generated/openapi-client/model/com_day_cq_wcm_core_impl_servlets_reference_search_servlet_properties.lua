--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties class
local com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties = {}
local com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_mt = {
	__name = "com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties";
	__index = com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties;
}

local function cast_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties(t)
	return setmetatable(t, com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties_mt)
end

local function new_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties(referencesearchservlet_max_references_per_page, referencesearchservlet_max_pages)
	return cast_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties({
		["referencesearchservlet.maxReferencesPerPage"] = referencesearchservlet_max_references_per_page;
		["referencesearchservlet.maxPages"] = referencesearchservlet_max_pages;
	})
end

return {
	cast = cast_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties;
	new = new_com_day_cq_wcm_core_impl_servlets_reference_search_servlet_properties;
}