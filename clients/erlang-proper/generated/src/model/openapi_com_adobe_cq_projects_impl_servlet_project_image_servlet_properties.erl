-module(openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties/0]).

-export([openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties/1]).

-export_type([openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties/0]).

-type openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties() ::
  [ {'image_quality', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'image_supported_resolutions', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties() ->
    openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties([]).

openapi_com_adobe_cq_projects_impl_servlet_project_image_servlet_properties(Fields) ->
  Default = [ {'image.quality', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'image.supported.resolutions', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

