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
import ConfigNodePropertyArray from './ConfigNodePropertyArray';

/**
 * The ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties model module.
 * @module model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties
 * @version 1.0.0
 */
class ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties {
    /**
     * Constructs a new <code>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</code>.
     * @alias module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties
     */
    constructor() { 
        
        ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties} The populated <code>ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties();

            if (data.hasOwnProperty('parameter.whitelist')) {
                obj['parameter.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['parameter.whitelist']);
            }
            if (data.hasOwnProperty('parameter.whitelist.prefixes')) {
                obj['parameter.whitelist.prefixes'] = ConfigNodePropertyArray.constructFromObject(data['parameter.whitelist.prefixes']);
            }
            if (data.hasOwnProperty('binary.parameter.whitelist')) {
                obj['binary.parameter.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['binary.parameter.whitelist']);
            }
            if (data.hasOwnProperty('modifier.whitelist')) {
                obj['modifier.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['modifier.whitelist']);
            }
            if (data.hasOwnProperty('operation.whitelist')) {
                obj['operation.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['operation.whitelist']);
            }
            if (data.hasOwnProperty('operation.whitelist.prefixes')) {
                obj['operation.whitelist.prefixes'] = ConfigNodePropertyArray.constructFromObject(data['operation.whitelist.prefixes']);
            }
            if (data.hasOwnProperty('typehint.whitelist')) {
                obj['typehint.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['typehint.whitelist']);
            }
            if (data.hasOwnProperty('resourcetype.whitelist')) {
                obj['resourcetype.whitelist'] = ConfigNodePropertyArray.constructFromObject(data['resourcetype.whitelist']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} parameter.whitelist
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['parameter.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} parameter.whitelist.prefixes
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['parameter.whitelist.prefixes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} binary.parameter.whitelist
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['binary.parameter.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} modifier.whitelist
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['modifier.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} operation.whitelist
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['operation.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} operation.whitelist.prefixes
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['operation.whitelist.prefixes'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} typehint.whitelist
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['typehint.whitelist'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyArray} resourcetype.whitelist
 */
ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties.prototype['resourcetype.whitelist'] = undefined;






export default ComDayCqWcmFoundationSecurityImplSaferSlingPostValidatorImplProperties;

