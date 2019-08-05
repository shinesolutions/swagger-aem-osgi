#import "OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.h"

@implementation OAIComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"translationFactory": @"translationFactory", @"defaultConnectorLabel": @"defaultConnectorLabel", @"defaultConnectorAttribution": @"defaultConnectorAttribution", @"defaultConnectorWorkspaceId": @"defaultConnectorWorkspaceId", @"defaultConnectorSubscriptionKey": @"defaultConnectorSubscriptionKey", @"languageMapLocation": @"languageMapLocation", @"categoryMapLocation": @"categoryMapLocation", @"retryAttempts": @"retryAttempts", @"timeoutCount": @"timeoutCount" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"translationFactory", @"defaultConnectorLabel", @"defaultConnectorAttribution", @"defaultConnectorWorkspaceId", @"defaultConnectorSubscriptionKey", @"languageMapLocation", @"categoryMapLocation", @"retryAttempts", @"timeoutCount"];
  return [optionalProperties containsObject:propertyName];
}

@end
