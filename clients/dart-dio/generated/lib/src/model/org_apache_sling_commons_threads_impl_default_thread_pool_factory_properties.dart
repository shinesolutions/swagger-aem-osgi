//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_commons_threads_impl_default_thread_pool_factory_properties.g.dart';

/// OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties
///
/// Properties:
/// * [name] 
/// * [minPoolSize] 
/// * [maxPoolSize] 
/// * [queueSize] 
/// * [maxThreadAge] 
/// * [keepAliveTime] 
/// * [blockPolicy] 
/// * [shutdownGraceful] 
/// * [daemon] 
/// * [shutdownWaitTime] 
/// * [priority] 
@BuiltValue()
abstract class OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties implements Built<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties, OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'minPoolSize')
  ConfigNodePropertyInteger? get minPoolSize;

  @BuiltValueField(wireName: r'maxPoolSize')
  ConfigNodePropertyInteger? get maxPoolSize;

  @BuiltValueField(wireName: r'queueSize')
  ConfigNodePropertyInteger? get queueSize;

  @BuiltValueField(wireName: r'maxThreadAge')
  ConfigNodePropertyInteger? get maxThreadAge;

  @BuiltValueField(wireName: r'keepAliveTime')
  ConfigNodePropertyInteger? get keepAliveTime;

  @BuiltValueField(wireName: r'blockPolicy')
  ConfigNodePropertyDropDown? get blockPolicy;

  @BuiltValueField(wireName: r'shutdownGraceful')
  ConfigNodePropertyBoolean? get shutdownGraceful;

  @BuiltValueField(wireName: r'daemon')
  ConfigNodePropertyBoolean? get daemon;

  @BuiltValueField(wireName: r'shutdownWaitTime')
  ConfigNodePropertyInteger? get shutdownWaitTime;

  @BuiltValueField(wireName: r'priority')
  ConfigNodePropertyDropDown? get priority;

  OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties._();

  factory OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties([void updates(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder b)]) = _$OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties> get serializer => _$OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesSerializer();
}

class _$OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties, _$OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.minPoolSize != null) {
      yield r'minPoolSize';
      yield serializers.serialize(
        object.minPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxPoolSize != null) {
      yield r'maxPoolSize';
      yield serializers.serialize(
        object.maxPoolSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.queueSize != null) {
      yield r'queueSize';
      yield serializers.serialize(
        object.queueSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.maxThreadAge != null) {
      yield r'maxThreadAge';
      yield serializers.serialize(
        object.maxThreadAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.keepAliveTime != null) {
      yield r'keepAliveTime';
      yield serializers.serialize(
        object.keepAliveTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.blockPolicy != null) {
      yield r'blockPolicy';
      yield serializers.serialize(
        object.blockPolicy,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.shutdownGraceful != null) {
      yield r'shutdownGraceful';
      yield serializers.serialize(
        object.shutdownGraceful,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.daemon != null) {
      yield r'daemon';
      yield serializers.serialize(
        object.daemon,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.shutdownWaitTime != null) {
      yield r'shutdownWaitTime';
      yield serializers.serialize(
        object.shutdownWaitTime,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.priority != null) {
      yield r'priority';
      yield serializers.serialize(
        object.priority,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.name.replace(valueDes);
          break;
        case r'minPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.minPoolSize.replace(valueDes);
          break;
        case r'maxPoolSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxPoolSize.replace(valueDes);
          break;
        case r'queueSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.queueSize.replace(valueDes);
          break;
        case r'maxThreadAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.maxThreadAge.replace(valueDes);
          break;
        case r'keepAliveTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.keepAliveTime.replace(valueDes);
          break;
        case r'blockPolicy':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.blockPolicy.replace(valueDes);
          break;
        case r'shutdownGraceful':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.shutdownGraceful.replace(valueDes);
          break;
        case r'daemon':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.daemon.replace(valueDes);
          break;
        case r'shutdownWaitTime':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.shutdownWaitTime.replace(valueDes);
          break;
        case r'priority':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.priority.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCommonsThreadsImplDefaultThreadPoolFactoryPropertiesBuilder();
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

