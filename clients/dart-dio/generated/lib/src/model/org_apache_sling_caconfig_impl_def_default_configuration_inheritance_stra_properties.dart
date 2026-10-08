//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_impl_def_default_configuration_inheritance_stra_properties.g.dart';

/// OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties
///
/// Properties:
/// * [enabled] 
/// * [configPropertyInheritancePropertyNames] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties implements Built<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties, OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder> {
  @BuiltValueField(wireName: r'enabled')
  ConfigNodePropertyBoolean? get enabled;

  @BuiltValueField(wireName: r'configPropertyInheritancePropertyNames')
  ConfigNodePropertyArray? get configPropertyInheritancePropertyNames;

  OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties._();

  factory OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties([void updates(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties> get serializer => _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties, _$OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabled != null) {
      yield r'enabled';
      yield serializers.serialize(
        object.enabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.configPropertyInheritancePropertyNames != null) {
      yield r'configPropertyInheritancePropertyNames';
      yield serializers.serialize(
        object.configPropertyInheritancePropertyNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder result,
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
        case r'configPropertyInheritancePropertyNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.configPropertyInheritancePropertyNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraPropertiesBuilder();
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

