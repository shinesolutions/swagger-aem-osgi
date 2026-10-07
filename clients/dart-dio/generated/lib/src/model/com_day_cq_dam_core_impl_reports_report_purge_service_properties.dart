//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_core_impl_reports_report_purge_service_properties.g.dart';

/// ComDayCqDamCoreImplReportsReportPurgeServiceProperties
///
/// Properties:
/// * [schedulerPeriodExpression] 
/// * [maxSavedReports] 
/// * [timeDuration] 
/// * [enableReportPurge] 
@BuiltValue()
abstract class ComDayCqDamCoreImplReportsReportPurgeServiceProperties implements Built<ComDayCqDamCoreImplReportsReportPurgeServiceProperties, ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'scheduler.expression')
  ConfigNodePropertyString? get schedulerPeriodExpression;

  @BuiltValueField(wireName: r'maxSavedReports')
  ConfigNodePropertyInteger? get maxSavedReports;

  @BuiltValueField(wireName: r'timeDuration')
  ConfigNodePropertyInteger? get timeDuration;

  @BuiltValueField(wireName: r'enableReportPurge')
  ConfigNodePropertyBoolean? get enableReportPurge;

  ComDayCqDamCoreImplReportsReportPurgeServiceProperties._();

  factory ComDayCqDamCoreImplReportsReportPurgeServiceProperties([void updates(ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder b)]) = _$ComDayCqDamCoreImplReportsReportPurgeServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamCoreImplReportsReportPurgeServiceProperties> get serializer => _$ComDayCqDamCoreImplReportsReportPurgeServicePropertiesSerializer();
}

class _$ComDayCqDamCoreImplReportsReportPurgeServicePropertiesSerializer implements PrimitiveSerializer<ComDayCqDamCoreImplReportsReportPurgeServiceProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamCoreImplReportsReportPurgeServiceProperties, _$ComDayCqDamCoreImplReportsReportPurgeServiceProperties];

  @override
  final String wireName = r'ComDayCqDamCoreImplReportsReportPurgeServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.schedulerPeriodExpression != null) {
      yield r'scheduler.expression';
      yield serializers.serialize(
        object.schedulerPeriodExpression,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.maxSavedReports != null) {
      yield r'maxSavedReports';
      yield serializers.serialize(
        object.maxSavedReports,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.timeDuration != null) {
      yield r'timeDuration';
      yield serializers.serialize(
        object.timeDuration,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enableReportPurge != null) {
      yield r'enableReportPurge';
      yield serializers.serialize(
        object.enableReportPurge,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamCoreImplReportsReportPurgeServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder result,
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
        case r'maxSavedReports':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxSavedReports.replace(valueDes);
          break;
        case r'timeDuration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.timeDuration.replace(valueDes);
          break;
        case r'enableReportPurge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableReportPurge.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamCoreImplReportsReportPurgeServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamCoreImplReportsReportPurgeServicePropertiesBuilder();
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

