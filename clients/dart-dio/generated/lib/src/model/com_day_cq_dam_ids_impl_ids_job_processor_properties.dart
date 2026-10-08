//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_day_cq_dam_ids_impl_ids_job_processor_properties.g.dart';

/// ComDayCqDamIdsImplIDSJobProcessorProperties
///
/// Properties:
/// * [enablePeriodMultisession] 
/// * [idsPeriodCcPeriodEnable] 
/// * [enablePeriodRetry] 
/// * [enablePeriodRetryPeriodScripterror] 
/// * [externalizerPeriodDomainPeriodCqhost] 
/// * [externalizerPeriodDomainPeriodHttp] 
@BuiltValue()
abstract class ComDayCqDamIdsImplIDSJobProcessorProperties implements Built<ComDayCqDamIdsImplIDSJobProcessorProperties, ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder> {
  @BuiltValueField(wireName: r'enable.multisession')
  ConfigNodePropertyBoolean? get enablePeriodMultisession;

  @BuiltValueField(wireName: r'ids.cc.enable')
  ConfigNodePropertyBoolean? get idsPeriodCcPeriodEnable;

  @BuiltValueField(wireName: r'enable.retry')
  ConfigNodePropertyBoolean? get enablePeriodRetry;

  @BuiltValueField(wireName: r'enable.retry.scripterror')
  ConfigNodePropertyBoolean? get enablePeriodRetryPeriodScripterror;

  @BuiltValueField(wireName: r'externalizer.domain.cqhost')
  ConfigNodePropertyString? get externalizerPeriodDomainPeriodCqhost;

  @BuiltValueField(wireName: r'externalizer.domain.http')
  ConfigNodePropertyString? get externalizerPeriodDomainPeriodHttp;

  ComDayCqDamIdsImplIDSJobProcessorProperties._();

  factory ComDayCqDamIdsImplIDSJobProcessorProperties([void updates(ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder b)]) = _$ComDayCqDamIdsImplIDSJobProcessorProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComDayCqDamIdsImplIDSJobProcessorProperties> get serializer => _$ComDayCqDamIdsImplIDSJobProcessorPropertiesSerializer();
}

class _$ComDayCqDamIdsImplIDSJobProcessorPropertiesSerializer implements PrimitiveSerializer<ComDayCqDamIdsImplIDSJobProcessorProperties> {
  @override
  final Iterable<Type> types = const [ComDayCqDamIdsImplIDSJobProcessorProperties, _$ComDayCqDamIdsImplIDSJobProcessorProperties];

  @override
  final String wireName = r'ComDayCqDamIdsImplIDSJobProcessorProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComDayCqDamIdsImplIDSJobProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enablePeriodMultisession != null) {
      yield r'enable.multisession';
      yield serializers.serialize(
        object.enablePeriodMultisession,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.idsPeriodCcPeriodEnable != null) {
      yield r'ids.cc.enable';
      yield serializers.serialize(
        object.idsPeriodCcPeriodEnable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.enablePeriodRetry != null) {
      yield r'enable.retry';
      yield serializers.serialize(
        object.enablePeriodRetry,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.enablePeriodRetryPeriodScripterror != null) {
      yield r'enable.retry.scripterror';
      yield serializers.serialize(
        object.enablePeriodRetryPeriodScripterror,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.externalizerPeriodDomainPeriodCqhost != null) {
      yield r'externalizer.domain.cqhost';
      yield serializers.serialize(
        object.externalizerPeriodDomainPeriodCqhost,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.externalizerPeriodDomainPeriodHttp != null) {
      yield r'externalizer.domain.http';
      yield serializers.serialize(
        object.externalizerPeriodDomainPeriodHttp,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComDayCqDamIdsImplIDSJobProcessorProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enable.multisession':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodMultisession.replace(valueDes);
          break;
        case r'ids.cc.enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.idsPeriodCcPeriodEnable.replace(valueDes);
          break;
        case r'enable.retry':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodRetry.replace(valueDes);
          break;
        case r'enable.retry.scripterror':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enablePeriodRetryPeriodScripterror.replace(valueDes);
          break;
        case r'externalizer.domain.cqhost':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.externalizerPeriodDomainPeriodCqhost.replace(valueDes);
          break;
        case r'externalizer.domain.http':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.externalizerPeriodDomainPeriodHttp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComDayCqDamIdsImplIDSJobProcessorProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComDayCqDamIdsImplIDSJobProcessorPropertiesBuilder();
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

