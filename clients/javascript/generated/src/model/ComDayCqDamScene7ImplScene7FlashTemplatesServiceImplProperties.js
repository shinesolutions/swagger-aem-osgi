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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties model module.
 * @module model/ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
 * @version 1.0.0
 */
class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {
    /**
     * Constructs a new <code>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</code>.
     * @alias module:model/ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties
     */
    constructor() { 
        
        ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties} The populated <code>ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties();

            if (data.hasOwnProperty('scene7FlashTemplates.rti')) {
                obj['scene7FlashTemplates.rti'] = ConfigNodePropertyString.constructFromObject(data['scene7FlashTemplates.rti']);
            }
            if (data.hasOwnProperty('scene7FlashTemplates.rsi')) {
                obj['scene7FlashTemplates.rsi'] = ConfigNodePropertyString.constructFromObject(data['scene7FlashTemplates.rsi']);
            }
            if (data.hasOwnProperty('scene7FlashTemplates.rb')) {
                obj['scene7FlashTemplates.rb'] = ConfigNodePropertyString.constructFromObject(data['scene7FlashTemplates.rb']);
            }
            if (data.hasOwnProperty('scene7FlashTemplates.rurl')) {
                obj['scene7FlashTemplates.rurl'] = ConfigNodePropertyString.constructFromObject(data['scene7FlashTemplates.rurl']);
            }
            if (data.hasOwnProperty('scene7FlashTemplate.urlFormatParameter')) {
                obj['scene7FlashTemplate.urlFormatParameter'] = ConfigNodePropertyString.constructFromObject(data['scene7FlashTemplate.urlFormatParameter']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} scene7FlashTemplates.rti
 */
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.prototype['scene7FlashTemplates.rti'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} scene7FlashTemplates.rsi
 */
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.prototype['scene7FlashTemplates.rsi'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} scene7FlashTemplates.rb
 */
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.prototype['scene7FlashTemplates.rb'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} scene7FlashTemplates.rurl
 */
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.prototype['scene7FlashTemplates.rurl'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} scene7FlashTemplate.urlFormatParameter
 */
ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.prototype['scene7FlashTemplate.urlFormatParameter'] = undefined;






export default ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties;
