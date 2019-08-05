#import "OAIComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties.h"

@implementation OAIComDayCqDamCommonsMetadataXmpFilterBlackWhiteProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"xmpFilterApplyWhitelist": @"xmp.filter.apply_whitelist", @"xmpFilterWhitelist": @"xmp.filter.whitelist", @"xmpFilterApplyBlacklist": @"xmp.filter.apply_blacklist", @"xmpFilterBlacklist": @"xmp.filter.blacklist" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"xmpFilterApplyWhitelist", @"xmpFilterWhitelist", @"xmpFilterApplyBlacklist", @"xmpFilterBlacklist"];
  return [optionalProperties containsObject:propertyName];
}

@end
