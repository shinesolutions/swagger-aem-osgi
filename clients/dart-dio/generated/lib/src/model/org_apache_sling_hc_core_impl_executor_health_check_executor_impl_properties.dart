//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_hc_core_impl_executor_health_check_executor_impl_properties.g.dart';

/// OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties
///
/// Properties:
/// * [timeoutInMs] 
/// * [longRunningFutureThresholdForCriticalMs] 
/// * [resultCacheTtlInMs] 
@BuiltValue()
abstract class OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties implements Built<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties, OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'timeoutInMs')
  ConfigNodePropertyInteger? get timeoutInMs;

  @BuiltValueField(wireName: r'longRunningFutureThresholdForCriticalMs')
  ConfigNodePropertyInteger? get longRunningFutureThresholdForCriticalMs;

  @BuiltValueField(wireName: r'resultCacheTtlInMs')
  ConfigNodePropertyInteger? get resultCacheTtlInMs;

  OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties._();

  factory OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties([void updates(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder b)]) = _$OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties> get serializer => _$OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesSerializer();
}

class _$OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties, _$OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties];

  @override
  final String wireName = r'OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.timeoutInMs != null) {
      yield r'timeoutInMs';
      yield serializers.serialize(
        object.timeoutInMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.longRunningFutureThresholdForCriticalMs != null) {
      yield r'longRunningFutureThresholdForCriticalMs';
      yield serializers.serialize(
        object.longRunningFutureThresholdForCriticalMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.resultCacheTtlInMs != null) {
      yield r'resultCacheTtlInMs';
      yield serializers.serialize(
        object.resultCacheTtlInMs,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'timeoutInMs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.timeoutInMs.replace(valueDes);
          break;
        case r'longRunningFutureThresholdForCriticalMs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.longRunningFutureThresholdForCriticalMs.replace(valueDes);
          break;
        case r'resultCacheTtlInMs':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.resultCacheTtlInMs.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingHcCoreImplExecutorHealthCheckExecutorImplPropertiesBuilder();
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

