#import "OAIComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties.h"

@implementation OAIComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"htmllibmanagerTiming": @"htmllibmanager.timing", @"htmllibmanagerDebugInitJs": @"htmllibmanager.debug.init.js", @"htmllibmanagerMinify": @"htmllibmanager.minify", @"htmllibmanagerDebug": @"htmllibmanager.debug", @"htmllibmanagerGzip": @"htmllibmanager.gzip", @"htmllibmanagerMaxDataUriSize": @"htmllibmanager.maxDataUriSize", @"htmllibmanagerMaxage": @"htmllibmanager.maxage", @"htmllibmanagerForceCQUrlInfo": @"htmllibmanager.forceCQUrlInfo", @"htmllibmanagerDefaultthemename": @"htmllibmanager.defaultthemename", @"htmllibmanagerDefaultuserthemename": @"htmllibmanager.defaultuserthemename", @"htmllibmanagerClientmanager": @"htmllibmanager.clientmanager", @"htmllibmanagerPathList": @"htmllibmanager.path.list", @"htmllibmanagerExcludedPathList": @"htmllibmanager.excluded.path.list", @"htmllibmanagerProcessorJs": @"htmllibmanager.processor.js", @"htmllibmanagerProcessorCss": @"htmllibmanager.processor.css", @"htmllibmanagerLongcachePatterns": @"htmllibmanager.longcache.patterns", @"htmllibmanagerLongcacheFormat": @"htmllibmanager.longcache.format", @"htmllibmanagerUseFileSystemOutputCache": @"htmllibmanager.useFileSystemOutputCache", @"htmllibmanagerFileSystemOutputCacheLocation": @"htmllibmanager.fileSystemOutputCacheLocation", @"htmllibmanagerDisableReplacement": @"htmllibmanager.disable.replacement" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"htmllibmanagerTiming", @"htmllibmanagerDebugInitJs", @"htmllibmanagerMinify", @"htmllibmanagerDebug", @"htmllibmanagerGzip", @"htmllibmanagerMaxDataUriSize", @"htmllibmanagerMaxage", @"htmllibmanagerForceCQUrlInfo", @"htmllibmanagerDefaultthemename", @"htmllibmanagerDefaultuserthemename", @"htmllibmanagerClientmanager", @"htmllibmanagerPathList", @"htmllibmanagerExcludedPathList", @"htmllibmanagerProcessorJs", @"htmllibmanagerProcessorCss", @"htmllibmanagerLongcachePatterns", @"htmllibmanagerLongcacheFormat", @"htmllibmanagerUseFileSystemOutputCache", @"htmllibmanagerFileSystemOutputCacheLocation", @"htmllibmanagerDisableReplacement"];
  return [optionalProperties containsObject:propertyName];
}

@end
