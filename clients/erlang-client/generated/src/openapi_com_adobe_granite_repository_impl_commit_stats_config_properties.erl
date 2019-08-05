-module(openapi_com_adobe_granite_repository_impl_commit_stats_config_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_repository_impl_commit_stats_config_properties/0]).

-type openapi_com_adobe_granite_repository_impl_commit_stats_config_properties() ::
    #{ 'enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'intervalSeconds' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'commitsPerIntervalThreshold' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxLocationLength' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'maxDetailsShown' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'minDetailsPercentage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'threadMatchers' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'maxGreedyDepth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'greedyStackMatchers' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'stackFilters' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'stackMatchers' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'stackCategorizers' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'stackShorteners' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'enabled' := Enabled,
          'intervalSeconds' := IntervalSeconds,
          'commitsPerIntervalThreshold' := CommitsPerIntervalThreshold,
          'maxLocationLength' := MaxLocationLength,
          'maxDetailsShown' := MaxDetailsShown,
          'minDetailsPercentage' := MinDetailsPercentage,
          'threadMatchers' := ThreadMatchers,
          'maxGreedyDepth' := MaxGreedyDepth,
          'greedyStackMatchers' := GreedyStackMatchers,
          'stackFilters' := StackFilters,
          'stackMatchers' := StackMatchers,
          'stackCategorizers' := StackCategorizers,
          'stackShorteners' := StackShorteners
        }) ->
    #{ 'enabled' => Enabled,
       'intervalSeconds' => IntervalSeconds,
       'commitsPerIntervalThreshold' => CommitsPerIntervalThreshold,
       'maxLocationLength' => MaxLocationLength,
       'maxDetailsShown' => MaxDetailsShown,
       'minDetailsPercentage' => MinDetailsPercentage,
       'threadMatchers' => ThreadMatchers,
       'maxGreedyDepth' => MaxGreedyDepth,
       'greedyStackMatchers' => GreedyStackMatchers,
       'stackFilters' => StackFilters,
       'stackMatchers' => StackMatchers,
       'stackCategorizers' => StackCategorizers,
       'stackShorteners' => StackShorteners
     }.
