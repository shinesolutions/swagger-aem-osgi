-module(openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties/0]).

-export([openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties() ::
  [ {'com_day_cq_dam_core_impl_io_SpecialFilesHandler_filepatters', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties() ->
    openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties([]).

openapi_com_adobe_cq_dam_webdav_impl_io_special_files_handler_properties(Fields) ->
  Default = [ {'com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

