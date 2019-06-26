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
 * The ComDayCqWidgetImplWidgetExtensionProviderImplProperties model module.
 * @module model/ComDayCqWidgetImplWidgetExtensionProviderImplProperties
 * @version 1.0.0
 */
class ComDayCqWidgetImplWidgetExtensionProviderImplProperties {
    /**
     * Constructs a new <code>ComDayCqWidgetImplWidgetExtensionProviderImplProperties</code>.
     * @alias module:model/ComDayCqWidgetImplWidgetExtensionProviderImplProperties
     */
    constructor() { 
        
        ComDayCqWidgetImplWidgetExtensionProviderImplProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqWidgetImplWidgetExtensionProviderImplProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqWidgetImplWidgetExtensionProviderImplProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqWidgetImplWidgetExtensionProviderImplProperties} The populated <code>ComDayCqWidgetImplWidgetExtensionProviderImplProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqWidgetImplWidgetExtensionProviderImplProperties();

            if (data.hasOwnProperty('extendable.widgets')) {
                obj['extendable.widgets'] = ConfigNodePropertyArray.constructFromObject(data['extendable.widgets']);
            }
            if (data.hasOwnProperty('widgetextensionprovider.debug')) {
                obj['widgetextensionprovider.debug'] = ConfigNodePropertyBoolean.constructFromObject(data['widgetextensionprovider.debug']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyArray} extendable.widgets
 */
ComDayCqWidgetImplWidgetExtensionProviderImplProperties.prototype['extendable.widgets'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} widgetextensionprovider.debug
 */
ComDayCqWidgetImplWidgetExtensionProviderImplProperties.prototype['widgetextensionprovider.debug'] = undefined;






export default ComDayCqWidgetImplWidgetExtensionProviderImplProperties;
