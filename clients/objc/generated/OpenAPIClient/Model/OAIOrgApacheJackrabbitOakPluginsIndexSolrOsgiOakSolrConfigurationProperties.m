#import "OAIOrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties.h"

@implementation OAIOrgApacheJackrabbitOakPluginsIndexSolrOsgiOakSolrConfigurationProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"pathDescField": @"path.desc.field", @"pathChildField": @"path.child.field", @"pathParentField": @"path.parent.field", @"pathExactField": @"path.exact.field", @"catchAllField": @"catch.all.field", @"collapsedPathField": @"collapsed.path.field", @"pathDepthField": @"path.depth.field", @"commitPolicy": @"commit.policy", @"rows": @"rows", @"pathRestrictions": @"path.restrictions", @"propertyRestrictions": @"property.restrictions", @"primarytypesRestrictions": @"primarytypes.restrictions", @"ignoredProperties": @"ignored.properties", @"usedProperties": @"used.properties", @"typeMappings": @"type.mappings", @"propertyMappings": @"property.mappings", @"collapseJcrcontentNodes": @"collapse.jcrcontent.nodes" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"pathDescField", @"pathChildField", @"pathParentField", @"pathExactField", @"catchAllField", @"collapsedPathField", @"pathDepthField", @"commitPolicy", @"rows", @"pathRestrictions", @"propertyRestrictions", @"primarytypesRestrictions", @"ignoredProperties", @"usedProperties", @"typeMappings", @"propertyMappings", @"collapseJcrcontentNodes"];
  return [optionalProperties containsObject:propertyName];
}

@end
