-module(openapi_com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties/0]).

-type openapi_com_adobe_granite_replication_hc_impl_replication_queue_health_check_properties() ::
    #{ 'number_of_retries_allowed' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'number_of_retries_allowed' := NumberOfRetriesAllowed,
          'hc_tags' := HcTags
        }) ->
    #{ 'number.of.retries.allowed' => NumberOfRetriesAllowed,
       'hc.tags' => HcTags
     }.
