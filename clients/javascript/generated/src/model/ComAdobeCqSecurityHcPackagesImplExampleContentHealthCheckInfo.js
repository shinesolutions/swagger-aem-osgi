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

import ApiClient from '../ApiClient';
import ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties from './ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties';

/**
 * The ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo model module.
 * @module model/ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo
 * @version 1.0.0
 */
class ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo {
    /**
     * Constructs a new <code>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</code>.
     * @alias module:model/ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo
     */
    constructor() { 
        
        ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo} The populated <code>ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo();

            if (data.hasOwnProperty('pid')) {
                obj['pid'] = ApiClient.convertToType(data['pid'], 'String');
            }
            if (data.hasOwnProperty('title')) {
                obj['title'] = ApiClient.convertToType(data['title'], 'String');
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ApiClient.convertToType(data['description'], 'String');
            }
            if (data.hasOwnProperty('properties')) {
                obj['properties'] = ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties.constructFromObject(data['properties']);
            }
            if (data.hasOwnProperty('additionalProperties')) {
                obj['additionalProperties'] = ApiClient.convertToType(data['additionalProperties'], 'String');
            }
            if (data.hasOwnProperty('bundle_location')) {
                obj['bundle_location'] = ApiClient.convertToType(data['bundle_location'], 'String');
            }
            if (data.hasOwnProperty('service_location')) {
                obj['service_location'] = ApiClient.convertToType(data['service_location'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckProperties} properties
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['properties'] = undefined;

/**
 * @member {String} additionalProperties
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['additionalProperties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo.prototype['service_location'] = undefined;






export default ComAdobeCqSecurityHcPackagesImplExampleContentHealthCheckInfo;

