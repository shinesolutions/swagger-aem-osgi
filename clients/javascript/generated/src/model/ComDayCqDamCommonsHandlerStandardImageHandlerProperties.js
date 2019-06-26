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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The ComDayCqDamCommonsHandlerStandardImageHandlerProperties model module.
 * @module model/ComDayCqDamCommonsHandlerStandardImageHandlerProperties
 * @version 1.0.0
 */
class ComDayCqDamCommonsHandlerStandardImageHandlerProperties {
    /**
     * Constructs a new <code>ComDayCqDamCommonsHandlerStandardImageHandlerProperties</code>.
     * @alias module:model/ComDayCqDamCommonsHandlerStandardImageHandlerProperties
     */
    constructor() { 
        
        ComDayCqDamCommonsHandlerStandardImageHandlerProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCommonsHandlerStandardImageHandlerProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCommonsHandlerStandardImageHandlerProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCommonsHandlerStandardImageHandlerProperties} The populated <code>ComDayCqDamCommonsHandlerStandardImageHandlerProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCommonsHandlerStandardImageHandlerProperties();

            if (data.hasOwnProperty('large_file_threshold')) {
                obj['large_file_threshold'] = ConfigNodePropertyInteger.constructFromObject(data['large_file_threshold']);
            }
            if (data.hasOwnProperty('large_comment_threshold')) {
                obj['large_comment_threshold'] = ConfigNodePropertyInteger.constructFromObject(data['large_comment_threshold']);
            }
            if (data.hasOwnProperty('cq.dam.enable.ext.meta.extraction')) {
                obj['cq.dam.enable.ext.meta.extraction'] = ConfigNodePropertyBoolean.constructFromObject(data['cq.dam.enable.ext.meta.extraction']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} large_file_threshold
 */
ComDayCqDamCommonsHandlerStandardImageHandlerProperties.prototype['large_file_threshold'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} large_comment_threshold
 */
ComDayCqDamCommonsHandlerStandardImageHandlerProperties.prototype['large_comment_threshold'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} cq.dam.enable.ext.meta.extraction
 */
ComDayCqDamCommonsHandlerStandardImageHandlerProperties.prototype['cq.dam.enable.ext.meta.extraction'] = undefined;






export default ComDayCqDamCommonsHandlerStandardImageHandlerProperties;

