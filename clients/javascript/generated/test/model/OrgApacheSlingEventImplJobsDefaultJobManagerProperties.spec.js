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
    instance = new NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
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

  describe('OrgApacheSlingEventImplJobsDefaultJobManagerProperties', function() {
    it('should create an instance of OrgApacheSlingEventImplJobsDefaultJobManagerProperties', function() {
      // uncomment below and update the code to test OrgApacheSlingEventImplJobsDefaultJobManagerProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties);
    });

    it('should have the property queuePriority (base name: "queue.priority")', function() {
      // uncomment below and update the code to test the property queuePriority
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
      //expect(instance).to.be();
    });

    it('should have the property queueRetries (base name: "queue.retries")', function() {
      // uncomment below and update the code to test the property queueRetries
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
      //expect(instance).to.be();
    });

    it('should have the property queueRetrydelay (base name: "queue.retrydelay")', function() {
      // uncomment below and update the code to test the property queueRetrydelay
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
      //expect(instance).to.be();
    });

    it('should have the property queueMaxparallel (base name: "queue.maxparallel")', function() {
      // uncomment below and update the code to test the property queueMaxparallel
      //var instane = new NodeSwaggerAemOsgi.OrgApacheSlingEventImplJobsDefaultJobManagerProperties();
      //expect(instance).to.be();
    });

  });

}));
