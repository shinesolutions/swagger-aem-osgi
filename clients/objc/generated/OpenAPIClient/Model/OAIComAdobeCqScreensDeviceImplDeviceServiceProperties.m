#import "OAIComAdobeCqScreensDeviceImplDeviceServiceProperties.h"

@implementation OAIComAdobeCqScreensDeviceImplDeviceServiceProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"comAdobeAemScreensPlayerPingfrequency": @"com.adobe.aem.screens.player.pingfrequency", @"comAdobeAemScreensDevicePaswordSpecialchars": @"com.adobe.aem.screens.device.pasword.specialchars", @"comAdobeAemScreensDevicePaswordMinlowercasechars": @"com.adobe.aem.screens.device.pasword.minlowercasechars", @"comAdobeAemScreensDevicePaswordMinuppercasechars": @"com.adobe.aem.screens.device.pasword.minuppercasechars", @"comAdobeAemScreensDevicePaswordMinnumberchars": @"com.adobe.aem.screens.device.pasword.minnumberchars", @"comAdobeAemScreensDevicePaswordMinspecialchars": @"com.adobe.aem.screens.device.pasword.minspecialchars", @"comAdobeAemScreensDevicePaswordMinlength": @"com.adobe.aem.screens.device.pasword.minlength" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"comAdobeAemScreensPlayerPingfrequency", @"comAdobeAemScreensDevicePaswordSpecialchars", @"comAdobeAemScreensDevicePaswordMinlowercasechars", @"comAdobeAemScreensDevicePaswordMinuppercasechars", @"comAdobeAemScreensDevicePaswordMinnumberchars", @"comAdobeAemScreensDevicePaswordMinspecialchars", @"comAdobeAemScreensDevicePaswordMinlength"];
  return [optionalProperties containsObject:propertyName];
}

@end
