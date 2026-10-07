# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingScriptingJspJspScriptEngineFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, jasper_compiler_target_vm: nil, jasper_compiler_source_vm: nil, jasper_classdebuginfo: nil, jasper_enable_pooling: nil, jasper_ie_class_id: nil, jasper_gen_string_as_char_array: nil, jasper_keepgenerated: nil, jasper_mappedfile: nil, jasper_trim_spaces: nil, jasper_display_source_fragments: nil, default_is_session: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.scripting.jsp.JspScriptEngineFactory',
          type: OpenapiClient::Models::OrgApacheSlingScriptingJspJspScriptEngineFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'jasper.compilerTargetVM' => jasper_compiler_target_vm, 'jasper.compilerSourceVM' => jasper_compiler_source_vm, 'jasper.classdebuginfo' => jasper_classdebuginfo, 'jasper.enablePooling' => jasper_enable_pooling, 'jasper.ieClassId' => jasper_ie_class_id, 'jasper.genStringAsCharArray' => jasper_gen_string_as_char_array, 'jasper.keepgenerated' => jasper_keepgenerated, 'jasper.mappedfile' => jasper_mappedfile, 'jasper.trimSpaces' => jasper_trim_spaces, 'jasper.displaySourceFragments' => jasper_display_source_fragments, 'default.is.session' => default_is_session }
        )
      end
    end
  end
end
