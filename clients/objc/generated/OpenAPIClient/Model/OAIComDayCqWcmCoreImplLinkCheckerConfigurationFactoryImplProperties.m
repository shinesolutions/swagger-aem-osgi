#import "OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties.h"

@implementation OAIComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"linkExpiredPrefix": @"link.expired.prefix", @"linkExpiredRemove": @"link.expired.remove", @"linkExpiredSuffix": @"link.expired.suffix", @"linkInvalidPrefix": @"link.invalid.prefix", @"linkInvalidRemove": @"link.invalid.remove", @"linkInvalidSuffix": @"link.invalid.suffix", @"linkPredatedPrefix": @"link.predated.prefix", @"linkPredatedRemove": @"link.predated.remove", @"linkPredatedSuffix": @"link.predated.suffix", @"linkWcmmodes": @"link.wcmmodes" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"linkExpiredPrefix", @"linkExpiredRemove", @"linkExpiredSuffix", @"linkInvalidPrefix", @"linkInvalidRemove", @"linkInvalidSuffix", @"linkPredatedPrefix", @"linkPredatedRemove", @"linkPredatedSuffix", @"linkWcmmodes"];
  return [optionalProperties containsObject:propertyName];
}

@end
