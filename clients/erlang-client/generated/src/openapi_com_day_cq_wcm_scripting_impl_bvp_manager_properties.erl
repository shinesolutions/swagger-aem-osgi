-module(openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties/0]).

-type openapi_com_day_cq_wcm_scripting_impl_bvp_manager_properties() ::
    #{ 'com_day_cq_wcm_scripting_bvp_script_engines' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'com_day_cq_wcm_scripting_bvp_script_engines' := ComDayCqWcmScriptingBvpScriptEngines
        }) ->
    #{ 'com.day.cq.wcm.scripting.bvp.script.engines' => ComDayCqWcmScriptingBvpScriptEngines
     }.
