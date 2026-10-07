# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqReplicationImplContentDurboDurboImportConfigurationProviderService
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, preserve_hierarchy_nodes: nil, ignore_versioning: nil, import_acl: nil, save_threshold: nil, preserve_user_paths: nil, preserve_uuid: nil, preserve_uuid_nodetypes: nil, preserve_uuid_subtrees: nil, auto_commit: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.replication.impl.content.durbo.DurboImportConfigurationProviderService',
          type: OpenapiClient::Models::ComDayCqReplicationImplContentDurboDurboImportConfiguHc0bd76b5,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'preserve.hierarchy.nodes' => preserve_hierarchy_nodes, 'ignore.versioning' => ignore_versioning, 'import.acl' => import_acl, 'save.threshold' => save_threshold, 'preserve.user.paths' => preserve_user_paths, 'preserve.uuid' => preserve_uuid, 'preserve.uuid.nodetypes' => preserve_uuid_nodetypes, 'preserve.uuid.subtrees' => preserve_uuid_subtrees, 'auto.commit' => auto_commit }
        )
      end
    end
  end
end
