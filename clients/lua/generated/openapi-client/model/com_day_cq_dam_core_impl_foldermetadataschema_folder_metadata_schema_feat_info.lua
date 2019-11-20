--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info class
local com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info = {}
local com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info_mt = {
	__name = "com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info";
	__index = com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info;
}

local function cast_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info(t)
	return setmetatable(t, com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info_mt)
end

local function new_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info(pid, title, description, properties)
	return cast_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info({
		["pid"] = pid;
		["title"] = title;
		["description"] = description;
		["properties"] = properties;
	})
end

return {
	cast = cast_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info;
	new = new_com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_info;
}