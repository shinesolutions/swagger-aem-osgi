//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_reporting_impl_r_log_analyzer_properties.g.dart';

/// ComDayCqReportingImplRLogAnalyzerProperties
///
/// Properties:
/// * [requestPeriodLogPeriodOutput] 
@BuiltValue()
abstract class ComDayCqReportingImplRLogAnalyzerProperties implements Built<ComDayCqReportingImplRLogAnalyzerProperties, ComDayCqReportingImplRLogAnalyzerPropertiesBuilder> {
  @BuiltValueField(wireName: r'request.log.output')
  ConfigNodePropertyString? get requestPeriodLogPeriodOutput;

  ComDayCqReportingImplRLogAnalyzerProperties._();

  factory ComDayCqReportingImplRLogAnalyzerProperties([void updates(ComDayCqReportingImplRLogAnalyzerPropertiesBuilder b)]) = _$ComDayCqReportingImplRLogAnalyzerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqReportingImplRLogAnalyzerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqReportingImplRLogAnalyzerProperties> get serializer => _$ComDayCqReportingImplRLogAnalyzerPropertiesSerializer();
}

class _$ComDayCqReportingImplRLogAnalyzerPropertiesSerializer implements PrimitiveSerializer<ComDayCqReportingImplRLogAnalyzerProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqReportingImplRLogAnalyzerProperties, _$ComDayCqReportingImplRLogAnalyzerProperties];

  @override
  final String wireName = r'ComDayCqReportingImplRLogAnalyzerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqReportingImplRLogAnalyzerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.requestPeriodLogPeriodOutput != null) {
      yield r'request.log.output';
      yield serializers.serialize(
        object.requestPeriodLogPeriodOutput,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqReportingImplRLogAnalyzerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqReportingImplRLogAnalyzerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'request.log.output':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodOutput.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqReportingImplRLogAnalyzerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqReportingImplRLogAnalyzerPropertiesBuilder();
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

