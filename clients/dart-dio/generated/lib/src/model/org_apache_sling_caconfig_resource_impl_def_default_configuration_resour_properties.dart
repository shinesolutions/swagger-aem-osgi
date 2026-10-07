//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_resource_impl_def_default_configuration_resour_properties.g.dart';

/// OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties
///
/// Properties:
/// * [enabled] 
/// * [configPath] 
/// * [fallbackPaths] 
/// * [configCollectionInheritancePropertyNames] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties implements Built<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties, OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'configPath')
  ConfigNodePropertyString? get configPath;

  @BuiltValueField(wireName: r'fallbackPaths')
  ConfigNodePropertyArray? get fallbackPaths;

  @BuiltValueField(wireName: r'configCollectionInheritancePropertyNames')
  ConfigNodePropertyArray? get configCollectionInheritancePropertyNames;

  OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties._();

  factory OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties([void updates(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties> get serializer => _$OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties, _$OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.configPath != null) {
      yield r'configPath';
      yield serializers.serialize(
        object.configPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.fallbackPaths != null) {
      yield r'fallbackPaths';
      yield serializers.serialize(
        object.fallbackPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.configCollectionInheritancePropertyNames != null) {
      yield r'configCollectionInheritancePropertyNames';
      yield serializers.serialize(
        object.configCollectionInheritancePropertyNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enabled.replace(valueDes);
          break;
        case r'configPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.configPath.replace(valueDes);
          break;
        case r'fallbackPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.fallbackPaths.replace(valueDes);
          break;
        case r'configCollectionInheritancePropertyNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.configCollectionInheritancePropertyNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourPropertiesBuilder();
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

