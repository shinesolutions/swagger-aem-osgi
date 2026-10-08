//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_vault_packaging_impl_packaging_impl_properties.g.dart';

/// OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties
///
/// Properties:
/// * [packageRoots] 
@BuiltValue()
abstract class OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties implements Built<OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties, OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'packageRoots')
  ConfigNodePropertyArray? get packageRoots;

  OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties._();

  factory OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties([void updates(OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder b)]) = _$OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties> get serializer => _$OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesSerializer();
}

class _$OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties, _$OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.packageRoots != null) {
      yield r'packageRoots';
      yield serializers.serialize(
        object.packageRoots,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'packageRoots':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.packageRoots.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitVaultPackagingImplPackagingImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitVaultPackagingImplPackagingImplPropertiesBuilder();
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

