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
import ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties from './ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties';

/**
 * The ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo model module.
 * @module model/ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo
 * @version 1.0.0
 */
class ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo {
    /**
     * Constructs a new <code>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</code>.
     * @alias module:model/ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo
     */
    constructor() { 
        
        ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo} The populated <code>ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo();

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
                obj['properties'] = ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckProperties} properties
 */
ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo.prototype['properties'] = undefined;






export default ComAdobeGraniteRepositoryHcImplAuthorizableNodeNameHealthCheckInfo;

