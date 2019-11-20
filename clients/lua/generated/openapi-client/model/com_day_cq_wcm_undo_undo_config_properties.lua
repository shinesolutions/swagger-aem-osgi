--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_wcm_undo_undo_config_properties class
local com_day_cq_wcm_undo_undo_config_properties = {}
local com_day_cq_wcm_undo_undo_config_properties_mt = {
	__name = "com_day_cq_wcm_undo_undo_config_properties";
	__index = com_day_cq_wcm_undo_undo_config_properties;
}

local function cast_com_day_cq_wcm_undo_undo_config_properties(t)
	return setmetatable(t, com_day_cq_wcm_undo_undo_config_properties_mt)
end

local function new_com_day_cq_wcm_undo_undo_config_properties(cq_wcm_undo_enabled, cq_wcm_undo_path, cq_wcm_undo_validity, cq_wcm_undo_steps, cq_wcm_undo_persistence, cq_wcm_undo_persistence_mode, cq_wcm_undo_markermode, cq_wcm_undo_whitelist, cq_wcm_undo_blacklist)
	return cast_com_day_cq_wcm_undo_undo_config_properties({
		["cq.wcm.undo.enabled"] = cq_wcm_undo_enabled;
		["cq.wcm.undo.path"] = cq_wcm_undo_path;
		["cq.wcm.undo.validity"] = cq_wcm_undo_validity;
		["cq.wcm.undo.steps"] = cq_wcm_undo_steps;
		["cq.wcm.undo.persistence"] = cq_wcm_undo_persistence;
		["cq.wcm.undo.persistence.mode"] = cq_wcm_undo_persistence_mode;
		["cq.wcm.undo.markermode"] = cq_wcm_undo_markermode;
		["cq.wcm.undo.whitelist"] = cq_wcm_undo_whitelist;
		["cq.wcm.undo.blacklist"] = cq_wcm_undo_blacklist;
	})
end

return {
	cast = cast_com_day_cq_wcm_undo_undo_config_properties;
	new = new_com_day_cq_wcm_undo_undo_config_properties;
}