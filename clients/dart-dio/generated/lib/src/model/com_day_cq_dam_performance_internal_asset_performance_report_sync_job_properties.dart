//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_performance_internal_asset_performance_report_sync_job_properties.g.dart';

/// ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
@BuiltValue()
abstract class ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties implements Built<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties, ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties._();

  factory ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties([void updates(ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder b)]) = _$ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties> get serializer => _$ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesSerializer();
}

class _$ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties, _$ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties];

  @override
  final String wireName = r'ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'scheduler.expression':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.schedulerPeriodExpression.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamPerformanceInternalAssetPerformanceReportSyncJobPropertiesBuilder();
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

