//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_impl_log_request_logger_service_properties.g.dart';

/// OrgApacheSlingEngineImplLogRequestLoggerServiceProperties
///
/// Properties:
/// * [requestPeriodLogPeriodServicePeriodFormat] 
/// * [requestPeriodLogPeriodServicePeriodOutput] 
/// * [requestPeriodLogPeriodServicePeriodOutputtype] 
/// * [requestPeriodLogPeriodServicePeriodOnentry] 
@BuiltValue()
abstract class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties implements Built<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties, OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder> {
  @BuiltValueField(wireName: r'request.log.service.format')
  ConfigNodePropertyString? get requestPeriodLogPeriodServicePeriodFormat;

  @BuiltValueField(wireName: r'request.log.service.output')
  ConfigNodePropertyString? get requestPeriodLogPeriodServicePeriodOutput;

  @BuiltValueField(wireName: r'request.log.service.outputtype')
  ConfigNodePropertyDropDown? get requestPeriodLogPeriodServicePeriodOutputtype;

  @BuiltValueField(wireName: r'request.log.service.onentry')
  ConfigNodePropertyBoolean? get requestPeriodLogPeriodServicePeriodOnentry;

  OrgApacheSlingEngineImplLogRequestLoggerServiceProperties._();

  factory OrgApacheSlingEngineImplLogRequestLoggerServiceProperties([void updates(OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder b)]) = _$OrgApacheSlingEngineImplLogRequestLoggerServiceProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties> get serializer => _$OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesSerializer();
}

class _$OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEngineImplLogRequestLoggerServiceProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineImplLogRequestLoggerServiceProperties, _$OrgApacheSlingEngineImplLogRequestLoggerServiceProperties];

  @override
  final String wireName = r'OrgApacheSlingEngineImplLogRequestLoggerServiceProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.requestPeriodLogPeriodServicePeriodFormat != null) {
      yield r'request.log.service.format';
      yield serializers.serialize(
        object.requestPeriodLogPeriodServicePeriodFormat,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.requestPeriodLogPeriodServicePeriodOutput != null) {
      yield r'request.log.service.output';
      yield serializers.serialize(
        object.requestPeriodLogPeriodServicePeriodOutput,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.requestPeriodLogPeriodServicePeriodOutputtype != null) {
      yield r'request.log.service.outputtype';
      yield serializers.serialize(
        object.requestPeriodLogPeriodServicePeriodOutputtype,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.requestPeriodLogPeriodServicePeriodOnentry != null) {
      yield r'request.log.service.onentry';
      yield serializers.serialize(
        object.requestPeriodLogPeriodServicePeriodOnentry,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineImplLogRequestLoggerServiceProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'request.log.service.format':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodServicePeriodFormat.replace(valueDes);
          break;
        case r'request.log.service.output':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodServicePeriodOutput.replace(valueDes);
          break;
        case r'request.log.service.outputtype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodServicePeriodOutputtype.replace(valueDes);
          break;
        case r'request.log.service.onentry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodServicePeriodOnentry.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineImplLogRequestLoggerServiceProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineImplLogRequestLoggerServicePropertiesBuilder();
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

