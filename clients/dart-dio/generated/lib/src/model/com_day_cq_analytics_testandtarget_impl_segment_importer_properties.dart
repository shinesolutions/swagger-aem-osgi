//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_testandtarget_impl_segment_importer_properties.g.dart';

/// ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties
///
/// Properties:
/// * [cqPeriodAnalyticsPeriodTestandtargetPeriodSegmentimporterPeriodEnabled] 
@BuiltValue()
abstract class ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties implements Built<ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties, ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder> {
  @BuiltValueField(wireName: r'cq.analytics.testandtarget.segmentimporter.enabled')
  ConfigNodePropertyBoolean? get cqPeriodAnalyticsPeriodTestandtargetPeriodSegmentimporterPeriodEnabled;

  ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties._();

  factory ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties([void updates(ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder b)]) = _$ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties> get serializer => _$ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesSerializer();
}

class _$ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties, _$ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cqPeriodAnalyticsPeriodTestandtargetPeriodSegmentimporterPeriodEnabled != null) {
      yield r'cq.analytics.testandtarget.segmentimporter.enabled';
      yield serializers.serialize(
        object.cqPeriodAnalyticsPeriodTestandtargetPeriodSegmentimporterPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cq.analytics.testandtarget.segmentimporter.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cqPeriodAnalyticsPeriodTestandtargetPeriodSegmentimporterPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsTestandtargetImplSegmentImporterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsTestandtargetImplSegmentImporterPropertiesBuilder();
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

