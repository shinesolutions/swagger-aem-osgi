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
import ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties from './ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties';

/**
 * The ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo model module.
 * @module model/ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo
 * @version 1.0.0
 */
class ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo {
    /**
     * Constructs a new <code>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</code>.
     * @alias module:model/ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo
     */
    constructor() { 
        
        ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo} The populated <code>ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo();

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
                obj['properties'] = ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplProperties} properties
 */
ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo.prototype['properties'] = undefined;






export default ComAdobeCqSocialUgcbaseModerationImplAutoModerationImplInfo;
