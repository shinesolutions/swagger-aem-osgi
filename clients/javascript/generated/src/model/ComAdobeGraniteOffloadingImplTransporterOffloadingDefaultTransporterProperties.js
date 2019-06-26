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
 * The ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties model module.
 * @module model/ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties
 * @version 1.0.0
 */
class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties {
    /**
     * Constructs a new <code>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties</code>.
     * @alias module:model/ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties
     */
    constructor() { 
        
        ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties} The populated <code>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties();

            if (data.hasOwnProperty('default.transport.agent-to-worker.prefix')) {
                obj['default.transport.agent-to-worker.prefix'] = ConfigNodePropertyString.constructFromObject(data['default.transport.agent-to-worker.prefix']);
            }
            if (data.hasOwnProperty('default.transport.agent-to-master.prefix')) {
                obj['default.transport.agent-to-master.prefix'] = ConfigNodePropertyString.constructFromObject(data['default.transport.agent-to-master.prefix']);
            }
            if (data.hasOwnProperty('default.transport.input.package')) {
                obj['default.transport.input.package'] = ConfigNodePropertyString.constructFromObject(data['default.transport.input.package']);
            }
            if (data.hasOwnProperty('default.transport.output.package')) {
                obj['default.transport.output.package'] = ConfigNodePropertyString.constructFromObject(data['default.transport.output.package']);
            }
            if (data.hasOwnProperty('default.transport.replication.synchronous')) {
                obj['default.transport.replication.synchronous'] = ConfigNodePropertyBoolean.constructFromObject(data['default.transport.replication.synchronous']);
            }
            if (data.hasOwnProperty('default.transport.contentpackage')) {
                obj['default.transport.contentpackage'] = ConfigNodePropertyBoolean.constructFromObject(data['default.transport.contentpackage']);
            }
            if (data.hasOwnProperty('offloading.transporter.default.enabled')) {
                obj['offloading.transporter.default.enabled'] = ConfigNodePropertyBoolean.constructFromObject(data['offloading.transporter.default.enabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyString} default.transport.agent-to-worker.prefix
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['default.transport.agent-to-worker.prefix'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} default.transport.agent-to-master.prefix
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['default.transport.agent-to-master.prefix'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} default.transport.input.package
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['default.transport.input.package'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} default.transport.output.package
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['default.transport.output.package'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} default.transport.replication.synchronous
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['default.transport.replication.synchronous'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} default.transport.contentpackage
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['default.transport.contentpackage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} offloading.transporter.default.enabled
 */
ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties.prototype['offloading.transporter.default.enabled'] = undefined;






export default ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTransporterProperties;

