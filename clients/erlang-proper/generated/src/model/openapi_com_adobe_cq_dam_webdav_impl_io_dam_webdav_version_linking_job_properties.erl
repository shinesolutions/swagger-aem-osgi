-module(openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties/0]).

-export([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties/1]).

-export_type([openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties/0]).

-type openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties() ::
  [ {'cq_dam_webdav_version_linking_enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_dam_webdav_version_linking_scheduler_period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_webdav_version_linking_staging_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties() ->
    openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties([]).

openapi_com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_properties(Fields) ->
  Default = [ {'cq.dam.webdav.version.linking.enable', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.dam.webdav.version.linking.scheduler.period', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.webdav.version.linking.staging.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

