//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/config_node_property_drop_down.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'com_adobe_cq_social_commons_emailreply_impl_email_reply_importer_properties.g.dart';

/// ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties
///
/// Properties:
/// * [connectProtocol] 
@BuiltValue()
abstract class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties implements Built<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties, ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder> {
  @BuiltValueField(wireName: r'connectProtocol')
  ConfigNodePropertyDropDown? get connectProtocol;

  ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties._();

  factory ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties([void updates(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder b)]) = _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties> get serializer => _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesSerializer();
}

class _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesSerializer implements PrimitiveSerializer<ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties> {
  @override
  final Iterable<Type> types = const [ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties, _$ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties];

  @override
  final String wireName = r'ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.connectProtocol != null) {
      yield r'connectProtocol';
      yield serializers.serialize(
        object.connectProtocol,
        specifiedType: const FullType(ConfigNodePropertyDropDown),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'connectProtocol':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType.nullable(ConfigNodePropertyDropDown),
          ) as ConfigNodePropertyDropDown?;
          if (valueDes == null) continue;
          result.connectProtocol.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterProperties deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ComAdobeCqSocialCommonsEmailreplyImplEmailReplyImporterPropertiesBuilder();
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

