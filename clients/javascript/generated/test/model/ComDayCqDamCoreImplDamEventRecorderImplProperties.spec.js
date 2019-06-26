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
    instance = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
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

  describe('ComDayCqDamCoreImplDamEventRecorderImplProperties', function() {
    it('should create an instance of ComDayCqDamCoreImplDamEventRecorderImplProperties', function() {
      // uncomment below and update the code to test ComDayCqDamCoreImplDamEventRecorderImplProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties);
    });

    it('should have the property eventFilter (base name: "event.filter")', function() {
      // uncomment below and update the code to test the property eventFilter
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property eventQueueLength (base name: "event.queue.length")', function() {
      // uncomment below and update the code to test the property eventQueueLength
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property eventrecorderEnabled (base name: "eventrecorder.enabled")', function() {
      // uncomment below and update the code to test the property eventrecorderEnabled
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property eventrecorderBlacklist (base name: "eventrecorder.blacklist")', function() {
      // uncomment below and update the code to test the property eventrecorderBlacklist
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property eventrecorderEventtypes (base name: "eventrecorder.eventtypes")', function() {
      // uncomment below and update the code to test the property eventrecorderEventtypes
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCoreImplDamEventRecorderImplProperties();
      //expect(instance).to.be();
    });

  });

}));
