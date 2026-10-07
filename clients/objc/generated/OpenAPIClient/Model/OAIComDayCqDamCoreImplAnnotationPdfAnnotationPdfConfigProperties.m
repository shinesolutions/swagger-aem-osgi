#import "OAIComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties.h"

@implementation OAIComDayCqDamCoreImplAnnotationPdfAnnotationPdfConfigProperties

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cqDamConfigAnnotationPdfDocumentWidth": @"cq.dam.config.annotation.pdf.document.width", @"cqDamConfigAnnotationPdfDocumentHeight": @"cq.dam.config.annotation.pdf.document.height", @"cqDamConfigAnnotationPdfDocumentPaddingHorizontal": @"cq.dam.config.annotation.pdf.document.padding.horizontal", @"cqDamConfigAnnotationPdfDocumentPaddingVertical": @"cq.dam.config.annotation.pdf.document.padding.vertical", @"cqDamConfigAnnotationPdfFontSize": @"cq.dam.config.annotation.pdf.font.size", @"cqDamConfigAnnotationPdfFontColor": @"cq.dam.config.annotation.pdf.font.color", @"cqDamConfigAnnotationPdfFontFamily": @"cq.dam.config.annotation.pdf.font.family", @"cqDamConfigAnnotationPdfFontLight": @"cq.dam.config.annotation.pdf.font.light", @"cqDamConfigAnnotationPdfMarginTextImage": @"cq.dam.config.annotation.pdf.marginTextImage", @"cqDamConfigAnnotationPdfMinImageHeight": @"cq.dam.config.annotation.pdf.minImageHeight", @"cqDamConfigAnnotationPdfReviewStatusWidth": @"cq.dam.config.annotation.pdf.reviewStatus.width", @"cqDamConfigAnnotationPdfReviewStatusColorApproved": @"cq.dam.config.annotation.pdf.reviewStatus.color.approved", @"cqDamConfigAnnotationPdfReviewStatusColorRejected": @"cq.dam.config.annotation.pdf.reviewStatus.color.rejected", @"cqDamConfigAnnotationPdfReviewStatusColorChangesRequested": @"cq.dam.config.annotation.pdf.reviewStatus.color.changesRequested", @"cqDamConfigAnnotationPdfAnnotationMarkerWidth": @"cq.dam.config.annotation.pdf.annotationMarker.width", @"cqDamConfigAnnotationPdfAssetMinheight": @"cq.dam.config.annotation.pdf.asset.minheight" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cqDamConfigAnnotationPdfDocumentWidth", @"cqDamConfigAnnotationPdfDocumentHeight", @"cqDamConfigAnnotationPdfDocumentPaddingHorizontal", @"cqDamConfigAnnotationPdfDocumentPaddingVertical", @"cqDamConfigAnnotationPdfFontSize", @"cqDamConfigAnnotationPdfFontColor", @"cqDamConfigAnnotationPdfFontFamily", @"cqDamConfigAnnotationPdfFontLight", @"cqDamConfigAnnotationPdfMarginTextImage", @"cqDamConfigAnnotationPdfMinImageHeight", @"cqDamConfigAnnotationPdfReviewStatusWidth", @"cqDamConfigAnnotationPdfReviewStatusColorApproved", @"cqDamConfigAnnotationPdfReviewStatusColorRejected", @"cqDamConfigAnnotationPdfReviewStatusColorChangesRequested", @"cqDamConfigAnnotationPdfAnnotationMarkerWidth", @"cqDamConfigAnnotationPdfAssetMinheight"];
  return [optionalProperties containsObject:propertyName];
}

@end
