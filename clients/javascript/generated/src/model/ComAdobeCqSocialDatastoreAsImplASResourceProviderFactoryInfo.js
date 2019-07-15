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
import ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties from './ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties';

/**
 * The ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo model module.
 * @module model/ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo
 * @version 1.0.0
 */
class ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo {
    /**
     * Constructs a new <code>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</code>.
     * @alias module:model/ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo
     */
    constructor() { 
        
        ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo} The populated <code>ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo();

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
                obj['properties'] = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties} properties
 */
ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo.prototype['properties'] = undefined;






export default ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryInfo;

