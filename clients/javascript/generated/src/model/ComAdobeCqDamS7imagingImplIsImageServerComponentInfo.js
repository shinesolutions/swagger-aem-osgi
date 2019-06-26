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
import ComAdobeCqDamS7imagingImplIsImageServerComponentProperties from './ComAdobeCqDamS7imagingImplIsImageServerComponentProperties';

/**
 * The ComAdobeCqDamS7imagingImplIsImageServerComponentInfo model module.
 * @module model/ComAdobeCqDamS7imagingImplIsImageServerComponentInfo
 * @version 1.0.0
 */
class ComAdobeCqDamS7imagingImplIsImageServerComponentInfo {
    /**
     * Constructs a new <code>ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</code>.
     * @alias module:model/ComAdobeCqDamS7imagingImplIsImageServerComponentInfo
     */
    constructor() { 
        
        ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqDamS7imagingImplIsImageServerComponentInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqDamS7imagingImplIsImageServerComponentInfo} The populated <code>ComAdobeCqDamS7imagingImplIsImageServerComponentInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqDamS7imagingImplIsImageServerComponentInfo();

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
                obj['properties'] = ComAdobeCqDamS7imagingImplIsImageServerComponentProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqDamS7imagingImplIsImageServerComponentProperties} properties
 */
ComAdobeCqDamS7imagingImplIsImageServerComponentInfo.prototype['properties'] = undefined;






export default ComAdobeCqDamS7imagingImplIsImageServerComponentInfo;
