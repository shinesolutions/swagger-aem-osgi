#import "OAIComDayCqDamCoreImplServletBatchMetadataServletProperties.h"

@implementation OAIComDayCqDamCoreImplServletBatchMetadataServletProperties

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamBatchMetadataAssetDefault": @"cq.dam.batch.metadata.asset.default", @"cqDamBatchMetadataCollectionDefault": @"cq.dam.batch.metadata.collection.default", @"cqDamBatchMetadataMaxresources": @"cq.dam.batch.metadata.maxresources" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamBatchMetadataAssetDefault", @"cqDamBatchMetadataCollectionDefault", @"cqDamBatchMetadataMaxresources"];
  return [optionalProperties containsObject:propertyName];
}

@end
