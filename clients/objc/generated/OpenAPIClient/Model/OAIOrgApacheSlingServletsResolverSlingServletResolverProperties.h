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


#import "OAIConfigNodePropertyArray.h"
#import "OAIConfigNodePropertyInteger.h"
#import "OAIConfigNodePropertyString.h"
@protocol OAIConfigNodePropertyArray;
@class OAIConfigNodePropertyArray;
@protocol OAIConfigNodePropertyInteger;
@class OAIConfigNodePropertyInteger;
@protocol OAIConfigNodePropertyString;
@class OAIConfigNodePropertyString;



@protocol OAIOrgApacheSlingServletsResolverSlingServletResolverProperties
@end

@interface OAIOrgApacheSlingServletsResolverSlingServletResolverProperties : OAIObject


@property(nonatomic) OAIConfigNodePropertyString* servletresolverServletRoot;

@property(nonatomic) OAIConfigNodePropertyInteger* servletresolverCacheSize;

@property(nonatomic) OAIConfigNodePropertyArray* servletresolverPaths;

@property(nonatomic) OAIConfigNodePropertyArray* servletresolverDefaultExtensions;

@end