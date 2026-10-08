# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqWcmScriptingImplBVPManager
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, com_day_cq_wcm_scripting_bvp_script_engines: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.wcm.scripting.impl.BVPManager',
          type: OpenapiClient::Models::ComDayCqWcmScriptingImplBVPManagerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'com.day.cq.wcm.scripting.bvp.script.engines' => com_day_cq_wcm_scripting_bvp_script_engines }
        )
      end
    end
  end
end
