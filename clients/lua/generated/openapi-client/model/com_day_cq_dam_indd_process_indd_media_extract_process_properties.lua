--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_dam_indd_process_indd_media_extract_process_properties class
local com_day_cq_dam_indd_process_indd_media_extract_process_properties = {}
local com_day_cq_dam_indd_process_indd_media_extract_process_properties_mt = {
	__name = "com_day_cq_dam_indd_process_indd_media_extract_process_properties";
	__index = com_day_cq_dam_indd_process_indd_media_extract_process_properties;
}

local function cast_com_day_cq_dam_indd_process_indd_media_extract_process_properties(t)
	return setmetatable(t, com_day_cq_dam_indd_process_indd_media_extract_process_properties_mt)
end

local function new_com_day_cq_dam_indd_process_indd_media_extract_process_properties(process_label, cq_dam_indd_pages_regex, ids_job_decoupled, ids_job_workflow_model)
	return cast_com_day_cq_dam_indd_process_indd_media_extract_process_properties({
		["process.label"] = process_label;
		["cq.dam.indd.pages.regex"] = cq_dam_indd_pages_regex;
		["ids.job.decoupled"] = ids_job_decoupled;
		["ids.job.workflow.model"] = ids_job_workflow_model;
	})
end

return {
	cast = cast_com_day_cq_dam_indd_process_indd_media_extract_process_properties;
	new = new_com_day_cq_dam_indd_process_indd_media_extract_process_properties;
}