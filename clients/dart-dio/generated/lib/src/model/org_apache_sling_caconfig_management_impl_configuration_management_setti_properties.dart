//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_caconfig_management_impl_configuration_management_setti_properties.g.dart';

/// OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties
///
/// Properties:
/// * [ignorePropertyNameRegex] 
/// * [configCollectionPropertiesResourceNames] 
@BuiltValue()
abstract class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties implements Built<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties, OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder> {
  @BuiltValueField(wireName: r'ignorePropertyNameRegex')
  ConfigNodePropertyArray? get ignorePropertyNameRegex;

  @BuiltValueField(wireName: r'configCollectionPropertiesResourceNames')
  ConfigNodePropertyArray? get configCollectionPropertiesResourceNames;

  OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties._();

  factory OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties([void updates(OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder b)]) = _$OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties> get serializer => _$OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesSerializer();
}

class _$OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties, _$OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties];

  @override
  final String wireName = r'OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ignorePropertyNameRegex != null) {
      yield r'ignorePropertyNameRegex';
      yield serializers.serialize(
        object.ignorePropertyNameRegex,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.configCollectionPropertiesResourceNames != null) {
      yield r'configCollectionPropertiesResourceNames';
      yield serializers.serialize(
        object.configCollectionPropertiesResourceNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ignorePropertyNameRegex':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.ignorePropertyNameRegex.replace(valueDes);
          break;
        case r'configCollectionPropertiesResourceNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.configCollectionPropertiesResourceNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiPropertiesBuilder();
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

