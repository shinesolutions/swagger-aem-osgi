//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_engine_impl_log_request_logger_properties.g.dart';

/// OrgApacheSlingEngineImplLogRequestLoggerProperties
///
/// Properties:
/// * [requestPeriodLogPeriodOutput] 
/// * [requestPeriodLogPeriodOutputtype] 
/// * [requestPeriodLogPeriodEnabled] 
/// * [accessPeriodLogPeriodOutput] 
/// * [accessPeriodLogPeriodOutputtype] 
/// * [accessPeriodLogPeriodEnabled] 
@BuiltValue()
abstract class OrgApacheSlingEngineImplLogRequestLoggerProperties implements Built<OrgApacheSlingEngineImplLogRequestLoggerProperties, OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder> {
  @BuiltValueField(wireName: r'request.log.output')
  ConfigNodePropertyString? get requestPeriodLogPeriodOutput;

  @BuiltValueField(wireName: r'request.log.outputtype')
  ConfigNodePropertyDropDown? get requestPeriodLogPeriodOutputtype;

  @BuiltValueField(wireName: r'request.log.enabled')
  ConfigNodePropertyBoolean? get requestPeriodLogPeriodEnabled;

  @BuiltValueField(wireName: r'access.log.output')
  ConfigNodePropertyString? get accessPeriodLogPeriodOutput;

  @BuiltValueField(wireName: r'access.log.outputtype')
  ConfigNodePropertyDropDown? get accessPeriodLogPeriodOutputtype;

  @BuiltValueField(wireName: r'access.log.enabled')
  ConfigNodePropertyBoolean? get accessPeriodLogPeriodEnabled;

  OrgApacheSlingEngineImplLogRequestLoggerProperties._();

  factory OrgApacheSlingEngineImplLogRequestLoggerProperties([void updates(OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder b)]) = _$OrgApacheSlingEngineImplLogRequestLoggerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingEngineImplLogRequestLoggerProperties> get serializer => _$OrgApacheSlingEngineImplLogRequestLoggerPropertiesSerializer();
}

class _$OrgApacheSlingEngineImplLogRequestLoggerPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingEngineImplLogRequestLoggerProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingEngineImplLogRequestLoggerProperties, _$OrgApacheSlingEngineImplLogRequestLoggerProperties];

  @override
  final String wireName = r'OrgApacheSlingEngineImplLogRequestLoggerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingEngineImplLogRequestLoggerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.requestPeriodLogPeriodOutput != null) {
      yield r'request.log.output';
      yield serializers.serialize(
        object.requestPeriodLogPeriodOutput,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.requestPeriodLogPeriodOutputtype != null) {
      yield r'request.log.outputtype';
      yield serializers.serialize(
        object.requestPeriodLogPeriodOutputtype,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.requestPeriodLogPeriodEnabled != null) {
      yield r'request.log.enabled';
      yield serializers.serialize(
        object.requestPeriodLogPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.accessPeriodLogPeriodOutput != null) {
      yield r'access.log.output';
      yield serializers.serialize(
        object.accessPeriodLogPeriodOutput,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.accessPeriodLogPeriodOutputtype != null) {
      yield r'access.log.outputtype';
      yield serializers.serialize(
        object.accessPeriodLogPeriodOutputtype,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.accessPeriodLogPeriodEnabled != null) {
      yield r'access.log.enabled';
      yield serializers.serialize(
        object.accessPeriodLogPeriodEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingEngineImplLogRequestLoggerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder result,
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
        case r'request.log.outputtype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodOutputtype.replace(valueDes);
          break;
        case r'request.log.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.requestPeriodLogPeriodEnabled.replace(valueDes);
          break;
        case r'access.log.output':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.accessPeriodLogPeriodOutput.replace(valueDes);
          break;
        case r'access.log.outputtype':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.accessPeriodLogPeriodOutputtype.replace(valueDes);
          break;
        case r'access.log.enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.accessPeriodLogPeriodEnabled.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingEngineImplLogRequestLoggerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingEngineImplLogRequestLoggerPropertiesBuilder();
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

