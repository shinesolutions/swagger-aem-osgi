//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_comments_endpoints_impl_comment_delete_event_properties.g.dart';

/// ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties
///
/// Properties:
/// * [ranking] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties implements Built<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties, ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder> {
  @BuiltValueField(wireName: r'ranking')
  ConfigNodePropertyInteger? get ranking;

  ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties._();

  factory ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties([void updates(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties> get serializer => _$ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties, _$ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.ranking != null) {
      yield r'ranking';
      yield serializers.serialize(
        object.ranking,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'ranking':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.ranking.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsCommentsEndpointsImplCommentDeleteEventPropertiesBuilder();
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

