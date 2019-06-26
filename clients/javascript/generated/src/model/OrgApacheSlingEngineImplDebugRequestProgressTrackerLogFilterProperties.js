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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties model module.
 * @module model/OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
 * @version 1.0.0
 */
class OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties {
    /**
     * Constructs a new <code>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</code>.
     * @alias module:model/OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties
     */
    constructor() { 
        
        OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties} The populated <code>OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties();

            if (data.hasOwnProperty('extensions')) {
                obj['extensions'] = ConfigNodePropertyArray.constructFromObject(data['extensions']);
            }
            if (data.hasOwnProperty('minDurationMs')) {
                obj['minDurationMs'] = ConfigNodePropertyInteger.constructFromObject(data['minDurationMs']);
            }
            if (data.hasOwnProperty('maxDurationMs')) {
                obj['maxDurationMs'] = ConfigNodePropertyInteger.constructFromObject(data['maxDurationMs']);
            }
            if (data.hasOwnProperty('compactLogFormat')) {
                obj['compactLogFormat'] = ConfigNodePropertyBoolean.constructFromObject(data['compactLogFormat']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} extensions
 */
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.prototype['extensions'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} minDurationMs
 */
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.prototype['minDurationMs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} maxDurationMs
 */
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.prototype['maxDurationMs'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} compactLogFormat
 */
OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties.prototype['compactLogFormat'] = undefined;






export default OrgApacheSlingEngineImplDebugRequestProgressTrackerLogFilterProperties;

