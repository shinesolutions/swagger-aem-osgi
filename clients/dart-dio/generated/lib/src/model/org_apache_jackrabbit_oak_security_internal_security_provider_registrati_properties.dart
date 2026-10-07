//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_security_internal_security_provider_registrati_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties
///
/// Properties:
/// * [requiredServicePids] 
/// * [authorizationCompositionType] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties implements Built<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder> {
  @BuiltValueField(wireName: r'requiredServicePids')
  ConfigNodePropertyArray? get requiredServicePids;

  @BuiltValueField(wireName: r'authorizationCompositionType')
  ConfigNodePropertyDropDown? get authorizationCompositionType;

  OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties._();

  factory OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties([void updates(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties> get serializer => _$OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties, _$OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.requiredServicePids != null) {
      yield r'requiredServicePids';
      yield serializers.serialize(
        object.requiredServicePids,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.authorizationCompositionType != null) {
      yield r'authorizationCompositionType';
      yield serializers.serialize(
        object.authorizationCompositionType,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'requiredServicePids':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.requiredServicePids.replace(valueDes);
          break;
        case r'authorizationCompositionType':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.authorizationCompositionType.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiPropertiesBuilder();
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

