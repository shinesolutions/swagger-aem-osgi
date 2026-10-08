//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_accountverification_impl_account_management_config_im_properties.g.dart';

/// ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties
///
/// Properties:
/// * [enable] 
/// * [ttl1] 
/// * [ttl2] 
@BuiltValue()
abstract class ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties implements Built<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties, ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder> {
  @BuiltValueField(wireName: r'enable')
  ConfigNodePropertyBoolean? get enable;

  @BuiltValueField(wireName: r'ttl1')
  ConfigNodePropertyInteger? get ttl1;

  @BuiltValueField(wireName: r'ttl2')
  ConfigNodePropertyInteger? get ttl2;

  ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties._();

  factory ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties([void updates(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder b)]) = _$ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties> get serializer => _$ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesSerializer();
}

class _$ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties, _$ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties];

  @override
  final String wireName = r'ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enable != null) {
      yield r'enable';
      yield serializers.serialize(
        object.enable,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
    if (object.ttl1 != null) {
      yield r'ttl1';
      yield serializers.serialize(
        object.ttl1,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.ttl2 != null) {
      yield r'ttl2';
      yield serializers.serialize(
        object.ttl2,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enable':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enable.replace(valueDes);
          break;
        case r'ttl1':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ttl1.replace(valueDes);
          break;
        case r'ttl2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ttl2.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialAccountverificationImplAccountManagementConfigImProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialAccountverificationImplAccountManagementConfigImPropertiesBuilder();
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

