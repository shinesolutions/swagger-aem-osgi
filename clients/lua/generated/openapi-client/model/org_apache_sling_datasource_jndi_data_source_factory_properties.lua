--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- org_apache_sling_datasource_jndi_data_source_factory_properties class
local org_apache_sling_datasource_jndi_data_source_factory_properties = {}
local org_apache_sling_datasource_jndi_data_source_factory_properties_mt = {
	__name = "org_apache_sling_datasource_jndi_data_source_factory_properties";
	__index = org_apache_sling_datasource_jndi_data_source_factory_properties;
}

local function cast_org_apache_sling_datasource_jndi_data_source_factory_properties(t)
	return setmetatable(t, org_apache_sling_datasource_jndi_data_source_factory_properties_mt)
end

local function new_org_apache_sling_datasource_jndi_data_source_factory_properties(datasource_name, datasource_svc_prop_name, datasource_jndi_name, jndi_properties)
	return cast_org_apache_sling_datasource_jndi_data_source_factory_properties({
		["datasource.name"] = datasource_name;
		["datasource.svc.prop.name"] = datasource_svc_prop_name;
		["datasource.jndi.name"] = datasource_jndi_name;
		["jndi.properties"] = jndi_properties;
	})
end

return {
	cast = cast_org_apache_sling_datasource_jndi_data_source_factory_properties;
	new = new_org_apache_sling_datasource_jndi_data_source_factory_properties;
}
