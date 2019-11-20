--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties class
local com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties = {}
local com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_mt = {
	__name = "com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties";
	__index = com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties;
}

local function cast_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties(t)
	return setmetatable(t, com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties_mt)
end

local function new_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties(device_info_transformer_enabled, device_info_transformer_css_style)
	return cast_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties({
		["device.info.transformer.enabled"] = device_info_transformer_enabled;
		["device.info.transformer.css.style"] = device_info_transformer_css_style;
	})
end

return {
	cast = cast_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties;
	new = new_com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_properties;
}