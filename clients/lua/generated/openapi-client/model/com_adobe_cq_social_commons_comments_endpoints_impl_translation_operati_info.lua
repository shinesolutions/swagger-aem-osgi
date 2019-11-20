--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info class
local com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info = {}
local com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info_mt = {
	__name = "com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info";
	__index = com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info;
}

local function cast_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info(t)
	return setmetatable(t, com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info_mt)
end

local function new_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info(pid, title, description, properties)
	return cast_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info({
		["pid"] = pid;
		["title"] = title;
		["description"] = description;
		["properties"] = properties;
	})
end

return {
	cast = cast_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info;
	new = new_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_info;
}