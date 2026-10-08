//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_wcm_core_stats_page_view_statistics_impl_properties.g.dart';

/// ComDayCqWcmCoreStatsPageViewStatisticsImplProperties
///
/// Properties:
/// * [pageviewstatisticsPeriodTrackingurl] 
/// * [pageviewstatisticsPeriodTrackingscriptPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties implements Built<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties, ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'pageviewstatistics.trackingurl')
  ConfigNodePropertyString? get pageviewstatisticsPeriodTrackingurl;

  @BuiltValueField(wireName: r'pageviewstatistics.trackingscript.enabled')
  ConfigNodePropertyString? get pageviewstatisticsPeriodTrackingscriptPeriodEnabled;

  ComDayCqWcmCoreStatsPageViewStatisticsImplProperties._();

  factory ComDayCqWcmCoreStatsPageViewStatisticsImplProperties([void updates(ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder b)]) = _$ComDayCqWcmCoreStatsPageViewStatisticsImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties> get serializer => _$ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesSerializer();
}

class _$ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesSerializer implements PrimitiveSerializer<ComDayCqWcmCoreStatsPageViewStatisticsImplProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqWcmCoreStatsPageViewStatisticsImplProperties, _$ComDayCqWcmCoreStatsPageViewStatisticsImplProperties];

  @override
  final String wireName = r'ComDayCqWcmCoreStatsPageViewStatisticsImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.pageviewstatisticsPeriodTrackingurl != null) {
      yield r'pageviewstatistics.trackingurl';
      yield serializers.serialize(
        object.pageviewstatisticsPeriodTrackingurl,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.pageviewstatisticsPeriodTrackingscriptPeriodEnabled != null) {
      yield r'pageviewstatistics.trackingscript.enabled';
      yield serializers.serialize(
        object.pageviewstatisticsPeriodTrackingscriptPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqWcmCoreStatsPageViewStatisticsImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'pageviewstatistics.trackingurl':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pageviewstatisticsPeriodTrackingurl.replace(valueDes);
          break;
        case r'pageviewstatistics.trackingscript.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.pageviewstatisticsPeriodTrackingscriptPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqWcmCoreStatsPageViewStatisticsImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqWcmCoreStatsPageViewStatisticsImplPropertiesBuilder();
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

