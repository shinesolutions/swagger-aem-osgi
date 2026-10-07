#import "OAIComDayCqDamIdsImplIDSPoolManagerImplProperties.h"

@implementation OAIComDayCqDamIdsImplIDSPoolManagerImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"maxErrorsToBlacklist": @"max.errors.to.blacklist", @"retryIntervalToWhitelist": @"retry.interval.to.whitelist", @"connectTimeout": @"connect.timeout", @"socketTimeout": @"socket.timeout", @"processLabel": @"process.label", @"connectionUseMax": @"connection.use.max" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"maxErrorsToBlacklist", @"retryIntervalToWhitelist", @"connectTimeout", @"socketTimeout", @"processLabel", @"connectionUseMax"];
  return [optionalProperties containsObject:propertyName];
}

@end
