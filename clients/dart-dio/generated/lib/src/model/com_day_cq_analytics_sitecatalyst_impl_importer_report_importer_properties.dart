//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_analytics_sitecatalyst_impl_importer_report_importer_properties.g.dart';

/// ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties
///
/// Properties:
/// * [reportPeriodFetchPeriodAttempts] 
/// * [reportPeriodFetchPeriodDelay] 
@BuiltValue()
abstract class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties implements Built<ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties, ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder> {
  @BuiltValueField(wireName: r'report.fetch.attempts')
  ConfigNodePropertyInteger? get reportPeriodFetchPeriodAttempts;

  @BuiltValueField(wireName: r'report.fetch.delay')
  ConfigNodePropertyInteger? get reportPeriodFetchPeriodDelay;

  ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties._();

  factory ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties([void updates(ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder b)]) = _$ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties> get serializer => _$ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesSerializer();
}

class _$ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesSerializer implements PrimitiveSerializer<ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties, _$ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties];

  @override
  final String wireName = r'ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.reportPeriodFetchPeriodAttempts != null) {
      yield r'report.fetch.attempts';
      yield serializers.serialize(
        object.reportPeriodFetchPeriodAttempts,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.reportPeriodFetchPeriodDelay != null) {
      yield r'report.fetch.delay';
      yield serializers.serialize(
        object.reportPeriodFetchPeriodDelay,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'report.fetch.attempts':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.reportPeriodFetchPeriodAttempts.replace(valueDes);
          break;
        case r'report.fetch.delay':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.reportPeriodFetchPeriodDelay.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqAnalyticsSitecatalystImplImporterReportImporterPropertiesBuilder();
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

