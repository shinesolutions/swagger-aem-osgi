-module(openapi_com_day_cq_wcm_designimporter_design_package_importer_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_designimporter_design_package_importer_properties/0]).

-export([openapi_com_day_cq_wcm_designimporter_design_package_importer_properties/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_design_package_importer_properties/0]).

-type openapi_com_day_cq_wcm_designimporter_design_package_importer_properties() ::
  [ {'extract_filter', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_designimporter_design_package_importer_properties() ->
    openapi_com_day_cq_wcm_designimporter_design_package_importer_properties([]).

openapi_com_day_cq_wcm_designimporter_design_package_importer_properties(Fields) ->
  Default = [ {'extract.filter', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

