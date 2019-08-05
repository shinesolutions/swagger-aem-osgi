#import "OAIComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties.h"

@implementation OAIComDayCommonsDatasourceJdbcpoolJdbcPoolServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"jdbcDriverClass": @"jdbc.driver.class", @"jdbcConnectionUri": @"jdbc.connection.uri", @"jdbcUsername": @"jdbc.username", @"jdbcPassword": @"jdbc.password", @"jdbcValidationQuery": @"jdbc.validation.query", @"defaultReadonly": @"default.readonly", @"defaultAutocommit": @"default.autocommit", @"poolSize": @"pool.size", @"poolMaxWaitMsec": @"pool.max.wait.msec", @"datasourceName": @"datasource.name", @"datasourceSvcProperties": @"datasource.svc.properties" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"jdbcDriverClass", @"jdbcConnectionUri", @"jdbcUsername", @"jdbcPassword", @"jdbcValidationQuery", @"defaultReadonly", @"defaultAutocommit", @"poolSize", @"poolMaxWaitMsec", @"datasourceName", @"datasourceSvcProperties"];
  return [optionalProperties containsObject:propertyName];
}

@end
