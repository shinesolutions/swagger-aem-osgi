#import "OAIComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.h"

@implementation OAIComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"defaultTransportAgentToWorkerPrefix": @"default.transport.agent-to-worker.prefix", @"defaultTransportAgentToMasterPrefix": @"default.transport.agent-to-master.prefix", @"defaultTransportInputPackage": @"default.transport.input.package", @"defaultTransportOutputPackage": @"default.transport.output.package", @"defaultTransportReplicationSynchronous": @"default.transport.replication.synchronous", @"defaultTransportContentpackage": @"default.transport.contentpackage", @"offloadingTransporterDefaultEnabled": @"offloading.transporter.default.enabled" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"defaultTransportAgentToWorkerPrefix", @"defaultTransportAgentToMasterPrefix", @"defaultTransportInputPackage", @"defaultTransportOutputPackage", @"defaultTransportReplicationSynchronous", @"defaultTransportContentpackage", @"offloadingTransporterDefaultEnabled"];
  return [optionalProperties containsObject:propertyName];
}

@end
