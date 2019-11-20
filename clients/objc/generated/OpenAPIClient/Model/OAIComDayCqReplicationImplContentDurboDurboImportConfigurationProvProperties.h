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
#import "OAIConfigNodePropertyBoolean.h"
#import "OAIConfigNodePropertyInteger.h"
@protocol OAIConfigNodePropertyArray;
@class OAIConfigNodePropertyArray;
@protocol OAIConfigNodePropertyBoolean;
@class OAIConfigNodePropertyBoolean;
@protocol OAIConfigNodePropertyInteger;
@class OAIConfigNodePropertyInteger;



@protocol OAIComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties
@end

@interface OAIComDayCqReplicationImplContentDurboDurboImportConfigurationProvProperties : OAIObject


@property(nonatomic) OAIConfigNodePropertyBoolean* preserveHierarchyNodes;

@property(nonatomic) OAIConfigNodePropertyBoolean* ignoreVersioning;

@property(nonatomic) OAIConfigNodePropertyBoolean* importAcl;

@property(nonatomic) OAIConfigNodePropertyInteger* saveThreshold;

@property(nonatomic) OAIConfigNodePropertyBoolean* preserveUserPaths;

@property(nonatomic) OAIConfigNodePropertyBoolean* preserveUuid;

@property(nonatomic) OAIConfigNodePropertyArray* preserveUuidNodetypes;

@property(nonatomic) OAIConfigNodePropertyArray* preserveUuidSubtrees;

@property(nonatomic) OAIConfigNodePropertyBoolean* autoCommit;

@end