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



@protocol OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties
@end

@interface OAIComAdobeCqSocialSyncImplDiffChangesObserverProperties : OAIObject


@property(nonatomic) OAIConfigNodePropertyBoolean* enabled;

@property(nonatomic) OAIConfigNodePropertyString* agentName;

@property(nonatomic) OAIConfigNodePropertyString* diffPath;

@property(nonatomic) OAIConfigNodePropertyString* propertyNames;

@end