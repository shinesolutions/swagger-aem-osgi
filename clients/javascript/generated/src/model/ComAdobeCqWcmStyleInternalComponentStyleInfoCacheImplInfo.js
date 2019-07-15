/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * The version of the OpenAPI document: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';
import ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties from './ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties';

/**
 * The ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo model module.
 * @module model/ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo
 * @version 1.0.0
 */
class ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo {
    /**
     * Constructs a new <code>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</code>.
     * @alias module:model/ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo
     */
    constructor() { 
        
        ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo} The populated <code>ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo();

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
                obj['properties'] = ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplProperties} properties
 */
ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo.prototype['properties'] = undefined;






export default ComAdobeCqWcmStyleInternalComponentStyleInfoCacheImplInfo;

