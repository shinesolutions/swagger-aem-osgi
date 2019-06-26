/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.NodeSwaggerAemOsgi);
  }
}(this, function(expect, NodeSwaggerAemOsgi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties', function() {
    it('should create an instance of OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties', function() {
      // uncomment below and update the code to test OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties);
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property title (base name: "title")', function() {
      // uncomment below and update the code to test the property title
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property details (base name: "details")', function() {
      // uncomment below and update the code to test the property details
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property enabled (base name: "enabled")', function() {
      // uncomment below and update the code to test the property enabled
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property serviceName (base name: "serviceName")', function() {
      // uncomment below and update the code to test the property serviceName
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property logLevel (base name: "log.level")', function() {
      // uncomment below and update the code to test the property logLevel
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property queueProcessingEnabled (base name: "queue.processing.enabled")', function() {
      // uncomment below and update the code to test the property queueProcessingEnabled
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property packageExporterEndpoints (base name: "packageExporter.endpoints")', function() {
      // uncomment below and update the code to test the property packageExporterEndpoints
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property pullItems (base name: "pull.items")', function() {
      // uncomment below and update the code to test the property pullItems
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property httpConnTimeout (base name: "http.conn.timeout")', function() {
      // uncomment below and update the code to test the property httpConnTimeout
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property requestAuthorizationStrategyTarget (base name: "requestAuthorizationStrategy.target")', function() {
      // uncomment below and update the code to test the property requestAuthorizationStrategyTarget
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property transportSecretProviderTarget (base name: "transportSecretProvider.target")', function() {
      // uncomment below and update the code to test the property transportSecretProviderTarget
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property packageBuilderTarget (base name: "packageBuilder.target")', function() {
      // uncomment below and update the code to test the property packageBuilderTarget
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property triggersTarget (base name: "triggers.target")', function() {
      // uncomment below and update the code to test the property triggersTarget
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingDistributionAgentImplReverseDistributionAgentFactoryProperties();
      //expect(instance).to.be();
    });

  });

}));
