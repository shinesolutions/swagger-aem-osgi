#import "OAIComDayCqReportingImplConfigServiceImplProperties.h"

@implementation OAIComDayCqReportingImplConfigServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"repconfTimezone": @"repconf.timezone", @"repconfLocale": @"repconf.locale", @"repconfSnapshots": @"repconf.snapshots", @"repconfRepdir": @"repconf.repdir", @"repconfHourofday": @"repconf.hourofday", @"repconfMinofhour": @"repconf.minofhour", @"repconfMaxrows": @"repconf.maxrows", @"repconfFakedata": @"repconf.fakedata", @"repconfSnapshotuser": @"repconf.snapshotuser", @"repconfEnforcesnapshotuser": @"repconf.enforcesnapshotuser" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"repconfTimezone", @"repconfLocale", @"repconfSnapshots", @"repconfRepdir", @"repconfHourofday", @"repconfMinofhour", @"repconfMaxrows", @"repconfFakedata", @"repconfSnapshotuser", @"repconfEnforcesnapshotuser"];
  return [optionalProperties containsObject:propertyName];
}

@end
