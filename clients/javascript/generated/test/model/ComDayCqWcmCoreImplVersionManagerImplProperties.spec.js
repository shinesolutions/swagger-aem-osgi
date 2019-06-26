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
    instance = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
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

  describe('ComDayCqWcmCoreImplVersionManagerImplProperties', function() {
    it('should create an instance of ComDayCqWcmCoreImplVersionManagerImplProperties', function() {
      // uncomment below and update the code to test ComDayCqWcmCoreImplVersionManagerImplProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties);
    });

    it('should have the property versionmanagerCreateVersionOnActivation (base name: "versionmanager.createVersionOnActivation")', function() {
      // uncomment below and update the code to test the property versionmanagerCreateVersionOnActivation
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property versionmanagerPurgingEnabled (base name: "versionmanager.purgingEnabled")', function() {
      // uncomment below and update the code to test the property versionmanagerPurgingEnabled
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property versionmanagerPurgePaths (base name: "versionmanager.purgePaths")', function() {
      // uncomment below and update the code to test the property versionmanagerPurgePaths
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property versionmanagerIvPaths (base name: "versionmanager.ivPaths")', function() {
      // uncomment below and update the code to test the property versionmanagerIvPaths
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property versionmanagerMaxAgeDays (base name: "versionmanager.maxAgeDays")', function() {
      // uncomment below and update the code to test the property versionmanagerMaxAgeDays
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property versionmanagerMaxNumberVersions (base name: "versionmanager.maxNumberVersions")', function() {
      // uncomment below and update the code to test the property versionmanagerMaxNumberVersions
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property versionmanagerMinNumberVersions (base name: "versionmanager.minNumberVersions")', function() {
      // uncomment below and update the code to test the property versionmanagerMinNumberVersions
      //var instane = new NodeSwaggerAemOsgi.ComDayCqWcmCoreImplVersionManagerImplProperties();
      //expect(instance).to.be();
    });

  });

}));
