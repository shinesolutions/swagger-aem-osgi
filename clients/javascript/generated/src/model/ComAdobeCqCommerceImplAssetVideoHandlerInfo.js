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
import ComAdobeCqCommerceImplAssetVideoHandlerProperties from './ComAdobeCqCommerceImplAssetVideoHandlerProperties';

/**
 * The ComAdobeCqCommerceImplAssetVideoHandlerInfo model module.
 * @module model/ComAdobeCqCommerceImplAssetVideoHandlerInfo
 * @version 1.0.0
 */
class ComAdobeCqCommerceImplAssetVideoHandlerInfo {
    /**
     * Constructs a new <code>ComAdobeCqCommerceImplAssetVideoHandlerInfo</code>.
     * @alias module:model/ComAdobeCqCommerceImplAssetVideoHandlerInfo
     */
    constructor() { 
        
        ComAdobeCqCommerceImplAssetVideoHandlerInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqCommerceImplAssetVideoHandlerInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqCommerceImplAssetVideoHandlerInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqCommerceImplAssetVideoHandlerInfo} The populated <code>ComAdobeCqCommerceImplAssetVideoHandlerInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqCommerceImplAssetVideoHandlerInfo();

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
                obj['properties'] = ComAdobeCqCommerceImplAssetVideoHandlerProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqCommerceImplAssetVideoHandlerInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqCommerceImplAssetVideoHandlerInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqCommerceImplAssetVideoHandlerInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqCommerceImplAssetVideoHandlerProperties} properties
 */
ComAdobeCqCommerceImplAssetVideoHandlerInfo.prototype['properties'] = undefined;






export default ComAdobeCqCommerceImplAssetVideoHandlerInfo;

