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
    instance = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
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

  describe('ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties', function() {
    it('should create an instance of ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties', function() {
      // uncomment below and update the code to test ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be.a(NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties);
    });

    it('should have the property cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName (base name: "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName (base name: "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName (base name: "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqDamS7damVideoproxyclientserviceHttpReadtimeoutName (base name: "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceHttpReadtimeoutName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName (base name: "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqDamS7damVideoproxyclientserviceHttpMaxretrycountName (base name: "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceHttpMaxretrycountName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

    it('should have the property cqDamS7damVideoproxyclientserviceUploadprogressIntervalName (base name: "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")', function() {
      // uncomment below and update the code to test the property cqDamS7damVideoproxyclientserviceUploadprogressIntervalName
      //var instane = new NodeSwaggerAemOsgi.ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties();
      //expect(instance).to.be();
    });

  });

}));