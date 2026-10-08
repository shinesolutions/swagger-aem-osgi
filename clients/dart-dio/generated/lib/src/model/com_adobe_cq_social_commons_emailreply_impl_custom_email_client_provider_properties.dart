//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_custom_email_client_provider_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties
///
/// Properties:
/// * [priorityOrder] 
/// * [replyEmailPatterns] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties, ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'priorityOrder')
  ConfigNodePropertyInteger? get priorityOrder;

  @BuiltValueField(wireName: r'replyEmailPatterns')
  ConfigNodePropertyArray? get replyEmailPatterns;

  ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties, _$ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties object, {
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
    ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesBuilder result,
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
  ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplCustomEmailClientProviderPropertiesBuilder();
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

