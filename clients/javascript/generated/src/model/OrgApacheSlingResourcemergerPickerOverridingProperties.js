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
import ConfigNodePropertyBoolean from './ConfigNodePropertyBoolean';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The OrgApacheSlingResourcemergerPickerOverridingProperties model module.
 * @module model/OrgApacheSlingResourcemergerPickerOverridingProperties
 * @version 1.0.0
 */
class OrgApacheSlingResourcemergerPickerOverridingProperties {
    /**
     * Constructs a new <code>OrgApacheSlingResourcemergerPickerOverridingProperties</code>.
     * @alias module:model/OrgApacheSlingResourcemergerPickerOverridingProperties
     */
    constructor() { 
        
        OrgApacheSlingResourcemergerPickerOverridingProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheSlingResourcemergerPickerOverridingProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheSlingResourcemergerPickerOverridingProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheSlingResourcemergerPickerOverridingProperties} The populated <code>OrgApacheSlingResourcemergerPickerOverridingProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheSlingResourcemergerPickerOverridingProperties();

            if (data.hasOwnProperty('merge.root')) {
                obj['merge.root'] = ConfigNodePropertyString.constructFromObject(data['merge.root']);
            }
            if (data.hasOwnProperty('merge.readOnly')) {
                obj['merge.readOnly'] = ConfigNodePropertyBoolean.constructFromObject(data['merge.readOnly']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} merge.root
 */
OrgApacheSlingResourcemergerPickerOverridingProperties.prototype['merge.root'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} merge.readOnly
 */
OrgApacheSlingResourcemergerPickerOverridingProperties.prototype['merge.readOnly'] = undefined;






export default OrgApacheSlingResourcemergerPickerOverridingProperties;

