//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_wcm_mobile_qrcode_servlet_qr_code_image_generator_properties.g.dart';

/// ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties
///
/// Properties:
/// * [cqPeriodWcmPeriodQrcodePeriodServletPeriodWhitelist] 
@BuiltValue()
abstract class ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties implements Built<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties, ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.wcm.qrcode.servlet.whitelist')
  ConfigNodePropertyArray? get cqPeriodWcmPeriodQrcodePeriodServletPeriodWhitelist;

  ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties._();

  factory ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties([void updates(ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder b)]) = _$ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties> get serializer => _$ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesSerializer();
}

class _$ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties, _$ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties];

  @override
  final String wireName = r'ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodWcmPeriodQrcodePeriodServletPeriodWhitelist != null) {
      yield r'cq.wcm.qrcode.servlet.whitelist';
      yield serializers.serialize(
        object.cqPeriodWcmPeriodQrcodePeriodServletPeriodWhitelist,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.wcm.qrcode.servlet.whitelist':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cqPeriodWcmPeriodQrcodePeriodServletPeriodWhitelist.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqWcmMobileQrcodeServletQRCodeImageGeneratorPropertiesBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

