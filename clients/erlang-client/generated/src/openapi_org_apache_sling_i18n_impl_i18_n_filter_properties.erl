-module(openapi_org_apache_sling_i18n_impl_i18_n_filter_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_i18n_impl_i18_n_filter_properties/0]).

-type openapi_org_apache_sling_i18n_impl_i18_n_filter_properties() ::
    #{ 'service_ranking' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_filter_scope' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'service_ranking' := ServiceRanking,
          'sling_filter_scope' := SlingFilterScope
        }) ->
    #{ 'service.ranking' => ServiceRanking,
       'sling.filter.scope' => SlingFilterScope
     }.
