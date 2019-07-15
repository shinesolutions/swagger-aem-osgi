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
 * The ComDayCqAuthImplCugCugSupportImplProperties model module.
 * @module model/ComDayCqAuthImplCugCugSupportImplProperties
 * @version 1.0.0
 */
class ComDayCqAuthImplCugCugSupportImplProperties {
    /**
     * Constructs a new <code>ComDayCqAuthImplCugCugSupportImplProperties</code>.
     * @alias module:model/ComDayCqAuthImplCugCugSupportImplProperties
     */
    constructor() { 
        
        ComDayCqAuthImplCugCugSupportImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqAuthImplCugCugSupportImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqAuthImplCugCugSupportImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqAuthImplCugCugSupportImplProperties} The populated <code>ComDayCqAuthImplCugCugSupportImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqAuthImplCugCugSupportImplProperties();

            if (data.hasOwnProperty('cug.exempted.principals')) {
                obj['cug.exempted.principals'] = ConfigNodePropertyArray.constructFromObject(data['cug.exempted.principals']);
            }
            if (data.hasOwnProperty('cug.enabled')) {
                obj['cug.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['cug.enabled']);
            }
            if (data.hasOwnProperty('cug.principals.regex')) {
                obj['cug.principals.regex'] = ConfigNodePropertyString.constructFromObject(data['cug.principals.regex']);
            }
            if (data.hasOwnProperty('cug.principals.replacement')) {
                obj['cug.principals.replacement'] = ConfigNodePropertyString.constructFromObject(data['cug.principals.replacement']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} cug.exempted.principals
 */
ComDayCqAuthImplCugCugSupportImplProperties.prototype['cug.exempted.principals'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} cug.enabled
 */
ComDayCqAuthImplCugCugSupportImplProperties.prototype['cug.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cug.principals.regex
 */
ComDayCqAuthImplCugCugSupportImplProperties.prototype['cug.principals.regex'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cug.principals.replacement
 */
ComDayCqAuthImplCugCugSupportImplProperties.prototype['cug.principals.replacement'] = undefined;






export default ComDayCqAuthImplCugCugSupportImplProperties;

