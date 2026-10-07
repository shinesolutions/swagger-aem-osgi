//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_ios_email_client_provider_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties
///
/// Properties:
/// * [priorityOrder] 
/// * [replyEmailPatterns] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties, ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'priorityOrder')
  ConfigNodePropertyInteger? get priorityOrder;

  @BuiltValueField(wireName: r'replyEmailPatterns')
  ConfigNodePropertyArray? get replyEmailPatterns;

  ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties, _$ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.priorityOrder != null) {
      yield r'priorityOrder';
      yield serializers.serialize(
        object.priorityOrder,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
    if (object.replyEmailPatterns != null) {
      yield r'replyEmailPatterns';
      yield serializers.serialize(
        object.replyEmailPatterns,
        specifiedType: const FullType(ConfigNodePropertyArray),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'priorityOrder':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.priorityOrder.replace(valueDes);
          break;
        case r'replyEmailPatterns':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyArray),
          ) as ConfigNodePropertyArray?;
          if (valueDes == null) continue;
          result.replyEmailPatterns.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplIOSEmailClientProviderPropertiesBuilder();
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

