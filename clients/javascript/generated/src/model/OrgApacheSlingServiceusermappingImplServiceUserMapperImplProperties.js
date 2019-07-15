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
 * The OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties model module.
 * @module model/OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
 * @version 1.0.0
 */
class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {
    /**
     * Constructs a new <code>OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</code>.
     * @alias module:model/OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties
     */
    constructor() { 
        
        OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties} The populated <code>OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties();

            if (data.hasOwnProperty('user.mapping')) {
                obj['user.mapping'] = ConfigNodePropertyArray.constructFromObject(data['user.mapping']);
            }
            if (data.hasOwnProperty('user.default')) {
                obj['user.default'] = ConfigNodePropertyString.constructFromObject(data['user.default']);
            }
            if (data.hasOwnProperty('user.enable.default.mapping')) {
                obj['user.enable.default.mapping'] = ConfigNodePropertyBoolean.constructFromObject(data['user.enable.default.mapping']);
            }
            if (data.hasOwnProperty('require.validation')) {
                obj['require.validation'] = ConfigNodePropertyBoolean.constructFromObject(data['require.validation']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} user.mapping
 */
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.prototype['user.mapping'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} user.default
 */
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.prototype['user.default'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} user.enable.default.mapping
 */
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.prototype['user.enable.default.mapping'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} require.validation
 */
OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties.prototype['require.validation'] = undefined;






export default OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties;

