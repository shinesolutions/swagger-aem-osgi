//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'org_apache_jackrabbit_oak_security_user_random_authorizable_node_name_properties.g.dart';

/// OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties
///
/// Properties:
/// * [length] 
@BuiltValue()
abstract class OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties implements Built<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties, OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder> {
  @BuiltValueField(wireName: r'length')
  ConfigNodePropertyInteger? get length;

  OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties._();

  factory OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties([void updates(OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder b)]) = _$OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties> get serializer => _$OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesSerializer();
}

class _$OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesSerializer implements PrimitiveSerializer<OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties> {
  @override
  final Iterable<Type> types = const [OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties, _$OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties];

  @override
  final String wireName = r'OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.length != null) {
      yield r'length';
      yield serializers.serialize(
        object.length,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'length':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.length.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNameProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OrgApacheJackrabbitOakSecurityUserRandomAuthorizableNodeNamePropertiesBuilder();
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

