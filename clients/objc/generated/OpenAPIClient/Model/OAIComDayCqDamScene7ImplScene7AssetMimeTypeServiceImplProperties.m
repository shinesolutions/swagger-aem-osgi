#import "OAIComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties.h"

@implementation OAIComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamScene7AssetmimetypeserviceMapping": @"cq.dam.scene7.assetmimetypeservice.mapping" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamScene7AssetmimetypeserviceMapping"];
  return [optionalProperties containsObject:propertyName];
}

@end
