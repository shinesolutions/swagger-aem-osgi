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
#import "OAIConfigNodePropertyString.h"
@protocol OAIConfigNodePropertyBoolean;
@class OAIConfigNodePropertyBoolean;
@protocol OAIConfigNodePropertyString;
@class OAIConfigNodePropertyString;



@protocol OAIComDayCqDamIdsImplIDSJobProcessorProperties
@end

@interface OAIComDayCqDamIdsImplIDSJobProcessorProperties : OAIObject


@property(nonatomic) OAIConfigNodePropertyBoolean* enableMultisession;

@property(nonatomic) OAIConfigNodePropertyBoolean* idsCcEnable;

@property(nonatomic) OAIConfigNodePropertyBoolean* enableRetry;

@property(nonatomic) OAIConfigNodePropertyBoolean* enableRetryScripterror;

@property(nonatomic) OAIConfigNodePropertyString* externalizerDomainCqhost;

@property(nonatomic) OAIConfigNodePropertyString* externalizerDomainHttp;

@end