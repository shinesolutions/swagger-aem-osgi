#import "OAIOrgApacheSlingHapiImplHApiUtilImplProperties.h"

@implementation OAIOrgApacheSlingHapiImplHApiUtilImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"orgApacheSlingHapiToolsResourcetype": @"org.apache.sling.hapi.tools.resourcetype", @"orgApacheSlingHapiToolsCollectionresourcetype": @"org.apache.sling.hapi.tools.collectionresourcetype", @"orgApacheSlingHapiToolsSearchpaths": @"org.apache.sling.hapi.tools.searchpaths", @"orgApacheSlingHapiToolsExternalurl": @"org.apache.sling.hapi.tools.externalurl", @"orgApacheSlingHapiToolsEnabled": @"org.apache.sling.hapi.tools.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"orgApacheSlingHapiToolsResourcetype", @"orgApacheSlingHapiToolsCollectionresourcetype", @"orgApacheSlingHapiToolsSearchpaths", @"orgApacheSlingHapiToolsExternalurl", @"orgApacheSlingHapiToolsEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
