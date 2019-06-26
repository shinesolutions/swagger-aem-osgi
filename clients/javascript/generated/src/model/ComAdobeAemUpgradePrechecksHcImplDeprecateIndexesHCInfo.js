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
import ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties from './ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties';

/**
 * The ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo model module.
 * @module model/ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo
 * @version 1.0.0
 */
class ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo {
    /**
     * Constructs a new <code>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</code>.
     * @alias module:model/ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo
     */
    constructor() { 
        
        ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo} The populated <code>ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo();

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
                obj['properties'] = ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCProperties} properties
 */
ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo.prototype['properties'] = undefined;






export default ComAdobeAemUpgradePrechecksHcImplDeprecateIndexesHCInfo;
