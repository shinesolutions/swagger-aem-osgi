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
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties model module.
 * @module model/ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
 * @version 1.0.0
 */
class ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</code>.
     * @alias module:model/ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties
     */
    constructor() { 
        
        ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties} The populated <code>ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties();

            if (data.hasOwnProperty('defaultConnectorName')) {
                obj['defaultConnectorName'] = ConfigNodePropertyString.constructFromObject(data['defaultConnectorName']);
            }
            if (data.hasOwnProperty('defaultCategory')) {
                obj['defaultCategory'] = ConfigNodePropertyString.constructFromObject(data['defaultCategory']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} defaultConnectorName
 */
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.prototype['defaultConnectorName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} defaultCategory
 */
ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties.prototype['defaultCategory'] = undefined;






export default ComAdobeGraniteTranslationCoreImplTranslationManagerImplProperties;

