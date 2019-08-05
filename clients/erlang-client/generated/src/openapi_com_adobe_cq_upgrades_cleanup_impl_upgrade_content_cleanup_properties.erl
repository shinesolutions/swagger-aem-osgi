-module(openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties/0]).

-type openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_properties() ::
    #{ 'delete_path_regexps' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'delete_sql2_query' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'delete_path_regexps' := DeletePathRegexps,
          'delete_sql2_query' := DeleteSql2Query
        }) ->
    #{ 'delete.path.regexps' => DeletePathRegexps,
       'delete.sql2.query' => DeleteSql2Query
     }.
