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
import ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties from './ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties';

/**
 * The ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo model module.
 * @module model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo
 * @version 1.0.0
 */
class ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo {
    /**
     * Constructs a new <code>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</code>.
     * @alias module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo
     */
    constructor() { 
        
        ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo} The populated <code>ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo();

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
                obj['properties'] = ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociProperties} properties
 */
ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo.prototype['properties'] = undefined;






export default ComAdobeCqSocialModerationDashboardInternalImplFilterGroupSociInfo;

