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
    instance = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
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

  describe('ComAdobeGraniteRepositoryImplCommitStatsConfigProperties', function() {
    it('should create an instance of ComAdobeGraniteRepositoryImplCommitStatsConfigProperties', function() {
      // uncomment below and update the code to test ComAdobeGraniteRepositoryImplCommitStatsConfigProperties
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties);
    });

    it('should have the property enabled (base name: "enabled")', function() {
      // uncomment below and update the code to test the property enabled
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property intervalSeconds (base name: "intervalSeconds")', function() {
      // uncomment below and update the code to test the property intervalSeconds
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property commitsPerIntervalThreshold (base name: "commitsPerIntervalThreshold")', function() {
      // uncomment below and update the code to test the property commitsPerIntervalThreshold
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property maxLocationLength (base name: "maxLocationLength")', function() {
      // uncomment below and update the code to test the property maxLocationLength
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property maxDetailsShown (base name: "maxDetailsShown")', function() {
      // uncomment below and update the code to test the property maxDetailsShown
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property minDetailsPercentage (base name: "minDetailsPercentage")', function() {
      // uncomment below and update the code to test the property minDetailsPercentage
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property threadMatchers (base name: "threadMatchers")', function() {
      // uncomment below and update the code to test the property threadMatchers
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property maxGreedyDepth (base name: "maxGreedyDepth")', function() {
      // uncomment below and update the code to test the property maxGreedyDepth
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property greedyStackMatchers (base name: "greedyStackMatchers")', function() {
      // uncomment below and update the code to test the property greedyStackMatchers
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property stackFilters (base name: "stackFilters")', function() {
      // uncomment below and update the code to test the property stackFilters
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property stackMatchers (base name: "stackMatchers")', function() {
      // uncomment below and update the code to test the property stackMatchers
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property stackCategorizers (base name: "stackCategorizers")', function() {
      // uncomment below and update the code to test the property stackCategorizers
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

    it('should have the property stackShorteners (base name: "stackShorteners")', function() {
      // uncomment below and update the code to test the property stackShorteners
      //var instane = new NodeSwaggerAemOsgi.ComAdobeGraniteRepositoryImplCommitStatsConfigProperties();
      //expect(instance).to.be();
    });

  });

}));
