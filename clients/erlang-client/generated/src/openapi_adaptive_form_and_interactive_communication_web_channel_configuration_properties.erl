-module(openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties).

-export([encode/1]).

-export_type([openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties/0]).

-type openapi_adaptive_form_and_interactive_communication_web_channel_configuration_properties() ::
    #{ 'showPlaceholder' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'maximumCacheEntries' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'af_scripting_compatversion' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down(),
       'makeFileNameUnique' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'generatingCompliantData' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'showPlaceholder' := ShowPlaceholder,
          'maximumCacheEntries' := MaximumCacheEntries,
          'af_scripting_compatversion' := AfScriptingCompatversion,
          'makeFileNameUnique' := MakeFileNameUnique,
          'generatingCompliantData' := GeneratingCompliantData
        }) ->
    #{ 'showPlaceholder' => ShowPlaceholder,
       'maximumCacheEntries' => MaximumCacheEntries,
       'af.scripting.compatversion' => AfScriptingCompatversion,
       'makeFileNameUnique' => MakeFileNameUnique,
       'generatingCompliantData' => GeneratingCompliantData
     }.
