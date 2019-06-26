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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingFeatureflagsFeatureProperties model module.
 * @module model/OrgApacheSlingFeatureflagsFeatureProperties
 * @version 1.0.0
 */
class OrgApacheSlingFeatureflagsFeatureProperties {
    /**
     * Constructs a new <code>OrgApacheSlingFeatureflagsFeatureProperties</code>.
     * @alias module:model/OrgApacheSlingFeatureflagsFeatureProperties
     */
    constructor() { 
        
        OrgApacheSlingFeatureflagsFeatureProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingFeatureflagsFeatureProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingFeatureflagsFeatureProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingFeatureflagsFeatureProperties} The populated <code>OrgApacheSlingFeatureflagsFeatureProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingFeatureflagsFeatureProperties();

            if (data.hasOwnProperty('name')) {
                obj['name'] = ConfigNodePropertyString.constructFromObject(data['name']);
            }
            if (data.hasOwnProperty('description')) {
                obj['description'] = ConfigNodePropertyString.constructFromObject(data['description']);
            }
            if (data.hasOwnProperty('enabled')) {
                obj['enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} name
 */
OrgApacheSlingFeatureflagsFeatureProperties.prototype['name'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} description
 */
OrgApacheSlingFeatureflagsFeatureProperties.prototype['description'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} enabled
 */
OrgApacheSlingFeatureflagsFeatureProperties.prototype['enabled'] = undefined;






export default OrgApacheSlingFeatureflagsFeatureProperties;
