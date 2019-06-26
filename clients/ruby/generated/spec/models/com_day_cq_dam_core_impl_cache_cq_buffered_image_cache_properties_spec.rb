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

# Unit tests for SwaggerAemOsgiClient::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties
# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate
describe 'ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties' do
  before do
    # run before each test
    @instance = SwaggerAemOsgiClient::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties.new
  end

  after do
    # run after each test
  end

  describe 'test an instance of ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties' do
    it 'should create an instance of ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties' do
      expect(@instance).to be_instance_of(SwaggerAemOsgiClient::ComDayCqDamCoreImplCacheCQBufferedImageCacheProperties)
    end
  end
  describe 'test attribute "cq_dam_image_cache_max_memory"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "cq_dam_image_cache_max_age"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

  describe 'test attribute "cq_dam_image_cache_max_dimension"' do
    it 'should work' do
      # assertion here. ref: https://www.relishapp.com/rspec/rspec-expectations/docs/built-in-matchers
    end
  end

end