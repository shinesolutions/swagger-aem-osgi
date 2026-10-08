//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_security_authorization_authorization_configur_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties
///
/// Properties:
/// * [permissionsJr2] 
/// * [importBehavior] 
/// * [readPaths] 
/// * [administrativePrincipals] 
/// * [configurationRanking] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties implements Built<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties, OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder> {
  @BuiltValueField(wireName: r'permissionsJr2')
  ConfigNodePropertyDropDown? get permissionsJr2;

  @BuiltValueField(wireName: r'importBehavior')
  ConfigNodePropertyDropDown? get importBehavior;

  @BuiltValueField(wireName: r'readPaths')
  ConfigNodePropertyArray? get readPaths;

  @BuiltValueField(wireName: r'administrativePrincipals')
  ConfigNodePropertyArray? get administrativePrincipals;

  @BuiltValueField(wireName: r'configurationRanking')
  ConfigNodePropertyInteger? get configurationRanking;

  OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties._();

  factory OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties([void updates(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties> get serializer => _$OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties, _$OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.permissionsJr2 != null) {
      yield r'permissionsJr2';
      yield serializers.serialize(
        object.permissionsJr2,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.importBehavior != null) {
      yield r'importBehavior';
      yield serializers.serialize(
        object.importBehavior,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.readPaths != null) {
      yield r'readPaths';
      yield serializers.serialize(
        object.readPaths,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.administrativePrincipals != null) {
      yield r'administrativePrincipals';
      yield serializers.serialize(
        object.administrativePrincipals,
        specifiedType: const FullType(ConfigNodePropertyArray),
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
    OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'permissionsJr2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.permissionsJr2.replace(valueDes);
          break;
        case r'importBehavior':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.importBehavior.replace(valueDes);
          break;
        case r'readPaths':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.readPaths.replace(valueDes);
          break;
        case r'administrativePrincipals':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.administrativePrincipals.replace(valueDes);
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
  OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurPropertiesBuilder();
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

