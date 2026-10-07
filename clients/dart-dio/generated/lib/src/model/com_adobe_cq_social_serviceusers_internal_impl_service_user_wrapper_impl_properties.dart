//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_boolean.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_serviceusers_internal_impl_service_user_wrapper_impl_properties.g.dart';

/// ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties
///
/// Properties:
/// * [enableFallback] 
@BuiltValue()
abstract class ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties implements Built<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties, ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'enableFallback')
  ConfigNodePropertyBoolean? get enableFallback;

  ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties._();

  factory ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties([void updates(ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder b)]) = _$ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties> get serializer => _$ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesSerializer();
}

class _$ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties, _$ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.enableFallback != null) {
      yield r'enableFallback';
      yield serializers.serialize(
        object.enableFallback,
        specifiedType: const FullType(ConfigNodePropertyBoolean),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'enableFallback':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyBoolean),
          ) as ConfigNodePropertyBoolean?;
          if (valueDes == null) continue;
          result.enableFallback.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialServiceusersInternalImplServiceUserWrapperImplPropertiesBuilder();
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

