//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_granite_queries_impl_hc_async_index_health_check_properties.g.dart';

/// ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties
///
/// Properties:
/// * [indexingPeriodCriticalPeriodThreshold] 
/// * [indexingPeriodWarnPeriodThreshold] 
/// * [hcPeriodTags] 
@BuiltValue()
abstract class ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties implements Built<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties, ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder> {
  @BuiltValueField(wireName: r'indexing.critical.threshold')
  ConfigNodePropertyInteger? get indexingPeriodCriticalPeriodThreshold;

  @BuiltValueField(wireName: r'indexing.warn.threshold')
  ConfigNodePropertyInteger? get indexingPeriodWarnPeriodThreshold;

  @BuiltValueField(wireName: r'hc.tags')
  ConfigNodePropertyArray? get hcPeriodTags;

  ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties._();

  factory ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties([void updates(ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder b)]) = _$ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties> get serializer => _$ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesSerializer();
}

class _$ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesSerializer implements PrimitiveSerializer<ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties, _$ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties];

  @override
  final String wireName = r'ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.indexingPeriodCriticalPeriodThreshold != null) {
      yield r'indexing.critical.threshold';
      yield serializers.serialize(
        object.indexingPeriodCriticalPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.indexingPeriodWarnPeriodThreshold != null) {
      yield r'indexing.warn.threshold';
      yield serializers.serialize(
        object.indexingPeriodWarnPeriodThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
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
    ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'indexing.critical.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.indexingPeriodCriticalPeriodThreshold.replace(valueDes);
          break;
        case r'indexing.warn.threshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.indexingPeriodWarnPeriodThreshold.replace(valueDes);
          break;
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
  ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeGraniteQueriesImplHcAsyncIndexHealthCheckPropertiesBuilder();
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

