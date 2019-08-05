#import "OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties.h"

@implementation OAIComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"schedulerPeriod": @"scheduler.period", @"schedulerConcurrent": @"scheduler.concurrent", @"serviceBadLinkToleranceInterval": @"service.bad_link_tolerance_interval", @"serviceCheckOverridePatterns": @"service.check_override_patterns", @"serviceCacheBrokenInternalLinks": @"service.cache_broken_internal_links", @"serviceSpecialLinkPrefix": @"service.special_link_prefix", @"serviceSpecialLinkPatterns": @"service.special_link_patterns" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"schedulerPeriod", @"schedulerConcurrent", @"serviceBadLinkToleranceInterval", @"serviceCheckOverridePatterns", @"serviceCacheBrokenInternalLinks", @"serviceSpecialLinkPrefix", @"serviceSpecialLinkPatterns"];
  return [optionalProperties containsObject:propertyName];
}

@end
