-module(openapi_statem).

-behaviour(proper_statem).

-include("openapi.hrl").
-include_lib("proper/include/proper_common.hrl").
-include_lib("stdlib/include/assert.hrl").

-compile(export_all).
-compile(nowarn_export_all).

-include("openapi_statem.hrl").

%%==============================================================================
%% The statem's property
%%==============================================================================

prop_main() ->
  setup(),
  ?FORALL( Cmds
         , proper_statem:commands(?MODULE)
         , begin
             cleanup(),
             { History
             , State
             , Result
             } = proper_statem:run_commands(?MODULE, Cmds),
             ?WHENFAIL(
                io:format("History: ~p\nState: ~p\nResult: ~p\nCmds: ~p\n",
                          [ History
                          , State
                          , Result
                          , proper_statem:command_names(Cmds)
                          ]),
                proper:aggregate( proper_statem:command_names(Cmds)
                                , Result =:= ok
                                )
               )
           end
         ).

%%==============================================================================
%% Setup
%%==============================================================================

setup() -> ok.

%%==============================================================================
%% Cleanup
%%==============================================================================

cleanup() -> ok.

%%==============================================================================
%% Initial State
%%==============================================================================

initial_state() -> #{}.

%%==============================================================================
%% adaptive_form_and_interactive_communication_web_channel_configuration
%%==============================================================================

adaptive_form_and_interactive_communication_web_channel_configuration() ->
  openapi_api:adaptive_form_and_interactive_communication_web_channel_configuration().

adaptive_form_and_interactive_communication_web_channel_configuration_args(_S) ->
  [].

%%==============================================================================
%% adaptive_form_and_interactive_communication_web_channel_theme_configur
%%==============================================================================

adaptive_form_and_interactive_communication_web_channel_theme_configur() ->
  openapi_api:adaptive_form_and_interactive_communication_web_channel_theme_configur().

adaptive_form_and_interactive_communication_web_channel_theme_configur_args(_S) ->
  [].

%%==============================================================================
%% analytics_component_query_cache_service
%%==============================================================================

analytics_component_query_cache_service() ->
  openapi_api:analytics_component_query_cache_service().

analytics_component_query_cache_service_args(_S) ->
  [].

%%==============================================================================
%% apache_sling_health_check_result_html_serializer
%%==============================================================================

apache_sling_health_check_result_html_serializer() ->
  openapi_api:apache_sling_health_check_result_html_serializer().

apache_sling_health_check_result_html_serializer_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration
%%==============================================================================

com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration() ->
  openapi_api:com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration().

com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_aem_transaction_core_impl_transaction_recorder
%%==============================================================================

com_adobe_aem_transaction_core_impl_transaction_recorder() ->
  openapi_api:com_adobe_aem_transaction_core_impl_transaction_recorder().

com_adobe_aem_transaction_core_impl_transaction_recorder_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc
%%==============================================================================

com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc() ->
  openapi_api:com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc().

com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc
%%==============================================================================

com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc() ->
  openapi_api:com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc().

com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl
%%==============================================================================

com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl() ->
  openapi_api:com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl().

com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl
%%==============================================================================

com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl() ->
  openapi_api:com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl().

com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_account_api_account_management_service
%%==============================================================================

com_adobe_cq_account_api_account_management_service() ->
  openapi_api:com_adobe_cq_account_api_account_management_service().

com_adobe_cq_account_api_account_management_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_account_impl_account_management_servlet
%%==============================================================================

com_adobe_cq_account_impl_account_management_servlet() ->
  openapi_api:com_adobe_cq_account_impl_account_management_servlet().

com_adobe_cq_account_impl_account_management_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_address_impl_location_location_list_servlet
%%==============================================================================

com_adobe_cq_address_impl_location_location_list_servlet() ->
  openapi_api:com_adobe_cq_address_impl_location_location_list_servlet().

com_adobe_cq_address_impl_location_location_list_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_audit_purge_dam
%%==============================================================================

com_adobe_cq_audit_purge_dam() ->
  openapi_api:com_adobe_cq_audit_purge_dam().

com_adobe_cq_audit_purge_dam_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_audit_purge_pages
%%==============================================================================

com_adobe_cq_audit_purge_pages() ->
  openapi_api:com_adobe_cq_audit_purge_pages().

com_adobe_cq_audit_purge_pages_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_audit_purge_replication
%%==============================================================================

com_adobe_cq_audit_purge_replication() ->
  openapi_api:com_adobe_cq_audit_purge_replication().

com_adobe_cq_audit_purge_replication_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter
%%==============================================================================

com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter() ->
  openapi_api:com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter().

com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl
%%==============================================================================

com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl() ->
  openapi_api:com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl().

com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_cdn_rewriter_impl_cdn_rewriter
%%==============================================================================

com_adobe_cq_cdn_rewriter_impl_cdn_rewriter() ->
  openapi_api:com_adobe_cq_cdn_rewriter_impl_cdn_rewriter().

com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle
%%==============================================================================

com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle() ->
  openapi_api:com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle().

com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_impl_asset_dynamic_image_handler
%%==============================================================================

com_adobe_cq_commerce_impl_asset_dynamic_image_handler() ->
  openapi_api:com_adobe_cq_commerce_impl_asset_dynamic_image_handler().

com_adobe_cq_commerce_impl_asset_dynamic_image_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl
%%==============================================================================

com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl() ->
  openapi_api:com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl().

com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_impl_asset_static_image_handler
%%==============================================================================

com_adobe_cq_commerce_impl_asset_static_image_handler() ->
  openapi_api:com_adobe_cq_commerce_impl_asset_static_image_handler().

com_adobe_cq_commerce_impl_asset_static_image_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_impl_asset_video_handler
%%==============================================================================

com_adobe_cq_commerce_impl_asset_video_handler() ->
  openapi_api:com_adobe_cq_commerce_impl_asset_video_handler().

com_adobe_cq_commerce_impl_asset_video_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_impl_promotion_promotion_manager_impl
%%==============================================================================

com_adobe_cq_commerce_impl_promotion_promotion_manager_impl() ->
  openapi_api:com_adobe_cq_commerce_impl_promotion_promotion_manager_impl().

com_adobe_cq_commerce_impl_promotion_promotion_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl
%%==============================================================================

com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl() ->
  openapi_api:com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl().

com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_pim_impl_page_event_listener
%%==============================================================================

com_adobe_cq_commerce_pim_impl_page_event_listener() ->
  openapi_api:com_adobe_cq_commerce_pim_impl_page_event_listener().

com_adobe_cq_commerce_pim_impl_page_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl
%%==============================================================================

com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl() ->
  openapi_api:com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl().

com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_contentinsight_impl_reporting_services_settings_provider
%%==============================================================================

com_adobe_cq_contentinsight_impl_reporting_services_settings_provider() ->
  openapi_api:com_adobe_cq_contentinsight_impl_reporting_services_settings_provider().

com_adobe_cq_contentinsight_impl_reporting_services_settings_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet
%%==============================================================================

com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet() ->
  openapi_api:com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet().

com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle
%%==============================================================================

com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle() ->
  openapi_api:com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle().

com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_cfm_impl_component_component_config_impl
%%==============================================================================

com_adobe_cq_dam_cfm_impl_component_component_config_impl() ->
  openapi_api:com_adobe_cq_dam_cfm_impl_component_component_config_impl().

com_adobe_cq_dam_cfm_impl_component_component_config_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_cfm_impl_conf_feature_config_impl
%%==============================================================================

com_adobe_cq_dam_cfm_impl_conf_feature_config_impl() ->
  openapi_api:com_adobe_cq_dam_cfm_impl_conf_feature_config_impl().

com_adobe_cq_dam_cfm_impl_conf_feature_config_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor
%%==============================================================================

com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor() ->
  openapi_api:com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor().

com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter
%%==============================================================================

com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter() ->
  openapi_api:com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter().

com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter
%%==============================================================================

com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter() ->
  openapi_api:com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter().

com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl
%%==============================================================================

com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl() ->
  openapi_api:com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl().

com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker
%%==============================================================================

com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker() ->
  openapi_api:com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker().

com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl
%%==============================================================================

com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl() ->
  openapi_api:com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl().

com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl
%%==============================================================================

com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl() ->
  openapi_api:com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl().

com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_processor_nui_impl_nui_asset_processor
%%==============================================================================

com_adobe_cq_dam_processor_nui_impl_nui_asset_processor() ->
  openapi_api:com_adobe_cq_dam_processor_nui_impl_nui_asset_processor().

com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_s7imaging_impl_is_image_server_component
%%==============================================================================

com_adobe_cq_dam_s7imaging_impl_is_image_server_component() ->
  openapi_api:com_adobe_cq_dam_s7imaging_impl_is_image_server_component().

com_adobe_cq_dam_s7imaging_impl_is_image_server_component_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet
%%==============================================================================

com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet() ->
  openapi_api:com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet().

com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_webdav_impl_io_asset_io_handler
%%==============================================================================

com_adobe_cq_dam_webdav_impl_io_asset_io_handler() ->
  openapi_api:com_adobe_cq_dam_webdav_impl_io_asset_io_handler().

com_adobe_cq_dam_webdav_impl_io_asset_io_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job
%%==============================================================================

com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job() ->
  openapi_api:com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job().

com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dam_webdav_impl_io_special_files_handler
%%==============================================================================

com_adobe_cq_dam_webdav_impl_io_special_files_handler() ->
  openapi_api:com_adobe_cq_dam_webdav_impl_io_special_files_handler().

com_adobe_cq_dam_webdav_impl_io_special_files_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_deserfw_impl_deserialization_firewall_impl
%%==============================================================================

com_adobe_cq_deserfw_impl_deserialization_firewall_impl() ->
  openapi_api:com_adobe_cq_deserfw_impl_deserialization_firewall_impl().

com_adobe_cq_deserfw_impl_deserialization_firewall_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dtm_impl_service_dtm_web_service_impl
%%==============================================================================

com_adobe_cq_dtm_impl_service_dtm_web_service_impl() ->
  openapi_api:com_adobe_cq_dtm_impl_service_dtm_web_service_impl().

com_adobe_cq_dtm_impl_service_dtm_web_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet
%%==============================================================================

com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet() ->
  openapi_api:com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet().

com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_dtm_reactor_impl_service_web_service_impl
%%==============================================================================

com_adobe_cq_dtm_reactor_impl_service_web_service_impl() ->
  openapi_api:com_adobe_cq_dtm_reactor_impl_service_web_service_impl().

com_adobe_cq_dtm_reactor_impl_service_web_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_experiencelog_impl_experience_log_config_servlet
%%==============================================================================

com_adobe_cq_experiencelog_impl_experience_log_config_servlet() ->
  openapi_api:com_adobe_cq_experiencelog_impl_experience_log_config_servlet().

com_adobe_cq_experiencelog_impl_experience_log_config_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_hc_content_packages_health_check
%%==============================================================================

com_adobe_cq_hc_content_packages_health_check() ->
  openapi_api:com_adobe_cq_hc_content_packages_health_check().

com_adobe_cq_hc_content_packages_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_history_impl_history_request_filter
%%==============================================================================

com_adobe_cq_history_impl_history_request_filter() ->
  openapi_api:com_adobe_cq_history_impl_history_request_filter().

com_adobe_cq_history_impl_history_request_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_history_impl_history_service_impl
%%==============================================================================

com_adobe_cq_history_impl_history_service_impl() ->
  openapi_api:com_adobe_cq_history_impl_history_service_impl().

com_adobe_cq_history_impl_history_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_inbox_impl_typeprovider_item_type_provider
%%==============================================================================

com_adobe_cq_inbox_impl_typeprovider_item_type_provider() ->
  openapi_api:com_adobe_cq_inbox_impl_typeprovider_item_type_provider().

com_adobe_cq_inbox_impl_typeprovider_item_type_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_projects_impl_servlet_project_image_servlet
%%==============================================================================

com_adobe_cq_projects_impl_servlet_project_image_servlet() ->
  openapi_api:com_adobe_cq_projects_impl_servlet_project_image_servlet().

com_adobe_cq_projects_impl_servlet_project_image_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_projects_purge_scheduler
%%==============================================================================

com_adobe_cq_projects_purge_scheduler() ->
  openapi_api:com_adobe_cq_projects_purge_scheduler().

com_adobe_cq_projects_purge_scheduler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl
%%==============================================================================

com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl() ->
  openapi_api:com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl().

com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl
%%==============================================================================

com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl() ->
  openapi_api:com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl().

com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_device_impl_device_service
%%==============================================================================

com_adobe_cq_screens_device_impl_device_service() ->
  openapi_api:com_adobe_cq_screens_device_impl_device_service().

com_adobe_cq_screens_device_impl_device_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_device_registration_impl_registration_service_impl
%%==============================================================================

com_adobe_cq_screens_device_registration_impl_registration_service_impl() ->
  openapi_api:com_adobe_cq_screens_device_registration_impl_registration_service_impl().

com_adobe_cq_screens_device_registration_impl_registration_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_impl_handler_channels_update_handler
%%==============================================================================

com_adobe_cq_screens_impl_handler_channels_update_handler() ->
  openapi_api:com_adobe_cq_screens_impl_handler_channels_update_handler().

com_adobe_cq_screens_impl_handler_channels_update_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job
%%==============================================================================

com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job() ->
  openapi_api:com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job().

com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl
%%==============================================================================

com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl() ->
  openapi_api:com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl().

com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_impl_screens_channel_post_processor
%%==============================================================================

com_adobe_cq_screens_impl_screens_channel_post_processor() ->
  openapi_api:com_adobe_cq_screens_impl_screens_channel_post_processor().

com_adobe_cq_screens_impl_screens_channel_post_processor_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl
%%==============================================================================

com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl() ->
  openapi_api:com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl().

com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider
%%==============================================================================

com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider() ->
  openapi_api:com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider().

com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl
%%==============================================================================

com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl() ->
  openapi_api:com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl().

com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl
%%==============================================================================

com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl() ->
  openapi_api:com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl().

com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag
%%==============================================================================

com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag() ->
  openapi_api:com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag().

com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch
%%==============================================================================

com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch() ->
  openapi_api:com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch().

com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check
%%==============================================================================

com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check() ->
  openapi_api:com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check().

com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check
%%==============================================================================

com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check() ->
  openapi_api:com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check().

com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_security_hc_packages_impl_example_content_health_check
%%==============================================================================

com_adobe_cq_security_hc_packages_impl_example_content_health_check() ->
  openapi_api:com_adobe_cq_security_hc_packages_impl_example_content_health_check().

com_adobe_cq_security_hc_packages_impl_example_content_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check
%%==============================================================================

com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check() ->
  openapi_api:com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check().

com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_accountverification_impl_account_management_config_im
%%==============================================================================

com_adobe_cq_social_accountverification_impl_account_management_config_im() ->
  openapi_api:com_adobe_cq_social_accountverification_impl_account_management_config_im().

com_adobe_cq_social_accountverification_impl_account_management_config_im_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_activitystreams_client_impl_social_activity_componen
%%==============================================================================

com_adobe_cq_social_activitystreams_client_impl_social_activity_componen() ->
  openapi_api:com_adobe_cq_social_activitystreams_client_impl_social_activity_componen().

com_adobe_cq_social_activitystreams_client_impl_social_activity_componen_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co
%%==============================================================================

com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co() ->
  openapi_api:com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co().

com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler
%%==============================================================================

com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler() ->
  openapi_api:com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler().

com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten
%%==============================================================================

com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten() ->
  openapi_api:com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten().

com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s
%%==============================================================================

com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s() ->
  openapi_api:com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s().

com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre
%%==============================================================================

com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre() ->
  openapi_api:com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre().

com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i
%%==============================================================================

com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i() ->
  openapi_api:com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i().

com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_calendar_client_operationextensions_event_attachmen
%%==============================================================================

com_adobe_cq_social_calendar_client_operationextensions_event_attachmen() ->
  openapi_api:com_adobe_cq_social_calendar_client_operationextensions_event_attachmen().

com_adobe_cq_social_calendar_client_operationextensions_event_attachmen_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_calendar_servlets_time_zone_servlet
%%==============================================================================

com_adobe_cq_social_calendar_servlets_time_zone_servlet() ->
  openapi_api:com_adobe_cq_social_calendar_servlets_time_zone_servlet().

com_adobe_cq_social_calendar_servlets_time_zone_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event
%%==============================================================================

com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event() ->
  openapi_api:com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event().

com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se
%%==============================================================================

com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se() ->
  openapi_api:com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se().

com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati
%%==============================================================================

com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati() ->
  openapi_api:com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati().

com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c
%%==============================================================================

com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c() ->
  openapi_api:com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c().

com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos
%%==============================================================================

com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos() ->
  openapi_api:com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos().

com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_cors_cors_authentication_filter
%%==============================================================================

com_adobe_cq_social_commons_cors_cors_authentication_filter() ->
  openapi_api:com_adobe_cq_social_commons_cors_cors_authentication_filter().

com_adobe_cq_social_commons_cors_cors_authentication_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl().

com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener().

com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp().

com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp().

com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_email_reply_importer
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_email_reply_importer() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_email_reply_importer().

com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider
%%==============================================================================

com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider() ->
  openapi_api:com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider().

com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload
%%==============================================================================

com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload() ->
  openapi_api:com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload().

com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl
%%==============================================================================

com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl() ->
  openapi_api:com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl().

com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit
%%==============================================================================

com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit() ->
  openapi_api:com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit().

com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl
%%==============================================================================

com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl() ->
  openapi_api:com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl().

com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle
%%==============================================================================

com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle() ->
  openapi_api:com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle().

com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper
%%==============================================================================

com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper() ->
  openapi_api:com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper().

com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl
%%==============================================================================

com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl() ->
  openapi_api:com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl().

com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_content_fragments_services_impl_communities_fragmen
%%==============================================================================

com_adobe_cq_social_content_fragments_services_impl_communities_fragmen() ->
  openapi_api:com_adobe_cq_social_content_fragments_services_impl_communities_fragmen().

com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory
%%==============================================================================

com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory() ->
  openapi_api:com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory().

com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory
%%==============================================================================

com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory() ->
  openapi_api:com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory().

com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor
%%==============================================================================

com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor() ->
  openapi_api:com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor().

com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f
%%==============================================================================

com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f() ->
  openapi_api:com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f().

com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto
%%==============================================================================

com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto() ->
  openapi_api:com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto().

com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l
%%==============================================================================

com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l() ->
  openapi_api:com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l().

com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou
%%==============================================================================

com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou() ->
  openapi_api:com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou().

com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_enablement_services_impl_author_marker_impl
%%==============================================================================

com_adobe_cq_social_enablement_services_impl_author_marker_impl() ->
  openapi_api:com_adobe_cq_social_enablement_services_impl_author_marker_impl().

com_adobe_cq_social_enablement_services_impl_author_marker_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge
%%==============================================================================

com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge() ->
  openapi_api:com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge().

com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera
%%==============================================================================

com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera() ->
  openapi_api:com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera().

com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service
%%==============================================================================

com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service() ->
  openapi_api:com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service().

com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_forum_dispatcher_impl_flush_operations
%%==============================================================================

com_adobe_cq_social_forum_dispatcher_impl_flush_operations() ->
  openapi_api:com_adobe_cq_social_forum_dispatcher_impl_flush_operations().

com_adobe_cq_social_forum_dispatcher_impl_flush_operations_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_group_client_impl_community_group_collection_componen
%%==============================================================================

com_adobe_cq_social_group_client_impl_community_group_collection_componen() ->
  openapi_api:com_adobe_cq_social_group_client_impl_community_group_collection_componen().

com_adobe_cq_social_group_client_impl_community_group_collection_componen_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_group_impl_group_service_impl
%%==============================================================================

com_adobe_cq_social_group_impl_group_service_impl() ->
  openapi_api:com_adobe_cq_social_group_impl_group_service_impl().

com_adobe_cq_social_group_impl_group_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_handlebars_guava_template_cache_impl
%%==============================================================================

com_adobe_cq_social_handlebars_guava_template_cache_impl() ->
  openapi_api:com_adobe_cq_social_handlebars_guava_template_cache_impl().

com_adobe_cq_social_handlebars_guava_template_cache_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s
%%==============================================================================

com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s() ->
  openapi_api:com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s().

com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser
%%==============================================================================

com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser() ->
  openapi_api:com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser().

com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_members_endpoints_impl_community_member_group_profile
%%==============================================================================

com_adobe_cq_social_members_endpoints_impl_community_member_group_profile() ->
  openapi_api:com_adobe_cq_social_members_endpoints_impl_community_member_group_profile().

com_adobe_cq_social_members_endpoints_impl_community_member_group_profile_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o
%%==============================================================================

com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o() ->
  openapi_api:com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o().

com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_members_impl_community_member_group_profile_component_f
%%==============================================================================

com_adobe_cq_social_members_impl_community_member_group_profile_component_f() ->
  openapi_api:com_adobe_cq_social_members_impl_community_member_group_profile_component_f().

com_adobe_cq_social_members_impl_community_member_group_profile_component_f_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation
%%==============================================================================

com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation() ->
  openapi_api:com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation().

com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen
%%==============================================================================

com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen() ->
  openapi_api:com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen().

com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social
%%==============================================================================

com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social() ->
  openapi_api:com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social().

com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen
%%==============================================================================

com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen() ->
  openapi_api:com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen().

com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci
%%==============================================================================

com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci() ->
  openapi_api:com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci().

com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_notifications_impl_mentions_router
%%==============================================================================

com_adobe_cq_social_notifications_impl_mentions_router() ->
  openapi_api:com_adobe_cq_social_notifications_impl_mentions_router().

com_adobe_cq_social_notifications_impl_mentions_router_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_notifications_impl_notification_manager_impl
%%==============================================================================

com_adobe_cq_social_notifications_impl_notification_manager_impl() ->
  openapi_api:com_adobe_cq_social_notifications_impl_notification_manager_impl().

com_adobe_cq_social_notifications_impl_notification_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_notifications_impl_notifications_router
%%==============================================================================

com_adobe_cq_social_notifications_impl_notifications_router() ->
  openapi_api:com_adobe_cq_social_notifications_impl_notifications_router().

com_adobe_cq_social_notifications_impl_notifications_router_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic
%%==============================================================================

com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic() ->
  openapi_api:com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic().

com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i
%%==============================================================================

com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i() ->
  openapi_api:com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i().

com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m
%%==============================================================================

com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m() ->
  openapi_api:com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m().

com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s
%%==============================================================================

com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s() ->
  openapi_api:com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s().

com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi
%%==============================================================================

com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi() ->
  openapi_api:com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi().

com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet
%%==============================================================================

com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet() ->
  openapi_api:com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet().

com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet
%%==============================================================================

com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet() ->
  openapi_api:com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet().

com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_scoring_impl_scoring_event_listener
%%==============================================================================

com_adobe_cq_social_scoring_impl_scoring_event_listener() ->
  openapi_api:com_adobe_cq_social_scoring_impl_scoring_event_listener().

com_adobe_cq_social_scoring_impl_scoring_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl
%%==============================================================================

com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl() ->
  openapi_api:com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl().

com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_site_endpoints_impl_site_operation_service
%%==============================================================================

com_adobe_cq_social_site_endpoints_impl_site_operation_service() ->
  openapi_api:com_adobe_cq_social_site_endpoints_impl_site_operation_service().

com_adobe_cq_social_site_endpoints_impl_site_operation_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_site_impl_analytics_component_configuration_service_im
%%==============================================================================

com_adobe_cq_social_site_impl_analytics_component_configuration_service_im() ->
  openapi_api:com_adobe_cq_social_site_impl_analytics_component_configuration_service_im().

com_adobe_cq_social_site_impl_analytics_component_configuration_service_im_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_site_impl_site_configurator_impl
%%==============================================================================

com_adobe_cq_social_site_impl_site_configurator_impl() ->
  openapi_api:com_adobe_cq_social_site_impl_site_configurator_impl().

com_adobe_cq_social_site_impl_site_configurator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_srp_impl_social_solr_connector
%%==============================================================================

com_adobe_cq_social_srp_impl_social_solr_connector() ->
  openapi_api:com_adobe_cq_social_srp_impl_social_solr_connector().

com_adobe_cq_social_srp_impl_social_solr_connector_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_sync_impl_diff_changes_observer
%%==============================================================================

com_adobe_cq_social_sync_impl_diff_changes_observer() ->
  openapi_api:com_adobe_cq_social_sync_impl_diff_changes_observer().

com_adobe_cq_social_sync_impl_diff_changes_observer_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_sync_impl_group_sync_listener_impl
%%==============================================================================

com_adobe_cq_social_sync_impl_group_sync_listener_impl() ->
  openapi_api:com_adobe_cq_social_sync_impl_group_sync_listener_impl().

com_adobe_cq_social_sync_impl_group_sync_listener_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_sync_impl_publisher_sync_service_impl
%%==============================================================================

com_adobe_cq_social_sync_impl_publisher_sync_service_impl() ->
  openapi_api:com_adobe_cq_social_sync_impl_publisher_sync_service_impl().

com_adobe_cq_social_sync_impl_publisher_sync_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_sync_impl_user_sync_listener_impl
%%==============================================================================

com_adobe_cq_social_sync_impl_user_sync_listener_impl() ->
  openapi_api:com_adobe_cq_social_sync_impl_user_sync_listener_impl().

com_adobe_cq_social_sync_impl_user_sync_listener_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_translation_impl_translation_service_config_manager
%%==============================================================================

com_adobe_cq_social_translation_impl_translation_service_config_manager() ->
  openapi_api:com_adobe_cq_social_translation_impl_translation_service_config_manager().

com_adobe_cq_social_translation_impl_translation_service_config_manager_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_translation_impl_ugc_language_detector
%%==============================================================================

com_adobe_cq_social_translation_impl_ugc_language_detector() ->
  openapi_api:com_adobe_cq_social_translation_impl_ugc_language_detector().

com_adobe_cq_social_translation_impl_ugc_language_detector_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl
%%==============================================================================

com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl() ->
  openapi_api:com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl().

com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl
%%==============================================================================

com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl() ->
  openapi_api:com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl().

com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl
%%==============================================================================

com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl() ->
  openapi_api:com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl().

com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_impl_social_utils_impl
%%==============================================================================

com_adobe_cq_social_ugcbase_impl_social_utils_impl() ->
  openapi_api:com_adobe_cq_social_ugcbase_impl_social_utils_impl().

com_adobe_cq_social_ugcbase_impl_social_utils_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl
%%==============================================================================

com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl() ->
  openapi_api:com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl().

com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process
%%==============================================================================

com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process() ->
  openapi_api:com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process().

com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli
%%==============================================================================

com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli() ->
  openapi_api:com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli().

com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl
%%==============================================================================

com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl() ->
  openapi_api:com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl().

com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet
%%==============================================================================

com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet() ->
  openapi_api:com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet().

com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_social_user_impl_transport_http_to_publisher
%%==============================================================================

com_adobe_cq_social_user_impl_transport_http_to_publisher() ->
  openapi_api:com_adobe_cq_social_user_impl_transport_http_to_publisher().

com_adobe_cq_social_user_impl_transport_http_to_publisher_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact
%%==============================================================================

com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact() ->
  openapi_api:com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact().

com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup
%%==============================================================================

com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup() ->
  openapi_api:com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup().

com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup
%%==============================================================================

com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup() ->
  openapi_api:com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup().

com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service
%%==============================================================================

com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service() ->
  openapi_api:com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service().

com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task
%%==============================================================================

com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task() ->
  openapi_api:com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task().

com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service
%%==============================================================================

com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service() ->
  openapi_api:com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service().

com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service
%%==============================================================================

com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service() ->
  openapi_api:com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service().

com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_launches_impl_launches_event_handler
%%==============================================================================

com_adobe_cq_wcm_launches_impl_launches_event_handler() ->
  openapi_api:com_adobe_cq_wcm_launches_impl_launches_event_handler().

com_adobe_cq_wcm_launches_impl_launches_event_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator
%%==============================================================================

com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator() ->
  openapi_api:com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator().

com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_style_internal_component_style_info_cache_impl
%%==============================================================================

com_adobe_cq_wcm_style_internal_component_style_info_cache_impl() ->
  openapi_api:com_adobe_cq_wcm_style_internal_component_style_info_cache_impl().

com_adobe_cq_wcm_style_internal_component_style_info_cache_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl
%%==============================================================================

com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl() ->
  openapi_api:com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl().

com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service
%%==============================================================================

com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service() ->
  openapi_api:com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service().

com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_fd_fp_config_forms_portal_scheduler_service
%%==============================================================================

com_adobe_fd_fp_config_forms_portal_scheduler_service() ->
  openapi_api:com_adobe_fd_fp_config_forms_portal_scheduler_service().

com_adobe_fd_fp_config_forms_portal_scheduler_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_forms_common_service_impl_default_data_provider
%%==============================================================================

com_adobe_forms_common_service_impl_default_data_provider() ->
  openapi_api:com_adobe_forms_common_service_impl_default_data_provider().

com_adobe_forms_common_service_impl_default_data_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_forms_common_service_impl_forms_common_configuration_service_imp
%%==============================================================================

com_adobe_forms_common_service_impl_forms_common_configuration_service_imp() ->
  openapi_api:com_adobe_forms_common_service_impl_forms_common_configuration_service_imp().

com_adobe_forms_common_service_impl_forms_common_configuration_service_imp_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_forms_common_servlet_temp_clean_up_task
%%==============================================================================

com_adobe_forms_common_servlet_temp_clean_up_task() ->
  openapi_api:com_adobe_forms_common_servlet_temp_clean_up_task().

com_adobe_forms_common_servlet_temp_clean_up_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_acp_platform_platform_servlet
%%==============================================================================

com_adobe_granite_acp_platform_platform_servlet() ->
  openapi_api:com_adobe_granite_acp_platform_platform_servlet().

com_adobe_granite_acp_platform_platform_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_activitystreams_impl_activity_manager_impl
%%==============================================================================

com_adobe_granite_activitystreams_impl_activity_manager_impl() ->
  openapi_api:com_adobe_granite_activitystreams_impl_activity_manager_impl().

com_adobe_granite_activitystreams_impl_activity_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_analyzer_base_system_status_servlet
%%==============================================================================

com_adobe_granite_analyzer_base_system_status_servlet() ->
  openapi_api:com_adobe_granite_analyzer_base_system_status_servlet().

com_adobe_granite_analyzer_base_system_status_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet
%%==============================================================================

com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet() ->
  openapi_api:com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet().

com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_apicontroller_filter_resolver_hook_factory
%%==============================================================================

com_adobe_granite_apicontroller_filter_resolver_hook_factory() ->
  openapi_api:com_adobe_granite_apicontroller_filter_resolver_hook_factory().

com_adobe_granite_apicontroller_filter_resolver_hook_factory_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_cert_impl_client_cert_auth_handler
%%==============================================================================

com_adobe_granite_auth_cert_impl_client_cert_auth_handler() ->
  openapi_api:com_adobe_granite_auth_cert_impl_client_cert_auth_handler().

com_adobe_granite_auth_cert_impl_client_cert_auth_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_ims
%%==============================================================================

com_adobe_granite_auth_ims() ->
  openapi_api:com_adobe_granite_auth_ims().

com_adobe_granite_auth_ims_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension
%%==============================================================================

com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension() ->
  openapi_api:com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension().

com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl
%%==============================================================================

com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl() ->
  openapi_api:com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl().

com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_ims_impl_ims_config_provider_impl
%%==============================================================================

com_adobe_granite_auth_ims_impl_ims_config_provider_impl() ->
  openapi_api:com_adobe_granite_auth_ims_impl_ims_config_provider_impl().

com_adobe_granite_auth_ims_impl_ims_config_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator
%%==============================================================================

com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator() ->
  openapi_api:com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator().

com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_ims_impl_ims_provider_impl
%%==============================================================================

com_adobe_granite_auth_ims_impl_ims_provider_impl() ->
  openapi_api:com_adobe_granite_auth_ims_impl_ims_provider_impl().

com_adobe_granite_auth_ims_impl_ims_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_accesstoken_provider
%%==============================================================================

com_adobe_granite_auth_oauth_accesstoken_provider() ->
  openapi_api:com_adobe_granite_auth_oauth_accesstoken_provider().

com_adobe_granite_auth_oauth_accesstoken_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_bearer_authentication_handler
%%==============================================================================

com_adobe_granite_auth_oauth_impl_bearer_authentication_handler() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_bearer_authentication_handler().

com_adobe_granite_auth_oauth_impl_bearer_authentication_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_default_token_validator_impl
%%==============================================================================

com_adobe_granite_auth_oauth_impl_default_token_validator_impl() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_default_token_validator_impl().

com_adobe_granite_auth_oauth_impl_default_token_validator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_facebook_provider_impl
%%==============================================================================

com_adobe_granite_auth_oauth_impl_facebook_provider_impl() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_facebook_provider_impl().

com_adobe_granite_auth_oauth_impl_facebook_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_github_provider_impl
%%==============================================================================

com_adobe_granite_auth_oauth_impl_github_provider_impl() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_github_provider_impl().

com_adobe_granite_auth_oauth_impl_github_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_granite_provider
%%==============================================================================

com_adobe_granite_auth_oauth_impl_granite_provider() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_granite_provider().

com_adobe_granite_auth_oauth_impl_granite_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_helper_provider_config_manager
%%==============================================================================

com_adobe_granite_auth_oauth_impl_helper_provider_config_manager() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_helper_provider_config_manager().

com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal
%%==============================================================================

com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal().

com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler
%%==============================================================================

com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler().

com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_impl_twitter_provider_impl
%%==============================================================================

com_adobe_granite_auth_oauth_impl_twitter_provider_impl() ->
  openapi_api:com_adobe_granite_auth_oauth_impl_twitter_provider_impl().

com_adobe_granite_auth_oauth_impl_twitter_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_oauth_provider
%%==============================================================================

com_adobe_granite_auth_oauth_provider() ->
  openapi_api:com_adobe_granite_auth_oauth_provider().

com_adobe_granite_auth_oauth_provider_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_requirement_impl_default_requirement_handler
%%==============================================================================

com_adobe_granite_auth_requirement_impl_default_requirement_handler() ->
  openapi_api:com_adobe_granite_auth_requirement_impl_default_requirement_handler().

com_adobe_granite_auth_requirement_impl_default_requirement_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_saml_saml_authentication_handler
%%==============================================================================

com_adobe_granite_auth_saml_saml_authentication_handler() ->
  openapi_api:com_adobe_granite_auth_saml_saml_authentication_handler().

com_adobe_granite_auth_saml_saml_authentication_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_auth_sso_impl_sso_authentication_handler
%%==============================================================================

com_adobe_granite_auth_sso_impl_sso_authentication_handler() ->
  openapi_api:com_adobe_granite_auth_sso_impl_sso_authentication_handler().

com_adobe_granite_auth_sso_impl_sso_authentication_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_code_cache_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_code_cache_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_code_cache_health_check().

com_adobe_granite_bundles_hc_impl_code_cache_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check().

com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check().

com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check().

com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_jobs_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_jobs_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_jobs_health_check().

com_adobe_granite_bundles_hc_impl_jobs_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check().

com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check().

com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check().

com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check().

com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check
%%==============================================================================

com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check() ->
  openapi_api:com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check().

com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_comments_internal_comment_replication_content_filter_fac
%%==============================================================================

com_adobe_granite_comments_internal_comment_replication_content_filter_fac() ->
  openapi_api:com_adobe_granite_comments_internal_comment_replication_content_filter_fac().

com_adobe_granite_comments_internal_comment_replication_content_filter_fac_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_compatrouter_impl_compat_switching_service_impl
%%==============================================================================

com_adobe_granite_compatrouter_impl_compat_switching_service_impl() ->
  openapi_api:com_adobe_granite_compatrouter_impl_compat_switching_service_impl().

com_adobe_granite_compatrouter_impl_compat_switching_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_compatrouter_impl_routing_config
%%==============================================================================

com_adobe_granite_compatrouter_impl_routing_config() ->
  openapi_api:com_adobe_granite_compatrouter_impl_routing_config().

com_adobe_granite_compatrouter_impl_routing_config_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_compatrouter_impl_switch_mapping_config
%%==============================================================================

com_adobe_granite_compatrouter_impl_switch_mapping_config() ->
  openapi_api:com_adobe_granite_compatrouter_impl_switch_mapping_config().

com_adobe_granite_compatrouter_impl_switch_mapping_config_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving
%%==============================================================================

com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving() ->
  openapi_api:com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving().

com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_contexthub_impl_context_hub_impl
%%==============================================================================

com_adobe_granite_contexthub_impl_context_hub_impl() ->
  openapi_api:com_adobe_granite_contexthub_impl_context_hub_impl().

com_adobe_granite_contexthub_impl_context_hub_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_cors_impl_cors_policy_impl
%%==============================================================================

com_adobe_granite_cors_impl_cors_policy_impl() ->
  openapi_api:com_adobe_granite_cors_impl_cors_policy_impl().

com_adobe_granite_cors_impl_cors_policy_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_csrf_impl_csrf_filter
%%==============================================================================

com_adobe_granite_csrf_impl_csrf_filter() ->
  openapi_api:com_adobe_granite_csrf_impl_csrf_filter().

com_adobe_granite_csrf_impl_csrf_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_csrf_impl_csrf_servlet
%%==============================================================================

com_adobe_granite_csrf_impl_csrf_servlet() ->
  openapi_api:com_adobe_granite_csrf_impl_csrf_servlet().

com_adobe_granite_csrf_impl_csrf_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se
%%==============================================================================

com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se() ->
  openapi_api:com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se().

com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_diff_diff_changes_observer
%%==============================================================================

com_adobe_granite_distribution_core_impl_diff_diff_changes_observer() ->
  openapi_api:com_adobe_granite_distribution_core_impl_diff_diff_changes_observer().

com_adobe_granite_distribution_core_impl_diff_diff_changes_observer_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_diff_diff_event_listener
%%==============================================================================

com_adobe_granite_distribution_core_impl_diff_diff_event_listener() ->
  openapi_api:com_adobe_granite_distribution_core_impl_diff_diff_event_listener().

com_adobe_granite_distribution_core_impl_diff_diff_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_distribution_to_replication_even
%%==============================================================================

com_adobe_granite_distribution_core_impl_distribution_to_replication_even() ->
  openapi_api:com_adobe_granite_distribution_core_impl_distribution_to_replication_even().

com_adobe_granite_distribution_core_impl_distribution_to_replication_even_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_replication_adapters_replicat
%%==============================================================================

com_adobe_granite_distribution_core_impl_replication_adapters_replicat() ->
  openapi_api:com_adobe_granite_distribution_core_impl_replication_adapters_replicat().

com_adobe_granite_distribution_core_impl_replication_adapters_replicat_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_replication_distribution_trans
%%==============================================================================

com_adobe_granite_distribution_core_impl_replication_distribution_trans() ->
  openapi_api:com_adobe_granite_distribution_core_impl_replication_distribution_trans().

com_adobe_granite_distribution_core_impl_replication_distribution_trans_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_distribution_core_impl_transport_access_token_distribu
%%==============================================================================

com_adobe_granite_distribution_core_impl_transport_access_token_distribu() ->
  openapi_api:com_adobe_granite_distribution_core_impl_transport_access_token_distribu().

com_adobe_granite_distribution_core_impl_transport_access_token_distribu_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_frags_impl_check_http_header_flag
%%==============================================================================

com_adobe_granite_frags_impl_check_http_header_flag() ->
  openapi_api:com_adobe_granite_frags_impl_check_http_header_flag().

com_adobe_granite_frags_impl_check_http_header_flag_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_frags_impl_random_feature
%%==============================================================================

com_adobe_granite_frags_impl_random_feature() ->
  openapi_api:com_adobe_granite_frags_impl_random_feature().

com_adobe_granite_frags_impl_random_feature_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_httpcache_file_file_cache_store
%%==============================================================================

com_adobe_granite_httpcache_file_file_cache_store() ->
  openapi_api:com_adobe_granite_httpcache_file_file_cache_store().

com_adobe_granite_httpcache_file_file_cache_store_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_httpcache_impl_outer_cache_filter
%%==============================================================================

com_adobe_granite_httpcache_impl_outer_cache_filter() ->
  openapi_api:com_adobe_granite_httpcache_impl_outer_cache_filter().

com_adobe_granite_httpcache_impl_outer_cache_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_i18n_impl_bundle_pseudo_translations
%%==============================================================================

com_adobe_granite_i18n_impl_bundle_pseudo_translations() ->
  openapi_api:com_adobe_granite_i18n_impl_bundle_pseudo_translations().

com_adobe_granite_i18n_impl_bundle_pseudo_translations_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_i18n_impl_preferences_locale_resolver_service
%%==============================================================================

com_adobe_granite_i18n_impl_preferences_locale_resolver_service() ->
  openapi_api:com_adobe_granite_i18n_impl_preferences_locale_resolver_service().

com_adobe_granite_i18n_impl_preferences_locale_resolver_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_infocollector_info_collector
%%==============================================================================

com_adobe_granite_infocollector_info_collector() ->
  openapi_api:com_adobe_granite_infocollector_info_collector().

com_adobe_granite_infocollector_info_collector_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory
%%==============================================================================

com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory() ->
  openapi_api:com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory().

com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_license_impl_license_check_filter
%%==============================================================================

com_adobe_granite_license_impl_license_check_filter() ->
  openapi_api:com_adobe_granite_license_impl_license_check_filter().

com_adobe_granite_license_impl_license_check_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_logging_impl_log_analyser_impl
%%==============================================================================

com_adobe_granite_logging_impl_log_analyser_impl() ->
  openapi_api:com_adobe_granite_logging_impl_log_analyser_impl().

com_adobe_granite_logging_impl_log_analyser_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_logging_impl_log_error_health_check
%%==============================================================================

com_adobe_granite_logging_impl_log_error_health_check() ->
  openapi_api:com_adobe_granite_logging_impl_log_error_health_check().

com_adobe_granite_logging_impl_log_error_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task
%%==============================================================================

com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task() ->
  openapi_api:com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task().

com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task
%%==============================================================================

com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task() ->
  openapi_api:com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task().

com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_maintenance_crx_impl_revision_cleanup_task
%%==============================================================================

com_adobe_granite_maintenance_crx_impl_revision_cleanup_task() ->
  openapi_api:com_adobe_granite_maintenance_crx_impl_revision_cleanup_task().

com_adobe_granite_maintenance_crx_impl_revision_cleanup_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_monitoring_impl_script_config_impl
%%==============================================================================

com_adobe_granite_monitoring_impl_script_config_impl() ->
  openapi_api:com_adobe_granite_monitoring_impl_script_config_impl().

com_adobe_granite_monitoring_impl_script_config_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han
%%==============================================================================

com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han() ->
  openapi_api:com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han().

com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_oauth_server_impl_access_token_cleanup_task
%%==============================================================================

com_adobe_granite_oauth_server_impl_access_token_cleanup_task() ->
  openapi_api:com_adobe_granite_oauth_server_impl_access_token_cleanup_task().

com_adobe_granite_oauth_server_impl_access_token_cleanup_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet
%%==============================================================================

com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet() ->
  openapi_api:com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet().

com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet
%%==============================================================================

com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet() ->
  openapi_api:com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet().

com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet
%%==============================================================================

com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet() ->
  openapi_api:com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet().

com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet
%%==============================================================================

com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet() ->
  openapi_api:com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet().

com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_offloading_impl_offloading_configurator
%%==============================================================================

com_adobe_granite_offloading_impl_offloading_configurator() ->
  openapi_api:com_adobe_granite_offloading_impl_offloading_configurator().

com_adobe_granite_offloading_impl_offloading_configurator_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_offloading_impl_offloading_job_cloner
%%==============================================================================

com_adobe_granite_offloading_impl_offloading_job_cloner() ->
  openapi_api:com_adobe_granite_offloading_impl_offloading_job_cloner().

com_adobe_granite_offloading_impl_offloading_job_cloner_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_offloading_impl_offloading_job_offloader
%%==============================================================================

com_adobe_granite_offloading_impl_offloading_job_offloader() ->
  openapi_api:com_adobe_granite_offloading_impl_offloading_job_offloader().

com_adobe_granite_offloading_impl_offloading_job_offloader_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_offloading_impl_transporter_offloading_agent_manager
%%==============================================================================

com_adobe_granite_offloading_impl_transporter_offloading_agent_manager() ->
  openapi_api:com_adobe_granite_offloading_impl_transporter_offloading_agent_manager().

com_adobe_granite_offloading_impl_transporter_offloading_agent_manager_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_offloading_impl_transporter_offloading_default_transpo
%%==============================================================================

com_adobe_granite_offloading_impl_transporter_offloading_default_transpo() ->
  openapi_api:com_adobe_granite_offloading_impl_transporter_offloading_default_transpo().

com_adobe_granite_offloading_impl_transporter_offloading_default_transpo_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_omnisearch_impl_core_omni_search_service_impl
%%==============================================================================

com_adobe_granite_omnisearch_impl_core_omni_search_service_impl() ->
  openapi_api:com_adobe_granite_omnisearch_impl_core_omni_search_service_impl().

com_adobe_granite_omnisearch_impl_core_omni_search_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_optout_impl_opt_out_service_impl
%%==============================================================================

com_adobe_granite_optout_impl_opt_out_service_impl() ->
  openapi_api:com_adobe_granite_optout_impl_opt_out_service_impl().

com_adobe_granite_optout_impl_opt_out_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_queries_impl_hc_async_index_health_check
%%==============================================================================

com_adobe_granite_queries_impl_hc_async_index_health_check() ->
  openapi_api:com_adobe_granite_queries_impl_hc_async_index_health_check().

com_adobe_granite_queries_impl_hc_async_index_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_queries_impl_hc_large_index_health_check
%%==============================================================================

com_adobe_granite_queries_impl_hc_large_index_health_check() ->
  openapi_api:com_adobe_granite_queries_impl_hc_large_index_health_check().

com_adobe_granite_queries_impl_hc_large_index_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_queries_impl_hc_queries_status_health_check
%%==============================================================================

com_adobe_granite_queries_impl_hc_queries_status_health_check() ->
  openapi_api:com_adobe_granite_queries_impl_hc_queries_status_health_check().

com_adobe_granite_queries_impl_hc_queries_status_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_queries_impl_hc_query_health_check_metrics
%%==============================================================================

com_adobe_granite_queries_impl_hc_query_health_check_metrics() ->
  openapi_api:com_adobe_granite_queries_impl_hc_query_health_check_metrics().

com_adobe_granite_queries_impl_hc_query_health_check_metrics_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_queries_impl_hc_query_limits_health_check
%%==============================================================================

com_adobe_granite_queries_impl_hc_query_limits_health_check() ->
  openapi_api:com_adobe_granite_queries_impl_hc_query_limits_health_check().

com_adobe_granite_queries_impl_hc_query_limits_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_replication_hc_impl_replication_queue_health_check
%%==============================================================================

com_adobe_granite_replication_hc_impl_replication_queue_health_check() ->
  openapi_api:com_adobe_granite_replication_hc_impl_replication_queue_health_check().

com_adobe_granite_replication_hc_impl_replication_queue_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_replication_hc_impl_replication_transport_users_health_c
%%==============================================================================

com_adobe_granite_replication_hc_impl_replication_transport_users_health_c() ->
  openapi_api:com_adobe_granite_replication_hc_impl_replication_transport_users_health_c().

com_adobe_granite_replication_hc_impl_replication_transport_users_health_c_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check
%%==============================================================================

com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check() ->
  openapi_api:com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check().

com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c
%%==============================================================================

com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c() ->
  openapi_api:com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c().

com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_continuous_rgc_health_check
%%==============================================================================

com_adobe_granite_repository_hc_impl_continuous_rgc_health_check() ->
  openapi_api:com_adobe_granite_repository_hc_impl_continuous_rgc_health_check().

com_adobe_granite_repository_hc_impl_continuous_rgc_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che
%%==============================================================================

com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che() ->
  openapi_api:com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che().

com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_default_logins_health_check
%%==============================================================================

com_adobe_granite_repository_hc_impl_default_logins_health_check() ->
  openapi_api:com_adobe_granite_repository_hc_impl_default_logins_health_check().

com_adobe_granite_repository_hc_impl_default_logins_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_disk_space_health_check
%%==============================================================================

com_adobe_granite_repository_hc_impl_disk_space_health_check() ->
  openapi_api:com_adobe_granite_repository_hc_impl_disk_space_health_check().

com_adobe_granite_repository_hc_impl_disk_space_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_hc_impl_observation_queue_length_health_check
%%==============================================================================

com_adobe_granite_repository_hc_impl_observation_queue_length_health_check() ->
  openapi_api:com_adobe_granite_repository_hc_impl_observation_queue_length_health_check().

com_adobe_granite_repository_hc_impl_observation_queue_length_health_check_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_impl_commit_stats_config
%%==============================================================================

com_adobe_granite_repository_impl_commit_stats_config() ->
  openapi_api:com_adobe_granite_repository_impl_commit_stats_config().

com_adobe_granite_repository_impl_commit_stats_config_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_repository_service_user_configuration
%%==============================================================================

com_adobe_granite_repository_service_user_configuration() ->
  openapi_api:com_adobe_granite_repository_service_user_configuration().

com_adobe_granite_repository_service_user_configuration_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im
%%==============================================================================

com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im() ->
  openapi_api:com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im().

com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_resourcestatus_impl_composite_status_type
%%==============================================================================

com_adobe_granite_resourcestatus_impl_composite_status_type() ->
  openapi_api:com_adobe_granite_resourcestatus_impl_composite_status_type().

com_adobe_granite_resourcestatus_impl_composite_status_type_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_resourcestatus_impl_status_resource_provider_impl
%%==============================================================================

com_adobe_granite_resourcestatus_impl_status_resource_provider_impl() ->
  openapi_api:com_adobe_granite_resourcestatus_impl_status_resource_provider_impl().

com_adobe_granite_resourcestatus_impl_status_resource_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_rest_assets_impl_asset_content_disposition_filter
%%==============================================================================

com_adobe_granite_rest_assets_impl_asset_content_disposition_filter() ->
  openapi_api:com_adobe_granite_rest_assets_impl_asset_content_disposition_filter().

com_adobe_granite_rest_assets_impl_asset_content_disposition_filter_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl
%%==============================================================================

com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl() ->
  openapi_api:com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl().

com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_rest_impl_servlet_default_get_servlet
%%==============================================================================

com_adobe_granite_rest_impl_servlet_default_get_servlet() ->
  openapi_api:com_adobe_granite_rest_impl_servlet_default_get_servlet().

com_adobe_granite_rest_impl_servlet_default_get_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s
%%==============================================================================

com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s() ->
  openapi_api:com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s().

com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_security_user_user_properties_service
%%==============================================================================

com_adobe_granite_security_user_user_properties_service() ->
  openapi_api:com_adobe_granite_security_user_user_properties_service().

com_adobe_granite_security_user_user_properties_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_socialgraph_impl_social_graph_factory_impl
%%==============================================================================

com_adobe_granite_socialgraph_impl_social_graph_factory_impl() ->
  openapi_api:com_adobe_granite_socialgraph_impl_social_graph_factory_impl().

com_adobe_granite_socialgraph_impl_social_graph_factory_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl
%%==============================================================================

com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl() ->
  openapi_api:com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl().

com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory
%%==============================================================================

com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory() ->
  openapi_api:com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory().

com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_taskmanagement_impl_jcr_task_archive_service
%%==============================================================================

com_adobe_granite_taskmanagement_impl_jcr_task_archive_service() ->
  openapi_api:com_adobe_granite_taskmanagement_impl_jcr_task_archive_service().

com_adobe_granite_taskmanagement_impl_jcr_task_archive_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task
%%==============================================================================

com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task() ->
  openapi_api:com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task().

com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor
%%==============================================================================

com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor() ->
  openapi_api:com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor().

com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_threaddump_thread_dump_collector
%%==============================================================================

com_adobe_granite_threaddump_thread_dump_collector() ->
  openapi_api:com_adobe_granite_threaddump_thread_dump_collector().

com_adobe_granite_threaddump_thread_dump_collector_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl
%%==============================================================================

com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl() ->
  openapi_api:com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl().

com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_translation_core_impl_translation_manager_impl
%%==============================================================================

com_adobe_granite_translation_core_impl_translation_manager_impl() ->
  openapi_api:com_adobe_granite_translation_core_impl_translation_manager_impl().

com_adobe_granite_translation_core_impl_translation_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl
%%==============================================================================

com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl() ->
  openapi_api:com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl().

com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_console_frags_workflow_withdraw_feature
%%==============================================================================

com_adobe_granite_workflow_console_frags_workflow_withdraw_feature() ->
  openapi_api:com_adobe_granite_workflow_console_frags_workflow_withdraw_feature().

com_adobe_granite_workflow_console_frags_workflow_withdraw_feature_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_console_publish_workflow_publish_event_service
%%==============================================================================

com_adobe_granite_workflow_console_publish_workflow_publish_event_service() ->
  openapi_api:com_adobe_granite_workflow_console_publish_workflow_publish_event_service().

com_adobe_granite_workflow_console_publish_workflow_publish_event_service_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_jcr_workflow_bucket_manager
%%==============================================================================

com_adobe_granite_workflow_core_jcr_workflow_bucket_manager() ->
  openapi_api:com_adobe_granite_workflow_core_jcr_workflow_bucket_manager().

com_adobe_granite_workflow_core_jcr_workflow_bucket_manager_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_job_external_process_job_handler
%%==============================================================================

com_adobe_granite_workflow_core_job_external_process_job_handler() ->
  openapi_api:com_adobe_granite_workflow_core_job_external_process_job_handler().

com_adobe_granite_workflow_core_job_external_process_job_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_job_job_handler
%%==============================================================================

com_adobe_granite_workflow_core_job_job_handler() ->
  openapi_api:com_adobe_granite_workflow_core_job_job_handler().

com_adobe_granite_workflow_core_job_job_handler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum
%%==============================================================================

com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum() ->
  openapi_api:com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum().

com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_payload_map_cache
%%==============================================================================

com_adobe_granite_workflow_core_payload_map_cache() ->
  openapi_api:com_adobe_granite_workflow_core_payload_map_cache().

com_adobe_granite_workflow_core_payload_map_cache_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_payloadmap_payload_move_listener
%%==============================================================================

com_adobe_granite_workflow_core_payloadmap_payload_move_listener() ->
  openapi_api:com_adobe_granite_workflow_core_payloadmap_payload_move_listener().

com_adobe_granite_workflow_core_payloadmap_payload_move_listener_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_workflow_config
%%==============================================================================

com_adobe_granite_workflow_core_workflow_config() ->
  openapi_api:com_adobe_granite_workflow_core_workflow_config().

com_adobe_granite_workflow_core_workflow_config_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_core_workflow_session_factory
%%==============================================================================

com_adobe_granite_workflow_core_workflow_session_factory() ->
  openapi_api:com_adobe_granite_workflow_core_workflow_session_factory().

com_adobe_granite_workflow_core_workflow_session_factory_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_granite_workflow_purge_scheduler
%%==============================================================================

com_adobe_granite_workflow_purge_scheduler() ->
  openapi_api:com_adobe_granite_workflow_purge_scheduler().

com_adobe_granite_workflow_purge_scheduler_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_octopus_ncomm_bootstrap
%%==============================================================================

com_adobe_octopus_ncomm_bootstrap() ->
  openapi_api:com_adobe_octopus_ncomm_bootstrap().

com_adobe_octopus_ncomm_bootstrap_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s
%%==============================================================================

com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s() ->
  openapi_api:com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s().

com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s_args(_S) ->
  [].

%%==============================================================================
%% com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm
%%==============================================================================

com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm() ->
  openapi_api:com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm().

com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm_args(_S) ->
  [].

%%==============================================================================
%% com_day_commons_datasource_jdbcpool_jdbc_pool_service
%%==============================================================================

com_day_commons_datasource_jdbcpool_jdbc_pool_service() ->
  openapi_api:com_day_commons_datasource_jdbcpool_jdbc_pool_service().

com_day_commons_datasource_jdbcpool_jdbc_pool_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_commons_httpclient
%%==============================================================================

com_day_commons_httpclient() ->
  openapi_api:com_day_commons_httpclient().

com_day_commons_httpclient_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_impl_store_properties_change_listener
%%==============================================================================

com_day_cq_analytics_impl_store_properties_change_listener() ->
  openapi_api:com_day_cq_analytics_impl_store_properties_change_listener().

com_day_cq_analytics_impl_store_properties_change_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte
%%==============================================================================

com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte() ->
  openapi_api:com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte().

com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_sitecatalyst_impl_importer_report_importer
%%==============================================================================

com_day_cq_analytics_sitecatalyst_impl_importer_report_importer() ->
  openapi_api:com_day_cq_analytics_sitecatalyst_impl_importer_report_importer().

com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory
%%==============================================================================

com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory() ->
  openapi_api:com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory().

com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl
%%==============================================================================

com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl() ->
  openapi_api:com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl().

com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_account_options_updater
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_account_options_updater() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_account_options_updater().

com_day_cq_analytics_testandtarget_impl_account_options_updater_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener().

com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener().

com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_segment_importer
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_segment_importer() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_segment_importer().

com_day_cq_analytics_testandtarget_impl_segment_importer_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_service_web_service_impl
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_service_web_service_impl() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_service_web_service_impl().

com_day_cq_analytics_testandtarget_impl_service_web_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet().

com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl
%%==============================================================================

com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl() ->
  openapi_api:com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl().

com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_auth_impl_cug_cug_support_impl
%%==============================================================================

com_day_cq_auth_impl_cug_cug_support_impl() ->
  openapi_api:com_day_cq_auth_impl_cug_cug_support_impl().

com_day_cq_auth_impl_cug_cug_support_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_auth_impl_login_selector_handler
%%==============================================================================

com_day_cq_auth_impl_login_selector_handler() ->
  openapi_api:com_day_cq_auth_impl_login_selector_handler().

com_day_cq_auth_impl_login_selector_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_commons_impl_externalizer_impl
%%==============================================================================

com_day_cq_commons_impl_externalizer_impl() ->
  openapi_api:com_day_cq_commons_impl_externalizer_impl().

com_day_cq_commons_impl_externalizer_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_commons_servlets_root_mapping_servlet
%%==============================================================================

com_day_cq_commons_servlets_root_mapping_servlet() ->
  openapi_api:com_day_cq_commons_servlets_root_mapping_servlet().

com_day_cq_commons_servlets_root_mapping_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke
%%==============================================================================

com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke() ->
  openapi_api:com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke().

com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list
%%==============================================================================

com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list() ->
  openapi_api:com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list().

com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist
%%==============================================================================

com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist() ->
  openapi_api:com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist().

com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_contentsync_impl_content_sync_manager_impl
%%==============================================================================

com_day_cq_contentsync_impl_content_sync_manager_impl() ->
  openapi_api:com_day_cq_contentsync_impl_content_sync_manager_impl().

com_day_cq_contentsync_impl_content_sync_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_commons_handler_standard_image_handler
%%==============================================================================

com_day_cq_dam_commons_handler_standard_image_handler() ->
  openapi_api:com_day_cq_dam_commons_handler_standard_image_handler().

com_day_cq_dam_commons_handler_standard_image_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_commons_metadata_xmp_filter_black_white
%%==============================================================================

com_day_cq_dam_commons_metadata_xmp_filter_black_white() ->
  openapi_api:com_day_cq_dam_commons_metadata_xmp_filter_black_white().

com_day_cq_dam_commons_metadata_xmp_filter_black_white_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_commons_util_impl_asset_cache_impl
%%==============================================================================

com_day_cq_dam_commons_util_impl_asset_cache_impl() ->
  openapi_api:com_day_cq_dam_commons_util_impl_asset_cache_impl().

com_day_cq_dam_commons_util_impl_asset_cache_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config
%%==============================================================================

com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config() ->
  openapi_api:com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config().

com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_asset_move_listener
%%==============================================================================

com_day_cq_dam_core_impl_asset_move_listener() ->
  openapi_api:com_day_cq_dam_core_impl_asset_move_listener().

com_day_cq_dam_core_impl_asset_move_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_assethome_asset_home_page_configuration
%%==============================================================================

com_day_cq_dam_core_impl_assethome_asset_home_page_configuration() ->
  openapi_api:com_day_cq_dam_core_impl_assethome_asset_home_page_configuration().

com_day_cq_dam_core_impl_assethome_asset_home_page_configuration_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet
%%==============================================================================

com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet().

com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_cache_cq_buffered_image_cache
%%==============================================================================

com_day_cq_dam_core_impl_cache_cq_buffered_image_cache() ->
  openapi_api:com_day_cq_dam_core_impl_cache_cq_buffered_image_cache().

com_day_cq_dam_core_impl_cache_cq_buffered_image_cache_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_dam_change_event_listener
%%==============================================================================

com_day_cq_dam_core_impl_dam_change_event_listener() ->
  openapi_api:com_day_cq_dam_core_impl_dam_change_event_listener().

com_day_cq_dam_core_impl_dam_change_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_dam_event_purge_service
%%==============================================================================

com_day_cq_dam_core_impl_dam_event_purge_service() ->
  openapi_api:com_day_cq_dam_core_impl_dam_event_purge_service().

com_day_cq_dam_core_impl_dam_event_purge_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_dam_event_recorder_impl
%%==============================================================================

com_day_cq_dam_core_impl_dam_event_recorder_impl() ->
  openapi_api:com_day_cq_dam_core_impl_dam_event_recorder_impl().

com_day_cq_dam_core_impl_dam_event_recorder_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_event_dam_event_audit_listener
%%==============================================================================

com_day_cq_dam_core_impl_event_dam_event_audit_listener() ->
  openapi_api:com_day_cq_dam_core_impl_event_dam_event_audit_listener().

com_day_cq_dam_core_impl_event_dam_event_audit_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_expiry_notification_job_impl
%%==============================================================================

com_day_cq_dam_core_impl_expiry_notification_job_impl() ->
  openapi_api:com_day_cq_dam_core_impl_expiry_notification_job_impl().

com_day_cq_dam_core_impl_expiry_notification_job_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat
%%==============================================================================

com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat() ->
  openapi_api:com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat().

com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_gfx_commons_gfx_renderer
%%==============================================================================

com_day_cq_dam_core_impl_gfx_commons_gfx_renderer() ->
  openapi_api:com_day_cq_dam_core_impl_gfx_commons_gfx_renderer().

com_day_cq_dam_core_impl_gfx_commons_gfx_renderer_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_handler_eps_format_handler
%%==============================================================================

com_day_cq_dam_core_impl_handler_eps_format_handler() ->
  openapi_api:com_day_cq_dam_core_impl_handler_eps_format_handler().

com_day_cq_dam_core_impl_handler_eps_format_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_handler_indesign_format_handler
%%==============================================================================

com_day_cq_dam_core_impl_handler_indesign_format_handler() ->
  openapi_api:com_day_cq_dam_core_impl_handler_indesign_format_handler().

com_day_cq_dam_core_impl_handler_indesign_format_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_handler_jpeg_handler
%%==============================================================================

com_day_cq_dam_core_impl_handler_jpeg_handler() ->
  openapi_api:com_day_cq_dam_core_impl_handler_jpeg_handler().

com_day_cq_dam_core_impl_handler_jpeg_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler
%%==============================================================================

com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler() ->
  openapi_api:com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler().

com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_jmx_asset_index_update_monitor
%%==============================================================================

com_day_cq_dam_core_impl_jmx_asset_index_update_monitor() ->
  openapi_api:com_day_cq_dam_core_impl_jmx_asset_index_update_monitor().

com_day_cq_dam_core_impl_jmx_asset_index_update_monitor_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl
%%==============================================================================

com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl() ->
  openapi_api:com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl().

com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl
%%==============================================================================

com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl() ->
  openapi_api:com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl().

com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config
%%==============================================================================

com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config() ->
  openapi_api:com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config().

com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config
%%==============================================================================

com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config() ->
  openapi_api:com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config().

com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_lightbox_lightbox_servlet
%%==============================================================================

com_day_cq_dam_core_impl_lightbox_lightbox_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_lightbox_lightbox_servlet().

com_day_cq_dam_core_impl_lightbox_lightbox_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_metadata_editor_select_component_handler
%%==============================================================================

com_day_cq_dam_core_impl_metadata_editor_select_component_handler() ->
  openapi_api:com_day_cq_dam_core_impl_metadata_editor_select_component_handler().

com_day_cq_dam_core_impl_metadata_editor_select_component_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper
%%==============================================================================

com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper() ->
  openapi_api:com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper().

com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl
%%==============================================================================

com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl() ->
  openapi_api:com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl().

com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_missing_metadata_notification_job
%%==============================================================================

com_day_cq_dam_core_impl_missing_metadata_notification_job() ->
  openapi_api:com_day_cq_dam_core_impl_missing_metadata_notification_job().

com_day_cq_dam_core_impl_missing_metadata_notification_job_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr
%%==============================================================================

com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr() ->
  openapi_api:com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr().

com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_process_text_extraction_process
%%==============================================================================

com_day_cq_dam_core_impl_process_text_extraction_process() ->
  openapi_api:com_day_cq_dam_core_impl_process_text_extraction_process().

com_day_cq_dam_core_impl_process_text_extraction_process_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_rendition_maker_impl
%%==============================================================================

com_day_cq_dam_core_impl_rendition_maker_impl() ->
  openapi_api:com_day_cq_dam_core_impl_rendition_maker_impl().

com_day_cq_dam_core_impl_rendition_maker_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_reports_report_export_service
%%==============================================================================

com_day_cq_dam_core_impl_reports_report_export_service() ->
  openapi_api:com_day_cq_dam_core_impl_reports_report_export_service().

com_day_cq_dam_core_impl_reports_report_export_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_reports_report_purge_service
%%==============================================================================

com_day_cq_dam_core_impl_reports_report_purge_service() ->
  openapi_api:com_day_cq_dam_core_impl_reports_report_purge_service().

com_day_cq_dam_core_impl_reports_report_purge_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_asset_download_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_asset_download_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_asset_download_servlet().

com_day_cq_dam_core_impl_servlet_asset_download_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_asset_status_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_asset_status_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_asset_status_servlet().

com_day_cq_dam_core_impl_servlet_asset_status_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet().

com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_batch_metadata_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_batch_metadata_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_batch_metadata_servlet().

com_day_cq_dam_core_impl_servlet_batch_metadata_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_binary_provider_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_binary_provider_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_binary_provider_servlet().

com_day_cq_dam_core_impl_servlet_binary_provider_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_collection_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_collection_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_collection_servlet().

com_day_cq_dam_core_impl_servlet_collection_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_collections_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_collections_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_collections_servlet().

com_day_cq_dam_core_impl_servlet_collections_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_companion_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_companion_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_companion_servlet().

com_day_cq_dam_core_impl_servlet_companion_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_create_asset_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_create_asset_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_create_asset_servlet().

com_day_cq_dam_core_impl_servlet_create_asset_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter
%%==============================================================================

com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter().

com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_guid_lookup_filter
%%==============================================================================

com_day_cq_dam_core_impl_servlet_guid_lookup_filter() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_guid_lookup_filter().

com_day_cq_dam_core_impl_servlet_guid_lookup_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_health_check_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_health_check_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_health_check_servlet().

com_day_cq_dam_core_impl_servlet_health_check_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_metadata_get_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_metadata_get_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_metadata_get_servlet().

com_day_cq_dam_core_impl_servlet_metadata_get_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet().

com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_servlet_resource_collection_servlet
%%==============================================================================

com_day_cq_dam_core_impl_servlet_resource_collection_servlet() ->
  openapi_api:com_day_cq_dam_core_impl_servlet_resource_collection_servlet().

com_day_cq_dam_core_impl_servlet_resource_collection_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl
%%==============================================================================

com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl() ->
  openapi_api:com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl().

com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_impl_unzip_unzip_config
%%==============================================================================

com_day_cq_dam_core_impl_unzip_unzip_config() ->
  openapi_api:com_day_cq_dam_core_impl_unzip_unzip_config().

com_day_cq_dam_core_impl_unzip_unzip_config_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_process_exif_tool_extract_metadata_process
%%==============================================================================

com_day_cq_dam_core_process_exif_tool_extract_metadata_process() ->
  openapi_api:com_day_cq_dam_core_process_exif_tool_extract_metadata_process().

com_day_cq_dam_core_process_exif_tool_extract_metadata_process_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_process_extract_metadata_process
%%==============================================================================

com_day_cq_dam_core_process_extract_metadata_process() ->
  openapi_api:com_day_cq_dam_core_process_extract_metadata_process().

com_day_cq_dam_core_process_extract_metadata_process_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_core_process_metadata_processor_process
%%==============================================================================

com_day_cq_dam_core_process_metadata_processor_process() ->
  openapi_api:com_day_cq_dam_core_process_metadata_processor_process().

com_day_cq_dam_core_process_metadata_processor_process_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_handler_ffmpeg_locator_impl
%%==============================================================================

com_day_cq_dam_handler_ffmpeg_locator_impl() ->
  openapi_api:com_day_cq_dam_handler_ffmpeg_locator_impl().

com_day_cq_dam_handler_ffmpeg_locator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl
%%==============================================================================

com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl() ->
  openapi_api:com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl().

com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_handler_standard_pdf_pdf_handler
%%==============================================================================

com_day_cq_dam_handler_standard_pdf_pdf_handler() ->
  openapi_api:com_day_cq_dam_handler_standard_pdf_pdf_handler().

com_day_cq_dam_handler_standard_pdf_pdf_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_handler_standard_ps_post_script_handler
%%==============================================================================

com_day_cq_dam_handler_standard_ps_post_script_handler() ->
  openapi_api:com_day_cq_dam_handler_standard_ps_post_script_handler().

com_day_cq_dam_handler_standard_ps_post_script_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_handler_standard_psd_psd_handler
%%==============================================================================

com_day_cq_dam_handler_standard_psd_psd_handler() ->
  openapi_api:com_day_cq_dam_handler_standard_psd_psd_handler().

com_day_cq_dam_handler_standard_psd_psd_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_ids_impl_ids_job_processor
%%==============================================================================

com_day_cq_dam_ids_impl_ids_job_processor() ->
  openapi_api:com_day_cq_dam_ids_impl_ids_job_processor().

com_day_cq_dam_ids_impl_ids_job_processor_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_ids_impl_ids_pool_manager_impl
%%==============================================================================

com_day_cq_dam_ids_impl_ids_pool_manager_impl() ->
  openapi_api:com_day_cq_dam_ids_impl_ids_pool_manager_impl().

com_day_cq_dam_ids_impl_ids_pool_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_indd_impl_handler_indesign_xmp_handler
%%==============================================================================

com_day_cq_dam_indd_impl_handler_indesign_xmp_handler() ->
  openapi_api:com_day_cq_dam_indd_impl_handler_indesign_xmp_handler().

com_day_cq_dam_indd_impl_handler_indesign_xmp_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet
%%==============================================================================

com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet() ->
  openapi_api:com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet().

com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_indd_process_indd_media_extract_process
%%==============================================================================

com_day_cq_dam_indd_process_indd_media_extract_process() ->
  openapi_api:com_day_cq_dam_indd_process_indd_media_extract_process().

com_day_cq_dam_indd_process_indd_media_extract_process_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_performance_internal_asset_performance_data_handler_impl
%%==============================================================================

com_day_cq_dam_performance_internal_asset_performance_data_handler_impl() ->
  openapi_api:com_day_cq_dam_performance_internal_asset_performance_data_handler_impl().

com_day_cq_dam_performance_internal_asset_performance_data_handler_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_performance_internal_asset_performance_report_sync_job
%%==============================================================================

com_day_cq_dam_performance_internal_asset_performance_report_sync_job() ->
  openapi_api:com_day_cq_dam_performance_internal_asset_performance_report_sync_job().

com_day_cq_dam_performance_internal_asset_performance_report_sync_job_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro
%%==============================================================================

com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro() ->
  openapi_api:com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro().

com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even
%%==============================================================================

com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even() ->
  openapi_api:com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even().

com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner
%%==============================================================================

com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner() ->
  openapi_api:com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner().

com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_post_servlets_set_create_handler
%%==============================================================================

com_day_cq_dam_s7dam_common_post_servlets_set_create_handler() ->
  openapi_api:com_day_cq_dam_s7dam_common_post_servlets_set_create_handler().

com_day_cq_dam_s7dam_common_post_servlets_set_create_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler
%%==============================================================================

com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler() ->
  openapi_api:com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler().

com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process
%%==============================================================================

com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process() ->
  openapi_api:com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process().

com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener
%%==============================================================================

com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener() ->
  openapi_api:com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener().

com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet
%%==============================================================================

com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet() ->
  openapi_api:com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet().

com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl
%%==============================================================================

com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl() ->
  openapi_api:com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl().

com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_scene7_impl_scene7_api_client_impl
%%==============================================================================

com_day_cq_dam_scene7_impl_scene7_api_client_impl() ->
  openapi_api:com_day_cq_dam_scene7_impl_scene7_api_client_impl().

com_day_cq_dam_scene7_impl_scene7_api_client_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl
%%==============================================================================

com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl() ->
  openapi_api:com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl().

com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_scene7_impl_scene7_configuration_event_listener
%%==============================================================================

com_day_cq_dam_scene7_impl_scene7_configuration_event_listener() ->
  openapi_api:com_day_cq_dam_scene7_impl_scene7_configuration_event_listener().

com_day_cq_dam_scene7_impl_scene7_configuration_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener
%%==============================================================================

com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener() ->
  openapi_api:com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener().

com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl
%%==============================================================================

com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl() ->
  openapi_api:com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl().

com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_scene7_impl_scene7_upload_service_impl
%%==============================================================================

com_day_cq_dam_scene7_impl_scene7_upload_service_impl() ->
  openapi_api:com_day_cq_dam_scene7_impl_scene7_upload_service_impl().

com_day_cq_dam_scene7_impl_scene7_upload_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser
%%==============================================================================

com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser() ->
  openapi_api:com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser().

com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_stock_integration_impl_configuration_stock_configuration
%%==============================================================================

com_day_cq_dam_stock_integration_impl_configuration_stock_configuration() ->
  openapi_api:com_day_cq_dam_stock_integration_impl_configuration_stock_configuration().

com_day_cq_dam_stock_integration_impl_configuration_stock_configuration_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_dam_video_impl_servlet_video_test_servlet
%%==============================================================================

com_day_cq_dam_video_impl_servlet_video_test_servlet() ->
  openapi_api:com_day_cq_dam_video_impl_servlet_video_test_servlet().

com_day_cq_dam_video_impl_servlet_video_test_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_extwidget_servlets_image_sprite_servlet
%%==============================================================================

com_day_cq_extwidget_servlets_image_sprite_servlet() ->
  openapi_api:com_day_cq_extwidget_servlets_image_sprite_servlet().

com_day_cq_extwidget_servlets_image_sprite_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_image_internal_font_font_helper
%%==============================================================================

com_day_cq_image_internal_font_font_helper() ->
  openapi_api:com_day_cq_image_internal_font_font_helper().

com_day_cq_image_internal_font_font_helper_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_jcrclustersupport_cluster_start_level_controller
%%==============================================================================

com_day_cq_jcrclustersupport_cluster_start_level_controller() ->
  openapi_api:com_day_cq_jcrclustersupport_cluster_start_level_controller().

com_day_cq_jcrclustersupport_cluster_start_level_controller_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mailer_default_mail_service
%%==============================================================================

com_day_cq_mailer_default_mail_service() ->
  openapi_api:com_day_cq_mailer_default_mail_service().

com_day_cq_mailer_default_mail_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mailer_impl_cq_mailing_service
%%==============================================================================

com_day_cq_mailer_impl_cq_mailing_service() ->
  openapi_api:com_day_cq_mailer_impl_cq_mailing_service().

com_day_cq_mailer_impl_cq_mailing_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mailer_impl_email_cq_email_template_factory
%%==============================================================================

com_day_cq_mailer_impl_email_cq_email_template_factory() ->
  openapi_api:com_day_cq_mailer_impl_email_cq_email_template_factory().

com_day_cq_mailer_impl_email_cq_email_template_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mailer_impl_email_cq_retriever_template_factory
%%==============================================================================

com_day_cq_mailer_impl_email_cq_retriever_template_factory() ->
  openapi_api:com_day_cq_mailer_impl_email_cq_retriever_template_factory().

com_day_cq_mailer_impl_email_cq_retriever_template_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_campaign_impl_integration_config_impl
%%==============================================================================

com_day_cq_mcm_campaign_impl_integration_config_impl() ->
  openapi_api:com_day_cq_mcm_campaign_impl_integration_config_impl().

com_day_cq_mcm_campaign_impl_integration_config_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_campaign_importer_personalized_text_handler_factory
%%==============================================================================

com_day_cq_mcm_campaign_importer_personalized_text_handler_factory() ->
  openapi_api:com_day_cq_mcm_campaign_importer_personalized_text_handler_factory().

com_day_cq_mcm_campaign_importer_personalized_text_handler_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_core_newsletter_newsletter_email_service_impl
%%==============================================================================

com_day_cq_mcm_core_newsletter_newsletter_email_service_impl() ->
  openapi_api:com_day_cq_mcm_core_newsletter_newsletter_email_service_impl().

com_day_cq_mcm_core_newsletter_newsletter_email_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_impl_mcm_configuration
%%==============================================================================

com_day_cq_mcm_impl_mcm_configuration() ->
  openapi_api:com_day_cq_mcm_impl_mcm_configuration().

com_day_cq_mcm_impl_mcm_configuration_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen
%%==============================================================================

com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen() ->
  openapi_api:com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen().

com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug
%%==============================================================================

com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug() ->
  openapi_api:com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug().

com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component
%%==============================================================================

com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component() ->
  openapi_api:com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component().

com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha
%%==============================================================================

com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha() ->
  openapi_api:com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha().

com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h
%%==============================================================================

com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h() ->
  openapi_api:com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h().

com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_notification_impl_notification_service_impl
%%==============================================================================

com_day_cq_notification_impl_notification_service_impl() ->
  openapi_api:com_day_cq_notification_impl_notification_service_impl().

com_day_cq_notification_impl_notification_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_personalization_impl_servlets_targeting_configuration_servlet
%%==============================================================================

com_day_cq_personalization_impl_servlets_targeting_configuration_servlet() ->
  openapi_api:com_day_cq_personalization_impl_servlets_targeting_configuration_servlet().

com_day_cq_personalization_impl_servlets_targeting_configuration_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_polling_importer_impl_managed_poll_config_impl
%%==============================================================================

com_day_cq_polling_importer_impl_managed_poll_config_impl() ->
  openapi_api:com_day_cq_polling_importer_impl_managed_poll_config_impl().

com_day_cq_polling_importer_impl_managed_poll_config_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_polling_importer_impl_managed_polling_importer_impl
%%==============================================================================

com_day_cq_polling_importer_impl_managed_polling_importer_impl() ->
  openapi_api:com_day_cq_polling_importer_impl_managed_polling_importer_impl().

com_day_cq_polling_importer_impl_managed_polling_importer_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_polling_importer_impl_polling_importer_impl
%%==============================================================================

com_day_cq_polling_importer_impl_polling_importer_impl() ->
  openapi_api:com_day_cq_polling_importer_impl_polling_importer_impl().

com_day_cq_polling_importer_impl_polling_importer_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_audit_replication_event_listener
%%==============================================================================

com_day_cq_replication_audit_replication_event_listener() ->
  openapi_api:com_day_cq_replication_audit_replication_event_listener().

com_day_cq_replication_audit_replication_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_content_static_content_builder
%%==============================================================================

com_day_cq_replication_content_static_content_builder() ->
  openapi_api:com_day_cq_replication_content_static_content_builder().

com_day_cq_replication_content_static_content_builder_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_agent_manager_impl
%%==============================================================================

com_day_cq_replication_impl_agent_manager_impl() ->
  openapi_api:com_day_cq_replication_impl_agent_manager_impl().

com_day_cq_replication_impl_agent_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_content_durbo_binary_less_content_builder
%%==============================================================================

com_day_cq_replication_impl_content_durbo_binary_less_content_builder() ->
  openapi_api:com_day_cq_replication_impl_content_durbo_binary_less_content_builder().

com_day_cq_replication_impl_content_durbo_binary_less_content_builder_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov
%%==============================================================================

com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov() ->
  openapi_api:com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov().

com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_replication_content_factory_provider_impl
%%==============================================================================

com_day_cq_replication_impl_replication_content_factory_provider_impl() ->
  openapi_api:com_day_cq_replication_impl_replication_content_factory_provider_impl().

com_day_cq_replication_impl_replication_content_factory_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_replication_receiver_impl
%%==============================================================================

com_day_cq_replication_impl_replication_receiver_impl() ->
  openapi_api:com_day_cq_replication_impl_replication_receiver_impl().

com_day_cq_replication_impl_replication_receiver_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_replicator_impl
%%==============================================================================

com_day_cq_replication_impl_replicator_impl() ->
  openapi_api:com_day_cq_replication_impl_replicator_impl().

com_day_cq_replication_impl_replicator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_reverse_replicator
%%==============================================================================

com_day_cq_replication_impl_reverse_replicator() ->
  openapi_api:com_day_cq_replication_impl_reverse_replicator().

com_day_cq_replication_impl_reverse_replicator_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_transport_binary_less_transport_handler
%%==============================================================================

com_day_cq_replication_impl_transport_binary_less_transport_handler() ->
  openapi_api:com_day_cq_replication_impl_transport_binary_less_transport_handler().

com_day_cq_replication_impl_transport_binary_less_transport_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_replication_impl_transport_http
%%==============================================================================

com_day_cq_replication_impl_transport_http() ->
  openapi_api:com_day_cq_replication_impl_transport_http().

com_day_cq_replication_impl_transport_http_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_reporting_impl_cache_cache_impl
%%==============================================================================

com_day_cq_reporting_impl_cache_cache_impl() ->
  openapi_api:com_day_cq_reporting_impl_cache_cache_impl().

com_day_cq_reporting_impl_cache_cache_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_reporting_impl_config_service_impl
%%==============================================================================

com_day_cq_reporting_impl_config_service_impl() ->
  openapi_api:com_day_cq_reporting_impl_config_service_impl().

com_day_cq_reporting_impl_config_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_reporting_impl_r_log_analyzer
%%==============================================================================

com_day_cq_reporting_impl_r_log_analyzer() ->
  openapi_api:com_day_cq_reporting_impl_r_log_analyzer().

com_day_cq_reporting_impl_r_log_analyzer_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_rewriter_linkchecker_impl_link_checker_impl
%%==============================================================================

com_day_cq_rewriter_linkchecker_impl_link_checker_impl() ->
  openapi_api:com_day_cq_rewriter_linkchecker_impl_link_checker_impl().

com_day_cq_rewriter_linkchecker_impl_link_checker_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_rewriter_linkchecker_impl_link_checker_task
%%==============================================================================

com_day_cq_rewriter_linkchecker_impl_link_checker_task() ->
  openapi_api:com_day_cq_rewriter_linkchecker_impl_link_checker_task().

com_day_cq_rewriter_linkchecker_impl_link_checker_task_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory
%%==============================================================================

com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory() ->
  openapi_api:com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory().

com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl
%%==============================================================================

com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl() ->
  openapi_api:com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl().

com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_rewriter_processor_impl_html_parser_factory
%%==============================================================================

com_day_cq_rewriter_processor_impl_html_parser_factory() ->
  openapi_api:com_day_cq_rewriter_processor_impl_html_parser_factory().

com_day_cq_rewriter_processor_impl_html_parser_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_search_impl_builder_query_builder_impl
%%==============================================================================

com_day_cq_search_impl_builder_query_builder_impl() ->
  openapi_api:com_day_cq_search_impl_builder_query_builder_impl().

com_day_cq_search_impl_builder_query_builder_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_search_suggest_impl_suggestion_index_manager_impl
%%==============================================================================

com_day_cq_search_suggest_impl_suggestion_index_manager_impl() ->
  openapi_api:com_day_cq_search_suggest_impl_suggestion_index_manager_impl().

com_day_cq_search_suggest_impl_suggestion_index_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_searchpromote_impl_publish_search_promote_config_handler
%%==============================================================================

com_day_cq_searchpromote_impl_publish_search_promote_config_handler() ->
  openapi_api:com_day_cq_searchpromote_impl_publish_search_promote_config_handler().

com_day_cq_searchpromote_impl_publish_search_promote_config_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_searchpromote_impl_search_promote_service_impl
%%==============================================================================

com_day_cq_searchpromote_impl_search_promote_service_impl() ->
  openapi_api:com_day_cq_searchpromote_impl_search_promote_service_impl().

com_day_cq_searchpromote_impl_search_promote_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_security_acl_setup
%%==============================================================================

com_day_cq_security_acl_setup() ->
  openapi_api:com_day_cq_security_acl_setup().

com_day_cq_security_acl_setup_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_statistics_impl_statistics_service_impl
%%==============================================================================

com_day_cq_statistics_impl_statistics_service_impl() ->
  openapi_api:com_day_cq_statistics_impl_statistics_service_impl().

com_day_cq_statistics_impl_statistics_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_tagging_impl_jcr_tag_manager_factory_impl
%%==============================================================================

com_day_cq_tagging_impl_jcr_tag_manager_factory_impl() ->
  openapi_api:com_day_cq_tagging_impl_jcr_tag_manager_factory_impl().

com_day_cq_tagging_impl_jcr_tag_manager_factory_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_tagging_impl_search_tag_predicate_evaluator
%%==============================================================================

com_day_cq_tagging_impl_search_tag_predicate_evaluator() ->
  openapi_api:com_day_cq_tagging_impl_search_tag_predicate_evaluator().

com_day_cq_tagging_impl_search_tag_predicate_evaluator_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_tagging_impl_tag_garbage_collector
%%==============================================================================

com_day_cq_tagging_impl_tag_garbage_collector() ->
  openapi_api:com_day_cq_tagging_impl_tag_garbage_collector().

com_day_cq_tagging_impl_tag_garbage_collector_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_contentsync_impl_handler_pages_update_handler
%%==============================================================================

com_day_cq_wcm_contentsync_impl_handler_pages_update_handler() ->
  openapi_api:com_day_cq_wcm_contentsync_impl_handler_pages_update_handler().

com_day_cq_wcm_contentsync_impl_handler_pages_update_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor
%%==============================================================================

com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor() ->
  openapi_api:com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor().

com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl
%%==============================================================================

com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl().

com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_commands_wcm_command_servlet
%%==============================================================================

com_day_cq_wcm_core_impl_commands_wcm_command_servlet() ->
  openapi_api:com_day_cq_wcm_core_impl_commands_wcm_command_servlet().

com_day_cq_wcm_core_impl_commands_wcm_command_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl
%%==============================================================================

com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl().

com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_event_page_event_audit_listener
%%==============================================================================

com_day_cq_wcm_core_impl_event_page_event_audit_listener() ->
  openapi_api:com_day_cq_wcm_core_impl_event_page_event_audit_listener().

com_day_cq_wcm_core_impl_event_page_event_audit_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_event_page_post_processor
%%==============================================================================

com_day_cq_wcm_core_impl_event_page_post_processor() ->
  openapi_api:com_day_cq_wcm_core_impl_event_page_post_processor().

com_day_cq_wcm_core_impl_event_page_post_processor_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_event_repository_change_event_listener
%%==============================================================================

com_day_cq_wcm_core_impl_event_repository_change_event_listener() ->
  openapi_api:com_day_cq_wcm_core_impl_event_repository_change_event_listener().

com_day_cq_wcm_core_impl_event_repository_change_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_event_template_post_processor
%%==============================================================================

com_day_cq_wcm_core_impl_event_template_post_processor() ->
  openapi_api:com_day_cq_wcm_core_impl_event_template_post_processor().

com_day_cq_wcm_core_impl_event_template_post_processor_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_language_manager_impl
%%==============================================================================

com_day_cq_wcm_core_impl_language_manager_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_language_manager_impl().

com_day_cq_wcm_core_impl_language_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl
%%==============================================================================

com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl().

com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_page_page_info_aggregator_impl
%%==============================================================================

com_day_cq_wcm_core_impl_page_page_info_aggregator_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_page_page_info_aggregator_impl().

com_day_cq_wcm_core_impl_page_page_info_aggregator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_page_page_manager_factory_impl
%%==============================================================================

com_day_cq_wcm_core_impl_page_page_manager_factory_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_page_page_manager_factory_impl().

com_day_cq_wcm_core_impl_page_page_manager_factory_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_references_content_content_reference_config
%%==============================================================================

com_day_cq_wcm_core_impl_references_content_content_reference_config() ->
  openapi_api:com_day_cq_wcm_core_impl_references_content_content_reference_config().

com_day_cq_wcm_core_impl_references_content_content_reference_config_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler
%%==============================================================================

com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler() ->
  openapi_api:com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler().

com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie
%%==============================================================================

com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie() ->
  openapi_api:com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie().

com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler
%%==============================================================================

com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler() ->
  openapi_api:com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler().

com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_servlets_find_replace_servlet
%%==============================================================================

com_day_cq_wcm_core_impl_servlets_find_replace_servlet() ->
  openapi_api:com_day_cq_wcm_core_impl_servlets_find_replace_servlet().

com_day_cq_wcm_core_impl_servlets_find_replace_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_servlets_reference_search_servlet
%%==============================================================================

com_day_cq_wcm_core_impl_servlets_reference_search_servlet() ->
  openapi_api:com_day_cq_wcm_core_impl_servlets_reference_search_servlet().

com_day_cq_wcm_core_impl_servlets_reference_search_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_servlets_thumbnail_servlet
%%==============================================================================

com_day_cq_wcm_core_impl_servlets_thumbnail_servlet() ->
  openapi_api:com_day_cq_wcm_core_impl_servlets_thumbnail_servlet().

com_day_cq_wcm_core_impl_servlets_thumbnail_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_utils_default_page_name_validator
%%==============================================================================

com_day_cq_wcm_core_impl_utils_default_page_name_validator() ->
  openapi_api:com_day_cq_wcm_core_impl_utils_default_page_name_validator().

com_day_cq_wcm_core_impl_utils_default_page_name_validator_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_variants_page_variants_provider_impl
%%==============================================================================

com_day_cq_wcm_core_impl_variants_page_variants_provider_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_variants_page_variants_provider_impl().

com_day_cq_wcm_core_impl_variants_page_variants_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_version_manager_impl
%%==============================================================================

com_day_cq_wcm_core_impl_version_manager_impl() ->
  openapi_api:com_day_cq_wcm_core_impl_version_manager_impl().

com_day_cq_wcm_core_impl_version_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_version_purge_task
%%==============================================================================

com_day_cq_wcm_core_impl_version_purge_task() ->
  openapi_api:com_day_cq_wcm_core_impl_version_purge_task().

com_day_cq_wcm_core_impl_version_purge_task_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_warp_time_warp_filter
%%==============================================================================

com_day_cq_wcm_core_impl_warp_time_warp_filter() ->
  openapi_api:com_day_cq_wcm_core_impl_warp_time_warp_filter().

com_day_cq_wcm_core_impl_warp_time_warp_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_wcm_debug_filter
%%==============================================================================

com_day_cq_wcm_core_impl_wcm_debug_filter() ->
  openapi_api:com_day_cq_wcm_core_impl_wcm_debug_filter().

com_day_cq_wcm_core_impl_wcm_debug_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_impl_wcm_developer_mode_filter
%%==============================================================================

com_day_cq_wcm_core_impl_wcm_developer_mode_filter() ->
  openapi_api:com_day_cq_wcm_core_impl_wcm_developer_mode_filter().

com_day_cq_wcm_core_impl_wcm_developer_mode_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_mvt_mvt_statistics_impl
%%==============================================================================

com_day_cq_wcm_core_mvt_mvt_statistics_impl() ->
  openapi_api:com_day_cq_wcm_core_mvt_mvt_statistics_impl().

com_day_cq_wcm_core_mvt_mvt_statistics_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_stats_page_view_statistics_impl
%%==============================================================================

com_day_cq_wcm_core_stats_page_view_statistics_impl() ->
  openapi_api:com_day_cq_wcm_core_stats_page_view_statistics_impl().

com_day_cq_wcm_core_stats_page_view_statistics_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_core_wcm_request_filter
%%==============================================================================

com_day_cq_wcm_core_wcm_request_filter() ->
  openapi_api:com_day_cq_wcm_core_wcm_request_filter().

com_day_cq_wcm_core_wcm_request_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_design_package_importer
%%==============================================================================

com_day_cq_wcm_designimporter_design_package_importer() ->
  openapi_api:com_day_cq_wcm_designimporter_design_package_importer().

com_day_cq_wcm_designimporter_design_package_importer_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_impl_canvas_builder_impl
%%==============================================================================

com_day_cq_wcm_designimporter_impl_canvas_builder_impl() ->
  openapi_api:com_day_cq_wcm_designimporter_impl_canvas_builder_impl().

com_day_cq_wcm_designimporter_impl_canvas_builder_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler
%%==============================================================================

com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler() ->
  openapi_api:com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler().

com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl
%%==============================================================================

com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl() ->
  openapi_api:com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl().

com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl
%%==============================================================================

com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl() ->
  openapi_api:com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl().

com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl
%%==============================================================================

com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl() ->
  openapi_api:com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl().

com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet
%%==============================================================================

com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet() ->
  openapi_api:com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet().

com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor
%%==============================================================================

com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor() ->
  openapi_api:com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor().

com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet
%%==============================================================================

com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet() ->
  openapi_api:com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet().

com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_forms_impl_mail_servlet
%%==============================================================================

com_day_cq_wcm_foundation_forms_impl_mail_servlet() ->
  openapi_api:com_day_cq_wcm_foundation_forms_impl_mail_servlet().

com_day_cq_wcm_foundation_forms_impl_mail_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet
%%==============================================================================

com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet() ->
  openapi_api:com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet().

com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_impl_http_auth_handler
%%==============================================================================

com_day_cq_wcm_foundation_impl_http_auth_handler() ->
  openapi_api:com_day_cq_wcm_foundation_impl_http_auth_handler().

com_day_cq_wcm_foundation_impl_http_auth_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_impl_page_impressions_tracker
%%==============================================================================

com_day_cq_wcm_foundation_impl_page_impressions_tracker() ->
  openapi_api:com_day_cq_wcm_foundation_impl_page_impressions_tracker().

com_day_cq_wcm_foundation_impl_page_impressions_tracker_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_impl_page_redirect_servlet
%%==============================================================================

com_day_cq_wcm_foundation_impl_page_redirect_servlet() ->
  openapi_api:com_day_cq_wcm_foundation_impl_page_redirect_servlet().

com_day_cq_wcm_foundation_impl_page_redirect_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist
%%==============================================================================

com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist() ->
  openapi_api:com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist().

com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl
%%==============================================================================

com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl() ->
  openapi_api:com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl().

com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory
%%==============================================================================

com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory() ->
  openapi_api:com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory().

com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter
%%==============================================================================

com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter() ->
  openapi_api:com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter().

com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_content_copy_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_content_copy_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_content_copy_action_factory().

com_day_cq_wcm_msm_impl_actions_content_copy_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_content_delete_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_content_delete_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_content_delete_action_factory().

com_day_cq_wcm_msm_impl_actions_content_delete_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_content_update_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_content_update_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_content_update_action_factory().

com_day_cq_wcm_msm_impl_actions_content_update_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_order_children_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_order_children_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_order_children_action_factory().

com_day_cq_wcm_msm_impl_actions_order_children_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_page_move_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_page_move_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_page_move_action_factory().

com_day_cq_wcm_msm_impl_actions_page_move_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_references_update_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_references_update_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_references_update_action_factory().

com_day_cq_wcm_msm_impl_actions_references_update_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_actions_version_copy_action_factory
%%==============================================================================

com_day_cq_wcm_msm_impl_actions_version_copy_action_factory() ->
  openapi_api:com_day_cq_wcm_msm_impl_actions_version_copy_action_factory().

com_day_cq_wcm_msm_impl_actions_version_copy_action_factory_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_live_relationship_manager_impl
%%==============================================================================

com_day_cq_wcm_msm_impl_live_relationship_manager_impl() ->
  openapi_api:com_day_cq_wcm_msm_impl_live_relationship_manager_impl().

com_day_cq_wcm_msm_impl_live_relationship_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_rollout_manager_impl
%%==============================================================================

com_day_cq_wcm_msm_impl_rollout_manager_impl() ->
  openapi_api:com_day_cq_wcm_msm_impl_rollout_manager_impl().

com_day_cq_wcm_msm_impl_rollout_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_msm_impl_servlets_audit_log_servlet
%%==============================================================================

com_day_cq_wcm_msm_impl_servlets_audit_log_servlet() ->
  openapi_api:com_day_cq_wcm_msm_impl_servlets_audit_log_servlet().

com_day_cq_wcm_msm_impl_servlets_audit_log_servlet_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_notification_email_impl_email_channel
%%==============================================================================

com_day_cq_wcm_notification_email_impl_email_channel() ->
  openapi_api:com_day_cq_wcm_notification_email_impl_email_channel().

com_day_cq_wcm_notification_email_impl_email_channel_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_notification_impl_notification_manager_impl
%%==============================================================================

com_day_cq_wcm_notification_impl_notification_manager_impl() ->
  openapi_api:com_day_cq_wcm_notification_impl_notification_manager_impl().

com_day_cq_wcm_notification_impl_notification_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_scripting_impl_bvp_manager
%%==============================================================================

com_day_cq_wcm_scripting_impl_bvp_manager() ->
  openapi_api:com_day_cq_wcm_scripting_impl_bvp_manager().

com_day_cq_wcm_scripting_impl_bvp_manager_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_undo_undo_config
%%==============================================================================

com_day_cq_wcm_undo_undo_config() ->
  openapi_api:com_day_cq_wcm_undo_undo_config().

com_day_cq_wcm_undo_undo_config_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_webservicesupport_impl_replication_event_listener
%%==============================================================================

com_day_cq_wcm_webservicesupport_impl_replication_event_listener() ->
  openapi_api:com_day_cq_wcm_webservicesupport_impl_replication_event_listener().

com_day_cq_wcm_webservicesupport_impl_replication_event_listener_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl
%%==============================================================================

com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl() ->
  openapi_api:com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl().

com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_wcm_workflow_impl_workflow_package_info_provider
%%==============================================================================

com_day_cq_wcm_workflow_impl_workflow_package_info_provider() ->
  openapi_api:com_day_cq_wcm_workflow_impl_workflow_package_info_provider().

com_day_cq_wcm_workflow_impl_workflow_package_info_provider_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_widget_impl_html_library_manager_impl
%%==============================================================================

com_day_cq_widget_impl_html_library_manager_impl() ->
  openapi_api:com_day_cq_widget_impl_html_library_manager_impl().

com_day_cq_widget_impl_html_library_manager_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_widget_impl_widget_extension_provider_impl
%%==============================================================================

com_day_cq_widget_impl_widget_extension_provider_impl() ->
  openapi_api:com_day_cq_widget_impl_widget_extension_provider_impl().

com_day_cq_widget_impl_widget_extension_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_workflow_impl_email_e_mail_notification_service
%%==============================================================================

com_day_cq_workflow_impl_email_e_mail_notification_service() ->
  openapi_api:com_day_cq_workflow_impl_email_e_mail_notification_service().

com_day_cq_workflow_impl_email_e_mail_notification_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_cq_workflow_impl_email_task_e_mail_notification_service
%%==============================================================================

com_day_cq_workflow_impl_email_task_e_mail_notification_service() ->
  openapi_api:com_day_cq_workflow_impl_email_task_e_mail_notification_service().

com_day_cq_workflow_impl_email_task_e_mail_notification_service_args(_S) ->
  [].

%%==============================================================================
%% com_day_crx_security_token_impl_impl_token_authentication_handler
%%==============================================================================

com_day_crx_security_token_impl_impl_token_authentication_handler() ->
  openapi_api:com_day_crx_security_token_impl_impl_token_authentication_handler().

com_day_crx_security_token_impl_impl_token_authentication_handler_args(_S) ->
  [].

%%==============================================================================
%% com_day_crx_security_token_impl_token_cleanup_task
%%==============================================================================

com_day_crx_security_token_impl_token_cleanup_task() ->
  openapi_api:com_day_crx_security_token_impl_token_cleanup_task().

com_day_crx_security_token_impl_token_cleanup_task_args(_S) ->
  [].

%%==============================================================================
%% guide_localization_service
%%==============================================================================

guide_localization_service() ->
  openapi_api:guide_localization_service().

guide_localization_service_args(_S) ->
  [].

%%==============================================================================
%% messaging_user_component_factory
%%==============================================================================

messaging_user_component_factory() ->
  openapi_api:messaging_user_component_factory().

messaging_user_component_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_aries_jmx_framework_state_config
%%==============================================================================

org_apache_aries_jmx_framework_state_config() ->
  openapi_api:org_apache_aries_jmx_framework_state_config().

org_apache_aries_jmx_framework_state_config_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_eventadmin_impl_event_admin
%%==============================================================================

org_apache_felix_eventadmin_impl_event_admin() ->
  openapi_api:org_apache_felix_eventadmin_impl_event_admin().

org_apache_felix_eventadmin_impl_event_admin_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_http
%%==============================================================================

org_apache_felix_http() ->
  openapi_api:org_apache_felix_http().

org_apache_felix_http_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_http_sslfilter_ssl_filter
%%==============================================================================

org_apache_felix_http_sslfilter_ssl_filter() ->
  openapi_api:org_apache_felix_http_sslfilter_ssl_filter().

org_apache_felix_http_sslfilter_ssl_filter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_jaas_configuration_factory
%%==============================================================================

org_apache_felix_jaas_configuration_factory() ->
  openapi_api:org_apache_felix_jaas_configuration_factory().

org_apache_felix_jaas_configuration_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_jaas_configuration_spi
%%==============================================================================

org_apache_felix_jaas_configuration_spi() ->
  openapi_api:org_apache_felix_jaas_configuration_spi().

org_apache_felix_jaas_configuration_spi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_scr_scr_service
%%==============================================================================

org_apache_felix_scr_scr_service() ->
  openapi_api:org_apache_felix_scr_scr_service().

org_apache_felix_scr_scr_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_systemready_impl_components_check
%%==============================================================================

org_apache_felix_systemready_impl_components_check() ->
  openapi_api:org_apache_felix_systemready_impl_components_check().

org_apache_felix_systemready_impl_components_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_systemready_impl_framework_start_check
%%==============================================================================

org_apache_felix_systemready_impl_framework_start_check() ->
  openapi_api:org_apache_felix_systemready_impl_framework_start_check().

org_apache_felix_systemready_impl_framework_start_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_systemready_impl_services_check
%%==============================================================================

org_apache_felix_systemready_impl_services_check() ->
  openapi_api:org_apache_felix_systemready_impl_services_check().

org_apache_felix_systemready_impl_services_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_systemready_impl_servlet_system_alive_servlet
%%==============================================================================

org_apache_felix_systemready_impl_servlet_system_alive_servlet() ->
  openapi_api:org_apache_felix_systemready_impl_servlet_system_alive_servlet().

org_apache_felix_systemready_impl_servlet_system_alive_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_systemready_impl_servlet_system_ready_servlet
%%==============================================================================

org_apache_felix_systemready_impl_servlet_system_ready_servlet() ->
  openapi_api:org_apache_felix_systemready_impl_servlet_system_ready_servlet().

org_apache_felix_systemready_impl_servlet_system_ready_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_systemready_system_ready_monitor
%%==============================================================================

org_apache_felix_systemready_system_ready_monitor() ->
  openapi_api:org_apache_felix_systemready_system_ready_monitor().

org_apache_felix_systemready_system_ready_monitor_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_webconsole_internal_servlet_osgi_manager
%%==============================================================================

org_apache_felix_webconsole_internal_servlet_osgi_manager() ->
  openapi_api:org_apache_felix_webconsole_internal_servlet_osgi_manager().

org_apache_felix_webconsole_internal_servlet_osgi_manager_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_webconsole_plugins_event_internal_plugin_servlet
%%==============================================================================

org_apache_felix_webconsole_plugins_event_internal_plugin_servlet() ->
  openapi_api:org_apache_felix_webconsole_plugins_event_internal_plugin_servlet().

org_apache_felix_webconsole_plugins_event_internal_plugin_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co
%%==============================================================================

org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co() ->
  openapi_api:org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co().

org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co_args(_S) ->
  [].

%%==============================================================================
%% org_apache_http_proxyconfigurator
%%==============================================================================

org_apache_http_proxyconfigurator() ->
  openapi_api:org_apache_http_proxyconfigurator().

org_apache_http_proxyconfigurator_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider
%%==============================================================================

org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider().

org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store
%%==============================================================================

org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store().

org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_document_document_node_store_service
%%==============================================================================

org_apache_jackrabbit_oak_plugins_document_document_node_store_service() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_document_document_node_store_service().

org_apache_jackrabbit_oak_plugins_document_document_node_store_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre
%%==============================================================================

org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre().

org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac
%%==============================================================================

org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac().

org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_async_indexer_service
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_async_indexer_service() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_async_indexer_service().

org_apache_jackrabbit_oak_plugins_index_async_indexer_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv().

org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co().

org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers().

org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration().

org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf().

org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid().

org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se
%%==============================================================================

org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se().

org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory
%%==============================================================================

org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory().

org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_plugins_observation_change_collector_provider
%%==============================================================================

org_apache_jackrabbit_oak_plugins_observation_change_collector_provider() ->
  openapi_api:org_apache_jackrabbit_oak_plugins_observation_change_collector_provider().

org_apache_jackrabbit_oak_plugins_observation_change_collector_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_query_query_engine_settings_service
%%==============================================================================

org_apache_jackrabbit_oak_query_query_engine_settings_service() ->
  openapi_api:org_apache_jackrabbit_oak_query_query_engine_settings_service().

org_apache_jackrabbit_oak_query_query_engine_settings_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_authentication_authentication_config
%%==============================================================================

org_apache_jackrabbit_oak_security_authentication_authentication_config() ->
  openapi_api:org_apache_jackrabbit_oak_security_authentication_authentication_config().

org_apache_jackrabbit_oak_security_authentication_authentication_config_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi
%%==============================================================================

org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi() ->
  openapi_api:org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi().

org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_authentication_token_token_configura
%%==============================================================================

org_apache_jackrabbit_oak_security_authentication_token_token_configura() ->
  openapi_api:org_apache_jackrabbit_oak_security_authentication_token_token_configura().

org_apache_jackrabbit_oak_security_authentication_token_token_configura_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_authorization_authorization_configur
%%==============================================================================

org_apache_jackrabbit_oak_security_authorization_authorization_configur() ->
  openapi_api:org_apache_jackrabbit_oak_security_authorization_authorization_configur().

org_apache_jackrabbit_oak_security_authorization_authorization_configur_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_internal_security_provider_registrati
%%==============================================================================

org_apache_jackrabbit_oak_security_internal_security_provider_registrati() ->
  openapi_api:org_apache_jackrabbit_oak_security_internal_security_provider_registrati().

org_apache_jackrabbit_oak_security_internal_security_provider_registrati_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_user_random_authorizable_node_name
%%==============================================================================

org_apache_jackrabbit_oak_security_user_random_authorizable_node_name() ->
  openapi_api:org_apache_jackrabbit_oak_security_user_random_authorizable_node_name().

org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_security_user_user_configuration_impl
%%==============================================================================

org_apache_jackrabbit_oak_security_user_user_configuration_impl() ->
  openapi_api:org_apache_jackrabbit_oak_security_user_user_configuration_impl().

org_apache_jackrabbit_oak_security_user_user_configuration_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service
%%==============================================================================

org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service() ->
  openapi_api:org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service().

org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_segment_segment_node_store_factory
%%==============================================================================

org_apache_jackrabbit_oak_segment_segment_node_store_factory() ->
  openapi_api:org_apache_jackrabbit_oak_segment_segment_node_store_factory().

org_apache_jackrabbit_oak_segment_segment_node_store_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service
%%==============================================================================

org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service() ->
  openapi_api:org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service().

org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_segment_segment_node_store_service
%%==============================================================================

org_apache_jackrabbit_oak_segment_segment_node_store_service() ->
  openapi_api:org_apache_jackrabbit_oak_segment_segment_node_store_service().

org_apache_jackrabbit_oak_segment_segment_node_store_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_segment_standby_store_standby_store_service
%%==============================================================================

org_apache_jackrabbit_oak_segment_standby_store_standby_store_service() ->
  openapi_api:org_apache_jackrabbit_oak_segment_standby_store_standby_store_service().

org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de
%%==============================================================================

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de() ->
  openapi_api:org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de().

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex
%%==============================================================================

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex() ->
  openapi_api:org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex().

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr
%%==============================================================================

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr() ->
  openapi_api:org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr().

org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi
%%==============================================================================

org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi() ->
  openapi_api:org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi().

org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu
%%==============================================================================

org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu() ->
  openapi_api:org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu().

org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable
%%==============================================================================

org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable() ->
  openapi_api:org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable().

org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_vault_packaging_impl_packaging_impl
%%==============================================================================

org_apache_jackrabbit_vault_packaging_impl_packaging_impl() ->
  openapi_api:org_apache_jackrabbit_vault_packaging_impl_packaging_impl().

org_apache_jackrabbit_vault_packaging_impl_packaging_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry
%%==============================================================================

org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry() ->
  openapi_api:org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry().

org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_auth_core_impl_logout_servlet
%%==============================================================================

org_apache_sling_auth_core_impl_logout_servlet() ->
  openapi_api:org_apache_sling_auth_core_impl_logout_servlet().

org_apache_sling_auth_core_impl_logout_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_impl_configuration_bindings_value_provider
%%==============================================================================

org_apache_sling_caconfig_impl_configuration_bindings_value_provider() ->
  openapi_api:org_apache_sling_caconfig_impl_configuration_bindings_value_provider().

org_apache_sling_caconfig_impl_configuration_bindings_value_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_impl_configuration_resolver_impl
%%==============================================================================

org_apache_sling_caconfig_impl_configuration_resolver_impl() ->
  openapi_api:org_apache_sling_caconfig_impl_configuration_resolver_impl().

org_apache_sling_caconfig_impl_configuration_resolver_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra
%%==============================================================================

org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra() ->
  openapi_api:org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra().

org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra
%%==============================================================================

org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra() ->
  openapi_api:org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra().

org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi
%%==============================================================================

org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi() ->
  openapi_api:org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi().

org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_impl_override_system_property_configuration_ove
%%==============================================================================

org_apache_sling_caconfig_impl_override_system_property_configuration_ove() ->
  openapi_api:org_apache_sling_caconfig_impl_override_system_property_configuration_ove().

org_apache_sling_caconfig_impl_override_system_property_configuration_ove_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_management_impl_configuration_management_setti
%%==============================================================================

org_apache_sling_caconfig_management_impl_configuration_management_setti() ->
  openapi_api:org_apache_sling_caconfig_management_impl_configuration_management_setti().

org_apache_sling_caconfig_management_impl_configuration_management_setti_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_resource_impl_def_default_configuration_resour
%%==============================================================================

org_apache_sling_caconfig_resource_impl_def_default_configuration_resour() ->
  openapi_api:org_apache_sling_caconfig_resource_impl_def_default_configuration_resour().

org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy
%%==============================================================================

org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy() ->
  openapi_api:org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy().

org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_html_internal_tagsoup_html_parser
%%==============================================================================

org_apache_sling_commons_html_internal_tagsoup_html_parser() ->
  openapi_api:org_apache_sling_commons_html_internal_tagsoup_html_parser().

org_apache_sling_commons_html_internal_tagsoup_html_parser_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_log_log_manager
%%==============================================================================

org_apache_sling_commons_log_log_manager() ->
  openapi_api:org_apache_sling_commons_log_log_manager().

org_apache_sling_commons_log_log_manager_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_log_log_manager_factory_config
%%==============================================================================

org_apache_sling_commons_log_log_manager_factory_config() ->
  openapi_api:org_apache_sling_commons_log_log_manager_factory_config().

org_apache_sling_commons_log_log_manager_factory_config_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_log_log_manager_factory_writer
%%==============================================================================

org_apache_sling_commons_log_log_manager_factory_writer() ->
  openapi_api:org_apache_sling_commons_log_log_manager_factory_writer().

org_apache_sling_commons_log_log_manager_factory_writer_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_metrics_internal_log_reporter
%%==============================================================================

org_apache_sling_commons_metrics_internal_log_reporter() ->
  openapi_api:org_apache_sling_commons_metrics_internal_log_reporter().

org_apache_sling_commons_metrics_internal_log_reporter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter
%%==============================================================================

org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter() ->
  openapi_api:org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter().

org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_mime_internal_mime_type_service_impl
%%==============================================================================

org_apache_sling_commons_mime_internal_mime_type_service_impl() ->
  openapi_api:org_apache_sling_commons_mime_internal_mime_type_service_impl().

org_apache_sling_commons_mime_internal_mime_type_service_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_scheduler_impl_quartz_scheduler
%%==============================================================================

org_apache_sling_commons_scheduler_impl_quartz_scheduler() ->
  openapi_api:org_apache_sling_commons_scheduler_impl_quartz_scheduler().

org_apache_sling_commons_scheduler_impl_quartz_scheduler_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_scheduler_impl_scheduler_health_check
%%==============================================================================

org_apache_sling_commons_scheduler_impl_scheduler_health_check() ->
  openapi_api:org_apache_sling_commons_scheduler_impl_scheduler_health_check().

org_apache_sling_commons_scheduler_impl_scheduler_health_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_commons_threads_impl_default_thread_pool_factory
%%==============================================================================

org_apache_sling_commons_threads_impl_default_thread_pool_factory() ->
  openapi_api:org_apache_sling_commons_threads_impl_default_thread_pool_factory().

org_apache_sling_commons_threads_impl_default_thread_pool_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_datasource_data_source_factory
%%==============================================================================

org_apache_sling_datasource_data_source_factory() ->
  openapi_api:org_apache_sling_datasource_data_source_factory().

org_apache_sling_datasource_data_source_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_datasource_jndi_data_source_factory
%%==============================================================================

org_apache_sling_datasource_jndi_data_source_factory() ->
  openapi_api:org_apache_sling_datasource_jndi_data_source_factory().

org_apache_sling_datasource_jndi_data_source_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_discovery_oak_config
%%==============================================================================

org_apache_sling_discovery_oak_config() ->
  openapi_api:org_apache_sling_discovery_oak_config().

org_apache_sling_discovery_oak_config_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_discovery_oak_synchronized_clocks_health_check
%%==============================================================================

org_apache_sling_discovery_oak_synchronized_clocks_health_check() ->
  openapi_api:org_apache_sling_discovery_oak_synchronized_clocks_health_check().

org_apache_sling_discovery_oak_synchronized_clocks_health_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto
%%==============================================================================

org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto() ->
  openapi_api:org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto().

org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_agent_impl_privilege_distribution_request_a
%%==============================================================================

org_apache_sling_distribution_agent_impl_privilege_distribution_request_a() ->
  openapi_api:org_apache_sling_distribution_agent_impl_privilege_distribution_request_a().

org_apache_sling_distribution_agent_impl_privilege_distribution_request_a_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory
%%==============================================================================

org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory() ->
  openapi_api:org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory().

org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto
%%==============================================================================

org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto() ->
  openapi_api:org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto().

org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor
%%==============================================================================

org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor() ->
  openapi_api:org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor().

org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory
%%==============================================================================

org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory() ->
  openapi_api:org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory().

org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_monitor_distribution_queue_health_check
%%==============================================================================

org_apache_sling_distribution_monitor_distribution_queue_health_check() ->
  openapi_api:org_apache_sling_distribution_monitor_distribution_queue_health_check().

org_apache_sling_distribution_monitor_distribution_queue_health_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_packaging_impl_exporter_agent_distributio
%%==============================================================================

org_apache_sling_distribution_packaging_impl_exporter_agent_distributio() ->
  openapi_api:org_apache_sling_distribution_packaging_impl_exporter_agent_distributio().

org_apache_sling_distribution_packaging_impl_exporter_agent_distributio_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_packaging_impl_exporter_local_distributio
%%==============================================================================

org_apache_sling_distribution_packaging_impl_exporter_local_distributio() ->
  openapi_api:org_apache_sling_distribution_packaging_impl_exporter_local_distributio().

org_apache_sling_distribution_packaging_impl_exporter_local_distributio_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_packaging_impl_exporter_remote_distributi
%%==============================================================================

org_apache_sling_distribution_packaging_impl_exporter_remote_distributi() ->
  openapi_api:org_apache_sling_distribution_packaging_impl_exporter_remote_distributi().

org_apache_sling_distribution_packaging_impl_exporter_remote_distributi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_packaging_impl_importer_local_distributio
%%==============================================================================

org_apache_sling_distribution_packaging_impl_importer_local_distributio() ->
  openapi_api:org_apache_sling_distribution_packaging_impl_importer_local_distributio().

org_apache_sling_distribution_packaging_impl_importer_local_distributio_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_packaging_impl_importer_remote_distributi
%%==============================================================================

org_apache_sling_distribution_packaging_impl_importer_remote_distributi() ->
  openapi_api:org_apache_sling_distribution_packaging_impl_importer_remote_distributi().

org_apache_sling_distribution_packaging_impl_importer_remote_distributi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_packaging_impl_importer_repository_distri
%%==============================================================================

org_apache_sling_distribution_packaging_impl_importer_repository_distri() ->
  openapi_api:org_apache_sling_distribution_packaging_impl_importer_repository_distri().

org_apache_sling_distribution_packaging_impl_importer_repository_distri_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_resources_impl_distribution_configuration
%%==============================================================================

org_apache_sling_distribution_resources_impl_distribution_configuration() ->
  openapi_api:org_apache_sling_distribution_resources_impl_distribution_configuration().

org_apache_sling_distribution_resources_impl_distribution_configuration_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_resources_impl_distribution_service_resour
%%==============================================================================

org_apache_sling_distribution_resources_impl_distribution_service_resour() ->
  openapi_api:org_apache_sling_distribution_resources_impl_distribution_service_resour().

org_apache_sling_distribution_resources_impl_distribution_service_resour_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_serialization_impl_distribution_package_bu
%%==============================================================================

org_apache_sling_distribution_serialization_impl_distribution_package_bu() ->
  openapi_api:org_apache_sling_distribution_serialization_impl_distribution_package_bu().

org_apache_sling_distribution_serialization_impl_distribution_package_bu_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_serialization_impl_vlt_vault_distribution
%%==============================================================================

org_apache_sling_distribution_serialization_impl_vlt_vault_distribution() ->
  openapi_api:org_apache_sling_distribution_serialization_impl_vlt_vault_distribution().

org_apache_sling_distribution_serialization_impl_vlt_vault_distribution_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_transport_impl_user_credentials_distributi
%%==============================================================================

org_apache_sling_distribution_transport_impl_user_credentials_distributi() ->
  openapi_api:org_apache_sling_distribution_transport_impl_user_credentials_distributi().

org_apache_sling_distribution_transport_impl_user_credentials_distributi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_trigger_impl_distribution_event_distribute
%%==============================================================================

org_apache_sling_distribution_trigger_impl_distribution_event_distribute() ->
  openapi_api:org_apache_sling_distribution_trigger_impl_distribution_event_distribute().

org_apache_sling_distribution_trigger_impl_distribution_event_distribute_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger
%%==============================================================================

org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger() ->
  openapi_api:org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger().

org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi
%%==============================================================================

org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi() ->
  openapi_api:org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi().

org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig
%%==============================================================================

org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig() ->
  openapi_api:org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig().

org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr
%%==============================================================================

org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr() ->
  openapi_api:org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr().

org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge
%%==============================================================================

org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge() ->
  openapi_api:org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge().

org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_engine_impl_auth_sling_authenticator
%%==============================================================================

org_apache_sling_engine_impl_auth_sling_authenticator() ->
  openapi_api:org_apache_sling_engine_impl_auth_sling_authenticator().

org_apache_sling_engine_impl_auth_sling_authenticator_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter
%%==============================================================================

org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter() ->
  openapi_api:org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter().

org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_engine_impl_log_request_logger
%%==============================================================================

org_apache_sling_engine_impl_log_request_logger() ->
  openapi_api:org_apache_sling_engine_impl_log_request_logger().

org_apache_sling_engine_impl_log_request_logger_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_engine_impl_log_request_logger_service
%%==============================================================================

org_apache_sling_engine_impl_log_request_logger_service() ->
  openapi_api:org_apache_sling_engine_impl_log_request_logger_service().

org_apache_sling_engine_impl_log_request_logger_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_engine_impl_sling_main_servlet
%%==============================================================================

org_apache_sling_engine_impl_sling_main_servlet() ->
  openapi_api:org_apache_sling_engine_impl_sling_main_servlet().

org_apache_sling_engine_impl_sling_main_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_engine_parameters
%%==============================================================================

org_apache_sling_engine_parameters() ->
  openapi_api:org_apache_sling_engine_parameters().

org_apache_sling_engine_parameters_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_event_impl_eventing_thread_pool
%%==============================================================================

org_apache_sling_event_impl_eventing_thread_pool() ->
  openapi_api:org_apache_sling_event_impl_eventing_thread_pool().

org_apache_sling_event_impl_eventing_thread_pool_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_event_impl_jobs_default_job_manager
%%==============================================================================

org_apache_sling_event_impl_jobs_default_job_manager() ->
  openapi_api:org_apache_sling_event_impl_jobs_default_job_manager().

org_apache_sling_event_impl_jobs_default_job_manager_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_event_impl_jobs_jcr_persistence_handler
%%==============================================================================

org_apache_sling_event_impl_jobs_jcr_persistence_handler() ->
  openapi_api:org_apache_sling_event_impl_jobs_jcr_persistence_handler().

org_apache_sling_event_impl_jobs_jcr_persistence_handler_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_event_impl_jobs_job_consumer_manager
%%==============================================================================

org_apache_sling_event_impl_jobs_job_consumer_manager() ->
  openapi_api:org_apache_sling_event_impl_jobs_job_consumer_manager().

org_apache_sling_event_impl_jobs_job_consumer_manager_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_event_jobs_queue_configuration
%%==============================================================================

org_apache_sling_event_jobs_queue_configuration() ->
  openapi_api:org_apache_sling_event_jobs_queue_configuration().

org_apache_sling_event_jobs_queue_configuration_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w
%%==============================================================================

org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w() ->
  openapi_api:org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w().

org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_featureflags_feature
%%==============================================================================

org_apache_sling_featureflags_feature() ->
  openapi_api:org_apache_sling_featureflags_feature().

org_apache_sling_featureflags_feature_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_featureflags_impl_configured_feature
%%==============================================================================

org_apache_sling_featureflags_impl_configured_feature() ->
  openapi_api:org_apache_sling_featureflags_impl_configured_feature().

org_apache_sling_featureflags_impl_configured_feature_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hapi_impl_h_api_util_impl
%%==============================================================================

org_apache_sling_hapi_impl_h_api_util_impl() ->
  openapi_api:org_apache_sling_hapi_impl_h_api_util_impl().

org_apache_sling_hapi_impl_h_api_util_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hc_core_impl_composite_health_check
%%==============================================================================

org_apache_sling_hc_core_impl_composite_health_check() ->
  openapi_api:org_apache_sling_hc_core_impl_composite_health_check().

org_apache_sling_hc_core_impl_composite_health_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hc_core_impl_executor_health_check_executor_impl
%%==============================================================================

org_apache_sling_hc_core_impl_executor_health_check_executor_impl() ->
  openapi_api:org_apache_sling_hc_core_impl_executor_health_check_executor_impl().

org_apache_sling_hc_core_impl_executor_health_check_executor_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hc_core_impl_jmx_attribute_health_check
%%==============================================================================

org_apache_sling_hc_core_impl_jmx_attribute_health_check() ->
  openapi_api:org_apache_sling_hc_core_impl_jmx_attribute_health_check().

org_apache_sling_hc_core_impl_jmx_attribute_health_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hc_core_impl_scriptable_health_check
%%==============================================================================

org_apache_sling_hc_core_impl_scriptable_health_check() ->
  openapi_api:org_apache_sling_hc_core_impl_scriptable_health_check().

org_apache_sling_hc_core_impl_scriptable_health_check_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet
%%==============================================================================

org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet() ->
  openapi_api:org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet().

org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer
%%==============================================================================

org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer() ->
  openapi_api:org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer().

org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_i18n_impl_i18_n_filter
%%==============================================================================

org_apache_sling_i18n_impl_i18_n_filter() ->
  openapi_api:org_apache_sling_i18n_impl_i18_n_filter().

org_apache_sling_i18n_impl_i18_n_filter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_i18n_impl_jcr_resource_bundle_provider
%%==============================================================================

org_apache_sling_i18n_impl_jcr_resource_bundle_provider() ->
  openapi_api:org_apache_sling_i18n_impl_jcr_resource_bundle_provider().

org_apache_sling_i18n_impl_jcr_resource_bundle_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_installer_provider_jcr_impl_jcr_installer
%%==============================================================================

org_apache_sling_installer_provider_jcr_impl_jcr_installer() ->
  openapi_api:org_apache_sling_installer_provider_jcr_impl_jcr_installer().

org_apache_sling_installer_provider_jcr_impl_jcr_installer_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_base_internal_login_admin_whitelist
%%==============================================================================

org_apache_sling_jcr_base_internal_login_admin_whitelist() ->
  openapi_api:org_apache_sling_jcr_base_internal_login_admin_whitelist().

org_apache_sling_jcr_base_internal_login_admin_whitelist_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment
%%==============================================================================

org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment() ->
  openapi_api:org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment().

org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet
%%==============================================================================

org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet() ->
  openapi_api:org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet().

org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_jackrabbit_server_jndi_registration_support
%%==============================================================================

org_apache_sling_jcr_jackrabbit_server_jndi_registration_support() ->
  openapi_api:org_apache_sling_jcr_jackrabbit_server_jndi_registration_support().

org_apache_sling_jcr_jackrabbit_server_jndi_registration_support_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_jackrabbit_server_rmi_registration_support
%%==============================================================================

org_apache_sling_jcr_jackrabbit_server_rmi_registration_support() ->
  openapi_api:org_apache_sling_jcr_jackrabbit_server_rmi_registration_support().

org_apache_sling_jcr_jackrabbit_server_rmi_registration_support_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_repoinit_impl_repository_initializer
%%==============================================================================

org_apache_sling_jcr_repoinit_impl_repository_initializer() ->
  openapi_api:org_apache_sling_jcr_repoinit_impl_repository_initializer().

org_apache_sling_jcr_repoinit_impl_repository_initializer_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_repoinit_repository_initializer
%%==============================================================================

org_apache_sling_jcr_repoinit_repository_initializer() ->
  openapi_api:org_apache_sling_jcr_repoinit_repository_initializer().

org_apache_sling_jcr_repoinit_repository_initializer_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl
%%==============================================================================

org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl() ->
  openapi_api:org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl().

org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_resource_internal_jcr_system_user_validator
%%==============================================================================

org_apache_sling_jcr_resource_internal_jcr_system_user_validator() ->
  openapi_api:org_apache_sling_jcr_resource_internal_jcr_system_user_validator().

org_apache_sling_jcr_resource_internal_jcr_system_user_validator_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory
%%==============================================================================

org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory() ->
  openapi_api:org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory().

org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_webdav_impl_handler_default_handler_service
%%==============================================================================

org_apache_sling_jcr_webdav_impl_handler_default_handler_service() ->
  openapi_api:org_apache_sling_jcr_webdav_impl_handler_default_handler_service().

org_apache_sling_jcr_webdav_impl_handler_default_handler_service_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic
%%==============================================================================

org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic() ->
  openapi_api:org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic().

org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet
%%==============================================================================

org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet() ->
  openapi_api:org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet().

org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_jmx_provider_impl_jmx_resource_provider
%%==============================================================================

org_apache_sling_jmx_provider_impl_jmx_resource_provider() ->
  openapi_api:org_apache_sling_jmx_provider_impl_jmx_resource_provider().

org_apache_sling_jmx_provider_impl_jmx_resource_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_models_impl_model_adapter_factory
%%==============================================================================

org_apache_sling_models_impl_model_adapter_factory() ->
  openapi_api:org_apache_sling_models_impl_model_adapter_factory().

org_apache_sling_models_impl_model_adapter_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_models_jacksonexporter_impl_resource_module_provider
%%==============================================================================

org_apache_sling_models_jacksonexporter_impl_resource_module_provider() ->
  openapi_api:org_apache_sling_models_jacksonexporter_impl_resource_module_provider().

org_apache_sling_models_jacksonexporter_impl_resource_module_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto
%%==============================================================================

org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto() ->
  openapi_api:org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto().

org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_resourcemerger_impl_merged_resource_provider_factory
%%==============================================================================

org_apache_sling_resourcemerger_impl_merged_resource_provider_factory() ->
  openapi_api:org_apache_sling_resourcemerger_impl_merged_resource_provider_factory().

org_apache_sling_resourcemerger_impl_merged_resource_provider_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_resourcemerger_picker_overriding
%%==============================================================================

org_apache_sling_resourcemerger_picker_overriding() ->
  openapi_api:org_apache_sling_resourcemerger_picker_overriding().

org_apache_sling_resourcemerger_picker_overriding_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_scripting_core_impl_script_cache_impl
%%==============================================================================

org_apache_sling_scripting_core_impl_script_cache_impl() ->
  openapi_api:org_apache_sling_scripting_core_impl_script_cache_impl().

org_apache_sling_scripting_core_impl_script_cache_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider
%%==============================================================================

org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider() ->
  openapi_api:org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider().

org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_scripting_java_impl_java_script_engine_factory
%%==============================================================================

org_apache_sling_scripting_java_impl_java_script_engine_factory() ->
  openapi_api:org_apache_sling_scripting_java_impl_java_script_engine_factory().

org_apache_sling_scripting_java_impl_java_script_engine_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa
%%==============================================================================

org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa() ->
  openapi_api:org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa().

org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_scripting_jsp_jsp_script_engine_factory
%%==============================================================================

org_apache_sling_scripting_jsp_jsp_script_engine_factory() ->
  openapi_api:org_apache_sling_scripting_jsp_jsp_script_engine_factory().

org_apache_sling_scripting_jsp_jsp_script_engine_factory_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov
%%==============================================================================

org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov() ->
  openapi_api:org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov().

org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_security_impl_content_disposition_filter
%%==============================================================================

org_apache_sling_security_impl_content_disposition_filter() ->
  openapi_api:org_apache_sling_security_impl_content_disposition_filter().

org_apache_sling_security_impl_content_disposition_filter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_security_impl_referrer_filter
%%==============================================================================

org_apache_sling_security_impl_referrer_filter() ->
  openapi_api:org_apache_sling_security_impl_referrer_filter().

org_apache_sling_security_impl_referrer_filter_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_serviceusermapping_impl_service_user_mapper_impl
%%==============================================================================

org_apache_sling_serviceusermapping_impl_service_user_mapper_impl() ->
  openapi_api:org_apache_sling_serviceusermapping_impl_service_user_mapper_impl().

org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended
%%==============================================================================

org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended() ->
  openapi_api:org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended().

org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_servlets_get_default_get_servlet
%%==============================================================================

org_apache_sling_servlets_get_default_get_servlet() ->
  openapi_api:org_apache_sling_servlets_get_default_get_servlet().

org_apache_sling_servlets_get_default_get_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_servlets_get_impl_version_version_info_servlet
%%==============================================================================

org_apache_sling_servlets_get_impl_version_version_info_servlet() ->
  openapi_api:org_apache_sling_servlets_get_impl_version_version_info_servlet().

org_apache_sling_servlets_get_impl_version_version_info_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task
%%==============================================================================

org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task() ->
  openapi_api:org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task().

org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_servlets_post_impl_sling_post_servlet
%%==============================================================================

org_apache_sling_servlets_post_impl_sling_post_servlet() ->
  openapi_api:org_apache_sling_servlets_post_impl_sling_post_servlet().

org_apache_sling_servlets_post_impl_sling_post_servlet_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_servlets_resolver_sling_servlet_resolver
%%==============================================================================

org_apache_sling_servlets_resolver_sling_servlet_resolver() ->
  openapi_api:org_apache_sling_servlets_resolver_sling_servlet_resolver().

org_apache_sling_servlets_resolver_sling_servlet_resolver_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_settings_impl_sling_settings_service_impl
%%==============================================================================

org_apache_sling_settings_impl_sling_settings_service_impl() ->
  openapi_api:org_apache_sling_settings_impl_sling_settings_service_impl().

org_apache_sling_settings_impl_sling_settings_service_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_startupfilter_impl_startup_filter_impl
%%==============================================================================

org_apache_sling_startupfilter_impl_startup_filter_impl() ->
  openapi_api:org_apache_sling_startupfilter_impl_startup_filter_impl().

org_apache_sling_startupfilter_impl_startup_filter_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_tenant_internal_tenant_provider_impl
%%==============================================================================

org_apache_sling_tenant_internal_tenant_provider_impl() ->
  openapi_api:org_apache_sling_tenant_internal_tenant_provider_impl().

org_apache_sling_tenant_internal_tenant_provider_impl_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_tracer_internal_log_tracer
%%==============================================================================

org_apache_sling_tracer_internal_log_tracer() ->
  openapi_api:org_apache_sling_tracer_internal_log_tracer().

org_apache_sling_tracer_internal_log_tracer_args(_S) ->
  [].

%%==============================================================================
%% org_apache_sling_xss_impl_xss_filter_impl
%%==============================================================================

org_apache_sling_xss_impl_xss_filter_impl() ->
  openapi_api:org_apache_sling_xss_impl_xss_filter_impl().

org_apache_sling_xss_impl_xss_filter_impl_args(_S) ->
  [].

