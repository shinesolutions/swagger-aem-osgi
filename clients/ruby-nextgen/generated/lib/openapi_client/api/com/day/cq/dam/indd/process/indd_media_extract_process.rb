# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqDamInddProcessINDDMediaExtractProcess
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, process_label: nil, cq_dam_indd_pages_regex: nil, ids_job_decoupled: nil, ids_job_workflow_model: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.dam.indd.process.INDDMediaExtractProcess',
          type: OpenapiClient::Models::ComDayCqDamInddProcessINDDMediaExtractProcessInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'process.label' => process_label, 'cq.dam.indd.pages.regex' => cq_dam_indd_pages_regex, 'ids.job.decoupled' => ids_job_decoupled, 'ids.job.workflow.model' => ids_job_workflow_model }
        )
      end
    end
  end
end
