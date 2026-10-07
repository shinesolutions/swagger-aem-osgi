#import "OAIOrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.h"

@implementation OAIOrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"handlerSchemes": @"handler.schemes", @"slingJcrinstallFolderNameRegexp": @"sling.jcrinstall.folder.name.regexp", @"slingJcrinstallFolderMaxDepth": @"sling.jcrinstall.folder.max.depth", @"slingJcrinstallSearchPath": @"sling.jcrinstall.search.path", @"slingJcrinstallNewConfigPath": @"sling.jcrinstall.new.config.path", @"slingJcrinstallSignalPath": @"sling.jcrinstall.signal.path", @"slingJcrinstallEnableWriteback": @"sling.jcrinstall.enable.writeback" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"handlerSchemes", @"slingJcrinstallFolderNameRegexp", @"slingJcrinstallFolderMaxDepth", @"slingJcrinstallSearchPath", @"slingJcrinstallNewConfigPath", @"slingJcrinstallSignalPath", @"slingJcrinstallEnableWriteback"];
  return [optionalProperties containsObject:propertyName];
}

@end
