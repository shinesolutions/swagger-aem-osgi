//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_requests_logging_impl_hc_requests_status_health_check_im_properties.g.dart';

/// ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties implements Built<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties, ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties._();

  factory ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties([void updates(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder b)]) = _$ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties> get serializer => _$ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesSerializer();
}

class _$ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties, _$ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties];

  @override
  final String wireName = r'ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties object, {
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
    ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder result,
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
  ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteRequestsLoggingImplHcRequestsStatusHealthCheckImPropertiesBuilder();
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

