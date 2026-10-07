#import "OAIAdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.h"

@implementation OAIAdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"showPlaceholder": @"showPlaceholder", @"maximumCacheEntries": @"maximumCacheEntries", @"afScriptingCompatversion": @"af.scripting.compatversion", @"makeFileNameUnique": @"makeFileNameUnique", @"generatingCompliantData": @"generatingCompliantData" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"showPlaceholder", @"maximumCacheEntries", @"afScriptingCompatversion", @"makeFileNameUnique", @"generatingCompliantData"];
  return [optionalProperties containsObject:propertyName];
}

@end
