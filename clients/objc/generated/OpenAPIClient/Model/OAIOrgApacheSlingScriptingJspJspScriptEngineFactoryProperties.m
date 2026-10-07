#import "OAIOrgApacheSlingScriptingJspJspScriptEngineFactoryProperties.h"

@implementation OAIOrgApacheSlingScriptingJspJspScriptEngineFactoryProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"jasperCompilerTargetVM": @"jasper.compilerTargetVM", @"jasperCompilerSourceVM": @"jasper.compilerSourceVM", @"jasperClassdebuginfo": @"jasper.classdebuginfo", @"jasperEnablePooling": @"jasper.enablePooling", @"jasperIeClassId": @"jasper.ieClassId", @"jasperGenStringAsCharArray": @"jasper.genStringAsCharArray", @"jasperKeepgenerated": @"jasper.keepgenerated", @"jasperMappedfile": @"jasper.mappedfile", @"jasperTrimSpaces": @"jasper.trimSpaces", @"jasperDisplaySourceFragments": @"jasper.displaySourceFragments", @"defaultIsSession": @"default.is.session" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"jasperCompilerTargetVM", @"jasperCompilerSourceVM", @"jasperClassdebuginfo", @"jasperEnablePooling", @"jasperIeClassId", @"jasperGenStringAsCharArray", @"jasperKeepgenerated", @"jasperMappedfile", @"jasperTrimSpaces", @"jasperDisplaySourceFragments", @"defaultIsSession"];
  return [optionalProperties containsObject:propertyName];
}

@end
