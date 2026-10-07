//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_s7dam_common_analytics_impl_site_catalyst_report_runner_properties.g.dart';

/// ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [schedulerPeriodConcurrent] 
@BuiltValue()
abstract class ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties implements Built<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties, ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'scheduler.concurrent')
  ConfigNodePropertyBoolean? get schedulerPeriodConcurrent;

  ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties._();

  factory ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties([void updates(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder b)]) = _$ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties> get serializer => _$ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesSerializer();
}

class _$ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties, _$ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties];

  @override
  final String wireName = r'ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.schedulerPeriodConcurrent != null) {
      yield r'scheduler.concurrent';
      yield serializers.serialize(
        object.schedulerPeriodConcurrent,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder result,
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
        case r'scheduler.concurrent':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.schedulerPeriodConcurrent.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamS7damCommonAnalyticsImplSiteCatalystReportRunnerPropertiesBuilder();
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

