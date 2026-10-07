#import "OAIComDayCqDamIdsImplIDSJobProcessorProperties.h"

@implementation OAIComDayCqDamIdsImplIDSJobProcessorProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"enableMultisession": @"enable.multisession", @"idsCcEnable": @"ids.cc.enable", @"enableRetry": @"enable.retry", @"enableRetryScripterror": @"enable.retry.scripterror", @"externalizerDomainCqhost": @"externalizer.domain.cqhost", @"externalizerDomainHttp": @"externalizer.domain.http" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"enableMultisession", @"idsCcEnable", @"enableRetry", @"enableRetryScripterror", @"externalizerDomainCqhost", @"externalizerDomainHttp"];
  return [optionalProperties containsObject:propertyName];
}

@end
