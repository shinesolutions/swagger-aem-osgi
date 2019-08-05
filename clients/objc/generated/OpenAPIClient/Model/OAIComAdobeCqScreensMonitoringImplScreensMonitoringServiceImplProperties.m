#import "OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties.h"

@implementation OAIComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword": @"com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername", @"comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword"];
  return [optionalProperties containsObject:propertyName];
}

@end
