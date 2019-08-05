#import "OAIOrgApacheSlingDatasourceDataSourceFactoryProperties.h"

@implementation OAIOrgApacheSlingDatasourceDataSourceFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"datasourceName": @"datasource.name", @"datasourceSvcPropName": @"datasource.svc.prop.name", @"driverClassName": @"driverClassName", @"url": @"url", @"username": @"username", @"password": @"password", @"defaultAutoCommit": @"defaultAutoCommit", @"defaultReadOnly": @"defaultReadOnly", @"defaultTransactionIsolation": @"defaultTransactionIsolation", @"defaultCatalog": @"defaultCatalog", @"maxActive": @"maxActive", @"maxIdle": @"maxIdle", @"minIdle": @"minIdle", @"initialSize": @"initialSize", @"maxWait": @"maxWait", @"maxAge": @"maxAge", @"testOnBorrow": @"testOnBorrow", @"testOnReturn": @"testOnReturn", @"testWhileIdle": @"testWhileIdle", @"validationQuery": @"validationQuery", @"validationQueryTimeout": @"validationQueryTimeout", @"timeBetweenEvictionRunsMillis": @"timeBetweenEvictionRunsMillis", @"minEvictableIdleTimeMillis": @"minEvictableIdleTimeMillis", @"connectionProperties": @"connectionProperties", @"initSQL": @"initSQL", @"jdbcInterceptors": @"jdbcInterceptors", @"validationInterval": @"validationInterval", @"logValidationErrors": @"logValidationErrors", @"datasourceSvcProperties": @"datasource.svc.properties" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"datasourceName", @"datasourceSvcPropName", @"driverClassName", @"url", @"username", @"password", @"defaultAutoCommit", @"defaultReadOnly", @"defaultTransactionIsolation", @"defaultCatalog", @"maxActive", @"maxIdle", @"minIdle", @"initialSize", @"maxWait", @"maxAge", @"testOnBorrow", @"testOnReturn", @"testWhileIdle", @"validationQuery", @"validationQueryTimeout", @"timeBetweenEvictionRunsMillis", @"minEvictableIdleTimeMillis", @"connectionProperties", @"initSQL", @"jdbcInterceptors", @"validationInterval", @"logValidationErrors", @"datasourceSvcProperties"];
  return [optionalProperties containsObject:propertyName];
}

@end
