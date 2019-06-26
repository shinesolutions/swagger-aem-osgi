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
    instance = new NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
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

  describe('ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties', function() {
    it('should create an instance of ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties', function() {
      // uncomment below and update the code to test ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties);
    });

    it('should have the property xmpFilterApplyWhitelist (base name: "xmp.filter.apply_whitelist")', function() {
      // uncomment below and update the code to test the property xmpFilterApplyWhitelist
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
      //expect(instance).to.be();
    });

    it('should have the property xmpFilterWhitelist (base name: "xmp.filter.whitelist")', function() {
      // uncomment below and update the code to test the property xmpFilterWhitelist
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
      //expect(instance).to.be();
    });

    it('should have the property xmpFilterApplyBlacklist (base name: "xmp.filter.apply_blacklist")', function() {
      // uncomment below and update the code to test the property xmpFilterApplyBlacklist
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
      //expect(instance).to.be();
    });

    it('should have the property xmpFilterBlacklist (base name: "xmp.filter.blacklist")', function() {
      // uncomment below and update the code to test the property xmpFilterBlacklist
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties();
      //expect(instance).to.be();
    });

  });

}));
