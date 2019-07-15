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
import ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties from './ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties';

/**
 * The ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo model module.
 * @module model/ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo
 * @version 1.0.0
 */
class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo {
    /**
     * Constructs a new <code>ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo</code>.
     * @alias module:model/ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo
     */
    constructor() { 
        
        ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo} The populated <code>ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo();

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
                obj['properties'] = ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties} properties
 */
ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo.prototype['properties'] = undefined;






export default ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosInfo;

