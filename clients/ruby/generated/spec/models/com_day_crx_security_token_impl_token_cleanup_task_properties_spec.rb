=begin
#Adobe Experience Manager OSGI config (AEM) API

#Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API

The version of the OpenAPI document: 1.0.0
Contact: opensource@shinesolutions.com
Generated by: https://openapi-generator.tech
OpenAPI Generator version: 4.0.1-SNAPSHOT

=end

require 'spec_helper'
require 'json'
require 'date'

# Unit tests for SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ComDayCrxSecurityTokenImplTokenCleanupTaskProperties' do
  before do
    # run before each test
    @instance = SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties' do
    it 'should create an instance of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties' do
      expect(@instance).to be_instance_of(SwaggerAemOsgiClient::ComDayCrxSecurityTokenImplTokenCleanupTaskProperties)
    end
  end
  describe 'test attribute "enable_token_cleanup_task"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "scheduler_expression"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "batch_size"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end