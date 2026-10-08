//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:openapi/src/model/config_node_property_array.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_yahoo_email_client_provider_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties
///
/// Properties:
/// * [priorityOrder] 
/// * [replyEmailPatterns] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties, ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder> {
  @BuiltValueField(wireName: r'priorityOrder')
  ConfigNodePropertyInteger? get priorityOrder;

  @BuiltValueField(wireName: r'replyEmailPatterns')
  ConfigNodePropertyArray? get replyEmailPatterns;

  ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties, _$ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties object, {
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
    ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder result,
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
  ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplYahooEmailClientProviderPropertiesBuilder();
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

