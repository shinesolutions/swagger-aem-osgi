//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_distribution_trigger_impl_persisted_jcr_event_distributi_properties.g.dart';

/// OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties
///
/// Properties:
/// * [name] 
/// * [path] 
/// * [serviceName] 
/// * [nuggetsPath] 
@BuiltValue()
abstract class OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties implements Built<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties, OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder> {
  @BuiltValueField(wireName: r'name')
  ConfigNodePropertyString? get name;

  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'serviceName')
  ConfigNodePropertyString? get serviceName;

  @BuiltValueField(wireName: r'nuggetsPath')
  ConfigNodePropertyString? get nuggetsPath;

  OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties._();

  factory OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties([void updates(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder b)]) = _$OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties> get serializer => _$OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesSerializer();
}

class _$OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties, _$OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties];

  @override
  final String wireName = r'OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties object, {
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
    if (object.serviceName != null) {
      yield r'serviceName';
      yield serializers.serialize(
        object.serviceName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.nuggetsPath != null) {
      yield r'nuggetsPath';
      yield serializers.serialize(
        object.nuggetsPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder result,
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
        case r'serviceName':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.serviceName.replace(valueDes);
          break;
        case r'nuggetsPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.nuggetsPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingDistributionTriggerImplPersistedJcrEventDistributiPropertiesBuilder();
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

