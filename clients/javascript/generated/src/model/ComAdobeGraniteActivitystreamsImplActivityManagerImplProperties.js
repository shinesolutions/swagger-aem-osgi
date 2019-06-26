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

/**
 * The ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties model module.
 * @module model/ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
 * @version 1.0.0
 */
class ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</code>.
     * @alias module:model/ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties
     */
    constructor() { 
        
        ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties} The populated <code>ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties();

            if (data.hasOwnProperty('aggregate.relationships')) {
                obj['aggregate.relationships'] = ConfigNodePropertyArray.constructFromObject(data['aggregate.relationships']);
            }
            if (data.hasOwnProperty('aggregate.descend.virtual')) {
                obj['aggregate.descend.virtual'] = ConfigNodePropertyBoolean.constructFromObject(data['aggregate.descend.virtual']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} aggregate.relationships
 */
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.prototype['aggregate.relationships'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} aggregate.descend.virtual
 */
ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties.prototype['aggregate.descend.virtual'] = undefined;






export default ComAdobeGraniteActivitystreamsImplActivityManagerImplProperties;
