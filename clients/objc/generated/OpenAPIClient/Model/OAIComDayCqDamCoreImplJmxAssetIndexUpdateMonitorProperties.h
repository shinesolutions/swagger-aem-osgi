#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Adobe Experience Manager OSGI config (AEM) API
* Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
*
* OpenAPI spec version: 1.0.0-pre.0
* Contact: opensource@shinesolutions.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAIConfigNodePropertyBoolean.h"
#import "OAIConfigNodePropertyFloat.h"
#import "OAIConfigNodePropertyInteger.h"
#import "OAIConfigNodePropertyString.h"
@protocol OAIConfigNodePropertyBoolean;
@class OAIConfigNodePropertyBoolean;
@protocol OAIConfigNodePropertyFloat;
@class OAIConfigNodePropertyFloat;
@protocol OAIConfigNodePropertyInteger;
@class OAIConfigNodePropertyInteger;
@protocol OAIConfigNodePropertyString;
@class OAIConfigNodePropertyString;



@protocol OAIComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties
@end

@interface OAIComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties : OAIObject


@property(nonatomic) OAIConfigNodePropertyString* jmxObjectname;

@property(nonatomic) OAIConfigNodePropertyBoolean* propertyMeasureEnabled;

@property(nonatomic) OAIConfigNodePropertyString* propertyName;

@property(nonatomic) OAIConfigNodePropertyInteger* propertyMaxWaitMs;

@property(nonatomic) OAIConfigNodePropertyFloat* propertyMaxRate;

@property(nonatomic) OAIConfigNodePropertyBoolean* fulltextMeasureEnabled;

@property(nonatomic) OAIConfigNodePropertyString* fulltextName;

@property(nonatomic) OAIConfigNodePropertyInteger* fulltextMaxWaitMs;

@property(nonatomic) OAIConfigNodePropertyFloat* fulltextMaxRate;

@end