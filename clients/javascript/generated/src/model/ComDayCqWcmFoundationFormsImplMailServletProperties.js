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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqWcmFoundationFormsImplMailServletProperties model module.
 * @module model/ComDayCqWcmFoundationFormsImplMailServletProperties
 * @version 1.0.0
 */
class ComDayCqWcmFoundationFormsImplMailServletProperties {
    /**
     * Constructs a new <code>ComDayCqWcmFoundationFormsImplMailServletProperties</code>.
     * @alias module:model/ComDayCqWcmFoundationFormsImplMailServletProperties
     */
    constructor() { 
        
        ComDayCqWcmFoundationFormsImplMailServletProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmFoundationFormsImplMailServletProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmFoundationFormsImplMailServletProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmFoundationFormsImplMailServletProperties} The populated <code>ComDayCqWcmFoundationFormsImplMailServletProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmFoundationFormsImplMailServletProperties();

            if (data.hasOwnProperty('sling.servlet.resourceTypes')) {
                obj['sling.servlet.resourceTypes'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.resourceTypes']);
            }
            if (data.hasOwnProperty('sling.servlet.selectors')) {
                obj['sling.servlet.selectors'] = ConfigNodePropertyString.constructFromObject(data['sling.servlet.selectors']);
            }
            if (data.hasOwnProperty('resource.whitelist')) {
                obj['resource.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['resource.whitelist']);
            }
            if (data.hasOwnProperty('resource.blacklist')) {
                obj['resource.blacklist'] = ConfigNodePropertyString.constructFromObject(data['resource.blacklist']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.resourceTypes
 */
ComDayCqWcmFoundationFormsImplMailServletProperties.prototype['sling.servlet.resourceTypes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} sling.servlet.selectors
 */
ComDayCqWcmFoundationFormsImplMailServletProperties.prototype['sling.servlet.selectors'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} resource.whitelist
 */
ComDayCqWcmFoundationFormsImplMailServletProperties.prototype['resource.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} resource.blacklist
 */
ComDayCqWcmFoundationFormsImplMailServletProperties.prototype['resource.blacklist'] = undefined;






export default ComDayCqWcmFoundationFormsImplMailServletProperties;

