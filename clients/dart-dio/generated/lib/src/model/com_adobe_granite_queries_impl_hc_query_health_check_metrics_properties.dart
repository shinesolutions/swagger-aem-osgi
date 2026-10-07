//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_queries_impl_hc_query_health_check_metrics_properties.g.dart';

/// ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties
///
/// Properties:
/// * [getPeriod] 
@BuiltValue()
abstract class ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties implements Built<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties, ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder> {
  @BuiltValueField(wireName: r'getPeriod')
  ConfigNodePropertyInteger? get getPeriod;

  ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties._();

  factory ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties([void updates(ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder b)]) = _$ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties> get serializer => _$ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesSerializer();
}

class _$ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties, _$ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties];

  @override
  final String wireName = r'ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.getPeriod != null) {
      yield r'getPeriod';
      yield serializers.serialize(
        object.getPeriod,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'getPeriod':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.getPeriod.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteQueriesImplHcQueryHealthCheckMetricsPropertiesBuilder();
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

