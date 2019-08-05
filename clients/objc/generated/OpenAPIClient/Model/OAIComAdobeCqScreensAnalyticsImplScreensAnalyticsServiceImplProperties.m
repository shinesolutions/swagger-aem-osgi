#import "OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties.h"

@implementation OAIComAdobeCqScreensAnalyticsImplScreensAnalyticsServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"comAdobeCqScreensAnalyticsImplUrl": @"com.adobe.cq.screens.analytics.impl.url", @"comAdobeCqScreensAnalyticsImplApikey": @"com.adobe.cq.screens.analytics.impl.apikey", @"comAdobeCqScreensAnalyticsImplProject": @"com.adobe.cq.screens.analytics.impl.project", @"comAdobeCqScreensAnalyticsImplEnvironment": @"com.adobe.cq.screens.analytics.impl.environment", @"comAdobeCqScreensAnalyticsImplSendFrequency": @"com.adobe.cq.screens.analytics.impl.sendFrequency" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"comAdobeCqScreensAnalyticsImplUrl", @"comAdobeCqScreensAnalyticsImplApikey", @"comAdobeCqScreensAnalyticsImplProject", @"comAdobeCqScreensAnalyticsImplEnvironment", @"comAdobeCqScreensAnalyticsImplSendFrequency"];
  return [optionalProperties containsObject:propertyName];
}

@end
