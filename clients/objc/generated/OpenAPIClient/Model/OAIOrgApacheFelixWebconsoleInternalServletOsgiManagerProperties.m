#import "OAIOrgApacheFelixWebconsoleInternalServletOsgiManagerProperties.h"

@implementation OAIOrgApacheFelixWebconsoleInternalServletOsgiManagerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"managerRoot": @"manager.root", @"httpServiceFilter": @"http.service.filter", @"defaultRender": @"default.render", @"realm": @"realm", @"username": @"username", @"password": @"password", @"category": @"category", @"locale": @"locale", @"loglevel": @"loglevel", @"plugins": @"plugins" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"managerRoot", @"httpServiceFilter", @"defaultRender", @"realm", @"username", @"password", @"category", @"locale", @"loglevel", @"plugins"];
  return [optionalProperties containsObject:propertyName];
}

@end
