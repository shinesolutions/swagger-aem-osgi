-module(openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties/0]).

-type openapi_org_apache_sling_distribution_monitor_distribution_queue_health_check_properties() ::
    #{ 'hc_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'hc_mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'numberOfRetriesAllowed' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'hc_name' := HcName,
          'hc_tags' := HcTags,
          'hc_mbean_name' := HcMbeanName,
          'numberOfRetriesAllowed' := NumberOfRetriesAllowed
        }) ->
    #{ 'hc.name' => HcName,
       'hc.tags' => HcTags,
       'hc.mbean.name' => HcMbeanName,
       'numberOfRetriesAllowed' => NumberOfRetriesAllowed
     }.
