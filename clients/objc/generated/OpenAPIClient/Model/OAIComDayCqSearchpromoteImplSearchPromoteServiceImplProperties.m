#import "OAIComDayCqSearchpromoteImplSearchPromoteServiceImplProperties.h"

@implementation OAIComDayCqSearchpromoteImplSearchPromoteServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqSearchpromoteConfigurationServerUri": @"cq.searchpromote.configuration.server.uri", @"cqSearchpromoteConfigurationEnvironment": @"cq.searchpromote.configuration.environment", @"connectionTimeout": @"connection.timeout", @"socketTimeout": @"socket.timeout" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqSearchpromoteConfigurationServerUri", @"cqSearchpromoteConfigurationEnvironment", @"connectionTimeout", @"socketTimeout"];
  return [optionalProperties containsObject:propertyName];
}

@end
