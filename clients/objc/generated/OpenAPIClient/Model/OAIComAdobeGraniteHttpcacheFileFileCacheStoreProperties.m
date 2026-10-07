#import "OAIComAdobeGraniteHttpcacheFileFileCacheStoreProperties.h"

@implementation OAIComAdobeGraniteHttpcacheFileFileCacheStoreProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"comAdobeGraniteHttpcacheFileDocumentRoot": @"com.adobe.granite.httpcache.file.documentRoot", @"comAdobeGraniteHttpcacheFileIncludeHost": @"com.adobe.granite.httpcache.file.includeHost" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"comAdobeGraniteHttpcacheFileDocumentRoot", @"comAdobeGraniteHttpcacheFileIncludeHost"];
  return [optionalProperties containsObject:propertyName];
}

@end
