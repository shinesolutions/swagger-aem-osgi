//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_base_internal_login_admin_whitelist_fragment_properties.g.dart';

/// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties
///
/// Properties:
/// * [whitelistPeriodName] 
/// * [whitelistPeriodBundles] 
@BuiltValue()
abstract class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties implements Built<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder> {
  @BuiltValueField(wireName: r'whitelist.name')
  ConfigNodePropertyString? get whitelistPeriodName;

  @BuiltValueField(wireName: r'whitelist.bundles')
  ConfigNodePropertyArray? get whitelistPeriodBundles;

  OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties._();

  factory OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties([void updates(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder b)]) = _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties> get serializer => _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesSerializer();
}

class _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties, _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.whitelistPeriodName != null) {
      yield r'whitelist.name';
      yield serializers.serialize(
        object.whitelistPeriodName,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.whitelistPeriodBundles != null) {
      yield r'whitelist.bundles';
      yield serializers.serialize(
        object.whitelistPeriodBundles,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'whitelist.name':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.whitelistPeriodName.replace(valueDes);
          break;
        case r'whitelist.bundles':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.whitelistPeriodBundles.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistFragmentPropertiesBuilder();
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

