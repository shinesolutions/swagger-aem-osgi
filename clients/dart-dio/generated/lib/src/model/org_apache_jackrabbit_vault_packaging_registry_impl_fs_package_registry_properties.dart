//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_vault_packaging_registry_impl_fs_package_registry_properties.g.dart';

/// OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties
///
/// Properties:
/// * [homePath] 
@BuiltValue()
abstract class OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties implements Built<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties, OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder> {
  @BuiltValueField(wireName: r'homePath')
  ConfigNodePropertyString? get homePath;

  OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties._();

  factory OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties([void updates(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder b)]) = _$OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties> get serializer => _$OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesSerializer();
}

class _$OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties, _$OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.homePath != null) {
      yield r'homePath';
      yield serializers.serialize(
        object.homePath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'homePath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.homePath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitVaultPackagingRegistryImplFSPackageRegistryPropertiesBuilder();
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

