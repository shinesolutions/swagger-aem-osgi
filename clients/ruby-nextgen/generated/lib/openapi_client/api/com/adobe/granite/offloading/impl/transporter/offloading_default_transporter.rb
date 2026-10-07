# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, default_transport_agent_to_worker_prefix: nil, default_transport_agent_to_master_prefix: nil, default_transport_input_package: nil, default_transport_output_package: nil, default_transport_replication_synchronous: nil, default_transport_contentpackage: nil, offloading_transporter_default_enabled: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.granite.offloading.impl.transporter.OffloadingDefaultTransporter',
          type: OpenapiClient::Models::ComAdobeGraniteOffloadingImplTransporterOffloadingDefauH9101b305,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'default.transport.agent-to-worker.prefix' => default_transport_agent_to_worker_prefix, 'default.transport.agent-to-master.prefix' => default_transport_agent_to_master_prefix, 'default.transport.input.package' => default_transport_input_package, 'default.transport.output.package' => default_transport_output_package, 'default.transport.replication.synchronous' => default_transport_replication_synchronous, 'default.transport.contentpackage' => default_transport_contentpackage, 'offloading.transporter.default.enabled' => offloading_transporter_default_enabled }
        )
      end
    end
  end
end
