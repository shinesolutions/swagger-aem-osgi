//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_string.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_comment_email_builder_impl_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties
///
/// Properties:
/// * [contextPeriodPath] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties, ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder> {
  @BuiltValueField(wireName: r'context.path')
  ConfigNodePropertyString? get contextPeriodPath;

  ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties, _$ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.contextPeriodPath != null) {
      yield r'context.path';
      yield serializers.serialize(
        object.contextPeriodPath,
        specifiedType: const FullType(ConfigNodePropertyString),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'context.path':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyString),
          ) as ConfigNodePropertyString?;
          if (valueDes == null) continue;
          result.contextPeriodPath.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplCommentEmailBuilderImplPropertiesBuilder();
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

