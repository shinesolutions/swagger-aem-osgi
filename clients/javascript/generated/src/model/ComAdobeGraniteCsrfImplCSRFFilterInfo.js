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
import ComAdobeGraniteCsrfImplCSRFFilterProperties from './ComAdobeGraniteCsrfImplCSRFFilterProperties';

/**
 * The ComAdobeGraniteCsrfImplCSRFFilterInfo model module.
 * @module model/ComAdobeGraniteCsrfImplCSRFFilterInfo
 * @version 1.0.0
 */
class ComAdobeGraniteCsrfImplCSRFFilterInfo {
    /**
     * Constructs a new <code>ComAdobeGraniteCsrfImplCSRFFilterInfo</code>.
     * @alias module:model/ComAdobeGraniteCsrfImplCSRFFilterInfo
     */
    constructor() { 
        
        ComAdobeGraniteCsrfImplCSRFFilterInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteCsrfImplCSRFFilterInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteCsrfImplCSRFFilterInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteCsrfImplCSRFFilterInfo} The populated <code>ComAdobeGraniteCsrfImplCSRFFilterInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteCsrfImplCSRFFilterInfo();

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
                obj['properties'] = ComAdobeGraniteCsrfImplCSRFFilterProperties.constructFromObject(data['properties']);
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
ComAdobeGraniteCsrfImplCSRFFilterInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeGraniteCsrfImplCSRFFilterInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeGraniteCsrfImplCSRFFilterInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeGraniteCsrfImplCSRFFilterProperties} properties
 */
ComAdobeGraniteCsrfImplCSRFFilterInfo.prototype['properties'] = undefined;

/**
 * @member {String} bundle_location
 */
ComAdobeGraniteCsrfImplCSRFFilterInfo.prototype['bundle_location'] = undefined;

/**
 * @member {String} service_location
 */
ComAdobeGraniteCsrfImplCSRFFilterInfo.prototype['service_location'] = undefined;






export default ComAdobeGraniteCsrfImplCSRFFilterInfo;
