//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_unknown_email_client_provider_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties
///
/// Properties:
/// * [replyEmailPatterns] 
/// * [priorityOrder] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties, ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'replyEmailPatterns')
  ConfigNodePropertyArray? get replyEmailPatterns;

  @BuiltValueField(wireName: r'priorityOrder')
  ConfigNodePropertyInteger? get priorityOrder;

  ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties, _$ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.replyEmailPatterns != null) {
      yield r'replyEmailPatterns';
      yield serializers.serialize(
        object.replyEmailPatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
    if (object.priorityOrder != null) {
      yield r'priorityOrder';
      yield serializers.serialize(
        object.priorityOrder,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'replyEmailPatterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.replyEmailPatterns.replace(valueDes);
          break;
        case r'priorityOrder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priorityOrder.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplUnknownEmailClientProviderPropertiesBuilder();
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

