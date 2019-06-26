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
import ComAdobeCqSocialUserImplTransportHttpToPublisherProperties from './ComAdobeCqSocialUserImplTransportHttpToPublisherProperties';

/**
 * The ComAdobeCqSocialUserImplTransportHttpToPublisherInfo model module.
 * @module model/ComAdobeCqSocialUserImplTransportHttpToPublisherInfo
 * @version 1.0.0
 */
class ComAdobeCqSocialUserImplTransportHttpToPublisherInfo {
    /**
     * Constructs a new <code>ComAdobeCqSocialUserImplTransportHttpToPublisherInfo</code>.
     * @alias module:model/ComAdobeCqSocialUserImplTransportHttpToPublisherInfo
     */
    constructor() { 
        
        ComAdobeCqSocialUserImplTransportHttpToPublisherInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialUserImplTransportHttpToPublisherInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialUserImplTransportHttpToPublisherInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialUserImplTransportHttpToPublisherInfo} The populated <code>ComAdobeCqSocialUserImplTransportHttpToPublisherInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialUserImplTransportHttpToPublisherInfo();

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
                obj['properties'] = ComAdobeCqSocialUserImplTransportHttpToPublisherProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqSocialUserImplTransportHttpToPublisherInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqSocialUserImplTransportHttpToPublisherInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqSocialUserImplTransportHttpToPublisherInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqSocialUserImplTransportHttpToPublisherProperties} properties
 */
ComAdobeCqSocialUserImplTransportHttpToPublisherInfo.prototype['properties'] = undefined;






export default ComAdobeCqSocialUserImplTransportHttpToPublisherInfo;

