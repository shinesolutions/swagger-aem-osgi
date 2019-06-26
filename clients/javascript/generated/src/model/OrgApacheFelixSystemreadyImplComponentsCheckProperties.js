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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';

/**
 * The OrgApacheFelixSystemreadyImplComponentsCheckProperties model module.
 * @module model/OrgApacheFelixSystemreadyImplComponentsCheckProperties
 * @version 1.0.0
 */
class OrgApacheFelixSystemreadyImplComponentsCheckProperties {
    /**
     * Constructs a new <code>OrgApacheFelixSystemreadyImplComponentsCheckProperties</code>.
     * @alias module:model/OrgApacheFelixSystemreadyImplComponentsCheckProperties
     */
    constructor() { 
        
        OrgApacheFelixSystemreadyImplComponentsCheckProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheFelixSystemreadyImplComponentsCheckProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheFelixSystemreadyImplComponentsCheckProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheFelixSystemreadyImplComponentsCheckProperties} The populated <code>OrgApacheFelixSystemreadyImplComponentsCheckProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheFelixSystemreadyImplComponentsCheckProperties();

            if (data.hasOwnProperty('components.list')) {
                obj['components.list'] = ConfigNodePropertyArray.constructFromObject(data['components.list']);
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ConfigNodePropertyDropDown.constructFromObject(data['type']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} components.list
 */
OrgApacheFelixSystemreadyImplComponentsCheckProperties.prototype['components.list'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyDropDown} type
 */
OrgApacheFelixSystemreadyImplComponentsCheckProperties.prototype['type'] = undefined;






export default OrgApacheFelixSystemreadyImplComponentsCheckProperties;
