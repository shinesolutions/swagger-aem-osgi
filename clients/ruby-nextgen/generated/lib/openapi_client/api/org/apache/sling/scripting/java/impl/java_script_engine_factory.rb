# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactory
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, java_classdebuginfo: nil, java_java_encoding: nil, java_compiler_source_vm: nil, java_compiler_target_vm: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.scripting.java.impl.JavaScriptEngineFactory',
          type: OpenapiClient::Models::OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'java.classdebuginfo' => java_classdebuginfo, 'java.javaEncoding' => java_java_encoding, 'java.compilerSourceVM' => java_compiler_source_vm, 'java.compilerTargetVM' => java_compiler_target_vm }
        )
      end
    end
  end
end
