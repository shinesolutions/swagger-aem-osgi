//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_trigger_impl_scheduled_distribution_trigge_properties.g.dart';

/// OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties
///
/// Properties:
/// * [name] 
/// * [path] 
/// * [seconds] 
/// * [serviceName] 
@BuiltValue()
abstract class OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties implements Built<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties, OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'seconds')
  ConfigNodePropertyString? get seconds;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties._();

  factory OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties([void updates(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder b)]) = _$OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties> get serializer => _$OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesSerializer();
}

class _$OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties, _$OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.name != null) {
      yield r'name';
      yield serializers.serialize(
        object.name,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.seconds != null) {
      yield r'seconds';
      yield serializers.serialize(
        object.seconds,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder result,
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
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'seconds':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.seconds.replace(valueDes);
          break;
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggeProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionTriggerImplScheduledDistributionTriggePropertiesBuilder();
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

