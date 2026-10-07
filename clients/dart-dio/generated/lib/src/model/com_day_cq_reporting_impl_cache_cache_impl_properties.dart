//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_reporting_impl_cache_cache_impl_properties.g.dart';

/// ComDayCqReportingImplCacheCacheImplProperties
///
/// Properties:
/// * [repcachePeriodEnable] 
/// * [repcachePeriodTtl] 
/// * [repcachePeriodMax] 
@BuiltValue()
abstract class ComDayCqReportingImplCacheCacheImplProperties implements Built<ComDayCqReportingImplCacheCacheImplProperties, ComDayCqReportingImplCacheCacheImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'repcache.enable')
  ConfigNodePropertyBoolean? get repcachePeriodEnable;

  @BuiltValueField(wireName: r'repcache.ttl')
  ConfigNodePropertyInteger? get repcachePeriodTtl;

  @BuiltValueField(wireName: r'repcache.max')
  ConfigNodePropertyInteger? get repcachePeriodMax;

  ComDayCqReportingImplCacheCacheImplProperties._();

  factory ComDayCqReportingImplCacheCacheImplProperties([void updates(ComDayCqReportingImplCacheCacheImplPropertiesBuilder b)]) = _$ComDayCqReportingImplCacheCacheImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReportingImplCacheCacheImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReportingImplCacheCacheImplProperties> get serializer => _$ComDayCqReportingImplCacheCacheImplPropertiesSerializer();
}

class _$ComDayCqReportingImplCacheCacheImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqReportingImplCacheCacheImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReportingImplCacheCacheImplProperties, _$ComDayCqReportingImplCacheCacheImplProperties];

  @override
  final String wireName = r'ComDayCqReportingImplCacheCacheImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReportingImplCacheCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.repcachePeriodEnable != null) {
      yield r'repcache.enable';
      yield serializers.serialize(
        object.repcachePeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.repcachePeriodTtl != null) {
      yield r'repcache.ttl';
      yield serializers.serialize(
        object.repcachePeriodTtl,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.repcachePeriodMax != null) {
      yield r'repcache.max';
      yield serializers.serialize(
        object.repcachePeriodMax,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReportingImplCacheCacheImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReportingImplCacheCacheImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'repcache.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.repcachePeriodEnable.replace(valueDes);
          break;
        case r'repcache.ttl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.repcachePeriodTtl.replace(valueDes);
          break;
        case r'repcache.max':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.repcachePeriodMax.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReportingImplCacheCacheImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReportingImplCacheCacheImplPropertiesBuilder();
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

