#import "OAIOrgApacheSlingSecurityImplReferrerFilterProperties.h"

@implementation OAIOrgApacheSlingSecurityImplReferrerFilterProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"allowEmpty": @"allow.empty", @"allowHosts": @"allow.hosts", @"allowHostsRegexp": @"allow.hosts.regexp", @"filterMethods": @"filter.methods", @"excludeAgentsRegexp": @"exclude.agents.regexp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"allowEmpty", @"allowHosts", @"allowHostsRegexp", @"filterMethods", @"excludeAgentsRegexp"];
  return [optionalProperties containsObject:propertyName];
}

@end
