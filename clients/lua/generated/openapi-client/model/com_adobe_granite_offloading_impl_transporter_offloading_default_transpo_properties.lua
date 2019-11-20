--[[
  Adobe Experience Manager OSGI config (AEM) API
 
  Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 
  OpenAPI spec version: 1.0.0-pre.0
  Contact: opensource@shinesolutions.com
  Generated by: https://openapi-generator.tech
]]

-- com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties class
local com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties = {}
local com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_mt = {
	__name = "com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties";
	__index = com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties;
}

local function cast_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties(t)
	return setmetatable(t, com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties_mt)
end

local function new_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties(default_transport_agent_to_worker_prefix, default_transport_agent_to_master_prefix, default_transport_input_package, default_transport_output_package, default_transport_replication_synchronous, default_transport_contentpackage, offloading_transporter_default_enabled)
	return cast_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties({
		["default.transport.agent-to-worker.prefix"] = default_transport_agent_to_worker_prefix;
		["default.transport.agent-to-master.prefix"] = default_transport_agent_to_master_prefix;
		["default.transport.input.package"] = default_transport_input_package;
		["default.transport.output.package"] = default_transport_output_package;
		["default.transport.replication.synchronous"] = default_transport_replication_synchronous;
		["default.transport.contentpackage"] = default_transport_contentpackage;
		["offloading.transporter.default.enabled"] = offloading_transporter_default_enabled;
	})
end

return {
	cast = cast_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties;
	new = new_com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_properties;
}