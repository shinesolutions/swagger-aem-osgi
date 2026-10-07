#import "OAIComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties.h"

@implementation OAIComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths": @"com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths", @"comAdobeCqDamMacSyncDamsyncserviceSyncRenditions": @"com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions", @"comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs": @"com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms", @"comAdobeCqDamMacSyncDamsyncservicePlatform": @"com.adobe.cq.dam.mac.sync.damsyncservice.platform" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"comAdobeCqDamMacSyncDamsyncserviceRegisteredPaths", @"comAdobeCqDamMacSyncDamsyncserviceSyncRenditions", @"comAdobeCqDamMacSyncDamsyncserviceReplicateThreadWaitMs", @"comAdobeCqDamMacSyncDamsyncservicePlatform"];
  return [optionalProperties containsObject:propertyName];
}

@end
