#import "OAIComDayCqPollingImporterImplManagedPollConfigImplProperties.h"

@implementation OAIComDayCqPollingImporterImplManagedPollConfigImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"enabled": @"enabled", @"reference": @"reference", @"interval": @"interval", @"expression": @"expression", @"source": @"source", @"target": @"target", @"login": @"login", @"password": @"password" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"_id", @"enabled", @"reference", @"interval", @"expression", @"source", @"target", @"login", @"password"];
  return [optionalProperties containsObject:propertyName];
}

@end
