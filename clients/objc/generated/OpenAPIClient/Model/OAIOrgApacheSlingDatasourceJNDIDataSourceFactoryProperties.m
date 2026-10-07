#import "OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties.h"

@implementation OAIOrgApacheSlingDatasourceJNDIDataSourceFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"datasourceName": @"datasource.name", @"datasourceSvcPropName": @"datasource.svc.prop.name", @"datasourceJndiName": @"datasource.jndi.name", @"jndiProperties": @"jndi.properties" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"datasourceName", @"datasourceSvcPropName", @"datasourceJndiName", @"jndiProperties"];
  return [optionalProperties containsObject:propertyName];
}

@end
