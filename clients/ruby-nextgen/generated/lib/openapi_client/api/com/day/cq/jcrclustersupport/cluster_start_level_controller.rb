# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqJcrclustersupportClusterStartLevelController
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cluster_level_enable: nil, cluster_master_level: nil, cluster_slave_level: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.jcrclustersupport.ClusterStartLevelController',
          type: OpenapiClient::Models::ComDayCqJcrclustersupportClusterStartLevelControllerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cluster.level.enable' => cluster_level_enable, 'cluster.master.level' => cluster_master_level, 'cluster.slave.level' => cluster_slave_level }
        )
      end
    end
  end
end
