//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_testandtarget_http_client_impl_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl] 
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout] 
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout] 
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace] 
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties implements Built<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties, ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.testandtarget.api.url')
  ConfigNodePropertyString? get cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl;

  @BuiltValueField(wireName: r'cq.analytics.testandtarget.timeout')
  ConfigNodePropertyInteger? get cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout;

  @BuiltValueField(wireName: r'cq.analytics.testandtarget.sockettimeout')
  ConfigNodePropertyInteger? get cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout;

  @BuiltValueField(wireName: r'cq.analytics.testandtarget.recommendations.url.replace')
  ConfigNodePropertyString? get cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace;

  @BuiltValueField(wireName: r'cq.analytics.testandtarget.recommendations.url.replacewith')
  ConfigNodePropertyString? get cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith;

  ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties._();

  factory ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties([void updates(ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties, _$ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl != null) {
      yield r'cq.analytics.testandtarget.api.url';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout != null) {
      yield r'cq.analytics.testandtarget.timeout';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout != null) {
      yield r'cq.analytics.testandtarget.sockettimeout';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace != null) {
      yield r'cq.analytics.testandtarget.recommendations.url.replace';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith != null) {
      yield r'cq.analytics.testandtarget.recommendations.url.replacewith';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.testandtarget.api.url':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodApiPeriodUrl.replace(valueDes);
          break;
        case r'cq.analytics.testandtarget.timeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodTimeout.replace(valueDes);
          break;
        case r'cq.analytics.testandtarget.sockettimeout':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodSockettimeout.replace(valueDes);
          break;
        case r'cq.analytics.testandtarget.recommendations.url.replace':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplace.replace(valueDes);
          break;
        case r'cq.analytics.testandtarget.recommendations.url.replacewith':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodRecommendationsPeriodUrlPeriodReplacewith.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplPropertiesBuilder();
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

