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
import ConfigNodePropertyDropDown from './ConfigNodePropertyDropDown';
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';

/**
 * The OrgApacheFelixScrScrServiceProperties model module.
 * @module model/OrgApacheFelixScrScrServiceProperties
 * @version 1.0.0
 */
class OrgApacheFelixScrScrServiceProperties {
    /**
     * Constructs a new <code>OrgApacheFelixScrScrServiceProperties</code>.
     * @alias module:model/OrgApacheFelixScrScrServiceProperties
     */
    constructor() { 
        
        OrgApacheFelixScrScrServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>OrgApacheFelixScrScrServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/OrgApacheFelixScrScrServiceProperties} obj Optional instance to populate.
     * @return {module:model/OrgApacheFelixScrScrServiceProperties} The populated <code>OrgApacheFelixScrScrServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new OrgApacheFelixScrScrServiceProperties();

            if (data.hasOwnProperty('ds.loglevel')) {
                obj['ds.loglevel'] = ConfigNodePropertyDropDown.constructFromObject(data['ds.loglevel']);
            }
            if (data.hasOwnProperty('ds.factory.enabled')) {
                obj['ds.factory.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['ds.factory.enabled']);
            }
            if (data.hasOwnProperty('ds.delayed.keepInstances')) {
                obj['ds.delayed.keepInstances'] = ConfigNodePropertyBoolean.constructFromObject(data['ds.delayed.keepInstances']);
            }
            if (data.hasOwnProperty('ds.lock.timeout.milliseconds')) {
                obj['ds.lock.timeout.milliseconds'] = ConfigNodePropertyInteger.constructFromObject(data['ds.lock.timeout.milliseconds']);
            }
            if (data.hasOwnProperty('ds.stop.timeout.milliseconds')) {
                obj['ds.stop.timeout.milliseconds'] = ConfigNodePropertyInteger.constructFromObject(data['ds.stop.timeout.milliseconds']);
            }
            if (data.hasOwnProperty('ds.global.extender')) {
                obj['ds.global.extender'] = ConfigNodePropertyBoolean.constructFromObject(data['ds.global.extender']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyDropDown} ds.loglevel
 */
OrgApacheFelixScrScrServiceProperties.prototype['ds.loglevel'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} ds.factory.enabled
 */
OrgApacheFelixScrScrServiceProperties.prototype['ds.factory.enabled'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} ds.delayed.keepInstances
 */
OrgApacheFelixScrScrServiceProperties.prototype['ds.delayed.keepInstances'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} ds.lock.timeout.milliseconds
 */
OrgApacheFelixScrScrServiceProperties.prototype['ds.lock.timeout.milliseconds'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} ds.stop.timeout.milliseconds
 */
OrgApacheFelixScrScrServiceProperties.prototype['ds.stop.timeout.milliseconds'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} ds.global.extender
 */
OrgApacheFelixScrScrServiceProperties.prototype['ds.global.extender'] = undefined;






export default OrgApacheFelixScrScrServiceProperties;

