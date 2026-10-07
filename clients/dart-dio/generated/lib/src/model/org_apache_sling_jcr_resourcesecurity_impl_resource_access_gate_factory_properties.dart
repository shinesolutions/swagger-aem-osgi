//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_resourcesecurity_impl_resource_access_gate_factory_properties.g.dart';

/// OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties
///
/// Properties:
/// * [path] 
/// * [checkpathPeriodPrefix] 
/// * [jcrPath] 
@BuiltValue()
abstract class OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties implements Built<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties, OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder> {
  @BuiltValueField(wireName: r'path')
  ConfigNodePropertyString? get path;

  @BuiltValueField(wireName: r'checkpath.prefix')
  ConfigNodePropertyString? get checkpathPeriodPrefix;

  @BuiltValueField(wireName: r'jcrPath')
  ConfigNodePropertyString? get jcrPath;

  OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties._();

  factory OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties([void updates(OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder b)]) = _$OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties> get serializer => _$OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesSerializer();
}

class _$OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties, _$OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.path != null) {
      yield r'path';
      yield serializers.serialize(
        object.path,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.checkpathPeriodPrefix != null) {
      yield r'checkpath.prefix';
      yield serializers.serialize(
        object.checkpathPeriodPrefix,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.jcrPath != null) {
      yield r'jcrPath';
      yield serializers.serialize(
        object.jcrPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.path.replace(valueDes);
          break;
        case r'checkpath.prefix':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.checkpathPeriodPrefix.replace(valueDes);
          break;
        case r'jcrPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.jcrPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrResourcesecurityImplResourceAccessGateFactoryPropertiesBuilder();
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

