//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_security_user_user_configuration_impl_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties
///
/// Properties:
/// * [usersPath] 
/// * [groupsPath] 
/// * [systemRelativePath] 
/// * [defaultDepth] 
/// * [importBehavior] 
/// * [passwordHashAlgorithm] 
/// * [passwordHashIterations] 
/// * [passwordSaltSize] 
/// * [omitAdminPw] 
/// * [supportAutoSave] 
/// * [passwordMaxAge] 
/// * [initialPasswordChange] 
/// * [passwordHistorySize] 
/// * [passwordExpiryForAdmin] 
/// * [cacheExpiration] 
/// * [enableRFC7613UsercaseMappedProfile] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties implements Built<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties, OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'usersPath')
  ConfigNodePropertyString? get usersPath;

  @BuiltValueField(wireName: r'groupsPath')
  ConfigNodePropertyString? get groupsPath;

  @BuiltValueField(wireName: r'systemRelativePath')
  ConfigNodePropertyString? get systemRelativePath;

  @BuiltValueField(wireName: r'defaultDepth')
  ConfigNodePropertyInteger? get defaultDepth;

  @BuiltValueField(wireName: r'importBehavior')
  ConfigNodePropertyDropDown? get importBehavior;

  @BuiltValueField(wireName: r'passwordHashAlgorithm')
  ConfigNodePropertyString? get passwordHashAlgorithm;

  @BuiltValueField(wireName: r'passwordHashIterations')
  ConfigNodePropertyInteger? get passwordHashIterations;

  @BuiltValueField(wireName: r'passwordSaltSize')
  ConfigNodePropertyInteger? get passwordSaltSize;

  @BuiltValueField(wireName: r'omitAdminPw')
  ConfigNodePropertyBoolean? get omitAdminPw;

  @BuiltValueField(wireName: r'supportAutoSave')
  ConfigNodePropertyBoolean? get supportAutoSave;

  @BuiltValueField(wireName: r'passwordMaxAge')
  ConfigNodePropertyInteger? get passwordMaxAge;

  @BuiltValueField(wireName: r'initialPasswordChange')
  ConfigNodePropertyBoolean? get initialPasswordChange;

  @BuiltValueField(wireName: r'passwordHistorySize')
  ConfigNodePropertyInteger? get passwordHistorySize;

  @BuiltValueField(wireName: r'passwordExpiryForAdmin')
  ConfigNodePropertyBoolean? get passwordExpiryForAdmin;

  @BuiltValueField(wireName: r'cacheExpiration')
  ConfigNodePropertyInteger? get cacheExpiration;

  @BuiltValueField(wireName: r'enableRFC7613UsercaseMappedProfile')
  ConfigNodePropertyBoolean? get enableRFC7613UsercaseMappedProfile;

  OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties._();

  factory OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties([void updates(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties> get serializer => _$OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties, _$OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.usersPath != null) {
      yield r'usersPath';
      yield serializers.serialize(
        object.usersPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.groupsPath != null) {
      yield r'groupsPath';
      yield serializers.serialize(
        object.groupsPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.systemRelativePath != null) {
      yield r'systemRelativePath';
      yield serializers.serialize(
        object.systemRelativePath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.defaultDepth != null) {
      yield r'defaultDepth';
      yield serializers.serialize(
        object.defaultDepth,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.importBehavior != null) {
      yield r'importBehavior';
      yield serializers.serialize(
        object.importBehavior,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.passwordHashAlgorithm != null) {
      yield r'passwordHashAlgorithm';
      yield serializers.serialize(
        object.passwordHashAlgorithm,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.passwordHashIterations != null) {
      yield r'passwordHashIterations';
      yield serializers.serialize(
        object.passwordHashIterations,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.passwordSaltSize != null) {
      yield r'passwordSaltSize';
      yield serializers.serialize(
        object.passwordSaltSize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.omitAdminPw != null) {
      yield r'omitAdminPw';
      yield serializers.serialize(
        object.omitAdminPw,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.supportAutoSave != null) {
      yield r'supportAutoSave';
      yield serializers.serialize(
        object.supportAutoSave,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.passwordMaxAge != null) {
      yield r'passwordMaxAge';
      yield serializers.serialize(
        object.passwordMaxAge,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.initialPasswordChange != null) {
      yield r'initialPasswordChange';
      yield serializers.serialize(
        object.initialPasswordChange,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.passwordHistorySize != null) {
      yield r'passwordHistorySize';
      yield serializers.serialize(
        object.passwordHistorySize,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.passwordExpiryForAdmin != null) {
      yield r'passwordExpiryForAdmin';
      yield serializers.serialize(
        object.passwordExpiryForAdmin,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.cacheExpiration != null) {
      yield r'cacheExpiration';
      yield serializers.serialize(
        object.cacheExpiration,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.enableRFC7613UsercaseMappedProfile != null) {
      yield r'enableRFC7613UsercaseMappedProfile';
      yield serializers.serialize(
        object.enableRFC7613UsercaseMappedProfile,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'usersPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.usersPath.replace(valueDes);
          break;
        case r'groupsPath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.groupsPath.replace(valueDes);
          break;
        case r'systemRelativePath':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.systemRelativePath.replace(valueDes);
          break;
        case r'defaultDepth':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.defaultDepth.replace(valueDes);
          break;
        case r'importBehavior':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.importBehavior.replace(valueDes);
          break;
        case r'passwordHashAlgorithm':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.passwordHashAlgorithm.replace(valueDes);
          break;
        case r'passwordHashIterations':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.passwordHashIterations.replace(valueDes);
          break;
        case r'passwordSaltSize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.passwordSaltSize.replace(valueDes);
          break;
        case r'omitAdminPw':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.omitAdminPw.replace(valueDes);
          break;
        case r'supportAutoSave':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.supportAutoSave.replace(valueDes);
          break;
        case r'passwordMaxAge':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.passwordMaxAge.replace(valueDes);
          break;
        case r'initialPasswordChange':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.initialPasswordChange.replace(valueDes);
          break;
        case r'passwordHistorySize':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.passwordHistorySize.replace(valueDes);
          break;
        case r'passwordExpiryForAdmin':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.passwordExpiryForAdmin.replace(valueDes);
          break;
        case r'cacheExpiration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.cacheExpiration.replace(valueDes);
          break;
        case r'enableRFC7613UsercaseMappedProfile':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableRFC7613UsercaseMappedProfile.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSecurityUserUserConfigurationImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityUserUserConfigurationImplPropertiesBuilder();
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

