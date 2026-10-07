//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_user_action_default_authorizable_properties.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties
///
/// Properties:
/// * [enabledActions] 
/// * [userPrivilegeNames] 
/// * [groupPrivilegeNames] 
/// * [constraint] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties implements Built<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties, OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder> {
  @BuiltValueField(wireName: r'enabledActions')
  ConfigNodePropertyDropDown? get enabledActions;

  @BuiltValueField(wireName: r'userPrivilegeNames')
  ConfigNodePropertyArray? get userPrivilegeNames;

  @BuiltValueField(wireName: r'groupPrivilegeNames')
  ConfigNodePropertyArray? get groupPrivilegeNames;

  @BuiltValueField(wireName: r'constraint')
  ConfigNodePropertyString? get constraint;

  OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties._();

  factory OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties([void updates(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties> get serializer => _$OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties, _$OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enabledActions != null) {
      yield r'enabledActions';
      yield serializers.serialize(
        object.enabledActions,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
    if (object.userPrivilegeNames != null) {
      yield r'userPrivilegeNames';
      yield serializers.serialize(
        object.userPrivilegeNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.groupPrivilegeNames != null) {
      yield r'groupPrivilegeNames';
      yield serializers.serialize(
        object.groupPrivilegeNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.constraint != null) {
      yield r'constraint';
      yield serializers.serialize(
        object.constraint,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enabledActions':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.enabledActions.replace(valueDes);
          break;
        case r'userPrivilegeNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.userPrivilegeNames.replace(valueDes);
          break;
        case r'groupPrivilegeNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.groupPrivilegeNames.replace(valueDes);
          break;
        case r'constraint':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.constraint.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizableProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityUserActionDefaultAuthorizablePropertiesBuilder();
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

