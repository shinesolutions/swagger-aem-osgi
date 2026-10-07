#import "OAIComDayCqWcmFoundationFormsImplFormChooserServletProperties.h"

@implementation OAIComDayCqWcmFoundationFormsImplFormChooserServletProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"serviceName": @"service.name", @"slingServletResourceTypes": @"sling.servlet.resourceTypes", @"slingServletSelectors": @"sling.servlet.selectors", @"slingServletMethods": @"sling.servlet.methods", @"formsFormchooserservletAdvansesearchRequire": @"forms.formchooserservlet.advansesearch.require" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"serviceName", @"slingServletResourceTypes", @"slingServletSelectors", @"slingServletMethods", @"formsFormchooserservletAdvansesearchRequire"];
  return [optionalProperties containsObject:propertyName];
}

@end
