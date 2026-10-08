//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_sling_jcr_base_internal_login_admin_whitelist_properties.g.dart';

/// OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties
///
/// Properties:
/// * [whitelistPeriodBypass] 
/// * [whitelistPeriodBundlesPeriodRegexp] 
@BuiltValue()
abstract class OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties implements Built<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties, OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder> {
  @BuiltValueField(wireName: r'whitelist.bypass')
  ConfigNodePropertyBoolean? get whitelistPeriodBypass;

  @BuiltValueField(wireName: r'whitelist.bundles.regexp')
  ConfigNodePropertyString? get whitelistPeriodBundlesPeriodRegexp;

  OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties._();

  factory OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties([void updates(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder b)]) = _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties> get serializer => _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesSerializer();
}

class _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesSerializer implements PrimitiveSerializer<OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties, _$OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties];

  @override
  final String wireName = r'OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.whitelistPeriodBypass != null) {
      yield r'whitelist.bypass';
      yield serializers.serialize(
        object.whitelistPeriodBypass,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.whitelistPeriodBundlesPeriodRegexp != null) {
      yield r'whitelist.bundles.regexp';
      yield serializers.serialize(
        object.whitelistPeriodBundlesPeriodRegexp,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'whitelist.bypass':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.whitelistPeriodBypass.replace(valueDes);
          break;
        case r'whitelist.bundles.regexp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.whitelistPeriodBundlesPeriodRegexp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheSlingJcrBaseInternalLoginAdminWhitelistProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheSlingJcrBaseInternalLoginAdminWhitelistPropertiesBuilder();
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

