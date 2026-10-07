# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmDesignimporterDesignPackageImporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, extract_filter: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.designimporter.DesignPackageImporter',
          type: OpenapiClient::Models::ComDayCqWcmDesignimporterDesignPackageImporterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'extract.filter' => extract_filter }
        )
      end
    end
  end
end
