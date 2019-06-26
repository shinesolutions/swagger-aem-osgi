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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties model module.
 * @module model/ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
 * @version 1.0.0
 */
class ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties {
    /**
     * Constructs a new <code>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</code>.
     * @alias module:model/ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties
     */
    constructor() { 
        
        ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties} obj Optional instance to populate.
     * @return {module:model/ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties} The populated <code>ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties();

            if (data.hasOwnProperty('threshold')) {
                obj['threshold'] = ConfigNodePropertyInteger.constructFromObject(data['threshold']);
            }
            if (data.hasOwnProperty('jobTopicName')) {
                obj['jobTopicName'] = ConfigNodePropertyString.constructFromObject(data['jobTopicName']);
            }
            if (data.hasOwnProperty('emailEnabled')) {
                obj['emailEnabled'] = ConfigNodePropertyBoolean.constructFromObject(data['emailEnabled']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} threshold
 */
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.prototype['threshold'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} jobTopicName
 */
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.prototype['jobTopicName'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyBoolean} emailEnabled
 */
ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties.prototype['emailEnabled'] = undefined;






export default ComAdobeCqWcmJobsAsyncImplAsyncMoveConfigProviderServiceProperties;

