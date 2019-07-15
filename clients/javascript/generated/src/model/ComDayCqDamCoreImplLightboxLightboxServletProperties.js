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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqDamCoreImplLightboxLightboxServletProperties model module.
 * @module model/ComDayCqDamCoreImplLightboxLightboxServletProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplLightboxLightboxServletProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplLightboxLightboxServletProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplLightboxLightboxServletProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplLightboxLightboxServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplLightboxLightboxServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplLightboxLightboxServletProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplLightboxLightboxServletProperties} The populated <code>ComDayCqDamCoreImplLightboxLightboxServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplLightboxLightboxServletProperties();

            if (data.hasOwnProperty('sling.servlet.paths')) {
                obj['sling.servlet.paths'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.paths']);
            }
            if (data.hasOwnProperty('sling.servlet.methods')) {
                obj['sling.servlet.methods'] = ConfigNodePropertyArray.constructFromObject(data['sling.servlet.methods']);
            }
            if (data.hasOwnProperty('cq.dam.enable.anonymous')) {
                obj['cq.dam.enable.anonymous'] = ConfigNodePropertyBoolean.constructFromObject(data['cq.dam.enable.anonymous']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.paths
 */
ComDayCqDamCoreImplLightboxLightboxServletProperties.prototype['sling.servlet.paths'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} sling.servlet.methods
 */
ComDayCqDamCoreImplLightboxLightboxServletProperties.prototype['sling.servlet.methods'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} cq.dam.enable.anonymous
 */
ComDayCqDamCoreImplLightboxLightboxServletProperties.prototype['cq.dam.enable.anonymous'] = undefined;






export default ComDayCqDamCoreImplLightboxLightboxServletProperties;

