//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_security_authentication_token_token_configura_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties
///
/// Properties:
/// * [tokenExpiration] 
/// * [tokenLength] 
/// * [tokenRefresh] 
/// * [tokenCleanupThreshold] 
/// * [passwordHashAlgorithm] 
/// * [passwordHashIterations] 
/// * [passwordSaltSize] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties implements Built<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties, OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder> {
  @BuiltValueField(wireName: r'tokenExpiration')
  ConfigNodePropertyString? get tokenExpiration;

  @BuiltValueField(wireName: r'tokenLength')
  ConfigNodePropertyString? get tokenLength;

  @BuiltValueField(wireName: r'tokenRefresh')
  ConfigNodePropertyBoolean? get tokenRefresh;

  @BuiltValueField(wireName: r'tokenCleanupThreshold')
  ConfigNodePropertyInteger? get tokenCleanupThreshold;

  @BuiltValueField(wireName: r'passwordHashAlgorithm')
  ConfigNodePropertyString? get passwordHashAlgorithm;

  @BuiltValueField(wireName: r'passwordHashIterations')
  ConfigNodePropertyInteger? get passwordHashIterations;

  @BuiltValueField(wireName: r'passwordSaltSize')
  ConfigNodePropertyInteger? get passwordSaltSize;

  OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties._();

  factory OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties([void updates(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties> get serializer => _$OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties, _$OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.tokenExpiration != null) {
      yield r'tokenExpiration';
      yield serializers.serialize(
        object.tokenExpiration,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tokenLength != null) {
      yield r'tokenLength';
      yield serializers.serialize(
        object.tokenLength,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
    if (object.tokenRefresh != null) {
      yield r'tokenRefresh';
      yield serializers.serialize(
        object.tokenRefresh,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.tokenCleanupThreshold != null) {
      yield r'tokenCleanupThreshold';
      yield serializers.serialize(
        object.tokenCleanupThreshold,
        specifiedType: const FullType(ConfigNodePropertyInteger),
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
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'tokenExpiration':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tokenExpiration.replace(valueDes);
          break;
        case r'tokenLength':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.tokenLength.replace(valueDes);
          break;
        case r'tokenRefresh':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.tokenRefresh.replace(valueDes);
          break;
        case r'tokenCleanupThreshold':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.tokenCleanupThreshold.replace(valueDes);
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
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityAuthenticationTokenTokenConfiguraPropertiesBuilder();
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

