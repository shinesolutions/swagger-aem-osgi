-module(openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties/0]).

-export([openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties/1]).

-export_type([openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties/0]).

-type openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties() ::
  [ {'More_Info', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'_mnt_overlay_dam_gui_content_assets_moreinfo_html_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties() ->
    openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties([]).

openapi_com_day_cq_dam_core_impl_servlet_companion_servlet_properties(Fields) ->
  Default = [ {'More Info', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

