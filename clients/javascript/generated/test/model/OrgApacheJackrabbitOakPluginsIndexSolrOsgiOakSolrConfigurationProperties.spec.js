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
    instance = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
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

  describe('OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties', function() {
    it('should create an instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties', function() {
      // uncomment below and update the code to test OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties);
    });

    it('should have the property pathDescField (base name: "path.desc.field")', function() {
      // uncomment below and update the code to test the property pathDescField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property pathChildField (base name: "path.child.field")', function() {
      // uncomment below and update the code to test the property pathChildField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property pathParentField (base name: "path.parent.field")', function() {
      // uncomment below and update the code to test the property pathParentField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property pathExactField (base name: "path.exact.field")', function() {
      // uncomment below and update the code to test the property pathExactField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property catchAllField (base name: "catch.all.field")', function() {
      // uncomment below and update the code to test the property catchAllField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property collapsedPathField (base name: "collapsed.path.field")', function() {
      // uncomment below and update the code to test the property collapsedPathField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property pathDepthField (base name: "path.depth.field")', function() {
      // uncomment below and update the code to test the property pathDepthField
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property commitPolicy (base name: "commit.policy")', function() {
      // uncomment below and update the code to test the property commitPolicy
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property rows (base name: "rows")', function() {
      // uncomment below and update the code to test the property rows
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property pathRestrictions (base name: "path.restrictions")', function() {
      // uncomment below and update the code to test the property pathRestrictions
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property propertyRestrictions (base name: "property.restrictions")', function() {
      // uncomment below and update the code to test the property propertyRestrictions
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property primarytypesRestrictions (base name: "primarytypes.restrictions")', function() {
      // uncomment below and update the code to test the property primarytypesRestrictions
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property ignoredProperties (base name: "ignored.properties")', function() {
      // uncomment below and update the code to test the property ignoredProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property usedProperties (base name: "used.properties")', function() {
      // uncomment below and update the code to test the property usedProperties
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property typeMappings (base name: "type.mappings")', function() {
      // uncomment below and update the code to test the property typeMappings
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property propertyMappings (base name: "property.mappings")', function() {
      // uncomment below and update the code to test the property propertyMappings
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

    it('should have the property collapseJcrcontentNodes (base name: "collapse.jcrcontent.nodes")', function() {
      // uncomment below and update the code to test the property collapseJcrcontentNodes
      //var instane = new NodeSwaggerAemOsgi.OrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties();
      //expect(instance).to.be();
    });

  });

}));