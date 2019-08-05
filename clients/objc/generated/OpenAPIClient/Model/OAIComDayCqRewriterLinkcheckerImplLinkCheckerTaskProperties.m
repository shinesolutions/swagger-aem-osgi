#import "OAIComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties.h"

@implementation OAIComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"schedulerPeriod": @"scheduler.period", @"schedulerConcurrent": @"scheduler.concurrent", @"goodLinkTestInterval": @"good_link_test_interval", @"badLinkTestInterval": @"bad_link_test_interval", @"linkUnusedInterval": @"link_unused_interval", @"connectionTimeout": @"connection.timeout" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"schedulerPeriod", @"schedulerConcurrent", @"goodLinkTestInterval", @"badLinkTestInterval", @"linkUnusedInterval", @"connectionTimeout"];
  return [optionalProperties containsObject:propertyName];
}

@end
