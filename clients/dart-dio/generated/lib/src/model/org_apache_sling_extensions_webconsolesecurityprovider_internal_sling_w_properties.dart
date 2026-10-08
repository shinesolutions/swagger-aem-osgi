//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_extensions_webconsolesecurityprovider_internal_sling_w_properties.g.dart';

/// OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties
///
/// Properties:
/// * [users] 
/// * [groups] 
@BuiltValue()
abstract class OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties implements Built<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties, OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder> {
  @BuiltValueField(wireName: r'users')
  ConfigNodePropertyArray? get users;

  @BuiltValueField(wireName: r'groups')
  ConfigNodePropertyArray? get groups;

  OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties._();

  factory OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties([void updates(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder b)]) = _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties> get serializer => _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesSerializer();
}

class _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties, _$OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties];

  @override
  final String wireName = r'OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.users != null) {
      yield r'users';
      yield serializers.serialize(
        object.users,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.groups != null) {
      yield r'groups';
      yield serializers.serialize(
        object.groups,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'users':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.users.replace(valueDes);
          break;
        case r'groups':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.groups.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingExtensionsWebconsolesecurityproviderInternalSlingWPropertiesBuilder();
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

