//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_spi_security_authorization_cug_impl_cug_exclu_properties.g.dart';

/// OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties
///
/// Properties:
/// * [principalNames] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties implements Built<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties, OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder> {
  @BuiltValueField(wireName: r'principalNames')
  ConfigNodePropertyArray? get principalNames;

  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties._();

  factory OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties([void updates(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties> get serializer => _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties, _$OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.principalNames != null) {
      yield r'principalNames';
      yield serializers.serialize(
        object.principalNames,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'principalNames':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.principalNames.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSpiSecurityAuthorizationCugImplCugExcluPropertiesBuilder();
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

