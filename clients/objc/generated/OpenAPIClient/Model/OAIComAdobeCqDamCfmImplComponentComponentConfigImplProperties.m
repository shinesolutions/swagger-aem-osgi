#import "OAIComAdobeCqDamCfmImplComponentComponentConfigImplProperties.h"

@implementation OAIComAdobeCqDamCfmImplComponentComponentConfigImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"damCfmComponentResourceType": @"dam.cfm.component.resourceType", @"damCfmComponentFileReferenceProp": @"dam.cfm.component.fileReferenceProp", @"damCfmComponentElementsProp": @"dam.cfm.component.elementsProp", @"damCfmComponentVariationProp": @"dam.cfm.component.variationProp" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"damCfmComponentResourceType", @"damCfmComponentFileReferenceProp", @"damCfmComponentElementsProp", @"damCfmComponentVariationProp"];
  return [optionalProperties containsObject:propertyName];
}

@end
