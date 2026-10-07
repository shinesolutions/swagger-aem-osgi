//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'analytics_component_query_cache_service_properties.g.dart';

/// AnalyticsComponentQueryCacheServiceProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodComponentPeriodQueryPeriodCachePeriodSize] 
@BuiltValue()
abstract class AnalyticsComponentQueryCacheServiceProperties implements Built<AnalyticsComponentQueryCacheServiceProperties, AnalyticsComponentQueryCacheServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.component.query.cache.size')
  ConfigNodePropertyInteger? get cqPeriodAnalyticsPeriodComponentPeriodQueryPeriodCachePeriodSize;

  AnalyticsComponentQueryCacheServiceProperties._();

  factory AnalyticsComponentQueryCacheServiceProperties([void updates(AnalyticsComponentQueryCacheServicePropertiesBuilder b)]) = _$AnalyticsComponentQueryCacheServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(AnalyticsComponentQueryCacheServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<AnalyticsComponentQueryCacheServiceProperties> get serializer => _$AnalyticsComponentQueryCacheServicePropertiesSerializer();
}

class _$AnalyticsComponentQueryCacheServicePropertiesSerializer implements PrimitiveSerializer<AnalyticsComponentQueryCacheServiceProperties> {
  @override
  final Iterable<Type> types = const [AnalyticsComponentQueryCacheServiceProperties, _$AnalyticsComponentQueryCacheServiceProperties];

  @override
  final String wireName = r'AnalyticsComponentQueryCacheServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    AnalyticsComponentQueryCacheServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodComponentPeriodQueryPeriodCachePeriodSize != null) {
      yield r'cq.analytics.component.query.cache.size';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodComponentPeriodQueryPeriodCachePeriodSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    AnalyticsComponentQueryCacheServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required AnalyticsComponentQueryCacheServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.component.query.cache.size':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodComponentPeriodQueryPeriodCachePeriodSize.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  AnalyticsComponentQueryCacheServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = AnalyticsComponentQueryCacheServicePropertiesBuilder();
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

