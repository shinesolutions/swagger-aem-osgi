//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_integer.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_comments_listing_impl_search_comment_social_c_properties.g.dart';

/// ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties
///
/// Properties:
/// * [numUserLimit] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties implements Built<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties, ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder> {
  @BuiltValueField(wireName: r'numUserLimit')
  ConfigNodePropertyInteger? get numUserLimit;

  ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties._();

  factory ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties([void updates(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties> get serializer => _$ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties, _$ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.numUserLimit != null) {
      yield r'numUserLimit';
      yield serializers.serialize(
        object.numUserLimit,
        specifiedType: const FullType(ConfigNodePropertyInteger),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'numUserLimit':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyInteger),
          ) as ConfigNodePropertyInteger?;
          if (valueDes == null) continue;
          result.numUserLimit.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsCommentsListingImplSearchCommentSocialCPropertiesBuilder();
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

