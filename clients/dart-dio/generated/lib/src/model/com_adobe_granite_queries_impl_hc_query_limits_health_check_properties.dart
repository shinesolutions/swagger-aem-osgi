//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_queries_impl_hc_query_limits_health_check_properties.g.dart';

/// ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties
///
/// Properties:
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties implements Built<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties, ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties._();

  factory ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties([void updates(ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties> get serializer => _$ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties, _$ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties object, {
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
    ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder result,
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
  ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteQueriesImplHcQueryLimitsHealthCheckPropertiesBuilder();
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

