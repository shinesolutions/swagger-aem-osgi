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
import ConfigNodePropertyInteger from './ConfigNodePropertyInteger';
import ConfigNodePropertyString from './ConfigNodePropertyString';

/**
 * The ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties model module.
 * @module model/ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
 * @version 1.0.0
 */
class ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties {
    /**
     * Constructs a new <code>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</code>.
     * @alias module:model/ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties
     */
    constructor() { 
        
        ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties} obj Optional instance to populate.
     * @return {module:model/ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties} The populated <code>ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties();

            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.document.width')) {
                obj['cq.dam.config.annotation.pdf.document.width'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.document.width']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.document.height')) {
                obj['cq.dam.config.annotation.pdf.document.height'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.document.height']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.document.padding.horizontal')) {
                obj['cq.dam.config.annotation.pdf.document.padding.horizontal'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.document.padding.horizontal']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.document.padding.vertical')) {
                obj['cq.dam.config.annotation.pdf.document.padding.vertical'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.document.padding.vertical']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.font.size')) {
                obj['cq.dam.config.annotation.pdf.font.size'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.font.size']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.font.color')) {
                obj['cq.dam.config.annotation.pdf.font.color'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.config.annotation.pdf.font.color']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.font.family')) {
                obj['cq.dam.config.annotation.pdf.font.family'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.config.annotation.pdf.font.family']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.font.light')) {
                obj['cq.dam.config.annotation.pdf.font.light'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.config.annotation.pdf.font.light']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.marginTextImage')) {
                obj['cq.dam.config.annotation.pdf.marginTextImage'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.marginTextImage']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.minImageHeight')) {
                obj['cq.dam.config.annotation.pdf.minImageHeight'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.minImageHeight']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.reviewStatus.width')) {
                obj['cq.dam.config.annotation.pdf.reviewStatus.width'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.reviewStatus.width']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.reviewStatus.color.approved')) {
                obj['cq.dam.config.annotation.pdf.reviewStatus.color.approved'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.config.annotation.pdf.reviewStatus.color.approved']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.reviewStatus.color.rejected')) {
                obj['cq.dam.config.annotation.pdf.reviewStatus.color.rejected'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.config.annotation.pdf.reviewStatus.color.rejected']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested')) {
                obj['cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested'] = ConfigNodePropertyString.constructFromObject(data['cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.annotationMarker.width')) {
                obj['cq.dam.config.annotation.pdf.annotationMarker.width'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.annotationMarker.width']);
            }
            if (data.hasOwnProperty('cq.dam.config.annotation.pdf.asset.minheight')) {
                obj['cq.dam.config.annotation.pdf.asset.minheight'] = ConfigNodePropertyInteger.constructFromObject(data['cq.dam.config.annotation.pdf.asset.minheight']);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.document.width
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.document.width'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.document.height
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.document.height'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.document.padding.horizontal
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.document.padding.horizontal'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.document.padding.vertical
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.document.padding.vertical'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.font.size
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.font.size'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.config.annotation.pdf.font.color
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.font.color'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.config.annotation.pdf.font.family
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.font.family'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.config.annotation.pdf.font.light
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.font.light'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.marginTextImage
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.marginTextImage'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.minImageHeight
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.minImageHeight'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.reviewStatus.width
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.reviewStatus.width'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.config.annotation.pdf.reviewStatus.color.approved
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.reviewStatus.color.approved'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.config.annotation.pdf.reviewStatus.color.rejected
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.reviewStatus.color.rejected'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyString} cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.annotationMarker.width
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.annotationMarker.width'] = undefined;

/**
 * @member {module:model/ConfigNodePropertyInteger} cq.dam.config.annotation.pdf.asset.minheight
 */
ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.prototype['cq.dam.config.annotation.pdf.asset.minheight'] = undefined;






export default ComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties;
