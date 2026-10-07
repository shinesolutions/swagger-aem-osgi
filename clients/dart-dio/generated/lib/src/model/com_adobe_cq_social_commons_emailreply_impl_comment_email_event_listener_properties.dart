//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_comment_email_event_listener_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties
///
/// Properties:
/// * [eventPeriodTopics] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder> {
  @BuiltValueField(wireName: r'event.topics')
  ConfigNodePropertyString? get eventPeriodTopics;

  ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties, _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.eventPeriodTopics != null) {
      yield r'event.topics';
      yield serializers.serialize(
        object.eventPeriodTopics,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'event.topics':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.eventPeriodTopics.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplCommentEmailEventListenerPropertiesBuilder();
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

