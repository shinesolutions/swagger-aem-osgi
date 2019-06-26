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
    instance = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
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

  describe('ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties', function() {
    it('should create an instance of ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties', function() {
      // uncomment below and update the code to test ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties);
    });

    it('should have the property solrZkTimeout (base name: "solr.zk.timeout")', function() {
      // uncomment below and update the code to test the property solrZkTimeout
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property solrCommit (base name: "solr.commit")', function() {
      // uncomment below and update the code to test the property solrCommit
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property cacheOn (base name: "cache.on")', function() {
      // uncomment below and update the code to test the property cacheOn
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property concurrencyLevel (base name: "concurrency.level")', function() {
      // uncomment below and update the code to test the property concurrencyLevel
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property cacheStartSize (base name: "cache.start.size")', function() {
      // uncomment below and update the code to test the property cacheStartSize
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property cacheTtl (base name: "cache.ttl")', function() {
      // uncomment below and update the code to test the property cacheTtl
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

    it('should have the property cacheSize (base name: "cache.size")', function() {
      // uncomment below and update the code to test the property cacheSize
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqSocialDatastoreOpImplSocialMSResourceProviderFactoryProperties();
      //expect(instance).to.be();
    });

  });

}));