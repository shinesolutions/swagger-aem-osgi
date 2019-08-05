#import "OAIComDayCqAuthImplLoginSelectorHandlerProperties.h"

@implementation OAIComDayCqAuthImplLoginSelectorHandlerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"path": @"path", @"serviceRanking": @"service.ranking", @"authLoginselectorMappings": @"auth.loginselector.mappings", @"authLoginselectorChangepwMappings": @"auth.loginselector.changepw.mappings", @"authLoginselectorDefaultloginpage": @"auth.loginselector.defaultloginpage", @"authLoginselectorDefaultchangepwpage": @"auth.loginselector.defaultchangepwpage", @"authLoginselectorHandle": @"auth.loginselector.handle", @"authLoginselectorHandleAllExtensions": @"auth.loginselector.handle.all.extensions" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"path", @"serviceRanking", @"authLoginselectorMappings", @"authLoginselectorChangepwMappings", @"authLoginselectorDefaultloginpage", @"authLoginselectorDefaultchangepwpage", @"authLoginselectorHandle", @"authLoginselectorHandleAllExtensions"];
  return [optionalProperties containsObject:propertyName];
}

@end
