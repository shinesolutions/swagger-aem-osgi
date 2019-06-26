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
    instance = new NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
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

  describe('ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties', function() {
    it('should create an instance of ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties', function() {
      // uncomment below and update the code to test ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties);
    });

    it('should have the property eventFilter (base name: "event.filter")', function() {
      // uncomment below and update the code to test the property eventFilter
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property launchesEventhandlerThreadpoolMaxsize (base name: "launches.eventhandler.threadpool.maxsize")', function() {
      // uncomment below and update the code to test the property launchesEventhandlerThreadpoolMaxsize
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property launchesEventhandlerThreadpoolPriority (base name: "launches.eventhandler.threadpool.priority")', function() {
      // uncomment below and update the code to test the property launchesEventhandlerThreadpoolPriority
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
      //expect(instance).to.be();
    });

    it('should have the property launchesEventhandlerUpdatelastmodification (base name: "launches.eventhandler.updatelastmodification")', function() {
      // uncomment below and update the code to test the property launchesEventhandlerUpdatelastmodification
      //var instane = new NodeSwaggerAemOsgi.ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties();
      //expect(instance).to.be();
    });

  });

}));
