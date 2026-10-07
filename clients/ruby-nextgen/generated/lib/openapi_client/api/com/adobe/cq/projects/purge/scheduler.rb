# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqProjectsPurgeScheduler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, scheduledpurge_name: nil, scheduledpurge_purge_active: nil, scheduledpurge_templates: nil, scheduledpurge_purge_groups: nil, scheduledpurge_purge_assets: nil, scheduledpurge_terminate_running_workflows: nil, scheduledpurge_daysold: nil, scheduledpurge_save_threshold: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.projects.purge.Scheduler',
          type: OpenapiClient::Models::ComAdobeCqProjectsPurgeSchedulerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'scheduledpurge.name' => scheduledpurge_name, 'scheduledpurge.purgeActive' => scheduledpurge_purge_active, 'scheduledpurge.templates' => scheduledpurge_templates, 'scheduledpurge.purgeGroups' => scheduledpurge_purge_groups, 'scheduledpurge.purgeAssets' => scheduledpurge_purge_assets, 'scheduledpurge.terminateRunningWorkflows' => scheduledpurge_terminate_running_workflows, 'scheduledpurge.daysold' => scheduledpurge_daysold, 'scheduledpurge.saveThreshold' => scheduledpurge_save_threshold }
        )
      end
    end
  end
end
