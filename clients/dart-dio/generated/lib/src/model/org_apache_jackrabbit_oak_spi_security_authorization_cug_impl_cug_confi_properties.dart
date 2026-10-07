//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_confi_properties.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties
///
/// Properties:
/// * [cugSupportedPaths] 
/// * [cugEnabled] 
/// * [configurationRanking] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties implements Built<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder> {
  @BuiltValueField(wireName: r'cugSupportedPaths')
  ConfigNodePropertyArray? get cugSupportedPaths;

  @BuiltValueField(wireName: r'cugEnabled')
  ConfigNodePropertyBoolean? get cugEnabled;

  @BuiltValueField(wireName: r'configurationRanking')
  ConfigNodePropertyInteger? get configurationRanking;

  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties._();

  factory OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties([void updates(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties> get serializer => _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties, _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.cugSupportedPaths != null) {
      yield r'cugSupportedPaths';
      yield serializers.serialize(
        object.cugSupportedPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.cugEnabled != null) {
      yield r'cugEnabled';
      yield serializers.serialize(
        object.cugEnabled,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.configurationRanking != null) {
      yield r'configurationRanking';
      yield serializers.serialize(
        object.configurationRanking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'cugSupportedPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.cugSupportedPaths.replace(valueDes);
          break;
        case r'cugEnabled':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.cugEnabled.replace(valueDes);
          break;
        case r'configurationRanking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.configurationRanking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugConfiPropertiesBuilder();
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

