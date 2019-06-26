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
import ComAdobeCqDamCfmImplComponentComponentConfigImplProperties from './ComAdobeCqDamCfmImplComponentComponentConfigImplProperties';

/**
 * The ComAdobeCqDamCfmImplComponentComponentConfigImplInfo model module.
 * @module model/ComAdobeCqDamCfmImplComponentComponentConfigImplInfo
 * @version 1.0.0
 */
class ComAdobeCqDamCfmImplComponentComponentConfigImplInfo {
    /**
     * Constructs a new <code>ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</code>.
     * @alias module:model/ComAdobeCqDamCfmImplComponentComponentConfigImplInfo
     */
    constructor() { 
        
        ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqDamCfmImplComponentComponentConfigImplInfo} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqDamCfmImplComponentComponentConfigImplInfo} The populated <code>ComAdobeCqDamCfmImplComponentComponentConfigImplInfo</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqDamCfmImplComponentComponentConfigImplInfo();

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
                obj['properties'] = ComAdobeCqDamCfmImplComponentComponentConfigImplProperties.constructFromObject(data['properties']);
            }
        }
        return obj;
    }


}

/**
 * @member {String} pid
 */
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.prototype['pid'] = undefined;

/**
 * @member {String} title
 */
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.prototype['title'] = undefined;

/**
 * @member {String} description
 */
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.prototype['description'] = undefined;

/**
 * @member {module:model/ComAdobeCqDamCfmImplComponentComponentConfigImplProperties} properties
 */
ComAdobeCqDamCfmImplComponentComponentConfigImplInfo.prototype['properties'] = undefined;






export default ComAdobeCqDamCfmImplComponentComponentConfigImplInfo;

