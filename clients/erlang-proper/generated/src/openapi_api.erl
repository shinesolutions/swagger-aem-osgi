-module(openapi_api).

-export([ adaptive_form_and_interactive_communication_web_channel_configuration/0
        , adaptive_form_and_interactive_communication_web_channel_theme_configur/0
        , analytics_component_query_cache_service/0
        , apache_sling_health_check_result_html_serializer/0
        , com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration/0
        , com_adobe_aem_transaction_core_impl_transaction_recorder/0
        , com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc/0
        , com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc/0
        , com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl/0
        , com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl/0
        , com_adobe_cq_account_api_account_management_service/0
        , com_adobe_cq_account_impl_account_management_servlet/0
        , com_adobe_cq_address_impl_location_location_list_servlet/0
        , com_adobe_cq_audit_purge_dam/0
        , com_adobe_cq_audit_purge_pages/0
        , com_adobe_cq_audit_purge_replication/0
        , com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter/0
        , com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl/0
        , com_adobe_cq_cdn_rewriter_impl_cdn_rewriter/0
        , com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle/0
        , com_adobe_cq_commerce_impl_asset_dynamic_image_handler/0
        , com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl/0
        , com_adobe_cq_commerce_impl_asset_static_image_handler/0
        , com_adobe_cq_commerce_impl_asset_video_handler/0
        , com_adobe_cq_commerce_impl_promotion_promotion_manager_impl/0
        , com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl/0
        , com_adobe_cq_commerce_pim_impl_page_event_listener/0
        , com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl/0
        , com_adobe_cq_contentinsight_impl_reporting_services_settings_provider/0
        , com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet/0
        , com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle/0
        , com_adobe_cq_dam_cfm_impl_component_component_config_impl/0
        , com_adobe_cq_dam_cfm_impl_conf_feature_config_impl/0
        , com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor/0
        , com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter/0
        , com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter/0
        , com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl/0
        , com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker/0
        , com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl/0
        , com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl/0
        , com_adobe_cq_dam_processor_nui_impl_nui_asset_processor/0
        , com_adobe_cq_dam_s7imaging_impl_is_image_server_component/0
        , com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet/0
        , com_adobe_cq_dam_webdav_impl_io_asset_io_handler/0
        , com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job/0
        , com_adobe_cq_dam_webdav_impl_io_special_files_handler/0
        , com_adobe_cq_deserfw_impl_deserialization_firewall_impl/0
        , com_adobe_cq_dtm_impl_service_dtm_web_service_impl/0
        , com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet/0
        , com_adobe_cq_dtm_reactor_impl_service_web_service_impl/0
        , com_adobe_cq_experiencelog_impl_experience_log_config_servlet/0
        , com_adobe_cq_hc_content_packages_health_check/0
        , com_adobe_cq_history_impl_history_request_filter/0
        , com_adobe_cq_history_impl_history_service_impl/0
        , com_adobe_cq_inbox_impl_typeprovider_item_type_provider/0
        , com_adobe_cq_projects_impl_servlet_project_image_servlet/0
        , com_adobe_cq_projects_purge_scheduler/0
        , com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl/0
        , com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl/0
        , com_adobe_cq_screens_device_impl_device_service/0
        , com_adobe_cq_screens_device_registration_impl_registration_service_impl/0
        , com_adobe_cq_screens_impl_handler_channels_update_handler/0
        , com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job/0
        , com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl/0
        , com_adobe_cq_screens_impl_screens_channel_post_processor/0
        , com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl/0
        , com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider/0
        , com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl/0
        , com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl/0
        , com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag/0
        , com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch/0
        , com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check/0
        , com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check/0
        , com_adobe_cq_security_hc_packages_impl_example_content_health_check/0
        , com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check/0
        , com_adobe_cq_social_accountverification_impl_account_management_config_im/0
        , com_adobe_cq_social_activitystreams_client_impl_social_activity_componen/0
        , com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co/0
        , com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler/0
        , com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten/0
        , com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s/0
        , com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre/0
        , com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i/0
        , com_adobe_cq_social_calendar_client_operationextensions_event_attachmen/0
        , com_adobe_cq_social_calendar_servlets_time_zone_servlet/0
        , com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event/0
        , com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se/0
        , com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati/0
        , com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c/0
        , com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos/0
        , com_adobe_cq_social_commons_cors_cors_authentication_filter/0
        , com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl/0
        , com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener/0
        , com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp/0
        , com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp/0
        , com_adobe_cq_social_commons_emailreply_impl_email_reply_importer/0
        , com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider/0
        , com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider/0
        , com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload/0
        , com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl/0
        , com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit/0
        , com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl/0
        , com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle/0
        , com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper/0
        , com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl/0
        , com_adobe_cq_social_content_fragments_services_impl_communities_fragmen/0
        , com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory/0
        , com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory/0
        , com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor/0
        , com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f/0
        , com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto/0
        , com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l/0
        , com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou/0
        , com_adobe_cq_social_enablement_services_impl_author_marker_impl/0
        , com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge/0
        , com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera/0
        , com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service/0
        , com_adobe_cq_social_forum_dispatcher_impl_flush_operations/0
        , com_adobe_cq_social_group_client_impl_community_group_collection_componen/0
        , com_adobe_cq_social_group_impl_group_service_impl/0
        , com_adobe_cq_social_handlebars_guava_template_cache_impl/0
        , com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s/0
        , com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser/0
        , com_adobe_cq_social_members_endpoints_impl_community_member_group_profile/0
        , com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o/0
        , com_adobe_cq_social_members_impl_community_member_group_profile_component_f/0
        , com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation/0
        , com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen/0
        , com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social/0
        , com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen/0
        , com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci/0
        , com_adobe_cq_social_notifications_impl_mentions_router/0
        , com_adobe_cq_social_notifications_impl_notification_manager_impl/0
        , com_adobe_cq_social_notifications_impl_notifications_router/0
        , com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic/0
        , com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i/0
        , com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m/0
        , com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s/0
        , com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi/0
        , com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet/0
        , com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet/0
        , com_adobe_cq_social_scoring_impl_scoring_event_listener/0
        , com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl/0
        , com_adobe_cq_social_site_endpoints_impl_site_operation_service/0
        , com_adobe_cq_social_site_impl_analytics_component_configuration_service_im/0
        , com_adobe_cq_social_site_impl_site_configurator_impl/0
        , com_adobe_cq_social_srp_impl_social_solr_connector/0
        , com_adobe_cq_social_sync_impl_diff_changes_observer/0
        , com_adobe_cq_social_sync_impl_group_sync_listener_impl/0
        , com_adobe_cq_social_sync_impl_publisher_sync_service_impl/0
        , com_adobe_cq_social_sync_impl_user_sync_listener_impl/0
        , com_adobe_cq_social_translation_impl_translation_service_config_manager/0
        , com_adobe_cq_social_translation_impl_ugc_language_detector/0
        , com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl/0
        , com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl/0
        , com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl/0
        , com_adobe_cq_social_ugcbase_impl_social_utils_impl/0
        , com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl/0
        , com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process/0
        , com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli/0
        , com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl/0
        , com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet/0
        , com_adobe_cq_social_user_impl_transport_http_to_publisher/0
        , com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact/0
        , com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup/0
        , com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup/0
        , com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service/0
        , com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task/0
        , com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service/0
        , com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service/0
        , com_adobe_cq_wcm_launches_impl_launches_event_handler/0
        , com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator/0
        , com_adobe_cq_wcm_style_internal_component_style_info_cache_impl/0
        , com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl/0
        , com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service/0
        , com_adobe_fd_fp_config_forms_portal_scheduler_service/0
        , com_adobe_forms_common_service_impl_default_data_provider/0
        , com_adobe_forms_common_service_impl_forms_common_configuration_service_imp/0
        , com_adobe_forms_common_servlet_temp_clean_up_task/0
        , com_adobe_granite_acp_platform_platform_servlet/0
        , com_adobe_granite_activitystreams_impl_activity_manager_impl/0
        , com_adobe_granite_analyzer_base_system_status_servlet/0
        , com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet/0
        , com_adobe_granite_apicontroller_filter_resolver_hook_factory/0
        , com_adobe_granite_auth_cert_impl_client_cert_auth_handler/0
        , com_adobe_granite_auth_ims/0
        , com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension/0
        , com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl/0
        , com_adobe_granite_auth_ims_impl_ims_config_provider_impl/0
        , com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator/0
        , com_adobe_granite_auth_ims_impl_ims_provider_impl/0
        , com_adobe_granite_auth_oauth_accesstoken_provider/0
        , com_adobe_granite_auth_oauth_impl_bearer_authentication_handler/0
        , com_adobe_granite_auth_oauth_impl_default_token_validator_impl/0
        , com_adobe_granite_auth_oauth_impl_facebook_provider_impl/0
        , com_adobe_granite_auth_oauth_impl_github_provider_impl/0
        , com_adobe_granite_auth_oauth_impl_granite_provider/0
        , com_adobe_granite_auth_oauth_impl_helper_provider_config_manager/0
        , com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal/0
        , com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler/0
        , com_adobe_granite_auth_oauth_impl_twitter_provider_impl/0
        , com_adobe_granite_auth_oauth_provider/0
        , com_adobe_granite_auth_requirement_impl_default_requirement_handler/0
        , com_adobe_granite_auth_saml_saml_authentication_handler/0
        , com_adobe_granite_auth_sso_impl_sso_authentication_handler/0
        , com_adobe_granite_bundles_hc_impl_code_cache_health_check/0
        , com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check/0
        , com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check/0
        , com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check/0
        , com_adobe_granite_bundles_hc_impl_jobs_health_check/0
        , com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check/0
        , com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check/0
        , com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check/0
        , com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check/0
        , com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check/0
        , com_adobe_granite_comments_internal_comment_replication_content_filter_fac/0
        , com_adobe_granite_compatrouter_impl_compat_switching_service_impl/0
        , com_adobe_granite_compatrouter_impl_routing_config/0
        , com_adobe_granite_compatrouter_impl_switch_mapping_config/0
        , com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving/0
        , com_adobe_granite_contexthub_impl_context_hub_impl/0
        , com_adobe_granite_cors_impl_cors_policy_impl/0
        , com_adobe_granite_csrf_impl_csrf_filter/0
        , com_adobe_granite_csrf_impl_csrf_servlet/0
        , com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se/0
        , com_adobe_granite_distribution_core_impl_diff_diff_changes_observer/0
        , com_adobe_granite_distribution_core_impl_diff_diff_event_listener/0
        , com_adobe_granite_distribution_core_impl_distribution_to_replication_even/0
        , com_adobe_granite_distribution_core_impl_replication_adapters_replicat/0
        , com_adobe_granite_distribution_core_impl_replication_distribution_trans/0
        , com_adobe_granite_distribution_core_impl_transport_access_token_distribu/0
        , com_adobe_granite_frags_impl_check_http_header_flag/0
        , com_adobe_granite_frags_impl_random_feature/0
        , com_adobe_granite_httpcache_file_file_cache_store/0
        , com_adobe_granite_httpcache_impl_outer_cache_filter/0
        , com_adobe_granite_i18n_impl_bundle_pseudo_translations/0
        , com_adobe_granite_i18n_impl_preferences_locale_resolver_service/0
        , com_adobe_granite_infocollector_info_collector/0
        , com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory/0
        , com_adobe_granite_license_impl_license_check_filter/0
        , com_adobe_granite_logging_impl_log_analyser_impl/0
        , com_adobe_granite_logging_impl_log_error_health_check/0
        , com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task/0
        , com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task/0
        , com_adobe_granite_maintenance_crx_impl_revision_cleanup_task/0
        , com_adobe_granite_monitoring_impl_script_config_impl/0
        , com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han/0
        , com_adobe_granite_oauth_server_impl_access_token_cleanup_task/0
        , com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet/0
        , com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet/0
        , com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet/0
        , com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet/0
        , com_adobe_granite_offloading_impl_offloading_configurator/0
        , com_adobe_granite_offloading_impl_offloading_job_cloner/0
        , com_adobe_granite_offloading_impl_offloading_job_offloader/0
        , com_adobe_granite_offloading_impl_transporter_offloading_agent_manager/0
        , com_adobe_granite_offloading_impl_transporter_offloading_default_transpo/0
        , com_adobe_granite_omnisearch_impl_core_omni_search_service_impl/0
        , com_adobe_granite_optout_impl_opt_out_service_impl/0
        , com_adobe_granite_queries_impl_hc_async_index_health_check/0
        , com_adobe_granite_queries_impl_hc_large_index_health_check/0
        , com_adobe_granite_queries_impl_hc_queries_status_health_check/0
        , com_adobe_granite_queries_impl_hc_query_health_check_metrics/0
        , com_adobe_granite_queries_impl_hc_query_limits_health_check/0
        , com_adobe_granite_replication_hc_impl_replication_queue_health_check/0
        , com_adobe_granite_replication_hc_impl_replication_transport_users_health_c/0
        , com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check/0
        , com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c/0
        , com_adobe_granite_repository_hc_impl_continuous_rgc_health_check/0
        , com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che/0
        , com_adobe_granite_repository_hc_impl_default_logins_health_check/0
        , com_adobe_granite_repository_hc_impl_disk_space_health_check/0
        , com_adobe_granite_repository_hc_impl_observation_queue_length_health_check/0
        , com_adobe_granite_repository_impl_commit_stats_config/0
        , com_adobe_granite_repository_service_user_configuration/0
        , com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im/0
        , com_adobe_granite_resourcestatus_impl_composite_status_type/0
        , com_adobe_granite_resourcestatus_impl_status_resource_provider_impl/0
        , com_adobe_granite_rest_assets_impl_asset_content_disposition_filter/0
        , com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl/0
        , com_adobe_granite_rest_impl_servlet_default_get_servlet/0
        , com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s/0
        , com_adobe_granite_security_user_user_properties_service/0
        , com_adobe_granite_socialgraph_impl_social_graph_factory_impl/0
        , com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl/0
        , com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory/0
        , com_adobe_granite_taskmanagement_impl_jcr_task_archive_service/0
        , com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task/0
        , com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor/0
        , com_adobe_granite_threaddump_thread_dump_collector/0
        , com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl/0
        , com_adobe_granite_translation_core_impl_translation_manager_impl/0
        , com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl/0
        , com_adobe_granite_workflow_console_frags_workflow_withdraw_feature/0
        , com_adobe_granite_workflow_console_publish_workflow_publish_event_service/0
        , com_adobe_granite_workflow_core_jcr_workflow_bucket_manager/0
        , com_adobe_granite_workflow_core_job_external_process_job_handler/0
        , com_adobe_granite_workflow_core_job_job_handler/0
        , com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum/0
        , com_adobe_granite_workflow_core_payload_map_cache/0
        , com_adobe_granite_workflow_core_payloadmap_payload_move_listener/0
        , com_adobe_granite_workflow_core_workflow_config/0
        , com_adobe_granite_workflow_core_workflow_session_factory/0
        , com_adobe_granite_workflow_purge_scheduler/0
        , com_adobe_octopus_ncomm_bootstrap/0
        , com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s/0
        , com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm/0
        , com_day_commons_datasource_jdbcpool_jdbc_pool_service/0
        , com_day_commons_httpclient/0
        , com_day_cq_analytics_impl_store_properties_change_listener/0
        , com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte/0
        , com_day_cq_analytics_sitecatalyst_impl_importer_report_importer/0
        , com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory/0
        , com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl/0
        , com_day_cq_analytics_testandtarget_impl_account_options_updater/0
        , com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener/0
        , com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener/0
        , com_day_cq_analytics_testandtarget_impl_segment_importer/0
        , com_day_cq_analytics_testandtarget_impl_service_web_service_impl/0
        , com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet/0
        , com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl/0
        , com_day_cq_auth_impl_cug_cug_support_impl/0
        , com_day_cq_auth_impl_login_selector_handler/0
        , com_day_cq_commons_impl_externalizer_impl/0
        , com_day_cq_commons_servlets_root_mapping_servlet/0
        , com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke/0
        , com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list/0
        , com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist/0
        , com_day_cq_contentsync_impl_content_sync_manager_impl/0
        , com_day_cq_dam_commons_handler_standard_image_handler/0
        , com_day_cq_dam_commons_metadata_xmp_filter_black_white/0
        , com_day_cq_dam_commons_util_impl_asset_cache_impl/0
        , com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config/0
        , com_day_cq_dam_core_impl_asset_move_listener/0
        , com_day_cq_dam_core_impl_assethome_asset_home_page_configuration/0
        , com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet/0
        , com_day_cq_dam_core_impl_cache_cq_buffered_image_cache/0
        , com_day_cq_dam_core_impl_dam_change_event_listener/0
        , com_day_cq_dam_core_impl_dam_event_purge_service/0
        , com_day_cq_dam_core_impl_dam_event_recorder_impl/0
        , com_day_cq_dam_core_impl_event_dam_event_audit_listener/0
        , com_day_cq_dam_core_impl_expiry_notification_job_impl/0
        , com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat/0
        , com_day_cq_dam_core_impl_gfx_commons_gfx_renderer/0
        , com_day_cq_dam_core_impl_handler_eps_format_handler/0
        , com_day_cq_dam_core_impl_handler_indesign_format_handler/0
        , com_day_cq_dam_core_impl_handler_jpeg_handler/0
        , com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler/0
        , com_day_cq_dam_core_impl_jmx_asset_index_update_monitor/0
        , com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl/0
        , com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl/0
        , com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config/0
        , com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config/0
        , com_day_cq_dam_core_impl_lightbox_lightbox_servlet/0
        , com_day_cq_dam_core_impl_metadata_editor_select_component_handler/0
        , com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper/0
        , com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl/0
        , com_day_cq_dam_core_impl_missing_metadata_notification_job/0
        , com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr/0
        , com_day_cq_dam_core_impl_process_text_extraction_process/0
        , com_day_cq_dam_core_impl_rendition_maker_impl/0
        , com_day_cq_dam_core_impl_reports_report_export_service/0
        , com_day_cq_dam_core_impl_reports_report_purge_service/0
        , com_day_cq_dam_core_impl_servlet_asset_download_servlet/0
        , com_day_cq_dam_core_impl_servlet_asset_status_servlet/0
        , com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet/0
        , com_day_cq_dam_core_impl_servlet_batch_metadata_servlet/0
        , com_day_cq_dam_core_impl_servlet_binary_provider_servlet/0
        , com_day_cq_dam_core_impl_servlet_collection_servlet/0
        , com_day_cq_dam_core_impl_servlet_collections_servlet/0
        , com_day_cq_dam_core_impl_servlet_companion_servlet/0
        , com_day_cq_dam_core_impl_servlet_create_asset_servlet/0
        , com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter/0
        , com_day_cq_dam_core_impl_servlet_guid_lookup_filter/0
        , com_day_cq_dam_core_impl_servlet_health_check_servlet/0
        , com_day_cq_dam_core_impl_servlet_metadata_get_servlet/0
        , com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet/0
        , com_day_cq_dam_core_impl_servlet_resource_collection_servlet/0
        , com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl/0
        , com_day_cq_dam_core_impl_unzip_unzip_config/0
        , com_day_cq_dam_core_process_exif_tool_extract_metadata_process/0
        , com_day_cq_dam_core_process_extract_metadata_process/0
        , com_day_cq_dam_core_process_metadata_processor_process/0
        , com_day_cq_dam_handler_ffmpeg_locator_impl/0
        , com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl/0
        , com_day_cq_dam_handler_standard_pdf_pdf_handler/0
        , com_day_cq_dam_handler_standard_ps_post_script_handler/0
        , com_day_cq_dam_handler_standard_psd_psd_handler/0
        , com_day_cq_dam_ids_impl_ids_job_processor/0
        , com_day_cq_dam_ids_impl_ids_pool_manager_impl/0
        , com_day_cq_dam_indd_impl_handler_indesign_xmp_handler/0
        , com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet/0
        , com_day_cq_dam_indd_process_indd_media_extract_process/0
        , com_day_cq_dam_performance_internal_asset_performance_data_handler_impl/0
        , com_day_cq_dam_performance_internal_asset_performance_report_sync_job/0
        , com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro/0
        , com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even/0
        , com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner/0
        , com_day_cq_dam_s7dam_common_post_servlets_set_create_handler/0
        , com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler/0
        , com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process/0
        , com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener/0
        , com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet/0
        , com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl/0
        , com_day_cq_dam_scene7_impl_scene7_api_client_impl/0
        , com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl/0
        , com_day_cq_dam_scene7_impl_scene7_configuration_event_listener/0
        , com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener/0
        , com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl/0
        , com_day_cq_dam_scene7_impl_scene7_upload_service_impl/0
        , com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser/0
        , com_day_cq_dam_stock_integration_impl_configuration_stock_configuration/0
        , com_day_cq_dam_video_impl_servlet_video_test_servlet/0
        , com_day_cq_extwidget_servlets_image_sprite_servlet/0
        , com_day_cq_image_internal_font_font_helper/0
        , com_day_cq_jcrclustersupport_cluster_start_level_controller/0
        , com_day_cq_mailer_default_mail_service/0
        , com_day_cq_mailer_impl_cq_mailing_service/0
        , com_day_cq_mailer_impl_email_cq_email_template_factory/0
        , com_day_cq_mailer_impl_email_cq_retriever_template_factory/0
        , com_day_cq_mcm_campaign_impl_integration_config_impl/0
        , com_day_cq_mcm_campaign_importer_personalized_text_handler_factory/0
        , com_day_cq_mcm_core_newsletter_newsletter_email_service_impl/0
        , com_day_cq_mcm_impl_mcm_configuration/0
        , com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen/0
        , com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug/0
        , com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component/0
        , com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha/0
        , com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h/0
        , com_day_cq_notification_impl_notification_service_impl/0
        , com_day_cq_personalization_impl_servlets_targeting_configuration_servlet/0
        , com_day_cq_polling_importer_impl_managed_poll_config_impl/0
        , com_day_cq_polling_importer_impl_managed_polling_importer_impl/0
        , com_day_cq_polling_importer_impl_polling_importer_impl/0
        , com_day_cq_replication_audit_replication_event_listener/0
        , com_day_cq_replication_content_static_content_builder/0
        , com_day_cq_replication_impl_agent_manager_impl/0
        , com_day_cq_replication_impl_content_durbo_binary_less_content_builder/0
        , com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov/0
        , com_day_cq_replication_impl_replication_content_factory_provider_impl/0
        , com_day_cq_replication_impl_replication_receiver_impl/0
        , com_day_cq_replication_impl_replicator_impl/0
        , com_day_cq_replication_impl_reverse_replicator/0
        , com_day_cq_replication_impl_transport_binary_less_transport_handler/0
        , com_day_cq_replication_impl_transport_http/0
        , com_day_cq_reporting_impl_cache_cache_impl/0
        , com_day_cq_reporting_impl_config_service_impl/0
        , com_day_cq_reporting_impl_r_log_analyzer/0
        , com_day_cq_rewriter_linkchecker_impl_link_checker_impl/0
        , com_day_cq_rewriter_linkchecker_impl_link_checker_task/0
        , com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory/0
        , com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl/0
        , com_day_cq_rewriter_processor_impl_html_parser_factory/0
        , com_day_cq_search_impl_builder_query_builder_impl/0
        , com_day_cq_search_suggest_impl_suggestion_index_manager_impl/0
        , com_day_cq_searchpromote_impl_publish_search_promote_config_handler/0
        , com_day_cq_searchpromote_impl_search_promote_service_impl/0
        , com_day_cq_security_acl_setup/0
        , com_day_cq_statistics_impl_statistics_service_impl/0
        , com_day_cq_tagging_impl_jcr_tag_manager_factory_impl/0
        , com_day_cq_tagging_impl_search_tag_predicate_evaluator/0
        , com_day_cq_tagging_impl_tag_garbage_collector/0
        , com_day_cq_wcm_contentsync_impl_handler_pages_update_handler/0
        , com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor/0
        , com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl/0
        , com_day_cq_wcm_core_impl_commands_wcm_command_servlet/0
        , com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl/0
        , com_day_cq_wcm_core_impl_event_page_event_audit_listener/0
        , com_day_cq_wcm_core_impl_event_page_post_processor/0
        , com_day_cq_wcm_core_impl_event_repository_change_event_listener/0
        , com_day_cq_wcm_core_impl_event_template_post_processor/0
        , com_day_cq_wcm_core_impl_language_manager_impl/0
        , com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl/0
        , com_day_cq_wcm_core_impl_page_page_info_aggregator_impl/0
        , com_day_cq_wcm_core_impl_page_page_manager_factory_impl/0
        , com_day_cq_wcm_core_impl_references_content_content_reference_config/0
        , com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler/0
        , com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie/0
        , com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler/0
        , com_day_cq_wcm_core_impl_servlets_find_replace_servlet/0
        , com_day_cq_wcm_core_impl_servlets_reference_search_servlet/0
        , com_day_cq_wcm_core_impl_servlets_thumbnail_servlet/0
        , com_day_cq_wcm_core_impl_utils_default_page_name_validator/0
        , com_day_cq_wcm_core_impl_variants_page_variants_provider_impl/0
        , com_day_cq_wcm_core_impl_version_manager_impl/0
        , com_day_cq_wcm_core_impl_version_purge_task/0
        , com_day_cq_wcm_core_impl_warp_time_warp_filter/0
        , com_day_cq_wcm_core_impl_wcm_debug_filter/0
        , com_day_cq_wcm_core_impl_wcm_developer_mode_filter/0
        , com_day_cq_wcm_core_mvt_mvt_statistics_impl/0
        , com_day_cq_wcm_core_stats_page_view_statistics_impl/0
        , com_day_cq_wcm_core_wcm_request_filter/0
        , com_day_cq_wcm_designimporter_design_package_importer/0
        , com_day_cq_wcm_designimporter_impl_canvas_builder_impl/0
        , com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler/0
        , com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl/0
        , com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen/0
        , com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl/0
        , com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet/0
        , com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor/0
        , com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet/0
        , com_day_cq_wcm_foundation_forms_impl_mail_servlet/0
        , com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet/0
        , com_day_cq_wcm_foundation_impl_http_auth_handler/0
        , com_day_cq_wcm_foundation_impl_page_impressions_tracker/0
        , com_day_cq_wcm_foundation_impl_page_redirect_servlet/0
        , com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist/0
        , com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl/0
        , com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory/0
        , com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter/0
        , com_day_cq_wcm_msm_impl_actions_content_copy_action_factory/0
        , com_day_cq_wcm_msm_impl_actions_content_delete_action_factory/0
        , com_day_cq_wcm_msm_impl_actions_content_update_action_factory/0
        , com_day_cq_wcm_msm_impl_actions_order_children_action_factory/0
        , com_day_cq_wcm_msm_impl_actions_page_move_action_factory/0
        , com_day_cq_wcm_msm_impl_actions_references_update_action_factory/0
        , com_day_cq_wcm_msm_impl_actions_version_copy_action_factory/0
        , com_day_cq_wcm_msm_impl_live_relationship_manager_impl/0
        , com_day_cq_wcm_msm_impl_rollout_manager_impl/0
        , com_day_cq_wcm_msm_impl_servlets_audit_log_servlet/0
        , com_day_cq_wcm_notification_email_impl_email_channel/0
        , com_day_cq_wcm_notification_impl_notification_manager_impl/0
        , com_day_cq_wcm_scripting_impl_bvp_manager/0
        , com_day_cq_wcm_undo_undo_config/0
        , com_day_cq_wcm_webservicesupport_impl_replication_event_listener/0
        , com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl/0
        , com_day_cq_wcm_workflow_impl_workflow_package_info_provider/0
        , com_day_cq_widget_impl_html_library_manager_impl/0
        , com_day_cq_widget_impl_widget_extension_provider_impl/0
        , com_day_cq_workflow_impl_email_e_mail_notification_service/0
        , com_day_cq_workflow_impl_email_task_e_mail_notification_service/0
        , com_day_crx_security_token_impl_impl_token_authentication_handler/0
        , com_day_crx_security_token_impl_token_cleanup_task/0
        , guide_localization_service/0
        , messaging_user_component_factory/0
        , org_apache_aries_jmx_framework_state_config/0
        , org_apache_felix_eventadmin_impl_event_admin/0
        , org_apache_felix_http/0
        , org_apache_felix_http_sslfilter_ssl_filter/0
        , org_apache_felix_jaas_configuration_factory/0
        , org_apache_felix_jaas_configuration_spi/0
        , org_apache_felix_scr_scr_service/0
        , org_apache_felix_systemready_impl_components_check/0
        , org_apache_felix_systemready_impl_framework_start_check/0
        , org_apache_felix_systemready_impl_services_check/0
        , org_apache_felix_systemready_impl_servlet_system_alive_servlet/0
        , org_apache_felix_systemready_impl_servlet_system_ready_servlet/0
        , org_apache_felix_systemready_system_ready_monitor/0
        , org_apache_felix_webconsole_internal_servlet_osgi_manager/0
        , org_apache_felix_webconsole_plugins_event_internal_plugin_servlet/0
        , org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co/0
        , org_apache_http_proxyconfigurator/0
        , org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider/0
        , org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store/0
        , org_apache_jackrabbit_oak_plugins_document_document_node_store_service/0
        , org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre/0
        , org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac/0
        , org_apache_jackrabbit_oak_plugins_index_async_indexer_service/0
        , org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv/0
        , org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co/0
        , org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers/0
        , org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration/0
        , org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf/0
        , org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid/0
        , org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se/0
        , org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory/0
        , org_apache_jackrabbit_oak_plugins_observation_change_collector_provider/0
        , org_apache_jackrabbit_oak_query_query_engine_settings_service/0
        , org_apache_jackrabbit_oak_security_authentication_authentication_config/0
        , org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi/0
        , org_apache_jackrabbit_oak_security_authentication_token_token_configura/0
        , org_apache_jackrabbit_oak_security_authorization_authorization_configur/0
        , org_apache_jackrabbit_oak_security_internal_security_provider_registrati/0
        , org_apache_jackrabbit_oak_security_user_random_authorizable_node_name/0
        , org_apache_jackrabbit_oak_security_user_user_configuration_impl/0
        , org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service/0
        , org_apache_jackrabbit_oak_segment_segment_node_store_factory/0
        , org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service/0
        , org_apache_jackrabbit_oak_segment_segment_node_store_service/0
        , org_apache_jackrabbit_oak_segment_standby_store_standby_store_service/0
        , org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de/0
        , org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex/0
        , org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr/0
        , org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi/0
        , org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu/0
        , org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable/0
        , org_apache_jackrabbit_vault_packaging_impl_packaging_impl/0
        , org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry/0
        , org_apache_sling_auth_core_impl_logout_servlet/0
        , org_apache_sling_caconfig_impl_configuration_bindings_value_provider/0
        , org_apache_sling_caconfig_impl_configuration_resolver_impl/0
        , org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra/0
        , org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra/0
        , org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi/0
        , org_apache_sling_caconfig_impl_override_system_property_configuration_ove/0
        , org_apache_sling_caconfig_management_impl_configuration_management_setti/0
        , org_apache_sling_caconfig_resource_impl_def_default_configuration_resour/0
        , org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy/0
        , org_apache_sling_commons_html_internal_tagsoup_html_parser/0
        , org_apache_sling_commons_log_log_manager/0
        , org_apache_sling_commons_log_log_manager_factory_config/0
        , org_apache_sling_commons_log_log_manager_factory_writer/0
        , org_apache_sling_commons_metrics_internal_log_reporter/0
        , org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter/0
        , org_apache_sling_commons_mime_internal_mime_type_service_impl/0
        , org_apache_sling_commons_scheduler_impl_quartz_scheduler/0
        , org_apache_sling_commons_scheduler_impl_scheduler_health_check/0
        , org_apache_sling_commons_threads_impl_default_thread_pool_factory/0
        , org_apache_sling_datasource_data_source_factory/0
        , org_apache_sling_datasource_jndi_data_source_factory/0
        , org_apache_sling_discovery_oak_config/0
        , org_apache_sling_discovery_oak_synchronized_clocks_health_check/0
        , org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto/0
        , org_apache_sling_distribution_agent_impl_privilege_distribution_request_a/0
        , org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory/0
        , org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto/0
        , org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor/0
        , org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory/0
        , org_apache_sling_distribution_monitor_distribution_queue_health_check/0
        , org_apache_sling_distribution_packaging_impl_exporter_agent_distributio/0
        , org_apache_sling_distribution_packaging_impl_exporter_local_distributio/0
        , org_apache_sling_distribution_packaging_impl_exporter_remote_distributi/0
        , org_apache_sling_distribution_packaging_impl_importer_local_distributio/0
        , org_apache_sling_distribution_packaging_impl_importer_remote_distributi/0
        , org_apache_sling_distribution_packaging_impl_importer_repository_distri/0
        , org_apache_sling_distribution_resources_impl_distribution_configuration/0
        , org_apache_sling_distribution_resources_impl_distribution_service_resour/0
        , org_apache_sling_distribution_serialization_impl_distribution_package_bu/0
        , org_apache_sling_distribution_serialization_impl_vlt_vault_distribution/0
        , org_apache_sling_distribution_transport_impl_user_credentials_distributi/0
        , org_apache_sling_distribution_trigger_impl_distribution_event_distribute/0
        , org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger/0
        , org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi/0
        , org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig/0
        , org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr/0
        , org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge/0
        , org_apache_sling_engine_impl_auth_sling_authenticator/0
        , org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter/0
        , org_apache_sling_engine_impl_log_request_logger/0
        , org_apache_sling_engine_impl_log_request_logger_service/0
        , org_apache_sling_engine_impl_sling_main_servlet/0
        , org_apache_sling_engine_parameters/0
        , org_apache_sling_event_impl_eventing_thread_pool/0
        , org_apache_sling_event_impl_jobs_default_job_manager/0
        , org_apache_sling_event_impl_jobs_jcr_persistence_handler/0
        , org_apache_sling_event_impl_jobs_job_consumer_manager/0
        , org_apache_sling_event_jobs_queue_configuration/0
        , org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w/0
        , org_apache_sling_featureflags_feature/0
        , org_apache_sling_featureflags_impl_configured_feature/0
        , org_apache_sling_hapi_impl_h_api_util_impl/0
        , org_apache_sling_hc_core_impl_composite_health_check/0
        , org_apache_sling_hc_core_impl_executor_health_check_executor_impl/0
        , org_apache_sling_hc_core_impl_jmx_attribute_health_check/0
        , org_apache_sling_hc_core_impl_scriptable_health_check/0
        , org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet/0
        , org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer/0
        , org_apache_sling_i18n_impl_i18_n_filter/0
        , org_apache_sling_i18n_impl_jcr_resource_bundle_provider/0
        , org_apache_sling_installer_provider_jcr_impl_jcr_installer/0
        , org_apache_sling_jcr_base_internal_login_admin_whitelist/0
        , org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment/0
        , org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet/0
        , org_apache_sling_jcr_jackrabbit_server_jndi_registration_support/0
        , org_apache_sling_jcr_jackrabbit_server_rmi_registration_support/0
        , org_apache_sling_jcr_repoinit_impl_repository_initializer/0
        , org_apache_sling_jcr_repoinit_repository_initializer/0
        , org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl/0
        , org_apache_sling_jcr_resource_internal_jcr_system_user_validator/0
        , org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory/0
        , org_apache_sling_jcr_webdav_impl_handler_default_handler_service/0
        , org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic/0
        , org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet/0
        , org_apache_sling_jmx_provider_impl_jmx_resource_provider/0
        , org_apache_sling_models_impl_model_adapter_factory/0
        , org_apache_sling_models_jacksonexporter_impl_resource_module_provider/0
        , org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto/0
        , org_apache_sling_resourcemerger_impl_merged_resource_provider_factory/0
        , org_apache_sling_resourcemerger_picker_overriding/0
        , org_apache_sling_scripting_core_impl_script_cache_impl/0
        , org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider/0
        , org_apache_sling_scripting_java_impl_java_script_engine_factory/0
        , org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa/0
        , org_apache_sling_scripting_jsp_jsp_script_engine_factory/0
        , org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov/0
        , org_apache_sling_security_impl_content_disposition_filter/0
        , org_apache_sling_security_impl_referrer_filter/0
        , org_apache_sling_serviceusermapping_impl_service_user_mapper_impl/0
        , org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended/0
        , org_apache_sling_servlets_get_default_get_servlet/0
        , org_apache_sling_servlets_get_impl_version_version_info_servlet/0
        , org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task/0
        , org_apache_sling_servlets_post_impl_sling_post_servlet/0
        , org_apache_sling_servlets_resolver_sling_servlet_resolver/0
        , org_apache_sling_settings_impl_sling_settings_service_impl/0
        , org_apache_sling_startupfilter_impl_startup_filter_impl/0
        , org_apache_sling_tenant_internal_tenant_provider_impl/0
        , org_apache_sling_tracer_internal_log_tracer/0
        , org_apache_sling_xss_impl_xss_filter_impl/0
        ]).

-define(BASE_URL, "").

%% @doc 
%% 
-spec adaptive_form_and_interactive_communication_web_channel_configuration() ->
  openapi_utils:response().
adaptive_form_and_interactive_communication_web_channel_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Configuration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"showPlaceholder=">>, ShowPlaceholder, <<"&">>, <<"maximumCacheEntries=">>, MaximumCacheEntries, <<"&">>, <<"af.scripting.compatversion=">>, AfScriptingCompatversion, <<"&">>, <<"makeFileNameUnique=">>, MakeFileNameUnique, <<"&">>, <<"generatingCompliantData=">>, GeneratingCompliantData, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec adaptive_form_and_interactive_communication_web_channel_theme_configur() ->
  openapi_utils:response().
adaptive_form_and_interactive_communication_web_channel_theme_configur() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/Adaptive Form and Interactive Communication Web Channel Theme Configuration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fontList=">>, FontList, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec analytics_component_query_cache_service() ->
  openapi_utils:response().
analytics_component_query_cache_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/Analytics Component Query Cache Service"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.component.query.cache.size=">>, CqAnalyticsComponentQueryCacheSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec apache_sling_health_check_result_html_serializer() ->
  openapi_utils:response().
apache_sling_health_check_result_html_serializer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/Apache Sling Health Check Result HTML Serializer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"styleString=">>, StyleString, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration() ->
  openapi_utils:response().
com_adobe_aem_formsndocuments_config_aem_forms_manager_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.aem.formsndocuments.config.AEMFormsManagerConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"formsManagerConfig.includeOOTBTemplates=">>, FormsManagerConfigIncludeOOTBTemplates, <<"&">>, <<"formsManagerConfig.includeDeprecatedTemplates=">>, FormsManagerConfigIncludeDeprecatedTemplates, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_aem_transaction_core_impl_transaction_recorder() ->
  openapi_utils:response().
com_adobe_aem_transaction_core_impl_transaction_recorder() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.aem.transaction.core.impl.TransactionRecorder"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"isTransactionRecordingEnabled=">>, IsTransactionRecordingEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc() ->
  openapi_utils:response().
com_adobe_aem_upgrade_prechecks_hc_impl_deprecate_indexes_hc() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.DeprecateIndexesHC"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc() ->
  openapi_utils:response().
com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.aem.upgrade.prechecks.hc.impl.ReplicationAgentsDisabledHC"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl() ->
  openapi_utils:response().
com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.aem.upgrade.prechecks.mbean.impl.PreUpgradeTasksMBeanImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pre-upgrade.maintenance.tasks=">>, PreUpgradeMaintenanceTasks, <<"&">>, <<"pre-upgrade.hc.tags=">>, PreUpgradeHcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl() ->
  openapi_utils:response().
com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.aem.upgrade.prechecks.tasks.impl.ConsistencyCheckTaskImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"root.path=">>, RootPath, <<"&">>, <<"fix.inconsistencies=">>, FixInconsistencies, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_account_api_account_management_service() ->
  openapi_utils:response().
com_adobe_cq_account_api_account_management_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.account.api.AccountManagementService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.accountmanager.token.validity.period=">>, CqAccountmanagerTokenValidityPeriod, <<"&">>, <<"cq.accountmanager.config.requestnewaccount.mail=">>, CqAccountmanagerConfigRequestnewaccountMail, <<"&">>, <<"cq.accountmanager.config.requestnewpwd.mail=">>, CqAccountmanagerConfigRequestnewpwdMail, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_account_impl_account_management_servlet() ->
  openapi_utils:response().
com_adobe_cq_account_impl_account_management_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.account.impl.AccountManagementServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.accountmanager.config.informnewaccount.mail=">>, CqAccountmanagerConfigInformnewaccountMail, <<"&">>, <<"cq.accountmanager.config.informnewpwd.mail=">>, CqAccountmanagerConfigInformnewpwdMail, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_address_impl_location_location_list_servlet() ->
  openapi_utils:response().
com_adobe_cq_address_impl_location_location_list_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.address.impl.location.LocationListServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.address.location.default.maxResults=">>, CqAddressLocationDefaultMaxResults, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_audit_purge_dam() ->
  openapi_utils:response().
com_adobe_cq_audit_purge_dam() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.audit.purge.Dam"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"auditlog.rule.name=">>, AuditlogRuleName, <<"&">>, <<"auditlog.rule.contentpath=">>, AuditlogRuleContentpath, <<"&">>, <<"auditlog.rule.minimumage=">>, AuditlogRuleMinimumage, <<"&">>, <<"auditlog.rule.types=">>, AuditlogRuleTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_audit_purge_pages() ->
  openapi_utils:response().
com_adobe_cq_audit_purge_pages() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.audit.purge.Pages"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"auditlog.rule.name=">>, AuditlogRuleName, <<"&">>, <<"auditlog.rule.contentpath=">>, AuditlogRuleContentpath, <<"&">>, <<"auditlog.rule.minimumage=">>, AuditlogRuleMinimumage, <<"&">>, <<"auditlog.rule.types=">>, AuditlogRuleTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_audit_purge_replication() ->
  openapi_utils:response().
com_adobe_cq_audit_purge_replication() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.audit.purge.Replication"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"auditlog.rule.name=">>, AuditlogRuleName, <<"&">>, <<"auditlog.rule.contentpath=">>, AuditlogRuleContentpath, <<"&">>, <<"auditlog.rule.minimumage=">>, AuditlogRuleMinimumage, <<"&">>, <<"auditlog.rule.types=">>, AuditlogRuleTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter() ->
  openapi_utils:response().
com_adobe_cq_cdn_rewriter_impl_aws_cloud_front_rewriter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.AWSCloudFrontRewriter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"keypair.id=">>, KeypairId, <<"&">>, <<"keypair.alias=">>, KeypairAlias, <<"&">>, <<"cdnrewriter.attributes=">>, CdnrewriterAttributes, <<"&">>, <<"cdn.rewriter.distribution.domain=">>, CdnRewriterDistributionDomain, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl() ->
  openapi_utils:response().
com_adobe_cq_cdn_rewriter_impl_cdn_config_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNConfigServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cdn.config.distribution.domain=">>, CdnConfigDistributionDomain, <<"&">>, <<"cdn.config.enable.rewriting=">>, CdnConfigEnableRewriting, <<"&">>, <<"cdn.config.path.prefixes=">>, CdnConfigPathPrefixes, <<"&">>, <<"cdn.config.cdnttl=">>, CdnConfigCdnttl, <<"&">>, <<"cdn.config.application.protocol=">>, CdnConfigApplicationProtocol, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_cdn_rewriter_impl_cdn_rewriter() ->
  openapi_utils:response().
com_adobe_cq_cdn_rewriter_impl_cdn_rewriter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.cdn.rewriter.impl.CDNRewriter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"cdnrewriter.attributes=">>, CdnrewriterAttributes, <<"&">>, <<"cdn.rewriter.distribution.domain=">>, CdnRewriterDistributionDomain, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle() ->
  openapi_utils:response().
com_adobe_cq_cloudconfig_core_impl_configuration_replication_event_handle() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.cloudconfig.core.impl.ConfigurationReplicationEventHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"flush.agents=">>, FlushAgents, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_impl_asset_dynamic_image_handler() ->
  openapi_utils:response().
com_adobe_cq_commerce_impl_asset_dynamic_image_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.impl.asset.DynamicImageHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.asset.handler.active=">>, CqCommerceAssetHandlerActive, <<"&">>, <<"cq.commerce.asset.handler.name=">>, CqCommerceAssetHandlerName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl() ->
  openapi_utils:response().
com_adobe_cq_commerce_impl_asset_product_asset_handler_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.impl.asset.ProductAssetHandlerProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.asset.handler.fallback=">>, CqCommerceAssetHandlerFallback, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_impl_asset_static_image_handler() ->
  openapi_utils:response().
com_adobe_cq_commerce_impl_asset_static_image_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.impl.asset.StaticImageHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.asset.handler.active=">>, CqCommerceAssetHandlerActive, <<"&">>, <<"cq.commerce.asset.handler.name=">>, CqCommerceAssetHandlerName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_impl_asset_video_handler() ->
  openapi_utils:response().
com_adobe_cq_commerce_impl_asset_video_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.impl.asset.VideoHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.asset.handler.active=">>, CqCommerceAssetHandlerActive, <<"&">>, <<"cq.commerce.asset.handler.name=">>, CqCommerceAssetHandlerName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_impl_promotion_promotion_manager_impl() ->
  openapi_utils:response().
com_adobe_cq_commerce_impl_promotion_promotion_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.impl.promotion.PromotionManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.promotion.root=">>, CqCommercePromotionRoot, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl() ->
  openapi_utils:response().
com_adobe_cq_commerce_pim_impl_cataloggenerator_catalog_generator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.pim.impl.cataloggenerator.CatalogGeneratorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.cataloggenerator.bucketsize=">>, CqCommerceCataloggeneratorBucketsize, <<"&">>, <<"cq.commerce.cataloggenerator.bucketname=">>, CqCommerceCataloggeneratorBucketname, <<"&">>, <<"cq.commerce.cataloggenerator.excludedtemplateproperties=">>, CqCommerceCataloggeneratorExcludedtemplateproperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_pim_impl_page_event_listener() ->
  openapi_utils:response().
com_adobe_cq_commerce_pim_impl_page_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.pim.impl.PageEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.commerce.pageeventlistener.enabled=">>, CqCommercePageeventlistenerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl() ->
  openapi_utils:response().
com_adobe_cq_commerce_pim_impl_productfeed_product_feed_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.commerce.pim.impl.productfeed.ProductFeedServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"Feed generator algorithm=">>, FeedGeneratorAlgorithm, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_contentinsight_impl_reporting_services_settings_provider() ->
  openapi_utils:response().
com_adobe_cq_contentinsight_impl_reporting_services_settings_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.contentinsight.impl.ReportingServicesSettingsProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"reportingservices.url=">>, ReportingservicesUrl, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet() ->
  openapi_utils:response().
com_adobe_cq_contentinsight_impl_servlets_bright_edge_proxy_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.BrightEdgeProxyServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"brightedge.url=">>, BrightedgeUrl, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle() ->
  openapi_utils:response().
com_adobe_cq_contentinsight_impl_servlets_reporting_services_proxy_servle() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.contentinsight.impl.servlets.ReportingServicesProxyServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"reportingservices.proxy.whitelist=">>, ReportingservicesProxyWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_cfm_impl_component_component_config_impl() ->
  openapi_utils:response().
com_adobe_cq_dam_cfm_impl_component_component_config_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.cfm.impl.component.ComponentConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dam.cfm.component.resourceType=">>, DamCfmComponentResourceType, <<"&">>, <<"dam.cfm.component.fileReferenceProp=">>, DamCfmComponentFileReferenceProp, <<"&">>, <<"dam.cfm.component.elementsProp=">>, DamCfmComponentElementsProp, <<"&">>, <<"dam.cfm.component.variationProp=">>, DamCfmComponentVariationProp, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_cfm_impl_conf_feature_config_impl() ->
  openapi_utils:response().
com_adobe_cq_dam_cfm_impl_conf_feature_config_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.cfm.impl.conf.FeatureConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dam.cfm.resourceTypes=">>, DamCfmResourceTypes, <<"&">>, <<"dam.cfm.referenceProperties=">>, DamCfmReferenceProperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor() ->
  openapi_utils:response().
com_adobe_cq_dam_cfm_impl_content_rewriter_asset_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.AssetProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pipeline.type=">>, PipelineType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter() ->
  openapi_utils:response().
com_adobe_cq_dam_cfm_impl_content_rewriter_par_range_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.ParRangeFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pipeline.type=">>, PipelineType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter() ->
  openapi_utils:response().
com_adobe_cq_dam_cfm_impl_content_rewriter_payload_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.cfm.impl.content.rewriter.PayloadFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pipeline.type=">>, PipelineType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl() ->
  openapi_utils:response().
com_adobe_cq_dam_dm_process_image_p_tiff_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.dm.process.image.PTiffManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"maxMemory=">>, MaxMemory, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker() ->
  openapi_utils:response().
com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.ips.impl.replication.trigger.ReplicateOnModifyWorker"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dmreplicateonmodify.enabled=">>, DmreplicateonmodifyEnabled, <<"&">>, <<"dmreplicateonmodify.forcesyncdeletes=">>, DmreplicateonmodifyForcesyncdeletes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl() ->
  openapi_utils:response().
com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.mac.sync.helper.impl.MACSyncClientImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.dam.mac.sync.client.so.timeout=">>, ComAdobeDamMacSyncClientSoTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl() ->
  openapi_utils:response().
com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.mac.sync.impl.DAMSyncServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths=">>, ComAdobeCqDamMacSyncDamsyncserviceRegisteredPaths, <<"&">>, <<"com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions=">>, ComAdobeCqDamMacSyncDamsyncserviceSyncRenditions, <<"&">>, <<"com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms=">>, ComAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs, <<"&">>, <<"com.adobe.cq.dam.mac.sync.damsyncservice.platform=">>, ComAdobeCqDamMacSyncDamsyncservicePlatform, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_processor_nui_impl_nui_asset_processor() ->
  openapi_utils:response().
com_adobe_cq_dam_processor_nui_impl_nui_asset_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.processor.nui.impl.NuiAssetProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"nuiEnabled=">>, NuiEnabled, <<"&">>, <<"nuiServiceUrl=">>, NuiServiceUrl, <<"&">>, <<"nuiApiKey=">>, NuiApiKey, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_s7imaging_impl_is_image_server_component() ->
  openapi_utils:response().
com_adobe_cq_dam_s7imaging_impl_is_image_server_component() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.is.ImageServerComponent"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"TcpPort=">>, TcpPort, <<"&">>, <<"AllowRemoteAccess=">>, AllowRemoteAccess, <<"&">>, <<"MaxRenderRgnPixels=">>, MaxRenderRgnPixels, <<"&">>, <<"MaxMessageSize=">>, MaxMessageSize, <<"&">>, <<"RandomAccessUrlTimeout=">>, RandomAccessUrlTimeout, <<"&">>, <<"WorkerThreads=">>, WorkerThreads, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet() ->
  openapi_utils:response().
com_adobe_cq_dam_s7imaging_impl_ps_platform_server_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.s7imaging.impl.ps.PlatformServerServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cache.enable=">>, CacheEnable, <<"&">>, <<"cache.rootPaths=">>, CacheRootPaths, <<"&">>, <<"cache.maxSize=">>, CacheMaxSize, <<"&">>, <<"cache.maxEntries=">>, CacheMaxEntries, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_webdav_impl_io_asset_io_handler() ->
  openapi_utils:response().
com_adobe_cq_dam_webdav_impl_io_asset_io_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.AssetIOHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"pathPrefix=">>, PathPrefix, <<"&">>, <<"createVersion=">>, CreateVersion, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job() ->
  openapi_utils:response().
com_adobe_cq_dam_webdav_impl_io_dam_webdav_version_linking_job() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.webdav.version.linking.enable=">>, CqDamWebdavVersionLinkingEnable, <<"&">>, <<"cq.dam.webdav.version.linking.scheduler.period=">>, CqDamWebdavVersionLinkingSchedulerPeriod, <<"&">>, <<"cq.dam.webdav.version.linking.staging.timeout=">>, CqDamWebdavVersionLinkingStagingTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dam_webdav_impl_io_special_files_handler() ->
  openapi_utils:response().
com_adobe_cq_dam_webdav_impl_io_special_files_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.SpecialFilesHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.day.cq.dam.core.impl.io.SpecialFilesHandler.filepatters=">>, ComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_deserfw_impl_deserialization_firewall_impl() ->
  openapi_utils:response().
com_adobe_cq_deserfw_impl_deserialization_firewall_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.deserfw.impl.DeserializationFirewallImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"firewall.deserialization.whitelist=">>, FirewallDeserializationWhitelist, <<"&">>, <<"firewall.deserialization.blacklist=">>, FirewallDeserializationBlacklist, <<"&">>, <<"firewall.deserialization.diagnostics=">>, FirewallDeserializationDiagnostics, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dtm_impl_service_dtm_web_service_impl() ->
  openapi_utils:response().
com_adobe_cq_dtm_impl_service_dtm_web_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dtm.impl.service.DTMWebServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"connection.timeout=">>, ConnectionTimeout, <<"&">>, <<"socket.timeout=">>, SocketTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet() ->
  openapi_utils:response().
com_adobe_cq_dtm_impl_servlets_dtm_deploy_hook_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dtm.impl.servlets.DTMDeployHookServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dtm.staging.ip.whitelist=">>, DtmStagingIpWhitelist, <<"&">>, <<"dtm.production.ip.whitelist=">>, DtmProductionIpWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_dtm_reactor_impl_service_web_service_impl() ->
  openapi_utils:response().
com_adobe_cq_dtm_reactor_impl_service_web_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.dtm.reactor.impl.service.WebServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"endpointUri=">>, EndpointUri, <<"&">>, <<"connectionTimeout=">>, ConnectionTimeout, <<"&">>, <<"socketTimeout=">>, SocketTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_experiencelog_impl_experience_log_config_servlet() ->
  openapi_utils:response().
com_adobe_cq_experiencelog_impl_experience_log_config_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.experiencelog.impl.ExperienceLogConfigServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"disabledForGroups=">>, DisabledForGroups, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_hc_content_packages_health_check() ->
  openapi_utils:response().
com_adobe_cq_hc_content_packages_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.hc.ContentPackagesHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>, <<"package.names=">>, PackageNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_history_impl_history_request_filter() ->
  openapi_utils:response().
com_adobe_cq_history_impl_history_request_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.history.impl.HistoryRequestFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"history.requestFilter.excludedSelectors=">>, HistoryRequestFilterExcludedSelectors, <<"&">>, <<"history.requestFilter.excludedExtensions=">>, HistoryRequestFilterExcludedExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_history_impl_history_service_impl() ->
  openapi_utils:response().
com_adobe_cq_history_impl_history_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.history.impl.HistoryServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"history.service.resourceTypes=">>, HistoryServiceResourceTypes, <<"&">>, <<"history.service.pathFilter=">>, HistoryServicePathFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_inbox_impl_typeprovider_item_type_provider() ->
  openapi_utils:response().
com_adobe_cq_inbox_impl_typeprovider_item_type_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.inbox.impl.typeprovider.ItemTypeProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"inbox.impl.typeprovider.registrypaths=">>, InboxImplTypeproviderRegistrypaths, <<"&">>, <<"inbox.impl.typeprovider.legacypaths=">>, InboxImplTypeproviderLegacypaths, <<"&">>, <<"inbox.impl.typeprovider.defaulturl.failureitem=">>, InboxImplTypeproviderDefaulturlFailureitem, <<"&">>, <<"inbox.impl.typeprovider.defaulturl.workitem=">>, InboxImplTypeproviderDefaulturlWorkitem, <<"&">>, <<"inbox.impl.typeprovider.defaulturl.task=">>, InboxImplTypeproviderDefaulturlTask, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_projects_impl_servlet_project_image_servlet() ->
  openapi_utils:response().
com_adobe_cq_projects_impl_servlet_project_image_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"image.quality=">>, ImageQuality, <<"&">>, <<"image.supported.resolutions=">>, ImageSupportedResolutions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_projects_purge_scheduler() ->
  openapi_utils:response().
com_adobe_cq_projects_purge_scheduler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduledpurge.name=">>, ScheduledpurgeName, <<"&">>, <<"scheduledpurge.purgeActive=">>, ScheduledpurgePurgeActive, <<"&">>, <<"scheduledpurge.templates=">>, ScheduledpurgeTemplates, <<"&">>, <<"scheduledpurge.purgeGroups=">>, ScheduledpurgePurgeGroups, <<"&">>, <<"scheduledpurge.purgeAssets=">>, ScheduledpurgePurgeAssets, <<"&">>, <<"scheduledpurge.terminateRunningWorkflows=">>, ScheduledpurgeTerminateRunningWorkflows, <<"&">>, <<"scheduledpurge.daysold=">>, ScheduledpurgeDaysold, <<"&">>, <<"scheduledpurge.saveThreshold=">>, ScheduledpurgeSaveThreshold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl() ->
  openapi_utils:response().
com_adobe_cq_scheduled_exporter_impl_scheduled_exporter_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.scheduled.exporter.impl.ScheduledExporterImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"include.paths=">>, IncludePaths, <<"&">>, <<"exporter.user=">>, ExporterUser, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl() ->
  openapi_utils:response().
com_adobe_cq_screens_analytics_impl_screens_analytics_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.analytics.impl.ScreensAnalyticsServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.cq.screens.analytics.impl.url=">>, ComAdobeCqScreensAnalyticsImplUrl, <<"&">>, <<"com.adobe.cq.screens.analytics.impl.apikey=">>, ComAdobeCqScreensAnalyticsImplApikey, <<"&">>, <<"com.adobe.cq.screens.analytics.impl.project=">>, ComAdobeCqScreensAnalyticsImplProject, <<"&">>, <<"com.adobe.cq.screens.analytics.impl.environment=">>, ComAdobeCqScreensAnalyticsImplEnvironment, <<"&">>, <<"com.adobe.cq.screens.analytics.impl.sendFrequency=">>, ComAdobeCqScreensAnalyticsImplSendFrequency, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_device_impl_device_service() ->
  openapi_utils:response().
com_adobe_cq_screens_device_impl_device_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.device.impl.DeviceService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.aem.screens.player.pingfrequency=">>, ComAdobeAemScreensPlayerPingfrequency, <<"&">>, <<"com.adobe.aem.screens.device.pasword.specialchars=">>, ComAdobeAemScreensDevicePaswordSpecialchars, <<"&">>, <<"com.adobe.aem.screens.device.pasword.minlowercasechars=">>, ComAdobeAemScreensDevicePaswordMinlowercasechars, <<"&">>, <<"com.adobe.aem.screens.device.pasword.minuppercasechars=">>, ComAdobeAemScreensDevicePaswordMinuppercasechars, <<"&">>, <<"com.adobe.aem.screens.device.pasword.minnumberchars=">>, ComAdobeAemScreensDevicePaswordMinnumberchars, <<"&">>, <<"com.adobe.aem.screens.device.pasword.minspecialchars=">>, ComAdobeAemScreensDevicePaswordMinspecialchars, <<"&">>, <<"com.adobe.aem.screens.device.pasword.minlength=">>, ComAdobeAemScreensDevicePaswordMinlength, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_device_registration_impl_registration_service_impl() ->
  openapi_utils:response().
com_adobe_cq_screens_device_registration_impl_registration_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.device.registration.impl.RegistrationServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"deviceRegistrationTimeout=">>, DeviceRegistrationTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_impl_handler_channels_update_handler() ->
  openapi_utils:response().
com_adobe_cq_screens_impl_handler_channels_update_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.impl.handler.ChannelsUpdateHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.pagesupdatehandler.imageresourcetypes=">>, CqPagesupdatehandlerImageresourcetypes, <<"&">>, <<"cq.pagesupdatehandler.productresourcetypes=">>, CqPagesupdatehandlerProductresourcetypes, <<"&">>, <<"cq.pagesupdatehandler.videoresourcetypes=">>, CqPagesupdatehandlerVideoresourcetypes, <<"&">>, <<"cq.pagesupdatehandler.dynamicsequenceresourcetypes=">>, CqPagesupdatehandlerDynamicsequenceresourcetypes, <<"&">>, <<"cq.pagesupdatehandler.previewmodepaths=">>, CqPagesupdatehandlerPreviewmodepaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job() ->
  openapi_utils:response().
com_adobe_cq_screens_impl_jobs_distributed_devices_stati_update_job() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.impl.jobs.DistributedDevicesStatiUpdateJob"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl() ->
  openapi_utils:response().
com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.impl.remote.impl.DistributedHttpClientImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.aem.screens.impl.remote.request_timeout=">>, ComAdobeAemScreensImplRemoteRequestTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_impl_screens_channel_post_processor() ->
  openapi_utils:response().
com_adobe_cq_screens_impl_screens_channel_post_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.impl.ScreensChannelPostProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"screens.channels.properties.to.remove=">>, ScreensChannelsPropertiesToRemove, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl() ->
  openapi_utils:response().
com_adobe_cq_screens_monitoring_impl_screens_monitoring_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername, <<"&">>, <<"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password=">>, ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider() ->
  openapi_utils:response().
com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.mq.activemq.impl.ArtemisJMSProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"global.size=">>, GlobalSize, <<"&">>, <<"max.disk.usage=">>, MaxDiskUsage, <<"&">>, <<"persistence.enabled=">>, PersistenceEnabled, <<"&">>, <<"thread.pool.max.size=">>, ThreadPoolMaxSize, <<"&">>, <<"scheduled.thread.pool.max.size=">>, ScheduledThreadPoolMaxSize, <<"&">>, <<"graceful.shutdown.timeout=">>, GracefulShutdownTimeout, <<"&">>, <<"queues=">>, Queues, <<"&">>, <<"topics=">>, Topics, <<"&">>, <<"addresses.max.delivery.attempts=">>, AddressesMaxDeliveryAttempts, <<"&">>, <<"addresses.expiry.delay=">>, AddressesExpiryDelay, <<"&">>, <<"addresses.address.full.message.policy=">>, AddressesAddressFullMessagePolicy, <<"&">>, <<"addresses.max.size.bytes=">>, AddressesMaxSizeBytes, <<"&">>, <<"addresses.page.size.bytes=">>, AddressesPageSizeBytes, <<"&">>, <<"addresses.page.cache.max.size=">>, AddressesPageCacheMaxSize, <<"&">>, <<"cluster.user=">>, ClusterUser, <<"&">>, <<"cluster.password=">>, ClusterPassword, <<"&">>, <<"cluster.call.timeout=">>, ClusterCallTimeout, <<"&">>, <<"cluster.call.failover.timeout=">>, ClusterCallFailoverTimeout, <<"&">>, <<"cluster.client.failure.check.period=">>, ClusterClientFailureCheckPeriod, <<"&">>, <<"cluster.notification.attempts=">>, ClusterNotificationAttempts, <<"&">>, <<"cluster.notification.interval=">>, ClusterNotificationInterval, <<"&">>, <<"id.cache.size=">>, IdCacheSize, <<"&">>, <<"cluster.confirmation.window.size=">>, ClusterConfirmationWindowSize, <<"&">>, <<"cluster.connection.ttl=">>, ClusterConnectionTtl, <<"&">>, <<"cluster.duplicate.detection=">>, ClusterDuplicateDetection, <<"&">>, <<"cluster.initial.connect.attempts=">>, ClusterInitialConnectAttempts, <<"&">>, <<"cluster.max.retry.interval=">>, ClusterMaxRetryInterval, <<"&">>, <<"cluster.min.large.message.size=">>, ClusterMinLargeMessageSize, <<"&">>, <<"cluster.producer.window.size=">>, ClusterProducerWindowSize, <<"&">>, <<"cluster.reconnect.attempts=">>, ClusterReconnectAttempts, <<"&">>, <<"cluster.retry.interval=">>, ClusterRetryInterval, <<"&">>, <<"cluster.retry.interval.multiplier=">>, ClusterRetryIntervalMultiplier, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl() ->
  openapi_utils:response().
com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath=">>, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplProjectPath, <<"&">>, <<"com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency=">>, ComAdobeCqScreensOfflinecontentImplBulkOfflineUpdateServiceImplScheduleFrequency, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl() ->
  openapi_utils:response().
com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.offlinecontent.impl.OfflineContentServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"disableSmartSync=">>, DisableSmartSync, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag() ->
  openapi_utils:response().
com_adobe_cq_screens_segmentation_impl_segmentation_feature_flag() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.screens.segmentation.impl.SegmentationFeatureFlag"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enableDataTriggeredContent=">>, EnableDataTriggeredContent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch() ->
  openapi_utils:response().
com_adobe_cq_security_hc_bundles_impl_html_library_manager_config_health_ch() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.HtmlLibraryManagerConfigHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check() ->
  openapi_utils:response().
com_adobe_cq_security_hc_bundles_impl_wcm_filter_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.security.hc.bundles.impl.WcmFilterHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check() ->
  openapi_utils:response().
com_adobe_cq_security_hc_dispatcher_impl_dispatcher_access_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.security.hc.dispatcher.impl.DispatcherAccessHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"dispatcher.address=">>, DispatcherAddress, <<"&">>, <<"dispatcher.filter.allowed=">>, DispatcherFilterAllowed, <<"&">>, <<"dispatcher.filter.blocked=">>, DispatcherFilterBlocked, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_security_hc_packages_impl_example_content_health_check() ->
  openapi_utils:response().
com_adobe_cq_security_hc_packages_impl_example_content_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.security.hc.packages.impl.ExampleContentHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check() ->
  openapi_utils:response().
com_adobe_cq_security_hc_webserver_impl_clickjacking_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.security.hc.webserver.impl.ClickjackingHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"webserver.address=">>, WebserverAddress, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_accountverification_impl_account_management_config_im() ->
  openapi_utils:response().
com_adobe_cq_social_accountverification_impl_account_management_config_im() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.accountverification.impl.AccountManagementConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enable=">>, Enable, <<"&">>, <<"ttl1=">>, Ttl1, <<"&">>, <<"ttl2=">>, Ttl2, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_activitystreams_client_impl_social_activity_componen() ->
  openapi_utils:response().
com_adobe_cq_social_activitystreams_client_impl_social_activity_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityComponentFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co() ->
  openapi_utils:response().
com_adobe_cq_social_activitystreams_client_impl_social_activity_stream_co() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.activitystreams.client.impl.SocialActivityStreamComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler() ->
  openapi_utils:response().
com_adobe_cq_social_activitystreams_listener_impl_event_listener_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.EventListenerHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten() ->
  openapi_utils:response().
com_adobe_cq_social_activitystreams_listener_impl_moderation_event_exten() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ModerationEventExtension"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"accepted=">>, Accepted, <<"&">>, <<"ranked=">>, Ranked, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s() ->
  openapi_utils:response().
com_adobe_cq_social_activitystreams_listener_impl_rating_event_activity_s() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.RatingEventActivitySuppressor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"ranking=">>, Ranking, <<"&">>, <<"enable=">>, Enable, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre() ->
  openapi_utils:response().
com_adobe_cq_social_activitystreams_listener_impl_resource_activity_stre() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.activitystreams.listener.impl.ResourceActivityStreamProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"streamPath=">>, StreamPath, <<"&">>, <<"streamName=">>, StreamName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i() ->
  openapi_utils:response().
com_adobe_cq_social_calendar_client_endpoints_impl_calendar_operations_i() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.calendar.client.endpoints.impl.CalendarOperationsImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"MaxRetry=">>, MaxRetry, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_calendar_client_operationextensions_event_attachmen() ->
  openapi_utils:response().
com_adobe_cq_social_calendar_client_operationextensions_event_attachmen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.calendar.client.operationextensions.EventAttachment"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>, <<"extension.order=">>, ExtensionOrder, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_calendar_servlets_time_zone_servlet() ->
  openapi_utils:response().
com_adobe_cq_social_calendar_servlets_time_zone_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.calendar.servlets.TimeZoneServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"timezones.expirytime=">>, TimezonesExpirytime, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event() ->
  openapi_utils:response().
com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentDeleteEventActivitySuppressor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"ranking=">>, Ranking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se() ->
  openapi_utils:response().
com_adobe_cq_social_commons_comments_endpoints_impl_comment_operation_se() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.CommentOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati() ->
  openapi_utils:response().
com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.comments.endpoints.impl.TranslationOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c() ->
  openapi_utils:response().
com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.comments.listing.impl.SearchCommentSocialComponentListProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"numUserLimit=">>, NumUserLimit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos() ->
  openapi_utils:response().
com_adobe_cq_social_commons_comments_scheduler_impl_search_scheduled_pos() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.comments.scheduler.impl.SearchScheduledPosts"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enableScheduledPostsSearch=">>, EnableScheduledPostsSearch, <<"&">>, <<"numberOfMinutes=">>, NumberOfMinutes, <<"&">>, <<"maxSearchLimit=">>, MaxSearchLimit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_cors_cors_authentication_filter() ->
  openapi_utils:response().
com_adobe_cq_social_commons_cors_cors_authentication_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.cors.CORSAuthenticationFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cors.enabling=">>, CorsEnabling, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_android_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.AndroidEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailBuilderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"context.path=">>, ContextPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CommentEmailEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.CustomEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailQuotedTextPatternsImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pattern.time=">>, PatternTime, <<"&">>, <<"pattern.newline=">>, PatternNewline, <<"&">>, <<"pattern.dayOfMonth=">>, PatternDayOfMonth, <<"&">>, <<"pattern.month=">>, PatternMonth, <<"&">>, <<"pattern.year=">>, PatternYear, <<"&">>, <<"pattern.date=">>, PatternDate, <<"&">>, <<"pattern.dateTime=">>, PatternDateTime, <<"&">>, <<"pattern.email=">>, PatternEmail, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_email_reply_configuration_imp() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"email.name=">>, EmailName, <<"&">>, <<"email.createPostFromReply=">>, EmailCreatePostFromReply, <<"&">>, <<"email.addCommentIdTo=">>, EmailAddCommentIdTo, <<"&">>, <<"email.subjectMaximumLength=">>, EmailSubjectMaximumLength, <<"&">>, <<"email.replyToAddress=">>, EmailReplyToAddress, <<"&">>, <<"email.replyToDelimiter=">>, EmailReplyToDelimiter, <<"&">>, <<"email.trackerIdPrefixInSubject=">>, EmailTrackerIdPrefixInSubject, <<"&">>, <<"email.trackerIdPrefixInBody=">>, EmailTrackerIdPrefixInBody, <<"&">>, <<"email.asHTML=">>, EmailAsHTML, <<"&">>, <<"email.defaultUserName=">>, EmailDefaultUserName, <<"&">>, <<"email.templates.rootPath=">>, EmailTemplatesRootPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_email_reply_importer() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_email_reply_importer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.EmailReplyImporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"connectProtocol=">>, ConnectProtocol, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_gmail_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.GmailEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.IOSEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_macmail_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.MacmailEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_out_look_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.OutLookEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.UnknownEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider() ->
  openapi_utils:response().
com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.emailreply.impl.YahooEmailClientProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priorityOrder=">>, PriorityOrder, <<"&">>, <<"replyEmailPatterns=">>, ReplyEmailPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload() ->
  openapi_utils:response().
com_adobe_cq_social_commons_maintainance_impl_delete_temp_ugc_image_upload() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.maintainance.impl.DeleteTempUGCImageUploads"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"numberOfDays=">>, NumberOfDays, <<"&">>, <<"ageOfFile=">>, AgeOfFile, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl() ->
  openapi_utils:response().
com_adobe_cq_social_commons_ugclimiter_impl_ugc_limiter_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.ugclimiter.impl.UGCLimiterServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"verbs=">>, Verbs, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit() ->
  openapi_utils:response().
com_adobe_cq_social_commons_ugclimitsconfig_impl_community_user_ugc_limit() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enable=">>, Enable, <<"&">>, <<"UGCLimit=">>, UGCLimit, <<"&">>, <<"ugcLimitDuration=">>, UgcLimitDuration, <<"&">>, <<"domains=">>, Domains, <<"&">>, <<"toList=">>, ToList, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl() ->
  openapi_utils:response().
com_adobe_cq_social_connect_oauth_impl_facebook_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.FacebookProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>, <<"oauth.cloud.config.root=">>, OauthCloudConfigRoot, <<"&">>, <<"provider.config.root=">>, ProviderConfigRoot, <<"&">>, <<"provider.config.create.tags.enabled=">>, ProviderConfigCreateTagsEnabled, <<"&">>, <<"provider.config.user.folder=">>, ProviderConfigUserFolder, <<"&">>, <<"provider.config.facebook.fetch.fields=">>, ProviderConfigFacebookFetchFields, <<"&">>, <<"provider.config.facebook.fields=">>, ProviderConfigFacebookFields, <<"&">>, <<"provider.config.refresh.userdata.enabled=">>, ProviderConfigRefreshUserdataEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle() ->
  openapi_utils:response().
com_adobe_cq_social_connect_oauth_impl_social_o_auth_authentication_handle() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper() ->
  openapi_utils:response().
com_adobe_cq_social_connect_oauth_impl_social_o_auth_user_profile_mapper() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.SocialOAuthUserProfileMapper"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"facebook=">>, Facebook, <<"&">>, <<"twitter=">>, Twitter, <<"&">>, <<"provider.config.user.folder=">>, ProviderConfigUserFolder, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl() ->
  openapi_utils:response().
com_adobe_cq_social_connect_oauth_impl_twitter_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.connect.oauth.impl.TwitterProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>, <<"oauth.cloud.config.root=">>, OauthCloudConfigRoot, <<"&">>, <<"provider.config.root=">>, ProviderConfigRoot, <<"&">>, <<"provider.config.user.folder=">>, ProviderConfigUserFolder, <<"&">>, <<"provider.config.twitter.enable.params=">>, ProviderConfigTwitterEnableParams, <<"&">>, <<"provider.config.twitter.params=">>, ProviderConfigTwitterParams, <<"&">>, <<"provider.config.refresh.userdata.enabled=">>, ProviderConfigRefreshUserdataEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_content_fragments_services_impl_communities_fragmen() ->
  openapi_utils:response().
com_adobe_cq_social_content_fragments_services_impl_communities_fragmen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.content.fragments.services.impl.CommunitiesFragmentCreationServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.social.content.fragments.services.enabled=">>, CqSocialContentFragmentsServicesEnabled, <<"&">>, <<"cq.social.content.fragments.services.waitTimeSeconds=">>, CqSocialContentFragmentsServicesWaitTimeSeconds, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory() ->
  openapi_utils:response().
com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.datastore.as.impl.ASResourceProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"version.id=">>, VersionId, <<"&">>, <<"cache.on=">>, CacheOn, <<"&">>, <<"concurrency.level=">>, ConcurrencyLevel, <<"&">>, <<"cache.start.size=">>, CacheStartSize, <<"&">>, <<"cache.ttl=">>, CacheTtl, <<"&">>, <<"cache.size=">>, CacheSize, <<"&">>, <<"time.limit=">>, TimeLimit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory() ->
  openapi_utils:response().
com_adobe_cq_social_datastore_op_impl_social_ms_resource_provider_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.datastore.op.impl.SocialMSResourceProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"solr.zk.timeout=">>, SolrZkTimeout, <<"&">>, <<"solr.commit=">>, SolrCommit, <<"&">>, <<"cache.on=">>, CacheOn, <<"&">>, <<"concurrency.level=">>, ConcurrencyLevel, <<"&">>, <<"cache.start.size=">>, CacheStartSize, <<"&">>, <<"cache.ttl=">>, CacheTtl, <<"&">>, <<"cache.size=">>, CacheSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor() ->
  openapi_utils:response().
com_adobe_cq_social_datastore_rdb_impl_social_rdb_resource_provider_factor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.datastore.rdb.impl.SocialRDBResourceProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"solr.zk.timeout=">>, SolrZkTimeout, <<"&">>, <<"solr.commit=">>, SolrCommit, <<"&">>, <<"cache.on=">>, CacheOn, <<"&">>, <<"concurrency.level=">>, ConcurrencyLevel, <<"&">>, <<"cache.start.size=">>, CacheStartSize, <<"&">>, <<"cache.ttl=">>, CacheTtl, <<"&">>, <<"cache.size=">>, CacheSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f() ->
  openapi_utils:response().
com_adobe_cq_social_enablement_adaptors_enablement_learning_path_adaptor_f() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementLearningPathAdaptorFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"isMemberCheck=">>, IsMemberCheck, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto() ->
  openapi_utils:response().
com_adobe_cq_social_enablement_adaptors_enablement_resource_adaptor_facto() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.enablement.adaptors.EnablementResourceAdaptorFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"isMemberCheck=">>, IsMemberCheck, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l() ->
  openapi_utils:response().
com_adobe_cq_social_enablement_learningpath_endpoints_impl_enablement_l() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.enablement.learningpath.endpoints.impl.EnablementLearningPathModelOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou() ->
  openapi_utils:response().
com_adobe_cq_social_enablement_resource_endpoints_impl_enablement_resou() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.enablement.resource.endpoints.impl.EnablementResourceModelOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_enablement_services_impl_author_marker_impl() ->
  openapi_utils:response().
com_adobe_cq_social_enablement_services_impl_author_marker_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.enablement.services.impl.AuthorMarkerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge() ->
  openapi_utils:response().
com_adobe_cq_social_filelibrary_client_endpoints_filelibrary_download_ge() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.FilelibraryDownloadGetServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"sling.servlet.extensions=">>, SlingServletExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera() ->
  openapi_utils:response().
com_adobe_cq_social_filelibrary_client_endpoints_impl_file_library_opera() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.filelibrary.client.endpoints.impl.FileLibraryOperationsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service() ->
  openapi_utils:response().
com_adobe_cq_social_forum_client_endpoints_impl_forum_operations_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.forum.client.endpoints.impl.ForumOperationsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_forum_dispatcher_impl_flush_operations() ->
  openapi_utils:response().
com_adobe_cq_social_forum_dispatcher_impl_flush_operations() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.forum.dispatcher.impl.FlushOperations"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"extension.order=">>, ExtensionOrder, <<"&">>, <<"flush.forumontopic=">>, FlushForumontopic, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_group_client_impl_community_group_collection_componen() ->
  openapi_utils:response().
com_adobe_cq_social_group_client_impl_community_group_collection_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.group.client.impl.CommunityGroupCollectionComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"group.listing.pagination.enable=">>, GroupListingPaginationEnable, <<"&">>, <<"group.listing.lazyloading.enable=">>, GroupListingLazyloadingEnable, <<"&">>, <<"page.size=">>, PageSize, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_group_impl_group_service_impl() ->
  openapi_utils:response().
com_adobe_cq_social_group_impl_group_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.group.impl.GroupServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"maxWaitTime=">>, MaxWaitTime, <<"&">>, <<"minWaitBetweenRetries=">>, MinWaitBetweenRetries, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_handlebars_guava_template_cache_impl() ->
  openapi_utils:response().
com_adobe_cq_social_handlebars_guava_template_cache_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.handlebars.GuavaTemplateCacheImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"parameter.guava.cache.enabled=">>, ParameterGuavaCacheEnabled, <<"&">>, <<"parameter.guava.cache.params=">>, ParameterGuavaCacheParams, <<"&">>, <<"parameter.guava.cache.reload=">>, ParameterGuavaCacheReload, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s() ->
  openapi_utils:response().
com_adobe_cq_social_ideation_client_endpoints_impl_ideation_operations_s() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ideation.client.endpoints.impl.IdeationOperationsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser() ->
  openapi_utils:response().
com_adobe_cq_social_journal_client_endpoints_impl_journal_operations_ser() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.journal.client.endpoints.impl.JournalOperationsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_members_endpoints_impl_community_member_group_profile() ->
  openapi_utils:response().
com_adobe_cq_social_members_endpoints_impl_community_member_group_profile() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberGroupProfileOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o() ->
  openapi_utils:response().
com_adobe_cq_social_members_endpoints_impl_community_member_user_profile_o() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.members.endpoints.impl.CommunityMemberUserProfileOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_members_impl_community_member_group_profile_component_f() ->
  openapi_utils:response().
com_adobe_cq_social_members_impl_community_member_group_profile_component_f() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.members.impl.CommunityMemberGroupProfileComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"everyoneLimit=">>, EveryoneLimit, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation() ->
  openapi_utils:response().
com_adobe_cq_social_messaging_client_endpoints_impl_messaging_operation() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.messaging.client.endpoints.impl.MessagingOperationsServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"message.properties=">>, MessageProperties, <<"&">>, <<"messageBoxSizeLimit=">>, MessageBoxSizeLimit, <<"&">>, <<"messageCountLimit=">>, MessageCountLimit, <<"&">>, <<"notifyFailure=">>, NotifyFailure, <<"&">>, <<"failureMessageFrom=">>, FailureMessageFrom, <<"&">>, <<"failureTemplatePath=">>, FailureTemplatePath, <<"&">>, <<"maxRetries=">>, MaxRetries, <<"&">>, <<"minWaitBetweenRetries=">>, MinWaitBetweenRetries, <<"&">>, <<"countUpdatePoolSize=">>, CountUpdatePoolSize, <<"&">>, <<"inbox.path=">>, InboxPath, <<"&">>, <<"sentitems.path=">>, SentitemsPath, <<"&">>, <<"supportAttachments=">>, SupportAttachments, <<"&">>, <<"supportGroupMessaging=">>, SupportGroupMessaging, <<"&">>, <<"maxTotalRecipients=">>, MaxTotalRecipients, <<"&">>, <<"batchSize=">>, BatchSize, <<"&">>, <<"maxTotalAttachmentSize=">>, MaxTotalAttachmentSize, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>, <<"allowedAttachmentTypes=">>, AllowedAttachmentTypes, <<"&">>, <<"serviceSelector=">>, ServiceSelector, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen() ->
  openapi_utils:response().
com_adobe_cq_social_moderation_dashboard_api_filter_group_social_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.FilterGroupSocialComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"resourceType.filters=">>, ResourceTypeFilters, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social() ->
  openapi_utils:response().
com_adobe_cq_social_moderation_dashboard_api_moderation_dashboard_social() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.ModerationDashboardSocialComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen() ->
  openapi_utils:response().
com_adobe_cq_social_moderation_dashboard_api_user_details_social_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.api.UserDetailsSocialComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci() ->
  openapi_utils:response().
com_adobe_cq_social_moderation_dashboard_internal_impl_filter_group_soci() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.moderation.dashboard.internal.impl.FilterGroupSocialComponentFactoryV2"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"resourceType.filters=">>, ResourceTypeFilters, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_notifications_impl_mentions_router() ->
  openapi_utils:response().
com_adobe_cq_social_notifications_impl_mentions_router() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.notifications.impl.MentionsRouter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_notifications_impl_notification_manager_impl() ->
  openapi_utils:response().
com_adobe_cq_social_notifications_impl_notification_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"max.unread.notification.count=">>, MaxUnreadNotificationCount, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_notifications_impl_notifications_router() ->
  openapi_utils:response().
com_adobe_cq_social_notifications_impl_notifications_router() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.notifications.impl.NotificationsRouter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic() ->
  openapi_utils:response().
com_adobe_cq_social_qna_client_endpoints_impl_qna_forum_operations_servic() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.qna.client.endpoints.impl.QnaForumOperationsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i() ->
  openapi_utils:response().
com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_i() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportImporterServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.social.reporting.analytics.polling.importer.interval=">>, CqSocialReportingAnalyticsPollingImporterInterval, <<"&">>, <<"cq.social.reporting.analytics.polling.importer.pageSize=">>, CqSocialReportingAnalyticsPollingImporterPageSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m() ->
  openapi_utils:response().
com_adobe_cq_social_reporting_analytics_services_impl_analytics_report_m() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.AnalyticsReportManagementServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"report.fetch.delay=">>, ReportFetchDelay, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s() ->
  openapi_utils:response().
com_adobe_cq_social_reporting_analytics_services_impl_site_trend_report_s() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.reporting.analytics.services.impl.SiteTrendReportSocialComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.social.console.analytics.sites.mapping=">>, CqSocialConsoleAnalyticsSitesMapping, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi() ->
  openapi_utils:response().
com_adobe_cq_social_review_client_endpoints_impl_review_operations_servi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.review.client.endpoints.impl.ReviewOperationsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"attachmentTypeBlacklist=">>, AttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet() ->
  openapi_utils:response().
com_adobe_cq_social_scf_core_operations_impl_social_operations_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.scf.core.operations.impl.SocialOperationsServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"sling.servlet.extensions=">>, SlingServletExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet() ->
  openapi_utils:response().
com_adobe_cq_social_scf_endpoints_impl_default_social_get_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.scf.endpoints.impl.DefaultSocialGetServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"sling.servlet.extensions=">>, SlingServletExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_scoring_impl_scoring_event_listener() ->
  openapi_utils:response().
com_adobe_cq_social_scoring_impl_scoring_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.scoring.impl.ScoringEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl() ->
  openapi_utils:response().
com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.serviceusers.internal.impl.ServiceUserWrapperImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enableFallback=">>, EnableFallback, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_site_endpoints_impl_site_operation_service() ->
  openapi_utils:response().
com_adobe_cq_social_site_endpoints_impl_site_operation_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.site.endpoints.impl.SiteOperationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fieldWhitelist=">>, FieldWhitelist, <<"&">>, <<"sitePathFilters=">>, SitePathFilters, <<"&">>, <<"sitePackageGroup=">>, SitePackageGroup, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_site_impl_analytics_component_configuration_service_im() ->
  openapi_utils:response().
com_adobe_cq_social_site_impl_analytics_component_configuration_service_im() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.site.impl.AnalyticsComponentConfigurationServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.social.console.analytics.components=">>, CqSocialConsoleAnalyticsComponents, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_site_impl_site_configurator_impl() ->
  openapi_utils:response().
com_adobe_cq_social_site_impl_site_configurator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.site.impl.SiteConfiguratorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"componentsUsingTags=">>, ComponentsUsingTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_srp_impl_social_solr_connector() ->
  openapi_utils:response().
com_adobe_cq_social_srp_impl_social_solr_connector() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.srp.impl.SocialSolrConnector"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"srp.type=">>, SrpType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_sync_impl_diff_changes_observer() ->
  openapi_utils:response().
com_adobe_cq_social_sync_impl_diff_changes_observer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.sync.impl.DiffChangesObserver"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"agentName=">>, AgentName, <<"&">>, <<"diffPath=">>, DiffPath, <<"&">>, <<"propertyNames=">>, PropertyNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_sync_impl_group_sync_listener_impl() ->
  openapi_utils:response().
com_adobe_cq_social_sync_impl_group_sync_listener_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.sync.impl.GroupSyncListenerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"nodetypes=">>, Nodetypes, <<"&">>, <<"ignorableprops=">>, Ignorableprops, <<"&">>, <<"ignorablenodes=">>, Ignorablenodes, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"distfolders=">>, Distfolders, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_sync_impl_publisher_sync_service_impl() ->
  openapi_utils:response().
com_adobe_cq_social_sync_impl_publisher_sync_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.sync.impl.PublisherSyncServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"activeRunModes=">>, ActiveRunModes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_sync_impl_user_sync_listener_impl() ->
  openapi_utils:response().
com_adobe_cq_social_sync_impl_user_sync_listener_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.sync.impl.UserSyncListenerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"nodetypes=">>, Nodetypes, <<"&">>, <<"ignorableprops=">>, Ignorableprops, <<"&">>, <<"ignorablenodes=">>, Ignorablenodes, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"distfolders=">>, Distfolders, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_translation_impl_translation_service_config_manager() ->
  openapi_utils:response().
com_adobe_cq_social_translation_impl_translation_service_config_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.translation.impl.TranslationServiceConfigManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"translate.language=">>, TranslateLanguage, <<"&">>, <<"translate.display=">>, TranslateDisplay, <<"&">>, <<"translate.attribution=">>, TranslateAttribution, <<"&">>, <<"translate.caching=">>, TranslateCaching, <<"&">>, <<"translate.smart.rendering=">>, TranslateSmartRendering, <<"&">>, <<"translate.caching.duration=">>, TranslateCachingDuration, <<"&">>, <<"translate.session.save.interval=">>, TranslateSessionSaveInterval, <<"&">>, <<"translate.session.save.batchLimit=">>, TranslateSessionSaveBatchLimit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_translation_impl_ugc_language_detector() ->
  openapi_utils:response().
com_adobe_cq_social_translation_impl_ugc_language_detector() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.translation.impl.UGCLanguageDetector"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"translate.listener.type=">>, TranslateListenerType, <<"&">>, <<"translate.property.list=">>, TranslatePropertyList, <<"&">>, <<"poolSize=">>, PoolSize, <<"&">>, <<"maxPoolSize=">>, MaxPoolSize, <<"&">>, <<"queueSize=">>, QueueSize, <<"&">>, <<"keepAliveTime=">>, KeepAliveTime, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_dispatcher_impl_flush_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.dispatcher.impl.FlushServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"threadPoolSize=">>, ThreadPoolSize, <<"&">>, <<"delayTime=">>, DelayTime, <<"&">>, <<"workerSleepTime=">>, WorkerSleepTime, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_impl_aysnc_reverse_replicator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.AysncReverseReplicatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"poolSize=">>, PoolSize, <<"&">>, <<"maxPoolSize=">>, MaxPoolSize, <<"&">>, <<"queueSize=">>, QueueSize, <<"&">>, <<"keepAliveTime=">>, KeepAliveTime, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_impl_publisher_configuration_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.PublisherConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"isPrimaryPublisher=">>, IsPrimaryPublisher, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_impl_social_utils_impl() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_impl_social_utils_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"legacyCloudUGCPathMapping=">>, LegacyCloudUGCPathMapping, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_moderation_impl_auto_moderation_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.AutoModerationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"automoderation.sequence=">>, AutomoderationSequence, <<"&">>, <<"automoderation.onfailurestop=">>, AutomoderationOnfailurestop, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.moderation.impl.SentimentProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"watchwords.positive=">>, WatchwordsPositive, <<"&">>, <<"watchwords.negative=">>, WatchwordsNegative, <<"&">>, <<"watchwords.path=">>, WatchwordsPath, <<"&">>, <<"sentiment.path=">>, SentimentPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_security_impl_default_attachment_type_blackli() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.DefaultAttachmentTypeBlacklistService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"default.attachment.type.blacklist=">>, DefaultAttachmentTypeBlacklist, <<"&">>, <<"baseline.attachment.type.blacklist=">>, BaselineAttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl() ->
  openapi_utils:response().
com_adobe_cq_social_ugcbase_security_impl_safer_sling_post_validator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.ugcbase.security.impl.SaferSlingPostValidatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"parameter.whitelist=">>, ParameterWhitelist, <<"&">>, <<"parameter.whitelist.prefixes=">>, ParameterWhitelistPrefixes, <<"&">>, <<"binary.parameter.whitelist=">>, BinaryParameterWhitelist, <<"&">>, <<"modifier.whitelist=">>, ModifierWhitelist, <<"&">>, <<"operation.whitelist=">>, OperationWhitelist, <<"&">>, <<"operation.whitelist.prefixes=">>, OperationWhitelistPrefixes, <<"&">>, <<"typehint.whitelist=">>, TypehintWhitelist, <<"&">>, <<"resourcetype.whitelist=">>, ResourcetypeWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet() ->
  openapi_utils:response().
com_adobe_cq_social_user_endpoints_impl_users_group_from_publish_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.user.endpoints.impl.UsersGroupFromPublishServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.extensions=">>, SlingServletExtensions, <<"&">>, <<"sling.servlet.paths=">>, SlingServletPaths, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_social_user_impl_transport_http_to_publisher() ->
  openapi_utils:response().
com_adobe_cq_social_user_impl_transport_http_to_publisher() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.social.user.impl.transport.HttpToPublisher"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enable=">>, Enable, <<"&">>, <<"agent.configuration=">>, AgentConfiguration, <<"&">>, <<"context.path=">>, ContextPath, <<"&">>, <<"disabled.cipher.suites=">>, DisabledCipherSuites, <<"&">>, <<"enabled.cipher.suites=">>, EnabledCipherSuites, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact() ->
  openapi_utils:response().
com_adobe_cq_ui_wcm_commons_internal_servlets_rte_rte_filter_servlet_fact() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.ui.wcm.commons.internal.servlets.rte.RTEFilterServletFactory.amended"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"resource.types=">>, ResourceTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup() ->
  openapi_utils:response().
com_adobe_cq_upgrades_cleanup_impl_upgrade_content_cleanup() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeContentCleanup"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"delete.path.regexps=">>, DeletePathRegexps, <<"&">>, <<"delete.sql2.query=">>, DeleteSql2Query, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup() ->
  openapi_utils:response().
com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.upgrades.cleanup.impl.UpgradeInstallFolderCleanup"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"delete.name.regexps=">>, DeleteNameRegexps, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service() ->
  openapi_utils:response().
com_adobe_cq_wcm_jobs_async_impl_async_delete_config_provider_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncDeleteConfigProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"threshold=">>, Threshold, <<"&">>, <<"jobTopicName=">>, JobTopicName, <<"&">>, <<"emailEnabled=">>, EmailEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task() ->
  openapi_utils:response().
com_adobe_cq_wcm_jobs_async_impl_async_job_clean_up_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncJobCleanUpTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"job.purge.threshold=">>, JobPurgeThreshold, <<"&">>, <<"job.purge.max.jobs=">>, JobPurgeMaxJobs, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service() ->
  openapi_utils:response().
com_adobe_cq_wcm_jobs_async_impl_async_move_config_provider_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncMoveConfigProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"threshold=">>, Threshold, <<"&">>, <<"jobTopicName=">>, JobTopicName, <<"&">>, <<"emailEnabled=">>, EmailEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service() ->
  openapi_utils:response().
com_adobe_cq_wcm_jobs_async_impl_async_page_move_config_provider_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.jobs.async.impl.AsyncPageMoveConfigProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"threshold=">>, Threshold, <<"&">>, <<"jobTopicName=">>, JobTopicName, <<"&">>, <<"emailEnabled=">>, EmailEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_launches_impl_launches_event_handler() ->
  openapi_utils:response().
com_adobe_cq_wcm_launches_impl_launches_event_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"launches.eventhandler.threadpool.maxsize=">>, LaunchesEventhandlerThreadpoolMaxsize, <<"&">>, <<"launches.eventhandler.threadpool.priority=">>, LaunchesEventhandlerThreadpoolPriority, <<"&">>, <<"launches.eventhandler.updatelastmodification=">>, LaunchesEventhandlerUpdatelastmodification, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator() ->
  openapi_utils:response().
com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.mobile.qrcode.servlet.QRCodeImageGenerator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.qrcode.servlet.whitelist=">>, CqWcmQrcodeServletWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_style_internal_component_style_info_cache_impl() ->
  openapi_utils:response().
com_adobe_cq_wcm_style_internal_component_style_info_cache_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.style.internal.ComponentStyleInfoCacheImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"size=">>, Size, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl() ->
  openapi_utils:response().
com_adobe_cq_wcm_translation_impl_translation_platform_configuration_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.cq.wcm.translation.impl.TranslationPlatformConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"syncTranslationState.schedulingFormat=">>, SyncTranslationStateSchedulingFormat, <<"&">>, <<"schedulingRepeatTranslation.schedulingFormat=">>, SchedulingRepeatTranslationSchedulingFormat, <<"&">>, <<"syncTranslationState.lockTimeoutInMinutes=">>, SyncTranslationStateLockTimeoutInMinutes, <<"&">>, <<"export.format=">>, ExportFormat, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service() ->
  openapi_utils:response().
com_adobe_fd_fp_config_forms_portal_draftsand_submission_config_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalDraftsandSubmissionConfigService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"portal.outboxes=">>, PortalOutboxes, <<"&">>, <<"draft.data.service=">>, DraftDataService, <<"&">>, <<"draft.metadata.service=">>, DraftMetadataService, <<"&">>, <<"submit.data.service=">>, SubmitDataService, <<"&">>, <<"submit.metadata.service=">>, SubmitMetadataService, <<"&">>, <<"pendingSign.data.service=">>, PendingSignDataService, <<"&">>, <<"pendingSign.metadata.service=">>, PendingSignMetadataService, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_fd_fp_config_forms_portal_scheduler_service() ->
  openapi_utils:response().
com_adobe_fd_fp_config_forms_portal_scheduler_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.fd.fp.config.FormsPortalSchedulerService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"formportal.interval=">>, FormportalInterval, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_forms_common_service_impl_default_data_provider() ->
  openapi_utils:response().
com_adobe_forms_common_service_impl_default_data_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.forms.common.service.impl.DefaultDataProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"alloweddataFileLocations=">>, AlloweddataFileLocations, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_forms_common_service_impl_forms_common_configuration_service_imp() ->
  openapi_utils:response().
com_adobe_forms_common_service_impl_forms_common_configuration_service_imp() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.forms.common.service.impl.FormsCommonConfigurationServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"tempStorageConfig=">>, TempStorageConfig, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_forms_common_servlet_temp_clean_up_task() ->
  openapi_utils:response().
com_adobe_forms_common_servlet_temp_clean_up_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.forms.common.servlet.TempCleanUpTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"Duration for Temporary Storage=">>, DurationForTemporaryStorage, <<"&">>, <<"Duration for Anonymous Storage=">>, DurationForAnonymousStorage, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_acp_platform_platform_servlet() ->
  openapi_utils:response().
com_adobe_granite_acp_platform_platform_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.acp.platform.PlatformServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"query.limit=">>, QueryLimit, <<"&">>, <<"file.type.extension.map=">>, FileTypeExtensionMap, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_activitystreams_impl_activity_manager_impl() ->
  openapi_utils:response().
com_adobe_granite_activitystreams_impl_activity_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.activitystreams.impl.ActivityManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"aggregate.relationships=">>, AggregateRelationships, <<"&">>, <<"aggregate.descend.virtual=">>, AggregateDescendVirtual, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_analyzer_base_system_status_servlet() ->
  openapi_utils:response().
com_adobe_granite_analyzer_base_system_status_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.analyzer.base.SystemStatusServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"disabled=">>, Disabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet() ->
  openapi_utils:response().
com_adobe_granite_analyzer_scripts_compile_all_scripts_compiler_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.analyzer.scripts.compile.AllScriptsCompilerServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"disabled=">>, Disabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_apicontroller_filter_resolver_hook_factory() ->
  openapi_utils:response().
com_adobe_granite_apicontroller_filter_resolver_hook_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.apicontroller.FilterResolverHookFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.cq.cdn.cdn-rewriter=">>, ComAdobeCqCdnCdnRewriter, <<"&">>, <<"com.adobe.cq.cloud-config.components=">>, ComAdobeCqCloudConfigComponents, <<"&">>, <<"com.adobe.cq.cloud-config.core=">>, ComAdobeCqCloudConfigCore, <<"&">>, <<"com.adobe.cq.cloud-config.ui=">>, ComAdobeCqCloudConfigUi, <<"&">>, <<"com.adobe.cq.com.adobe.cq.editor=">>, ComAdobeCqComAdobeCqEditor, <<"&">>, <<"com.adobe.cq.com.adobe.cq.projects.core=">>, ComAdobeCqComAdobeCqProjectsCore, <<"&">>, <<"com.adobe.cq.com.adobe.cq.projects.wcm.core=">>, ComAdobeCqComAdobeCqProjectsWcmCore, <<"&">>, <<"com.adobe.cq.com.adobe.cq.ui.commons=">>, ComAdobeCqComAdobeCqUiCommons, <<"&">>, <<"com.adobe.cq.com.adobe.cq.wcm.style=">>, ComAdobeCqComAdobeCqWcmStyle, <<"&">>, <<"com.adobe.cq.cq-activitymap-integration=">>, ComAdobeCqCqActivitymapIntegration, <<"&">>, <<"com.adobe.cq.cq-contexthub-commons=">>, ComAdobeCqCqContexthubCommons, <<"&">>, <<"com.adobe.cq.cq-dtm=">>, ComAdobeCqCqDtm, <<"&">>, <<"com.adobe.cq.cq-healthcheck=">>, ComAdobeCqCqHealthcheck, <<"&">>, <<"com.adobe.cq.cq-multisite-targeting=">>, ComAdobeCqCqMultisiteTargeting, <<"&">>, <<"com.adobe.cq.cq-pre-upgrade-cleanup=">>, ComAdobeCqCqPreUpgradeCleanup, <<"&">>, <<"com.adobe.cq.cq-product-info-provider=">>, ComAdobeCqCqProductInfoProvider, <<"&">>, <<"com.adobe.cq.cq-rest-sites=">>, ComAdobeCqCqRestSites, <<"&">>, <<"com.adobe.cq.cq-security-hc=">>, ComAdobeCqCqSecurityHc, <<"&">>, <<"com.adobe.cq.dam.cq-dam-svg-handler=">>, ComAdobeCqDamCqDamSvgHandler, <<"&">>, <<"com.adobe.cq.dam.cq-scene7-imaging=">>, ComAdobeCqDamCqScene7Imaging, <<"&">>, <<"com.adobe.cq.dtm-reactor.core=">>, ComAdobeCqDtmReactorCore, <<"&">>, <<"com.adobe.cq.dtm-reactor.ui=">>, ComAdobeCqDtmReactorUi, <<"&">>, <<"com.adobe.cq.exp-jspel-resolver=">>, ComAdobeCqExpJspelResolver, <<"&">>, <<"com.adobe.cq.inbox.cq-inbox=">>, ComAdobeCqInboxCqInbox, <<"&">>, <<"com.adobe.cq.json-schema-parser=">>, ComAdobeCqJsonSchemaParser, <<"&">>, <<"com.adobe.cq.media.cq-media-publishing-dps-fp-core=">>, ComAdobeCqMediaCqMediaPublishingDpsFpCore, <<"&">>, <<"com.adobe.cq.mobile.cq-mobile-caas=">>, ComAdobeCqMobileCqMobileCaas, <<"&">>, <<"com.adobe.cq.mobile.cq-mobile-index-builder=">>, ComAdobeCqMobileCqMobileIndexBuilder, <<"&">>, <<"com.adobe.cq.mobile.cq-mobile-phonegap-build=">>, ComAdobeCqMobileCqMobilePhonegapBuild, <<"&">>, <<"com.adobe.cq.myspell=">>, ComAdobeCqMyspell, <<"&">>, <<"com.adobe.cq.sample.we.retail.core=">>, ComAdobeCqSampleWeRetailCore, <<"&">>, <<"com.adobe.cq.screens.com.adobe.cq.screens.dcc=">>, ComAdobeCqScreensComAdobeCqScreensDcc, <<"&">>, <<"com.adobe.cq.screens.com.adobe.cq.screens.mq.core=">>, ComAdobeCqScreensComAdobeCqScreensMqCore, <<"&">>, <<"com.adobe.cq.social.cq-social-as-provider=">>, ComAdobeCqSocialCqSocialAsProvider, <<"&">>, <<"com.adobe.cq.social.cq-social-badging-basic-impl=">>, ComAdobeCqSocialCqSocialBadgingBasicImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-badging-impl=">>, ComAdobeCqSocialCqSocialBadgingImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-calendar-impl=">>, ComAdobeCqSocialCqSocialCalendarImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-content-fragments-impl=">>, ComAdobeCqSocialCqSocialContentFragmentsImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-enablement-impl=">>, ComAdobeCqSocialCqSocialEnablementImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-graph-impl=">>, ComAdobeCqSocialCqSocialGraphImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-ideation-impl=">>, ComAdobeCqSocialCqSocialIdeationImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-jcr-provider=">>, ComAdobeCqSocialCqSocialJcrProvider, <<"&">>, <<"com.adobe.cq.social.cq-social-members-impl=">>, ComAdobeCqSocialCqSocialMembersImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-ms-provider=">>, ComAdobeCqSocialCqSocialMsProvider, <<"&">>, <<"com.adobe.cq.social.cq-social-notifications-channels-web=">>, ComAdobeCqSocialCqSocialNotificationsChannelsWeb, <<"&">>, <<"com.adobe.cq.social.cq-social-notifications-impl=">>, ComAdobeCqSocialCqSocialNotificationsImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-rdb-provider=">>, ComAdobeCqSocialCqSocialRdbProvider, <<"&">>, <<"com.adobe.cq.social.cq-social-scf-impl=">>, ComAdobeCqSocialCqSocialScfImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-scoring-basic-impl=">>, ComAdobeCqSocialCqSocialScoringBasicImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-scoring-impl=">>, ComAdobeCqSocialCqSocialScoringImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-serviceusers-impl=">>, ComAdobeCqSocialCqSocialServiceusersImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-srp-impl=">>, ComAdobeCqSocialCqSocialSrpImpl, <<"&">>, <<"com.adobe.cq.social.cq-social-ugcbase-impl=">>, ComAdobeCqSocialCqSocialUgcbaseImpl, <<"&">>, <<"com.adobe.dam.cq-dam-cfm-impl=">>, ComAdobeDamCqDamCfmImpl, <<"&">>, <<"com.adobe.forms.foundation-forms-foundation-base=">>, ComAdobeFormsFoundationFormsFoundationBase, <<"&">>, <<"com.adobe.granite.apicontroller=">>, ComAdobeGraniteApicontroller, <<"&">>, <<"com.adobe.granite.asset.core=">>, ComAdobeGraniteAssetCore, <<"&">>, <<"com.adobe.granite.auth.sso=">>, ComAdobeGraniteAuthSso, <<"&">>, <<"com.adobe.granite.bundles.hc.impl=">>, ComAdobeGraniteBundlesHcImpl, <<"&">>, <<"com.adobe.granite.compat-router=">>, ComAdobeGraniteCompatRouter, <<"&">>, <<"com.adobe.granite.conf=">>, ComAdobeGraniteConf, <<"&">>, <<"com.adobe.granite.conf.ui.core=">>, ComAdobeGraniteConfUiCore, <<"&">>, <<"com.adobe.granite.cors=">>, ComAdobeGraniteCors, <<"&">>, <<"com.adobe.granite.crx-explorer=">>, ComAdobeGraniteCrxExplorer, <<"&">>, <<"com.adobe.granite.crxde-lite=">>, ComAdobeGraniteCrxdeLite, <<"&">>, <<"com.adobe.granite.crypto.config=">>, ComAdobeGraniteCryptoConfig, <<"&">>, <<"com.adobe.granite.crypto.extension=">>, ComAdobeGraniteCryptoExtension, <<"&">>, <<"com.adobe.granite.crypto.file=">>, ComAdobeGraniteCryptoFile, <<"&">>, <<"com.adobe.granite.crypto.jcr=">>, ComAdobeGraniteCryptoJcr, <<"&">>, <<"com.adobe.granite.csrf=">>, ComAdobeGraniteCsrf, <<"&">>, <<"com.adobe.granite.distribution.core=">>, ComAdobeGraniteDistributionCore, <<"&">>, <<"com.adobe.granite.dropwizard.metrics=">>, ComAdobeGraniteDropwizardMetrics, <<"&">>, <<"com.adobe.granite.frags.impl=">>, ComAdobeGraniteFragsImpl, <<"&">>, <<"com.adobe.granite.gibson=">>, ComAdobeGraniteGibson, <<"&">>, <<"com.adobe.granite.infocollector=">>, ComAdobeGraniteInfocollector, <<"&">>, <<"com.adobe.granite.installer.factory.packages=">>, ComAdobeGraniteInstallerFactoryPackages, <<"&">>, <<"com.adobe.granite.jetty.ssl=">>, ComAdobeGraniteJettySsl, <<"&">>, <<"com.adobe.granite.jobs.async=">>, ComAdobeGraniteJobsAsync, <<"&">>, <<"com.adobe.granite.maintenance.oak=">>, ComAdobeGraniteMaintenanceOak, <<"&">>, <<"com.adobe.granite.monitoring.core=">>, ComAdobeGraniteMonitoringCore, <<"&">>, <<"com.adobe.granite.queries=">>, ComAdobeGraniteQueries, <<"&">>, <<"com.adobe.granite.replication.hc.impl=">>, ComAdobeGraniteReplicationHcImpl, <<"&">>, <<"com.adobe.granite.repository.checker=">>, ComAdobeGraniteRepositoryChecker, <<"&">>, <<"com.adobe.granite.repository.hc.impl=">>, ComAdobeGraniteRepositoryHcImpl, <<"&">>, <<"com.adobe.granite.rest.assets=">>, ComAdobeGraniteRestAssets, <<"&">>, <<"com.adobe.granite.security.ui=">>, ComAdobeGraniteSecurityUi, <<"&">>, <<"com.adobe.granite.startup=">>, ComAdobeGraniteStartup, <<"&">>, <<"com.adobe.granite.tagsoup=">>, ComAdobeGraniteTagsoup, <<"&">>, <<"com.adobe.granite.taskmanagement.core=">>, ComAdobeGraniteTaskmanagementCore, <<"&">>, <<"com.adobe.granite.taskmanagement.workflow=">>, ComAdobeGraniteTaskmanagementWorkflow, <<"&">>, <<"com.adobe.granite.ui.clientlibs.compiler.less=">>, ComAdobeGraniteUiClientlibsCompilerLess, <<"&">>, <<"com.adobe.granite.ui.clientlibs.processor.gcc=">>, ComAdobeGraniteUiClientlibsProcessorGcc, <<"&">>, <<"com.adobe.granite.webconsole.plugins=">>, ComAdobeGraniteWebconsolePlugins, <<"&">>, <<"com.adobe.granite.workflow.console=">>, ComAdobeGraniteWorkflowConsole, <<"&">>, <<"com.adobe.xmp.worker.files.native.fragment.linux=">>, ComAdobeXmpWorkerFilesNativeFragmentLinux, <<"&">>, <<"com.adobe.xmp.worker.files.native.fragment.macosx=">>, ComAdobeXmpWorkerFilesNativeFragmentMacosx, <<"&">>, <<"com.adobe.xmp.worker.files.native.fragment.win=">>, ComAdobeXmpWorkerFilesNativeFragmentWin, <<"&">>, <<"com.day.commons.osgi.wrapper.simple-jndi=">>, ComDayCommonsOsgiWrapperSimpleJndi, <<"&">>, <<"com.day.cq.cq-authhandler=">>, ComDayCqCqAuthhandler, <<"&">>, <<"com.day.cq.cq-compat-configupdate=">>, ComDayCqCqCompatConfigupdate, <<"&">>, <<"com.day.cq.cq-licensebranding=">>, ComDayCqCqLicensebranding, <<"&">>, <<"com.day.cq.cq-notifcation-impl=">>, ComDayCqCqNotifcationImpl, <<"&">>, <<"com.day.cq.cq-replication-audit=">>, ComDayCqCqReplicationAudit, <<"&">>, <<"com.day.cq.cq-search-ext=">>, ComDayCqCqSearchExt, <<"&">>, <<"com.day.cq.dam.cq-dam-annotation-print=">>, ComDayCqDamCqDamAnnotationPrint, <<"&">>, <<"com.day.cq.dam.cq-dam-asset-usage=">>, ComDayCqDamCqDamAssetUsage, <<"&">>, <<"com.day.cq.dam.cq-dam-s7dam=">>, ComDayCqDamCqDamS7dam, <<"&">>, <<"com.day.cq.dam.cq-dam-similaritysearch=">>, ComDayCqDamCqDamSimilaritysearch, <<"&">>, <<"com.day.cq.dam.dam-webdav-support=">>, ComDayCqDamDamWebdavSupport, <<"&">>, <<"com.day.cq.pre-upgrade-tasks=">>, ComDayCqPreUpgradeTasks, <<"&">>, <<"com.day.cq.replication.extensions=">>, ComDayCqReplicationExtensions, <<"&">>, <<"com.day.cq.wcm.cq-msm-core=">>, ComDayCqWcmCqMsmCore, <<"&">>, <<"com.day.cq.wcm.cq-wcm-translation=">>, ComDayCqWcmCqWcmTranslation, <<"&">>, <<"day-commons-jrawio=">>, DayCommonsJrawio, <<"&">>, <<"org.apache.aries.jmx.whiteboard=">>, OrgApacheAriesJmxWhiteboard, <<"&">>, <<"org.apache.felix.http.sslfilter=">>, OrgApacheFelixHttpSslfilter, <<"&">>, <<"org.apache.felix.org.apache.felix.threaddump=">>, OrgApacheFelixOrgApacheFelixThreaddump, <<"&">>, <<"org.apache.felix.webconsole.plugins.ds=">>, OrgApacheFelixWebconsolePluginsDs, <<"&">>, <<"org.apache.felix.webconsole.plugins.event=">>, OrgApacheFelixWebconsolePluginsEvent, <<"&">>, <<"org.apache.felix.webconsole.plugins.memoryusage=">>, OrgApacheFelixWebconsolePluginsMemoryusage, <<"&">>, <<"org.apache.felix.webconsole.plugins.packageadmin=">>, OrgApacheFelixWebconsolePluginsPackageadmin, <<"&">>, <<"org.apache.jackrabbit.oak-auth-ldap=">>, OrgApacheJackrabbitOakAuthLdap, <<"&">>, <<"org.apache.jackrabbit.oak-segment-tar=">>, OrgApacheJackrabbitOakSegmentTar, <<"&">>, <<"org.apache.jackrabbit.oak-solr-osgi=">>, OrgApacheJackrabbitOakSolrOsgi, <<"&">>, <<"org.apache.sling.bundleresource.impl=">>, OrgApacheSlingBundleresourceImpl, <<"&">>, <<"org.apache.sling.commons.fsclassloader=">>, OrgApacheSlingCommonsFsclassloader, <<"&">>, <<"org.apache.sling.commons.log.webconsole=">>, OrgApacheSlingCommonsLogWebconsole, <<"&">>, <<"org.apache.sling.datasource=">>, OrgApacheSlingDatasource, <<"&">>, <<"org.apache.sling.discovery.base=">>, OrgApacheSlingDiscoveryBase, <<"&">>, <<"org.apache.sling.discovery.oak=">>, OrgApacheSlingDiscoveryOak, <<"&">>, <<"org.apache.sling.discovery.support=">>, OrgApacheSlingDiscoverySupport, <<"&">>, <<"org.apache.sling.distribution.api=">>, OrgApacheSlingDistributionApi, <<"&">>, <<"org.apache.sling.distribution.core=">>, OrgApacheSlingDistributionCore, <<"&">>, <<"org.apache.sling.extensions.webconsolesecurityprovider=">>, OrgApacheSlingExtensionsWebconsolesecurityprovider, <<"&">>, <<"org.apache.sling.hc.webconsole=">>, OrgApacheSlingHcWebconsole, <<"&">>, <<"org.apache.sling.installer.console=">>, OrgApacheSlingInstallerConsole, <<"&">>, <<"org.apache.sling.installer.provider.file=">>, OrgApacheSlingInstallerProviderFile, <<"&">>, <<"org.apache.sling.installer.provider.jcr=">>, OrgApacheSlingInstallerProviderJcr, <<"&">>, <<"org.apache.sling.jcr.davex=">>, OrgApacheSlingJcrDavex, <<"&">>, <<"org.apache.sling.jcr.resourcesecurity=">>, OrgApacheSlingJcrResourcesecurity, <<"&">>, <<"org.apache.sling.jmx.provider=">>, OrgApacheSlingJmxProvider, <<"&">>, <<"org.apache.sling.launchpad.installer=">>, OrgApacheSlingLaunchpadInstaller, <<"&">>, <<"org.apache.sling.models.impl=">>, OrgApacheSlingModelsImpl, <<"&">>, <<"org.apache.sling.repoinit.parser=">>, OrgApacheSlingRepoinitParser, <<"&">>, <<"org.apache.sling.resource.inventory=">>, OrgApacheSlingResourceInventory, <<"&">>, <<"org.apache.sling.resourceresolver=">>, OrgApacheSlingResourceresolver, <<"&">>, <<"org.apache.sling.scripting.javascript=">>, OrgApacheSlingScriptingJavascript, <<"&">>, <<"org.apache.sling.scripting.jst=">>, OrgApacheSlingScriptingJst, <<"&">>, <<"org.apache.sling.scripting.sightly.js.provider=">>, OrgApacheSlingScriptingSightlyJsProvider, <<"&">>, <<"org.apache.sling.scripting.sightly.models.provider=">>, OrgApacheSlingScriptingSightlyModelsProvider, <<"&">>, <<"org.apache.sling.security=">>, OrgApacheSlingSecurity, <<"&">>, <<"org.apache.sling.servlets.compat=">>, OrgApacheSlingServletsCompat, <<"&">>, <<"org.apache.sling.servlets.get=">>, OrgApacheSlingServletsGet, <<"&">>, <<"org.apache.sling.startupfilter.disabler=">>, OrgApacheSlingStartupfilterDisabler, <<"&">>, <<"org.apache.sling.tracer=">>, OrgApacheSlingTracer, <<"&">>, <<"we.retail.client.app.core=">>, WeRetailClientAppCore, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_cert_impl_client_cert_auth_handler() ->
  openapi_utils:response().
com_adobe_granite_auth_cert_impl_client_cert_auth_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.cert.impl.ClientCertAuthHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_ims() ->
  openapi_utils:response().
com_adobe_granite_auth_ims() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.ims"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"configid=">>, Configid, <<"&">>, <<"scope=">>, Scope, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension() ->
  openapi_utils:response().
com_adobe_granite_auth_ims_impl_external_user_id_mapping_provider_extension() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.ims.impl.ExternalUserIdMappingProviderExtension"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_ims_impl_ims_access_token_request_customizer_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSAccessTokenRequestCustomizerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"auth.ims.client.secret=">>, AuthImsClientSecret, <<"&">>, <<"customizer.type=">>, CustomizerType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_ims_impl_ims_config_provider_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_ims_impl_ims_config_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.ims.impl.ImsConfigProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.configmanager.ims.configid=">>, OauthConfigmanagerImsConfigid, <<"&">>, <<"ims.owningEntity=">>, ImsOwningEntity, <<"&">>, <<"aem.instanceId=">>, AemInstanceId, <<"&">>, <<"ims.serviceCode=">>, ImsServiceCode, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator() ->
  openapi_utils:response().
com_adobe_granite_auth_ims_impl_ims_instance_credentials_validator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSInstanceCredentialsValidator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_ims_impl_ims_provider_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_ims_impl_ims_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.ims.impl.IMSProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>, <<"oauth.provider.ims.authorization.url=">>, OauthProviderImsAuthorizationUrl, <<"&">>, <<"oauth.provider.ims.token.url=">>, OauthProviderImsTokenUrl, <<"&">>, <<"oauth.provider.ims.profile.url=">>, OauthProviderImsProfileUrl, <<"&">>, <<"oauth.provider.ims.extended.details.urls=">>, OauthProviderImsExtendedDetailsUrls, <<"&">>, <<"oauth.provider.ims.validate.token.url=">>, OauthProviderImsValidateTokenUrl, <<"&">>, <<"oauth.provider.ims.session.property=">>, OauthProviderImsSessionProperty, <<"&">>, <<"oauth.provider.ims.service.token.client.id=">>, OauthProviderImsServiceTokenClientId, <<"&">>, <<"oauth.provider.ims.service.token.client.secret=">>, OauthProviderImsServiceTokenClientSecret, <<"&">>, <<"oauth.provider.ims.service.token=">>, OauthProviderImsServiceToken, <<"&">>, <<"ims.org.ref=">>, ImsOrgRef, <<"&">>, <<"ims.group.mapping=">>, ImsGroupMapping, <<"&">>, <<"oauth.provider.ims.only.license.group=">>, OauthProviderImsOnlyLicenseGroup, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_accesstoken_provider() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_accesstoken_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.accesstoken.provider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"auth.token.provider.title=">>, AuthTokenProviderTitle, <<"&">>, <<"auth.token.provider.default.claims=">>, AuthTokenProviderDefaultClaims, <<"&">>, <<"auth.token.provider.endpoint=">>, AuthTokenProviderEndpoint, <<"&">>, <<"auth.access.token.request=">>, AuthAccessTokenRequest, <<"&">>, <<"auth.token.provider.keypair.alias=">>, AuthTokenProviderKeypairAlias, <<"&">>, <<"auth.token.provider.conn.timeout=">>, AuthTokenProviderConnTimeout, <<"&">>, <<"auth.token.provider.so.timeout=">>, AuthTokenProviderSoTimeout, <<"&">>, <<"auth.token.provider.client.id=">>, AuthTokenProviderClientId, <<"&">>, <<"auth.token.provider.scope=">>, AuthTokenProviderScope, <<"&">>, <<"auth.token.provider.reuse.access.token=">>, AuthTokenProviderReuseAccessToken, <<"&">>, <<"auth.token.provider.relaxed.ssl=">>, AuthTokenProviderRelaxedSsl, <<"&">>, <<"token.request.customizer.type=">>, TokenRequestCustomizerType, <<"&">>, <<"auth.token.validator.type=">>, AuthTokenValidatorType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_bearer_authentication_handler() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_bearer_authentication_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.BearerAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"oauth.clientIds.allowed=">>, OauthClientIdsAllowed, <<"&">>, <<"auth.bearer.sync.ims=">>, AuthBearerSyncIms, <<"&">>, <<"auth.tokenRequestParameter=">>, AuthTokenRequestParameter, <<"&">>, <<"oauth.bearer.configid=">>, OauthBearerConfigid, <<"&">>, <<"oauth.jwt.support=">>, OauthJwtSupport, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_default_token_validator_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_default_token_validator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.DefaultTokenValidatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"auth.token.validator.type=">>, AuthTokenValidatorType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_facebook_provider_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_facebook_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.FacebookProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_github_provider_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_github_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GithubProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>, <<"oauth.provider.github.authorization.url=">>, OauthProviderGithubAuthorizationUrl, <<"&">>, <<"oauth.provider.github.token.url=">>, OauthProviderGithubTokenUrl, <<"&">>, <<"oauth.provider.github.profile.url=">>, OauthProviderGithubProfileUrl, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_granite_provider() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_granite_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.GraniteProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>, <<"oauth.provider.granite.authorization.url=">>, OauthProviderGraniteAuthorizationUrl, <<"&">>, <<"oauth.provider.granite.token.url=">>, OauthProviderGraniteTokenUrl, <<"&">>, <<"oauth.provider.granite.profile.url=">>, OauthProviderGraniteProfileUrl, <<"&">>, <<"oauth.provider.granite.extended.details.urls=">>, OauthProviderGraniteExtendedDetailsUrls, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_helper_provider_config_manager() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_helper_provider_config_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.cookie.login.timeout=">>, OauthCookieLoginTimeout, <<"&">>, <<"oauth.cookie.max.age=">>, OauthCookieMaxAge, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_helper_provider_config_manager_internal() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.helper.ProviderConfigManagerInternal"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.cookie.login.timeout=">>, OauthCookieLoginTimeout, <<"&">>, <<"oauth.cookie.max.age=">>, OauthCookieMaxAge, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_o_auth_authentication_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.OAuthAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_impl_twitter_provider_impl() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_impl_twitter_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.impl.TwitterProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.provider.id=">>, OauthProviderId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_oauth_provider() ->
  openapi_utils:response().
com_adobe_granite_auth_oauth_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.oauth.provider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.config.id=">>, OauthConfigId, <<"&">>, <<"oauth.client.id=">>, OauthClientId, <<"&">>, <<"oauth.client.secret=">>, OauthClientSecret, <<"&">>, <<"oauth.scope=">>, OauthScope, <<"&">>, <<"oauth.config.provider.id=">>, OauthConfigProviderId, <<"&">>, <<"oauth.create.users=">>, OauthCreateUsers, <<"&">>, <<"oauth.userid.property=">>, OauthUseridProperty, <<"&">>, <<"force.strict.username.matching=">>, ForceStrictUsernameMatching, <<"&">>, <<"oauth.encode.userids=">>, OauthEncodeUserids, <<"&">>, <<"oauth.hash.userids=">>, OauthHashUserids, <<"&">>, <<"oauth.callBackUrl=">>, OauthCallBackUrl, <<"&">>, <<"oauth.access.token.persist=">>, OauthAccessTokenPersist, <<"&">>, <<"oauth.access.token.persist.cookie=">>, OauthAccessTokenPersistCookie, <<"&">>, <<"oauth.csrf.state.protection=">>, OauthCsrfStateProtection, <<"&">>, <<"oauth.redirect.request.params=">>, OauthRedirectRequestParams, <<"&">>, <<"oauth.config.siblings.allow=">>, OauthConfigSiblingsAllow, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_requirement_impl_default_requirement_handler() ->
  openapi_utils:response().
com_adobe_granite_auth_requirement_impl_default_requirement_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.requirement.impl.DefaultRequirementHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"supportedPaths=">>, SupportedPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_saml_saml_authentication_handler() ->
  openapi_utils:response().
com_adobe_granite_auth_saml_saml_authentication_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.saml.SamlAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"idpUrl=">>, IdpUrl, <<"&">>, <<"idpCertAlias=">>, IdpCertAlias, <<"&">>, <<"idpHttpRedirect=">>, IdpHttpRedirect, <<"&">>, <<"serviceProviderEntityId=">>, ServiceProviderEntityId, <<"&">>, <<"assertionConsumerServiceURL=">>, AssertionConsumerServiceURL, <<"&">>, <<"spPrivateKeyAlias=">>, SpPrivateKeyAlias, <<"&">>, <<"keyStorePassword=">>, KeyStorePassword, <<"&">>, <<"defaultRedirectUrl=">>, DefaultRedirectUrl, <<"&">>, <<"userIDAttribute=">>, UserIDAttribute, <<"&">>, <<"useEncryption=">>, UseEncryption, <<"&">>, <<"createUser=">>, CreateUser, <<"&">>, <<"userIntermediatePath=">>, UserIntermediatePath, <<"&">>, <<"addGroupMemberships=">>, AddGroupMemberships, <<"&">>, <<"groupMembershipAttribute=">>, GroupMembershipAttribute, <<"&">>, <<"defaultGroups=">>, DefaultGroups, <<"&">>, <<"nameIdFormat=">>, NameIdFormat, <<"&">>, <<"synchronizeAttributes=">>, SynchronizeAttributes, <<"&">>, <<"handleLogout=">>, HandleLogout, <<"&">>, <<"logoutUrl=">>, LogoutUrl, <<"&">>, <<"clockTolerance=">>, ClockTolerance, <<"&">>, <<"digestMethod=">>, DigestMethod, <<"&">>, <<"signatureMethod=">>, SignatureMethod, <<"&">>, <<"identitySyncType=">>, IdentitySyncType, <<"&">>, <<"idpIdentifier=">>, IdpIdentifier, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_auth_sso_impl_sso_authentication_handler() ->
  openapi_utils:response().
com_adobe_granite_auth_sso_impl_sso_authentication_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.auth.sso.impl.SsoAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"jaas.controlFlag=">>, JaasControlFlag, <<"&">>, <<"jaas.realmName=">>, JaasRealmName, <<"&">>, <<"jaas.ranking=">>, JaasRanking, <<"&">>, <<"headers=">>, Headers, <<"&">>, <<"cookies=">>, Cookies, <<"&">>, <<"parameters=">>, Parameters, <<"&">>, <<"usermap=">>, Usermap, <<"&">>, <<"format=">>, Format, <<"&">>, <<"trustedCredentialsAttribute=">>, TrustedCredentialsAttribute, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_code_cache_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_code_cache_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CodeCacheHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"minimum.code.cache.size=">>, MinimumCodeCacheSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_crxde_support_bundle_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.CrxdeSupportBundleHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_dav_ex_bundle_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.DavExBundleHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_inactive_bundles_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.InactiveBundlesHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"ignored.bundles=">>, IgnoredBundles, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_jobs_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_jobs_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.JobsHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"max.queued.jobs=">>, MaxQueuedJobs, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_sling_get_servlet_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingGetServletHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_sling_java_script_handler_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJavaScriptHandlerHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_sling_jsp_script_handler_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingJspScriptHandlerHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_sling_referrer_filter_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.SlingReferrerFilterHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check() ->
  openapi_utils:response().
com_adobe_granite_bundles_hc_impl_web_dav_bundle_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.bundles.hc.impl.WebDavBundleHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_comments_internal_comment_replication_content_filter_fac() ->
  openapi_utils:response().
com_adobe_granite_comments_internal_comment_replication_content_filter_fac() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.comments.internal.CommentReplicationContentFilterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"replicate.comment.resourceTypes=">>, ReplicateCommentResourceTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_compatrouter_impl_compat_switching_service_impl() ->
  openapi_utils:response().
com_adobe_granite_compatrouter_impl_compat_switching_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.compatrouter.impl.CompatSwitchingServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"compatgroups=">>, Compatgroups, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_compatrouter_impl_routing_config() ->
  openapi_utils:response().
com_adobe_granite_compatrouter_impl_routing_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.compatrouter.impl.RoutingConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"id=">>, Id, <<"&">>, <<"compatPath=">>, CompatPath, <<"&">>, <<"newPath=">>, NewPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_compatrouter_impl_switch_mapping_config() ->
  openapi_utils:response().
com_adobe_granite_compatrouter_impl_switch_mapping_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.compatrouter.impl.SwitchMappingConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"group=">>, Group, <<"&">>, <<"ids=">>, Ids, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving() ->
  openapi_utils:response().
com_adobe_granite_conf_impl_runtime_aware_configuration_resource_resolving() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.conf.impl.RuntimeAwareConfigurationResourceResolvingStrategy"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"fallbackPaths=">>, FallbackPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_contexthub_impl_context_hub_impl() ->
  openapi_utils:response().
com_adobe_granite_contexthub_impl_context_hub_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.contexthub.impl.ContextHubImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.granite.contexthub.silent_mode=">>, ComAdobeGraniteContexthubSilentMode, <<"&">>, <<"com.adobe.granite.contexthub.show_ui=">>, ComAdobeGraniteContexthubShowUi, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_cors_impl_cors_policy_impl() ->
  openapi_utils:response().
com_adobe_granite_cors_impl_cors_policy_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.cors.impl.CORSPolicyImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"alloworigin=">>, Alloworigin, <<"&">>, <<"alloworiginregexp=">>, Alloworiginregexp, <<"&">>, <<"allowedpaths=">>, Allowedpaths, <<"&">>, <<"exposedheaders=">>, Exposedheaders, <<"&">>, <<"maxage=">>, Maxage, <<"&">>, <<"supportedheaders=">>, Supportedheaders, <<"&">>, <<"supportedmethods=">>, Supportedmethods, <<"&">>, <<"supportscredentials=">>, Supportscredentials, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_csrf_impl_csrf_filter() ->
  openapi_utils:response().
com_adobe_granite_csrf_impl_csrf_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"filter.methods=">>, FilterMethods, <<"&">>, <<"filter.enable.safe.user.agents=">>, FilterEnableSafeUserAgents, <<"&">>, <<"filter.safe.user.agents=">>, FilterSafeUserAgents, <<"&">>, <<"filter.excluded.paths=">>, FilterExcludedPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_csrf_impl_csrf_servlet() ->
  openapi_utils:response().
com_adobe_granite_csrf_impl_csrf_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.csrf.impl.CSRFServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"csrf.token.expires.in=">>, CsrfTokenExpiresIn, <<"&">>, <<"sling.auth.requirements=">>, SlingAuthRequirements, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_crypto_distribution_transport_se() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.CryptoDistributionTransportSecretProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"username=">>, Username, <<"&">>, <<"encryptedPassword=">>, EncryptedPassword, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_diff_diff_changes_observer() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_diff_diff_changes_observer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffChangesObserver"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"agentName=">>, AgentName, <<"&">>, <<"diffPath=">>, DiffPath, <<"&">>, <<"observedPath=">>, ObservedPath, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"propertyNames=">>, PropertyNames, <<"&">>, <<"distributionDelay=">>, DistributionDelay, <<"&">>, <<"serviceUser.target=">>, ServiceUserTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_diff_diff_event_listener() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_diff_diff_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.diff.DiffEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"diffPath=">>, DiffPath, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"serviceUser.target=">>, ServiceUserTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_distribution_to_replication_even() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_distribution_to_replication_even() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.DistributionToReplicationEventTransformer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"importer.name=">>, ImporterName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_replication_adapters_replicat() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_replication_adapters_replicat() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.adapters.ReplicationAgentProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"providerName=">>, ProviderName, <<"&">>, <<"forward.requests=">>, ForwardRequests, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_replication_distribution_trans() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_replication_distribution_trans() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.replication.DistributionTransportHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"forward.requests=">>, ForwardRequests, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_distribution_core_impl_transport_access_token_distribu() ->
  openapi_utils:response().
com_adobe_granite_distribution_core_impl_transport_access_token_distribu() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.distribution.core.impl.transport.AccessTokenDistributionTransportSecretProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"userId=">>, UserId, <<"&">>, <<"accessTokenProvider.target=">>, AccessTokenProviderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_frags_impl_check_http_header_flag() ->
  openapi_utils:response().
com_adobe_granite_frags_impl_check_http_header_flag() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.frags.impl.CheckHttpHeaderFlag"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"feature.name=">>, FeatureName, <<"&">>, <<"feature.description=">>, FeatureDescription, <<"&">>, <<"http.header.name=">>, HttpHeaderName, <<"&">>, <<"http.header.valuepattern=">>, HttpHeaderValuepattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_frags_impl_random_feature() ->
  openapi_utils:response().
com_adobe_granite_frags_impl_random_feature() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.frags.impl.RandomFeature"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"feature.name=">>, FeatureName, <<"&">>, <<"feature.description=">>, FeatureDescription, <<"&">>, <<"active.percentage=">>, ActivePercentage, <<"&">>, <<"cookie.name=">>, CookieName, <<"&">>, <<"cookie.maxAge=">>, CookieMaxAge, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_httpcache_file_file_cache_store() ->
  openapi_utils:response().
com_adobe_granite_httpcache_file_file_cache_store() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.httpcache.file.FileCacheStore"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.granite.httpcache.file.documentRoot=">>, ComAdobeGraniteHttpcacheFileDocumentRoot, <<"&">>, <<"com.adobe.granite.httpcache.file.includeHost=">>, ComAdobeGraniteHttpcacheFileIncludeHost, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_httpcache_impl_outer_cache_filter() ->
  openapi_utils:response().
com_adobe_granite_httpcache_impl_outer_cache_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.httpcache.impl.OuterCacheFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.granite.httpcache.url.paths=">>, ComAdobeGraniteHttpcacheUrlPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_i18n_impl_bundle_pseudo_translations() ->
  openapi_utils:response().
com_adobe_granite_i18n_impl_bundle_pseudo_translations() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.i18n.impl.bundle.PseudoTranslations"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pseudo.patterns=">>, PseudoPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_i18n_impl_preferences_locale_resolver_service() ->
  openapi_utils:response().
com_adobe_granite_i18n_impl_preferences_locale_resolver_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.i18n.impl.PreferencesLocaleResolverService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"security.preferences.name=">>, SecurityPreferencesName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_infocollector_info_collector() ->
  openapi_utils:response().
com_adobe_granite_infocollector_info_collector() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.infocollector.InfoCollector"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"granite.infocollector.includeThreadDumps=">>, GraniteInfocollectorIncludeThreadDumps, <<"&">>, <<"granite.infocollector.includeHeapDump=">>, GraniteInfocollectorIncludeHeapDump, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory() ->
  openapi_utils:response().
com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.jetty.ssl.internal.GraniteSslConnectorFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.adobe.granite.jetty.ssl.port=">>, ComAdobeGraniteJettySslPort, <<"&">>, <<"com.adobe.granite.jetty.ssl.keystore.user=">>, ComAdobeGraniteJettySslKeystoreUser, <<"&">>, <<"com.adobe.granite.jetty.ssl.keystore.password=">>, ComAdobeGraniteJettySslKeystorePassword, <<"&">>, <<"com.adobe.granite.jetty.ssl.ciphersuites.excluded=">>, ComAdobeGraniteJettySslCiphersuitesExcluded, <<"&">>, <<"com.adobe.granite.jetty.ssl.ciphersuites.included=">>, ComAdobeGraniteJettySslCiphersuitesIncluded, <<"&">>, <<"com.adobe.granite.jetty.ssl.client.certificate=">>, ComAdobeGraniteJettySslClientCertificate, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_license_impl_license_check_filter() ->
  openapi_utils:response().
com_adobe_granite_license_impl_license_check_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.license.impl.LicenseCheckFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"checkInternval=">>, CheckInternval, <<"&">>, <<"excludeIds=">>, ExcludeIds, <<"&">>, <<"encryptPing=">>, EncryptPing, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_logging_impl_log_analyser_impl() ->
  openapi_utils:response().
com_adobe_granite_logging_impl_log_analyser_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.logging.impl.LogAnalyserImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"messages.queue.size=">>, MessagesQueueSize, <<"&">>, <<"logger.config=">>, LoggerConfig, <<"&">>, <<"messages.size=">>, MessagesSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_logging_impl_log_error_health_check() ->
  openapi_utils:response().
com_adobe_granite_logging_impl_log_error_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.logging.impl.LogErrorHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task() ->
  openapi_utils:response().
com_adobe_granite_maintenance_crx_impl_data_store_garbage_collection_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.DataStoreGarbageCollectionTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"granite.maintenance.mandatory=">>, GraniteMaintenanceMandatory, <<"&">>, <<"job.topics=">>, JobTopics, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task() ->
  openapi_utils:response().
com_adobe_granite_maintenance_crx_impl_lucene_binaries_cleanup_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.LuceneBinariesCleanupTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"job.topics=">>, JobTopics, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_maintenance_crx_impl_revision_cleanup_task() ->
  openapi_utils:response().
com_adobe_granite_maintenance_crx_impl_revision_cleanup_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.maintenance.crx.impl.RevisionCleanupTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"full.gc.days=">>, FullGcDays, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_monitoring_impl_script_config_impl() ->
  openapi_utils:response().
com_adobe_granite_monitoring_impl_script_config_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.monitoring.impl.ScriptConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"script.filename=">>, ScriptFilename, <<"&">>, <<"script.display=">>, ScriptDisplay, <<"&">>, <<"script.path=">>, ScriptPath, <<"&">>, <<"script.platform=">>, ScriptPlatform, <<"&">>, <<"interval=">>, Interval, <<"&">>, <<"jmxdomain=">>, Jmxdomain, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han() ->
  openapi_utils:response().
com_adobe_granite_oauth_server_auth_impl_o_auth2_server_authentication_han() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.oauth.server.auth.impl.OAuth2ServerAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"jaas.controlFlag=">>, JaasControlFlag, <<"&">>, <<"jaas.realmName=">>, JaasRealmName, <<"&">>, <<"jaas.ranking=">>, JaasRanking, <<"&">>, <<"oauth.offline.validation=">>, OauthOfflineValidation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_oauth_server_impl_access_token_cleanup_task() ->
  openapi_utils:response().
com_adobe_granite_oauth_server_impl_access_token_cleanup_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.oauth.server.impl.AccessTokenCleanupTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet() ->
  openapi_utils:response().
com_adobe_granite_oauth_server_impl_o_auth2_client_revocation_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2ClientRevocationServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.client.revocation.active=">>, OauthClientRevocationActive, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet() ->
  openapi_utils:response().
com_adobe_granite_oauth_server_impl_o_auth2_revocation_endpoint_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2RevocationEndpointServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.paths=">>, SlingServletPaths, <<"&">>, <<"oauth.revocation.active=">>, OauthRevocationActive, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet() ->
  openapi_utils:response().
com_adobe_granite_oauth_server_impl_o_auth2_token_endpoint_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenEndpointServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.issuer=">>, OauthIssuer, <<"&">>, <<"oauth.access.token.expires.in=">>, OauthAccessTokenExpiresIn, <<"&">>, <<"osgi.http.whiteboard.servlet.pattern=">>, OsgiHttpWhiteboardServletPattern, <<"&">>, <<"osgi.http.whiteboard.context.select=">>, OsgiHttpWhiteboardContextSelect, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet() ->
  openapi_utils:response().
com_adobe_granite_oauth_server_impl_o_auth2_token_revocation_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.oauth.server.impl.OAuth2TokenRevocationServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"oauth.token.revocation.active=">>, OauthTokenRevocationActive, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_offloading_impl_offloading_configurator() ->
  openapi_utils:response().
com_adobe_granite_offloading_impl_offloading_configurator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingConfigurator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"offloading.transporter=">>, OffloadingTransporter, <<"&">>, <<"offloading.cleanup.payload=">>, OffloadingCleanupPayload, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_offloading_impl_offloading_job_cloner() ->
  openapi_utils:response().
com_adobe_granite_offloading_impl_offloading_job_cloner() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobCloner"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"offloading.jobcloner.enabled=">>, OffloadingJobclonerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_offloading_impl_offloading_job_offloader() ->
  openapi_utils:response().
com_adobe_granite_offloading_impl_offloading_job_offloader() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.offloading.impl.OffloadingJobOffloader"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"offloading.offloader.enabled=">>, OffloadingOffloaderEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_offloading_impl_transporter_offloading_agent_manager() ->
  openapi_utils:response().
com_adobe_granite_offloading_impl_transporter_offloading_agent_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingAgentManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"offloading.agentmanager.enabled=">>, OffloadingAgentmanagerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_offloading_impl_transporter_offloading_default_transpo() ->
  openapi_utils:response().
com_adobe_granite_offloading_impl_transporter_offloading_default_transpo() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"default.transport.agent-to-worker.prefix=">>, DefaultTransportAgentToWorkerPrefix, <<"&">>, <<"default.transport.agent-to-master.prefix=">>, DefaultTransportAgentToMasterPrefix, <<"&">>, <<"default.transport.input.package=">>, DefaultTransportInputPackage, <<"&">>, <<"default.transport.output.package=">>, DefaultTransportOutputPackage, <<"&">>, <<"default.transport.replication.synchronous=">>, DefaultTransportReplicationSynchronous, <<"&">>, <<"default.transport.contentpackage=">>, DefaultTransportContentpackage, <<"&">>, <<"offloading.transporter.default.enabled=">>, OffloadingTransporterDefaultEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_omnisearch_impl_core_omni_search_service_impl() ->
  openapi_utils:response().
com_adobe_granite_omnisearch_impl_core_omni_search_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.omnisearch.impl.core.OmniSearchServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"omnisearch.suggestion.requiretext.min=">>, OmnisearchSuggestionRequiretextMin, <<"&">>, <<"omnisearch.suggestion.spellcheck.require=">>, OmnisearchSuggestionSpellcheckRequire, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_optout_impl_opt_out_service_impl() ->
  openapi_utils:response().
com_adobe_granite_optout_impl_opt_out_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.optout.impl.OptOutServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"optout.cookies=">>, OptoutCookies, <<"&">>, <<"optout.headers=">>, OptoutHeaders, <<"&">>, <<"optout.whitelist.cookies=">>, OptoutWhitelistCookies, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_queries_impl_hc_async_index_health_check() ->
  openapi_utils:response().
com_adobe_granite_queries_impl_hc_async_index_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.queries.impl.hc.AsyncIndexHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"indexing.critical.threshold=">>, IndexingCriticalThreshold, <<"&">>, <<"indexing.warn.threshold=">>, IndexingWarnThreshold, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_queries_impl_hc_large_index_health_check() ->
  openapi_utils:response().
com_adobe_granite_queries_impl_hc_large_index_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.queries.impl.hc.LargeIndexHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"large.index.critical.threshold=">>, LargeIndexCriticalThreshold, <<"&">>, <<"large.index.warn.threshold=">>, LargeIndexWarnThreshold, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_queries_impl_hc_queries_status_health_check() ->
  openapi_utils:response().
com_adobe_granite_queries_impl_hc_queries_status_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueriesStatusHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_queries_impl_hc_query_health_check_metrics() ->
  openapi_utils:response().
com_adobe_granite_queries_impl_hc_query_health_check_metrics() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryHealthCheckMetrics"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"getPeriod=">>, GetPeriod, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_queries_impl_hc_query_limits_health_check() ->
  openapi_utils:response().
com_adobe_granite_queries_impl_hc_query_limits_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.queries.impl.hc.QueryLimitsHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_replication_hc_impl_replication_queue_health_check() ->
  openapi_utils:response().
com_adobe_granite_replication_hc_impl_replication_queue_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationQueueHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"number.of.retries.allowed=">>, NumberOfRetriesAllowed, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_replication_hc_impl_replication_transport_users_health_c() ->
  openapi_utils:response().
com_adobe_granite_replication_hc_impl_replication_transport_users_health_c() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.replication.hc.impl.ReplicationTransportUsersHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_authorizable_node_name_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.AuthorizableNodeNameHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_content_sling_sling_content_health_c() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.content.sling.SlingContentHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"exclude.search.path=">>, ExcludeSearchPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_continuous_rgc_health_check() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_continuous_rgc_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.ContinuousRGCHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_default_access_user_profile_health_che() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultAccessUserProfileHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_default_logins_health_check() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_default_logins_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.DefaultLoginsHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"account.logins=">>, AccountLogins, <<"&">>, <<"console.logins=">>, ConsoleLogins, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_disk_space_health_check() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_disk_space_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.DiskSpaceHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"disk.space.warn.threshold=">>, DiskSpaceWarnThreshold, <<"&">>, <<"disk.space.error.threshold=">>, DiskSpaceErrorThreshold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_hc_impl_observation_queue_length_health_check() ->
  openapi_utils:response().
com_adobe_granite_repository_hc_impl_observation_queue_length_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.hc.impl.ObservationQueueLengthHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_impl_commit_stats_config() ->
  openapi_utils:response().
com_adobe_granite_repository_impl_commit_stats_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.impl.CommitStatsConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"intervalSeconds=">>, IntervalSeconds, <<"&">>, <<"commitsPerIntervalThreshold=">>, CommitsPerIntervalThreshold, <<"&">>, <<"maxLocationLength=">>, MaxLocationLength, <<"&">>, <<"maxDetailsShown=">>, MaxDetailsShown, <<"&">>, <<"minDetailsPercentage=">>, MinDetailsPercentage, <<"&">>, <<"threadMatchers=">>, ThreadMatchers, <<"&">>, <<"maxGreedyDepth=">>, MaxGreedyDepth, <<"&">>, <<"greedyStackMatchers=">>, GreedyStackMatchers, <<"&">>, <<"stackFilters=">>, StackFilters, <<"&">>, <<"stackMatchers=">>, StackMatchers, <<"&">>, <<"stackCategorizers=">>, StackCategorizers, <<"&">>, <<"stackShorteners=">>, StackShorteners, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_repository_service_user_configuration() ->
  openapi_utils:response().
com_adobe_granite_repository_service_user_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.repository.ServiceUserConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"serviceusers.simpleSubjectPopulation=">>, ServiceusersSimpleSubjectPopulation, <<"&">>, <<"serviceusers.list=">>, ServiceusersList, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im() ->
  openapi_utils:response().
com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.requests.logging.impl.hc.RequestsStatusHealthCheckImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_resourcestatus_impl_composite_status_type() ->
  openapi_utils:response().
com_adobe_granite_resourcestatus_impl_composite_status_type() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.resourcestatus.impl.CompositeStatusType"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"types=">>, Types, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_resourcestatus_impl_status_resource_provider_impl() ->
  openapi_utils:response().
com_adobe_granite_resourcestatus_impl_status_resource_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.resourcestatus.impl.StatusResourceProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"provider.root=">>, ProviderRoot, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_rest_assets_impl_asset_content_disposition_filter() ->
  openapi_utils:response().
com_adobe_granite_rest_assets_impl_asset_content_disposition_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.rest.assets.impl.AssetContentDispositionFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mime.allowEmpty=">>, MimeAllowEmpty, <<"&">>, <<"mime.allowed=">>, MimeAllowed, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl() ->
  openapi_utils:response().
com_adobe_granite_rest_impl_api_endpoint_resource_provider_factory_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.rest.impl.ApiEndpointResourceProviderFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"provider.roots=">>, ProviderRoots, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_rest_impl_servlet_default_get_servlet() ->
  openapi_utils:response().
com_adobe_granite_rest_impl_servlet_default_get_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.rest.impl.servlet.DefaultGETServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"default.limit=">>, DefaultLimit, <<"&">>, <<"use.absolute.uri=">>, UseAbsoluteUri, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s() ->
  openapi_utils:response().
com_adobe_granite_security_user_ui_internal_servlets_ssl_configuration_s() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.security.user.ui.internal.servlets.SSLConfigurationServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_security_user_user_properties_service() ->
  openapi_utils:response().
com_adobe_granite_security_user_user_properties_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.security.user.UserPropertiesService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"adapter.condition=">>, AdapterCondition, <<"&">>, <<"granite.userproperties.nodetypes=">>, GraniteUserpropertiesNodetypes, <<"&">>, <<"granite.userproperties.resourcetypes=">>, GraniteUserpropertiesResourcetypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_socialgraph_impl_social_graph_factory_impl() ->
  openapi_utils:response().
com_adobe_granite_socialgraph_impl_social_graph_factory_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.socialgraph.impl.SocialGraphFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"group2member.relationship.outgoing=">>, Group2memberRelationshipOutgoing, <<"&">>, <<"group2member.excluded.outgoing=">>, Group2memberExcludedOutgoing, <<"&">>, <<"group2member.relationship.incoming=">>, Group2memberRelationshipIncoming, <<"&">>, <<"group2member.excluded.incoming=">>, Group2memberExcludedIncoming, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl() ->
  openapi_utils:response().
com_adobe_granite_system_monitoring_impl_system_stats_m_bean_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.system.monitoring.impl.SystemStatsMBeanImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"jmx.objectname=">>, JmxObjectname, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory() ->
  openapi_utils:response().
com_adobe_granite_taskmanagement_impl_jcr_task_adapter_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskAdapterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"adapter.condition=">>, AdapterCondition, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_taskmanagement_impl_jcr_task_archive_service() ->
  openapi_utils:response().
com_adobe_granite_taskmanagement_impl_jcr_task_archive_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.taskmanagement.impl.jcr.TaskArchiveService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"archiving.enabled=">>, ArchivingEnabled, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"archive.since.days.completed=">>, ArchiveSinceDaysCompleted, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task() ->
  openapi_utils:response().
com_adobe_granite_taskmanagement_impl_purge_task_purge_maintenance_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.taskmanagement.impl.purge.TaskPurgeMaintenanceTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"purgeCompleted=">>, PurgeCompleted, <<"&">>, <<"completedAge=">>, CompletedAge, <<"&">>, <<"purgeActive=">>, PurgeActive, <<"&">>, <<"activeAge=">>, ActiveAge, <<"&">>, <<"saveThreshold=">>, SaveThreshold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor() ->
  openapi_utils:response().
com_adobe_granite_taskmanagement_impl_service_task_manager_adapter_factor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.taskmanagement.impl.service.TaskManagerAdapterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"adapter.condition=">>, AdapterCondition, <<"&">>, <<"taskmanager.admingroups=">>, TaskmanagerAdmingroups, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_threaddump_thread_dump_collector() ->
  openapi_utils:response().
com_adobe_granite_threaddump_thread_dump_collector() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.threaddump.ThreadDumpCollector"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.period=">>, SchedulerPeriod, <<"&">>, <<"scheduler.runOn=">>, SchedulerRunOn, <<"&">>, <<"granite.threaddump.enabled=">>, GraniteThreaddumpEnabled, <<"&">>, <<"granite.threaddump.dumpsPerFile=">>, GraniteThreaddumpDumpsPerFile, <<"&">>, <<"granite.threaddump.enableGzipCompression=">>, GraniteThreaddumpEnableGzipCompression, <<"&">>, <<"granite.threaddump.enableDirectoriesCompression=">>, GraniteThreaddumpEnableDirectoriesCompression, <<"&">>, <<"granite.threaddump.enableJStack=">>, GraniteThreaddumpEnableJStack, <<"&">>, <<"granite.threaddump.maxBackupDays=">>, GraniteThreaddumpMaxBackupDays, <<"&">>, <<"granite.threaddump.backupCleanTrigger=">>, GraniteThreaddumpBackupCleanTrigger, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl() ->
  openapi_utils:response().
com_adobe_granite_translation_connector_msft_core_impl_microsoft_transl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.translation.connector.msft.core.impl.MicrosoftTranslationServiceFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"translationFactory=">>, TranslationFactory, <<"&">>, <<"defaultConnectorLabel=">>, DefaultConnectorLabel, <<"&">>, <<"defaultConnectorAttribution=">>, DefaultConnectorAttribution, <<"&">>, <<"defaultConnectorWorkspaceId=">>, DefaultConnectorWorkspaceId, <<"&">>, <<"defaultConnectorSubscriptionKey=">>, DefaultConnectorSubscriptionKey, <<"&">>, <<"languageMapLocation=">>, LanguageMapLocation, <<"&">>, <<"categoryMapLocation=">>, CategoryMapLocation, <<"&">>, <<"retryAttempts=">>, RetryAttempts, <<"&">>, <<"timeoutCount=">>, TimeoutCount, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_translation_core_impl_translation_manager_impl() ->
  openapi_utils:response().
com_adobe_granite_translation_core_impl_translation_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.translation.core.impl.TranslationManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"defaultConnectorName=">>, DefaultConnectorName, <<"&">>, <<"defaultCategory=">>, DefaultCategory, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl() ->
  openapi_utils:response().
com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.ui.clientlibs.impl.HtmlLibraryManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"htmllibmanager.timing=">>, HtmllibmanagerTiming, <<"&">>, <<"htmllibmanager.debug.init.js=">>, HtmllibmanagerDebugInitJs, <<"&">>, <<"htmllibmanager.minify=">>, HtmllibmanagerMinify, <<"&">>, <<"htmllibmanager.debug=">>, HtmllibmanagerDebug, <<"&">>, <<"htmllibmanager.gzip=">>, HtmllibmanagerGzip, <<"&">>, <<"htmllibmanager.maxDataUriSize=">>, HtmllibmanagerMaxDataUriSize, <<"&">>, <<"htmllibmanager.maxage=">>, HtmllibmanagerMaxage, <<"&">>, <<"htmllibmanager.forceCQUrlInfo=">>, HtmllibmanagerForceCQUrlInfo, <<"&">>, <<"htmllibmanager.defaultthemename=">>, HtmllibmanagerDefaultthemename, <<"&">>, <<"htmllibmanager.defaultuserthemename=">>, HtmllibmanagerDefaultuserthemename, <<"&">>, <<"htmllibmanager.clientmanager=">>, HtmllibmanagerClientmanager, <<"&">>, <<"htmllibmanager.path.list=">>, HtmllibmanagerPathList, <<"&">>, <<"htmllibmanager.excluded.path.list=">>, HtmllibmanagerExcludedPathList, <<"&">>, <<"htmllibmanager.processor.js=">>, HtmllibmanagerProcessorJs, <<"&">>, <<"htmllibmanager.processor.css=">>, HtmllibmanagerProcessorCss, <<"&">>, <<"htmllibmanager.longcache.patterns=">>, HtmllibmanagerLongcachePatterns, <<"&">>, <<"htmllibmanager.longcache.format=">>, HtmllibmanagerLongcacheFormat, <<"&">>, <<"htmllibmanager.useFileSystemOutputCache=">>, HtmllibmanagerUseFileSystemOutputCache, <<"&">>, <<"htmllibmanager.fileSystemOutputCacheLocation=">>, HtmllibmanagerFileSystemOutputCacheLocation, <<"&">>, <<"htmllibmanager.disable.replacement=">>, HtmllibmanagerDisableReplacement, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_console_frags_workflow_withdraw_feature() ->
  openapi_utils:response().
com_adobe_granite_workflow_console_frags_workflow_withdraw_feature() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.console.frags.WorkflowWithdrawFeature"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_console_publish_workflow_publish_event_service() ->
  openapi_utils:response().
com_adobe_granite_workflow_console_publish_workflow_publish_event_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.console.publish.WorkflowPublishEventService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"granite.workflow.WorkflowPublishEventService.enabled=">>, GraniteWorkflowWorkflowPublishEventServiceEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_jcr_workflow_bucket_manager() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_jcr_workflow_bucket_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.jcr.WorkflowBucketManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"bucketSize=">>, BucketSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_job_external_process_job_handler() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_job_external_process_job_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.job.ExternalProcessJobHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"default.timeout=">>, DefaultTimeout, <<"&">>, <<"max.timeout=">>, MaxTimeout, <<"&">>, <<"default.period=">>, DefaultPeriod, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_job_job_handler() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_job_job_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.job.JobHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"job.topics=">>, JobTopics, <<"&">>, <<"allow.self.process.termination=">>, AllowSelfProcessTermination, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_offloading_workflow_offloading_job_consum() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.offloading.WorkflowOffloadingJobConsumer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"job.topics=">>, JobTopics, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_payload_map_cache() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_payload_map_cache() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.PayloadMapCache"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"getSystemWorkflowModels=">>, GetSystemWorkflowModels, <<"&">>, <<"getPackageRootPath=">>, GetPackageRootPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_payloadmap_payload_move_listener() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_payloadmap_payload_move_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.payloadmap.PayloadMoveListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"payload.move.white.list=">>, PayloadMoveWhiteList, <<"&">>, <<"payload.move.handle.from.workflow.process=">>, PayloadMoveHandleFromWorkflowProcess, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_workflow_config() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_workflow_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.workflow.config.workflow.packages.root.path=">>, CqWorkflowConfigWorkflowPackagesRootPath, <<"&">>, <<"cq.workflow.config.workflow.process.legacy.mode=">>, CqWorkflowConfigWorkflowProcessLegacyMode, <<"&">>, <<"cq.workflow.config.allow.locking=">>, CqWorkflowConfigAllowLocking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_core_workflow_session_factory() ->
  openapi_utils:response().
com_adobe_granite_workflow_core_workflow_session_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.core.WorkflowSessionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"granite.workflowinbox.sort.propertyName=">>, GraniteWorkflowinboxSortPropertyName, <<"&">>, <<"granite.workflowinbox.sort.order=">>, GraniteWorkflowinboxSortOrder, <<"&">>, <<"cq.workflow.job.retry=">>, CqWorkflowJobRetry, <<"&">>, <<"cq.workflow.superuser=">>, CqWorkflowSuperuser, <<"&">>, <<"granite.workflow.inboxQuerySize=">>, GraniteWorkflowInboxQuerySize, <<"&">>, <<"granite.workflow.adminUserGroupFilter=">>, GraniteWorkflowAdminUserGroupFilter, <<"&">>, <<"granite.workflow.enforceWorkitemAssigneePermissions=">>, GraniteWorkflowEnforceWorkitemAssigneePermissions, <<"&">>, <<"granite.workflow.enforceWorkflowInitiatorPermissions=">>, GraniteWorkflowEnforceWorkflowInitiatorPermissions, <<"&">>, <<"granite.workflow.injectTenantIdInJobTopics=">>, GraniteWorkflowInjectTenantIdInJobTopics, <<"&">>, <<"granite.workflow.maxPurgeSaveThreshold=">>, GraniteWorkflowMaxPurgeSaveThreshold, <<"&">>, <<"granite.workflow.maxPurgeQueryCount=">>, GraniteWorkflowMaxPurgeQueryCount, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_granite_workflow_purge_scheduler() ->
  openapi_utils:response().
com_adobe_granite_workflow_purge_scheduler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.granite.workflow.purge.Scheduler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduledpurge.name=">>, ScheduledpurgeName, <<"&">>, <<"scheduledpurge.workflowStatus=">>, ScheduledpurgeWorkflowStatus, <<"&">>, <<"scheduledpurge.modelIds=">>, ScheduledpurgeModelIds, <<"&">>, <<"scheduledpurge.daysold=">>, ScheduledpurgeDaysold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_octopus_ncomm_bootstrap() ->
  openapi_utils:response().
com_adobe_octopus_ncomm_bootstrap() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.octopus.ncomm.bootstrap"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"maxConnections=">>, MaxConnections, <<"&">>, <<"maxRequests=">>, MaxRequests, <<"&">>, <<"requestTimeout=">>, RequestTimeout, <<"&">>, <<"requestRetries=">>, RequestRetries, <<"&">>, <<"launchTimeout=">>, LaunchTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s() ->
  openapi_utils:response().
com_adobe_social_integrations_livefyre_user_pingforpull_impl_ping_pull_s() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.social.integrations.livefyre.user.pingforpull.impl.PingPullServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"communities.integration.livefyre.sling.event.filter=">>, CommunitiesIntegrationLivefyreSlingEventFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm() ->
  openapi_utils:response().
com_adobe_xmp_worker_files_ncomm_xmp_files_n_comm() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.adobe.xmp.worker.files.ncomm.XMPFilesNComm"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"maxConnections=">>, MaxConnections, <<"&">>, <<"maxRequests=">>, MaxRequests, <<"&">>, <<"requestTimeout=">>, RequestTimeout, <<"&">>, <<"logDir=">>, LogDir, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_commons_datasource_jdbcpool_jdbc_pool_service() ->
  openapi_utils:response().
com_day_commons_datasource_jdbcpool_jdbc_pool_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.commons.datasource.jdbcpool.JdbcPoolService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jdbc.driver.class=">>, JdbcDriverClass, <<"&">>, <<"jdbc.connection.uri=">>, JdbcConnectionUri, <<"&">>, <<"jdbc.username=">>, JdbcUsername, <<"&">>, <<"jdbc.password=">>, JdbcPassword, <<"&">>, <<"jdbc.validation.query=">>, JdbcValidationQuery, <<"&">>, <<"default.readonly=">>, DefaultReadonly, <<"&">>, <<"default.autocommit=">>, DefaultAutocommit, <<"&">>, <<"pool.size=">>, PoolSize, <<"&">>, <<"pool.max.wait.msec=">>, PoolMaxWaitMsec, <<"&">>, <<"datasource.name=">>, DatasourceName, <<"&">>, <<"datasource.svc.properties=">>, DatasourceSvcProperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_commons_httpclient() ->
  openapi_utils:response().
com_day_commons_httpclient() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.commons.httpclient"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"proxy.enabled=">>, ProxyEnabled, <<"&">>, <<"proxy.host=">>, ProxyHost, <<"&">>, <<"proxy.user=">>, ProxyUser, <<"&">>, <<"proxy.password=">>, ProxyPassword, <<"&">>, <<"proxy.ntlm.host=">>, ProxyNtlmHost, <<"&">>, <<"proxy.ntlm.domain=">>, ProxyNtlmDomain, <<"&">>, <<"proxy.exceptions=">>, ProxyExceptions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_impl_store_properties_change_listener() ->
  openapi_utils:response().
com_day_cq_analytics_impl_store_properties_change_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.impl.StorePropertiesChangeListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.store.listener.additionalStorePaths=">>, CqStoreListenerAdditionalStorePaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte() ->
  openapi_utils:response().
com_day_cq_analytics_sitecatalyst_impl_exporter_classifications_exporte() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.exporter.ClassificationsExporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"allowed.paths=">>, AllowedPaths, <<"&">>, <<"cq.analytics.saint.exporter.pagesize=">>, CqAnalyticsSaintExporterPagesize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_sitecatalyst_impl_importer_report_importer() ->
  openapi_utils:response().
com_day_cq_analytics_sitecatalyst_impl_importer_report_importer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.importer.ReportImporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"report.fetch.attempts=">>, ReportFetchAttempts, <<"&">>, <<"report.fetch.delay=">>, ReportFetchDelay, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory() ->
  openapi_utils:response().
com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_adapter_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystAdapterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.adapterfactory.contextstores=">>, CqAnalyticsAdapterfactoryContextstores, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl() ->
  openapi_utils:response().
com_day_cq_analytics_sitecatalyst_impl_sitecatalyst_http_client_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.sitecatalyst.impl.SitecatalystHttpClientImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.sitecatalyst.service.datacenter.url=">>, CqAnalyticsSitecatalystServiceDatacenterUrl, <<"&">>, <<"devhostnamepatterns=">>, Devhostnamepatterns, <<"&">>, <<"connection.timeout=">>, ConnectionTimeout, <<"&">>, <<"socket.timeout=">>, SocketTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_account_options_updater() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_account_options_updater() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.AccountOptionsUpdater"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.testandtarget.accountoptionsupdater.enabled=">>, CqAnalyticsTestandtargetAccountoptionsupdaterEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_delete_author_activity_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.DeleteAuthorActivityListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.testandtarget.deleteauthoractivitylistener.enabled=">>, CqAnalyticsTestandtargetDeleteauthoractivitylistenerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_push_author_campaign_page_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.PushAuthorCampaignPageListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.testandtarget.pushauthorcampaignpagelistener.enabled=">>, CqAnalyticsTestandtargetPushauthorcampaignpagelistenerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_segment_importer() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_segment_importer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.SegmentImporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.testandtarget.segmentimporter.enabled=">>, CqAnalyticsTestandtargetSegmentimporterEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_service_web_service_impl() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_service_web_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.service.WebServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"endpointUri=">>, EndpointUri, <<"&">>, <<"connectionTimeout=">>, ConnectionTimeout, <<"&">>, <<"socketTimeout=">>, SocketTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_servlets_admin_server_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.servlets.AdminServerServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"testandtarget.endpoint.url=">>, TestandtargetEndpointUrl, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl() ->
  openapi_utils:response().
com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.analytics.testandtarget.impl.TestandtargetHttpClientImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.analytics.testandtarget.api.url=">>, CqAnalyticsTestandtargetApiUrl, <<"&">>, <<"cq.analytics.testandtarget.timeout=">>, CqAnalyticsTestandtargetTimeout, <<"&">>, <<"cq.analytics.testandtarget.sockettimeout=">>, CqAnalyticsTestandtargetSockettimeout, <<"&">>, <<"cq.analytics.testandtarget.recommendations.url.replace=">>, CqAnalyticsTestandtargetRecommendationsUrlReplace, <<"&">>, <<"cq.analytics.testandtarget.recommendations.url.replacewith=">>, CqAnalyticsTestandtargetRecommendationsUrlReplacewith, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_auth_impl_cug_cug_support_impl() ->
  openapi_utils:response().
com_day_cq_auth_impl_cug_cug_support_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cug.exempted.principals=">>, CugExemptedPrincipals, <<"&">>, <<"cug.enabled=">>, CugEnabled, <<"&">>, <<"cug.principals.regex=">>, CugPrincipalsRegex, <<"&">>, <<"cug.principals.replacement=">>, CugPrincipalsReplacement, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_auth_impl_login_selector_handler() ->
  openapi_utils:response().
com_day_cq_auth_impl_login_selector_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.auth.impl.LoginSelectorHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"auth.loginselector.mappings=">>, AuthLoginselectorMappings, <<"&">>, <<"auth.loginselector.changepw.mappings=">>, AuthLoginselectorChangepwMappings, <<"&">>, <<"auth.loginselector.defaultloginpage=">>, AuthLoginselectorDefaultloginpage, <<"&">>, <<"auth.loginselector.defaultchangepwpage=">>, AuthLoginselectorDefaultchangepwpage, <<"&">>, <<"auth.loginselector.handle=">>, AuthLoginselectorHandle, <<"&">>, <<"auth.loginselector.handle.all.extensions=">>, AuthLoginselectorHandleAllExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_commons_impl_externalizer_impl() ->
  openapi_utils:response().
com_day_cq_commons_impl_externalizer_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.commons.impl.ExternalizerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"externalizer.domains=">>, ExternalizerDomains, <<"&">>, <<"externalizer.host=">>, ExternalizerHost, <<"&">>, <<"externalizer.contextpath=">>, ExternalizerContextpath, <<"&">>, <<"externalizer.encodedpath=">>, ExternalizerEncodedpath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_commons_servlets_root_mapping_servlet() ->
  openapi_utils:response().
com_day_cq_commons_servlets_root_mapping_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.commons.servlets.RootMappingServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"rootmapping.target=">>, RootmappingTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke() ->
  openapi_utils:response().
com_day_cq_compat_codeupgrade_impl_code_upgrade_execution_condition_checke() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.CodeUpgradeExecutionConditionChecker"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"codeupgradetasks=">>, Codeupgradetasks, <<"&">>, <<"codeupgradetaskfilters=">>, Codeupgradetaskfilters, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list() ->
  openapi_utils:response().
com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.UpgradeTaskIgnoreList"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"upgradeTaskIgnoreList=">>, UpgradeTaskIgnoreList, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist() ->
  openapi_utils:response().
com_day_cq_compat_codeupgrade_impl_version_range_task_ignorelist() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.compat.codeupgrade.impl.VersionRangeTaskIgnorelist"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"effectiveBundleListPath=">>, EffectiveBundleListPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_contentsync_impl_content_sync_manager_impl() ->
  openapi_utils:response().
com_day_cq_contentsync_impl_content_sync_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.contentsync.impl.ContentSyncManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"contentsync.fallback.authorizable=">>, ContentsyncFallbackAuthorizable, <<"&">>, <<"contentsync.fallback.updateuser=">>, ContentsyncFallbackUpdateuser, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_commons_handler_standard_image_handler() ->
  openapi_utils:response().
com_day_cq_dam_commons_handler_standard_image_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.commons.handler.StandardImageHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"large_file_threshold=">>, LargeFileThreshold, <<"&">>, <<"large_comment_threshold=">>, LargeCommentThreshold, <<"&">>, <<"cq.dam.enable.ext.meta.extraction=">>, CqDamEnableExtMetaExtraction, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_commons_metadata_xmp_filter_black_white() ->
  openapi_utils:response().
com_day_cq_dam_commons_metadata_xmp_filter_black_white() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.commons.metadata.XmpFilterBlackWhite"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"xmp.filter.apply_whitelist=">>, XmpFilterApplyWhitelist, <<"&">>, <<"xmp.filter.whitelist=">>, XmpFilterWhitelist, <<"&">>, <<"xmp.filter.apply_blacklist=">>, XmpFilterApplyBlacklist, <<"&">>, <<"xmp.filter.blacklist=">>, XmpFilterBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_commons_util_impl_asset_cache_impl() ->
  openapi_utils:response().
com_day_cq_dam_commons_util_impl_asset_cache_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.commons.util.impl.AssetCacheImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"large.file.min=">>, LargeFileMin, <<"&">>, <<"cache.apply=">>, CacheApply, <<"&">>, <<"mime.types=">>, MimeTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_annotation_pdf_annotation_pdf_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.annotation.pdf.AnnotationPdfConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.config.annotation.pdf.document.width=">>, CqDamConfigAnnotationPdfDocumentWidth, <<"&">>, <<"cq.dam.config.annotation.pdf.document.height=">>, CqDamConfigAnnotationPdfDocumentHeight, <<"&">>, <<"cq.dam.config.annotation.pdf.document.padding.horizontal=">>, CqDamConfigAnnotationPdfDocumentPaddingHorizontal, <<"&">>, <<"cq.dam.config.annotation.pdf.document.padding.vertical=">>, CqDamConfigAnnotationPdfDocumentPaddingVertical, <<"&">>, <<"cq.dam.config.annotation.pdf.font.size=">>, CqDamConfigAnnotationPdfFontSize, <<"&">>, <<"cq.dam.config.annotation.pdf.font.color=">>, CqDamConfigAnnotationPdfFontColor, <<"&">>, <<"cq.dam.config.annotation.pdf.font.family=">>, CqDamConfigAnnotationPdfFontFamily, <<"&">>, <<"cq.dam.config.annotation.pdf.font.light=">>, CqDamConfigAnnotationPdfFontLight, <<"&">>, <<"cq.dam.config.annotation.pdf.marginTextImage=">>, CqDamConfigAnnotationPdfMarginTextImage, <<"&">>, <<"cq.dam.config.annotation.pdf.minImageHeight=">>, CqDamConfigAnnotationPdfMinImageHeight, <<"&">>, <<"cq.dam.config.annotation.pdf.reviewStatus.width=">>, CqDamConfigAnnotationPdfReviewStatusWidth, <<"&">>, <<"cq.dam.config.annotation.pdf.reviewStatus.color.approved=">>, CqDamConfigAnnotationPdfReviewStatusColorApproved, <<"&">>, <<"cq.dam.config.annotation.pdf.reviewStatus.color.rejected=">>, CqDamConfigAnnotationPdfReviewStatusColorRejected, <<"&">>, <<"cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested=">>, CqDamConfigAnnotationPdfReviewStatusColorChangesRequested, <<"&">>, <<"cq.dam.config.annotation.pdf.annotationMarker.width=">>, CqDamConfigAnnotationPdfAnnotationMarkerWidth, <<"&">>, <<"cq.dam.config.annotation.pdf.asset.minheight=">>, CqDamConfigAnnotationPdfAssetMinheight, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_asset_move_listener() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_asset_move_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.AssetMoveListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_assethome_asset_home_page_configuration() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_assethome_asset_home_page_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.assethome.AssetHomePageConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"isEnabled=">>, IsEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_assetlinkshare_adhoc_asset_share_proxy_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.assetlinkshare.AdhocAssetShareProxyServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.adhoc.asset.share.prezip.maxcontentsize=">>, CqDamAdhocAssetSharePrezipMaxcontentsize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_cache_cq_buffered_image_cache() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_cache_cq_buffered_image_cache() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.cache.CQBufferedImageCache"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.image.cache.max.memory=">>, CqDamImageCacheMaxMemory, <<"&">>, <<"cq.dam.image.cache.max.age=">>, CqDamImageCacheMaxAge, <<"&">>, <<"cq.dam.image.cache.max.dimension=">>, CqDamImageCacheMaxDimension, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_dam_change_event_listener() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_dam_change_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.DamChangeEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"changeeventlistener.observed.paths=">>, ChangeeventlistenerObservedPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_dam_event_purge_service() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_dam_event_purge_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.DamEventPurgeService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"maxSavedActivities=">>, MaxSavedActivities, <<"&">>, <<"saveInterval=">>, SaveInterval, <<"&">>, <<"enableActivityPurge=">>, EnableActivityPurge, <<"&">>, <<"eventTypes=">>, EventTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_dam_event_recorder_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_dam_event_recorder_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.DamEventRecorderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"event.queue.length=">>, EventQueueLength, <<"&">>, <<"eventrecorder.enabled=">>, EventrecorderEnabled, <<"&">>, <<"eventrecorder.blacklist=">>, EventrecorderBlacklist, <<"&">>, <<"eventrecorder.eventtypes=">>, EventrecorderEventtypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_event_dam_event_audit_listener() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_event_dam_event_audit_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.event.DamEventAuditListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_expiry_notification_job_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_expiry_notification_job_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.ExpiryNotificationJobImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.expiry.notification.scheduler.istimebased=">>, CqDamExpiryNotificationSchedulerIstimebased, <<"&">>, <<"cq.dam.expiry.notification.scheduler.timebased.rule=">>, CqDamExpiryNotificationSchedulerTimebasedRule, <<"&">>, <<"cq.dam.expiry.notification.scheduler.period.rule=">>, CqDamExpiryNotificationSchedulerPeriodRule, <<"&">>, <<"send_email=">>, SendEmail, <<"&">>, <<"asset_expired_limit=">>, AssetExpiredLimit, <<"&">>, <<"prior_notification_seconds=">>, PriorNotificationSeconds, <<"&">>, <<"cq.dam.expiry.notification.url.protocol=">>, CqDamExpiryNotificationUrlProtocol, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_foldermetadataschema_folder_metadata_schema_feat() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.foldermetadataschema.FolderMetadataSchemaFeatureFlag"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"isEnabled=">>, IsEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_gfx_commons_gfx_renderer() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_gfx_commons_gfx_renderer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.gfx.CommonsGfxRenderer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"skip.bufferedcache=">>, SkipBufferedcache, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_handler_eps_format_handler() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_handler_eps_format_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.handler.EPSFormatHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mimetype=">>, Mimetype, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_handler_indesign_format_handler() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_handler_indesign_format_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.handler.IndesignFormatHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mimetype=">>, Mimetype, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_handler_jpeg_handler() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_handler_jpeg_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.handler.JpegHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.enable.ext.meta.extraction=">>, CqDamEnableExtMetaExtraction, <<"&">>, <<"large_file_threshold=">>, LargeFileThreshold, <<"&">>, <<"large_comment_threshold=">>, LargeCommentThreshold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_handler_xmp_n_comm_xmp_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.handler.xmp.NCommXMPHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"xmphandler.cq.formats=">>, XmphandlerCqFormats, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_jmx_asset_index_update_monitor() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_jmx_asset_index_update_monitor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetIndexUpdateMonitor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jmx.objectname=">>, JmxObjectname, <<"&">>, <<"property.measure.enabled=">>, PropertyMeasureEnabled, <<"&">>, <<"property.name=">>, PropertyName, <<"&">>, <<"property.max.wait.ms=">>, PropertyMaxWaitMs, <<"&">>, <<"property.max.rate=">>, PropertyMaxRate, <<"&">>, <<"fulltext.measure.enabled=">>, FulltextMeasureEnabled, <<"&">>, <<"fulltext.name=">>, FulltextName, <<"&">>, <<"fulltext.max.wait.ms=">>, FulltextMaxWaitMs, <<"&">>, <<"fulltext.max.rate=">>, FulltextMaxRate, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetMigrationMBeanImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jmx.objectname=">>, JmxObjectname, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_jmx_asset_update_monitor_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.jmx.AssetUpdateMonitorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jmx.objectname=">>, JmxObjectname, <<"&">>, <<"active=">>, Active, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_jobs_metadataexport_async_metadata_export_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataexport.AsyncMetadataExportConfigProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"operation=">>, Operation, <<"&">>, <<"emailEnabled=">>, EmailEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_jobs_metadataimport_async_metadata_import_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.jobs.metadataimport.AsyncMetadataImportConfigProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"operation=">>, Operation, <<"&">>, <<"operationIcon=">>, OperationIcon, <<"&">>, <<"topicName=">>, TopicName, <<"&">>, <<"emailEnabled=">>, EmailEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_lightbox_lightbox_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_lightbox_lightbox_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.lightbox.LightboxServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.paths=">>, SlingServletPaths, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>, <<"cq.dam.enable.anonymous=">>, CqDamEnableAnonymous, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_metadata_editor_select_component_handler() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_metadata_editor_select_component_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.metadata.editor.SelectComponentHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"granite:data=">>, GraniteData, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_mime_type_asset_upload_restriction_helper() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.AssetUploadRestrictionHelper"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.allow.all.mime=">>, CqDamAllowAllMime, <<"&">>, <<"cq.dam.allowed.asset.mimes=">>, CqDamAllowedAssetMimes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_mime_type_dam_mime_type_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.mimeType.DamMimeTypeServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.detect.asset.mime.from.content=">>, CqDamDetectAssetMimeFromContent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_missing_metadata_notification_job() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_missing_metadata_notification_job() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.MissingMetadataNotificationJob"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.missingmetadata.notification.scheduler.istimebased=">>, CqDamMissingmetadataNotificationSchedulerIstimebased, <<"&">>, <<"cq.dam.missingmetadata.notification.scheduler.timebased.rule=">>, CqDamMissingmetadataNotificationSchedulerTimebasedRule, <<"&">>, <<"cq.dam.missingmetadata.notification.scheduler.period.rule=">>, CqDamMissingmetadataNotificationSchedulerPeriodRule, <<"&">>, <<"cq.dam.missingmetadata.notification.recipient=">>, CqDamMissingmetadataNotificationRecipient, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_process_send_transient_workflow_completed_email_pr() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.process.SendTransientWorkflowCompletedEmailProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"Notify on Complete=">>, NotifyOnComplete, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_process_text_extraction_process() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_process_text_extraction_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.process.TextExtractionProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mimeTypes=">>, MimeTypes, <<"&">>, <<"maxExtract=">>, MaxExtract, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_rendition_maker_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_rendition_maker_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.RenditionMakerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"xmp.propagate=">>, XmpPropagate, <<"&">>, <<"xmp.excludes=">>, XmpExcludes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_reports_report_export_service() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_reports_report_export_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportExportService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"queryBatchSize=">>, QueryBatchSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_reports_report_purge_service() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_reports_report_purge_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.reports.ReportPurgeService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"maxSavedReports=">>, MaxSavedReports, <<"&">>, <<"timeDuration=">>, TimeDuration, <<"&">>, <<"enableReportPurge=">>, EnableReportPurge, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_asset_download_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_asset_download_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetDownloadServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_asset_status_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_asset_status_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetStatusServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.batch.status.maxassets=">>, CqDamBatchStatusMaxassets, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_asset_xmp_search_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.AssetXMPSearchServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.batch.indesign.maxassets=">>, CqDamBatchIndesignMaxassets, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_batch_metadata_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_batch_metadata_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BatchMetadataServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.batch.metadata.asset.default=">>, CqDamBatchMetadataAssetDefault, <<"&">>, <<"cq.dam.batch.metadata.collection.default=">>, CqDamBatchMetadataCollectionDefault, <<"&">>, <<"cq.dam.batch.metadata.maxresources=">>, CqDamBatchMetadataMaxresources, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_binary_provider_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_binary_provider_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.BinaryProviderServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.resourceTypes=">>, SlingServletResourceTypes, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>, <<"cq.dam.drm.enable=">>, CqDamDrmEnable, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_collection_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_collection_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.batch.collection.properties=">>, CqDamBatchCollectionProperties, <<"&">>, <<"cq.dam.batch.collection.maxcollections=">>, CqDamBatchCollectionMaxcollections, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_collections_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_collections_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CollectionsServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.batch.collections.properties=">>, CqDamBatchCollectionsProperties, <<"&">>, <<"cq.dam.batch.collections.limit=">>, CqDamBatchCollectionsLimit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_companion_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_companion_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CompanionServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"More Info=">>, MoreInfo, <<"&">>, <<"/mnt/overlay/dam/gui/content/assets/moreinfo.html/${path}=">>, MntOverlayDamGuiContentAssetsMoreinfoHtmlPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_create_asset_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_create_asset_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.CreateAssetServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"detect_duplicate=">>, DetectDuplicate, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_dam_content_disposition_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.DamContentDispositionFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.mime.type.blacklist=">>, CqMimeTypeBlacklist, <<"&">>, <<"cq.dam.empty.mime=">>, CqDamEmptyMime, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_guid_lookup_filter() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_guid_lookup_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.GuidLookupFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.core.guidlookupfilter.enabled=">>, CqDamCoreGuidlookupfilterEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_health_check_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_health_check_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.HealthCheckServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.sync.workflow.id=">>, CqDamSyncWorkflowId, <<"&">>, <<"cq.dam.sync.folder.types=">>, CqDamSyncFolderTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_metadata_get_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_metadata_get_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MetadataGetServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.resourceTypes=">>, SlingServletResourceTypes, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>, <<"sling.servlet.extensions=">>, SlingServletExtensions, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_multiple_license_accept_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.MultipleLicenseAcceptServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.drm.enable=">>, CqDamDrmEnable, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_servlet_resource_collection_servlet() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_servlet_resource_collection_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.servlet.ResourceCollectionServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.resourceTypes=">>, SlingServletResourceTypes, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"download.config=">>, DownloadConfig, <<"&">>, <<"view.selector=">>, ViewSelector, <<"&">>, <<"send_email=">>, SendEmail, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_ui_preview_folder_preview_updater_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.ui.preview.FolderPreviewUpdaterImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"createPreviewEnabled=">>, CreatePreviewEnabled, <<"&">>, <<"updatePreviewEnabled=">>, UpdatePreviewEnabled, <<"&">>, <<"queueSize=">>, QueueSize, <<"&">>, <<"folderPreviewRenditionRegex=">>, FolderPreviewRenditionRegex, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_impl_unzip_unzip_config() ->
  openapi_utils:response().
com_day_cq_dam_core_impl_unzip_unzip_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.impl.unzip.UnzipConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.config.unzip.maxuncompressedsize=">>, CqDamConfigUnzipMaxuncompressedsize, <<"&">>, <<"cq.dam.config.unzip.encoding=">>, CqDamConfigUnzipEncoding, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_process_exif_tool_extract_metadata_process() ->
  openapi_utils:response().
com_day_cq_dam_core_process_exif_tool_extract_metadata_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.process.ExifToolExtractMetadataProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"cq.dam.enable.sha1=">>, CqDamEnableSha1, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_process_extract_metadata_process() ->
  openapi_utils:response().
com_day_cq_dam_core_process_extract_metadata_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.process.ExtractMetadataProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"cq.dam.enable.sha1=">>, CqDamEnableSha1, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_core_process_metadata_processor_process() ->
  openapi_utils:response().
com_day_cq_dam_core_process_metadata_processor_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.core.process.MetadataProcessorProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"cq.dam.enable.sha1=">>, CqDamEnableSha1, <<"&">>, <<"cq.dam.metadata.xssprotected.properties=">>, CqDamMetadataXssprotectedProperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_handler_ffmpeg_locator_impl() ->
  openapi_utils:response().
com_day_cq_dam_handler_ffmpeg_locator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.handler.ffmpeg.LocatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"executable.searchpath=">>, ExecutableSearchpath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl() ->
  openapi_utils:response().
com_day_cq_dam_handler_gibson_fontmanager_impl_font_manager_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.handler.gibson.fontmanager.impl.FontManagerServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"fontmgr.system.font.dir=">>, FontmgrSystemFontDir, <<"&">>, <<"fontmgr.adobe.font.dir=">>, FontmgrAdobeFontDir, <<"&">>, <<"fontmgr.customer.font.dir=">>, FontmgrCustomerFontDir, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_handler_standard_pdf_pdf_handler() ->
  openapi_utils:response().
com_day_cq_dam_handler_standard_pdf_pdf_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.handler.standard.pdf.PdfHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"raster.annotation=">>, RasterAnnotation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_handler_standard_ps_post_script_handler() ->
  openapi_utils:response().
com_day_cq_dam_handler_standard_ps_post_script_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.handler.standard.ps.PostScriptHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"raster.annotation=">>, RasterAnnotation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_handler_standard_psd_psd_handler() ->
  openapi_utils:response().
com_day_cq_dam_handler_standard_psd_psd_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.handler.standard.psd.PsdHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"large_file_threshold=">>, LargeFileThreshold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_ids_impl_ids_job_processor() ->
  openapi_utils:response().
com_day_cq_dam_ids_impl_ids_job_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.ids.impl.IDSJobProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enable.multisession=">>, EnableMultisession, <<"&">>, <<"ids.cc.enable=">>, IdsCcEnable, <<"&">>, <<"enable.retry=">>, EnableRetry, <<"&">>, <<"enable.retry.scripterror=">>, EnableRetryScripterror, <<"&">>, <<"externalizer.domain.cqhost=">>, ExternalizerDomainCqhost, <<"&">>, <<"externalizer.domain.http=">>, ExternalizerDomainHttp, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_ids_impl_ids_pool_manager_impl() ->
  openapi_utils:response().
com_day_cq_dam_ids_impl_ids_pool_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.ids.impl.IDSPoolManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"max.errors.to.blacklist=">>, MaxErrorsToBlacklist, <<"&">>, <<"retry.interval.to.whitelist=">>, RetryIntervalToWhitelist, <<"&">>, <<"connect.timeout=">>, ConnectTimeout, <<"&">>, <<"socket.timeout=">>, SocketTimeout, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"connection.use.max=">>, ConnectionUseMax, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_indd_impl_handler_indesign_xmp_handler() ->
  openapi_utils:response().
com_day_cq_dam_indd_impl_handler_indesign_xmp_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.indd.impl.handler.IndesignXMPHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"extract.pages=">>, ExtractPages, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet() ->
  openapi_utils:response().
com_day_cq_dam_indd_impl_servlet_snippet_creation_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.indd.impl.servlet.SnippetCreationServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"snippetcreation.maxcollections=">>, SnippetcreationMaxcollections, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_indd_process_indd_media_extract_process() ->
  openapi_utils:response().
com_day_cq_dam_indd_process_indd_media_extract_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>, <<"cq.dam.indd.pages.regex=">>, CqDamInddPagesRegex, <<"&">>, <<"ids.job.decoupled=">>, IdsJobDecoupled, <<"&">>, <<"ids.job.workflow.model=">>, IdsJobWorkflowModel, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_performance_internal_asset_performance_data_handler_impl() ->
  openapi_utils:response().
com_day_cq_dam_performance_internal_asset_performance_data_handler_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceDataHandlerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"batch.commit.size=">>, BatchCommitSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_performance_internal_asset_performance_report_sync_job() ->
  openapi_utils:response().
com_day_cq_dam_performance_internal_asset_performance_report_sync_job() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.performance.internal.AssetPerformanceReportSyncJob"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro() ->
  openapi_utils:response().
com_day_cq_dam_pim_impl_sourcing_upload_process_product_assets_upload_pro() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.pim.impl.sourcing.upload.process.ProductAssetsUploadProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"delete.zip.file=">>, DeleteZipFile, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_analytics_impl_s7dam_dynamic_media_config_even() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.S7damDynamicMediaConfigEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled=">>, CqDamS7damDynamicmediaconfigeventlistenerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.analytics.impl.SiteCatalystReportRunner"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"scheduler.concurrent=">>, SchedulerConcurrent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_post_servlets_set_create_handler() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_post_servlets_set_create_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetCreateHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.post.operation=">>, SlingPostOperation, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_post_servlets_set_modify_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.post.servlets.SetModifyHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.post.operation=">>, SlingPostOperation, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_process_video_thumbnail_download_process() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.process.VideoThumbnailDownloadProcess"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"process.label=">>, ProcessLabel, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_s7dam_dam_change_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.S7damDamChangeEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.s7dam.damchangeeventlistener.enabled=">>, CqDamS7damDamchangeeventlistenerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_servlets_s7dam_product_info_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.servlets.S7damProductInfoServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.paths=">>, SlingServletPaths, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl() ->
  openapi_utils:response().
com_day_cq_dam_s7dam_common_video_impl_video_proxy_client_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.s7dam.common.video.impl.VideoProxyClientServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name=">>, CqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name=">>, CqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name=">>, CqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name=">>, CqDamS7damVideoproxyclientserviceHttpReadtimeoutName, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name=">>, CqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name=">>, CqDamS7damVideoproxyclientserviceHttpMaxretrycountName, <<"&">>, <<"cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name=">>, CqDamS7damVideoproxyclientserviceUploadprogressIntervalName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_scene7_impl_scene7_api_client_impl() ->
  openapi_utils:response().
com_day_cq_dam_scene7_impl_scene7_api_client_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7APIClientImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.scene7.apiclient.recordsperpage.nofilter.name=">>, CqDamScene7ApiclientRecordsperpageNofilterName, <<"&">>, <<"cq.dam.scene7.apiclient.recordsperpage.withfilter.name=">>, CqDamScene7ApiclientRecordsperpageWithfilterName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl() ->
  openapi_utils:response().
com_day_cq_dam_scene7_impl_scene7_asset_mime_type_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7AssetMimeTypeServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.scene7.assetmimetypeservice.mapping=">>, CqDamScene7AssetmimetypeserviceMapping, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_scene7_impl_scene7_configuration_event_listener() ->
  openapi_utils:response().
com_day_cq_dam_scene7_impl_scene7_configuration_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7ConfigurationEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.scene7.configurationeventlistener.enabled=">>, CqDamScene7ConfigurationeventlistenerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener() ->
  openapi_utils:response().
com_day_cq_dam_scene7_impl_scene7_dam_change_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7DamChangeEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.scene7.damchangeeventlistener.enabled=">>, CqDamScene7DamchangeeventlistenerEnabled, <<"&">>, <<"cq.dam.scene7.damchangeeventlistener.observed.paths=">>, CqDamScene7DamchangeeventlistenerObservedPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl() ->
  openapi_utils:response().
com_day_cq_dam_scene7_impl_scene7_flash_templates_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7FlashTemplatesServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scene7FlashTemplates.rti=">>, Scene7FlashTemplatesRti, <<"&">>, <<"scene7FlashTemplates.rsi=">>, Scene7FlashTemplatesRsi, <<"&">>, <<"scene7FlashTemplates.rb=">>, Scene7FlashTemplatesRb, <<"&">>, <<"scene7FlashTemplates.rurl=">>, Scene7FlashTemplatesRurl, <<"&">>, <<"scene7FlashTemplate.urlFormatParameter=">>, Scene7FlashTemplateUrlFormatParameter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_scene7_impl_scene7_upload_service_impl() ->
  openapi_utils:response().
com_day_cq_dam_scene7_impl_scene7_upload_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.scene7.impl.Scene7UploadServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.dam.scene7.uploadservice.activejobtimeout.label=">>, CqDamScene7UploadserviceActivejobtimeoutLabel, <<"&">>, <<"cq.dam.scene7.uploadservice.connectionmaxperroute.label=">>, CqDamScene7UploadserviceConnectionmaxperrouteLabel, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser() ->
  openapi_utils:response().
com_day_cq_dam_stock_integration_impl_cache_stock_cache_configuration_ser() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.stock.integration.impl.cache.StockCacheConfigurationServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"getCacheExpirationUnit=">>, GetCacheExpirationUnit, <<"&">>, <<"getCacheExpirationValue=">>, GetCacheExpirationValue, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_stock_integration_impl_configuration_stock_configuration() ->
  openapi_utils:response().
com_day_cq_dam_stock_integration_impl_configuration_stock_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.stock.integration.impl.configuration.StockConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"locale=">>, Locale, <<"&">>, <<"imsConfig=">>, ImsConfig, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_dam_video_impl_servlet_video_test_servlet() ->
  openapi_utils:response().
com_day_cq_dam_video_impl_servlet_video_test_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.dam.video.impl.servlet.VideoTestServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_extwidget_servlets_image_sprite_servlet() ->
  openapi_utils:response().
com_day_cq_extwidget_servlets_image_sprite_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.extwidget.servlets.ImageSpriteServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"maxWidth=">>, MaxWidth, <<"&">>, <<"maxHeight=">>, MaxHeight, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_image_internal_font_font_helper() ->
  openapi_utils:response().
com_day_cq_image_internal_font_font_helper() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.image.internal.font.FontHelper"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"fontpath=">>, Fontpath, <<"&">>, <<"oversamplingFactor=">>, OversamplingFactor, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_jcrclustersupport_cluster_start_level_controller() ->
  openapi_utils:response().
com_day_cq_jcrclustersupport_cluster_start_level_controller() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cluster.level.enable=">>, ClusterLevelEnable, <<"&">>, <<"cluster.master.level=">>, ClusterMasterLevel, <<"&">>, <<"cluster.slave.level=">>, ClusterSlaveLevel, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mailer_default_mail_service() ->
  openapi_utils:response().
com_day_cq_mailer_default_mail_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mailer.DefaultMailService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"smtp.host=">>, SmtpHost, <<"&">>, <<"smtp.port=">>, SmtpPort, <<"&">>, <<"smtp.user=">>, SmtpUser, <<"&">>, <<"smtp.password=">>, SmtpPassword, <<"&">>, <<"from.address=">>, FromAddress, <<"&">>, <<"smtp.ssl=">>, SmtpSsl, <<"&">>, <<"smtp.starttls=">>, SmtpStarttls, <<"&">>, <<"debug.email=">>, DebugEmail, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mailer_impl_cq_mailing_service() ->
  openapi_utils:response().
com_day_cq_mailer_impl_cq_mailing_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mailer.impl.CqMailingService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"max.recipient.count=">>, MaxRecipientCount, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mailer_impl_email_cq_email_template_factory() ->
  openapi_utils:response().
com_day_cq_mailer_impl_email_cq_email_template_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mailer.impl.email.CqEmailTemplateFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mailer.email.charset=">>, MailerEmailCharset, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mailer_impl_email_cq_retriever_template_factory() ->
  openapi_utils:response().
com_day_cq_mailer_impl_email_cq_retriever_template_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mailer.impl.email.CqRetrieverTemplateFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mailer.email.embed=">>, MailerEmailEmbed, <<"&">>, <<"mailer.email.charset=">>, MailerEmailCharset, <<"&">>, <<"mailer.email.retrieverUserID=">>, MailerEmailRetrieverUserID, <<"&">>, <<"mailer.email.retrieverUserPWD=">>, MailerEmailRetrieverUserPWD, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_campaign_impl_integration_config_impl() ->
  openapi_utils:response().
com_day_cq_mcm_campaign_impl_integration_config_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.campaign.impl.IntegrationConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"aem.mcm.campaign.formConstraints=">>, AemMcmCampaignFormConstraints, <<"&">>, <<"aem.mcm.campaign.publicUrl=">>, AemMcmCampaignPublicUrl, <<"&">>, <<"aem.mcm.campaign.relaxedSSL=">>, AemMcmCampaignRelaxedSSL, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_campaign_importer_personalized_text_handler_factory() ->
  openapi_utils:response().
com_day_cq_mcm_campaign_importer_personalized_text_handler_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.campaign.importer.PersonalizedTextHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_core_newsletter_newsletter_email_service_impl() ->
  openapi_utils:response().
com_day_cq_mcm_core_newsletter_newsletter_email_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.core.newsletter.NewsletterEmailServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"from.address=">>, FromAddress, <<"&">>, <<"sender.host=">>, SenderHost, <<"&">>, <<"max.bounce.count=">>, MaxBounceCount, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_impl_mcm_configuration() ->
  openapi_utils:response().
com_day_cq_mcm_impl_mcm_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.impl.MCMConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"experience.indirection=">>, ExperienceIndirection, <<"&">>, <<"touchpoint.indirection=">>, TouchpointIndirection, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen() ->
  openapi_utils:response().
com_day_cq_mcm_landingpage_parser_taghandlers_cta_click_through_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.ClickThroughComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug() ->
  openapi_utils:response().
com_day_cq_mcm_landingpage_parser_taghandlers_cta_graphical_click_throug() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.GraphicalClickThroughComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component() ->
  openapi_utils:response().
com_day_cq_mcm_landingpage_parser_taghandlers_cta_lead_form_cta_component() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.cta.LeadFormCTAComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha() ->
  openapi_utils:response().
com_day_cq_mcm_landingpage_parser_taghandlers_mbox_m_box_experience_tag_ha() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.MBoxExperienceTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h() ->
  openapi_utils:response().
com_day_cq_mcm_landingpage_parser_taghandlers_mbox_target_component_tag_h() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.mcm.landingpage.parser.taghandlers.mbox.TargetComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_notification_impl_notification_service_impl() ->
  openapi_utils:response().
com_day_cq_notification_impl_notification_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.notification.impl.NotificationServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_personalization_impl_servlets_targeting_configuration_servlet() ->
  openapi_utils:response().
com_day_cq_personalization_impl_servlets_targeting_configuration_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.personalization.impl.servlets.TargetingConfigurationServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"forcelocation=">>, Forcelocation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_polling_importer_impl_managed_poll_config_impl() ->
  openapi_utils:response().
com_day_cq_polling_importer_impl_managed_poll_config_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollConfigImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"id=">>, Id, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"reference=">>, Reference, <<"&">>, <<"interval=">>, Interval, <<"&">>, <<"expression=">>, Expression, <<"&">>, <<"source=">>, Source, <<"&">>, <<"target=">>, Target, <<"&">>, <<"login=">>, Login, <<"&">>, <<"password=">>, Password, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_polling_importer_impl_managed_polling_importer_impl() ->
  openapi_utils:response().
com_day_cq_polling_importer_impl_managed_polling_importer_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.polling.importer.impl.ManagedPollingImporterImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"importer.user=">>, ImporterUser, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_polling_importer_impl_polling_importer_impl() ->
  openapi_utils:response().
com_day_cq_polling_importer_impl_polling_importer_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.polling.importer.impl.PollingImporterImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"importer.min.interval=">>, ImporterMinInterval, <<"&">>, <<"importer.user=">>, ImporterUser, <<"&">>, <<"exclude.paths=">>, ExcludePaths, <<"&">>, <<"include.paths=">>, IncludePaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_audit_replication_event_listener() ->
  openapi_utils:response().
com_day_cq_replication_audit_replication_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.audit.ReplicationEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_content_static_content_builder() ->
  openapi_utils:response().
com_day_cq_replication_content_static_content_builder() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.content.StaticContentBuilder"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"host=">>, Host, <<"&">>, <<"port=">>, Port, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_agent_manager_impl() ->
  openapi_utils:response().
com_day_cq_replication_impl_agent_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.AgentManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"job.topics=">>, JobTopics, <<"&">>, <<"serviceUser.target=">>, ServiceUserTarget, <<"&">>, <<"agentProvider.target=">>, AgentProviderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_content_durbo_binary_less_content_builder() ->
  openapi_utils:response().
com_day_cq_replication_impl_content_durbo_binary_less_content_builder() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.content.durbo.BinaryLessContentBuilder"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"binary.threshold=">>, BinaryThreshold, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov() ->
  openapi_utils:response().
com_day_cq_replication_impl_content_durbo_durbo_import_configuration_prov() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"preserve.hierarchy.nodes=">>, PreserveHierarchyNodes, <<"&">>, <<"ignore.versioning=">>, IgnoreVersioning, <<"&">>, <<"import.acl=">>, ImportAcl, <<"&">>, <<"save.threshold=">>, SaveThreshold, <<"&">>, <<"preserve.user.paths=">>, PreserveUserPaths, <<"&">>, <<"preserve.uuid=">>, PreserveUuid, <<"&">>, <<"preserve.uuid.nodetypes=">>, PreserveUuidNodetypes, <<"&">>, <<"preserve.uuid.subtrees=">>, PreserveUuidSubtrees, <<"&">>, <<"auto.commit=">>, AutoCommit, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_replication_content_factory_provider_impl() ->
  openapi_utils:response().
com_day_cq_replication_impl_replication_content_factory_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.ReplicationContentFactoryProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"replication.content.useFileStorage=">>, ReplicationContentUseFileStorage, <<"&">>, <<"replication.content.maxCommitAttempts=">>, ReplicationContentMaxCommitAttempts, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_replication_receiver_impl() ->
  openapi_utils:response().
com_day_cq_replication_impl_replication_receiver_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.ReplicationReceiverImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"receiver.tmpfile.threshold=">>, ReceiverTmpfileThreshold, <<"&">>, <<"receiver.packages.use.install=">>, ReceiverPackagesUseInstall, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_replicator_impl() ->
  openapi_utils:response().
com_day_cq_replication_impl_replicator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.ReplicatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"distribute_events=">>, DistributeEvents, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_reverse_replicator() ->
  openapi_utils:response().
com_day_cq_replication_impl_reverse_replicator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.ReverseReplicator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.period=">>, SchedulerPeriod, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_transport_binary_less_transport_handler() ->
  openapi_utils:response().
com_day_cq_replication_impl_transport_binary_less_transport_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.transport.BinaryLessTransportHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"disabled.cipher.suites=">>, DisabledCipherSuites, <<"&">>, <<"enabled.cipher.suites=">>, EnabledCipherSuites, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_replication_impl_transport_http() ->
  openapi_utils:response().
com_day_cq_replication_impl_transport_http() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.replication.impl.transport.Http"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"disabled.cipher.suites=">>, DisabledCipherSuites, <<"&">>, <<"enabled.cipher.suites=">>, EnabledCipherSuites, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_reporting_impl_cache_cache_impl() ->
  openapi_utils:response().
com_day_cq_reporting_impl_cache_cache_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.reporting.impl.cache.CacheImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"repcache.enable=">>, RepcacheEnable, <<"&">>, <<"repcache.ttl=">>, RepcacheTtl, <<"&">>, <<"repcache.max=">>, RepcacheMax, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_reporting_impl_config_service_impl() ->
  openapi_utils:response().
com_day_cq_reporting_impl_config_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.reporting.impl.ConfigServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"repconf.timezone=">>, RepconfTimezone, <<"&">>, <<"repconf.locale=">>, RepconfLocale, <<"&">>, <<"repconf.snapshots=">>, RepconfSnapshots, <<"&">>, <<"repconf.repdir=">>, RepconfRepdir, <<"&">>, <<"repconf.hourofday=">>, RepconfHourofday, <<"&">>, <<"repconf.minofhour=">>, RepconfMinofhour, <<"&">>, <<"repconf.maxrows=">>, RepconfMaxrows, <<"&">>, <<"repconf.fakedata=">>, RepconfFakedata, <<"&">>, <<"repconf.snapshotuser=">>, RepconfSnapshotuser, <<"&">>, <<"repconf.enforcesnapshotuser=">>, RepconfEnforcesnapshotuser, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_reporting_impl_r_log_analyzer() ->
  openapi_utils:response().
com_day_cq_reporting_impl_r_log_analyzer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.reporting.impl.RLogAnalyzer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"request.log.output=">>, RequestLogOutput, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_rewriter_linkchecker_impl_link_checker_impl() ->
  openapi_utils:response().
com_day_cq_rewriter_linkchecker_impl_link_checker_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.period=">>, SchedulerPeriod, <<"&">>, <<"scheduler.concurrent=">>, SchedulerConcurrent, <<"&">>, <<"service.bad_link_tolerance_interval=">>, ServiceBadLinkToleranceInterval, <<"&">>, <<"service.check_override_patterns=">>, ServiceCheckOverridePatterns, <<"&">>, <<"service.cache_broken_internal_links=">>, ServiceCacheBrokenInternalLinks, <<"&">>, <<"service.special_link_prefix=">>, ServiceSpecialLinkPrefix, <<"&">>, <<"service.special_link_patterns=">>, ServiceSpecialLinkPatterns, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_rewriter_linkchecker_impl_link_checker_task() ->
  openapi_utils:response().
com_day_cq_rewriter_linkchecker_impl_link_checker_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.period=">>, SchedulerPeriod, <<"&">>, <<"scheduler.concurrent=">>, SchedulerConcurrent, <<"&">>, <<"good_link_test_interval=">>, GoodLinkTestInterval, <<"&">>, <<"bad_link_test_interval=">>, BadLinkTestInterval, <<"&">>, <<"link_unused_interval=">>, LinkUnusedInterval, <<"&">>, <<"connection.timeout=">>, ConnectionTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory() ->
  openapi_utils:response().
com_day_cq_rewriter_linkchecker_impl_link_checker_transformer_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkCheckerTransformerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"linkcheckertransformer.disableRewriting=">>, LinkcheckertransformerDisableRewriting, <<"&">>, <<"linkcheckertransformer.disableChecking=">>, LinkcheckertransformerDisableChecking, <<"&">>, <<"linkcheckertransformer.mapCacheSize=">>, LinkcheckertransformerMapCacheSize, <<"&">>, <<"linkcheckertransformer.strictExtensionCheck=">>, LinkcheckertransformerStrictExtensionCheck, <<"&">>, <<"linkcheckertransformer.stripHtmltExtension=">>, LinkcheckertransformerStripHtmltExtension, <<"&">>, <<"linkcheckertransformer.rewriteElements=">>, LinkcheckertransformerRewriteElements, <<"&">>, <<"linkcheckertransformer.stripExtensionPathBlacklist=">>, LinkcheckertransformerStripExtensionPathBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl() ->
  openapi_utils:response().
com_day_cq_rewriter_linkchecker_impl_link_info_storage_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.rewriter.linkchecker.impl.LinkInfoStorageImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.max_links_per_host=">>, ServiceMaxLinksPerHost, <<"&">>, <<"service.save_external_link_references=">>, ServiceSaveExternalLinkReferences, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_rewriter_processor_impl_html_parser_factory() ->
  openapi_utils:response().
com_day_cq_rewriter_processor_impl_html_parser_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.rewriter.processor.impl.HtmlParserFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"htmlparser.processTags=">>, HtmlparserProcessTags, <<"&">>, <<"htmlparser.preserveCamelCase=">>, HtmlparserPreserveCamelCase, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_search_impl_builder_query_builder_impl() ->
  openapi_utils:response().
com_day_cq_search_impl_builder_query_builder_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.search.impl.builder.QueryBuilderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"excerpt.properties=">>, ExcerptProperties, <<"&">>, <<"cache.max.entries=">>, CacheMaxEntries, <<"&">>, <<"cache.entry.lifetime=">>, CacheEntryLifetime, <<"&">>, <<"xpath.union=">>, XpathUnion, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_search_suggest_impl_suggestion_index_manager_impl() ->
  openapi_utils:response().
com_day_cq_search_suggest_impl_suggestion_index_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.search.suggest.impl.SuggestionIndexManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pathBuilder.target=">>, PathBuilderTarget, <<"&">>, <<"suggest.basepath=">>, SuggestBasepath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_searchpromote_impl_publish_search_promote_config_handler() ->
  openapi_utils:response().
com_day_cq_searchpromote_impl_publish_search_promote_config_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.searchpromote.impl.PublishSearchPromoteConfigHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.searchpromote.confighandler.enabled=">>, CqSearchpromoteConfighandlerEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_searchpromote_impl_search_promote_service_impl() ->
  openapi_utils:response().
com_day_cq_searchpromote_impl_search_promote_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.searchpromote.impl.SearchPromoteServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.searchpromote.configuration.server.uri=">>, CqSearchpromoteConfigurationServerUri, <<"&">>, <<"cq.searchpromote.configuration.environment=">>, CqSearchpromoteConfigurationEnvironment, <<"&">>, <<"connection.timeout=">>, ConnectionTimeout, <<"&">>, <<"socket.timeout=">>, SocketTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_security_acl_setup() ->
  openapi_utils:response().
com_day_cq_security_acl_setup() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.security.ACLSetup"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.aclsetup.rules=">>, CqAclsetupRules, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_statistics_impl_statistics_service_impl() ->
  openapi_utils:response().
com_day_cq_statistics_impl_statistics_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.statistics.impl.StatisticsServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.period=">>, SchedulerPeriod, <<"&">>, <<"scheduler.concurrent=">>, SchedulerConcurrent, <<"&">>, <<"path=">>, Path, <<"&">>, <<"workspace=">>, Workspace, <<"&">>, <<"keywordsPath=">>, KeywordsPath, <<"&">>, <<"asyncEntries=">>, AsyncEntries, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_tagging_impl_jcr_tag_manager_factory_impl() ->
  openapi_utils:response().
com_day_cq_tagging_impl_jcr_tag_manager_factory_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.tagging.impl.JcrTagManagerFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"validation.enabled=">>, ValidationEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_tagging_impl_search_tag_predicate_evaluator() ->
  openapi_utils:response().
com_day_cq_tagging_impl_search_tag_predicate_evaluator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.tagging.impl.search.TagPredicateEvaluator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"ignore_path=">>, IgnorePath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_tagging_impl_tag_garbage_collector() ->
  openapi_utils:response().
com_day_cq_tagging_impl_tag_garbage_collector() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.tagging.impl.TagGarbageCollector"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_contentsync_impl_handler_pages_update_handler() ->
  openapi_utils:response().
com_day_cq_wcm_contentsync_impl_handler_pages_update_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.contentsync.impl.handler.PagesUpdateHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.pagesupdatehandler.imageresourcetypes=">>, CqPagesupdatehandlerImageresourcetypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor() ->
  openapi_utils:response().
com_day_cq_wcm_contentsync_impl_rewriter_path_rewriter_transformer_factor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.contentsync.impl.rewriter.PathRewriterTransformerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.contentsync.pathrewritertransformer.mapping.links=">>, CqContentsyncPathrewritertransformerMappingLinks, <<"&">>, <<"cq.contentsync.pathrewritertransformer.mapping.clientlibs=">>, CqContentsyncPathrewritertransformerMappingClientlibs, <<"&">>, <<"cq.contentsync.pathrewritertransformer.mapping.images=">>, CqContentsyncPathrewritertransformerMappingImages, <<"&">>, <<"cq.contentsync.pathrewritertransformer.attribute.pattern=">>, CqContentsyncPathrewritertransformerAttributePattern, <<"&">>, <<"cq.contentsync.pathrewritertransformer.clientlibrary.pattern=">>, CqContentsyncPathrewritertransformerClientlibraryPattern, <<"&">>, <<"cq.contentsync.pathrewritertransformer.clientlibrary.replace=">>, CqContentsyncPathrewritertransformerClientlibraryReplace, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_authoring_ui_mode_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.AuthoringUIModeServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"authoringUIModeService.default=">>, AuthoringUIModeServiceDefault, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_commands_wcm_command_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_commands_wcm_command_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.commands.WCMCommandServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"wcmcommandservlet.delete_whitelist=">>, WcmcommandservletDeleteWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_devicedetection_device_identification_mode_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.devicedetection.DeviceIdentificationModeImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dim.default.mode=">>, DimDefaultMode, <<"&">>, <<"dim.appcache.enabled=">>, DimAppcacheEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_event_page_event_audit_listener() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_event_page_event_audit_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.event.PageEventAuditListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"configured=">>, Configured, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_event_page_post_processor() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_event_page_post_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.event.PagePostProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"paths=">>, Paths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_event_repository_change_event_listener() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_event_repository_change_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.event.RepositoryChangeEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"paths=">>, Paths, <<"&">>, <<"excludedPaths=">>, ExcludedPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_event_template_post_processor() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_event_template_post_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.event.TemplatePostProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"paths=">>, Paths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_language_manager_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_language_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.LanguageManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"langmgr.list.path=">>, LangmgrListPath, <<"&">>, <<"langmgr.country.default=">>, LangmgrCountryDefault, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_link_checker_configuration_factory_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.LinkCheckerConfigurationFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"link.expired.prefix=">>, LinkExpiredPrefix, <<"&">>, <<"link.expired.remove=">>, LinkExpiredRemove, <<"&">>, <<"link.expired.suffix=">>, LinkExpiredSuffix, <<"&">>, <<"link.invalid.prefix=">>, LinkInvalidPrefix, <<"&">>, <<"link.invalid.remove=">>, LinkInvalidRemove, <<"&">>, <<"link.invalid.suffix=">>, LinkInvalidSuffix, <<"&">>, <<"link.predated.prefix=">>, LinkPredatedPrefix, <<"&">>, <<"link.predated.remove=">>, LinkPredatedRemove, <<"&">>, <<"link.predated.suffix=">>, LinkPredatedSuffix, <<"&">>, <<"link.wcmmodes=">>, LinkWcmmodes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_page_page_info_aggregator_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_page_page_info_aggregator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageInfoAggregatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"page.info.provider.property.regex.default=">>, PageInfoProviderPropertyRegexDefault, <<"&">>, <<"page.info.provider.property.name=">>, PageInfoProviderPropertyName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_page_page_manager_factory_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_page_page_manager_factory_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.page.PageManagerFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"illegalCharMapping=">>, IllegalCharMapping, <<"&">>, <<"pageSubTreeActivationCheck=">>, PageSubTreeActivationCheck, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_references_content_content_reference_config() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_references_content_content_reference_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.references.content.ContentReferenceConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"contentReferenceConfig.resourceTypes=">>, ContentReferenceConfigResourceTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_servlets_contentfinder_asset_view_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.AssetViewHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dam.showexpired=">>, DamShowexpired, <<"&">>, <<"dam.showhidden=">>, DamShowhidden, <<"&">>, <<"tagTitleSearch=">>, TagTitleSearch, <<"&">>, <<"guessTotal=">>, GuessTotal, <<"&">>, <<"dam.expiryProperty=">>, DamExpiryProperty, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_servlets_contentfinder_connector_connector_vie() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.connector.ConnectorViewHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"item.resource.types=">>, ItemResourceTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_servlets_contentfinder_page_view_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.contentfinder.PageViewHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"guessTotal=">>, GuessTotal, <<"&">>, <<"tagTitleSearch=">>, TagTitleSearch, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_servlets_find_replace_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_servlets_find_replace_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.FindReplaceServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scope=">>, Scope, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_servlets_reference_search_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_servlets_reference_search_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ReferenceSearchServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"referencesearchservlet.maxReferencesPerPage=">>, ReferencesearchservletMaxReferencesPerPage, <<"&">>, <<"referencesearchservlet.maxPages=">>, ReferencesearchservletMaxPages, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_servlets_thumbnail_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_servlets_thumbnail_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.servlets.ThumbnailServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"workspace=">>, Workspace, <<"&">>, <<"dimensions=">>, Dimensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_utils_default_page_name_validator() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_utils_default_page_name_validator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.utils.DefaultPageNameValidator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"nonValidChars=">>, NonValidChars, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_variants_page_variants_provider_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_variants_page_variants_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.variants.PageVariantsProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"default.externalizer.domain=">>, DefaultExternalizerDomain, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_version_manager_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_version_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.VersionManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"versionmanager.createVersionOnActivation=">>, VersionmanagerCreateVersionOnActivation, <<"&">>, <<"versionmanager.purgingEnabled=">>, VersionmanagerPurgingEnabled, <<"&">>, <<"versionmanager.purgePaths=">>, VersionmanagerPurgePaths, <<"&">>, <<"versionmanager.ivPaths=">>, VersionmanagerIvPaths, <<"&">>, <<"versionmanager.maxAgeDays=">>, VersionmanagerMaxAgeDays, <<"&">>, <<"versionmanager.maxNumberVersions=">>, VersionmanagerMaxNumberVersions, <<"&">>, <<"versionmanager.minNumberVersions=">>, VersionmanagerMinNumberVersions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_version_purge_task() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_version_purge_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.VersionPurgeTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"versionpurge.paths=">>, VersionpurgePaths, <<"&">>, <<"versionpurge.recursive=">>, VersionpurgeRecursive, <<"&">>, <<"versionpurge.maxVersions=">>, VersionpurgeMaxVersions, <<"&">>, <<"versionpurge.minVersions=">>, VersionpurgeMinVersions, <<"&">>, <<"versionpurge.maxAgeDays=">>, VersionpurgeMaxAgeDays, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_warp_time_warp_filter() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_warp_time_warp_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.warp.TimeWarpFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"filter.order=">>, FilterOrder, <<"&">>, <<"filter.scope=">>, FilterScope, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_wcm_debug_filter() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_wcm_debug_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDebugFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"wcmdbgfilter.enabled=">>, WcmdbgfilterEnabled, <<"&">>, <<"wcmdbgfilter.jspDebug=">>, WcmdbgfilterJspDebug, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_impl_wcm_developer_mode_filter() ->
  openapi_utils:response().
com_day_cq_wcm_core_impl_wcm_developer_mode_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.impl.WCMDeveloperModeFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"wcmdevmodefilter.enabled=">>, WcmdevmodefilterEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_mvt_mvt_statistics_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_mvt_mvt_statistics_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.mvt.MVTStatisticsImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mvtstatistics.trackingurl=">>, MvtstatisticsTrackingurl, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_stats_page_view_statistics_impl() ->
  openapi_utils:response().
com_day_cq_wcm_core_stats_page_view_statistics_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.stats.PageViewStatisticsImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"pageviewstatistics.trackingurl=">>, PageviewstatisticsTrackingurl, <<"&">>, <<"pageviewstatistics.trackingscript.enabled=">>, PageviewstatisticsTrackingscriptEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_core_wcm_request_filter() ->
  openapi_utils:response().
com_day_cq_wcm_core_wcm_request_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.core.WCMRequestFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"wcmfilter.mode=">>, WcmfilterMode, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_design_package_importer() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_design_package_importer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"extract.filter=">>, ExtractFilter, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_impl_canvas_builder_impl() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_impl_canvas_builder_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasBuilderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"filepattern=">>, Filepattern, <<"&">>, <<"build.page.nodes=">>, BuildPageNodes, <<"&">>, <<"build.client.libs=">>, BuildClientLibs, <<"&">>, <<"build.canvas.component=">>, BuildCanvasComponent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.impl.CanvasPageDeleteHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"minThreadPoolSize=">>, MinThreadPoolSize, <<"&">>, <<"maxThreadPoolSize=">>, MaxThreadPoolSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_impl_entry_preprocessor_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.impl.EntryPreprocessorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"search.pattern=">>, SearchPattern, <<"&">>, <<"replace.pattern=">>, ReplacePattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_impl_mobile_canvas_builder_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.impl.MobileCanvasBuilderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"filepattern=">>, Filepattern, <<"&">>, <<"device.groups=">>, DeviceGroups, <<"&">>, <<"build.page.nodes=">>, BuildPageNodes, <<"&">>, <<"build.client.libs=">>, BuildClientLibs, <<"&">>, <<"build.canvas.component=">>, BuildCanvasComponent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_canvas_compone() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.CanvasComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_compon() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_default_tag_han() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.DefaultTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_head_tag_handle() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.HeadTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_i_frame_tag_hand() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.IFrameTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_image_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImageComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_img_tag_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ImgTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_inline_script_t() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.InlineScriptTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_link_tag_handle() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.LinkTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_meta_tag_handle() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.MetaTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_non_script_tag_h() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.NonScriptTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_parsys_compone() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ParsysComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_script_tag_hand() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.ScriptTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_style_tag_handl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.StyleTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_text_component() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TextComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_componen() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleComponentTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>, <<"component.resourceType=">>, ComponentResourceType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl() ->
  openapi_utils:response().
com_day_cq_wcm_designimporter_parser_taghandlers_factory_title_tag_handl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.designimporter.parser.taghandlers.factory.TitleTagHandlerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"tagpattern=">>, Tagpattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_forms_impl_form_chooser_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormChooserServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.name=">>, ServiceName, <<"&">>, <<"sling.servlet.resourceTypes=">>, SlingServletResourceTypes, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>, <<"forms.formchooserservlet.advansesearch.require=">>, FormsFormchooserservletAdvansesearchRequire, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_forms_impl_form_paragraph_post_processor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormParagraphPostProcessor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"forms.formparagraphpostprocessor.enabled=">>, FormsFormparagraphpostprocessorEnabled, <<"&">>, <<"forms.formparagraphpostprocessor.formresourcetypes=">>, FormsFormparagraphpostprocessorFormresourcetypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_forms_impl_forms_handling_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.FormsHandlingServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name.whitelist=">>, NameWhitelist, <<"&">>, <<"allow.expressions=">>, AllowExpressions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_forms_impl_mail_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_forms_impl_mail_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.forms.impl.MailServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.resourceTypes=">>, SlingServletResourceTypes, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"resource.whitelist=">>, ResourceWhitelist, <<"&">>, <<"resource.blacklist=">>, ResourceBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_impl_adaptive_image_component_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.impl.AdaptiveImageComponentServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"adapt.supported.widths=">>, AdaptSupportedWidths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_impl_http_auth_handler() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_impl_http_auth_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.impl.HTTPAuthHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"auth.http.nologin=">>, AuthHttpNologin, <<"&">>, <<"auth.http.realm=">>, AuthHttpRealm, <<"&">>, <<"auth.default.loginpage=">>, AuthDefaultLoginpage, <<"&">>, <<"auth.cred.form=">>, AuthCredForm, <<"&">>, <<"auth.cred.utf8=">>, AuthCredUtf8, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_impl_page_impressions_tracker() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_impl_page_impressions_tracker() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageImpressionsTracker"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.auth.requirements=">>, SlingAuthRequirements, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_impl_page_redirect_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_impl_page_redirect_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.impl.PageRedirectServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"excluded.resource.types=">>, ExcludedResourceTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.DefaultAttachmentTypeBlacklistService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"default.attachment.type.blacklist=">>, DefaultAttachmentTypeBlacklist, <<"&">>, <<"baseline.attachment.type.blacklist=">>, BaselineAttachmentTypeBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl() ->
  openapi_utils:response().
com_day_cq_wcm_foundation_security_impl_safer_sling_post_validator_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.foundation.security.impl.SaferSlingPostValidatorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"parameter.whitelist=">>, ParameterWhitelist, <<"&">>, <<"parameter.whitelist.prefixes=">>, ParameterWhitelistPrefixes, <<"&">>, <<"binary.parameter.whitelist=">>, BinaryParameterWhitelist, <<"&">>, <<"modifier.whitelist=">>, ModifierWhitelist, <<"&">>, <<"operation.whitelist=">>, OperationWhitelist, <<"&">>, <<"operation.whitelist.prefixes=">>, OperationWhitelistPrefixes, <<"&">>, <<"typehint.whitelist=">>, TypehintWhitelist, <<"&">>, <<"resourcetype.whitelist=">>, ResourcetypeWhitelist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory() ->
  openapi_utils:response().
com_day_cq_wcm_mobile_core_impl_device_device_info_transformer_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.device.DeviceInfoTransformerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"device.info.transformer.enabled=">>, DeviceInfoTransformerEnabled, <<"&">>, <<"device.info.transformer.css.style=">>, DeviceInfoTransformerCssStyle, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter() ->
  openapi_utils:response().
com_day_cq_wcm_mobile_core_impl_redirect_redirect_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.mobile.core.impl.redirect.RedirectFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"redirect.enabled=">>, RedirectEnabled, <<"&">>, <<"redirect.stats.enabled=">>, RedirectStatsEnabled, <<"&">>, <<"redirect.extensions=">>, RedirectExtensions, <<"&">>, <<"redirect.paths=">>, RedirectPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_content_copy_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_content_copy_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentCopyActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>, <<"contentcopyaction.order.style=">>, ContentcopyactionOrderStyle, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_content_delete_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_content_delete_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentDeleteActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_content_update_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_content_update_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ContentUpdateActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>, <<"cq.wcm.msm.action.ignoredMixin=">>, CqWcmMsmActionIgnoredMixin, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_order_children_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_order_children_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.OrderChildrenActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_page_move_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_page_move_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.PageMoveActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>, <<"cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate=">>, CqWcmMsmImplActionsPagemovePropReferenceUpdate, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_references_update_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_references_update_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.ReferencesUpdateActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>, <<"cq.wcm.msm.impl.action.referencesupdate.prop_updateNested=">>, CqWcmMsmImplActionReferencesupdatePropUpdateNested, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_actions_version_copy_action_factory() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_actions_version_copy_action_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.actions.VersionCopyActionFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.msm.action.excludednodetypes=">>, CqWcmMsmActionExcludednodetypes, <<"&">>, <<"cq.wcm.msm.action.excludedparagraphitems=">>, CqWcmMsmActionExcludedparagraphitems, <<"&">>, <<"cq.wcm.msm.action.excludedprops=">>, CqWcmMsmActionExcludedprops, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_live_relationship_manager_impl() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_live_relationship_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.LiveRelationshipManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"liverelationshipmgr.relationsconfig.default=">>, LiverelationshipmgrRelationsconfigDefault, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_rollout_manager_impl() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_rollout_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.RolloutManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"rolloutmgr.excludedprops.default=">>, RolloutmgrExcludedpropsDefault, <<"&">>, <<"rolloutmgr.excludedparagraphprops.default=">>, RolloutmgrExcludedparagraphpropsDefault, <<"&">>, <<"rolloutmgr.excludednodetypes.default=">>, RolloutmgrExcludednodetypesDefault, <<"&">>, <<"rolloutmgr.threadpool.maxsize=">>, RolloutmgrThreadpoolMaxsize, <<"&">>, <<"rolloutmgr.threadpool.maxshutdowntime=">>, RolloutmgrThreadpoolMaxshutdowntime, <<"&">>, <<"rolloutmgr.threadpool.priority=">>, RolloutmgrThreadpoolPriority, <<"&">>, <<"rolloutmgr.commit.size=">>, RolloutmgrCommitSize, <<"&">>, <<"rolloutmgr.conflicthandling.enabled=">>, RolloutmgrConflicthandlingEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_msm_impl_servlets_audit_log_servlet() ->
  openapi_utils:response().
com_day_cq_wcm_msm_impl_servlets_audit_log_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.msm.impl.servlets.AuditLogServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"auditlogservlet.default.events.count=">>, AuditlogservletDefaultEventsCount, <<"&">>, <<"auditlogservlet.default.path=">>, AuditlogservletDefaultPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_notification_email_impl_email_channel() ->
  openapi_utils:response().
com_day_cq_wcm_notification_email_impl_email_channel() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.notification.email.impl.EmailChannel"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"email.from=">>, EmailFrom, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_notification_impl_notification_manager_impl() ->
  openapi_utils:response().
com_day_cq_wcm_notification_impl_notification_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.notification.impl.NotificationManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.topics=">>, EventTopics, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_scripting_impl_bvp_manager() ->
  openapi_utils:response().
com_day_cq_wcm_scripting_impl_bvp_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"com.day.cq.wcm.scripting.bvp.script.engines=">>, ComDayCqWcmScriptingBvpScriptEngines, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_undo_undo_config() ->
  openapi_utils:response().
com_day_cq_wcm_undo_undo_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.undo.UndoConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cq.wcm.undo.enabled=">>, CqWcmUndoEnabled, <<"&">>, <<"cq.wcm.undo.path=">>, CqWcmUndoPath, <<"&">>, <<"cq.wcm.undo.validity=">>, CqWcmUndoValidity, <<"&">>, <<"cq.wcm.undo.steps=">>, CqWcmUndoSteps, <<"&">>, <<"cq.wcm.undo.persistence=">>, CqWcmUndoPersistence, <<"&">>, <<"cq.wcm.undo.persistence.mode=">>, CqWcmUndoPersistenceMode, <<"&">>, <<"cq.wcm.undo.markermode=">>, CqWcmUndoMarkermode, <<"&">>, <<"cq.wcm.undo.whitelist=">>, CqWcmUndoWhitelist, <<"&">>, <<"cq.wcm.undo.blacklist=">>, CqWcmUndoBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_webservicesupport_impl_replication_event_listener() ->
  openapi_utils:response().
com_day_cq_wcm_webservicesupport_impl_replication_event_listener() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.webservicesupport.impl.ReplicationEventListener"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"Flush agents=">>, FlushAgents, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl() ->
  openapi_utils:response().
com_day_cq_wcm_workflow_impl_wcm_workflow_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.workflow.impl.WcmWorkflowServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"event.filter=">>, EventFilter, <<"&">>, <<"minThreadPoolSize=">>, MinThreadPoolSize, <<"&">>, <<"maxThreadPoolSize=">>, MaxThreadPoolSize, <<"&">>, <<"cq.wcm.workflow.terminate.on.activate=">>, CqWcmWorkflowTerminateOnActivate, <<"&">>, <<"cq.wcm.worklfow.terminate.exclusion.list=">>, CqWcmWorklfowTerminateExclusionList, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_wcm_workflow_impl_workflow_package_info_provider() ->
  openapi_utils:response().
com_day_cq_wcm_workflow_impl_workflow_package_info_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.wcm.workflow.impl.WorkflowPackageInfoProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"workflowpackageinfoprovider.filter=">>, WorkflowpackageinfoproviderFilter, <<"&">>, <<"workflowpackageinfoprovider.filter.rootpath=">>, WorkflowpackageinfoproviderFilterRootpath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_widget_impl_html_library_manager_impl() ->
  openapi_utils:response().
com_day_cq_widget_impl_html_library_manager_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.widget.impl.HtmlLibraryManagerImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"htmllibmanager.clientmanager=">>, HtmllibmanagerClientmanager, <<"&">>, <<"htmllibmanager.debug=">>, HtmllibmanagerDebug, <<"&">>, <<"htmllibmanager.debug.console=">>, HtmllibmanagerDebugConsole, <<"&">>, <<"htmllibmanager.debug.init.js=">>, HtmllibmanagerDebugInitJs, <<"&">>, <<"htmllibmanager.defaultthemename=">>, HtmllibmanagerDefaultthemename, <<"&">>, <<"htmllibmanager.defaultuserthemename=">>, HtmllibmanagerDefaultuserthemename, <<"&">>, <<"htmllibmanager.firebuglite.path=">>, HtmllibmanagerFirebuglitePath, <<"&">>, <<"htmllibmanager.forceCQUrlInfo=">>, HtmllibmanagerForceCQUrlInfo, <<"&">>, <<"htmllibmanager.gzip=">>, HtmllibmanagerGzip, <<"&">>, <<"htmllibmanager.maxage=">>, HtmllibmanagerMaxage, <<"&">>, <<"htmllibmanager.maxDataUriSize=">>, HtmllibmanagerMaxDataUriSize, <<"&">>, <<"htmllibmanager.minify=">>, HtmllibmanagerMinify, <<"&">>, <<"htmllibmanager.path.list=">>, HtmllibmanagerPathList, <<"&">>, <<"htmllibmanager.timing=">>, HtmllibmanagerTiming, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_widget_impl_widget_extension_provider_impl() ->
  openapi_utils:response().
com_day_cq_widget_impl_widget_extension_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.widget.impl.WidgetExtensionProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"extendable.widgets=">>, ExtendableWidgets, <<"&">>, <<"widgetextensionprovider.debug=">>, WidgetextensionproviderDebug, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_workflow_impl_email_e_mail_notification_service() ->
  openapi_utils:response().
com_day_cq_workflow_impl_email_e_mail_notification_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.workflow.impl.email.EMailNotificationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"from.address=">>, FromAddress, <<"&">>, <<"host.prefix=">>, HostPrefix, <<"&">>, <<"notify.onabort=">>, NotifyOnabort, <<"&">>, <<"notify.oncomplete=">>, NotifyOncomplete, <<"&">>, <<"notify.oncontainercomplete=">>, NotifyOncontainercomplete, <<"&">>, <<"notify.useronly=">>, NotifyUseronly, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_cq_workflow_impl_email_task_e_mail_notification_service() ->
  openapi_utils:response().
com_day_cq_workflow_impl_email_task_e_mail_notification_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.cq.workflow.impl.email.TaskEMailNotificationService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"notify.onupdate=">>, NotifyOnupdate, <<"&">>, <<"notify.oncomplete=">>, NotifyOncomplete, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_crx_security_token_impl_impl_token_authentication_handler() ->
  openapi_utils:response().
com_day_crx_security_token_impl_impl_token_authentication_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.crx.security.token.impl.impl.TokenAuthenticationHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"token.required.attr=">>, TokenRequiredAttr, <<"&">>, <<"token.alternate.url=">>, TokenAlternateUrl, <<"&">>, <<"token.encapsulated=">>, TokenEncapsulated, <<"&">>, <<"skip.token.refresh=">>, SkipTokenRefresh, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec com_day_crx_security_token_impl_token_cleanup_task() ->
  openapi_utils:response().
com_day_crx_security_token_impl_token_cleanup_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/com.day.crx.security.token.impl.TokenCleanupTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enable.token.cleanup.task=">>, EnableTokenCleanupTask, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"batch.size=">>, BatchSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec guide_localization_service() ->
  openapi_utils:response().
guide_localization_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/Guide Localization Service"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"supportedLocales=">>, SupportedLocales, <<"&">>, <<"Localizable Properties=">>, LocalizableProperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec messaging_user_component_factory() ->
  openapi_utils:response().
messaging_user_component_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/MessagingUserComponentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_aries_jmx_framework_state_config() ->
  openapi_utils:response().
org_apache_aries_jmx_framework_state_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.aries.jmx.framework.StateConfig"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"attributeChangeNotificationEnabled=">>, AttributeChangeNotificationEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_eventadmin_impl_event_admin() ->
  openapi_utils:response().
org_apache_felix_eventadmin_impl_event_admin() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.eventadmin.impl.EventAdmin"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.felix.eventadmin.ThreadPoolSize=">>, OrgApacheFelixEventadminThreadPoolSize, <<"&">>, <<"org.apache.felix.eventadmin.AsyncToSyncThreadRatio=">>, OrgApacheFelixEventadminAsyncToSyncThreadRatio, <<"&">>, <<"org.apache.felix.eventadmin.Timeout=">>, OrgApacheFelixEventadminTimeout, <<"&">>, <<"org.apache.felix.eventadmin.RequireTopic=">>, OrgApacheFelixEventadminRequireTopic, <<"&">>, <<"org.apache.felix.eventadmin.IgnoreTimeout=">>, OrgApacheFelixEventadminIgnoreTimeout, <<"&">>, <<"org.apache.felix.eventadmin.IgnoreTopic=">>, OrgApacheFelixEventadminIgnoreTopic, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_http() ->
  openapi_utils:response().
org_apache_felix_http() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.http"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.felix.http.host=">>, OrgApacheFelixHttpHost, <<"&">>, <<"org.apache.felix.http.enable=">>, OrgApacheFelixHttpEnable, <<"&">>, <<"org.osgi.service.http.port=">>, OrgOsgiServiceHttpPort, <<"&">>, <<"org.apache.felix.http.timeout=">>, OrgApacheFelixHttpTimeout, <<"&">>, <<"org.apache.felix.https.enable=">>, OrgApacheFelixHttpsEnable, <<"&">>, <<"org.osgi.service.http.port.secure=">>, OrgOsgiServiceHttpPortSecure, <<"&">>, <<"org.apache.felix.https.keystore=">>, OrgApacheFelixHttpsKeystore, <<"&">>, <<"org.apache.felix.https.keystore.password=">>, OrgApacheFelixHttpsKeystorePassword, <<"&">>, <<"org.apache.felix.https.keystore.key.password=">>, OrgApacheFelixHttpsKeystoreKeyPassword, <<"&">>, <<"org.apache.felix.https.truststore=">>, OrgApacheFelixHttpsTruststore, <<"&">>, <<"org.apache.felix.https.truststore.password=">>, OrgApacheFelixHttpsTruststorePassword, <<"&">>, <<"org.apache.felix.https.clientcertificate=">>, OrgApacheFelixHttpsClientcertificate, <<"&">>, <<"org.apache.felix.http.context_path=">>, OrgApacheFelixHttpContextPath, <<"&">>, <<"org.apache.felix.http.mbeans=">>, OrgApacheFelixHttpMbeans, <<"&">>, <<"org.apache.felix.http.session.timeout=">>, OrgApacheFelixHttpSessionTimeout, <<"&">>, <<"org.apache.felix.http.jetty.threadpool.max=">>, OrgApacheFelixHttpJettyThreadpoolMax, <<"&">>, <<"org.apache.felix.http.jetty.acceptors=">>, OrgApacheFelixHttpJettyAcceptors, <<"&">>, <<"org.apache.felix.http.jetty.selectors=">>, OrgApacheFelixHttpJettySelectors, <<"&">>, <<"org.apache.felix.http.jetty.headerBufferSize=">>, OrgApacheFelixHttpJettyHeaderBufferSize, <<"&">>, <<"org.apache.felix.http.jetty.requestBufferSize=">>, OrgApacheFelixHttpJettyRequestBufferSize, <<"&">>, <<"org.apache.felix.http.jetty.responseBufferSize=">>, OrgApacheFelixHttpJettyResponseBufferSize, <<"&">>, <<"org.apache.felix.http.jetty.maxFormSize=">>, OrgApacheFelixHttpJettyMaxFormSize, <<"&">>, <<"org.apache.felix.http.path_exclusions=">>, OrgApacheFelixHttpPathExclusions, <<"&">>, <<"org.apache.felix.https.jetty.ciphersuites.excluded=">>, OrgApacheFelixHttpsJettyCiphersuitesExcluded, <<"&">>, <<"org.apache.felix.https.jetty.ciphersuites.included=">>, OrgApacheFelixHttpsJettyCiphersuitesIncluded, <<"&">>, <<"org.apache.felix.http.jetty.sendServerHeader=">>, OrgApacheFelixHttpJettySendServerHeader, <<"&">>, <<"org.apache.felix.https.jetty.protocols.included=">>, OrgApacheFelixHttpsJettyProtocolsIncluded, <<"&">>, <<"org.apache.felix.https.jetty.protocols.excluded=">>, OrgApacheFelixHttpsJettyProtocolsExcluded, <<"&">>, <<"org.apache.felix.proxy.load.balancer.connection.enable=">>, OrgApacheFelixProxyLoadBalancerConnectionEnable, <<"&">>, <<"org.apache.felix.https.jetty.renegotiateAllowed=">>, OrgApacheFelixHttpsJettyRenegotiateAllowed, <<"&">>, <<"org.apache.felix.https.jetty.session.cookie.httpOnly=">>, OrgApacheFelixHttpsJettySessionCookieHttpOnly, <<"&">>, <<"org.apache.felix.https.jetty.session.cookie.secure=">>, OrgApacheFelixHttpsJettySessionCookieSecure, <<"&">>, <<"org.eclipse.jetty.servlet.SessionIdPathParameterName=">>, OrgEclipseJettyServletSessionIdPathParameterName, <<"&">>, <<"org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding=">>, OrgEclipseJettyServletCheckingRemoteSessionIdEncoding, <<"&">>, <<"org.eclipse.jetty.servlet.SessionCookie=">>, OrgEclipseJettyServletSessionCookie, <<"&">>, <<"org.eclipse.jetty.servlet.SessionDomain=">>, OrgEclipseJettyServletSessionDomain, <<"&">>, <<"org.eclipse.jetty.servlet.SessionPath=">>, OrgEclipseJettyServletSessionPath, <<"&">>, <<"org.eclipse.jetty.servlet.MaxAge=">>, OrgEclipseJettyServletMaxAge, <<"&">>, <<"org.apache.felix.http.name=">>, OrgApacheFelixHttpName, <<"&">>, <<"org.apache.felix.jetty.gziphandler.enable=">>, OrgApacheFelixJettyGziphandlerEnable, <<"&">>, <<"org.apache.felix.jetty.gzip.minGzipSize=">>, OrgApacheFelixJettyGzipMinGzipSize, <<"&">>, <<"org.apache.felix.jetty.gzip.compressionLevel=">>, OrgApacheFelixJettyGzipCompressionLevel, <<"&">>, <<"org.apache.felix.jetty.gzip.inflateBufferSize=">>, OrgApacheFelixJettyGzipInflateBufferSize, <<"&">>, <<"org.apache.felix.jetty.gzip.syncFlush=">>, OrgApacheFelixJettyGzipSyncFlush, <<"&">>, <<"org.apache.felix.jetty.gzip.excludedUserAgents=">>, OrgApacheFelixJettyGzipExcludedUserAgents, <<"&">>, <<"org.apache.felix.jetty.gzip.includedMethods=">>, OrgApacheFelixJettyGzipIncludedMethods, <<"&">>, <<"org.apache.felix.jetty.gzip.excludedMethods=">>, OrgApacheFelixJettyGzipExcludedMethods, <<"&">>, <<"org.apache.felix.jetty.gzip.includedPaths=">>, OrgApacheFelixJettyGzipIncludedPaths, <<"&">>, <<"org.apache.felix.jetty.gzip.excludedPaths=">>, OrgApacheFelixJettyGzipExcludedPaths, <<"&">>, <<"org.apache.felix.jetty.gzip.includedMimeTypes=">>, OrgApacheFelixJettyGzipIncludedMimeTypes, <<"&">>, <<"org.apache.felix.jetty.gzip.excludedMimeTypes=">>, OrgApacheFelixJettyGzipExcludedMimeTypes, <<"&">>, <<"org.apache.felix.http.session.invalidate=">>, OrgApacheFelixHttpSessionInvalidate, <<"&">>, <<"org.apache.felix.http.session.uniqueid=">>, OrgApacheFelixHttpSessionUniqueid, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_http_sslfilter_ssl_filter() ->
  openapi_utils:response().
org_apache_felix_http_sslfilter_ssl_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.http.sslfilter.SslFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"ssl-forward.header=">>, SslForwardHeader, <<"&">>, <<"ssl-forward.value=">>, SslForwardValue, <<"&">>, <<"ssl-forward-cert.header=">>, SslForwardCertHeader, <<"&">>, <<"rewrite.absolute.urls=">>, RewriteAbsoluteUrls, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_jaas_configuration_factory() ->
  openapi_utils:response().
org_apache_felix_jaas_configuration_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.jaas.Configuration.factory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jaas.controlFlag=">>, JaasControlFlag, <<"&">>, <<"jaas.ranking=">>, JaasRanking, <<"&">>, <<"jaas.realmName=">>, JaasRealmName, <<"&">>, <<"jaas.classname=">>, JaasClassname, <<"&">>, <<"jaas.options=">>, JaasOptions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_jaas_configuration_spi() ->
  openapi_utils:response().
org_apache_felix_jaas_configuration_spi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.jaas.ConfigurationSpi"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jaas.defaultRealmName=">>, JaasDefaultRealmName, <<"&">>, <<"jaas.configProviderName=">>, JaasConfigProviderName, <<"&">>, <<"jaas.globalConfigPolicy=">>, JaasGlobalConfigPolicy, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_scr_scr_service() ->
  openapi_utils:response().
org_apache_felix_scr_scr_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.scr.ScrService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"ds.loglevel=">>, DsLoglevel, <<"&">>, <<"ds.factory.enabled=">>, DsFactoryEnabled, <<"&">>, <<"ds.delayed.keepInstances=">>, DsDelayedKeepInstances, <<"&">>, <<"ds.lock.timeout.milliseconds=">>, DsLockTimeoutMilliseconds, <<"&">>, <<"ds.stop.timeout.milliseconds=">>, DsStopTimeoutMilliseconds, <<"&">>, <<"ds.global.extender=">>, DsGlobalExtender, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_systemready_impl_components_check() ->
  openapi_utils:response().
org_apache_felix_systemready_impl_components_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.systemready.impl.ComponentsCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"components.list=">>, ComponentsList, <<"&">>, <<"type=">>, Type, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_systemready_impl_framework_start_check() ->
  openapi_utils:response().
org_apache_felix_systemready_impl_framework_start_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.systemready.impl.FrameworkStartCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"timeout=">>, Timeout, <<"&">>, <<"target.start.level=">>, TargetStartLevel, <<"&">>, <<"target.start.level.prop.name=">>, TargetStartLevelPropName, <<"&">>, <<"type=">>, Type, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_systemready_impl_services_check() ->
  openapi_utils:response().
org_apache_felix_systemready_impl_services_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.systemready.impl.ServicesCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"services.list=">>, ServicesList, <<"&">>, <<"type=">>, Type, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_systemready_impl_servlet_system_alive_servlet() ->
  openapi_utils:response().
org_apache_felix_systemready_impl_servlet_system_alive_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemAliveServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"osgi.http.whiteboard.servlet.pattern=">>, OsgiHttpWhiteboardServletPattern, <<"&">>, <<"osgi.http.whiteboard.context.select=">>, OsgiHttpWhiteboardContextSelect, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_systemready_impl_servlet_system_ready_servlet() ->
  openapi_utils:response().
org_apache_felix_systemready_impl_servlet_system_ready_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.systemready.impl.servlet.SystemReadyServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"osgi.http.whiteboard.servlet.pattern=">>, OsgiHttpWhiteboardServletPattern, <<"&">>, <<"osgi.http.whiteboard.context.select=">>, OsgiHttpWhiteboardContextSelect, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_systemready_system_ready_monitor() ->
  openapi_utils:response().
org_apache_felix_systemready_system_ready_monitor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.systemready.SystemReadyMonitor"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"poll.interval=">>, PollInterval, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_webconsole_internal_servlet_osgi_manager() ->
  openapi_utils:response().
org_apache_felix_webconsole_internal_servlet_osgi_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.webconsole.internal.servlet.OsgiManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"manager.root=">>, ManagerRoot, <<"&">>, <<"http.service.filter=">>, HttpServiceFilter, <<"&">>, <<"default.render=">>, DefaultRender, <<"&">>, <<"realm=">>, Realm, <<"&">>, <<"username=">>, Username, <<"&">>, <<"password=">>, Password, <<"&">>, <<"category=">>, Category, <<"&">>, <<"locale=">>, Locale, <<"&">>, <<"loglevel=">>, Loglevel, <<"&">>, <<"plugins=">>, Plugins, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_webconsole_plugins_event_internal_plugin_servlet() ->
  openapi_utils:response().
org_apache_felix_webconsole_plugins_event_internal_plugin_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.webconsole.plugins.event.internal.PluginServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"max.size=">>, MaxSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co() ->
  openapi_utils:response().
org_apache_felix_webconsole_plugins_memoryusage_internal_memory_usage_co() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.felix.webconsole.plugins.memoryusage.internal.MemoryUsageConfigurator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"felix.memoryusage.dump.threshold=">>, FelixMemoryusageDumpThreshold, <<"&">>, <<"felix.memoryusage.dump.interval=">>, FelixMemoryusageDumpInterval, <<"&">>, <<"felix.memoryusage.dump.location=">>, FelixMemoryusageDumpLocation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_http_proxyconfigurator() ->
  openapi_utils:response().
org_apache_http_proxyconfigurator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.http.proxyconfigurator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"proxy.enabled=">>, ProxyEnabled, <<"&">>, <<"proxy.host=">>, ProxyHost, <<"&">>, <<"proxy.port=">>, ProxyPort, <<"&">>, <<"proxy.user=">>, ProxyUser, <<"&">>, <<"proxy.password=">>, ProxyPassword, <<"&">>, <<"proxy.exceptions=">>, ProxyExceptions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_blob_datastore_data_store_text_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.DataStoreTextProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dir=">>, Dir, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_blob_datastore_file_data_store() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.blob.datastore.FileDataStore"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_document_document_node_store_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_document_document_node_store_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mongouri=">>, Mongouri, <<"&">>, <<"db=">>, Db, <<"&">>, <<"socketKeepAlive=">>, SocketKeepAlive, <<"&">>, <<"cache=">>, Cache, <<"&">>, <<"nodeCachePercentage=">>, NodeCachePercentage, <<"&">>, <<"prevDocCachePercentage=">>, PrevDocCachePercentage, <<"&">>, <<"childrenCachePercentage=">>, ChildrenCachePercentage, <<"&">>, <<"diffCachePercentage=">>, DiffCachePercentage, <<"&">>, <<"cacheSegmentCount=">>, CacheSegmentCount, <<"&">>, <<"cacheStackMoveDistance=">>, CacheStackMoveDistance, <<"&">>, <<"blobCacheSize=">>, BlobCacheSize, <<"&">>, <<"persistentCache=">>, PersistentCache, <<"&">>, <<"journalCache=">>, JournalCache, <<"&">>, <<"customBlobStore=">>, CustomBlobStore, <<"&">>, <<"journalGCInterval=">>, JournalGCInterval, <<"&">>, <<"journalGCMaxAge=">>, JournalGCMaxAge, <<"&">>, <<"prefetchExternalChanges=">>, PrefetchExternalChanges, <<"&">>, <<"role=">>, Role, <<"&">>, <<"versionGcMaxAgeInSecs=">>, VersionGcMaxAgeInSecs, <<"&">>, <<"versionGCExpression=">>, VersionGCExpression, <<"&">>, <<"versionGCTimeLimitInSecs=">>, VersionGCTimeLimitInSecs, <<"&">>, <<"blobGcMaxAgeInSecs=">>, BlobGcMaxAgeInSecs, <<"&">>, <<"blobTrackSnapshotIntervalInSecs=">>, BlobTrackSnapshotIntervalInSecs, <<"&">>, <<"repository.home=">>, RepositoryHome, <<"&">>, <<"maxReplicationLagInSecs=">>, MaxReplicationLagInSecs, <<"&">>, <<"documentStoreType=">>, DocumentStoreType, <<"&">>, <<"bundlingDisabled=">>, BundlingDisabled, <<"&">>, <<"updateLimit=">>, UpdateLimit, <<"&">>, <<"persistentCacheIncludes=">>, PersistentCacheIncludes, <<"&">>, <<"leaseCheckMode=">>, LeaseCheckMode, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_document_document_node_store_service_pre() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.DocumentNodeStoreServicePreset"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"persistentCacheIncludes=">>, PersistentCacheIncludes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_document_secondary_secondary_store_cac() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.document.secondary.SecondaryStoreCacheService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"includedPaths=">>, IncludedPaths, <<"&">>, <<"enableAsyncObserver=">>, EnableAsyncObserver, <<"&">>, <<"observerQueueSize=">>, ObserverQueueSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_async_indexer_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_async_indexer_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.AsyncIndexerService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"asyncConfigs=">>, AsyncConfigs, <<"&">>, <<"leaseTimeOutMinutes=">>, LeaseTimeOutMinutes, <<"&">>, <<"failingIndexTimeoutSeconds=">>, FailingIndexTimeoutSeconds, <<"&">>, <<"errorWarnIntervalSeconds=">>, ErrorWarnIntervalSeconds, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_lucene_lucene_index_provider_serv() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.lucene.LuceneIndexProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"disabled=">>, Disabled, <<"&">>, <<"debug=">>, Debug, <<"&">>, <<"localIndexDir=">>, LocalIndexDir, <<"&">>, <<"enableOpenIndexAsync=">>, EnableOpenIndexAsync, <<"&">>, <<"threadPoolSize=">>, ThreadPoolSize, <<"&">>, <<"prefetchIndexFiles=">>, PrefetchIndexFiles, <<"&">>, <<"extractedTextCacheSizeInMB=">>, ExtractedTextCacheSizeInMB, <<"&">>, <<"extractedTextCacheExpiryInSecs=">>, ExtractedTextCacheExpiryInSecs, <<"&">>, <<"alwaysUsePreExtractedCache=">>, AlwaysUsePreExtractedCache, <<"&">>, <<"booleanClauseLimit=">>, BooleanClauseLimit, <<"&">>, <<"enableHybridIndexing=">>, EnableHybridIndexing, <<"&">>, <<"hybridQueueSize=">>, HybridQueueSize, <<"&">>, <<"disableStoredIndexDefinition=">>, DisableStoredIndexDefinition, <<"&">>, <<"deletedBlobsCollectionEnabled=">>, DeletedBlobsCollectionEnabled, <<"&">>, <<"propIndexCleanerIntervalInSecs=">>, PropIndexCleanerIntervalInSecs, <<"&">>, <<"enableSingleBlobIndexFiles=">>, EnableSingleBlobIndexFiles, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_solr_osgi_embedded_solr_server_co() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.EmbeddedSolrServerConfigurationProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"solr.home.path=">>, SolrHomePath, <<"&">>, <<"solr.core.name=">>, SolrCoreName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_solr_osgi_node_state_solr_servers() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.NodeStateSolrServersObserverService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_solr_osgi_oak_solr_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.OakSolrConfigurationProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path.desc.field=">>, PathDescField, <<"&">>, <<"path.child.field=">>, PathChildField, <<"&">>, <<"path.parent.field=">>, PathParentField, <<"&">>, <<"path.exact.field=">>, PathExactField, <<"&">>, <<"catch.all.field=">>, CatchAllField, <<"&">>, <<"collapsed.path.field=">>, CollapsedPathField, <<"&">>, <<"path.depth.field=">>, PathDepthField, <<"&">>, <<"commit.policy=">>, CommitPolicy, <<"&">>, <<"rows=">>, Rows, <<"&">>, <<"path.restrictions=">>, PathRestrictions, <<"&">>, <<"property.restrictions=">>, PropertyRestrictions, <<"&">>, <<"primarytypes.restrictions=">>, PrimarytypesRestrictions, <<"&">>, <<"ignored.properties=">>, IgnoredProperties, <<"&">>, <<"used.properties=">>, UsedProperties, <<"&">>, <<"type.mappings=">>, TypeMappings, <<"&">>, <<"property.mappings=">>, PropertyMappings, <<"&">>, <<"collapse.jcrcontent.nodes=">>, CollapseJcrcontentNodes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_solr_osgi_remote_solr_server_conf() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.RemoteSolrServerConfigurationProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"solr.http.url=">>, SolrHttpUrl, <<"&">>, <<"solr.zk.host=">>, SolrZkHost, <<"&">>, <<"solr.collection=">>, SolrCollection, <<"&">>, <<"solr.socket.timeout=">>, SolrSocketTimeout, <<"&">>, <<"solr.connection.timeout=">>, SolrConnectionTimeout, <<"&">>, <<"solr.shards.no=">>, SolrShardsNo, <<"&">>, <<"solr.replication.factor=">>, SolrReplicationFactor, <<"&">>, <<"solr.conf.dir=">>, SolrConfDir, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_query_index_provid() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrQueryIndexProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"query.aggregation=">>, QueryAggregation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_index_solr_osgi_solr_server_provider_se() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.index.solr.osgi.SolrServerProviderService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"server.type=">>, ServerType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_metric_statistics_provider_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.metric.StatisticsProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"providerType=">>, ProviderType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_plugins_observation_change_collector_provider() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_plugins_observation_change_collector_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.plugins.observation.ChangeCollectorProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"maxItems=">>, MaxItems, <<"&">>, <<"maxPathDepth=">>, MaxPathDepth, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_query_query_engine_settings_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_query_query_engine_settings_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.query.QueryEngineSettingsService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"queryLimitInMemory=">>, QueryLimitInMemory, <<"&">>, <<"queryLimitReads=">>, QueryLimitReads, <<"&">>, <<"queryFailTraversal=">>, QueryFailTraversal, <<"&">>, <<"fastQuerySize=">>, FastQuerySize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_authentication_authentication_config() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_authentication_authentication_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.AuthenticationConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.jackrabbit.oak.authentication.appName=">>, OrgApacheJackrabbitOakAuthenticationAppName, <<"&">>, <<"org.apache.jackrabbit.oak.authentication.configSpiName=">>, OrgApacheJackrabbitOakAuthenticationConfigSpiName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_authentication_ldap_impl_ldap_identi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.ldap.impl.LdapIdentityProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"provider.name=">>, ProviderName, <<"&">>, <<"host.name=">>, HostName, <<"&">>, <<"host.port=">>, HostPort, <<"&">>, <<"host.ssl=">>, HostSsl, <<"&">>, <<"host.tls=">>, HostTls, <<"&">>, <<"host.noCertCheck=">>, HostNoCertCheck, <<"&">>, <<"bind.dn=">>, BindDn, <<"&">>, <<"bind.password=">>, BindPassword, <<"&">>, <<"searchTimeout=">>, SearchTimeout, <<"&">>, <<"adminPool.maxActive=">>, AdminPoolMaxActive, <<"&">>, <<"adminPool.lookupOnValidate=">>, AdminPoolLookupOnValidate, <<"&">>, <<"userPool.maxActive=">>, UserPoolMaxActive, <<"&">>, <<"userPool.lookupOnValidate=">>, UserPoolLookupOnValidate, <<"&">>, <<"user.baseDN=">>, UserBaseDN, <<"&">>, <<"user.objectclass=">>, UserObjectclass, <<"&">>, <<"user.idAttribute=">>, UserIdAttribute, <<"&">>, <<"user.extraFilter=">>, UserExtraFilter, <<"&">>, <<"user.makeDnPath=">>, UserMakeDnPath, <<"&">>, <<"group.baseDN=">>, GroupBaseDN, <<"&">>, <<"group.objectclass=">>, GroupObjectclass, <<"&">>, <<"group.nameAttribute=">>, GroupNameAttribute, <<"&">>, <<"group.extraFilter=">>, GroupExtraFilter, <<"&">>, <<"group.makeDnPath=">>, GroupMakeDnPath, <<"&">>, <<"group.memberAttribute=">>, GroupMemberAttribute, <<"&">>, <<"useUidForExtId=">>, UseUidForExtId, <<"&">>, <<"customattributes=">>, Customattributes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_authentication_token_token_configura() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_authentication_token_token_configura() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.authentication.token.TokenConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"tokenExpiration=">>, TokenExpiration, <<"&">>, <<"tokenLength=">>, TokenLength, <<"&">>, <<"tokenRefresh=">>, TokenRefresh, <<"&">>, <<"tokenCleanupThreshold=">>, TokenCleanupThreshold, <<"&">>, <<"passwordHashAlgorithm=">>, PasswordHashAlgorithm, <<"&">>, <<"passwordHashIterations=">>, PasswordHashIterations, <<"&">>, <<"passwordSaltSize=">>, PasswordSaltSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_authorization_authorization_configur() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_authorization_authorization_configur() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"permissionsJr2=">>, PermissionsJr2, <<"&">>, <<"importBehavior=">>, ImportBehavior, <<"&">>, <<"readPaths=">>, ReadPaths, <<"&">>, <<"administrativePrincipals=">>, AdministrativePrincipals, <<"&">>, <<"configurationRanking=">>, ConfigurationRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_internal_security_provider_registrati() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_internal_security_provider_registrati() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.internal.SecurityProviderRegistration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"requiredServicePids=">>, RequiredServicePids, <<"&">>, <<"authorizationCompositionType=">>, AuthorizationCompositionType, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_user_random_authorizable_node_name() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_user_random_authorizable_node_name() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.user.RandomAuthorizableNodeName"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"length=">>, Length, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_security_user_user_configuration_impl() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_security_user_user_configuration_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.security.user.UserConfigurationImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"usersPath=">>, UsersPath, <<"&">>, <<"groupsPath=">>, GroupsPath, <<"&">>, <<"systemRelativePath=">>, SystemRelativePath, <<"&">>, <<"defaultDepth=">>, DefaultDepth, <<"&">>, <<"importBehavior=">>, ImportBehavior, <<"&">>, <<"passwordHashAlgorithm=">>, PasswordHashAlgorithm, <<"&">>, <<"passwordHashIterations=">>, PasswordHashIterations, <<"&">>, <<"passwordSaltSize=">>, PasswordSaltSize, <<"&">>, <<"omitAdminPw=">>, OmitAdminPw, <<"&">>, <<"supportAutoSave=">>, SupportAutoSave, <<"&">>, <<"passwordMaxAge=">>, PasswordMaxAge, <<"&">>, <<"initialPasswordChange=">>, InitialPasswordChange, <<"&">>, <<"passwordHistorySize=">>, PasswordHistorySize, <<"&">>, <<"passwordExpiryForAdmin=">>, PasswordExpiryForAdmin, <<"&">>, <<"cacheExpiration=">>, CacheExpiration, <<"&">>, <<"enableRFC7613UsercaseMappedProfile=">>, EnableRFC7613UsercaseMappedProfile, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.segment.azure.AzureSegmentStoreService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"accountName=">>, AccountName, <<"&">>, <<"containerName=">>, ContainerName, <<"&">>, <<"accessKey=">>, AccessKey, <<"&">>, <<"rootPath=">>, RootPath, <<"&">>, <<"connectionURL=">>, ConnectionURL, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_segment_segment_node_store_factory() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_segment_segment_node_store_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"repository.home=">>, RepositoryHome, <<"&">>, <<"tarmk.mode=">>, TarmkMode, <<"&">>, <<"tarmk.size=">>, TarmkSize, <<"&">>, <<"segmentCache.size=">>, SegmentCacheSize, <<"&">>, <<"stringCache.size=">>, StringCacheSize, <<"&">>, <<"templateCache.size=">>, TemplateCacheSize, <<"&">>, <<"stringDeduplicationCache.size=">>, StringDeduplicationCacheSize, <<"&">>, <<"templateDeduplicationCache.size=">>, TemplateDeduplicationCacheSize, <<"&">>, <<"nodeDeduplicationCache.size=">>, NodeDeduplicationCacheSize, <<"&">>, <<"pauseCompaction=">>, PauseCompaction, <<"&">>, <<"compaction.retryCount=">>, CompactionRetryCount, <<"&">>, <<"compaction.force.timeout=">>, CompactionForceTimeout, <<"&">>, <<"compaction.sizeDeltaEstimation=">>, CompactionSizeDeltaEstimation, <<"&">>, <<"compaction.disableEstimation=">>, CompactionDisableEstimation, <<"&">>, <<"compaction.retainedGenerations=">>, CompactionRetainedGenerations, <<"&">>, <<"compaction.memoryThreshold=">>, CompactionMemoryThreshold, <<"&">>, <<"compaction.progressLog=">>, CompactionProgressLog, <<"&">>, <<"standby=">>, Standby, <<"&">>, <<"customBlobStore=">>, CustomBlobStore, <<"&">>, <<"customSegmentStore=">>, CustomSegmentStore, <<"&">>, <<"splitPersistence=">>, SplitPersistence, <<"&">>, <<"repository.backup.dir=">>, RepositoryBackupDir, <<"&">>, <<"blobGcMaxAgeInSecs=">>, BlobGcMaxAgeInSecs, <<"&">>, <<"blobTrackSnapshotIntervalInSecs=">>, BlobTrackSnapshotIntervalInSecs, <<"&">>, <<"role=">>, Role, <<"&">>, <<"registerDescriptors=">>, RegisterDescriptors, <<"&">>, <<"dispatchChanges=">>, DispatchChanges, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_segment_segment_node_store_monitor_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreMonitorService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"commitsTrackerWriterGroups=">>, CommitsTrackerWriterGroups, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_segment_segment_node_store_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_segment_segment_node_store_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.segment.SegmentNodeStoreService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"repository.home=">>, RepositoryHome, <<"&">>, <<"tarmk.mode=">>, TarmkMode, <<"&">>, <<"tarmk.size=">>, TarmkSize, <<"&">>, <<"segmentCache.size=">>, SegmentCacheSize, <<"&">>, <<"stringCache.size=">>, StringCacheSize, <<"&">>, <<"templateCache.size=">>, TemplateCacheSize, <<"&">>, <<"stringDeduplicationCache.size=">>, StringDeduplicationCacheSize, <<"&">>, <<"templateDeduplicationCache.size=">>, TemplateDeduplicationCacheSize, <<"&">>, <<"nodeDeduplicationCache.size=">>, NodeDeduplicationCacheSize, <<"&">>, <<"pauseCompaction=">>, PauseCompaction, <<"&">>, <<"compaction.retryCount=">>, CompactionRetryCount, <<"&">>, <<"compaction.force.timeout=">>, CompactionForceTimeout, <<"&">>, <<"compaction.sizeDeltaEstimation=">>, CompactionSizeDeltaEstimation, <<"&">>, <<"compaction.disableEstimation=">>, CompactionDisableEstimation, <<"&">>, <<"compaction.retainedGenerations=">>, CompactionRetainedGenerations, <<"&">>, <<"compaction.memoryThreshold=">>, CompactionMemoryThreshold, <<"&">>, <<"compaction.progressLog=">>, CompactionProgressLog, <<"&">>, <<"standby=">>, Standby, <<"&">>, <<"customBlobStore=">>, CustomBlobStore, <<"&">>, <<"customSegmentStore=">>, CustomSegmentStore, <<"&">>, <<"splitPersistence=">>, SplitPersistence, <<"&">>, <<"repository.backup.dir=">>, RepositoryBackupDir, <<"&">>, <<"blobGcMaxAgeInSecs=">>, BlobGcMaxAgeInSecs, <<"&">>, <<"blobTrackSnapshotIntervalInSecs=">>, BlobTrackSnapshotIntervalInSecs, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_segment_standby_store_standby_store_service() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_segment_standby_store_standby_store_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.segment.standby.store.StandbyStoreService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.installer.configuration.persist=">>, OrgApacheSlingInstallerConfigurationPersist, <<"&">>, <<"mode=">>, Mode, <<"&">>, <<"port=">>, Port, <<"&">>, <<"primary.host=">>, PrimaryHost, <<"&">>, <<"interval=">>, Interval, <<"&">>, <<"primary.allowed-client-ip-ranges=">>, PrimaryAllowedClientIpRanges, <<"&">>, <<"secure=">>, Secure, <<"&">>, <<"standby.readtimeout=">>, StandbyReadtimeout, <<"&">>, <<"standby.autoclean=">>, StandbyAutoclean, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.DefaultSyncHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"handler.name=">>, HandlerName, <<"&">>, <<"user.expirationTime=">>, UserExpirationTime, <<"&">>, <<"user.autoMembership=">>, UserAutoMembership, <<"&">>, <<"user.propertyMapping=">>, UserPropertyMapping, <<"&">>, <<"user.pathPrefix=">>, UserPathPrefix, <<"&">>, <<"user.membershipExpTime=">>, UserMembershipExpTime, <<"&">>, <<"user.membershipNestingDepth=">>, UserMembershipNestingDepth, <<"&">>, <<"user.dynamicMembership=">>, UserDynamicMembership, <<"&">>, <<"user.disableMissing=">>, UserDisableMissing, <<"&">>, <<"group.expirationTime=">>, GroupExpirationTime, <<"&">>, <<"group.autoMembership=">>, GroupAutoMembership, <<"&">>, <<"group.propertyMapping=">>, GroupPropertyMapping, <<"&">>, <<"group.pathPrefix=">>, GroupPathPrefix, <<"&">>, <<"enableRFC7613UsercaseMappedProfile=">>, EnableRFC7613UsercaseMappedProfile, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_ex() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.ExternalLoginModuleFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jaas.ranking=">>, JaasRanking, <<"&">>, <<"jaas.controlFlag=">>, JaasControlFlag, <<"&">>, <<"jaas.realmName=">>, JaasRealmName, <<"&">>, <<"idp.name=">>, IdpName, <<"&">>, <<"sync.handlerName=">>, SyncHandlerName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_spi_security_authentication_external_impl_pr() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authentication.external.impl.principal.ExternalPrincipalConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"protectExternalId=">>, ProtectExternalId, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"cugSupportedPaths=">>, CugSupportedPaths, <<"&">>, <<"cugEnabled=">>, CugEnabled, <<"&">>, <<"configurationRanking=">>, ConfigurationRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.authorization.cug.impl.CugExcludeImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"principalNames=">>, PrincipalNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable() ->
  openapi_utils:response().
org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.oak.spi.security.user.action.DefaultAuthorizableActionProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabledActions=">>, EnabledActions, <<"&">>, <<"userPrivilegeNames=">>, UserPrivilegeNames, <<"&">>, <<"groupPrivilegeNames=">>, GroupPrivilegeNames, <<"&">>, <<"constraint=">>, Constraint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_vault_packaging_impl_packaging_impl() ->
  openapi_utils:response().
org_apache_jackrabbit_vault_packaging_impl_packaging_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.vault.packaging.impl.PackagingImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"packageRoots=">>, PackageRoots, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry() ->
  openapi_utils:response().
org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.jackrabbit.vault.packaging.registry.impl.FSPackageRegistry"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"homePath=">>, HomePath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_auth_core_impl_logout_servlet() ->
  openapi_utils:response().
org_apache_sling_auth_core_impl_logout_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.auth.core.impl.LogoutServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.methods=">>, SlingServletMethods, <<"&">>, <<"sling.servlet.paths=">>, SlingServletPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_impl_configuration_bindings_value_provider() ->
  openapi_utils:response().
org_apache_sling_caconfig_impl_configuration_bindings_value_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationBindingsValueProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_impl_configuration_resolver_impl() ->
  openapi_utils:response().
org_apache_sling_caconfig_impl_configuration_resolver_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.impl.ConfigurationResolverImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"configBucketNames=">>, ConfigBucketNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra() ->
  openapi_utils:response().
org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationInheritanceStrategy"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"configPropertyInheritancePropertyNames=">>, ConfigPropertyInheritancePropertyNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra() ->
  openapi_utils:response().
org_apache_sling_caconfig_impl_def_default_configuration_persistence_stra() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.impl.def.DefaultConfigurationPersistenceStrategy"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi() ->
  openapi_utils:response().
org_apache_sling_caconfig_impl_override_osgi_configuration_override_provi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.impl.override.OsgiConfigurationOverrideProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"description=">>, Description, <<"&">>, <<"overrides=">>, Overrides, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_impl_override_system_property_configuration_ove() ->
  openapi_utils:response().
org_apache_sling_caconfig_impl_override_system_property_configuration_ove() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.impl.override.SystemPropertyConfigurationOverrideProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_management_impl_configuration_management_setti() ->
  openapi_utils:response().
org_apache_sling_caconfig_management_impl_configuration_management_setti() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.management.impl.ConfigurationManagementSettingsImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"ignorePropertyNameRegex=">>, IgnorePropertyNameRegex, <<"&">>, <<"configCollectionPropertiesResourceNames=">>, ConfigCollectionPropertiesResourceNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_resource_impl_def_default_configuration_resour() ->
  openapi_utils:response().
org_apache_sling_caconfig_resource_impl_def_default_configuration_resour() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultConfigurationResourceResolvingStrategy"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"configPath=">>, ConfigPath, <<"&">>, <<"fallbackPaths=">>, FallbackPaths, <<"&">>, <<"configCollectionInheritancePropertyNames=">>, ConfigCollectionInheritancePropertyNames, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy() ->
  openapi_utils:response().
org_apache_sling_caconfig_resource_impl_def_default_context_path_strategy() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.caconfig.resource.impl.def.DefaultContextPathStrategy"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"configRefResourceNames=">>, ConfigRefResourceNames, <<"&">>, <<"configRefPropertyNames=">>, ConfigRefPropertyNames, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_html_internal_tagsoup_html_parser() ->
  openapi_utils:response().
org_apache_sling_commons_html_internal_tagsoup_html_parser() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.html.internal.TagsoupHtmlParser"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"parser.features=">>, ParserFeatures, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_log_log_manager() ->
  openapi_utils:response().
org_apache_sling_commons_log_log_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.log.LogManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.commons.log.level=">>, OrgApacheSlingCommonsLogLevel, <<"&">>, <<"org.apache.sling.commons.log.file=">>, OrgApacheSlingCommonsLogFile, <<"&">>, <<"org.apache.sling.commons.log.file.number=">>, OrgApacheSlingCommonsLogFileNumber, <<"&">>, <<"org.apache.sling.commons.log.file.size=">>, OrgApacheSlingCommonsLogFileSize, <<"&">>, <<"org.apache.sling.commons.log.pattern=">>, OrgApacheSlingCommonsLogPattern, <<"&">>, <<"org.apache.sling.commons.log.configurationFile=">>, OrgApacheSlingCommonsLogConfigurationFile, <<"&">>, <<"org.apache.sling.commons.log.packagingDataEnabled=">>, OrgApacheSlingCommonsLogPackagingDataEnabled, <<"&">>, <<"org.apache.sling.commons.log.maxCallerDataDepth=">>, OrgApacheSlingCommonsLogMaxCallerDataDepth, <<"&">>, <<"org.apache.sling.commons.log.maxOldFileCountInDump=">>, OrgApacheSlingCommonsLogMaxOldFileCountInDump, <<"&">>, <<"org.apache.sling.commons.log.numOfLines=">>, OrgApacheSlingCommonsLogNumOfLines, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_log_log_manager_factory_config() ->
  openapi_utils:response().
org_apache_sling_commons_log_log_manager_factory_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.config"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.commons.log.level=">>, OrgApacheSlingCommonsLogLevel, <<"&">>, <<"org.apache.sling.commons.log.file=">>, OrgApacheSlingCommonsLogFile, <<"&">>, <<"org.apache.sling.commons.log.pattern=">>, OrgApacheSlingCommonsLogPattern, <<"&">>, <<"org.apache.sling.commons.log.names=">>, OrgApacheSlingCommonsLogNames, <<"&">>, <<"org.apache.sling.commons.log.additiv=">>, OrgApacheSlingCommonsLogAdditiv, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_log_log_manager_factory_writer() ->
  openapi_utils:response().
org_apache_sling_commons_log_log_manager_factory_writer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.log.LogManager.factory.writer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.commons.log.file=">>, OrgApacheSlingCommonsLogFile, <<"&">>, <<"org.apache.sling.commons.log.file.number=">>, OrgApacheSlingCommonsLogFileNumber, <<"&">>, <<"org.apache.sling.commons.log.file.size=">>, OrgApacheSlingCommonsLogFileSize, <<"&">>, <<"org.apache.sling.commons.log.file.buffered=">>, OrgApacheSlingCommonsLogFileBuffered, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_metrics_internal_log_reporter() ->
  openapi_utils:response().
org_apache_sling_commons_metrics_internal_log_reporter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.metrics.internal.LogReporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"period=">>, Period, <<"&">>, <<"timeUnit=">>, TimeUnit, <<"&">>, <<"level=">>, Level, <<"&">>, <<"loggerName=">>, LoggerName, <<"&">>, <<"prefix=">>, Prefix, <<"&">>, <<"pattern=">>, Pattern, <<"&">>, <<"registryName=">>, RegistryName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter() ->
  openapi_utils:response().
org_apache_sling_commons_metrics_rrd4j_impl_codahale_metrics_reporter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.metrics.rrd4j.impl.CodahaleMetricsReporter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"datasources=">>, Datasources, <<"&">>, <<"step=">>, Step, <<"&">>, <<"archives=">>, Archives, <<"&">>, <<"path=">>, Path, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_mime_internal_mime_type_service_impl() ->
  openapi_utils:response().
org_apache_sling_commons_mime_internal_mime_type_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.mime.internal.MimeTypeServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"mime.types=">>, MimeTypes, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_scheduler_impl_quartz_scheduler() ->
  openapi_utils:response().
org_apache_sling_commons_scheduler_impl_quartz_scheduler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.scheduler.impl.QuartzScheduler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"poolName=">>, PoolName, <<"&">>, <<"allowedPoolNames=">>, AllowedPoolNames, <<"&">>, <<"scheduler.useleaderforsingle=">>, SchedulerUseleaderforsingle, <<"&">>, <<"metrics.filters=">>, MetricsFilters, <<"&">>, <<"slowThresholdMillis=">>, SlowThresholdMillis, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_scheduler_impl_scheduler_health_check() ->
  openapi_utils:response().
org_apache_sling_commons_scheduler_impl_scheduler_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.scheduler.impl.SchedulerHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"max.quartzJob.duration.acceptable=">>, MaxQuartzJobDurationAcceptable, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_commons_threads_impl_default_thread_pool_factory() ->
  openapi_utils:response().
org_apache_sling_commons_threads_impl_default_thread_pool_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.commons.threads.impl.DefaultThreadPool.factory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"minPoolSize=">>, MinPoolSize, <<"&">>, <<"maxPoolSize=">>, MaxPoolSize, <<"&">>, <<"queueSize=">>, QueueSize, <<"&">>, <<"maxThreadAge=">>, MaxThreadAge, <<"&">>, <<"keepAliveTime=">>, KeepAliveTime, <<"&">>, <<"blockPolicy=">>, BlockPolicy, <<"&">>, <<"shutdownGraceful=">>, ShutdownGraceful, <<"&">>, <<"daemon=">>, Daemon, <<"&">>, <<"shutdownWaitTime=">>, ShutdownWaitTime, <<"&">>, <<"priority=">>, Priority, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_datasource_data_source_factory() ->
  openapi_utils:response().
org_apache_sling_datasource_data_source_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.datasource.DataSourceFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"datasource.name=">>, DatasourceName, <<"&">>, <<"datasource.svc.prop.name=">>, DatasourceSvcPropName, <<"&">>, <<"driverClassName=">>, DriverClassName, <<"&">>, <<"url=">>, Url, <<"&">>, <<"username=">>, Username, <<"&">>, <<"password=">>, Password, <<"&">>, <<"defaultAutoCommit=">>, DefaultAutoCommit, <<"&">>, <<"defaultReadOnly=">>, DefaultReadOnly, <<"&">>, <<"defaultTransactionIsolation=">>, DefaultTransactionIsolation, <<"&">>, <<"defaultCatalog=">>, DefaultCatalog, <<"&">>, <<"maxActive=">>, MaxActive, <<"&">>, <<"maxIdle=">>, MaxIdle, <<"&">>, <<"minIdle=">>, MinIdle, <<"&">>, <<"initialSize=">>, InitialSize, <<"&">>, <<"maxWait=">>, MaxWait, <<"&">>, <<"maxAge=">>, MaxAge, <<"&">>, <<"testOnBorrow=">>, TestOnBorrow, <<"&">>, <<"testOnReturn=">>, TestOnReturn, <<"&">>, <<"testWhileIdle=">>, TestWhileIdle, <<"&">>, <<"validationQuery=">>, ValidationQuery, <<"&">>, <<"validationQueryTimeout=">>, ValidationQueryTimeout, <<"&">>, <<"timeBetweenEvictionRunsMillis=">>, TimeBetweenEvictionRunsMillis, <<"&">>, <<"minEvictableIdleTimeMillis=">>, MinEvictableIdleTimeMillis, <<"&">>, <<"connectionProperties=">>, ConnectionProperties, <<"&">>, <<"initSQL=">>, InitSQL, <<"&">>, <<"jdbcInterceptors=">>, JdbcInterceptors, <<"&">>, <<"validationInterval=">>, ValidationInterval, <<"&">>, <<"logValidationErrors=">>, LogValidationErrors, <<"&">>, <<"datasource.svc.properties=">>, DatasourceSvcProperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_datasource_jndi_data_source_factory() ->
  openapi_utils:response().
org_apache_sling_datasource_jndi_data_source_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.datasource.JNDIDataSourceFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"datasource.name=">>, DatasourceName, <<"&">>, <<"datasource.svc.prop.name=">>, DatasourceSvcPropName, <<"&">>, <<"datasource.jndi.name=">>, DatasourceJndiName, <<"&">>, <<"jndi.properties=">>, JndiProperties, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_discovery_oak_config() ->
  openapi_utils:response().
org_apache_sling_discovery_oak_config() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.discovery.oak.Config"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"connectorPingTimeout=">>, ConnectorPingTimeout, <<"&">>, <<"connectorPingInterval=">>, ConnectorPingInterval, <<"&">>, <<"discoveryLiteCheckInterval=">>, DiscoveryLiteCheckInterval, <<"&">>, <<"clusterSyncServiceTimeout=">>, ClusterSyncServiceTimeout, <<"&">>, <<"clusterSyncServiceInterval=">>, ClusterSyncServiceInterval, <<"&">>, <<"enableSyncToken=">>, EnableSyncToken, <<"&">>, <<"minEventDelay=">>, MinEventDelay, <<"&">>, <<"socketConnectTimeout=">>, SocketConnectTimeout, <<"&">>, <<"soTimeout=">>, SoTimeout, <<"&">>, <<"topologyConnectorUrls=">>, TopologyConnectorUrls, <<"&">>, <<"topologyConnectorWhitelist=">>, TopologyConnectorWhitelist, <<"&">>, <<"autoStopLocalLoopEnabled=">>, AutoStopLocalLoopEnabled, <<"&">>, <<"gzipConnectorRequestsEnabled=">>, GzipConnectorRequestsEnabled, <<"&">>, <<"hmacEnabled=">>, HmacEnabled, <<"&">>, <<"enableEncryption=">>, EnableEncryption, <<"&">>, <<"sharedKey=">>, SharedKey, <<"&">>, <<"hmacSharedKeyTTL=">>, HmacSharedKeyTTL, <<"&">>, <<"backoffStandbyFactor=">>, BackoffStandbyFactor, <<"&">>, <<"backoffStableFactor=">>, BackoffStableFactor, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_discovery_oak_synchronized_clocks_health_check() ->
  openapi_utils:response().
org_apache_sling_discovery_oak_synchronized_clocks_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.discovery.oak.SynchronizedClocksHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto() ->
  openapi_utils:response().
org_apache_sling_distribution_agent_impl_forward_distribution_agent_facto() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.agent.impl.ForwardDistributionAgentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"title=">>, Title, <<"&">>, <<"details=">>, Details, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"log.level=">>, LogLevel, <<"&">>, <<"allowed.roots=">>, AllowedRoots, <<"&">>, <<"queue.processing.enabled=">>, QueueProcessingEnabled, <<"&">>, <<"packageImporter.endpoints=">>, PackageImporterEndpoints, <<"&">>, <<"passiveQueues=">>, PassiveQueues, <<"&">>, <<"priorityQueues=">>, PriorityQueues, <<"&">>, <<"retry.strategy=">>, RetryStrategy, <<"&">>, <<"retry.attempts=">>, RetryAttempts, <<"&">>, <<"requestAuthorizationStrategy.target=">>, RequestAuthorizationStrategyTarget, <<"&">>, <<"transportSecretProvider.target=">>, TransportSecretProviderTarget, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>, <<"triggers.target=">>, TriggersTarget, <<"&">>, <<"queue.provider=">>, QueueProvider, <<"&">>, <<"async.delivery=">>, AsyncDelivery, <<"&">>, <<"http.conn.timeout=">>, HttpConnTimeout, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_agent_impl_privilege_distribution_request_a() ->
  openapi_utils:response().
org_apache_sling_distribution_agent_impl_privilege_distribution_request_a() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.agent.impl.PrivilegeDistributionRequestAuthorizationStrategyFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"jcrPrivilege=">>, JcrPrivilege, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory() ->
  openapi_utils:response().
org_apache_sling_distribution_agent_impl_queue_distribution_agent_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.agent.impl.QueueDistributionAgentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"title=">>, Title, <<"&">>, <<"details=">>, Details, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"log.level=">>, LogLevel, <<"&">>, <<"allowed.roots=">>, AllowedRoots, <<"&">>, <<"requestAuthorizationStrategy.target=">>, RequestAuthorizationStrategyTarget, <<"&">>, <<"queueProviderFactory.target=">>, QueueProviderFactoryTarget, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>, <<"triggers.target=">>, TriggersTarget, <<"&">>, <<"priorityQueues=">>, PriorityQueues, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto() ->
  openapi_utils:response().
org_apache_sling_distribution_agent_impl_reverse_distribution_agent_facto() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.agent.impl.ReverseDistributionAgentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"title=">>, Title, <<"&">>, <<"details=">>, Details, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"log.level=">>, LogLevel, <<"&">>, <<"queue.processing.enabled=">>, QueueProcessingEnabled, <<"&">>, <<"packageExporter.endpoints=">>, PackageExporterEndpoints, <<"&">>, <<"pull.items=">>, PullItems, <<"&">>, <<"http.conn.timeout=">>, HttpConnTimeout, <<"&">>, <<"requestAuthorizationStrategy.target=">>, RequestAuthorizationStrategyTarget, <<"&">>, <<"transportSecretProvider.target=">>, TransportSecretProviderTarget, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>, <<"triggers.target=">>, TriggersTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor() ->
  openapi_utils:response().
org_apache_sling_distribution_agent_impl_simple_distribution_agent_factor() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.agent.impl.SimpleDistributionAgentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"title=">>, Title, <<"&">>, <<"details=">>, Details, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"log.level=">>, LogLevel, <<"&">>, <<"queue.processing.enabled=">>, QueueProcessingEnabled, <<"&">>, <<"packageExporter.target=">>, PackageExporterTarget, <<"&">>, <<"packageImporter.target=">>, PackageImporterTarget, <<"&">>, <<"requestAuthorizationStrategy.target=">>, RequestAuthorizationStrategyTarget, <<"&">>, <<"triggers.target=">>, TriggersTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory() ->
  openapi_utils:response().
org_apache_sling_distribution_agent_impl_sync_distribution_agent_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.agent.impl.SyncDistributionAgentFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"title=">>, Title, <<"&">>, <<"details=">>, Details, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"log.level=">>, LogLevel, <<"&">>, <<"queue.processing.enabled=">>, QueueProcessingEnabled, <<"&">>, <<"passiveQueues=">>, PassiveQueues, <<"&">>, <<"packageExporter.endpoints=">>, PackageExporterEndpoints, <<"&">>, <<"packageImporter.endpoints=">>, PackageImporterEndpoints, <<"&">>, <<"retry.strategy=">>, RetryStrategy, <<"&">>, <<"retry.attempts=">>, RetryAttempts, <<"&">>, <<"pull.items=">>, PullItems, <<"&">>, <<"http.conn.timeout=">>, HttpConnTimeout, <<"&">>, <<"requestAuthorizationStrategy.target=">>, RequestAuthorizationStrategyTarget, <<"&">>, <<"transportSecretProvider.target=">>, TransportSecretProviderTarget, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>, <<"triggers.target=">>, TriggersTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_monitor_distribution_queue_health_check() ->
  openapi_utils:response().
org_apache_sling_distribution_monitor_distribution_queue_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.monitor.DistributionQueueHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>, <<"numberOfRetriesAllowed=">>, NumberOfRetriesAllowed, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_packaging_impl_exporter_agent_distributio() ->
  openapi_utils:response().
org_apache_sling_distribution_packaging_impl_exporter_agent_distributio() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.AgentDistributionPackageExporterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"queue=">>, Queue, <<"&">>, <<"drop.invalid.items=">>, DropInvalidItems, <<"&">>, <<"agent.target=">>, AgentTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_packaging_impl_exporter_local_distributio() ->
  openapi_utils:response().
org_apache_sling_distribution_packaging_impl_exporter_local_distributio() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.LocalDistributionPackageExporterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_packaging_impl_exporter_remote_distributi() ->
  openapi_utils:response().
org_apache_sling_distribution_packaging_impl_exporter_remote_distributi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.packaging.impl.exporter.RemoteDistributionPackageExporterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"endpoints=">>, Endpoints, <<"&">>, <<"pull.items=">>, PullItems, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>, <<"transportSecretProvider.target=">>, TransportSecretProviderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_packaging_impl_importer_local_distributio() ->
  openapi_utils:response().
org_apache_sling_distribution_packaging_impl_importer_local_distributio() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.LocalDistributionPackageImporterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"packageBuilder.target=">>, PackageBuilderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_packaging_impl_importer_remote_distributi() ->
  openapi_utils:response().
org_apache_sling_distribution_packaging_impl_importer_remote_distributi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RemoteDistributionPackageImporterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"endpoints=">>, Endpoints, <<"&">>, <<"transportSecretProvider.target=">>, TransportSecretProviderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_packaging_impl_importer_repository_distri() ->
  openapi_utils:response().
org_apache_sling_distribution_packaging_impl_importer_repository_distri() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.packaging.impl.importer.RepositoryDistributionPackageImporterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"service.name=">>, ServiceName, <<"&">>, <<"path=">>, Path, <<"&">>, <<"privilege.name=">>, PrivilegeName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_resources_impl_distribution_configuration() ->
  openapi_utils:response().
org_apache_sling_distribution_resources_impl_distribution_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionConfigurationResourceProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"provider.roots=">>, ProviderRoots, <<"&">>, <<"kind=">>, Kind, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_resources_impl_distribution_service_resour() ->
  openapi_utils:response().
org_apache_sling_distribution_resources_impl_distribution_service_resour() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.resources.impl.DistributionServiceResourceProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"provider.roots=">>, ProviderRoots, <<"&">>, <<"kind=">>, Kind, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_serialization_impl_distribution_package_bu() ->
  openapi_utils:response().
org_apache_sling_distribution_serialization_impl_distribution_package_bu() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.serialization.impl.DistributionPackageBuilderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"type=">>, Type, <<"&">>, <<"format.target=">>, FormatTarget, <<"&">>, <<"tempFsFolder=">>, TempFsFolder, <<"&">>, <<"fileThreshold=">>, FileThreshold, <<"&">>, <<"memoryUnit=">>, MemoryUnit, <<"&">>, <<"useOffHeapMemory=">>, UseOffHeapMemory, <<"&">>, <<"digestAlgorithm=">>, DigestAlgorithm, <<"&">>, <<"monitoringQueueSize=">>, MonitoringQueueSize, <<"&">>, <<"cleanupDelay=">>, CleanupDelay, <<"&">>, <<"package.filters=">>, PackageFilters, <<"&">>, <<"property.filters=">>, PropertyFilters, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_serialization_impl_vlt_vault_distribution() ->
  openapi_utils:response().
org_apache_sling_distribution_serialization_impl_vlt_vault_distribution() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.serialization.impl.vlt.VaultDistributionPackageBuilderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"type=">>, Type, <<"&">>, <<"importMode=">>, ImportMode, <<"&">>, <<"aclHandling=">>, AclHandling, <<"&">>, <<"package.roots=">>, PackageRoots, <<"&">>, <<"package.filters=">>, PackageFilters, <<"&">>, <<"property.filters=">>, PropertyFilters, <<"&">>, <<"tempFsFolder=">>, TempFsFolder, <<"&">>, <<"useBinaryReferences=">>, UseBinaryReferences, <<"&">>, <<"autoSaveThreshold=">>, AutoSaveThreshold, <<"&">>, <<"cleanupDelay=">>, CleanupDelay, <<"&">>, <<"fileThreshold=">>, FileThreshold, <<"&">>, <<"MEGA_BYTES=">>, MEGABYTES, <<"&">>, <<"useOffHeapMemory=">>, UseOffHeapMemory, <<"&">>, <<"digestAlgorithm=">>, DigestAlgorithm, <<"&">>, <<"monitoringQueueSize=">>, MonitoringQueueSize, <<"&">>, <<"pathsMapping=">>, PathsMapping, <<"&">>, <<"strictImport=">>, StrictImport, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_transport_impl_user_credentials_distributi() ->
  openapi_utils:response().
org_apache_sling_distribution_transport_impl_user_credentials_distributi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.transport.impl.UserCredentialsDistributionTransportSecretProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"username=">>, Username, <<"&">>, <<"password=">>, Password, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_trigger_impl_distribution_event_distribute() ->
  openapi_utils:response().
org_apache_sling_distribution_trigger_impl_distribution_event_distribute() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.trigger.impl.DistributionEventDistributeDistributionTriggerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"path=">>, Path, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger() ->
  openapi_utils:response().
org_apache_sling_distribution_trigger_impl_jcr_event_distribution_trigger() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.trigger.impl.JcrEventDistributionTriggerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"path=">>, Path, <<"&">>, <<"ignoredPathsPatterns=">>, IgnoredPathsPatterns, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"deep=">>, Deep, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi() ->
  openapi_utils:response().
org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.trigger.impl.PersistedJcrEventDistributionTriggerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"path=">>, Path, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>, <<"nuggetsPath=">>, NuggetsPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig() ->
  openapi_utils:response().
org_apache_sling_distribution_trigger_impl_remote_event_distribution_trig() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.trigger.impl.RemoteEventDistributionTriggerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"endpoint=">>, Endpoint, <<"&">>, <<"transportSecretProvider.target=">>, TransportSecretProviderTarget, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr() ->
  openapi_utils:response().
org_apache_sling_distribution_trigger_impl_resource_event_distribution_tr() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ResourceEventDistributionTriggerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"path=">>, Path, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge() ->
  openapi_utils:response().
org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.distribution.trigger.impl.ScheduledDistributionTriggerFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"path=">>, Path, <<"&">>, <<"seconds=">>, Seconds, <<"&">>, <<"serviceName=">>, ServiceName, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_engine_impl_auth_sling_authenticator() ->
  openapi_utils:response().
org_apache_sling_engine_impl_auth_sling_authenticator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.engine.impl.auth.SlingAuthenticator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"osgi.http.whiteboard.context.select=">>, OsgiHttpWhiteboardContextSelect, <<"&">>, <<"osgi.http.whiteboard.listener=">>, OsgiHttpWhiteboardListener, <<"&">>, <<"auth.sudo.cookie=">>, AuthSudoCookie, <<"&">>, <<"auth.sudo.parameter=">>, AuthSudoParameter, <<"&">>, <<"auth.annonymous=">>, AuthAnnonymous, <<"&">>, <<"sling.auth.requirements=">>, SlingAuthRequirements, <<"&">>, <<"sling.auth.anonymous.user=">>, SlingAuthAnonymousUser, <<"&">>, <<"sling.auth.anonymous.password=">>, SlingAuthAnonymousPassword, <<"&">>, <<"auth.http=">>, AuthHttp, <<"&">>, <<"auth.http.realm=">>, AuthHttpRealm, <<"&">>, <<"auth.uri.suffix=">>, AuthUriSuffix, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter() ->
  openapi_utils:response().
org_apache_sling_engine_impl_debug_request_progress_tracker_log_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.engine.impl.debug.RequestProgressTrackerLogFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"extensions=">>, Extensions, <<"&">>, <<"minDurationMs=">>, MinDurationMs, <<"&">>, <<"maxDurationMs=">>, MaxDurationMs, <<"&">>, <<"compactLogFormat=">>, CompactLogFormat, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_engine_impl_log_request_logger() ->
  openapi_utils:response().
org_apache_sling_engine_impl_log_request_logger() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLogger"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"request.log.output=">>, RequestLogOutput, <<"&">>, <<"request.log.outputtype=">>, RequestLogOutputtype, <<"&">>, <<"request.log.enabled=">>, RequestLogEnabled, <<"&">>, <<"access.log.output=">>, AccessLogOutput, <<"&">>, <<"access.log.outputtype=">>, AccessLogOutputtype, <<"&">>, <<"access.log.enabled=">>, AccessLogEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_engine_impl_log_request_logger_service() ->
  openapi_utils:response().
org_apache_sling_engine_impl_log_request_logger_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.engine.impl.log.RequestLoggerService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"request.log.service.format=">>, RequestLogServiceFormat, <<"&">>, <<"request.log.service.output=">>, RequestLogServiceOutput, <<"&">>, <<"request.log.service.outputtype=">>, RequestLogServiceOutputtype, <<"&">>, <<"request.log.service.onentry=">>, RequestLogServiceOnentry, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_engine_impl_sling_main_servlet() ->
  openapi_utils:response().
org_apache_sling_engine_impl_sling_main_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.engine.impl.SlingMainServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.max.calls=">>, SlingMaxCalls, <<"&">>, <<"sling.max.inclusions=">>, SlingMaxInclusions, <<"&">>, <<"sling.trace.allow=">>, SlingTraceAllow, <<"&">>, <<"sling.max.record.requests=">>, SlingMaxRecordRequests, <<"&">>, <<"sling.store.pattern.requests=">>, SlingStorePatternRequests, <<"&">>, <<"sling.serverinfo=">>, SlingServerinfo, <<"&">>, <<"sling.additional.response.headers=">>, SlingAdditionalResponseHeaders, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_engine_parameters() ->
  openapi_utils:response().
org_apache_sling_engine_parameters() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.engine.parameters"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.default.parameter.encoding=">>, SlingDefaultParameterEncoding, <<"&">>, <<"sling.default.max.parameters=">>, SlingDefaultMaxParameters, <<"&">>, <<"file.location=">>, FileLocation, <<"&">>, <<"file.threshold=">>, FileThreshold, <<"&">>, <<"file.max=">>, FileMax, <<"&">>, <<"request.max=">>, RequestMax, <<"&">>, <<"sling.default.parameter.checkForAdditionalContainerParameters=">>, SlingDefaultParameterCheckForAdditionalContainerParameters, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_event_impl_eventing_thread_pool() ->
  openapi_utils:response().
org_apache_sling_event_impl_eventing_thread_pool() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.event.impl.EventingThreadPool"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"minPoolSize=">>, MinPoolSize, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_event_impl_jobs_default_job_manager() ->
  openapi_utils:response().
org_apache_sling_event_impl_jobs_default_job_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.event.impl.jobs.DefaultJobManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"queue.priority=">>, QueuePriority, <<"&">>, <<"queue.retries=">>, QueueRetries, <<"&">>, <<"queue.retrydelay=">>, QueueRetrydelay, <<"&">>, <<"queue.maxparallel=">>, QueueMaxparallel, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_event_impl_jobs_jcr_persistence_handler() ->
  openapi_utils:response().
org_apache_sling_event_impl_jobs_jcr_persistence_handler() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.event.impl.jobs.jcr.PersistenceHandler"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"job.consumermanager.disableDistribution=">>, JobConsumermanagerDisableDistribution, <<"&">>, <<"startup.delay=">>, StartupDelay, <<"&">>, <<"cleanup.period=">>, CleanupPeriod, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_event_impl_jobs_job_consumer_manager() ->
  openapi_utils:response().
org_apache_sling_event_impl_jobs_job_consumer_manager() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.event.impl.jobs.JobConsumerManager"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.installer.configuration.persist=">>, OrgApacheSlingInstallerConfigurationPersist, <<"&">>, <<"job.consumermanager.whitelist=">>, JobConsumermanagerWhitelist, <<"&">>, <<"job.consumermanager.blacklist=">>, JobConsumermanagerBlacklist, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_event_jobs_queue_configuration() ->
  openapi_utils:response().
org_apache_sling_event_jobs_queue_configuration() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.event.jobs.QueueConfiguration"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"queue.name=">>, QueueName, <<"&">>, <<"queue.topics=">>, QueueTopics, <<"&">>, <<"queue.type=">>, QueueType, <<"&">>, <<"queue.priority=">>, QueuePriority, <<"&">>, <<"queue.retries=">>, QueueRetries, <<"&">>, <<"queue.retrydelay=">>, QueueRetrydelay, <<"&">>, <<"queue.maxparallel=">>, QueueMaxparallel, <<"&">>, <<"queue.keepJobs=">>, QueueKeepJobs, <<"&">>, <<"queue.preferRunOnCreationInstance=">>, QueuePreferRunOnCreationInstance, <<"&">>, <<"queue.threadPoolSize=">>, QueueThreadPoolSize, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w() ->
  openapi_utils:response().
org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.extensions.webconsolesecurityprovider.internal.SlingWebConsoleSecurityProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"users=">>, Users, <<"&">>, <<"groups=">>, Groups, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_featureflags_feature() ->
  openapi_utils:response().
org_apache_sling_featureflags_feature() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.featureflags.Feature"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"description=">>, Description, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_featureflags_impl_configured_feature() ->
  openapi_utils:response().
org_apache_sling_featureflags_impl_configured_feature() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.featureflags.impl.ConfiguredFeature"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"name=">>, Name, <<"&">>, <<"description=">>, Description, <<"&">>, <<"enabled=">>, Enabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hapi_impl_h_api_util_impl() ->
  openapi_utils:response().
org_apache_sling_hapi_impl_h_api_util_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hapi.impl.HApiUtilImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.hapi.tools.resourcetype=">>, OrgApacheSlingHapiToolsResourcetype, <<"&">>, <<"org.apache.sling.hapi.tools.collectionresourcetype=">>, OrgApacheSlingHapiToolsCollectionresourcetype, <<"&">>, <<"org.apache.sling.hapi.tools.searchpaths=">>, OrgApacheSlingHapiToolsSearchpaths, <<"&">>, <<"org.apache.sling.hapi.tools.externalurl=">>, OrgApacheSlingHapiToolsExternalurl, <<"&">>, <<"org.apache.sling.hapi.tools.enabled=">>, OrgApacheSlingHapiToolsEnabled, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hc_core_impl_composite_health_check() ->
  openapi_utils:response().
org_apache_sling_hc_core_impl_composite_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hc.core.impl.CompositeHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>, <<"filter.tags=">>, FilterTags, <<"&">>, <<"filter.combineTagsWithOr=">>, FilterCombineTagsWithOr, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hc_core_impl_executor_health_check_executor_impl() ->
  openapi_utils:response().
org_apache_sling_hc_core_impl_executor_health_check_executor_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hc.core.impl.executor.HealthCheckExecutorImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"timeoutInMs=">>, TimeoutInMs, <<"&">>, <<"longRunningFutureThresholdForCriticalMs=">>, LongRunningFutureThresholdForCriticalMs, <<"&">>, <<"resultCacheTtlInMs=">>, ResultCacheTtlInMs, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hc_core_impl_jmx_attribute_health_check() ->
  openapi_utils:response().
org_apache_sling_hc_core_impl_jmx_attribute_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hc.core.impl.JmxAttributeHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>, <<"mbean.name=">>, MbeanName, <<"&">>, <<"attribute.name=">>, AttributeName, <<"&">>, <<"attribute.value.constraint=">>, AttributeValueConstraint, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hc_core_impl_scriptable_health_check() ->
  openapi_utils:response().
org_apache_sling_hc_core_impl_scriptable_health_check() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hc.core.impl.ScriptableHealthCheck"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"hc.name=">>, HcName, <<"&">>, <<"hc.tags=">>, HcTags, <<"&">>, <<"hc.mbean.name=">>, HcMbeanName, <<"&">>, <<"expression=">>, Expression, <<"&">>, <<"language.extension=">>, LanguageExtension, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet() ->
  openapi_utils:response().
org_apache_sling_hc_core_impl_servlet_health_check_executor_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.HealthCheckExecutorServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"servletPath=">>, ServletPath, <<"&">>, <<"disabled=">>, Disabled, <<"&">>, <<"cors.accessControlAllowOrigin=">>, CorsAccessControlAllowOrigin, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer() ->
  openapi_utils:response().
org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.hc.core.impl.servlet.ResultTxtVerboseSerializer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"totalWidth=">>, TotalWidth, <<"&">>, <<"colWidthName=">>, ColWidthName, <<"&">>, <<"colWidthResult=">>, ColWidthResult, <<"&">>, <<"colWidthTiming=">>, ColWidthTiming, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_i18n_impl_i18_n_filter() ->
  openapi_utils:response().
org_apache_sling_i18n_impl_i18_n_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.i18n.impl.I18NFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"sling.filter.scope=">>, SlingFilterScope, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_i18n_impl_jcr_resource_bundle_provider() ->
  openapi_utils:response().
org_apache_sling_i18n_impl_jcr_resource_bundle_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.i18n.impl.JcrResourceBundleProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"locale.default=">>, LocaleDefault, <<"&">>, <<"preload.bundles=">>, PreloadBundles, <<"&">>, <<"invalidation.delay=">>, InvalidationDelay, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_installer_provider_jcr_impl_jcr_installer() ->
  openapi_utils:response().
org_apache_sling_installer_provider_jcr_impl_jcr_installer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.installer.provider.jcr.impl.JcrInstaller"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"handler.schemes=">>, HandlerSchemes, <<"&">>, <<"sling.jcrinstall.folder.name.regexp=">>, SlingJcrinstallFolderNameRegexp, <<"&">>, <<"sling.jcrinstall.folder.max.depth=">>, SlingJcrinstallFolderMaxDepth, <<"&">>, <<"sling.jcrinstall.search.path=">>, SlingJcrinstallSearchPath, <<"&">>, <<"sling.jcrinstall.new.config.path=">>, SlingJcrinstallNewConfigPath, <<"&">>, <<"sling.jcrinstall.signal.path=">>, SlingJcrinstallSignalPath, <<"&">>, <<"sling.jcrinstall.enable.writeback=">>, SlingJcrinstallEnableWriteback, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_base_internal_login_admin_whitelist() ->
  openapi_utils:response().
org_apache_sling_jcr_base_internal_login_admin_whitelist() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"whitelist.bypass=">>, WhitelistBypass, <<"&">>, <<"whitelist.bundles.regexp=">>, WhitelistBundlesRegexp, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment() ->
  openapi_utils:response().
org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.base.internal.LoginAdminWhitelist.fragment"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"whitelist.name=">>, WhitelistName, <<"&">>, <<"whitelist.bundles=">>, WhitelistBundles, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet() ->
  openapi_utils:response().
org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.davex.impl.servlets.SlingDavExServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"alias=">>, Alias, <<"&">>, <<"dav.create-absolute-uri=">>, DavCreateAbsoluteUri, <<"&">>, <<"dav.protectedhandlers=">>, DavProtectedhandlers, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_jackrabbit_server_jndi_registration_support() ->
  openapi_utils:response().
org_apache_sling_jcr_jackrabbit_server_jndi_registration_support() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.JndiRegistrationSupport"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"java.naming.factory.initial=">>, JavaNamingFactoryInitial, <<"&">>, <<"java.naming.provider.url=">>, JavaNamingProviderUrl, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_jackrabbit_server_rmi_registration_support() ->
  openapi_utils:response().
org_apache_sling_jcr_jackrabbit_server_rmi_registration_support() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.jackrabbit.server.RmiRegistrationSupport"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"port=">>, Port, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_repoinit_impl_repository_initializer() ->
  openapi_utils:response().
org_apache_sling_jcr_repoinit_impl_repository_initializer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.repoinit.impl.RepositoryInitializer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"references=">>, References, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_repoinit_repository_initializer() ->
  openapi_utils:response().
org_apache_sling_jcr_repoinit_repository_initializer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.repoinit.RepositoryInitializer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"references=">>, References, <<"&">>, <<"scripts=">>, Scripts, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl() ->
  openapi_utils:response().
org_apache_sling_jcr_resource_internal_jcr_resource_resolver_factory_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrResourceResolverFactoryImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"resource.resolver.searchpath=">>, ResourceResolverSearchpath, <<"&">>, <<"resource.resolver.manglenamespaces=">>, ResourceResolverManglenamespaces, <<"&">>, <<"resource.resolver.allowDirect=">>, ResourceResolverAllowDirect, <<"&">>, <<"resource.resolver.required.providers=">>, ResourceResolverRequiredProviders, <<"&">>, <<"resource.resolver.required.providernames=">>, ResourceResolverRequiredProvidernames, <<"&">>, <<"resource.resolver.virtual=">>, ResourceResolverVirtual, <<"&">>, <<"resource.resolver.mapping=">>, ResourceResolverMapping, <<"&">>, <<"resource.resolver.map.location=">>, ResourceResolverMapLocation, <<"&">>, <<"resource.resolver.map.observation=">>, ResourceResolverMapObservation, <<"&">>, <<"resource.resolver.default.vanity.redirect.status=">>, ResourceResolverDefaultVanityRedirectStatus, <<"&">>, <<"resource.resolver.enable.vanitypath=">>, ResourceResolverEnableVanitypath, <<"&">>, <<"resource.resolver.vanitypath.maxEntries=">>, ResourceResolverVanitypathMaxEntries, <<"&">>, <<"resource.resolver.vanitypath.maxEntries.startup=">>, ResourceResolverVanitypathMaxEntriesStartup, <<"&">>, <<"resource.resolver.vanitypath.bloomfilter.maxBytes=">>, ResourceResolverVanitypathBloomfilterMaxBytes, <<"&">>, <<"resource.resolver.optimize.alias.resolution=">>, ResourceResolverOptimizeAliasResolution, <<"&">>, <<"resource.resolver.vanitypath.whitelist=">>, ResourceResolverVanitypathWhitelist, <<"&">>, <<"resource.resolver.vanitypath.blacklist=">>, ResourceResolverVanitypathBlacklist, <<"&">>, <<"resource.resolver.vanity.precedence=">>, ResourceResolverVanityPrecedence, <<"&">>, <<"resource.resolver.providerhandling.paranoid=">>, ResourceResolverProviderhandlingParanoid, <<"&">>, <<"resource.resolver.log.closing=">>, ResourceResolverLogClosing, <<"&">>, <<"resource.resolver.log.unclosed=">>, ResourceResolverLogUnclosed, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_resource_internal_jcr_system_user_validator() ->
  openapi_utils:response().
org_apache_sling_jcr_resource_internal_jcr_system_user_validator() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.resource.internal.JcrSystemUserValidator"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"allow.only.system.user=">>, AllowOnlySystemUser, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory() ->
  openapi_utils:response().
org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.resourcesecurity.impl.ResourceAccessGateFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"path=">>, Path, <<"&">>, <<"checkpath.prefix=">>, CheckpathPrefix, <<"&">>, <<"jcrPath=">>, JcrPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_webdav_impl_handler_default_handler_service() ->
  openapi_utils:response().
org_apache_sling_jcr_webdav_impl_handler_default_handler_service() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DefaultHandlerService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"type.collections=">>, TypeCollections, <<"&">>, <<"type.noncollections=">>, TypeNoncollections, <<"&">>, <<"type.content=">>, TypeContent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic() ->
  openapi_utils:response().
org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.webdav.impl.handler.DirListingExportHandlerService"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet() ->
  openapi_utils:response().
org_apache_sling_jcr_webdav_impl_servlets_simple_web_dav_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jcr.webdav.impl.servlets.SimpleWebDavServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"dav.root=">>, DavRoot, <<"&">>, <<"dav.create-absolute-uri=">>, DavCreateAbsoluteUri, <<"&">>, <<"dav.realm=">>, DavRealm, <<"&">>, <<"collection.types=">>, CollectionTypes, <<"&">>, <<"filter.prefixes=">>, FilterPrefixes, <<"&">>, <<"filter.types=">>, FilterTypes, <<"&">>, <<"filter.uris=">>, FilterUris, <<"&">>, <<"type.collections=">>, TypeCollections, <<"&">>, <<"type.noncollections=">>, TypeNoncollections, <<"&">>, <<"type.content=">>, TypeContent, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_jmx_provider_impl_jmx_resource_provider() ->
  openapi_utils:response().
org_apache_sling_jmx_provider_impl_jmx_resource_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.jmx.provider.impl.JMXResourceProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"provider.roots=">>, ProviderRoots, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_models_impl_model_adapter_factory() ->
  openapi_utils:response().
org_apache_sling_models_impl_model_adapter_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.models.impl.ModelAdapterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"osgi.http.whiteboard.listener=">>, OsgiHttpWhiteboardListener, <<"&">>, <<"osgi.http.whiteboard.context.select=">>, OsgiHttpWhiteboardContextSelect, <<"&">>, <<"max.recursion.depth=">>, MaxRecursionDepth, <<"&">>, <<"cleanup.job.period=">>, CleanupJobPeriod, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_models_jacksonexporter_impl_resource_module_provider() ->
  openapi_utils:response().
org_apache_sling_models_jacksonexporter_impl_resource_module_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.models.jacksonexporter.impl.ResourceModuleProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"max.recursion.levels=">>, MaxRecursionLevels, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto() ->
  openapi_utils:response().
org_apache_sling_resource_inventory_impl_resource_inventory_printer_facto() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.resource.inventory.impl.ResourceInventoryPrinterFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"felix.inventory.printer.name=">>, FelixInventoryPrinterName, <<"&">>, <<"felix.inventory.printer.title=">>, FelixInventoryPrinterTitle, <<"&">>, <<"path=">>, Path, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_resourcemerger_impl_merged_resource_provider_factory() ->
  openapi_utils:response().
org_apache_sling_resourcemerger_impl_merged_resource_provider_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.resourcemerger.impl.MergedResourceProviderFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"merge.root=">>, MergeRoot, <<"&">>, <<"merge.readOnly=">>, MergeReadOnly, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_resourcemerger_picker_overriding() ->
  openapi_utils:response().
org_apache_sling_resourcemerger_picker_overriding() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.resourcemerger.picker.overriding"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"merge.root=">>, MergeRoot, <<"&">>, <<"merge.readOnly=">>, MergeReadOnly, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_scripting_core_impl_script_cache_impl() ->
  openapi_utils:response().
org_apache_sling_scripting_core_impl_script_cache_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptCacheImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.scripting.cache.size=">>, OrgApacheSlingScriptingCacheSize, <<"&">>, <<"org.apache.sling.scripting.cache.additional_extensions=">>, OrgApacheSlingScriptingCacheAdditionalExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider() ->
  openapi_utils:response().
org_apache_sling_scripting_core_impl_scripting_resource_resolver_provider() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.scripting.core.impl.ScriptingResourceResolverProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"log.stacktrace.onclose=">>, LogStacktraceOnclose, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_scripting_java_impl_java_script_engine_factory() ->
  openapi_utils:response().
org_apache_sling_scripting_java_impl_java_script_engine_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"java.classdebuginfo=">>, JavaClassdebuginfo, <<"&">>, <<"java.javaEncoding=">>, JavaJavaEncoding, <<"&">>, <<"java.compilerSourceVM=">>, JavaCompilerSourceVM, <<"&">>, <<"java.compilerTargetVM=">>, JavaCompilerTargetVM, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa() ->
  openapi_utils:response().
org_apache_sling_scripting_javascript_internal_rhino_java_script_engine_fa() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.scripting.javascript.internal.RhinoJavaScriptEngineFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.scripting.javascript.rhino.optLevel=">>, OrgApacheSlingScriptingJavascriptRhinoOptLevel, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_scripting_jsp_jsp_script_engine_factory() ->
  openapi_utils:response().
org_apache_sling_scripting_jsp_jsp_script_engine_factory() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"jasper.compilerTargetVM=">>, JasperCompilerTargetVM, <<"&">>, <<"jasper.compilerSourceVM=">>, JasperCompilerSourceVM, <<"&">>, <<"jasper.classdebuginfo=">>, JasperClassdebuginfo, <<"&">>, <<"jasper.enablePooling=">>, JasperEnablePooling, <<"&">>, <<"jasper.ieClassId=">>, JasperIeClassId, <<"&">>, <<"jasper.genStringAsCharArray=">>, JasperGenStringAsCharArray, <<"&">>, <<"jasper.keepgenerated=">>, JasperKeepgenerated, <<"&">>, <<"jasper.mappedfile=">>, JasperMappedfile, <<"&">>, <<"jasper.trimSpaces=">>, JasperTrimSpaces, <<"&">>, <<"jasper.displaySourceFragments=">>, JasperDisplaySourceFragments, <<"&">>, <<"default.is.session=">>, DefaultIsSession, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov() ->
  openapi_utils:response().
org_apache_sling_scripting_sightly_js_impl_jsapi_sly_bindings_values_prov() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.scripting.sightly.js.impl.jsapi.SlyBindingsValuesProvider"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"org.apache.sling.scripting.sightly.js.bindings=">>, OrgApacheSlingScriptingSightlyJsBindings, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_security_impl_content_disposition_filter() ->
  openapi_utils:response().
org_apache_sling_security_impl_content_disposition_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.security.impl.ContentDispositionFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.content.disposition.paths=">>, SlingContentDispositionPaths, <<"&">>, <<"sling.content.disposition.excluded.paths=">>, SlingContentDispositionExcludedPaths, <<"&">>, <<"sling.content.disposition.all.paths=">>, SlingContentDispositionAllPaths, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_security_impl_referrer_filter() ->
  openapi_utils:response().
org_apache_sling_security_impl_referrer_filter() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"allow.empty=">>, AllowEmpty, <<"&">>, <<"allow.hosts=">>, AllowHosts, <<"&">>, <<"allow.hosts.regexp=">>, AllowHostsRegexp, <<"&">>, <<"filter.methods=">>, FilterMethods, <<"&">>, <<"exclude.agents.regexp=">>, ExcludeAgentsRegexp, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_serviceusermapping_impl_service_user_mapper_impl() ->
  openapi_utils:response().
org_apache_sling_serviceusermapping_impl_service_user_mapper_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"user.mapping=">>, UserMapping, <<"&">>, <<"user.default=">>, UserDefault, <<"&">>, <<"user.enable.default.mapping=">>, UserEnableDefaultMapping, <<"&">>, <<"require.validation=">>, RequireValidation, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended() ->
  openapi_utils:response().
org_apache_sling_serviceusermapping_impl_service_user_mapper_impl_amended() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.serviceusermapping.impl.ServiceUserMapperImpl.amended"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"service.ranking=">>, ServiceRanking, <<"&">>, <<"user.mapping=">>, UserMapping, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_servlets_get_default_get_servlet() ->
  openapi_utils:response().
org_apache_sling_servlets_get_default_get_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.servlets.get.DefaultGetServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"aliases=">>, Aliases, <<"&">>, <<"index=">>, Index, <<"&">>, <<"index.files=">>, IndexFiles, <<"&">>, <<"enable.html=">>, EnableHtml, <<"&">>, <<"enable.json=">>, EnableJson, <<"&">>, <<"enable.txt=">>, EnableTxt, <<"&">>, <<"enable.xml=">>, EnableXml, <<"&">>, <<"json.maximumresults=">>, JsonMaximumresults, <<"&">>, <<"ecmaSuport=">>, EcmaSuport, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_servlets_get_impl_version_version_info_servlet() ->
  openapi_utils:response().
org_apache_sling_servlets_get_impl_version_version_info_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.servlets.get.impl.version.VersionInfoServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.servlet.selectors=">>, SlingServletSelectors, <<"&">>, <<"ecmaSuport=">>, EcmaSuport, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task() ->
  openapi_utils:response().
org_apache_sling_servlets_post_impl_helper_chunk_clean_up_task() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.servlets.post.impl.helper.ChunkCleanUpTask"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"scheduler.expression=">>, SchedulerExpression, <<"&">>, <<"scheduler.concurrent=">>, SchedulerConcurrent, <<"&">>, <<"chunk.cleanup.age=">>, ChunkCleanupAge, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_servlets_post_impl_sling_post_servlet() ->
  openapi_utils:response().
org_apache_sling_servlets_post_impl_sling_post_servlet() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.servlets.post.impl.SlingPostServlet"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"servlet.post.dateFormats=">>, ServletPostDateFormats, <<"&">>, <<"servlet.post.nodeNameHints=">>, ServletPostNodeNameHints, <<"&">>, <<"servlet.post.nodeNameMaxLength=">>, ServletPostNodeNameMaxLength, <<"&">>, <<"servlet.post.checkinNewVersionableNodes=">>, ServletPostCheckinNewVersionableNodes, <<"&">>, <<"servlet.post.autoCheckout=">>, ServletPostAutoCheckout, <<"&">>, <<"servlet.post.autoCheckin=">>, ServletPostAutoCheckin, <<"&">>, <<"servlet.post.ignorePattern=">>, ServletPostIgnorePattern, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_servlets_resolver_sling_servlet_resolver() ->
  openapi_utils:response().
org_apache_sling_servlets_resolver_sling_servlet_resolver() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.servlets.resolver.SlingServletResolver"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"servletresolver.servletRoot=">>, ServletresolverServletRoot, <<"&">>, <<"servletresolver.cacheSize=">>, ServletresolverCacheSize, <<"&">>, <<"servletresolver.paths=">>, ServletresolverPaths, <<"&">>, <<"servletresolver.defaultExtensions=">>, ServletresolverDefaultExtensions, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_settings_impl_sling_settings_service_impl() ->
  openapi_utils:response().
org_apache_sling_settings_impl_sling_settings_service_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.settings.impl.SlingSettingsServiceImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"sling.name=">>, SlingName, <<"&">>, <<"sling.description=">>, SlingDescription, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_startupfilter_impl_startup_filter_impl() ->
  openapi_utils:response().
org_apache_sling_startupfilter_impl_startup_filter_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.startupfilter.impl.StartupFilterImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"active.by.default=">>, ActiveByDefault, <<"&">>, <<"default.message=">>, DefaultMessage, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_tenant_internal_tenant_provider_impl() ->
  openapi_utils:response().
org_apache_sling_tenant_internal_tenant_provider_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.tenant.internal.TenantProviderImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"tenant.root=">>, TenantRoot, <<"&">>, <<"tenant.path.matcher=">>, TenantPathMatcher, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_tracer_internal_log_tracer() ->
  openapi_utils:response().
org_apache_sling_tracer_internal_log_tracer() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.tracer.internal.LogTracer"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"tracerSets=">>, TracerSets, <<"&">>, <<"enabled=">>, Enabled, <<"&">>, <<"servletEnabled=">>, ServletEnabled, <<"&">>, <<"recordingCacheSizeInMB=">>, RecordingCacheSizeInMB, <<"&">>, <<"recordingCacheDurationInSecs=">>, RecordingCacheDurationInSecs, <<"&">>, <<"recordingCompressionEnabled=">>, RecordingCompressionEnabled, <<"&">>, <<"gzipResponse=">>, GzipResponse, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

%% @doc 
%% 
-spec org_apache_sling_xss_impl_xss_filter_impl() ->
  openapi_utils:response().
org_apache_sling_xss_impl_xss_filter_impl() ->
  Method      = post,
  Host        = application:get_env(openapi, host, "http://localhost:8080"),
  Path        = ["/system/console/configMgr/org.apache.sling.xss.impl.XSSFilterImpl"],
  Body        = [],
  ContentType = "text/plain",
  QueryString = [<<"post=">>, Post, <<"&">>, <<"apply=">>, Apply, <<"&">>, <<"delete=">>, Delete, <<"&">>, <<"action=">>, Action, <<"&">>, <<"$location=">>, Location, <<"&">>, <<"propertylist=">>, Propertylist, <<"&">>, <<"policyPath=">>, PolicyPath, <<"&">>],

  openapi_utils:request(Method, [Host, ?BASE_URL, Path, <<"?">>, QueryString], jsx:encode(Body), ContentType).

