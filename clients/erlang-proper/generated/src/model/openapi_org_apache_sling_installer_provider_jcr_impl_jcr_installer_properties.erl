-module(openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties/0]).

-export([openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties/1]).

-export_type([openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties/0]).

-type openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties() ::
  [ {'handler_schemes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_jcrinstall_folder_name_regexp', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_jcrinstall_folder_max_depth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_jcrinstall_search_path', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'sling_jcrinstall_new_config_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_jcrinstall_signal_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_jcrinstall_enable_writeback', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties() ->
    openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties([]).

openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties(Fields) ->
  Default = [ {'handler.schemes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.jcrinstall.folder.name.regexp', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.jcrinstall.folder.max.depth', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.jcrinstall.search.path', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'sling.jcrinstall.new.config.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.jcrinstall.signal.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.jcrinstall.enable.writeback', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

