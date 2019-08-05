#import "OAIComDayCqWidgetImplHtmlLibraryManagerImplProperties.h"

@implementation OAIComDayCqWidgetImplHtmlLibraryManagerImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"htmllibmanagerClientmanager": @"htmllibmanager.clientmanager", @"htmllibmanagerDebug": @"htmllibmanager.debug", @"htmllibmanagerDebugConsole": @"htmllibmanager.debug.console", @"htmllibmanagerDebugInitJs": @"htmllibmanager.debug.init.js", @"htmllibmanagerDefaultthemename": @"htmllibmanager.defaultthemename", @"htmllibmanagerDefaultuserthemename": @"htmllibmanager.defaultuserthemename", @"htmllibmanagerFirebuglitePath": @"htmllibmanager.firebuglite.path", @"htmllibmanagerForceCQUrlInfo": @"htmllibmanager.forceCQUrlInfo", @"htmllibmanagerGzip": @"htmllibmanager.gzip", @"htmllibmanagerMaxage": @"htmllibmanager.maxage", @"htmllibmanagerMaxDataUriSize": @"htmllibmanager.maxDataUriSize", @"htmllibmanagerMinify": @"htmllibmanager.minify", @"htmllibmanagerPathList": @"htmllibmanager.path.list", @"htmllibmanagerTiming": @"htmllibmanager.timing" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"htmllibmanagerClientmanager", @"htmllibmanagerDebug", @"htmllibmanagerDebugConsole", @"htmllibmanagerDebugInitJs", @"htmllibmanagerDefaultthemename", @"htmllibmanagerDefaultuserthemename", @"htmllibmanagerFirebuglitePath", @"htmllibmanagerForceCQUrlInfo", @"htmllibmanagerGzip", @"htmllibmanagerMaxage", @"htmllibmanagerMaxDataUriSize", @"htmllibmanagerMinify", @"htmllibmanagerPathList", @"htmllibmanagerTiming"];
  return [optionalProperties containsObject:propertyName];
}

@end
