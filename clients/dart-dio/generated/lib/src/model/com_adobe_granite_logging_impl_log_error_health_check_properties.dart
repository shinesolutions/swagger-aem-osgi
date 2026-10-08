//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_logging_impl_log_error_health_check_properties.g.dart';

/// ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties implements Built<ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties, ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties._();

  factory ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties([void updates(ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties> get serializer => _$ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties, _$ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.hcPeriodTags != null) {
      yield r'hc.tags';
      yield serializers.serialize(
        object.hcPeriodTags,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'hc.tags':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.hcPeriodTags.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteLoggingImplLogErrorHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteLoggingImplLogErrorHealthCheckPropertiesBuilder();
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

